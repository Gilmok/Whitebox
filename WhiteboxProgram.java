import java.io.*;
import java.util.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.*;
import java.lang.reflect.*;

class LangConfig
{
	String[] grammarMap;
	String[] primitives;
	String compileCommand;
	String compileBase;
	String compileOptions;
	String testRunCommand;
	TestRunner tr;
	
	public LangConfig()
	{
		
	}
	
	public void loadLangConfig(String inFile)  //comment out to find usages
   {
   	//System.out.println("inFile:" + inFile);
   	//parseTreeMax = -1;
	   String[] listing = WhiteboxUtils.loadFile(inFile);
	   testRunCommand = listing[1];
	   compileBase = listing[0];
	   
	   //System.out.println("listing:" + listing.length);
	   String[] rtnVal = new String[listing.length * 3];
	   int i = 3;
	   while(!listing[i].equals(""))
	   //for(int i = 0; i < listing.length; i++)
	   {
		   String[] all = listing[i].split(":");
		   //System.out.println("t1:" + t1);
		   //String t2 = listing[i].substring(listing[i].indexOf(":") + 1, listing[i].length());
		   //System.out.println("t2:" + t2);
		   //if(Integer.parseInt(all[2]) > parseTreeMax)
		   	//parseTreeMax = Integer.parseInt(all[2]);
		   for(int j = 0; j < 3; j++)
		   	rtnVal[i * 3 + j] = all[j];
		   i++;
	   }
	   grammarMap = new String[i * 3];
	   for(int j = 0; j < i; j++)
	   {
	   	for(int k = 0; k < 3; k++)
	   		grammarMap[j * 3 + k] = rtnVal[j * 3 + k];
	   }
	   //grammarMap = rtnVal;
	   i++;
	   int j = 0;
	   primitives = new String[(listing.length - i) * 2];
	   while(i < listing.length)
	   {
	   	String[] all = listing[i].split(":");
	   	primitives[j] = all[0];
	   	if(all.length == 2)
	   		primitives[j + 1] = all[1];
	   	i++;
	   	j += 2;
	   	//System.out.println("Added primitive " + all[0]);
	   }
	   
   }
	
	public boolean isPrimitive(String varName)
	{
		for(int i = 0; i < primitives.length; i += 2)
		{
			if(varName.equals(primitives[i]))
				return true;
		}
		return false;
	}
	
	public void runCompileCommand(String param)
	{
		String cmd = compileBase + " " + param;
		if(compileOptions != null)
			cmd += " " + compileOptions;
		String s[] = WhiteboxUtils.runCmd(cmd);
		System.out.println("=============");
		System.out.println(s[0]);
		System.err.println(s[1]);
		System.out.println("=============");
	}
	
	public void runRunCommand(String param)
	{
		WhiteboxUtils.runCmd(testRunCommand + " " + param);
	}
}

public class WhiteboxProgram 
{
   ClassList testProgram; 
   /*ClassList programMemoryTests;
   ClassList programSavedTests;*/
   String testOutput;
   /*String lineDelimiter;
   String startBlock;
   String endBlock;*/
   
   //LangConfig langConfig;
   
      
   WhiteboxProgram()
   {
      /*lineDelimiter = ";";
      startBlock = "{";
      endBlock = "}";*/
      //langConfig = new LangConfig();
      //langConfig.loadLangConfig(langFile);
   }
   
   public ClassList generateSynTree(ParseTree input, String nodeGrammar, String filename, Integer initIndex)
   {
   	ClassList rtnVal = new ClassList();
   	LinkedList inter = new LinkedList();
	   //ClassList output = new ClassList();
	   //String[] grammarMap = loadGrammarMap(nodeGrammar);
	   rtnVal.lang.loadLangConfig(nodeGrammar);
	   //System.out.println("B");
	   //walkParseTree(input, grammarMap, output);
	   pruneParseTree(input);
	   //System.out.println("C");
	   TreeStatus info = new TreeStatus();
	   CodeCollecter cc = new CodeCollecter(input, rtnVal.lang.grammarMap, filename, initIndex);
	   inter = cc.collectCode();
	   //collectSynTree(input, grammarMap, inter, filename, initIndex);
	   //System.out.println("D");
	   //listInterTree(inter);
	   //System.out.println("E");
	   return buildSynTree(inter, info, rtnVal);
   }
   
   private void listInterTree(LinkedList in)
   {
   	for(int i = 0; i < in.size(); i++)
	   {
		   CodeMember m = (CodeMember) in.get(i);
		   System.out.println(m.toString());
	   }
   }
   
   private ClassList buildSynTree(LinkedList in, TreeStatus info, ClassList cl)
   {
   	// add each node to the classList
   	ClassList output = cl;
   	for(int i = 0; i < in.size(); i++)
   	{
   		CodeMember m = (CodeMember) in.get(i);
		   m.addToTree(output, info, in);
   	}
   	
   	// sort and group lines within each method
   	for(int i = 0; i < output.size(); i++)
   	{
   		ClassInfo ci = output.getClass(i);
   		MethodList ml = ci.methods;
   		for(int j = 0; j < ml.size(); j++)
   		{
   			MethodInfo mi = ml.getMethod(j);
   			LineList ll = mi.allLines;
   			//System.out.println("BEFORE Group:");
   			//ll.output("   ", LineList.CODE);
   			ll.group();
   			//System.out.println("AFTER Group:");
   			//ll.output("   ", LineList.CODE);
   		}
   	}
   	return output;
   }
   
   class CodeCollecter
   {
   	//int parentMax;
   	ParseTree nodeStart;
      //ParseTree nodeParent;
      //int nodesDown;
      String[] grammarMap;
      String fName;
      Integer index;
      LinkedList out;
      Stack path;
      
