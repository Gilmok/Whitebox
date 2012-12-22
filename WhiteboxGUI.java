import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

import java.net.URL;
import java.net.URI;
import javax.swing.border.*;
import java.io.*;

import java.util.*;

class TestCellRenderer extends DefaultTreeCellRenderer
{   
   public Component getTreeCellRendererComponent(
         JTree tree,
         Object value,
         boolean sel,
         boolean expanded,
         boolean leaf,
         int row,
         boolean hasFocus)
   {
      super.getTreeCellRendererComponent(
            tree, value, sel,
            expanded, leaf, row,
            hasFocus);
      DefaultMutableTreeNode nde = (DefaultMutableTreeNode) value;
      Object obj = nde.getUserObject();
      if(obj.getClass().getName().equals("TestInfo"))
      {
      	setText(getObjectText((TestInfo) obj));
         Icon icn = getTestIcon((TestInfo) obj);
         setLeafIcon(icn);
      }
      else if(obj.getClass().getName().equals("MethodInfo"))
      {
      	setText(getObjectText((MethodInfo) obj));
      }
      return this;
   }
   
   private Icon getTestIcon(MethodInfo mi)
   {
      String gif = mi.getIconState();
      Image img = Toolkit.getDefaultToolkit().getImage(gif);
      return(new ImageIcon(img));
   }
   
   private Icon getTestIcon(TestInfo ti)
   {
	   String gif = ti.getIconState();
	   Image img = Toolkit.getDefaultToolkit().getImage(gif);
	   return(new ImageIcon(img)); 
   }
   
   private String getObjectText(TestInfo ti)
   {
   	if(ti.commentName != null && !ti.equals("null"))
   		return ti.commentName;
   	else
   		return ti.name;
   }
   
   private String getObjectText(MethodInfo mi)
   {
   	return mi.name;
   }
}

class StringRef
{
   String s;
   
   StringRef(String in)
   {
      s = in;
   }
   
   public void set(String in)
   {
      s = in;
   }
   
   public String get()
   {
      if(s != null)
         return s;
      else
         return null;
   }
   
   public boolean isAbsolutePath()
   {
      URI uri = URI.create(s);
      if(uri.isAbsolute()) 
      {
         return true;
      }
      
      //    
      // Check the scheme of the URI created above because this is more
      // robust than checking substrings.
      //
      if(uri.getScheme() == null || uri.getScheme().equals("file")) 
      {
         
         //
         // Use the path portion of the URI. This will allow the code
         // to handle file URIs.
         //
         File file = new File(uri.getPath());
         if(file.isAbsolute()) 
         {
            return true;
         }
      }
      
      //
      // If none of the above worked, then this isn't an absolute path.
      //
      return false;
   }
   
   public void setAsAbsolute()
   {
      File f = new File(s);
      s = f.getAbsolutePath();
   }
}

class WhiteboxUI extends JFrame implements TreeSelectionListener, ActionListener, TextListener
{
   //the left side tree
   JTree testTree;
   JScrollPane testView;
   ImageIcon testIco;
   DefaultMutableTreeNode testTop;
   
   //the main menu
   JMenuBar menuBar;
   JMenu fileMenu;
   JMenuItem loadTests;
   JMenuItem extractTests;
   JMenuItem saveTests;
   JMenuItem saveTestsAs;
   JMenuItem saveJUnit;
   JMenuItem reExtract;
   JMenuItem close;
   JMenuItem exit;
   
   JMenu testMenu;
   JMenuItem add;
   JMenuItem compile;
   JMenuItem run;
   
   JMenu optionMenu;
   
   //the right "area"
   JTabbedPane testOutput;
   JButton runTests;
   
   //test config setup
   JPanel testConfig;
   JPanel innerConfig;
   JPanel innerTest;
   JPanel configTop;
   JButton methButton;
   JSplitPane innerPane;
   
   //error output
   JPanel errors;
   JScrollPane errorScroll;
   PrintStream sysErrRedirect;

   //system.out output
   JPanel sysOut;
   JScrollPane sysOutScroll;
   PrintStream sysOutRedirect;
   
   //method configuration
   JPanel methodConfig;
   MethodEditPanel methodConfigAll;
   JScrollPane methodConfigScroll;
   JPanel methConfigTop;
   TextField[] methodConfigTestNames;
   Component[][] methodConfigInputs;
   Component[][] methodConfigOutputs;
   TextField[] methodConfigExceptions;
   JButton mcAddTestBtn;
   
   //settings
   String classTestAppend;
   String methodTestAppend;
   
   //config
   //ClassList testClassList;  //the class list of the test assembly
   ClassList progClassList;  //the class list of the actual assembly 
   WhiteboxProgram wbp;
   MethodInfo selMethod;
   TestInfo selTest;
   
   StringRef progPath;
   StringRef progPattern;
   StringRef testOutputFile;
   StringRef testOutputFilePath;
   
   JLabel progPathLbl;
   JLabel progPtnLbl;
   JLabel toFileLbl;
   JLabel toPathLbl;
   JPanel pathLbls;
   
   FileSelectorBox fsb;
   int fsbActNum;
   
   WhiteboxUI()
   {
   	final String currentTesting = "ClassInfo\\.java";
      loadSettings();
      progPath = new StringRef("");
      progPattern = new StringRef("");
      testOutputFile = new StringRef("");
      testOutputFilePath = new StringRef("");
      testTop = new DefaultMutableTreeNode("All tests");
      testTree = new JTree(testTop);
      testTree.addTreeSelectionListener(this);
      testTree.setCellRenderer(new TestCellRenderer());
      //updateTests(".", "ClassInfo\\.java", false);
      String currDir = System.getProperty("user.dir");
      
      //testClassList = getTests(".", ".*_test\\.java");
      //fillTree(testClassList);
      fsb = new FileSelectorBox();
      testView = new JScrollPane(testTree);
      testOutput = new JTabbedPane();
      
      methButton = new JButton();
      methButton.addActionListener(this);

      /*sysErrRedirect = new PrintStream(new ByteArrayOutputStream());
      sysOutRedirect = new PrintStream(new ByteArrayOutputStream());
      System.setErr(sysErrRedirect);
      System.setOut(sysOutRedirect);*/
            
      fillAllOutput();
      expandTree(testTree);
            
      loadProgram(currDir, currentTesting);
      setupPathLabels();
      getContentPane().add(pathLbls, BorderLayout.NORTH);
      getContentPane().add(testView, BorderLayout.WEST);
      getContentPane().add(testOutput, BorderLayout.CENTER);
      
      setupMenus();
      
      setSize(Toolkit.getDefaultToolkit().getScreenSize());
      setVisible(true);
   }
   
   private void setupPathLabels()
   {
      JPanel pTop = new JPanel(new BorderLayout());
      JPanel pBot = new JPanel(new BorderLayout());
      pathLbls = new JPanel(new GridLayout(2,1));
      JLabel l1 = new JLabel("Program Path:");
      JLabel l2 = new JLabel("Test Output Path:");
      
      progPtnLbl = new JLabel("");
      toFileLbl = new JLabel("");
      progPathLbl = new JLabel();
      toPathLbl = new JLabel();
      
      progPathLbl.setText(progPath.get());
      progPtnLbl.setText(progPattern.get());
      toFileLbl.setText(testOutputFile.get());
      toPathLbl.setText(testOutputFilePath.get());
      
      if(testOutputFilePath.get().equals(""))
         toPathLbl.setText("<unset>");  
      
      if(progPath.get().equals(""))
         progPathLbl.setText("<unset>");
      
      pTop.add(l1, BorderLayout.WEST);
      pTop.add(progPathLbl, BorderLayout.CENTER);
      pTop.add(progPtnLbl, BorderLayout.EAST);
      pBot.add(l2, BorderLayout.WEST);
      pBot.add(toPathLbl, BorderLayout.CENTER);
      pBot.add(toFileLbl, BorderLayout.EAST);
      pathLbls.add(pTop);
      pathLbls.add(pBot);
   }
   
   private void expandTree(JTree tree)
   {
      int i = 0;
      while( i < tree.getRowCount() ) 
      {
         tree.expandRow(i);
         i++;
      }

   }
   
   public void loadSettings()
   {
      classTestAppend = "Test";
      methodTestAppend = "Test";
   }
   
   public void loadProgram(String path, String pattern)
   {
   	
   	progPath = new StringRef(path);
   	progPattern = new StringRef(pattern);
      String[] allFiles = getFileList(path, pattern);
      String[] allClassfiles = new String[allFiles.length];
      progClassList = new ClassList();
      WhiteboxProgram p = new WhiteboxProgram();
      int classNo = 0;
      ClassList temp;
      //for each file
      for(int i = 0; i < allFiles.length; i++)
      {
      	//parse assembly for line, method, and class infos
      	p.antlrGenSynTree(allFiles[i]);
         
         temp = p.getClassList();
         for(int j = 0; j < temp.size(); j++)
         {
         	ClassInfo ci = temp.getClass(j);
         	//manifestFN = ci.className + ".wbm";
         	ci.classIndex = classNo;
         	classNo++;
         	
         }
         //read test manifest for testinfos; addl test info from stored tests
         String manifestFN = allFiles[i];
         manifestFN = manifestFN.replaceAll(".java", ".wbm");
         p.addStoredTestInfo(temp, manifestFN);
         progClassList.addAll(p.getClassList());
         //TODO: eliminate this hack
         //this is a hack - we need to fix this
         progClassList.lang = temp.lang;
      }
      fillTree(progClassList);
   }
   
   public void extractTests()
   {
   	for(int i = 0; i < progClassList.size(); i++)
   	{
   		ClassInfo ci = progClassList.getClass(i);
   		for(int j = 0; j < ci.methods.size(); j++)
   		{
   			
   			MethodInfo mi = ci.methods.getMethod(j);
   			TestList temp = mi.tests.copy();
   			//extract tests and compare
   			mi.extractParsedTests(progClassList);
   			System.out.println("Tests extracted");
   			mi.tests.compare(temp, true);
   			
   		}
   	}
   	System.out.println("All done");
   	TestSelectionGUI tsgui = new TestSelectionGUI(progClassList);
   	fillTree(progClassList);
   }
   