      CodeCollecter(ParseTree in, String[] grammarMap, String fName, Integer index)
      {
      	nodeStart = in;
      	this.grammarMap = grammarMap;
      	this.fName = fName;
      	this.index = index;
      	out = new LinkedList();
      	//nodesDown = 0;
      	//nodeParent = in;
      	
      	/*for(int i = 2; i < grammarMap.length; i += 3)
      	{
      		if(Integer.parseInt(grammarMap[i]) > parentMax)
      			parentMax = Integer.parseInt(grammarMap[i]);
      	}*/
      	path = new Stack();
      }
      
      public LinkedList collectCode()
      {
      	collectSynTree(nodeStart);
      	sort(out);
      	return out;
      }
   	
	   private CodeMember collectSynTree(ParseTree in)
	   {
	   	//  this function walks down the tree, finding nodes and making xInfo nodes from them
	   	//  the nodes are collated into a list for building the tree later
	   	//  this is to separate xInfo node creation from grammar structure (let node creation take care of it)
	   	CodeMember cm = null;
	   	int start = -1;
	   	int end = 0;
	   	// if it's a parser token (not a lexer one)
	   	if(in.payload instanceof String)
		   {	  
		   	String nodeType = (String) in.payload;
		   	for(int i = 0; i < grammarMap.length; i += 3)
		   	{
		   		// get the grammar mapping, making the appropriate node
		   		if(nodeType.equals(grammarMap[i]) || nodeType.startsWith(grammarMap[i] + ":"))
		   		{
		   			try
		   			{
		   				cm = processNode(in, grammarMap[i + 1], Integer.parseInt(grammarMap[i + 2]));
		   				//cm.addToTree(out, info);
		   				//out.add(cm);
		   				break;
		   			}
		   			catch(Exception e)
		   			{
		   				System.out.println(e.getMessage());
		   				e.printStackTrace();
		   				if(e instanceof InvocationTargetException)
		   				{
		   					InvocationTargetException ite = (InvocationTargetException) e;
		   					System.out.println(ite.getCause());
		   				}
		   				//e.getStackTrace();
		   			}
		   		}
		   	}
		   	// the grammar mapping was not found; the node contains a Parser token we don't care about
		   	if(cm == null)
		   		cm = new BasicNonTerminal(in);
		   	
		   	for(int i = 0; i < in.getChildCount(); i++)
		   	{
		   		
		   		ParseTree pt = (ParseTree) in.getChild(i);
		   		//nodesDown++;
		   		path.push(pt);
		   		CodeMember x = collectSynTree(pt);
		   		/*if(cm instanceof ClassInfo)
			   	{
			   		System.out.println("C" + i + ":" +x.getStartChar() + ":" + x.toString());
			   		if(x instanceof BasicNonTerminal)
			   			System.out.println(((BasicNonTerminal) x).nodeType);
			   		System.out.println("C" + i + ":" +x.getEndChar());
			   	}*/
		   		//nodesDown--;
		   		path.pop();
		   		if(x.getEndChar() != -1 && x.getStartChar() != -1)
		   		{
		   			if(x.getStartChar() < start || start == -1)
		   				start = x.getStartChar();
		   			if(x.getEndChar() > end)
		   				end = x.getEndChar();
		   		}
		   		if(cm instanceof ClassInfo)
			   	{
			   		//System.out.println("CS:" +start);
			   		//System.out.println("CE:" +end);
			   	}
		   	}
		   	if(cm instanceof VarInfo)
		   	{
		   		//System.out.println("CS:" +start);
		   		//System.out.println("CE:" +end);
		   	}
		   	cm.setStartChar(start);
		   	cm.setEndChar(end);
		   	if(!(cm instanceof BasicNonTerminal))
		   	{
		   		//System.out.println("I added " + cm.toString());
		   	}
		   }
	   	else
	   	   cm = new BasicTerminal(in);
	   	return cm;
	   }
	   
	   private CodeMember processNode(ParseTree in, String instr, int parentDepth) throws Exception
	   {
	   	instr = instr.trim();
	   	//make the node
	   	Class cls = Class.forName(instr);
	   	Class[] cls2 = new Class[4];
	   	cls2[0] = Class.forName("org.antlr.runtime.tree.ParseTree");
	   	cls2[1] = Class.forName("org.antlr.runtime.tree.ParseTree");
	   	cls2[2] = Class.forName("java.lang.String");
	   	cls2[3] = Class.forName("java.lang.Integer");
	   	Constructor con = cls.getDeclaredConstructor(cls2);
	   	Object arr[] = new Object[4];
	   	arr[0] = in;
	   	if(parentDepth != 0)
	   		arr[1] = path.get(path.size() - parentDepth - 1);
	   	else
	   		arr[1] = null;
	   	arr[2] = fName;
	   	arr[3] = index;
	   	Object obj = con.newInstance(arr);
	   	out.add(obj);
	   	return (CodeMember) obj;
	   }
	   
	   private void sort(LinkedList in)
	   {
	   	
	   }
   }
    
   
   