   private String[] getFileList(String path, String fpattern)
   {
      File dir = new File(path);
      
      String[] children = dir.list();
      String[] temp = new String[children.length];
      int j = 0;
      if (children != null) 
      {
          for (int i = 0; i < children.length; i++) 
          {
              // Get filename of file or directory
              if(children[i].matches(fpattern))
              {
                 temp[j] = children[i];
                 j++;
              }
          }
      }
      String[] rtnVal = new String[j];
      for(int i = 0; i < j; i++)
         rtnVal[i] = temp[i];
      
      return(rtnVal);
   }
   
   private void fillAllOutput()
   {
      testOutput.removeAll();
      testOutput.addTab("Method", methodConfigAll);
      testOutput.addTab("Test", testConfig);
      testOutput.addTab("Errors/Failures", errors);
      testOutput.addTab("System Output", sysOut);
   }
   
   //TODO: properly check to see if method is a test or not
   private void fillTree(ClassList cl)
   {
   	testTop.removeAllChildren();
      for(int i = 0; i < cl.size(); i++)
      {
         ClassInfo c = cl.getClass(i);
         DefaultMutableTreeNode cat = new DefaultMutableTreeNode(c.className);
         System.out.println("tree: adding " + c.methods.size() + " methods");
         for(int j = 0; j < c.methods.size(); j++)
         {
            MethodInfo m = c.methods.getMethod(j);
            DefaultMutableTreeNode meth = new DefaultMutableTreeNode(m.name);
            meth.setUserObject(m);
            System.out.println("tree: adding " + m.tests.size() + " tests");
            for(int k = 0; k < m.tests.size(); k++)
            {
            	TestInfo t = m.tests.getTest(k);
            	DefaultMutableTreeNode test = new DefaultMutableTreeNode(t.name);
            	test.setUserObject(t);
            	meth.add(test);
            }
            if(m.tests.size() > 0)
            	cat.add(meth);
         }
         testTop.add(cat);
      }
      //testTop = new DefaultMutableTreeNode("All tests");
      testTree.removeTreeSelectionListener(this);
      testTree = new JTree(testTop);
      testTree.addTreeSelectionListener(this);
      testTree.setCellRenderer(new TestCellRenderer());
      //revalidate();
      
      getContentPane().remove(testView);
      testView = new JScrollPane(testTree);
      getContentPane().add(testView, BorderLayout.WEST);
      
      validate();
      //revalidate();
      //resetView();
   }
   
   private void fillTestConfig(MethodInfo info, TestInfo testInfo)
   { 
      //the top info line
	   configTop = new JPanel(new FlowLayout());
      JLabel topLabel;
      if(testInfo == null)
    	  topLabel = new JLabel("Test config for " + info.name);
      else
    	  topLabel = new JLabel("Test config for " + testInfo.name);
      /*MethodInfo m = progClassList.findMethodForTest(info);
      String n = m.name;*/
      
      //methButton.setText((progClassList.findMethodForTest(info)).name);
      
      configTop.add(topLabel);
      //configTop.add(methButton);
      //configTop.add(saveButton);
      
      JTextArea top;
      JScrollPane tPne;
      JScrollPane bPne;
      //JPanel noWrap = new JPanel(new BorderLayout());
      innerConfig = new JPanel(new GridLayout(2,1));
      
      //the top half
      if(testInfo != null)
    	  top = new JTextArea(testInfo.getTestCode("   ", progClassList));
      else
    	  top = new JTextArea("");
      top.setFont(new Font("monospaced", Font.PLAIN, 12));
      tPne = new JScrollPane(top);
      innerConfig.add(tPne);
      
      //the bottom half
      
      if(testInfo != null)
      {
    	  JTabbedPane tabBottom = new JTabbedPane();
    	  FunctionViewPanel bottom1 = new FunctionViewPanel(testInfo);
    	  JScrollPane fvscroll = new JScrollPane(bottom1);
    	  JTextPane bottom = new JTextPane();
    	  bottom.setFont(new Font("monospaced", Font.PLAIN, 12));
    	  bottom.setText(info.getLines());
    	  bottom.setEditable(false);
    	  bPne = new JScrollPane(bottom);
    	  tabBottom.addTab("Method", bPne);
    	  tabBottom.addTab("Path", fvscroll);
    	  tabBottom.setSelectedIndex(1);
    	  innerConfig.add(tabBottom);
      }
      else
      {
    	  JTextPane bottom = new JTextPane();
    	  bottom.setText(info.getLines());
    	  bottom.setFont(new Font("monospaced", Font.PLAIN, 12));
    	  bottom.setEditable(false);
    	  
    	  bPne = new JScrollPane(bottom);
    	  innerConfig.add(bPne);
      }
      //bottom2 = new FunctionViewPanel()
      
      
      
      //innerTest = new JPanel(new BorderLayout());
      
      
      
      
      testConfig = new JPanel(new BorderLayout());
      testConfig.add(configTop, BorderLayout.NORTH);
      testConfig.add(innerConfig, BorderLayout.CENTER);
      //testConfig.add(innerTest, BorderLayout.SOUTH);
      
   }
   
   private String[] openWbcfile()
   {
      return null;
   }
   
   /*private void loadTestConfig(String wbt)  //wbt -> program
   {
      testOutputFile.set(wbt);
      String pattern = WhiteboxUtils.getWbtPattern(wbt);
      int lastSlash = pattern.lastIndexOf('\\');
      progPath.set(pattern.substring(0, lastSlash));
      progPattern.set(pattern.substring(lastSlash, pattern.length()));
      WhiteboxProgram p = new WhiteboxProgram();
      testClassList = p.getSyntaxTree(wbt, 0);
      for(int i = 0; i < testClassList.size(); i++)
      {
         testClassList.getClass(i).methods.removeAllNonTestMethods();
      }
      loadProgram(progPath.get(), progPattern.get());
   }*/
   
   /*public void saveTestConfig(String outFile)
   {
      try
      {
         FileWriter fw = new FileWriter(outFile);
         BufferedWriter bw = new BufferedWriter(fw);
         //write the pattern
         bw.write("//tests-from:");
         bw.write(progPath + "\\" + progPattern + "\n");
         bw.write(saveTests());
         bw.close();
      }
      catch(IOException ex)
      {
         ex.printStackTrace();
      }
   }*/
   
   private void writeTestClassFile(String in, String fName)
   {
   	//This part may go - we want the test's classnames to match the actual classnames, rather than creating
   	//and using separate classes
   	if(fName != null)
   	{
   		
	   	for(int i = 0; i < progClassList.size(); i++)
	   	{
	   		ClassInfo ci = progClassList.getClass(i);
	   		in = in.replaceAll(ci.className, ci.getClassTestName());
	   	}
	   	WhiteboxUtils.writeFile(fName, in);
   	}
   }
   
   //TODO: test this
   private void saveAll()
   {
   	String lastFileFN = null;
   	String manifestFN = "";
   	String lastFile = "";
   	String manifest = "";
   	String currManifest = "";
   	String lastManifest = "";
   	LinkedList lastEnd = new LinkedList();
   	String classLine = "";
   	int classLevel = 1;
   	lastEnd.add(new Integer(0));
   	
   	//for each class
   	for(int i = 0; i < progClassList.size(); i++)
   	{
   		ClassInfo ci = progClassList.getClass(i);
   		//if we are at the end of a class then end all previous classes
   		Integer le = (Integer) lastEnd.get(classLevel - 1);
   		while(ci.startChar > le.intValue() && classLevel > 0)
   		{
   			classLevel--;
   			lastEnd.removeLast();
   			if(!lastFile.isEmpty())
   				lastFile += "}\n\n";
   			if(classLevel > 0)
   				le = (Integer) lastEnd.get(classLevel - 1);
   		}
   		if(classLevel == 0)
   		{
   			//close the last file
   			writeTestClassFile(lastFile, lastFileFN);
   			lastFileFN = ci.className + "Test.java";
   			
   			//put preambles
   			lastFile = ci.imports.dumpList();
   		}
   		classLevel++;
   		
   		//if the class's fromFile has changed, we need to move to a new testManifest
   		if(!ci.fromFile.equals(lastManifest))
   		{
   			//write and close the previous manifest
   			WhiteboxUtils.writeFile(manifestFN, manifest);
   			//open a new manifest
   			lastManifest = ci.fromFile;
   			manifestFN = lastManifest.replace(".java", ".wbm");
   			manifest = "";
   		}
   		lastFile += ci.getClassOpen("   ", false);
   		//foreach method
   		boolean hasEmptyCtor = false;
   		for(int j = 0; j < ci.methods.size(); j++)
   		{
   			MethodInfo mi = ci.methods.getMethod(j);
   			//dump the method
   			if(mi.isEmptyCtor())
   				hasEmptyCtor = true;
   			//lastFile += mi.getMethodText() + "\n\n";
   			lastFile += mi.writeQuicktestFunction(ci);
   			String manifestArea = "";
   			int testCount = 0;
   			//for each test
   			for(int k = 0; k < mi.tests.size(); k++)
   			{
   				//dump the test IF it is complete 
   				TestInfo ti = mi.tests.getTest(k);
   				if(ti.isComplete())
   				{
	   				int testLine = WhiteboxUtils.countLines(lastFile) + 1;
	   				manifestArea += "    Test:" + ti.name + ":" + ti.commentName + ":" + ti.testIndex + ":" + testLine + ":" + ti.lineInputs.length + "\n";
	   				lastFile += ti.getTestCode("   ", progClassList) + "\n";
	   				testCount++;
   				}
   			}
   			currManifest += "  Method:" + mi.getMethodSignature() + ":" + testCount + "\n";
   			currManifest += manifestArea;
   		} 		
   		
   		//finish off the manifest entry for the class and store it
   		if(!hasEmptyCtor)
   			lastFile += "   public " + ci.className + "(){}\n\n";
   		int mSetupLine = WhiteboxUtils.countLines(lastFile) + 1;
   		lastFile += ci.mockSetup;
   		int qtLine = WhiteboxUtils.countLines(lastFile) + 2;
   		lastFile += "\n   public void quickTest(){}\n\n";
   		classLine = "Class:" + ci.className + ":" + ci.methods.size() + ":" + mSetupLine + ":" + lastFileFN + ":" + qtLine + "\n";
   		ci.resetQt(qtLine, false);
   		currManifest = classLine + currManifest;
   		lastEnd.add(new Integer(ci.endChar));
   		manifest = manifest + currManifest;
   		currManifest = "";
   	}
   	//close the last file and test manifest
   	lastFile += "}\n\n";
   	writeTestClassFile(lastFile, lastFileFN);
   	WhiteboxUtils.writeFile(manifestFN, manifest);
   	
   }
   
   //TODO: test this
   public void compileAll()
   {
   	String compileReport = new String();
   	//switch to the test directory
   	//WhiteboxUtils.chDir(testOutputFilePath.get());
   	//System.out.println(testOutputFilePath.get());
   	//run the compile command on each test class
   	progClassList.lang.runCompileCommand("*Test.java");
   	String dir = WhiteboxUtils.currDir();
   	String[] classes = WhiteboxUtils.listFiles(dir, "*.class");
   	
   	System.out.println("Classes contains " + classes.length + " items.");
   	TestList tl = new TestList();
   	//for each .class
   	for(int i = 0; i < classes.length; i++)
   	{
   		//read the test manifest to see which tests compiled
   		//System.out.println("Processsing " + classes[i]);
   		String cn = classes[i].substring(0, classes[i].indexOf(".class"));
   		//System.out.println("Classname is " + cn);
   		String[] man = WhiteboxUtils.loadFile(cn + ".wbm");
   		//System.out.println("WBM for " + cn + " contains " + man.length + " lines.");
   		ClassInfo ci = null; 
			MethodInfo mi = null;
			TestInfo ti = null;
			String classFileName = null;
   		for(int j = 0; j < man.length; j++)
   		{
   			String lne = man[j].trim();
   			System.out.println("Looking at line " + man[j]);
   			String[] x = lne.split(":");
   			
   			if(lne.startsWith("Class:"))
   			{
   				System.out.println("ClassInfo - looking for " + x[1]);
   				ci = progClassList.findClassWithName(x[1]);
   				if(ci == null)
   					continue;
   				System.out.println("Found " + x[1]);
   				classFileName = x[4].substring(0, x[4].indexOf(".java"));
   				//classFileName = classFileName.replaceFirst(".java", ".class");
   				System.out.println("Looking for " + classFileName + ".class");
   				String[] y = WhiteboxUtils.listFiles(dir, classFileName + ".class");
   				if(y.length == 0)
   				{
   					ci = null;
   					continue;
   				}
   			}
   			else if(lne.startsWith("Method:"))
   			{
   				if(ci == null)
   					continue;
   				mi = ci.methods.getMethodWithSignature(x[1]);
   				if(mi == null)
   					continue;
   			}
   			else if(lne.startsWith("Test:"))
   			{
   				if(mi == null)
   					continue;
   				ti = mi.tests.findTestWithName(x[1]);
   				if(ti == null)
   					continue;
   				//write the compile report
   				compileReport += classFileName + ":" + x[1] + "\n";
   				//update each test's compile state (as passed)
   				ti.compileState = 1;
   				tl.add(ti);
   			}
   		}
   	}
   	
   	//continue to update each test's compile state (mark the failures)
   	for(int i = 0; i < progClassList.size(); i++)
   	{
   		ClassInfo ci = progClassList.getClass(i);
   		for(int j = 0; j < ci.methods.size(); j++)
   		{
   			MethodInfo mi = ci.methods.getMethod(j);
   			for(int k = 0; k < mi.tests.size(); k++)
   			{
   				TestInfo ti = mi.tests.getTest(k);
   				if(ti.compileState != 1)
   					ti.compileState = 2;
   			}
   		}
   		//set up the run state
   		progClassList.lang.tr = new JavaTestRunner(5000);
   		progClassList.lang.tr.tests = tl.toArray();
   		progClassList.lang.tr.TEAcmd = progClassList.lang.testRunCommand;
   	}
   	System.out.println("CompileReport:============================\n" + compileReport + "\n===============================");
   	WhiteboxUtils.writeFile("Java.wbr", compileReport);
   	testTree.repaint();
   }
   
   //TODO: get this to update test run state on the fly
   private void runAll()
   {
   	//switch to the test directory
   	WhiteboxUtils.chDir(testOutputFilePath.get());
   	//open the run report
   	String[] x = WhiteboxUtils.loadFile("Java.wbr");
   	if(x == null)
   	{
   		compileAll();
   		x = WhiteboxUtils.loadFile("Java.wbr");
   	}
   	//run the test runner
   	progClassList.lang.tr.runAll("Java.wbr");
   	
   	//update each test's run state
   	//close and delete the run report
   	File f = new File("Java.wbr");
   	f.delete();
   }
   
   /*private String saveTests()  //program -> wbt
   {
      String out = "";
      //for each class
      for(int i = 0; i < progClassList.size(); i++)
      {
         //dump the class
         ClassInfo ci = progClassList.getClass(i);
         out += ci.className + "Test";  //+ extends plus implements
         out += "\n{\n";
         
         //dump each var as public
         for(int j = 0; j < ci.vars.size(); j++)
         {
            VarInfo vi = ci.vars.getVar(j);
            out += "   public " + vi.type + " " + vi.name + "\n";
         }
         
         //dump each method as public
         for(int j = 0; j < ci.methods.size(); j++)
         {
            MethodInfo mi = ci.methods.getMethod(j);
            String l0 = mi.allLines.getLine(0).lineText;
            //int priv = mi.lines[0].indexOf("private");
            int priv = l0.indexOf("private");
            if(priv > 0)
            {
               //mi.lines[0] = mi.lines[0].replaceFirst("private", "public");
            	mi.allLines.getLine(0).lineText = l0.replaceFirst("private", "public");
            }
            out += mi.allLines.outputWTDepth("   ", false);
            //for(int k = 0; k < mi.lines.length; k++)
            //{
               //out += "   " + mi.lines[k];
            //}
         }
         //dump each test method
         ClassInfo c2 = testClassList.getClass(i);
         for(int j = 0; j < c2.methods.size(); j++)
         {
            MethodInfo mi = c2.methods.getMethod(j);
            out += mi.allLines.outputWTDepth("   ", false);
            /*for(int k = 0; k < mi.lines.length; k++)
            {
               out += "   " + mi.lines[k];
            }*/
         /*}
         out += "}\n\n";
      }
      return out;
   }*/
   
/*   private void fillAssertionConfig(AssertionList al, JPanel p)
   {
      
      
   }*/
   
   private void fillErrors()
   {
      JTextArea area = new JTextArea(sysErrRedirect.toString());
      errorScroll = new JScrollPane(area);
      errors = new JPanel(new BorderLayout());
      errors.add(sysOutScroll, BorderLayout.CENTER);
   }
   
   /*private void fillFunction(MethodInfo info)
   {
      //Font f = new Font();
      
      //function.setText(info.lines);
      functionScroll = new JScrollPane(function);
      
   }*/
   
   private void fillSysout()
   {
      JTextArea area = new JTextArea(sysOutRedirect.toString());
      sysOutScroll = new JScrollPane(area);
      sysOut = new JPanel(new BorderLayout());
      sysOut.add(sysOutScroll, BorderLayout.CENTER);
   }

   public void valueChanged(TreeSelectionEvent ev) 
   {
      DefaultMutableTreeNode node = (DefaultMutableTreeNode)
         testTree.getLastSelectedPathComponent();

      if (node == null) 
         return;
      if(methodConfigAll != null)
      {
      	methodConfigAll.updateCurrTest(progClassList);
      }
      String classname = node.getUserObject().getClass().getName();
      if(classname.equals("java.lang.String"))
         return;
      else if(classname.equals("MethodInfo"))
      {
      
    	  MethodInfo mi = (MethodInfo) node.getUserObject();
    	  System.out.println("Tree: Method Clicked: " + mi.name);
    	  selMethod = mi;
    	  fillMethConfigInfo(mi, node, -1);
    	  fillTestConfig(mi, null);
      }
      else
      {
        
    	  TestInfo ti = (TestInfo) node.getUserObject();
    	  System.out.println("Tree: Test Clicked: " + ti.name);
    	  selTest = ti;
    	  selMethod = ti.getAssocMethod();
    	  fillMethConfigInfo(ti.getAssocMethod(), (DefaultMutableTreeNode) node.getParent(), node.getParent().getIndex(node));
    	  fillTestConfig(ti.getAssocMethod(), ti);
      }
      fillAllOutput();
   }
   
   private TreePath findObjectInTree(Object o)
   {
      java.util.Enumeration nodes = ((DefaultMutableTreeNode) testTree.getModel().getRoot()).preorderEnumeration();
      while (nodes.hasMoreElements()) 
      {
         DefaultMutableTreeNode node = (DefaultMutableTreeNode) nodes.nextElement();
         if (node.getUserObject() == o) 
         {
            return new TreePath(node.getPath());
         }
      }
      return null;
   }
   