   private CodeMember pruneParseTree(ParseTree in /*String[] grammarMap, LinkedList out*/)
   {
	   int start = -1;
	   int end = 0;
	   //int rw = 0;
	   int nNodes = 0;
	   CodeMember cm = null;
	   CodeMember memList[];
	   if(in.payload instanceof String)
	   {	  
	   	cm = new BasicNonTerminal(in);
	   	//System.out.println("(" + in.payload + ")");
	   	nNodes = in.getChildCount();
	   	//System.out.println("ChildCount:" + nNodes);
	   	memList = new CodeMember[nNodes];
	   	for(int i = 0; i < nNodes; i++)
	   	{
	   		ParseTree pt = (ParseTree) in.getChild(i);
	   		if(pt != null)
	   		{
	   			CodeMember temp = pruneParseTree(pt);
	   			memList[i] = temp;
	   		}
	   		else
	   			nNodes--;
	   	}
	   	//System.out.print("Before prune:");
	   	//for(int i = 0; i < nNodes; i++)
	   		//System.out.print("["+memList[i].startChar+","+memList[i].endChar+":"+in.getChild(i).getText()+"]");
	   	//System.out.println();
	   	int j = 0;  //the number of nodes skipped
	   	for(int i = 0; i < nNodes - 1; i++)
	   	{
	   		CodeMember x = memList[i];
	   		boolean found = false;
	   		for(int l = 1; l < nNodes - i; l++)
	   		{
	   			CodeMember y = memList[i + l];
	   			if(x.startChar == y.startChar || x.getEndChar() == -1)
	   			{
	   				memList[i] = null;
	   				in.deleteChild(i - j);
	   				//System.out.println("Cutting node:" + x.toString());
	   				j++;
	   				found = true;
	   				break;
	   			}
	   		}
	   		if(!found)
	   		{
	   				if(x.getStartChar() < start || start == -1)
	   					start = x.getStartChar();
	   				if(x.getEndChar() > end)
	   					end = x.getEndChar();
	   				//System.out.println("Keeping node:" + x.toString());
	   			
	   		}
	   	}
	   	//proses s/e for the final node (if I have not skipped all nodes)
	   	if(nNodes > 0)
	   	{
	   		CodeMember x = memList[nNodes - 1];
	   		if(x.getEndChar() > -1)
	   		{
	   			if(x.getStartChar() < start || start == -1)
	   				start = x.getStartChar();
	   			if(x.getEndChar() > end)
	   				end = x.getEndChar();
	   			//System.out.println("Keeping node:" + x.toString());
	   		}
	   		else
	   			j++;
	   	}
	   	if(j == nNodes)
	   		end = -1;
	   	//System.out.print("After  prune:");
	   	int k = 0;
	   	for(int i = 0; i < nNodes; i++)
	   	{
	   		if(memList[i] == null)
	   			k++;
	   		//else
	   			//System.out.print("["+memList[i].startChar+","+memList[i].endChar+":"+in.getChild(i - k).getText()+"]");
	   	}
	   	//System.out.println();
	   	/*if(rw == 0)
	   	{
	   		System.out.println("S/E not properly set for a non-terminal.");
	   		end = -1;
	   	}*/
	   	cm.setStartChar(start);
	   	cm.setEndChar(end);
	      //System.out.println("Created node:" + cm.toString() + "  from " + in.payload);
	   }
	   else
	   {
	   	cm = new BasicTerminal(in);
	   	//System.out.println("Created node:" + cm.toString() + "  from " + in.getText());
	   }
	   return cm;
   }
   
   /*public ClassList generateSynTree(String[] lines, String fromFile, int startClass, boolean extractTests)
   {
      ClassList testProgram = new ClassList();
      ClassInfo currentClass = null;
      MethodInfo currentMethod = null;
      int blockType = 1;  // class = 2, method = 3
      //code block depth
      int classDepth = 0;
      int methodDepth = 0;
      int depth = 0;
      String line;
      int classNo = startClass;
      //load the file
      //String[] lines = loadFile(fileName);
      
      //find classes, variables, and methods in each code line 
      for(int i = 0; i < lines.length; i++)
      {
         line = lines[i].trim();
         
         //line = WhiteboxUtils.removeComments(line);
         if(beginsCommentBlock(line))
         {
            blockType = blockType * -1;
         }
         
         if(endsCommentBlock(line) && blockType < 0)
         {
            blockType = blockType * -1;
            line = WhiteboxUtils.endTailComment(line);
         }
         if(blockType < 0)
        	 continue;
         line = WhiteboxUtils.removeNonCode(line, true);
         if(isClassDecl(line))
         {
            ClassInfo newClass = new ClassInfo(line, i, fromFile, classNo);
            testProgram.add(newClass);
            currentClass = newClass;
            blockType = 2;
            classDepth = depth;
            classNo++;
            //System.out.println("Class: LineNo: " + i + ":" + line);
         }
         else if(blockType == 2 && isVarDecl(line))
         {
            VarInfo var = new VarInfo(line, i, currentClass.classIndex);
            currentClass.vars.add(var);
         }
         else if(blockType == 2 && isConstrDecl(line, currentClass.className))
         {
            String lne = groupMethodLine(lines, i);
            MethodInfo mInfo = new MethodInfo(lne, i, currentClass.className, currentClass.classIndex);
            currentMethod = mInfo;
            currentClass.methods.add(mInfo);
            blockType = 3;
            methodDepth = depth;
            //System.out.println("md:" + methodDepth);
         }
         else if(blockType == 2 && isMethodDecl(line))
         {
            String lne = groupMethodLine(lines, i);
            MethodInfo mInfo = new MethodInfo(lne, i, null, currentClass.classIndex);
            currentMethod = mInfo;
            currentClass.methods.add(mInfo);
            blockType = 3;
            methodDepth = depth;
            //System.out.println("md:" + methodDepth);
         }
         if(beginsBlock(line))
         {
            depth++;
            //System.out.println("BB:" + i + ":" + depth);
         }
         if(endsBlock(line))
         {
            depth--;
            //System.out.println("EB:" + i + ":" + depth);
            if(depth == classDepth)
            {
               currentClass.end(i);
               currentClass = testProgram.findLastOpenClass();
               blockType = 2;
               classDepth--;
               if(classDepth == -1)
            	   blockType = 1;
            }
            else if(depth == methodDepth)
            {
               currentMethod.end(i);
               int s = currentMethod.startLine;
               int e = currentMethod.endLine;
               int len = e - s;
               String[] theMethod = new String[len + 1];
               for(int k = 0; k <= len; k++)
                  theMethod[k] = lines[s + k];
               currentMethod.setLines(theMethod);
               /*if(extractTests)
               {
            	   currentMethod.extractTests();
            	   System.out.println(currentMethod.name + ":" + currentMethod.tests.size());
               }
               blockType = 2;
            }   
         }
      }
      return testProgram;
   }*/
   