   public void actionPerformed(ActionEvent e)
   {
      if(e.getSource() == methButton)
      {
         DefaultMutableTreeNode node = (DefaultMutableTreeNode)
         testTree.getLastSelectedPathComponent();

         if (node == null) 
            return;
         if(node.getUserObject().getClass().getName().equals("java.lang.String"))
            return; 
         else if(node.getUserObject().getClass().getName().equals("MethodInfo"))
         {
        	 MethodInfo mi = (MethodInfo) node.getUserObject();
        	 FunctionViewUI pan = new FunctionViewUI(mi);
         }
         else
         {
        	TestInfo ti = (TestInfo) node.getUserObject();
        	FunctionViewUI pan = new FunctionViewUI(ti.getAssocMethod()); 
         }
         
         
      }
      else if(e.getSource() == fsb.okBtn)
      {
         fsb.okBtn.removeActionListener(this);
         progPath.set(fsb.pathTxt.getText());
         progPattern.set(fsb.patternTxt.getText());
         //updateTests(progPath.get(), progPattern.get(), false);
         fsb.setVisible(false);
      }
      else if(e.getSource() == loadTests)
      {
         selectFileToOpen();
         loadProgram(testOutputFile.get(), "*.java");
      }
      else if(e.getSource() == saveTests)
      {
         //selectFileToSave();
         //saveTestConfig(testOutputFile.get());
      	saveAll();
      }
      else if(e.getSource() == exit)
      {
         System.exit(0);
      }
      else if(e.getSource() == extractTests)
      {
         selectPatternToOpen();
      }
      else if(e.getSource() == reExtract)
      {
         //updateTests(progPath.get(), progPattern.get(), false);
      	extractTests();
      }
      else if(e.getSource() == close)
      {
         //testClassList = new ClassList();
         progClassList = new ClassList();
         progPath.set("");
         progPattern.set("");
         testOutputFile.set("");
         testOutputFilePath.set("");
         //fillTree(testClassList);
         
      }
      
      else if(e.getSource() == add)
      {
         ClassInfo ci;
         DefaultMutableTreeNode node = (DefaultMutableTreeNode)
            testTree.getLastSelectedPathComponent();

         if (node == null) 
            return;
         if(node.getUserObject().getClass().getName().equals("java.lang.String"))
         {
            String str = (String) node.getUserObject();
            //ci = testClassList.findClassWithName(str);
            ci = progClassList.findClassWithName(str);
         }
         else
         {
            MethodInfo mi = (MethodInfo) node.getUserObject();
            //ci = testClassList.findClassWithMethod(mi);
            ci = progClassList.findClassWithMethod(mi);
         }
         int i = 0;
         String testMethodName = ci.className + "TestUser" + i;
         while(ci.methods.getMethodWithName(testMethodName) != null)
            i++;
         //MethodInfo newMethod = new MethodInfo("   void " + testMethodName + "()", -1, null, ci.classIndex);
         //ci.methods.add(newMethod);
         
         //reset the tree
         //fillTree(testClassList);
         
         //select the latest tree
         //testTree.setSelectionPath(findObjectInTree(newMethod));
      }
      
      else if(e.getSource() == compile)
      {
         String path1 = System.getProperty("user.dir");
         //MethodInfo mi = getSelectedMI();
         //ClassInfo ci;
         if(this.progClassList.lang.compileOptions == null)
         {
         	CompileConfig cc = new CompileConfig(path1, progClassList.lang, this);
         }
         else
         {
         	compileAll();
         }
         //did you select a class?
         /*if(mi == null)
         {
            //ci = testClassList.findClassWithName(getSelectedCI());
         	ci = progClassList.findClassWithName(getSelectedCI());
            for(int i = 0; i < ci.methods.size(); i++)
            {
               mi = ci.methods.getMethod(i);
               String fName = dumpTempTest(mi, path1);
               String[] filePath = new String[2];
               int j = fName.lastIndexOf("\\");
               filePath[0] = fName.substring(0, j);
               filePath[1] = fName.substring(j + 1, fName.length());
               boolean status = compileTests(filePath[0], filePath[1]);
               //report the status and get rid of the temp directory
               if(status)
                  mi.setCompileState(1);
               else
                  mi.setCompileState(2);
               File f = new File(fName);
               f.delete();
            }
         }
         else
         {
            String fName = dumpTempTest(mi, path1);
            String[] filePath = new String[2];
            int i = fName.lastIndexOf("\\");
            filePath[0] = fName.substring(0, i);
            filePath[1] = fName.substring(i + 1, fName.length());
            boolean status = compileTests(filePath[0], filePath[1]);
            //report the status and get rid of the temp directory
            if(status)
               mi.setCompileState(1);
            else
               mi.setCompileState(2);
            File f = new File(fName);
            f.delete();
         }*/
         //fillTree(testClassList);
      }
      
      else if(e.getSource() == run)
      {
         /*String path1 = System.getProperty("user.dir");
         MethodInfo mi = getSelectedMI();
         ClassInfo ci;
         String[] tests;
         //did you select a class?
         if(mi == null)
         {
            //ci = testClassList.findClassWithName(getSelectedCI());
         	ci = progClassList.findClassWithName(getSelectedCI());
            tests = new String[ci.methods.size()];
            for(int i = 0; i < ci.methods.size(); i++)
            {
               tests[i] = ci.methods.getMethod(i).name;
            }   
         }
         else
         {
            tests = new String[1];
            tests[0] = mi.name;
            //ci = testClassList.getClass(mi.classIndex);
            ci = progClassList.getClass(mi.classIndex);
         }
         String fName = dumpTestClass(ci, path1 + "\\" + ci.className + ".java", tests);
         compileTests(path1, ci.className + ".java");
         runTests(path1, ci.className + ".java");*/
         //fillTree(testClassList);
      	runAll();
      }
      
      //fillTree(testClassList);
   }
   
   public void textValueChanged(TextEvent e)
   {
      DefaultMutableTreeNode node = (DefaultMutableTreeNode)
         testTree.getLastSelectedPathComponent();
      MethodInfo mi = (MethodInfo) node.getUserObject();
      if(methodConfigTextChange(e, mi) == false)
      {
         String str = ((JTextArea) e.getSource()).getText();
         mi.setLines(str);
      }
   }
   
   private boolean methodConfigTextChange(TextEvent e, MethodInfo mi)
   {
   	for(int i = 0; i < mi.tests.size(); i++)
   	{
   		TestInfo ti = mi.tests.getTest(i);
   		if(e.getSource() == methodConfigTestNames[i])
   		{
   			ti.name = methodConfigTestNames[i].getText();
   			return true;
   		}
   		if(e.getSource() == methodConfigExceptions[i])
   		{
   			ti.expectedException = methodConfigExceptions[i].getText();
   			return true;
   		}
   		for(int j = 0; j < ti.inputValues.length; j++)
   		{
   			if(e.getSource() == methodConfigInputs[i][j])
   			{
   				ti.inputValues[j] = ((TextField)methodConfigInputs[i][j]).getText();
   				return true;
   			}
   		}
   		for(int j = 0; j < ti.asserts.size(); j++)
   		{
   			AssertionInfo ai = ti.asserts.getAssertion(j);
   			if(e.getSource() == methodConfigOutputs[i][j])
   			{
   				ai.expValue = ((TextField)methodConfigOutputs[i][j]).getText();
   				return true;
   			}
   		}
   	}
   	return false;
   }
   
   private int sizeInputList(MethodInfo mi)
   {
   	int rtnVal = 0;
   	for(int i = 0; i < mi.tests.size(); i++)
   	{
   		TestInfo ti = mi.tests.getTest(i);
   		if(ti.inputValues.length > rtnVal)
   			rtnVal = ti.inputValues.length;
   	}
   	return rtnVal;
   }
   
   private int sizeOutputList(MethodInfo mi)
   {
   	int rtnVal = 0;
   	for(int i = 0; i < mi.tests.size(); i++)
   	{
   		TestInfo ti = mi.tests.getTest(i);
   		if(ti.asserts.size() > rtnVal)
   			rtnVal = ti.asserts.size();
   	}
   	return rtnVal;
   }
   
   private void fillMethConfigInfo(MethodInfo mi, DefaultMutableTreeNode n, int testNum)
   {
   	methodConfigAll = new MethodEditPanel(testTree);
   	ClassInfo ci = progClassList.findClassWithMethod(mi);
   	methodConfigAll.setQuicktestInfo(ci, progClassList);
   	methodConfigAll.fill(mi, n);
   	if(testNum != -1)
   		methodConfigAll.testList.setSelectedIndex(testNum);
   }
   
   private String dumpTempTest(MethodInfo mi, String path)
   {
      //make a temp directory in the string path
      String dirPath = path + "\\TempTest";
      File f = new File(dirPath);
      if(f.mkdir())
      {
         //make the temp class
         ClassInfo tempClass = progClassList.findClassWithMethod(mi);
         tempClass = tempClass.copyClass();
         tempClass.methods.removeAllNonTestMethods();
         tempClass.methods.add(mi);
         
         String classFile = new String(dirPath + "\\" + tempClass.className + "Test.java");
         ClassList tempClassList = new ClassList();
         tempClassList.add(tempClass);
         tempClassList.save(classFile);
         return classFile;
      }
      else
      {
         System.out.println("Failed to create temp directory \"TempTest\" in " + path);
         return null;
      }
   }
   
   private boolean compileTests(String path, String file)
   {
      try 
      {
         String line;
         boolean success = true;
         Process p = Runtime.getRuntime().exec("javac " + path + "\\" + file);
         BufferedReader input =
           new BufferedReader
             (new InputStreamReader(p.getInputStream()));
         while ((line = input.readLine()) != null) 
         {
           //System.out.println(line);
           success = false;
         }
         input.close();
         return success;
      }
      catch (Exception err) 
      {
         err.printStackTrace();
         return false;
      }
   }
   
   private String createTestMain(String[] tests)
   {
      String rtnVal = "   public static void main(String args[])\n";
      rtnVal += "   {\n";
      for(int i = 0; i < tests.length; i++)
      {
         rtnVal += "      " + tests[i] + "();\n";
      }
      rtnVal += "   }\n";
      return rtnVal;
   }
   
   private String dumpTestClass(ClassInfo in, String path, String[] testList)
   {
      
      ClassList temp = new ClassList();
      String testMain = createTestMain(testList);
      //MethodInfo mi = new MethodInfo("public static void main(String args[])", 0, "", -1);
      //mi.setLines(testMain);
      temp.add(in);
      String outpath = path + in.className + ".java";
      temp.save(outpath);
      return outpath;
   }
   
   private int runTests(String path, String file)
   {
      try 
      {
         String[] f = file.split("\\.");
         String line;
         //java the path
         Process p = Runtime.getRuntime().exec("java -classpath " + path + " " + f[0]);
         BufferedReader input =
           new BufferedReader
             (new InputStreamReader(p.getInputStream()));
         while ((line = input.readLine()) != null) 
         {
           //System.out.println(line);
         }
         input.close();
         return p.exitValue();
      }
      catch (Exception err) 
      {
         err.printStackTrace();
         return -1;
      }
   }
   