   private String groupMethodLine(String[] lines, int lineNo)
   {
      int i = 0;
      String rtnVal = "";
      while(lines[lineNo + i].indexOf(')') < 0)
      {
         rtnVal += lines[lineNo + i];
         i++;
      }
      rtnVal += lines[lineNo + i];
      return rtnVal;
   }
   
   public ClassList findAssertionsAndTests(ClassList prog)
   {
      for(int j = 0; j < prog.size(); j++)
      {
         ClassInfo c = prog.getClass(j);
         for(int k = 0; k < c.methods.size(); k++)
         {
            MethodInfo currentMethod = c.methods.getMethod(k);
            
            for(int i = 0; i < currentMethod.tests.size(); i++)
            {
            	TestInfo ti = currentMethod.tests.getTest(i);
            	ti.setAssocMethod(currentMethod);
            	String[] lines = ti.getTestLines();
            	for(int l = 0; l < lines.length; l++)
            	{
            		if(yieldsAssertion(lines[l], prog))
            			ti.asserts.addAssertion(new AssertionInfo(lines[l], currentMethod.startLine + l, prog));
            			
            	}
            }
         }
      }
      
      return prog;
   }
      
   /*public void generateTests(String fileName, int startClass, boolean genTests)
   {
      String[] lines = loadFile(fileName);
      System.out.println("Getting syntax tree...");
      ClassList allClasses = generateSynTree(lines, fileName, startClass, genTests);
      System.out.println("Finding tests....");
      testProgram = allClasses;
      if(genTests)
      {
    	  allClasses = findAssertionsAndTests(allClasses);
    	  System.out.println("Dumping tests....");
    	  testOutput = dumpTests(allClasses);
    	  testProgram = allClasses;
    	  String file0 = fileName.substring(0, fileName.indexOf("."));
    	  saveTests(file0 + "_test.wbt");
      }
      else
      {
      	testOutput = "";
      	for(int i = 0; i < lines.length; i++)
      		testOutput += lines[i] + "\n";
      }
   }*/
   
   public void saveTests(String outputFileName)
   {	  
	   String testManifest = getTestManifest(testProgram);
	   String manFilename = outputFileName.substring(0, outputFileName.indexOf(".")) + ".wbm";      
	   System.out.println("Saving tests to " + outputFileName + "...");
	   outputFile(testOutput, outputFileName);
	   System.out.println("Saving test mainifest to " + manFilename + "....");
	   outputFile(testManifest, manFilename);
   }
   
   public ClassList getClassList()
   {
      return testProgram;
   }
   
   /*public ClassList getSyntaxTree(String filename, int startClassIndex)
   {
      String lines[] = loadFile(filename);
      return generateSynTree(lines, filename, startClassIndex, true);
      
   }*/
   
   private String getStoredTestFunction(int line, String[] testOutput)
   {
   	String rtnVal = new String();
   	int i = line;
   	int depth = 0;
   	while(true)
   	{
   		rtnVal += testOutput[i] + "\n";
			if(rtnVal.contains("{"))
   		{
   			for(int j = 0; j < testOutput[i].length(); j++)
   			{
   				if(testOutput[i].charAt(j) == '{')
   					depth++;
   				else if(testOutput[i].charAt(j) == '}')
   					depth--;
   			}
   			if(depth == 0)
   				break;
   		}
			i++;
   	}
   	return rtnVal;
   }
     
   public String getClassMockSetup(ClassInfo ci, String manifestFN)
   {
   	String[] manifest = WhiteboxUtils.loadFile(manifestFN);
   	String testFN = manifest[0];
   	String[] testOutput = WhiteboxUtils.loadFile(testFN);
   	int classLine = 0;
   	String rtnVal = new String();
   	for(int i = 0; i < manifest.length; i++)
   	{
   		if(manifest[i].contains("ClassInfo:" + ci.className))
   		{
   			classLine = i;  //something in the manifest file
   		}
   	}
   	return getStoredTestFunction(classLine, testOutput);
   }
   
   private void addlTestInfo(String testFunction, TestInfo in)
   {
   	
   }
   
   public void addStoredTestInfo(ClassList cl, String manifestFN)
   {
      //String lines[] = testOutput.split("\n");
      
      //System.out.println("Getting test syntax tree from test output...");
      //ClassList cl = generateSynTree(lines, "", startClassIndex, false);
      System.out.println("Clist Size:" + cl.size());
      for(int i = 0; i < cl.size(); i++)
      {
      	ClassInfo ci = cl.getClass(i);
      	System.out.println("CName:" + ci.className + " nMethods:" + ci.methods.size());
      }
      String[] manifest = WhiteboxUtils.loadFile(manifestFN);
      String[] testOutput = null;
      System.out.println("Loaded manifest " + manifestFN);
      int classNo = -1;
      int methNo = 0;
      int testMethNo = 0;
      int nMethods = 0;
      int pathNo = 0;
      //String paths[] = null;
      ClassInfo ci = null;
      MethodInfo mi = null;
      System.out.println("Manifest contains:" + manifest.length + " items.");
      for(int i = 0; i < manifest.length; i++)
      {
    	  String man = manifest[i].trim();
    	  System.out.println(man);
    	  if(man.startsWith("Class:"))
    	  {
    		  //classNo++;
    		  //ci = cl.getClass(classNo);
    		  methNo = 0;
    		  testMethNo = 0;
    		  String[] classAll = man.split(":");
    		  String cName = classAll[1];
    		  ci = cl.findClassWithName(cName);
    		  if(ci == null) //the class was deleted so move forward in the manifest to the next class
    		  {
    			  do
    			  {
    				  i++;
    				  if(i == manifest.length)
    					  return;
    				  else if(manifest[i].trim().startsWith("Class:"))
    				  {
    					  i--;
    					  break;
    				  }
    			  }while(true);
    		  }
    		  String nmeth = classAll[2];
    		  int mockSetupLine = Integer.parseInt(classAll[3]);
    		  String testOutputFile = classAll[4];
    		  //int qtLine = Integer.parseInt(classAll[5]);
    		  testOutput = WhiteboxUtils.loadFile(testOutputFile);
    		  nMethods = Integer.parseInt(nmeth);
    		  ci.mockSetup = getStoredTestFunction(mockSetupLine, testOutput);
    		  //ci.resetQt(qtLine, true);
    		  //System.out.println(man + "|methodsInClass:" + nMethods + " totalMethods:" + cl.getClass(classNo).methods.size());
    	  }
    	  else if(man.startsWith("Method:"))
    	  {
    		  //method: keep it with the class and note how many tests there are
    		  String meth[] = man.split(":");
    		  String sig = meth[1];
    		  String nTests = meth[2];
   		  int nt = Integer.parseInt(nTests);
    		  mi = ci.methods.getMethodWithSignature(sig);
    		  if(mi == null)  //the method was deleted so move forward to the next method
    			  i += nt;
    		  //paths = mi.getAllPaths(mi.lines);
    		  else
    		  {
	    		  mi.complexity = nt;
	    		  methNo++;
	    		  pathNo = 0;
    		  }
    		  //System.out.println(man + "|classNo:" + classNo + " methodNo:" + methNo + " plen:" + paths.length);
    		  //System.out.println(" Found:" + mi.name);
    	  }
    	  else if(man.startsWith("Test:"))
    	  {
    		  //test method: make a TestInfo from the method and remove the method from the class
    		  //System.out.println(man + "|classNo:" + classNo + " testMethNo:" + testMethNo);
    		  //MethodInfo testMI = cl.getClass(classNo).methods.getMethod(testMethNo + nMethods);
    		  //System.out.println(" Found:" + testMI.name);
    		  String[] testAll = man.split(":");
    		  String testName = testAll[1];
    		  String commentName = testAll[2];
    		  int idx = Integer.parseInt(testAll[3]);
    		  int testMethodLine = Integer.parseInt(testAll[4]);
    		  //int nClasses = Integer.parseInt(testAll[5]);
    		  int nLineInputs = Integer.parseInt(testAll[5]);
    		  //String cn = man.substring(man.lastIndexOf(":"), man.length());
    		  TestInfo ti = new TestInfo();
    		  ti.name = testName;
    		  ti.commentName = commentName;
    		  ti.testIndex = idx;
    		  //ti.addlClassSetup = new String[nClasses];
    		  ti.lineInputs = new VarInfo[nLineInputs];
    		  ti.params = new VarInfo[mi.params.size()];
    		  ti.inputValues = new String[ti.lineInputs.length + ti.params.length];
    		  String testMethod = getStoredTestFunction(testMethodLine, testOutput);
    		  //System.out.println(mi.getMethodSignature() + " reading test no:" + ti.testIndex);
    		  ti.gatherTestInfo(testMethod, mi, cl, nLineInputs);
    		  //TestInfo ti = new TestInfo(testMI, cn);
    		  ti.setAssocMethod(mi);
    		  //ti.testLines = paths[pathNo].split("\n");
    		  mi.tests.add(ti);
    		  
    		  testMethNo++;
    		  pathNo++;
    	  }
      }
      //return cl;
   }
   
   public String[] loadFile(String fileName)
   {
      String[] rtnVal = null;
      BufferedReader br;
      try
      {
         FileReader fr = new FileReader(fileName);
         br = new BufferedReader(fr);
         LinkedList strList = new LinkedList();
         String s;
         while(true)
         {
            s = br.readLine();
            if(s != null)
            {
               strList.add(s);
            }
            else
               break;
         }
         rtnVal = new String[strList.size()];
         for(int i = 0; i < strList.size(); i++)
            rtnVal[i] = (String) strList.get(i);
         br.close();
      }
      catch(IOException ex)
      {
         System.err.println(ex.getMessage());
         ex.printStackTrace();
      }
      return rtnVal;
   }
   
   public String dumpTests(ClassList allClasses)
   {
      String out = "";
      for(int i = 0; i < allClasses.size(); i++)
      {
         ClassInfo ci = allClasses.getClass(i);
         //out += "\n[TestFixture]\n";
         out += "class " + allClasses.getClass(i).className + "Tests\n";
         out += "{\n";
         int ctorCount = 0;
         //int methCount = 0;
         for(int j = 0; j < ci.vars.size(); j++)
         {
        	 VarInfo vi = ci.vars.getVar(j);
        	 out += "   " + vi.getType() + " " + vi.getName() + ";\n";
         }
         out += "\n";
         for(int j = 0; j < ci.methods.size(); j++)
         {
        	 MethodInfo mi = ci.methods.getMethod(j);
        	 out += mi.getTestFirstLine() + "\n";
        	 /*for(int k = 1; k < mi.lines.length; k++)
        		 out += mi.lines[k] + "\n";*/
        	 out += mi.allLines.outputWTDepth("   ", false);
        	 out += "\n";
         }
         for(int j = 0; j < ci.methods.size(); j++)
         {
            MethodInfo mi = ci.methods.getMethod(j);
            String mStr = "";
            if(mi.returnType.getType().equals("ctor"))
            {
               ctorCount++;
               mStr = "Ctor" + ctorCount;
            }
            else
            {
            	int mc = ci.methods.countMethodsWithName(mi);
            	mStr = "Meth" + mc;
            }
            /*if(mi.tests.size() <= 1)
            {
               out += generateTest(-1, mi, mStr);
            }
            else
            {*/
               for(int k = 0; k < mi.tests.size(); k++)
               {
            	  TestInfo ti = mi.tests.getTest(k);
            	  String tst = generateTest(k, mi, mStr);
            	  ti.setTestCode(tst);
                  out += tst;
               }
            //}
         }
         out += "}\n";
      }
      return out;
   }
   