   private void setupMenus()
   {
      menuBar = new JMenuBar();
      fileMenu = new JMenu("File");
      loadTests = new JMenuItem("Load tests...");
      loadTests.addActionListener(this);
      extractTests = new JMenuItem("Extract tests...");
      extractTests.addActionListener(this);
      saveTests = new JMenuItem("Save");
      saveTests.addActionListener(this);
      saveTestsAs = new JMenuItem("Save as...");
      saveTestsAs.addActionListener(this);
      saveJUnit = new JMenuItem("Save as JUnit...");
      saveJUnit.addActionListener(this);
      reExtract = new JMenuItem("Re-extract");
      reExtract.addActionListener(this);
      close = new JMenuItem("Close tests");
      close.addActionListener(this);
      exit = new JMenuItem("Exit");
      exit.addActionListener(this);
      
      testMenu = new JMenu("Tests");
      add = new JMenuItem("Add...");
      add.addActionListener(this);
      compile = new JMenuItem("Compile");
      compile.addActionListener(this);
      run = new JMenuItem("Run");
      run.addActionListener(this);
      
      fileMenu.add(loadTests);
      fileMenu.add(extractTests);
      fileMenu.add(saveTests);
      fileMenu.add(saveTestsAs);
      fileMenu.add(saveJUnit);
      fileMenu.addSeparator();
      fileMenu.add(reExtract);
      fileMenu.add(close);
      fileMenu.addSeparator();
      fileMenu.add(exit);
      
      testMenu.add(add);
      testMenu.add(compile);
      testMenu.add(run);
      
      menuBar.add(fileMenu);
      menuBar.add(testMenu);
      
      setJMenuBar(menuBar);
   }
   
   private void selectPatternToOpen()
   {
      fsb = new FileSelectorBox(progPath, progPattern);
      fsb.okBtn.addActionListener(this);
      
   }
   
   private void selectFileToOpen()  //for loading tests
   {
      JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
      int returnVal = jfc.showOpenDialog(this);
      if(returnVal == JFileChooser.APPROVE_OPTION)
      {
         progPath.set(jfc.getSelectedFile().getAbsolutePath());
         progPattern.set(jfc.getSelectedFile().getName());
      }
   }
   
   private void selectFileToSave()  //for saving tests
   {
      JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
      int returnVal = jfc.showOpenDialog(this);
      if(returnVal == JFileChooser.APPROVE_OPTION)
      {
         testOutputFilePath.set(jfc.getSelectedFile().getAbsolutePath());
         testOutputFile.set(jfc.getSelectedFile().getName());
      }
   }
   
   private TestInfo getSelectedTI()
   {
	   DefaultMutableTreeNode node = (DefaultMutableTreeNode)
          testTree.getLastSelectedPathComponent();
	   try
	   {
		   return (TestInfo) node.getUserObject();
	   }
	   catch(ClassCastException cce)
	   {
		   return null;
	   }   
   }
   
   private MethodInfo getSelectedMI()
   {
	   DefaultMutableTreeNode node = (DefaultMutableTreeNode)
      testTree.getLastSelectedPathComponent();
	   try
	   {
		   return (MethodInfo) node.getUserObject();
	   }
	   catch(ClassCastException cce)
	   {
		   return null;
	   }
   }
   
   private String getSelectedCI()
   {
      DefaultMutableTreeNode node = (DefaultMutableTreeNode)
         testTree.getLastSelectedPathComponent();
      if(node.getUserObject().getClass().equals("java.lang.String"))
      {
         return (String) node.getUserObject();
      }   
      else
         return null;
   }
}

class FunctionViewPanel extends JPanel implements Scrollable
{
   MethodInfo methodInfo;
   String[] codeList;
   AssertionList asserts;
   String showName;
   Font mFont;
   FontMetrics fm;
   int fontHeight;
   int fontWidth;
   int boxWidth;
   int boxHeight;
   int viewWidth;
   int viewHeight;
   
   FunctionViewPanel(MethodInfo input)
   {
      super();
      setup(input);
   }
   
   FunctionViewPanel(TestInfo input)
   {
	   super();
	   setup(input);
   }
   
   /*FunctionViewPanel(String filename)
   {
      super();
      String[] function = WhiteboxUtils.loadFile(filename);
      
      //random assertions
      MethodInfo mi = new MethodInfo(function[0], 1, "VarInfo", 0);
      for(int i = 0; i < 5; i++)
      {
         int randNum = (int) (Math.random() * function.length * 1.0);
         AssertionInfo ai = new AssertionInfo(randNum);
         mi.asserts.addAssertion(ai);
      }
      mi.setLines(function);
      setup(mi);
   }*/
   
   private void setup(MethodInfo input)
   {
      methodInfo = input;
      showName = methodInfo.name;
      asserts = input.asserts;
      codeList = methodInfo.getLines().split("\n");
      setup2();
   }
   
   private void setup(TestInfo ti)
   {
	  methodInfo = ti.assocMethod;
	  showName = ti.commentName;
	  asserts = ti.asserts;
	  System.out.println("TI Asserts:" + ti.asserts.size());
	  System.out.println(methodInfo.allLines.outputWTDepth("   ", false));
	  System.out.println("Asserts:" + asserts.size());
	  codeList = methodInfo.getExtractedTest(ti.getTestIndex()).toStrArray("   ", true);
	  setup2();
   }
   
   private void setup2()
   {
	   mFont = new Font("monospaced", Font.PLAIN, 12);
      fm = getFontMetrics(mFont);
      fontHeight = fm.getHeight();
      fontWidth = fm.charWidth('w');
      int width = 0;
      for(int i = 0; i < codeList.length; i++)
      {
         if(width < codeList[i].length())
            width = codeList[i].length();
      }
      boxWidth = width * fontWidth;
      boxHeight = codeList.length * fontHeight + fontHeight;
      setPreferredSize(new Dimension(boxWidth, boxHeight)); 
   }
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.setColor(new Color(203,203,203));
      g.fillRect(0, 0, getWidth(), getHeight());
      g.setColor(Color.RED);
      for(int i = 0; i < asserts.size(); i++)
      {
         AssertionInfo ai = asserts.getAssertion(i);
         int boxY = (ai.line /*- methodInfo.startLine*/) * fontHeight + 3;
         g.fillRect(0, boxY, boxWidth, fontHeight);
      }
      
      g.setColor(Color.BLACK);
      g.setFont(mFont);
      //String fstr[] = methodInfo.lines;
      for(int i = 0; i < codeList.length; i++)
         g.drawString(codeList[i], 0, fontHeight * (i + 1));
      //revalidate();
   }
   
   public void setViewSize(int w, int h)
   {
      viewWidth = w;
      viewHeight = h;
   }
   
   public String getFunctionName()
   {
      return(methodInfo.returnType.getType() + " " + showName);
   }
   
   public Dimension getPreferredScrollableViewportSize() 
   {
      return getPreferredSize();
   }

   public int getScrollableBlockIncrement(Rectangle arg0, int arg1, int arg2) 
   {
      return 5 * fontHeight;
   }

   public boolean getScrollableTracksViewportHeight() 
   {
      return false;
   }

   public boolean getScrollableTracksViewportWidth() 
   {
      return false;
   }

   public int getScrollableUnitIncrement(Rectangle arg0, int arg1, int arg2) 
   {
      return fontHeight;
   }
   
}

class FileSelectorBox extends JFrame implements ActionListener
{
   StringRef path;
   StringRef pattern;
   
   JTextField pathTxt;
   JTextField patternTxt;
   JButton browseBtn;
   JButton okBtn;
   
   JPanel top;
   JPanel mid;
   JPanel bottom;
   JPanel main;
   
   FileSelectorBox()
   {
      this(new StringRef(System.getProperty("user.dir")), new StringRef("*.java"));
   }
   
   FileSelectorBox(StringRef pth, StringRef ptn)
   {
      path = pth;
      pattern = ptn;
      setup();
   }
   
   public void setup()
   {
      JLabel pathLbl = new JLabel("Path:");
      JLabel ptnLbl = new JLabel("Pattern:");
      pathTxt = new JTextField(path.get());
      patternTxt = new JTextField(pattern.get());
      browseBtn = new JButton("Browse...");
      browseBtn.addActionListener(this);
      okBtn = new JButton("OK");
      //okBtn.addActionListener(this);
      
      top = new JPanel(new BorderLayout());
      top.add(pathLbl, BorderLayout.WEST);
      top.add(pathTxt, BorderLayout.CENTER);
      top.add(browseBtn, BorderLayout.EAST);
      
      mid = new JPanel(new BorderLayout());
      mid.add(ptnLbl, BorderLayout.WEST);
      mid.add(patternTxt, BorderLayout.CENTER);
      
      bottom = new JPanel(new BorderLayout());
      bottom.add(okBtn, BorderLayout.EAST);
      
      main = new JPanel(new GridLayout(3, 1));
      main.add(top);
      main.add(mid);
      main.add(bottom);
      
      getContentPane().add(main, BorderLayout.CENTER);
      //setVisible(true);
   }
   
   public void show()
   {
   	setVisible(true);
   }
   
   public StringRef getPattern()
   {
      return pattern;
   }
   
   public StringRef getPath()
   {
      return path;
   }
   
   public void actionPerformed(ActionEvent e)
   {
      if(e.getSource() == browseBtn)
      {
         //open the jfc
         JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
         int returnVal = jfc.showOpenDialog(this);
         if(returnVal == JFileChooser.APPROVE_OPTION)
         {
            path.set(jfc.getSelectedFile().getAbsolutePath());
            pathTxt.setText(path.get());
         }
      }
      else
      {
         
      }
   }
}

class FunctionViewUI extends JFrame
{
   FunctionViewPanel pne;
   JTextArea txt;
   JScrollPane spne;
   JPanel panel;
   
   FunctionViewUI(MethodInfo mi)
   {
      setSize(400,200);
      pne = new FunctionViewPanel(mi);
      setTitle(pne.getFunctionName());
      
      //txt = new JTextArea("Hello\nHow are you?\nI am fine");
      spne = new JScrollPane(/*JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS*/);
      
      spne.setViewportView(pne);
      
      panel = new JPanel();
      panel.add(spne);
      
      getContentPane().add(spne, BorderLayout.CENTER);
      setVisible(true);
      //int j = 5;
   }
}

class MethodEditPanel extends JPanel implements ListSelectionListener, ActionListener
{
	TestEditPanel tep;
	JList testList;
	JScrollPane listScr;
	JButton addTest;
	JPanel innerTop;
	JPanel top;
	