   public String getTestManifest(ClassList cl)
   {
	   String out = "";
	   for(int i = 0; i < cl.size(); i++)
	   {
	      ClassInfo ci = cl.getClass(i);
	      out += "Class:" + ci.className + ":" + ci.methods.size() + " methods\n";
	      for(int j = 0; j < ci.methods.size(); j++)
	      {
	         MethodInfo mi = ci.methods.getMethod(j);
	         out += "   Method:" + mi.name + ":" + mi.tests.size() + " tests\n";
	         for(int k = 0; k < mi.tests.size(); k++)
	         {
	        	 TestInfo ti = mi.tests.getTest(k);
	        	 out += "      Test:" + ti.name + ":" + ti.getCommentName() + "\n";
	         }
	      }
	   }
	   return out; 
   }
   
   public String generateTest(int testNo, MethodInfo mi, String methName)
   {
      String out = "";
      //out += "   [Test]\n";
      out += "   public void " + mi.name + "Test" + methName; 
      //AssertionList al = mi.asserts;
      //if(testNo != -1)
      //{
         out += "_" + testNo;
         AssertionList al = mi.tests.getTest(testNo).asserts;
      //}
      out += "()\n";
      out += "   {\n";
      String tab = "   ";
      LinkedList classes = new LinkedList();
      for(int i = 0; i < al.size(); i++)
      {
         AssertionInfo a = al.getAssertion(i);
         
         if(a.fromClass != "")
         {
            boolean found = false;
            for(int j = 0; j < classes.size(); j++)
            {
               String str = (String) classes.get(j);
               if(a.fromClass.equals(str))
               {
                  found = true;
                  break;
               }
            }
            if(!found) 
            {
               if(methName.startsWith("Meth"))
                  out += tab + tab + a.fromClass + " testClass" + classes.size() + " = new " + a.fromClass + "Test();\n";
               classes.add(a.fromClass);
            }
         }
         
      }
      if(al.size() > 0)
      {
         if(al.hasReturnAssertion())
            out += tab + tab + mi.returnType.getType() + " rtnVal = " + mi.name;
         else if(!methName.startsWith("Meth"))
         {
            String ucFirst = mi.name;
            char c = mi.name.charAt(0);
            c = Character.toUpperCase(c);
            ucFirst = c + ucFirst.substring(1, ucFirst.length());
            out += tab + tab + ucFirst + "Tests testClass = new " + ucFirst + "Tests";
         }
            
         else
            out += tab + tab + mi.name;
         out += "(";
         for(int i = 0; i < mi.params.size(); i++)
            out += i;
         out += ");\n";
      }
      boolean returnFound = false;
      for(int i = 0; i < al.size(); i++)
      {
         AssertionInfo a = al.getAssertion(i);
         if(a.isReturn && !returnFound)
         {
            out += tab + tab + "assert.areEqual(rtnVal,\"\");\n";
            returnFound = true;
         }
         else if(a.isReturn && returnFound)
            continue;
         else
         {
            out += tab + tab + "assert.areEqual(testClass";
            String[] dots = a.dataType.getName().split("\\.");
            for(int j = 0; j < classes.size(); j++)
            {
               String str = (String) classes.get(j);
               if(a.fromClass.equals(str))
               {
                  if(methName.startsWith("Meth"))
                     out += j;
                  if(dots.length == 1)
                     out += "." + dots[0];
                  else
                  {
                     for(int k = 1; k < dots.length; k++)
                        out += "." + dots[k];
                  }
                  break;
               }
            }
            out += ",\"\");\n";
         }
      }
         
      out += "   }\n";
      return out;
   }
   
   public void outputFile(String in, String outputFN)
   {
      try
      {
         FileWriter fw = new FileWriter(outputFN);
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write(in + "\n");
         bw.close();
      }
      catch(IOException ex)
      {
         ex.printStackTrace();
      }
   }
   
   private boolean isClassDecl(String in)
   {
      if(in.startsWith("class ") || in.indexOf(" class ") > -1)
      {
         return(true);
      }
      return(false);
   }
   
   private boolean isMethodDecl(String in)
   {
      String temp = in;
      temp = WhiteboxUtils.removeAccessModifiers(temp);
      String paramList = "";
      //System.out.println("Checking for Method: temp is:" + temp);
      try
      {
         paramList = temp.substring(temp.indexOf("("), temp.length());
      }
      catch(StringIndexOutOfBoundsException ex)
      {
         //System.out.println("Failed to find ()");
         return false;
      }
      //System.out.println("ParamList is:" + paramList);
      //System.out.println("Temp is:" + temp);
      temp = temp.substring(0, temp.indexOf(paramList));
      
      //System.out.println("Temp is:" + temp);
      if(temp.split(" ").length == 2 && paramList.length() > 0)
         return true;
      else
         return false;
   }
   
   private boolean isConstrDecl(String in, String className)
   {
      String temp = in;
      temp = WhiteboxUtils.removeAccessModifiers(temp);
      String paramList = "";
      try
      {
         paramList = temp.substring(temp.indexOf("("), temp.length());
      }
      catch(StringIndexOutOfBoundsException ex)
      {
         return false;
      }
      temp = temp.substring(0, temp.indexOf(paramList));
      
      //System.out.println("Temp is:" + temp);
      if(temp.equals(className) && paramList.length() > 0)
         return true;
      else
         return false;
   }
   
   private boolean isVarDecl(String in)
   {
      String temp = in;
      try
      {
         temp = in.substring(0, in.indexOf(';'));
         temp = in.substring(0, in.indexOf('='));
      }
      catch(StringIndexOutOfBoundsException ex)
      {}
      if(temp.indexOf('(') > -1)
         return false;
      temp = WhiteboxUtils.removeAccessModifiers(temp);
      if(temp.split(" ").length == 2)
         return true;
      else
         return false;
   }
   
   private boolean beginsBlock(String in)
   {
      if(in.trim().indexOf("{") >= 0)
         return true;
      else
         return false;
   }
   
   private boolean endsBlock(String in)
   {
      if(in.trim().indexOf("}") >= 0)
         return true;
      else
         return false;
   }
   
   private boolean beginsCommentBlock(String in)
   {
      if(in.trim().startsWith("/*"))
      {
         return true;
      }
      return false;
   }
   
   private boolean containsCommentBlock(String in)
   {
      if(WhiteboxUtils.removeStrings(in, false).indexOf("/*") > -1)
      {
         return true;
      }   
      return false;
   }
   
   private boolean endsCommentBlock(String in)
   {
      if(WhiteboxUtils.removeStrings(in, false).indexOf("*/") > -1)
      {
         return true;
      }   
      return false;
   }
   
   private boolean yieldsAssertion(String line, ClassList progTree)
   {
      //System.out.println("Checking line:" + line);
      line = line.trim();
      if(line.equals(""))
         return false;
      if(line.startsWith("return"))
         return true;
      String[] equ = line.split("=");
      if(equ[0].split(" ").length > 1)
         return false;
      else
      {
         String[] dots = equ[0].split("\\.");
         String lastSection;
         if(dots.length == 0)
            lastSection = equ[0];
         else
            lastSection = dots[dots.length - 1];
         lastSection = lastSection.trim();
         if(lastSection.indexOf('(') > 0)
            return false;
         for(int i = 0; i < progTree.size(); i++)
         {
            ClassInfo ci = progTree.getClass(i);
            VarList vl = ci.vars;
            for(int j = 0; j < vl.size(); j++)
            {
               if(vl.getVar(j).getName().equals(lastSection))
                  return true;
            }
         }
      }
      return false;
   }
   
   private boolean yieldsNewTest(String line, ClassList progTree)
   {
      return false;
   }
   
   /*private LinkedList getCodePaths(String[] meth)
   {
	  LinkedList rtnVal = new LinkedList();
	  int pathNo = 0;
	  //int ifBranch = 0;
	  for(int i = 0; i < meth.length; i++)
	  {
		 String line = meth[i];
		 line = line.trim();
		 line = WhiteboxUtils.removeStrings(line);
		 line = WhiteboxUtils.removeComments(line);
		 if(line.indexOf("if(") == 0 || line.indexOf(" if(") > 0)
		 {
		    String newPath = new String((String) rtnVal.get(rtnVal.size()));
		    pathNo++;
		    //ifBranch++;
		 }
		 if()
		 //if()
		 for(int j = pathNo; j < rtnVal.size(); j++)
		 {
			 String path = (String) rtnVal.get(j);
			 path += line;
		 }
	  }
	  return rtnVal;
   }*/
   
   
   public ParseTree antlrPass(String in) throws IOException, RecognitionException
   {
	   ANTLRInputStream antlrIn = new ANTLRInputStream(new FileInputStream(in));
	   JavaLexer lexer = new JavaLexer(antlrIn);
	   CommonTokenStream tokens = new CommonTokenStream(lexer);
	   ParseTreeBuilder builder = new ParseTreeBuilder("compilationUnit");
	   JavaParser parser = new JavaParser(tokens, builder);
	   /*JavaPTreeParser.compilationUnit_return r = */parser.compilationUnit();
	   
	   ParseTree t = builder.getTree();
	   return t;
	   /*walkParseTree(t);
	   
	   System.out.println(t.toStringTree());
	   pruneParseTree(t);*/
	   //System.out.println(t.toStringTree());
	   //CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
	   //Eval walker = new Eval(nodes);   
   }
   
   /*private void pruneParseTree(ParseTree t)
   {
	   int treeNodes = t.getChildCount();
	   int start = -1; 
	   int end = 0;
	   for(int i = 0; i < treeNodes; i++)
	   {
		   ParseTree node = (ParseTree) t.getChild(i);
		   if(node != null)
		   {
		      pruneParseTree(node);
		      if(i > 0)
		      {
		    	  ParseTree n2 = (ParseTree) t.getChild(i - 1);
				  if(n2 != null)
				  {
					  int x1 = node.getTokenStartIndex();
					  int x2 = node.getTokenStopIndex();
					  int y1 = n2.getTokenStartIndex();
					  int y2 = n2.getTokenStopIndex();
					  if(x1 == y1 && x2 == y2)
						 t.deleteChild(i - 1);
				  }
		      }
		      if(node.payload.getClass().getName().equals("org.antlr.runtime.CommonToken"))
		      {
		    	  CommonToken ct = (CommonToken) node.payload;
		    	  if(start == -1 || start > ct.getStartIndex())
		    		  start = ct.getStartIndex();
		    	  if(end < ct.getStopIndex())
		    		  end = ct.getStopIndex();
		    	  System.out.println(" S: " + start + " E: " + end);
		      }
		   }
	   }
	   if(t.payload.getClass().getName().equals("java.lang.String"))
	   {
		   t.setTokenStartIndex(start);  //these functions do nothing - joy
		   t.setTokenStopIndex(end);
		   System.out.println("Token " + ((String) t.payload) + " SI=" + t.getTokenStartIndex() + " EI=" + t.getTokenStopIndex());
	   }
   }*/
   