	JTabbedPane bottom;
	JTextArea methodText;
	JScrollPane methodScr;
	TextArea testText;
	JScrollPane testScr;
	int selItem;
	TestInfo storedTest;
	MethodInfo storedMethod;
	JTree storedTree;
	DefaultMutableTreeNode treeNode;
	String oldTName;
	FunctionViewPanel fvp;
	
	//For quicktest
	ClassInfo storedClass;
	ClassList storedClasses;
	LangConfig storedLang;
	
	MethodEditPanel(JTree tree)
	{
		storedTree = tree;
	}
	
	public void setQuicktestInfo(ClassInfo ci, ClassList cl)
	{
		storedClass = ci;
		storedClasses = cl;
		storedLang = cl.lang;
	}
	
	public void fill(MethodInfo mi, DefaultMutableTreeNode treeNode)
	{
		
		String[] allTests = mi.tests.getNames();
		testList = new JList(allTests);
		testList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		testList.setLayoutOrientation(JList.VERTICAL);
		testList.setVisibleRowCount(-1);
		testList.addListSelectionListener(this);
		listScr = new JScrollPane(testList);
		
		addTest = new JButton("Add test...");
		addTest.addActionListener(this);
		
		innerTop = new JPanel(new BorderLayout());
		innerTop.add(listScr, BorderLayout.CENTER);
		innerTop.add(addTest, BorderLayout.SOUTH);
		
		testText = new TextArea();
		testScr = new JScrollPane(testText);
		
		tep = new TestEditPanel(null, testText, this);
		//tep.quickTest.addActionListener(this);
		
		top = new JPanel(new BorderLayout());
		top.add(innerTop, BorderLayout.WEST);
		top.add(tep, BorderLayout.CENTER);
		
		bottom = new JTabbedPane();
		
		methodText = new JTextArea(mi.methodText);
		methodText.setEditable(false);
		methodScr = new JScrollPane(methodText);
		
		bottom.addTab("Method", methodScr);
		bottom.addTab("Test", testScr);
		bottom.addTab("Path", null);
		
		selItem = -1;
		oldTName = null;
		setLayout(new GridLayout(2,1));
		add(top);
		add(bottom);
		
		storedMethod = mi;
		this.treeNode = treeNode;
		bottom.setSelectedIndex(1);
	}
	
	public void valueChanged(ListSelectionEvent arg0) 
	{
		if(oldTName != null)
		{
			if(!oldTName.equals(storedTest.name))
			{
				//update the tree and the list
			}
		}
		selItem = testList.getSelectedIndex();
		
		storedTree.setSelectionPath(new TreePath(((DefaultMutableTreeNode) treeNode.getChildAt(selItem)).getPath()));
		storedTest = storedMethod.tests.getTest(selItem);
		top.remove(tep);
		tep = new TestEditPanel(storedTest, testText, this);
		top.add(tep);
		oldTName = new String(storedTest.name);
		fvp = new FunctionViewPanel(storedTest);
		bottom.removeTabAt(2);
		bottom.addTab("Path", fvp);
		bottom.setSelectedIndex(1);
		validate();
	}
	
	public void updateCurrTest(ClassList in)
	{
		if(storedTest != null)
		{
			int nLIs = storedTest.lineInputs.length;
			System.out.println(nLIs);
			String test = tep.testView.getText();
			System.out.println(test);
			storedTest.gatherTestInfo(test, storedMethod, in, nLIs);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("I am now attempting the quicktest");
		String[][] ins = tep.getInputs(true);
		if(ins == null)
			JOptionPane.showMessageDialog(null, "Please insert a value for all inputs\nbefore attempting a quick test.");
		else
		{
			MethodInfo mi = storedTest.assocMethod;
			/**************
			 * Temporary testing location
			 **************/
			ClassInfo ci = storedClasses.findClassWithName("MoreTesting");
			for(int i = 0; i < ci.methods.size(); i++)
			{
				MethodInfo mx = ci.methods.getMethod(i);
				System.out.println(mx.getMethodSignature());
			}
			MethodInfo mitt = ci.methods.getMethodWithSignature("moreTesting(int x)");
			System.out.println(mitt.writeQuicktestFunction(ci));
			//mi.quickTest(ins, storedClass, storedClasses, storedLang);
		}
	}
}

class TestEditPanel extends JPanel implements TextListener
{
	JPanel innerTop;
	JLabel nameLbl;
	TextField nameTxt;
	JButton quickTest;
	
	int nInputs;
	JPanel innerInputs;
	JLabel[] inputLbls;
	TextField[] inputTxts;
	JScrollPane inputsScr;
	
	int nOutputs;
	JPanel innerOutputs;
	JLabel[] outputLbls;
	TextField[] outputTxts;
	JScrollPane outputScr;
	
	JPanel innerExceptions;
	JLabel exceptionLbl;
	TextField exceptionTxt;
	
	//JPanel bottom;
	TestInfo storedTest;
	TextArea testView;
	
	TestEditPanel(TestInfo in, TextArea view, MethodEditPanel mep)
	{
		storedTest = in;
		if(in == null)
			storedTest = new TestInfo();
		
		nameLbl = new JLabel("Test Name:");
		nameTxt = new TextField(storedTest.name, 20);
		nameTxt.addTextListener(this);
		quickTest = new JButton("Quick Test");
		quickTest.addActionListener(mep);
		innerTop = new JPanel(new FlowLayout());
		innerTop.add(nameLbl);
		innerTop.add(nameTxt);
		innerTop.add(quickTest);
		
		exceptionLbl = new JLabel("Expected Exception:");
		exceptionTxt = new TextField(storedTest.expectedException, 20);
		exceptionTxt.addTextListener(this);
		innerExceptions = new JPanel(new FlowLayout());
		innerExceptions.add(exceptionLbl);
		innerExceptions.add(exceptionTxt);
		
		//String in1[] = TestInfo.getLineInputs(mi.allLines, ci);
		//String in2[] = TestInfo.getMethodParams(mi);
		VarInfo in1[] = storedTest.lineInputs;
		VarInfo in2[] = storedTest.params;
		//if(in != null)
			nInputs = in1.length + in2.length;
		//else
			//nInputs = 0;
		inputLbls = new JLabel[nInputs];
		innerInputs = new JPanel(new GridLayout(nInputs + 1, 2));
		innerInputs.add(new JLabel("Inputs:"));
		innerInputs.add(new JLabel(""));
		for(int i = 0; i < in1.length; i++)
			inputLbls[i] = new JLabel(in1[i].getName() + " [" + in1[i].getType() + ", in]");
		for(int i = 0; i < in2.length; i++)
			inputLbls[i + in1.length] = new JLabel(in2[i].getName() + " [" + in2[i].getType() + ", param]");
		inputTxts = new TextField[nInputs];
		for(int i = 0; i < nInputs; i++)
		{		
			inputTxts[i] = new TextField(20);
			inputTxts[i].setText(storedTest.getInputValue(i)); 
			inputTxts[i].addTextListener(this);
			//inputTxts[i].addTextListener(outComponent);
			innerInputs.add(inputLbls[i]);
			innerInputs.add(inputTxts[i]);
		}
		
		
		AssertionList storedAL = storedTest.asserts;
		if(storedAL == null)
			nOutputs = 0;
		else
		{
			//storedAL = TestInfo.findAssertions(mi.allLines, cl, mi);
			outputLbls = new JLabel[storedAL.size()];
			outputTxts = new TextField[storedAL.size()];
			//outputLbls = new JLabel[in.asserts.size()];
			nOutputs = storedAL.size();
		}
		innerOutputs = new JPanel(new GridLayout(nOutputs + 1, 2));
		innerOutputs.add(new JLabel("Outputs:"));
		innerOutputs.add(new JLabel(""));
		for(int i = 0; i < storedAL.size(); i++)
		{
			AssertionInfo ai = storedAL.getAssertion(i);
			outputLbls[i] = new JLabel(ai.dataType.getName() + " [" + ai.dataType.getType() + "]");
			outputTxts[i] = new TextField(20);
			outputTxts[i].setText(ai.expValue); 
			outputTxts[i].addTextListener(this);
			//outputTxts[i].addTextListener(outComponent);
			innerOutputs.add(outputLbls[i]);
			innerOutputs.add(outputTxts[i]);
		}
		
		inputsScr = new JScrollPane(innerInputs);
		outputScr = new JScrollPane(innerOutputs);
		
		setLayout(new BorderLayout());
		add(innerTop, BorderLayout.NORTH);
		add(inputsScr, BorderLayout.WEST);
		add(outputScr, BorderLayout.EAST);
		add(innerExceptions, BorderLayout.SOUTH);
		validate();
		testView = view;
		testView.setText(storedTest.getTestCode("   "));
		//testView.addTextListener(this);
		
	}
	
	public String[][] getInputs(boolean requireAll)
	{
		boolean ok = true;
		String[][] rtnVal = new String[inputTxts.length][4];
		for(int i = 0; i < inputTxts.length; i++)
		{
			String s = inputTxts[i].getText();
			if(s.isEmpty() || s == null)
				ok = false;
			else
			{
				String x = inputLbls[i].getText();
				String xy = x.substring(x.indexOf(" [") + 2, x.length() - 1);
				rtnVal[i][2] = x.substring(0, x.indexOf(" ["));  //varname
				rtnVal[i][0] = xy.substring(0, xy.indexOf(", "));    //type
				rtnVal[i][1] = xy.substring(xy.indexOf(", ") + 2, xy.length()); //in OR param
				rtnVal[i][3] = inputTxts[i].getText(); //value
			}
		}
		if(requireAll && !ok)
			return null;
		else
			return rtnVal;
	}
	