   private void walkParseTree(ParseTree t)
   {
	  int treeNodes = t.getChildCount();
	  for(int j = 0; j < treeNodes; j++)
	  {
		   ParseTree node = (ParseTree) t.getChild(j);
		   String[] strs = new String[7];
		   String[] strs2 = {"NodeType:", "LineNo:", "Pos:", "Start:", "Stop:", "Text:", "Numeric type:"};
		   strs[5] = new String(node.getText());
		   strs[0] = new String(node.payload.getClass().getName());
		   if(strs[0].equals("org.antlr.runtime.CommonToken"))
		   {
			   CommonToken ct = (CommonToken) node.payload;
			   strs[1] = new String(String.valueOf(ct.getLine()));
			   strs[2] = new String(String.valueOf(ct.getCharPositionInLine()));
			   strs[3] = new String(String.valueOf(ct.getStartIndex()));
			   strs[4] = new String(String.valueOf(ct.getStopIndex()));
		   }
		   else
		   {
			   strs[1] = "0";
			   strs[2] = "0";
			   strs[3] = "0";
			   strs[4] = "0";
		   }
		   strs[6] = new String(String.valueOf(node.getType()));
		   for(int i = 0; i < strs.length; i++)
			   System.out.println(strs2[i] + strs[i]);
		   System.out.println("=============================");
		   walkParseTree(node);
	   }
   }
   
   public void antlrGenSynTree(String filename)
   {
   	try
      {
   		//used = max - total - free
   		long used1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
   		//long x = Runtime.getRuntime().freeMemory();
    	   ParseTree tree = antlrPass(filename);
    	   long used2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    	   System.out.println("ParseTree uses " + (used2 - used1) + " bytes.");
    	   ClassList lst = generateSynTree(tree, "JavaGT.txt", filename, new Integer(0));
    	   System.out.println("Completed information extraction.");
    	   for(int i = 0; i < lst.size(); i++)
    	   {
    	   	ClassInfo ci = lst.getClass(i);
    	   	ci.loadMethodText();
    	   }
    	   testProgram = lst;
    	   tree = null;
    	   Runtime.getRuntime().gc();
    	   long y = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
   	   System.out.println(filename + ": This pass used " + (y - used1) + " bytes. Free memory: " + Runtime.getRuntime().freeMemory() + " bytes.");
    	   //lst.output();
      }
      catch(IOException ioe)
      {
    	   System.out.println("Error loading " + filename);
      }
      catch(RecognitionException e)
      {
    	   e.printStackTrace();
    	   //System.out.println(e.getStackTrace());
    	   System.out.println(e.getMessage());
      }
      
   }
   
   public void genParsedTests(String outFileDump)
   {
      String allTrees = "";
   	for(int i = 0; i < testProgram.size(); i++)
      {
      	ClassInfo ci = testProgram.getClass(i);
      	for(int j = 0; j < ci.methods.size(); j++)
      	{
      		MethodInfo mi = ci.methods.getMethod(j);
      		allTrees += mi.extractParsedTests(testProgram);
      	}
      }
   	if(outFileDump != null)
   	{
   		try 
         {
            BufferedWriter out = new BufferedWriter(new FileWriter(outFileDump));
            out.write(allTrees);
            out.close();
         }
   		catch(Exception ex){}
   	}
   	//at this point the tests are in testProgram 
   }
   
   public static void main(String args[])
   {
      WhiteboxProgram wb = new WhiteboxProgram();
      
      //wb.generateTests(args[0], args[1], 0);
      //String[] in = WhiteboxUtils.loadFile(args[0]);
      //WhiteboxProgram wb = new WhiteboxProgram();
      //String[] out = wb.getAllPaths(in);
      try
      {
      	
    	   ParseTree tree = wb.antlrPass(args[0]);
    	   ClassList lst = wb.generateSynTree(tree, "JavaGT.txt", args[0], new Integer(0));
    	   wb.testProgram = lst;
    	   
    	   //lst.output();
      }
      catch(IOException ioe)
      {
    	   System.out.println("Error loading " + args[0]);
      }
      catch(RecognitionException e)
      {
    	   e.printStackTrace();
    	   //System.out.println(e.getStackTrace());
    	   System.out.println(e.getMessage());
      }
      for(int i = 0; i < wb.testProgram.size(); i++)
      {
      	ClassInfo ci = wb.testProgram.getClass(i);
      	for(int j = 0; j < ci.methods.size(); j++)
      	{
      		MethodInfo mi = ci.methods.getMethod(j);
      		mi.extractParsedTests(wb.testProgram);
      	}
      }
      /*MethodInfo mi = new MethodInfo(in[0], 0, "", 0);
      String[] out = mi.getAllPaths(in);
      for(int i = 0; i < out.length; i++)
      {
    	  System.out.println(out[i]);
    	  System.out.println("=========================");
      }
      System.out.println(out.length + " total tests.");*/
   }
}

class RefInt
{
	int value;

	public RefInt(int val)
	{
		value = val;
	}
	
	public int getValue() 
	{
		return value;
	}

	public void setValue(int value) 
	{
		this.value = value;
	}
	
	public void increment()
	{
		value++;
	}
	
	public void decrement()
	{
		value--;
	}
}