	public void textValueChanged(TextEvent e)
	{
		boolean found = false;
		if(e.getSource() == nameTxt)
		{
			storedTest.name = nameTxt.getText();
			found = true;
		}
		else if(e.getSource() == exceptionTxt)
		{
			storedTest.expectedException = exceptionTxt.getText();
			found = true;
		}
		if(!found)
		{
			for(int i = 0; i < nOutputs; i++)
			{
				if(e.getSource() == outputTxts[i])
				{
					storedTest.asserts.getAssertion(i).expValue = outputTxts[i].getText();
					//storedTest.asserts.remove(storedAL.getAssertion(i));
					//storedAL.getAssertion(i).expValue = outputTxts[i].getText();
					//if(!outputTxts[i].getText().isEmpty())
					//{	
						//storedTest.asserts.add(storedAL.getAssertion(i));
					//}
					found = true;
					break;
				}
			}
		}
		if(!found)
		{
			for(int i = 0; i < nInputs; i++)
			{
				if(e.getSource() == inputTxts[i])
				{
					//if(!inputTxts[i].getText().isEmpty())
					//{
					storedTest.inputValues[i] = inputTxts[i].getText();
						
					//}
					found = true;
					break;
				}
			}
		}
		/*if(found)
		{
			testView.removeTextListener(this);
			testView.setText(storedTest.getTestCode("   "));
			validate();
			testView.addTextListener(this);
		}*/
		if(testView != null)
			testView.setText(storedTest.getTestCode("   "));
	}
}

class NewTestSetupGUI extends JFrame implements ActionListener, TextListener
{
	JPanel innerTop;
	JLabel nameLbl;
	TextField nameTxt;
	
	int nInputs;
	JPanel innerInputs;
	JLabel[] inputLbls;
	TextField[] inputTxts;
	JScrollPane inputScr;
	
	int nOutputs;
	JPanel innerOutputs;
	JLabel[] outputLbls;
	TextField[] outputTxts;
	JScrollPane outputScr;
	
	JPanel ioPane;
	
	JPanel innerExceptions;
	JLabel exceptionLbl;
	TextField exceptionTxt;
	
	JPanel bottom;
	JButton okBtn;
	JButton cancelBtn;
	
	JScrollPane testTxtPne;
	TextArea testTxt;
	FunctionViewPanel methodView;
	
	TestInfo storedTest;
	MethodInfo storedMethod;
	AssertionList storedAL;
	
	NewTestSetupGUI(MethodInfo mi, ClassInfo ci, ClassList cl)
	{
		nameLbl = new JLabel("Test Name:");
		nameTxt = new TextField(20);
		nameTxt.addTextListener(this);
		innerTop = new JPanel(new FlowLayout());
		innerTop.add(nameLbl);
		innerTop.add(nameTxt);
		
		exceptionLbl = new JLabel("Expected Exception:");
		exceptionTxt = new TextField(20);
		exceptionTxt.addTextListener(this);
		innerExceptions = new JPanel(new FlowLayout());
		innerExceptions.add(nameLbl);
		innerExceptions.add(nameTxt);
		
		okBtn = new JButton("OK");
		okBtn.addActionListener(this);
		cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(this);
		bottom = new JPanel(new GridLayout(1, 3));
		bottom.add(new JLabel(""));
		bottom.add(cancelBtn);
		bottom.add(okBtn);
		
		testTxt = new TextArea();
		testTxtPne = new JScrollPane(testTxt);
				
		methodView = new FunctionViewPanel(mi);
		storedMethod = mi;
		
		VarInfo in2[] = TestInfo.getMethodParams(mi);
		VarInfo in1[] = TestInfo.getLineInputs(mi.allLines, ci, in2);
		
		nInputs = in1.length + in2.length;
		inputLbls = new JLabel[nInputs];
		innerInputs = new JPanel(new GridLayout(nInputs, 2));
		for(int i = 0; i < in1.length; i++)
			inputLbls[i] = new JLabel(in1[i].getName());
		for(int i = 0; i < in2.length; i++)
			inputLbls[i + in1.length] = new JLabel(in2[i].getName());
		inputTxts = new TextField[nInputs];
		for(int i = 0; i < nInputs; i++)
		{		
			inputTxts[i] = new TextField(20);
			inputTxts[i].addTextListener(this);
			innerInputs.add(inputLbls[i]);
			innerInputs.add(inputTxts[i]);
		}
		
		storedAL = TestInfo.findAssertions(mi.allLines, cl, mi);
		outputLbls = new JLabel[storedAL.size()];
		outputTxts = new TextField[storedAL.size()];
		innerOutputs = new JPanel(new GridLayout(nOutputs, 2));
		for(int i = 0; i < storedAL.size(); i++)
		{
			AssertionInfo ai = storedAL.getAssertion(i);
			outputLbls[i] = new JLabel(ai.dataType.getName());
			outputTxts[i] = new TextField(20);
			innerOutputs.add(outputLbls[i]);
			innerOutputs.add(outputTxts[i]);
		}
		
		ioPane = new JPanel(new BorderLayout());
		ioPane.add(innerTop, BorderLayout.NORTH);
		ioPane.add(innerInputs, BorderLayout.WEST);
		ioPane.add(innerOutputs, BorderLayout.EAST);
		ioPane.add(innerExceptions, BorderLayout.SOUTH);
		
		JPanel topPne = new JPanel(new BorderLayout());
		topPne.add(ioPane, BorderLayout.CENTER);
		topPne.add(bottom, BorderLayout.SOUTH);
		
		JPanel lowerPne = new JPanel(new GridLayout(2,1));
		lowerPne.add(testTxtPne);
		lowerPne.add(methodView);
		
		JPanel all = new JPanel(new GridLayout(2, 1));
		all.add(topPne);
		all.add(lowerPne);
		
		getContentPane().add(all, BorderLayout.CENTER);
		
		storedTest = new TestInfo();
		storedTest.inputValues = new String[nInputs];
	}
	
	public void textValueChanged(TextEvent e)
	{
		boolean found = false;
		if(e.getSource() == nameTxt)
		{
			storedTest.name = nameTxt.getText();
			found = true;
		}
		else if(e.getSource() == exceptionTxt)
		{
			storedTest.expectedException = exceptionTxt.getText();
			found = true;
		}
		if(!found)
		{
			for(int i = 0; i < nOutputs; i++)
			{
				if(e.getSource() == outputTxts[i])
				{
					storedTest.asserts.remove(storedAL.getAssertion(i));
					storedAL.getAssertion(i).expValue = outputTxts[i].getText();
					if(!outputTxts[i].getText().isEmpty())
					{	
						storedTest.asserts.add(storedAL.getAssertion(i));
					}
					found = true;
					break;
				}
			}
		}
		if(!found)
		{
			for(int i = 0; i < nInputs; i++)
			{
				if(!inputTxts[i].getText().isEmpty())
				{
					storedTest.inputValues[i] = inputTxts[i].getText();
					found = true;
					break;
				}
			}
		}
		testTxt.setText(storedTest.getTestCode("   "));
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == okBtn)
		{
			storedMethod.tests.add(storedTest);
		}
		setVisible(false);
	}
}

class ClassSetupGUI extends JFrame implements ActionListener
{
	JPanel center;
	JPanel mock;
	JLabel mSetupLbl;
	TextArea mockSetup;
	
	JPanel addl;
	JLabel aSetupLbl;
	TextArea addlSetup;
	
	FunctionViewPanel methodView;
	
	JPanel bottom;
	//JButton okBtn;
	//JButton cancelBtn;
	
	int classIndex;
	//ClassInfo storedClass;
	TestInfo storedTest;
	
	ClassSetupGUI(ClassInfo ci, MethodInfo mi, TestInfo ti, int index)
	{
		storedTest = ti;
		classIndex = index;
		mSetupLbl = new JLabel("Class Mock Setup (view only):");
		mockSetup = new TextArea(ci.mockSetup);
		mockSetup.setEditable(false);
		mock = new JPanel(new BorderLayout());
		mock.add(mSetupLbl, BorderLayout.NORTH);
		mock.add(mockSetup, BorderLayout.CENTER);
		
		/*aSetupLbl = new JLabel("Additional Test-specific Class Setup:");
		addlSetup = new TextArea(ti.addlClassSetup[classIndex]);
		addl = new JPanel(new BorderLayout());
		addl.add(aSetupLbl, BorderLayout.NORTH);
		addl.add(addlSetup, BorderLayout.CENTER);*/
		
		if(mi != null)
			methodView = new FunctionViewPanel(mi);
		else
			methodView = new FunctionViewPanel(ti);
		
		center = new JPanel(new GridLayout(3, 1));
		center.add(mock);
		center.add(addl);
		center.add(methodView);
		
		/*cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(this);
		okBtn = new JButton("OK");
		okBtn.addActionListener(this);*/
		bottom = new JPanel(new GridLayout(1, 3));
		bottom.add(new JLabel());
		//bottom.add(cancelBtn);
		//bottom.add(okBtn);
		
		getContentPane().add(center, BorderLayout.CENTER);
		getContentPane().add(bottom, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		/*if(e.getSource() == okBtn)
		{
			storedTest.addlClassSetup[classIndex] = addlSetup.getText();
		}
		this.setVisible(false);*/
	} 
	
}

class CompileConfig extends JFrame implements ActionListener
{
	LangConfig lang;
	JTextField fld;
	JButton btn;
	WhiteboxUI storedUI;
	
	CompileConfig(String currPath, LangConfig l, WhiteboxUI ui)
	{
		lang = l;
		String s = l.compileOptions;
		storedUI = ui;
		JLabel lbl = new JLabel("classpath:");
		if(s == null)
			fld = new JTextField(getClasspath(currPath));
		else
			fld = new JTextField(l.compileOptions);
		btn = new JButton("OK");
		btn.addActionListener(this);
		
		JPanel upper = new JPanel(new BorderLayout());
		upper.add(lbl, BorderLayout.WEST);
		upper.add(fld, BorderLayout.CENTER);
		
		getContentPane().add(upper, BorderLayout.CENTER);
		
		getContentPane().add(new JLabel("           "), BorderLayout.SOUTH);
		getContentPane().add(btn, BorderLayout.SOUTH);
		setSize(400, 200);
		setLocation(400, 400);
		setTitle("Compilation Config");
		setVisible(true);
	}
	
	public static String getClasspath(String in)
	{
		String rtnVal = "-classpath ."; 
		String[] jars = WhiteboxUtils.listFiles(in, "*.jar");
		for(int i = 0; i < jars.length; i++)
		{
			rtnVal += ";" + in + File.pathSeparatorChar + jars[i];
		}
		return rtnVal;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		lang.compileOptions = fld.getText();
		storedUI.compileAll();
		setVisible(false);
	}
}

class TestSelectionGUI extends JFrame implements ActionListener, TreeSelectionListener
{
	JTree progView;
	ClassList classList;
	JTextArea oldTest;
	JTextArea newTest;
	JRadioButton useNew;
	JRadioButton useOld;
	ButtonGroup grp;
	JButton allNew;
	JButton allOld;
	JButton done;
	TestInfo storedOld;
	TestInfo storedNew;
	MethodInfo storedMethod;
	TestList storedList;
	DefaultMutableTreeNode root;
	//int[] tsCopy;
	
	class TestSelectRenderer extends DefaultTreeCellRenderer
	{   
	   public Component getTreeCellRendererComponent(
	         JTree tree,
	         Object value,
	         boolean sel,
	         boolean expanded,
	         boolean leaf,
	         int row,
	         boolean hasFocus)
	   {
	      super.getTreeCellRendererComponent(
	            tree, value, sel,
	            expanded, leaf, row,
	            hasFocus);
	      DefaultMutableTreeNode nde = (DefaultMutableTreeNode) value;
	      Object obj = nde.getUserObject();
	      if(obj.getClass().getName().equals("TestInfo"))
	      {
	      	setText(getObjectText((TestInfo) obj));
	      	Icon icn = getTestIcon((TestInfo) obj);
	      	setLeafIcon(icn);
	      }
	      else if(obj.getClass().getName().equals("MethodInfo"))
	      {
	      	setText(getObjectText((MethodInfo) obj));
	      }
	      return this;
	   }
	   
	   private Icon getTestIcon(MethodInfo mi)
	   {
	      String gif = mi.getIconState();
	      Image img = Toolkit.getDefaultToolkit().getImage(gif);
	      return(new ImageIcon(img));
	   }
	   
	   private Icon getTestIcon(TestInfo ti)
	   {
		   String gif = ti.getNoveltyState();
		   Image img = Toolkit.getDefaultToolkit().getImage(gif);
		   return(new ImageIcon(img)); 
	   }
	   
	   private String getObjectText(TestInfo ti)
	   {
	   	if(ti.commentName != null && !ti.equals("null"))
	   		return ti.commentName;
	   	else
	   		return ti.name;
	   }
	   
	   private String getObjectText(MethodInfo mi)
	   {
	   	return mi.name;
	   }
	}
	
	private void idDuplicates(MethodInfo mi)
	{
		//tsCopy = new int[mi.tests.size()];
		for(int i = 0; i < mi.tests.size(); i++)
		{
			TestInfo t1 = mi.tests.getTest(i);
			//tsCopy[i] = t1.testState;
			if(t1.testIndex == 0)
				continue;
			for(int j = i + 1; j < mi.tests.size(); j++)
			{
				
				TestInfo t2 = mi.tests.getTest(j);
				if(t2.testIndex == 0)
					continue;
				else if(t1 == t2)
				{
					mi.tests.remove(j);
					j--;
					continue;
				}
				else if(t1.getTestCode("   ").equals(t2.getTestCode("   ")))
				{
					mi.tests.remove(j);
					j--;
					continue;
				}
				else if(t1.testIndex == t2.testIndex)
				{
					t2.testIndex = t2.testIndex * -1;
				}
			}
		}
	}
	
	TestSelectionGUI(ClassList in)
	{
		classList = in;
		root = new DefaultMutableTreeNode("Classes");
		boolean showMe = false;
		System.out.println("Allowing for test replacement...");
		for(int i = 0; i < in.size(); i++)
		{
			ClassInfo ci = in.getClass(i);
			//add it to the tree
			DefaultMutableTreeNode cin = new DefaultMutableTreeNode(ci);
			boolean addClass = false;
			for(int j = 0; j < ci.methods.size(); j++)
			{
				MethodInfo mi = ci.methods.getMethod(j);
				DefaultMutableTreeNode min = new DefaultMutableTreeNode(mi);
				idDuplicates(mi);
				boolean addMeth = false;
				for(int k = 0; k < mi.tests.size(); k++)
				{
					TestInfo ti = mi.tests.getTest(k);
					if(ti.testIndex < 0)
					{
						//this makes sure that only newly extracted duplicates are added to the list
						DefaultMutableTreeNode tin = new DefaultMutableTreeNode(ti);
						tin.setUserObject(ti);
						min.add(tin);
						addMeth = true;
					}
				}
				if(addMeth)
				{
					min.setUserObject(mi);
					cin.add(min);
					addClass = true;
				}
			}
			if(addClass)
			{
				cin.setUserObject(ci);
				root.add(cin);
				showMe = true;
			}
		}
		if(!showMe)
			return;
		System.out.println("There are tests to be replaced...");
		
		progView = new JTree(root);
		progView.addTreeSelectionListener(this);
		progView.setCellRenderer(new TestSelectRenderer());
		
		oldTest = new JTextArea();
		JScrollPane jspOld = new JScrollPane(oldTest);
		newTest = new JTextArea();
		JScrollPane jspNew = new JScrollPane(newTest);
		useNew = new JRadioButton("New Test");
		useNew.addActionListener(this);
		useOld = new JRadioButton("Old Test");
		useOld.addActionListener(this);
		grp = new ButtonGroup();
		grp.add(useNew);
		grp.add(useOld);
		
		allNew = new JButton("Replace all with new");
		allNew.addActionListener(this);
		allOld = new JButton("Ignore all new");
		allOld.addActionListener(this);
		done = new JButton("OK");
		done.addActionListener(this);
		
		JScrollPane jsp = new JScrollPane(progView);
		JPanel cen = new JPanel(new GridLayout(2,1));
		JPanel bot = new JPanel(new GridLayout(1,3));
		JPanel ct = new JPanel();
		JPanel cb = new JPanel();
		
		ct.add(useNew, BorderLayout.NORTH);
		ct.add(jspNew, BorderLayout.CENTER);
		cb.add(useOld, BorderLayout.NORTH);
		cb.add(jspOld, BorderLayout.CENTER);
		cen.add(ct);
		cen.add(cb);
		
		bot.add(allNew);
		bot.add(allOld);
		bot.add(done);
		
		getContentPane().add(jsp, BorderLayout.WEST);
		getContentPane().add(cen, BorderLayout.CENTER);
		getContentPane().add(bot, BorderLayout.SOUTH);
		setSize(500, 500);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == useNew || e.getSource() == useOld)
		{
			int x = 0;
			if(storedOld != null)
			{
				x = Math.abs(storedOld.testIndex);
			}
			if(x > 0)
			{
				if(e.getSource() == useNew)
				{
					System.out.println("using " + x);
					storedNew.testIndex = x;
					storedOld.testIndex = x * -1;
					testPeek(storedNew, true);
				}
				else
				{
					System.out.println("using " + x);
					storedOld.testIndex = x;
					storedNew.testIndex = x * -1;
					testPeek(storedNew, false);
				}
			}
		}
		else if(e.getSource() == allNew)
		{
			setGlobalUsage(true);
		}
		else if(e.getSource() == allOld)
		{
			setGlobalUsage(false);
		}
		else
		{
			terminate();
		}
	}
	
	private void setGlobalUsage(boolean useNew)
	{
		for(int i = 0; i < classList.size(); i++)
		{
			ClassInfo ci = classList.getClass(i);
			for(int j = 0; j < ci.methods.size(); j++)
			{
				MethodInfo mi = ci.methods.getMethod(j);
				for(int k = 0; k < mi.tests.size(); k++)
				{
					TestInfo ti = mi.tests.getTest(k);
					for(int l = k; l < mi.tests.size(); l++)
					{
						TestInfo t2 = mi.tests.getTest(l);
						int x = Math.abs(ti.testIndex);
						if(t2.testIndex == Math.abs(x))
						{
							if(useNew)
							{
								t2.testIndex = x;
								ti.testIndex = x * -1;
							}
							else
							{
								ti.testIndex = x;
								t2.testIndex = x * -1;
							}
						}
					}
				}
			}
		}
	}
	
	private void testPeek(TestInfo in, boolean useNew)
	{
		System.out.println(in.toString() + " : " + in.testIndex + " after changing useNew to " + useNew);
	}
	
	private void testPeek(TestInfo in)
	{
		System.out.println(in.toString() + " : " + in.testIndex);
	}
	
	public void valueChanged(TreeSelectionEvent e)
	{
		DefaultMutableTreeNode nde = (DefaultMutableTreeNode) progView.getLastSelectedPathComponent();
		if(nde == null)
			return;
		Object nodeInfo = nde.getUserObject();
		System.out.println("I selected a node");
		if(nodeInfo instanceof TestInfo)
		{
			System.out.println("I selected a test");
			DefaultMutableTreeNode nde2 = (DefaultMutableTreeNode) nde.getParent();
			MethodInfo mi = (MethodInfo) nde2.getUserObject();
			TestInfo ti = (TestInfo) nodeInfo;
			testPeek(ti);
			for(int i = 0; i < mi.tests.size(); i++)
			{
				TestInfo ti2 = mi.tests.getTest(i);
				if(Math.abs(ti2.testIndex) == Math.abs(ti.testIndex))
				{
					if(ti == ti2)
						System.out.println("ARRRG they are the same test!!!");
					oldTest.setEditable(true);
					oldTest.setText(ti2.getTestCode("   "));
					oldTest.setEditable(false);
					newTest.setEditable(true);
					newTest.setText(ti.getTestCode("   "));
					newTest.setEditable(false);
					storedOld = ti2;
					storedNew = ti;
					if(ti.testIndex > 0)
						useNew.setSelected(true);
					else
						useOld.setSelected(true);
					break;
				}
			}
		}
		//revalidate();
	}
	
	private void terminate()
	{
		for(int i = 0; i < classList.size(); i++)
		{
			ClassInfo ci = classList.getClass(i);
			for(int j = 0; j < ci.methods.size(); j++)
			{
				MethodInfo mi = ci.methods.getMethod(j);
				for(int k = 0; k < mi.tests.size(); k++)
				{
					TestInfo ti = mi.tests.getTest(k);
					if(ti.testIndex < 0)
					{
						mi.tests.remove(k);
						k--;
					}
				}
			}
		}
		setVisible(false);
	}
	
}

public class WhiteboxGUI 
{
   JEditorPane pne;
   
   public static void main(String[] args)
   {
      WhiteboxUI ui = new WhiteboxUI();
   }

}
