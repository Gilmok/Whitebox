import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class ClassInfo extends CodeMember
{
   String className;
   String mods;
   String fromFile;
   String extendsClass;
   VarList vars;
   MethodList methods;
   int startLine;
   int endLine;
   int classIndex;
   PreambleList imports;
   String mockSetup;
   String impl;
   private int qtInsertionPoint;
   private int qtLen;
   
   private void otherSetup()
   {
   	mockSetup = "   public void mockSetup()\n   {\n\n\n   }\n";
   }

   ClassInfo(String in, int lineNo, String fromFile, int ci)
   {
      startLine = lineNo;
      this.fromFile = fromFile;
      endLine = -1;
      classIndex = ci;
      
      //access = WhiteboxUtils.getAccessLevel(in);
      in = WhiteboxUtils.removeAccessModifiers(in);
      className = in.substring(in.indexOf("class ") + 6);
//    get rid of "extends..."
      if(className.indexOf(" ") > 0)
         className = className.substring(0, className.indexOf(" ")); 
      vars = new VarList();
      methods = new MethodList(classIndex);
      otherSetup();
   }

   public void end(int lineNo)
   {
      endLine = lineNo;
   }

   ClassInfo copyClass()
   {
      ClassInfo newClassInfo = new ClassInfo("class " + className, 0, fromFile, classIndex);
      for(int i = 0; i < vars.size(); i++)
      {
         newClassInfo.vars.add(vars.get(i));
      }
      for(int i = 0; i < methods.size(); i++)
      {
         newClassInfo.methods.add(methods.get(i));
      }
      return newClassInfo;
   }

   public void addToTree(ClassList list, TreeStatus info, LinkedList nodeList) 
   {
	   info.setCurrentClass(this);
	   list.add(this);
	   imports = info.getPreambles();
   }   
   
   //class info for static declarations
   public ClassInfo()
   {
   	methods = new MethodList(-1);
   	vars = new VarList();
   	otherSetup();
   }
   
   /*
    * NomalClassDeclaration:
    *  'class' ID (typeParameters)? ('extends' type)? ('implements' typeList)? classBody
    * type: 
    *  Identifier (typeArguments)? ('.' Identifier (typeArguments)? )* ('[' ']')*
	 *  |	primitiveType ('[' ']')*
	 * typeList:
	 *  type (',' type)*
	 * typeParameters:
	 *  < typeParam (, typeParam)* >
	 * typeParam:
	 *  ID ('extends' bound)?
	 * bound:
	 *  type ('&' type)* 
    */
   public ClassInfo(ParseTree in, ParseTree xx, String fromFile, Integer ci)
   {
   	/*
   	 * className, access, fromFile, vars, methods, startLine, endLine, classIndex, imports
   	 */
   	
   	mods = VarInfo.processModifiers(xx);
   	ParseTree info = null;
   	extendsClass = "";
   	impl = "";
   	info = (ParseTree) in.getChild(1);
		className = info.getText();
		int i = 2;
		this.fromFile = fromFile;
		while(i < in.getChildCount())
		{
			info = (ParseTree) in.getChild(i);
			String txt = info.getText();
			if(txt.equals("extends"))
			{
				info = (ParseTree) in.getChild(i + 1);
				extendsClass = getTypeName(info);
				i += 2;
			}
			else if(txt.equals("implements"))
			{
				info = (ParseTree) in.getChild(i + 1);
				//System.out.println("IMPLEMENTS:" + info.getChildCount());
				ParseTree info2 = null;
				int j = 0;
				while(j < info.getChildCount())
				{
					info2 = (ParseTree) info.getChild(j);
					//System.out.println(info2.getText());
					if(info2.getText().equals(","))
						impl += ", ";
					else
						impl += getTypeName(info2);
					j++;
				}
				i += 2;
			}
			else
				i++;
		}
   	classIndex = ci.intValue();
   	vars = new VarList();
   	methods = new MethodList(classIndex);
   	imports = new PreambleList();
   	otherSetup();
   }
   
   public static String getTypeName(ParseTree in)
   {
   	String rtnVal = "";
   	ParseTree info = null;
   	int i = 0;
   	while(i < in.getChildCount())
   	{
   		info = (ParseTree) in.getChild(i); //id or primitive
   		if(info.getText().equals("primitiveType"))
   			rtnVal += ((ParseTree) info.getChild(0)).getText();
   		else
   		   rtnVal += info.getText();
   		i++;
   		info = (ParseTree) in.getChild(i);
      	if(info == null)
      		break;
      	else if(info.getText().equals("TypeArguments"))
      	{
      		rtnVal += "<" + getTypeName((ParseTree) info.getChild(1)) + ">"; //< TypeArgs >
      		i++;
      	}
   		else if(info.getText().startsWith("["))
   			break;
   		else  //"."
   		{
   			rtnVal += info.getText();
   			i++;
   		}
   	}
   	while(i < in.getChildCount())
   	{
   		info = (ParseTree) in.getChild(i); //"[]" chain
   		rtnVal += info.getText();
   		i++;
   	}
   	
   	return rtnVal;
   }
   
   //put this function only in existing try blocks for loading and parsing files
   public void loadMethodText() throws IOException
   {
   	FileReader fr = new FileReader(fromFile);
   	BufferedReader br = new BufferedReader(fr);
   	int pos = 0;
   	for(int i = 0; i < methods.size(); i++)
   	{
   		MethodInfo mi = methods.getMethod(i);
   		mi.methodText = "";
   		int s =  mi.mti.startChar;
   		int e =  mi.mti.endChar;
   		//System.out.println("loadMethodText: S=" + s);
   		//System.out.println("loadMethodText: E=" + e);
   		
   		int len = e - s;
   		br.skip(s - pos);
   		pos = s;
   		for(int j = 0; j <= len; j++)
   		{
   			mi.methodText += (char) br.read();
   			pos++;
   		}
   		//this is a hack but it will do for now
   		/*if(mi.methodText.startsWith("("))
   		{
   			String tpe = mi.returnType.getType() + " ";
   			if(tpe.equals("ctor "))
   				tpe = "";
   			mi.methodText = mi.modifiers + tpe + mi.name + mi.methodText;
   		}*/
   		mi.methodText = "   " + mi.methodText;
   		//System.out.println(mi.methodText);
   		//br.reset();
   	}
   }
   
   public String getClassOpen(String tab, boolean asQT)
   {
   	String rtnVal = mods;
   	rtnVal += "class " + className;
   	//if(asQT)
   		//rtnVal += "_QT";
   	if(!extendsClass.isEmpty())
   		rtnVal += " extends " + extendsClass;
   	if(!impl.isEmpty())
   		rtnVal += " implements " + impl;
   	rtnVal += "\n";
   	rtnVal += "{\n";
   	rtnVal += vars.publicList(tab) + "\n";
    	return rtnVal;
   }
   
   public String getClassTestName()
   {
   	return className + "Test";
   }
   
   public String getQTClassName()
   {
   	return className + "_WBQT";
   }
   
   public void replaceQt(String fx, String testDir)
   {
   	WhiteboxUtils.chDir(testDir);
   	String testFile = getClassTestName() + ".java";
   	String[] tst = WhiteboxUtils.loadFile(testFile);
   	String[] newFX = fx.split("\n");
   	String[] newTF = new String[tst.length  - qtLen + newFX.length];
   	int len = 0;
   	for(int i = 0; i < qtInsertionPoint; i++)
   	{
   		newTF[len] = tst[i];
   		len++;
   	}
   	for(int i = 0; i < newFX.length; i++)
   	{
   		newTF[len] = newFX[i];
   		len++;
   	}
   	for(int i = qtInsertionPoint + qtLen; i < tst.length; i++)
   	{
   		newTF[len] = tst[i];
   		len++;
   	}
   	WhiteboxUtils.writeFile(testFile, newTF);
   	qtLen = newFX.length;
   }
   
   public void resetQt(int lineNo, boolean softReset)
   {
   	if(softReset && qtInsertionPoint > 0)
   		return;
   	qtInsertionPoint = lineNo;
   	qtLen = 1;
   }
}

class ClassList extends LinkedList
{
	LineList staticContext;
	LangConfig lang;
	
	ClassList()
	{
		super();
		staticContext = new LineList();
		lang = new LangConfig();
	}
	
   public ClassInfo getClass(int index)
   {
      if(index < size())
      {
         return (ClassInfo) super.get(index);
      }
      else
      {
         return null;
      }
   }

   public ClassInfo getFirstClass()
   {
      return (ClassInfo) super.getFirst();
   }

   public ClassInfo getLastClass()
   {
      return (ClassInfo) super.getLast();
   }

   public ClassInfo findLastOpenClass()
   {
      ClassInfo last = null;
      for(int i = 0; i < size(); i++)
      {
         ClassInfo ci = getClass(i);
         if(ci.endLine == -1)
            last = ci;
      }
      return(last);
   }

   public ClassInfo findClassWithLine(int line)
   {
      for(int i = 0; i < size(); i++)
      {
         ClassInfo ci = getClass(i);
         if(ci.startLine < line && ci.endLine > line)
         {
            return ci;
         }
      }
      return null;
   }

   public MethodInfo findMethodWithLine(int line)
   {
      for(int i = 0; i < size(); i++)
      {
         ClassInfo ci = getClass(i);
         if(ci.startLine < line && ci.endLine > line)
         {
            MethodList ml = ci.methods;
            for(int j = 0; j < ml.size(); j++)
            {
               MethodInfo mi = ml.getMethod(j);
               if(mi.startLine < line && mi.endLine > line)
                  return(mi);
            }
         }
      }
      return(null);
   }

   public void save(String filename)
   {
      String outString = "";
      try 
      {
         BufferedWriter out = new BufferedWriter(new FileWriter(filename));
         for(int i = 0; i < size(); i++)
         {
            ClassInfo ci = getClass(i);
            outString += "class " + ci.className + "\n{";
            for(int j = 0; j < ci.vars.size(); j++)
            {
               VarInfo vi = ci.vars.getVar(j);
               outString += "   " + vi.getType() + " " + vi.getName() + ";\n";
            }
            outString += "\n";
            for(int j = 0; j < ci.methods.size(); j++)
            {
               MethodInfo mi = ci.methods.getMethod(j);
               for(int k = 0; k < mi.allLines.size(); k++)
               	outString += mi.allLines.outputWTDepth("   ", false);
               /*for(int k = 0; k < mi.lines.length; k++)
                  outString += "   " + mi.lines[k] + "\n";*/
            }
            outString += "\n";
         }
         out.write(outString);
         out.close();
      } 
      catch (IOException e) 
      {
         System.err.println(e.getMessage());
         System.err.println(e.getStackTrace());
      }
   }

   public MethodInfo findMethodForTest(TestInfo ti)
   {
      //ClassInfo ci = getClass(mi.classIndex);
      //return ci.methods.getMethodForTest(mi.name);
	  return ti.getAssocMethod();
   }

   public ClassInfo findClassWithMethod(MethodInfo mi)
   {
      for(int i = 0; i < size(); i++)
      {
         ClassInfo ci = getClass(i);
         MethodList ml = ci.methods;
         for(int j = 0; j < ml.size(); j++)
         {
            MethodInfo miIn = ml.getMethod(j);
            if(mi == miIn)
               return ci;
         }
      }
      return(null);
   }

   public ClassInfo findClassWithName(String in)
   {
      for(int i = 0; i < size(); i++)
      {
         ClassInfo ci = getClass(i);
         if(ci.className.equals(in))
            return ci;
      }
      return null;
   }
   
   public ClassInfo findClassWithChar(int in)
   {
	   for(int i = 0; i < size(); i++)
	   {
		   ClassInfo ci = getClass(i);
		   if(ci.startChar <= in && ci.endChar > in)
			   return ci;
	   }
	   return null;
   }
   
   public MethodInfo findMethodWithChar(int in)
   {
	   for(int i = 0; i < size(); i++)
	   {
		   ClassInfo ci = getClass(i);
		   if(ci.startChar <= in && ci.endChar > in)
		   {
		   	//System.out.println("Looking for method with char " + in + " in class " + ci.className + " in file " + ci.fromFile);
		   	for(int j = 0; j < ci.methods.size(); j++)
		   	{
		   		MethodInfo mi = ci.methods.getMethod(j);
		   		if(mi.startChar <= in && mi.endChar > in)
		   			return mi;
		   	}
		   }
	   }
	   
	   return null;
   }
   
   public void output()
   {
   	for(int i = 0; i < size(); i++)
   	{
   		ClassInfo ci = getClass(i);
   		System.out.println("CLASS:" + ci.className + " " + "(extends " + ci.extendsClass + ") (implements " + ci.impl + ")" + ci.startChar + " " + ci.endChar);
   		ci.imports.output();
   		ci.vars.output();
   		ci.methods.output();
   	}
   }
   
   public ClassInfo findQtClass(ClassInfo in)
   {
   	int sc = -1;
   	int ec = 0;
   	ClassInfo rtnVal = in;
   	for(int i = 0; i < size(); i++)
   	{
   		ClassInfo ci = getClass(i);
   		if(!in.fromFile.equals(ci.fromFile))
   			continue;
   		if(ci.endChar < in.startChar || ci.startChar > in.endChar)
   			continue;
   		if((ci.startChar < sc || sc == -1) && ci.endChar > ec)
   		{
   			rtnVal = ci;
   			sc = ci.startChar;
   			ec = ci.endChar;
   		}
   	}
   	return rtnVal;
   }
   
   public String[] getQTInstanceChain(ClassInfo origCI)
   {
   	ClassList temp = getQTInstances(origCI, true);
   	String[] rtnVal = new String[2];
   	rtnVal[0] = "";
   	ClassInfo c0 = temp.getClass(0);
   	ClassInfo ci = null;
   	ClassInfo cj = null;
   	for(int i = 0; i < temp.size(); i++)
   	{
   		ci = temp.getClass(i);
   		rtnVal[0] += "      " + c0.getClassTestName();
   		for(int j = 1; j <= i; j++)
   		{
   			cj = temp.getClass(j);
   			rtnVal[0] += "." + cj.getClassTestName();
   		}
   		rtnVal[0] += " c" + i + " = ";
   		if(i > 0)
   		{
   			rtnVal[0] += "c" + (i - 1) + ".";
   			rtnVal[0] += "new " + cj.getClassTestName();
   		}
   		else
   			rtnVal[0] += "new " + c0.getClassTestName();
   		rtnVal[0] += "(";
   		if(i < (temp.size() - 1))
   			rtnVal[0] += ");\n";	
   	}
   	rtnVal[1] = "c" + (temp.size() - 1);
   	return rtnVal;
   }
   
   public ClassList getQTInstances(ClassInfo origCI, boolean excludeInners)
   {
   	ClassList temp = new ClassList();
   	//gather everything in the outer class
   	for(int i = 0; i < size(); i++)
   	{
   		ClassInfo ci = getClass(i);
   		if(!origCI.fromFile.equals(ci.fromFile))
   			continue;
   		if(ci.endChar < origCI.startChar || ci.startChar > origCI.endChar)
   			continue;
   		if(excludeInners && ci.startChar > origCI.startChar && ci.endChar < origCI.endChar)
   			continue;
   		temp.add(ci);
   	}	
   	temp.sort();
   	return temp;
   }
   
   public String outputQTClass(ClassInfo in, String qtFx, ClassInfo origCI)
   {
   	String rtnVal = in.imports.dumpList();
   	rtnVal += outputQTClass(in, this, qtFx, origCI, true);
   	//rtnVal += qtMain + "\n";
   	return rtnVal;
   }
   
   private String outputQTClass(ClassInfo in, ClassList temp, String qtFx, ClassInfo origCI, boolean useQT)
   {
   	//dump the current class
   	String rtnVal = in.getClassOpen("   ", useQT);
   	for(int j = 0; j < in.methods.size(); j++)
		{
			MethodInfo mi = in.methods.getMethod(j);
			//dump the method
			rtnVal += mi.getMethodText() + "\n\n";
		}
   	//if it is the classInfo with the quicktestFunction, dump it
   	if(in == origCI)
   		rtnVal += qtFx + "\n";
   	ClassList cl = new ClassList();
   	
   	//find each class within this class
   	for(int i = 0; i < temp.size(); i++)
   	{
   		ClassInfo ci = getClass(i);
   		if(!in.fromFile.equals(ci.fromFile))
   			continue;
   		if(ci.startChar > in.startChar && ci.endChar < in.endChar)
   			cl.add(ci);
   	}
   	
   	cl.sort();
   	
   	//step into each inner class and do it
   	for(int i = 0; i < cl.size(); i++)
   	{
   		rtnVal += outputQTClass(cl.getClass(i), cl, qtFx, origCI, false);
   		//rtnVal += "}\n";
   	}
		return rtnVal + "}\n";
   }
   
   private void sort()
   {
   	//ugh... bubble sort should do here
   	ClassInfo ci1;
   	ClassInfo ci2;
   	for(int i = 0; i < size(); i++)
   	{
   		ci1 = getClass(i);
   		for(int j = i; j < size(); j++)
   		{
   			ci2 = getClass(j);
   			if(ci2.startChar < ci1.startChar)
   			{
   				swap(i, j);
   			}
   		}
   	}
   }
   
   private void swap(int i, int j)
   {
   	ClassInfo temp = (ClassInfo) set(i, getClass(j));
   	set(j, temp);
   }
}

class MethodInfo extends CodeMember
{
   String name;
   VarList params;
   String modifiers;
   VarInfo returnType;
   String throwsList;
   int startLine;
   int endLine;
   String methodText;
   AssertionList asserts;
   LineList allLines;
   TestList tests;
   int compileState;
   int testState;
   int classIndex;
   //int methodNameIndex;
   int complexity;
   CodeMember src;
   MethodTextInfo mti;

   /*MethodInfo(String in, int lineNo, String classConstructor, int ci)
   {
      startLine = lineNo;
      endLine = -1;
      classIndex = ci;
      //System.out.println("Method: LineNo: " + lineNo + ": " + in);
      access = WhiteboxUtils.getAccessLevel(in);
      in = WhiteboxUtils.removeAccessModifiers(in);
      
            
      params = new VarList();
      String paramList = in.substring(in.indexOf('(') + 1, in.indexOf(')'));
      if(paramList.equals("") == false)
      {
         String[] allParams = paramList.split(",");
         for(int i = 0; i < allParams.length; i++)
         {
            String[] paramPair = allParams[i].split(" ");
            int j = 0;
            if(paramPair[0].equals(""))
            	j++;
            params.add(new VarInfo(paramPair[j], paramPair[j + 1], lineNo));
         }
      }
           
      String type;
      if(classConstructor == null)
      {
         type = in.substring(0, in.indexOf(" "));
         name = in.substring(in.indexOf(" "));
         //if(name.endsWith(paramList))
         //{
         name = name.substring(0, name.indexOf("(")); 
         //}
      }
      else
      {
         type = "ctor";
         name = classConstructor;
      }
      name = name.trim();
      returnType = new VarInfo(type, name, lineNo);
      
      asserts = new AssertionList();
      tests = new TestList();
      allLines = new LineList();
   }*/
   
   /*private String getMethodText(ParseTree in)
   {
   	String rtnVal = "";
   	return rtnVal;
   }*/
   
   public String getMethodSignature()
   {
   	String rtnVal = name + "(";
   	/*for(int i = 0; i < params.size(); i++)
   	{
   		VarInfo vi = params.getVar(i);
   		rtnVal += vi.getType() + " " + vi.getName();
   		if(i != params.size() - 1)
   			rtnVal += ",";
   	}*/
   	rtnVal += params.getAsParamList();
   	return rtnVal + ")";
   }

   public void end(int lineNo)
   {
      endLine = lineNo;
   }

   public void setLines(String[] in)
   {
      //lines = in;
   	for(int i = 0; i < in.length; i++)
   		allLines.add(new LineInfo(in[i], 3));
      //setupTests();
   }

   public void setLines(String in)
   {
      String[] lines = in.split("\n");
      setLines(lines);
      //setupTests();
   }

   public String getLines()
   {
	   /*String rtnVal = "";
	   /*for(int i = 0; i < lines.length; i++)
		   rtnVal += lines[i] + "\n";
	   for(int i = 0; i < allLines.size(); i++)
	   	rtnVal += allLines.getLine(i).lineText + "\n";
	   return rtnVal;*/
   	
	   //return allLines.outputWTDepth("   ", false);
   	return methodText;
   	
   }

   public boolean isSame(MethodInfo other)
   {
      /*String[] lines2 = other.lines;
      
      if(lines.length != lines2.length)
         return false;
      for(int i = 0; i < lines.length; i++)
      {
         if(!lines.equals(lines2))
            return false;
      }*/
      return true;
   }

   public String getMethodText()
   {
      return methodText;
      
   }

   /*public String toString()
   {
      return name;
   }*/

   public void setTestState(int x)
   {
      testState = x;
   }

   public void setCompileState(int x)
   {
      compileState = x;
   }

   public String getIconState()
   {
      int iconState = compileState * 4 + testState;
      return("ts" + iconState + ".gif");
   }

   public String stripTestName(String in)
   {
      int testIndex = in.lastIndexOf("Test");
      if(testIndex > 0)
         return in.substring(0, testIndex);
      else
         return null;
   }

   public String getTestFirstLine()
   {
   	/*String l1 = allLines.getLine(0).lineText;
   	System.out.println(l1);
	   if(returnType.type.equals("ctor"))
	   {	
	      int eom = l1.indexOf("(");
	      String a = l1.substring(0, eom);
	      String b = l1.substring(eom, l1.length());
	      return a + "Tests" + b;
	   }
	   else
		   return l1;*/
   	String line = "";
   	if(returnType.getType().equals("ctor"))
   		line += name + "Tests";
   	else
   		line += returnType.getType() + " " + name;
   	line += "(" + params.getAsParamList() + ")";
   	return line;
   }

   /*private String[] copyLines()
   {
	   String[] rtnVal = new String[lines.length];
	   for(int i = 0; i < lines.length; i++)
		   rtnVal[i] = new String(lines[i]);
	   return rtnVal;
   }*/

   /*public void extractTests()
   {
	   String[] all = getAllPaths(copyLines());
	   for(int i = 0; i < all.length; i++)
	   {
		   tests.add(new TestInfo(all[i], name + "Test_" + String.valueOf(i)));
	   }
   }*/
   
   public String extractParsedTests(ClassList cl)
   {
   	String rtnVal = "";
   	String n = allLines.getCommentList();
   	FunctionTree tree = new FunctionTree(allLines);
   	
   	if(!n.equals(allLines.getCommentList()))
   		throw new RuntimeException("Method line data lost\n");
   	complexity = tree.root.nPaths;
   	//try
   	//{
   	   rtnVal += this.name + ": " + tree.root.nPaths + "\n";
   	   
   	   rtnVal += tree.getTreeInfo();
   	   rtnVal += "=====================\n";
   	   if(tree.root.nPaths > 500)
   	   {
   	   	System.out.println(this.name + " has exceeded the complexity threshold.  Skipping test extraction.");
   	   	return rtnVal;
   	   }
   	   //try{Thread.sleep(3000 * tree.root.nPaths);} catch(Exception ex){}
   	   System.out.println(this.name + ": processing " + tree.root.nPaths + " paths.");
	   	for(int i = 0; i < tree.root.nPaths; i++)
	   	{
	   		//System.out.println(this.name + ": Path " + i + " of " + tree.root.nPaths);
	   		//try
	   		//{
	   		   LineList fx = tree.getParsedCodePath(i);
	   		   TestInfo ti = new TestInfo(fx, name + "Test_" + i, cl, this, i);
	   		   //ti.setTestIndex(i);
	   		   //ti.setAssocMethod(this);
	   		   tests.add(ti);
	   		   
	   		//}
	   		//catch(Exception ex)
	   		//{
	   			//System.err.println("Test extraction failed for path " + i);
	   			
	   			//System.err.println(ex.getCause());
	   			//ex.printStackTrace();
	   		//}
	   	}
   	//}
   	/*catch(Exception ex)
   	{
   		System.err.println("Text extraction failure in method: " + this.name);
   		System.err.println(ex.getMessage());
   		System.err.println(ex.getStackTrace());
   		
   		System.exit(0);
   	}*/
	   	return rtnVal;
   }
   
   public LineList getExtractedTest(int input)
   {
   	FunctionTree ft = new FunctionTree(allLines);
   	return ft.getParsedCodePath(input);
   }

   public String[] getAllPaths(String[] meth)  //public for testing only
   {
	   	   
	   FunctionTree tree = new FunctionTree(meth);
	   return null;
	   //return(tree.getCodePaths());
   }
   
   public String[] getAllPaths(LineList in)
   {
   	FunctionTree tree = new FunctionTree(in);
   	return(tree.getCodePaths());
   }

	class CodeNode
	{
	   String code;
	   int parentLine;
	   int absLineNo;
	   int relLineNo;
	   int blockType;
	   int nPaths;
	   int depth;
	   CodeNode parent;
	   int currPath;
	   LinkedList children;
	   LineList list;
	   int index;
	   //int parentIndex;

	   CodeNode()
	   {
		   nPaths = 1;
		   //int lineNo = 0;
		   code = "";
		   children = new LinkedList();
		   currPath = 0;
		   list = null;
	   }

	   CodeNode(String in)
	   {
		   this();
		   String btPart = in.substring(3, in.indexOf("|"));
		   String ln1 = in.substring(in.indexOf("L:"));
		   String lnPart = ln1.substring(2, ln1.indexOf("|"));
		   String ln2 = in.substring(in.indexOf("R:"));
		   String lnPart2 = ln2.substring(2, ln2.indexOf("|"));
		   String par1 = in.substring(in.indexOf("P:"));
		   String pnPart = par1.substring(2, par1.indexOf("|"));
		   code = in.substring(in.indexOf("\n") + 1, in.length());
		   parentLine = Integer.parseInt(pnPart);
		   blockType = Integer.parseInt(btPart);
		   absLineNo = Integer.parseInt(lnPart);
		   relLineNo = Integer.parseInt(lnPart2);
		   list = null;
	   }
	   
	   CodeNode(LineInfo in)
	   {
	   	list = new LineList();
	   	code = in.lineText;
	   	list.add(in);
	   	blockType = in.branchType;
	   	children = new LinkedList();
	   }
	   
	   public void addLineInfo(LineInfo in)
	   {
	   	//for(int i = 0; i < in.size(); i++)
	   	code += in.lineText;
	   	list.add(in);
	   }

	   public void addChild(CodeNode node)
	   {
		   children.add(node);
		   node.parent = this;
		   node.depth = depth + 1;
	   }

	   public String toString()
	   {
		   String rtnVal = "";
		   rtnVal = getShortString() + "\n";
		   //rtnVal += "AbsLineNo:" + absLineNo + "\n";
		   //rtnVal += "RelLineNo:" + relLineNo + "\n";
		   //rtnVal += "ParentLine:" + parentLine + "\n";
		   //rtnVal += "nPaths:" + nPaths + "\n";
		   //rtnVal += "//--------------------------------\n";
		   if(list.size() == 0)
		   	rtnVal += code + "\n";
		   else
		   	rtnVal += list.getCommentList();
		   //rtnVal += "//--------------------------------\n";
		   return rtnVal;
	   }
	   
	   public String getShortString()
	   {
		   String rtnVal;
		   //rtnVal = "P:" + parentLine + "A:" + absLineNo + "R:" + relLineNo + "T:" + blockType + "|";
		   rtnVal = "//#" + index;
		   if(parent != null)
		   	rtnVal += "(" + parent.index + ")";
		   rtnVal += " Type:" + blockType + " Paths:" + nPaths + " CP:" + currPath;
		   return rtnVal;
	   }
	   
	   public String getObjectString()
	   {
	   	return super.toString();
	   }
	   
	   private int[] getBlockData(LineInfo in)
	   {
	   	int[] rtnVal = new int[2];
	   	if(in != null)
	   	{
	   		rtnVal[0] = in.startChar;
	   		rtnVal[1] = in.tabDepth;
	   	}
	   	else
	   	{
	   		CodeNode pr = (CodeNode) parent;
	   		int idx = pr.children.indexOf(this);
	   		if(idx == 0)
	   			return null;
	   		else
	   		{
		   		CodeNode p = (CodeNode) pr.children.get(pr.children.indexOf(this) - 1);
		   		LineInfo li = p.list.getLine(0);
		   		rtnVal[0] = li.endChar;
		   		li = p.list.getLine(0);
		   		rtnVal[1] = li.tabDepth;
	   		}
	   	}
	   	return rtnVal;
	   }
	   
	   
	   private LineList getQTLines(FunctionTree in)
	   {
	   	LineList llCopy = in.copyLineList(list);
	   	for(int i = 0; i < llCopy.size(); i++)
   		{
   			LineInfo li = llCopy.getLine(i);
   			if(li.lineText.isEmpty())
   			{
   				llCopy.remove(i);
   				i--;
   			}
   		}
	   	return llCopy;
	   }
	   
	   private void indentAll(CodeNode in, int startIndex, LineList ll)
	   {
	   	LineList x;
	   	if(ll == null)
	   		x = in.list;
	   	else
	   		x = ll;
	   	for(int i = startIndex; i < x.size(); i++)
	   	{
	   		//int td = x.getLine(i).tabDepth;
	   		LineInfo li = x.getLine(i);
	   		li.tabDepth++;
	   		indentAll(null, 0, li.subLines);
	   		//System.out.println("|" + x.getLine(i).lineText + "| Old TD:" + td + " new TD:" + x.getLine(i).tabDepth);
	   	}
	   	if(in != null)
	   	{
		   	for(int i = 0; i < in.children.size(); i++)
		   	{
		   		CodeNode d = (CodeNode) in.children.get(i);
		   		indentAll(d, 0, null);
		   	}
	   	}
	   }
	   
	   public LineList outputQTCode(FunctionTree in)
	   {
	   	//LineList llCopy = getQTLines(in);  //we may need to deal with a direct copy
	   	LineList llCopy = in.copyLineList(list);
	   	final String GT = LineInfo.BLOCKSTART + LineInfo.BLOCKEND;
	   	int insertIndex = 0;
	   	int blockStartChar = 0;
	   	int blockTabDepth = 0;
	   	
	   	for(int i = 0; i < llCopy.size(); i++)
   		{
   			LineInfo li = llCopy.getLine(i);
   			System.out.println("|" +li.lineText +"|");
   		}
	   	switch(blockType)
	   	{
	   	case FunctionTree.IF:
	   	{
	   		String str;
	   		
	   		LineInfo ref0 = llCopy.getLine(0);
	   		CodeNode p = parent.parent;
	   		//if(p.blockType == FunctionTree.ELSE && p.getQTLines(in).size() == 0) //then you are an else if
	   			//str = "else if";
	   		//else
	   			str = "if";
	   		LineInfo newIf = new LineInfo(str + ref0.condition + GT, ref0.startChar, ref0.tabDepth);
	   		newIf.branchType = FunctionTree.IF;
	   		newIf.endChar = ref0.endChar;
	   		llCopy.remove(0);
	   		llCopy.addFirst(newIf);
	   		//ref0 = llCopy.getLine(1);
	   		insertIndex++;
	   		System.out.println("I took case IF; ii=" + insertIndex);
	   	}
	   		break;
	   	case FunctionTree.ELSE:
	   		//System.out.println("Else node: list size = " + list.size());
	   		
	   		if(llCopy.size() > 0)
	   		{
	   			LineInfo ref0 = llCopy.getLine(0);
	   			LineInfo newElse = new LineInfo("else" + GT, ref0.startChar, ref0.tabDepth);
	   			newElse.branchType = FunctionTree.ELSE;
	   			newElse.endChar = ref0.endChar;
	   			llCopy.remove(0);
	   			llCopy.addFirst(newElse);
	   			
	   			indentAll(this, 1, llCopy);
	   			//ref0 = llCopy.getLine(1);
	   			insertIndex++;
	   		}
	   		System.out.println("I took case ELSE; ii=" + insertIndex);
	   		break;
	   	case FunctionTree.MULT_NODE:  //this is actually a case for "SWITCH", but it got turned into a MULT_NODE earlier
	   		CodeNode d = (CodeNode) children.get(0);
	   		if(d.blockType == FunctionTree.CASE)  //then you are a SWITCH; otherwise, you are not and we move on
	   		{
		   		LineInfo ref0 = llCopy.getLine(0);
		   		LineInfo newS = new LineInfo("switch" + ref0.condition + GT, ref0.startChar, ref0.tabDepth);
		   		newS.branchType = FunctionTree.SWITCH;
		   		newS.endChar = ref0.endChar;
		   		llCopy.remove(0);
		   		//System.out.println("Switch: after removal");
		   		for(int i = 0; i < llCopy.size(); i++)
		   		{
		   			LineInfo li = llCopy.getLine(i);
		   			//System.out.println("|" +li.lineText +"|");
		   		}
		   		//System.out.println("Switch: after add");
		   		llCopy.addFirst(newS);
		   		for(int i = 0; i < llCopy.size(); i++)
		   		{
		   			LineInfo li = llCopy.getLine(i);
		   			System.out.println("|" +li.lineText +"|");
		   		}
		   		//ref0 = llCopy.getLine(1);
		   		System.out.println("I took case SWITCH; ii=" + insertIndex);
		   		insertIndex++;
	   		}
	   		break;
	   	case FunctionTree.CASE: 
	   	case FunctionTree.DEFAULT:
	   		insertIndex++;
	   		//blockTabDepth++;
	   		System.out.println("I took case CASE; ii=" + insertIndex);
	   	}
	   	if(currPath > 0)
	   	{
	   		LineInfo ref1;// = llCopy.getLine(insertIndex);
	   		System.out.println("Comparing ii=" + insertIndex + " and size=" + llCopy.size());
	   		if(insertIndex >= llCopy.size())
	   			ref1 = null;
	   		else
	   			ref1 = llCopy.getLine(insertIndex);
	   		
	   		int[] info = getBlockData(ref1);
	   		if(info == null) // this could happen with an empty if clause
	   		{
	   			info = getBlockData(llCopy.getLine(insertIndex - 1));
	   			info[0]++;
	   			info[1]++;
	   		}
	   		blockStartChar += info[0];
	   		blockTabDepth += info[1];
	   		//LineList newLines = new LineList();
	   		LineInfo cpLine;
	   		if(ref1 != null)
	   			cpLine = new LineInfo("QuicktestRunner.execPath += " + currPath + ";", blockStartChar, blockTabDepth);
	   		else //we are dealing with an empty else node OR an empty default node
	   		{
	   			if(blockType == FunctionTree.ELSE)
	   			{
	   			LineInfo newElseLine = new LineInfo("else", blockStartChar, blockTabDepth);
	   			llCopy.add(newElseLine);
	   			//insertIndex++;
	   			//blockStartChar++;
	   			//blockTabDepth++; //don't know if this will work
	   			}
	   			else
	   			{
	   				LineInfo newElseLine = new LineInfo("default:", blockStartChar, blockTabDepth - 1);
	   				llCopy.add(newElseLine);
	   			}
	   			insertIndex++;
	   			blockStartChar++;
	   			blockTabDepth++; //don't know if this will work
	   			cpLine = new LineInfo("QuicktestRunner.execPath += " + currPath + ";", blockStartChar, blockTabDepth);
	   		}
	   		System.out.println(llCopy.outputWTDepth("   ", false));
	   		System.out.println("Line list size:" + llCopy.size() + " insertion point:" + insertIndex);
	   		llCopy.add(insertIndex, cpLine);
	   		//System.out.println("Changed to:\n" + llCopy.outputWTDepth("   ", false));
	   		//return newLines;
	   	}
	   	//returns - save the quickTestExecPath (deprecated - we are using a global variable instead
	   	/*for(int i = 0; i < llCopy.size(); i++)
	   	{
	   		LineInfo ref0 = llCopy.getLine(i);
	   		if(ref0.isReturn())
	   		{
	   			LineInfo newOut = new LineInfo("WhiteboxUtils.writeFile(String.valueOf(quicktestExecPath), \"qtOut.wbq\");", ref0.startChar, ref0.tabDepth);
	   			llCopy.add(i, newOut);
	   			i++;
	   		}
	   	}*/
	   	//cases that don't "break" - subtract the next case's path at end
	   	//this is represented as a case block with multiple case statements
	   	if(blockType == FunctionTree.CASE)
	   	{
	   		for(int i = 1; i < llCopy.size(); i++)
	   		{
	   			LineInfo caseLine = llCopy.getLine(i);
	   			//find the next case line and remove everything after it so those lines are not duplicated
	   			if(caseLine.isCase())
	   			{
	   				caseLine = llCopy.getLine(i - 1);
	   				while(i < llCopy.size())
	   				{
	   					LineInfo rm = llCopy.getLine(i);
	   					System.out.println("Duplicate case: removing |" + rm.lineText + "|");
	   					llCopy.remove(i);
	   					
	   				}
	   				int[] xy = this.getBlockData(caseLine);
   		   		CodeNode par = parent;
   		   		int sz = parent.children.size();
   		   		//subtract the next case's path contribution as it will just get added again
   		   		for(int j = 0; j < sz - 1; j++)
   		   		{
   		   			if(parent.children.get(j) == this)
   		   			{
   		   				CodeNode d = (CodeNode) parent.children.get(j + 1);
   		   				int x = d.currPath;
   		   				LineInfo newLine = new LineInfo("QuicktestRunner.execPath -= " + x + ";", xy[0], xy[1]);
   		   				llCopy.addLast(newLine);
   		   				break;
   		   			}
   		   		}
	   			}
	   		}
	   		/*boolean noBreak = false;
	   		LineInfo ref0 = null;
	   		if(llCopy.size() == 0)
	   			noBreak = true;
	   		else
	   		{
	   			ref0 = llCopy.getLine(llCopy.size() - 1);
	   			if(!ref0.isBreak())
	   				noBreak = true;
	   		}*/
	   	}
	   	System.out.println("Changed to:\n" + llCopy.outputWTDepth("   ", false));
	   	return llCopy;
	   }
	}

	class FunctionTree
	{
	   CodeNode root;
	   int pcpLineNo;
	   String debugInfo;
	   static final int OTHER = 0;
	   static final int IF = LineInfo.IF;
	   static final int ELSE = LineInfo.ELSE;
	   static final int SWITCH = LineInfo.SWITCH;
	   static final int CASE = LineInfo.CASE;
	   static final int DEFAULT = LineInfo.DEFAULT;
	   static final int TRY = LineInfo.TRY;
	   static final int TERNARY = LineInfo.TERNARY;
	   static final int MULT_NODE = -1;

	   FunctionTree(String[] meth)
	   {
		   pcpLineNo = 0;
		   LinkedList parts = processCodePath(new LinkedList(), meth, 0, 0, 0);
		   System.out.println("Done getting all " + parts.size() + " code paths.");
		   String str2 = "";
		   for(int i = 0; i < parts.size(); i++)
		   {
			   String str = (String) parts.get(i);
			   CodeNode cn = new CodeNode(str);
			   str2 += cn.getShortString();
		   }
		   //System.out.println(str1);
		   System.out.println(str2);
		   CodeNode[] nodes = extractNodes(parts);
		   linkTree(nodes);
		   makeEmptyElseNodes(nodes);
		   aggregateCases(nodes);
		   setupSubnodes(nodes);
		   sumLeaves(root);
		   System.out.println("nPaths = " + parts.size());
		   System.out.println("Cyclo = " + root.nPaths);
		   printTree(0);
	   }
	   
	   FunctionTree(LineList in)
	   {
	   	System.out.println("Method name: " + name + "(" + params.getAsParamList() + ")");
	   	System.out.println("======================");
	   	System.out.println(in.outputWTDepth("   ", false));
	   	int n = in.size();
	   	LineList llCopy = copyLineList(in);
	   	root = new CodeNode();
	   	root.depth = 0;
	   	root.list = new LineList();
	   	debugInfo = "/********************\n";
	   	debugInfo += "* Link Tree info:\n";
	   	debugInfo += linkTree(llCopy, root, true);
	   	debugInfo += "********************/\n";
	   	//System.out.println("AA");
	   	//printTree();
	   	makeEmptyBranches(root);
	   	//System.out.println("BB");
	   	//printTree();
	   	aggregateCases(root);
	   	//System.out.println("CC");
	   	//printTree();
	   	setupSubnodes(root);
	   	//System.out.println("DD");
	   	markIndeces(root);
	   	sumLeaves(root);
	   	System.out.println("---------------------------------");
	   	System.out.println(in.outputWTDepth("   ", false));
	   	if(n != in.size())
	   		System.err.println("Error in original list - it got munched");
	   	//System.out.println("EE");
	   	//printTree();
	   }
	   
	   public LineList copyLineList(LineList in)
	   {
	   	LineList newList = new LineList();
	   	for(int i = 0; i < in.size(); i++)
	   	{
	   		LineInfo li = in.getLine(i);
	   		LineInfo newLine = new LineInfo(li);
	   		if(li.subLines == null)
	   			System.err.println(li.lineText + " has null subLines");
	   		else
	   			newLine.subLines = copyLineList(li.subLines);
	   		newList.add(newLine);
	   	}
	   	return newList;
	   }

	   private CodeNode[] extractNodes(LinkedList codeParts)
	   {
		   CodeNode temp[] = new CodeNode[codeParts.size()];
		   root = new CodeNode();
		   //read the nodes
		   for(int i = 0; i < codeParts.size(); i++)
		   {
			   String part = (String) codeParts.get(i);
			   CodeNode node = new CodeNode(part);
			   temp[i] = node;
			   if(node.absLineNo == 0)
				   root = node;
			   //System.out.println(node);
		   }
		   return temp;
	   }
	   
	   private String linkTree(LineList in, CodeNode root, boolean trueRoot)
	   {
	   	String rtnVal = "LinkingTree\n";
	   	for(int i = 0; i < in.size(); i++)
	   	{
	   		LineInfo li = in.getLine(i);
	   		rtnVal += "Looking at:" + li.getLIInformation();
	   		CodeNode n = new CodeNode(li);
	   		if(li.branchType != 0)
	   		{
	   			rtnVal += "Making subnode\n";
	   			// you need to break this off into its new node as it adds to cyclo
	   			// make a new node for it 
	   			root.addChild(n);
	   			n.parent = root;
	   			n.parentLine = i;
	   			//recurse down into the node
	   			rtnVal += linkTree(li.subLines, n, true);
	   			// cut off the sublines connection - it is connected via codenode now 
	   			li.subLines = new LineList();
	   			//if you are not the true root, you are a part of another line list - remove you
	   			if(!trueRoot)
	   			{
	   				in.remove(li);
	   				i--;
	   			}
	   		}
	   		else
	   		{
	   			//just add the line to the current root ONLY IF this is the "true root" of the code branch
	   			//as subnodes remain linked via sublines (not adding this creates duplicated nodes in output) 
	   			if(trueRoot)
	   			{
	   				root.addLineInfo(li);
	   				rtnVal += "Adding subline line\n";
	   			}
	   			rtnVal += linkTree(li.subLines, root, false);
	   			//li.subLines = new LineList();
	   		}
	   	}
	   	return rtnVal;
	   	/*System.out.println(root.list.getCommentList());
	   	System.out.println(root.list.outputWTDepth("   ", false));
	   	
	   	//WhiteboxUtils.pause(1000);
	   	for(int i = 1; i < root.list.size(); i++)
	   	{
	   		LineInfo li = root.list.getLine(i);
	   		if(li.branchType != 0)
	   		{
	   			System.err.println("Error in list: duplicate line");
	   			WhiteboxUtils.pause(5000);
	   		}
	   	}*/
	   }
	   
	   private void makeEmptyBranches(CodeNode root)
	   {
	   	int sz = root.children.size();
	   	for(int i = 0; i < sz; i++)
	   	{
	   		CodeNode nde = (CodeNode) root.children.get(i);
	   		if(nde.blockType == TERNARY)
	   		{
	   			int sz2 = nde.children.size();
	   			//CodeNode nde2 = null;
	   			//if(sz2 == 1)
	   				//nde2 = (CodeNode) nde.children.get(1);
	   			//if the if node is not immediately followed by an else node, inject one
	   			if(sz2 == 1)
	   			{
	   				CodeNode c = new CodeNode();
						c.blockType = ELSE;
						c.list = new LineList();
						nde.addChild(c);
	   			}
	   		}
	   		else if(nde.blockType == SWITCH)
	   		{
	   			int sz2 = nde.children.size();
	   			CodeNode cn = (CodeNode) nde.children.get(sz2 - 1);
	   			if(cn.blockType != DEFAULT)
	   			{
	   				CodeNode c = new CodeNode();
						c.blockType = DEFAULT;
						c.list = new LineList();
						nde.addChild(c);
	   			}
	   		}
	   		makeEmptyBranches(nde);
	   	}
	   }
	   
	   private void aggregateCases(CodeNode root)
	   {
	   	int sz = root.children.size();
	   	for(int i = 0; i < sz; i++)
	   	{
	   		CodeNode nde = (CodeNode) root.children.get(i);
	   		if(nde.blockType == CASE)
	   		{
	   			//CodeNode nde2 = (CodeNode) nde.children.getLast();
	   			LineInfo li = (LineInfo) nde.list.getLast();
	   			/*ParseTree pt = (ParseTree) li.textTokens.get(0);
	   			CommonToken ct = (CommonToken) pt.payload;
	   			String bk = ct.getText();*/
	   			String bk = (String) li.textTokens.get(0);
	   			//System.out.println(bk);
	   			if((bk.equals("break")) == false)
	   			{
	   				//System.out.println("entered with:" + bk + " " + bk.equals("break"));
	   				//add in the future cases until you meet a break or the end
	   				for(int j = i + 1; j < sz; j++)
	   				{
	   					//add in the case
	   					CodeNode addCase = (CodeNode) root.children.get(j);
	   					LineInfo li2 = null;
	   					for(int k = 0; k < addCase.list.size(); k++)
	   					{
	   						li2 = addCase.list.getLine(k);
	   						nde.addLineInfo(li2);// .add(li2);
	   					}
	   					if(li2 != null && li2.lineText.startsWith("break"))
	   						break;
	   				}
	   			}
	   		}
	   		aggregateCases(nde);
	   	}
	   }
	   
	   private void setupSubnodes(CodeNode root)  //this f(x) may not even be needed
	   {
	   	int sz = root.children.size();
	   	for(int i = 0; i < sz; i++)
	   	{
	   		CodeNode nde = (CodeNode) root.children.get(i);
	   		switch(nde.blockType)
	   		{
	   		case 0:
	   		case CASE:
	   		case DEFAULT:
	   		case IF:
	   		case ELSE:
	   		case TRY:
	   			break;
	   		default:
	   			nde.blockType = MULT_NODE;
	   		}
	   		setupSubnodes(nde);
	   	}
	   }
	   
	   private void markIndeces(CodeNode root)
	   {
	   	int level = 0;
	   	int index = 1;
	   	root.index = 0;
	   	while(true)
	   	{
	   		CodeNode[] lst = this.levelTraverse(level);
	   		if(lst.length == 0)
	   			break;
	   		for(int i = 0; i < lst.length; i++)
	   		{
	   			lst[i].index = index;
	   			//lst[i].parentIndex = lst[i].parent.index;
	   			index++;
	   		}
	   		level++;
	   	}
	   }
	   
	   /*private void collapse(CodeNode root)
	   {
	   	for(int i = 0; i < root.children.size(); i++)
	   	{
	   		CodeNode rt = (CodeNode) root.children.get(i);
	   		collapse(rt);
	   	}
	   	CodeNode par = root.parent;
	   	if(par != null)
	   	{
	   		switch(par.blockType)
	   		{
	   		case -1: case TERNARY: case SWITCH:
	   			if(par.list.size() > 0)
	   			{
	   				LineInfo li = par.list.getLine(0);
	   				li.subLines.addAll(root.list);
	   			}
	   			else
	   			{
	   				System.err.println("COLLAPSE FAIL");
	   			}
	   			if(par.blockType == -1)
	   			{
	   				if(root.blockType == IF)
	   					par.blockType = TERNARY;
	   				else
	   					par.blockType = SWITCH;
	   			}
	   			break;
	   		default:
	   			par.list.addAll(root.list);
	   		}
	   	}
	   	else
	   		root.list.group();
	   }*/
	   
	   private void linkTree(CodeNode[] temp)
	   {
		   //link up the tree - this uses the String to 
		   for(int i = 0; i < temp.length; i++)
		   {
			   if(temp[i] == root)
				   continue;
			   if(temp[i].parentLine == 0)
			      root.addChild(temp[i]);
			   else
			   {
				   for(int j = 0; j < temp.length; j++)
				   {
					   if(temp[j].absLineNo == temp[i].parentLine && i != j)
						   temp[j].addChild(temp[i]);
				   }
			   }
		   }
	   }
	   
	   private void makeEmptyElseNodes(CodeNode[] temp)
	   {
		   int i = 0;
		   while(true)
		   {
			  CodeNode[] lst = levelTraverse(i);
			  if(lst.length == 0)
				  break;
			  for(int j = 0; j < lst.length; j++)
			  {
				  if(lst[j].blockType == IF)
				  {
					 //if you have a lone if statement
					 if((j + 1) == lst.length || lst[j + 1].blockType != ELSE)
					 {
						 //add an empty else, then tie it to the given if
						 CodeNode c = new CodeNode();
						 c.blockType = ELSE;
						 c.absLineNo = lst[j].absLineNo;
						 c.relLineNo = lst[j].relLineNo;
						 c.parent = lst[j].parent;
						 c.parentLine = lst[j].parentLine;
						 c.code = "";
						 c.parent.addChild(c);
					 }
					 //else
					 //{
						 //tie the current else, by line number, to the given if
						 //lst[j + 1].absLineNo = lst[j].absLineNo;
						 //lst[j + 1].relLineNo = lst[j].relLineNo;
					 //}
				  }
			  }
			  i++;
		   }
		   //System.out.println("Done linking if-else.");
	   }
	   
	   private void aggregateCases(CodeNode[] temp)
	   {
		   //continuous cases:  aggregate the code
		   int i = 1;
		   while(true)
		   {
			  CodeNode[] lst = levelTraverse(i);
			  if(lst.length == 0)
				  break;
			  else
			   {
				   for(int j = 0; j < lst.length; j++)
					   System.out.println(j + ":" + lst[j].getShortString());
			   }
			  //traverse a level
			  for(int j = 0; j < lst.length; j++)
			  {
				  //look for switch statements
				  if(lst[j].blockType == SWITCH)
				  {
					  CodeNode[] lst2 = new CodeNode[lst[j].children.size()];
					  int lastCase = 0;
					  //get each child case; look at the last absolute line
					  for(int k = 0; k < lst[j].children.size(); k++)
					  {
						  lst2[k] = (CodeNode) lst[j].children.get(k);
						  if(lst2[k].absLineNo > lastCase)
							  lastCase = lst2[k].absLineNo;
					  }
					  //look for a continued case (one without a "break" at the end)
					  for(int k = 0; k < lst2.length; k++)
					  {
						  if(lst2[k].blockType == CASE && lst2[k].code.indexOf(" break;") == -1)
						  {
							  //look for all possible following cases
							  int lastLine = lst2[k].absLineNo + 1; 
							  //go through each line following the case
							  while(lastLine <= lastCase)
							  {
								  //look for a case beginning on this line
								  for(int l = 0; l < lst2.length; l++)
								  {
									  if(lst2[l].absLineNo == lastLine)
									  {
										  //found a case -- join the code
										  lst2[k].code += lst2[l].code;
										  //continue moving forward if there is no "break" at the end of this case
										  if(lst2[l].code.indexOf(" break;") == -1)
											  lastLine++;
										  else
											  lastLine = lastCase;
									  }
								  }
								  lastLine++;
							  }
						  }
					  }
					  //wipe out the "breaks" to make the case compilable
					  for(int k = 0; k < lst2.length; k++)
					  {
						  int brk = lst2[k].code.lastIndexOf(" break;");
						  if(brk > 0)
						  {
							  lst2[k].code = lst2[k].code.substring(0, brk);
						  }
					  }
				  }
			  }
			  i++;
		   }
	   }
	   
	   private void setupSubnodes(CodeNode[] temp)
	   {
		   //set up sub-nodes: these nodes are intermediary multipliers
		   int i = 1;
		   while(true)
		   {
			  CodeNode[] lst = levelTraverse(i);
			  System.out.println("Level " + i + " has " + lst.length + " nodes.");
			  if(lst.length == 0)
				  break;
			  //traverse a level
			  CodeNode[] newLvl = new CodeNode[lst.length];
			  int l = 0;
			  for(int j = 0; j < lst.length; j++)
			  {
				 //switch nodes: make them into an intermediary node and ignore a re-link process
				 if(lst[j].blockType == SWITCH)
				 {
					 lst[j].blockType = -1;
					 continue;
				 }
				 //look for a node with the same line number in our intermediate list
				 boolean found = false; 
				 for(int k = 0; k < newLvl.length; k++)
				 {
					 if(newLvl[k] != null && newLvl[k].relLineNo == lst[j].relLineNo && newLvl[k].parentLine == lst[j].parentLine)
					 {
						 //if one is there, simply move the child from the parent to the
						 //intermediate node
						 lst[j].parent.children.remove(lst[j]);
						 newLvl[k].addChild(lst[j]);
						 found = true;
						 break;
					 }
				 }
				 if(found == false)
				 {
					//else create the new node, attach it to the parent, and attach the
					//current node to the new child
					newLvl[l] = new CodeNode();
					newLvl[l].absLineNo = lst[j].absLineNo;
					newLvl[l].relLineNo = lst[j].relLineNo;
					newLvl[l].parentLine = lst[j].parentLine;
					newLvl[l].blockType = -1;
					
					lst[j].parent.addChild(newLvl[l]);
					lst[j].parent.children.remove(lst[j]);
					newLvl[l].addChild(lst[j]);
					l++;
				 }
			  }
			  //step down two levels
			  i += 2;
		   }
	   }
		   
		   //System.out.println("Done making subnodes.");
		   //final tree
		   //System.out.println("Final tree:");
		   /*i = 0;
		   while(true)
		   {
			   CodeNode[] lst = levelTraverse(i);
			   //System.out.println("Level " + i + " has " + lst.length + " nodes.");
			   if(lst.length == 0)
				  break;
			   else
			   {
				   for(int j = 0; j < lst.length; j++)
					   System.out.println(j + ":" + lst[j].getShortString());
			   }
			   i++;
		   }*/
		   //set up the sums
		    
		   //printTree();
		   //System.out.println("Done calculating cyclo.");
	   
	   
	   private synchronized LinkedList processCodePath(LinkedList paths, String[] meth, int lineNo, int blockType, int parentLineNo)
	   {
		  //add the new entry
		  /*if(pathDepth > -1)
			  paths.add(new String((String) paths.get(pathDepth)));
		  else*/
		  //paths.add(new String("|L:" + lineNo + "|P:" + parentLineNo +"|\n"));
		  String currPath = new String("BT:" + blockType + "|L:" + pcpLineNo + "|R:" + lineNo + "|P:" + parentLineNo +"|\n");
		  String tokens[] = {"else", "if(", "switch(", "case ", "default:"/*, "do", "while(", "for("*/};
		  boolean endedBlock = false;
		  String line;
		  int branchPos = -1;
		  int blockDepth = 0;
		  int relativeLine = 0;
		  int parLine = pcpLineNo;
		  int i = 0;
		  
		  while(pcpLineNo < meth.length)
		  {
			 i = pcpLineNo;
			 line = new String(meth[i]);
			 line = WhiteboxUtils.removeNonCode(line, true);
			 int foundNum = -1;
			 int ifEnd = 0;
			 //line = line.trim();
			 //if you start a new block, process it
			 for(int j = 0; j < tokens.length; j++)
			 {
				 branchPos = line.indexOf(tokens[j]);
				 if(branchPos > 0 && line.charAt(branchPos - 1) >= '0')
					 continue;
				 if(branchPos > -1)
				 {
					 foundNum = j;
					 break;
				 }
			 }
			 //if(foundNum >= 0)
				 //System.out.println("Found block of type:" + (foundNum) + " at line " + i + " from parent " + parLine);
			 switch(foundNum)
			 {
			 case 0:  //else
				 ifEnd = branchPos + 4;
				 meth[i] = meth[i].substring(0, branchPos) + "/*else*/" + meth[i].substring(ifEnd);
				 relativeLine--;
				 processCodePath(paths, meth, relativeLine, ELSE, parLine);
				 relativeLine++;
				 break;
			 case 1:  //if
				 ifEnd = WhiteboxUtils.findClosingParen(line, branchPos + 4) + 1;
				 String condition = meth[i].substring(branchPos, ifEnd);
				 condition = condition.substring(condition.indexOf("if(") + 2);
				 meth[i] = meth[i].substring(0, branchPos) + "/* because" + condition + " */" + meth[i].substring(ifEnd);
				 processCodePath(paths, meth, relativeLine, IF, parLine);
				 if(i == parLine && blockType == ELSE) //else-if postprocessing
				 {
					 //System.out.println("Ended block type " + blockType + " starting on line " + parLine + " on line " + pcpLineNo);
					 paths.add(currPath);
					 return paths;
				 }
				 else
					 relativeLine++;
				 break;
			 case 2:  //switch
				 ifEnd = WhiteboxUtils.findClosingParen(line, branchPos + 8) + 1;
				 meth[i] = meth[i].substring(0, branchPos) + "/* switch on " + meth[i].substring(branchPos + 7, ifEnd) + " */" + meth[i].substring(ifEnd);
				 processCodePath(paths, meth, relativeLine, SWITCH, parLine);
				 relativeLine++;
				 break;
			 case 3:  //case
				 if(blockType == CASE)  // don't process cases within cases
				 {
					 //System.out.println("Ended block type " + blockType + " starting on line " + parLine + " on line " + pcpLineNo);
					 paths.add(currPath);
					 return paths;
				 }
				 else
				 {
					 ifEnd = line.indexOf(":", branchPos + 6) + 1;
					 int caseEnd = line.indexOf("case ") + 5;
					 meth[i] = meth[i].substring(0, branchPos) + "/* value is " + meth[i].substring(caseEnd, ifEnd)  + " */" + meth[i].substring(ifEnd);
					 relativeLine = 2;
					 processCodePath(paths, meth, relativeLine, CASE, parLine);
					 relativeLine++;
				 }
				 break;
			 case 4:  //"default"
				 if(blockType == CASE)  // don't process cases within cases
				 {
					 //System.out.println("Ended block type " + blockType + " starting on line " + parLine + " on line " + pcpLineNo);
					 paths.add(currPath);
					 return paths;
				 }
				 else
				 {
					 ifEnd = line.indexOf(":", branchPos + 7) + 1;
					 meth[i] = meth[i].substring(0, branchPos) + meth[i].substring(ifEnd);
					 relativeLine = 2;
					 processCodePath(paths, meth, relativeLine, DEFAULT, parLine);
					 relativeLine++;
				 }
				 break;
			 case -1:  //nothing
				 switch(blockType)
				 {
				    case 0:
				       if(line.indexOf("}") >= 0)
				       {
				    	   if(blockDepth == 0)
				    	      endedBlock = true;
				    	   else
				    		  blockDepth--;
				       }
				       else if(line.indexOf("{") >= 0)
				    	   blockDepth++;
				 	   break;
				    //if block
				 	case IF:
				 	case ELSE:
				 	   if(line.indexOf("{") >= 0)
				 	   {
				 	      blockType = 0;
				 	   }
				 	   else if(line.trim().endsWith(";"))
				 		  endedBlock = true;
				 	   else if(pcpLineNo > parLine)
				 	   {
				 		   //truncated if-else: just return the path without adding anything
				 		   //or moving forward to the next line
				 		  //System.out.println("Ended block type " + blockType + " starting on line " + parLine + " on line " + pcpLineNo);
				 		   paths.add(currPath);
				 		   return paths;
				 	   }
				 	   break;
				 	//switch block
				 	case SWITCH:
				 	   if(line.indexOf("}") >= 0)
				 		   endedBlock = true;
				 	   break;
				    //case block
				 	case CASE:
				 	case DEFAULT:
				 		if(line.indexOf("{") >= 0)
				 		{
					 	   blockType = 0;
					 	   break;
				 		}
					 	else if(line.indexOf("break;") >= 0)
					 	   endedBlock = true;
				 		break;
				 }
				 currPath += meth[i] + "\n";
				 //when you're done you're done
				 if(endedBlock)
				 {
					 //System.out.println("Ended block type " + blockType + " starting on line " + parLine + " on line " + pcpLineNo);
					 paths.add(currPath);
					 pcpLineNo++;
					 return paths;
				 }
				 else
				 {
					 relativeLine++;
					 pcpLineNo++;
				 }
				 break;
			 }
		  }
		//if you end a block, add the block to the list and return
		  paths.add(currPath);
		  return paths;
	   }
	   
	   public LineList[] getParsedCodePaths()
	   {
	   	LineList[] rtnVal = new LineList[root.nPaths];
	   	for(int i = 0; i < root.nPaths; i++)
		   {
	   		rtnVal[i] = getParsedCodePath(i);
		   }
	   	return rtnVal;
	   }
	   
	   public LineList getParsedCodePath(int pathNum)
	   {
	   	LineList rtnVal;
	   	LinkedList path;
	   	//System.out.println(pathNum);
		   //for(int i = 0; i < root.nPaths; i++)
		   //{
			  path = new LinkedList();
			  path.add(root);
			  int startLevel = 0;
			  int endLevel = 1;
			  //int[] prevPathSel = new int[1];
			  root.currPath = pathNum;
			  //System.out.println("Calculating path: " + pathNum);
			  while(true)
			  {
				  //push the level
				  for(int j = startLevel; j < endLevel; j++)
				  {
					  CodeNode d = (CodeNode) path.get(j);
					  path.addAll(d.children);
				  }
				  //System.out.println("Path: added " + (endLevel - startLevel) + " nodes.");
				  /*for(int l = 0; l < path.size(); l++)
				  {
					  CodeNode g = (CodeNode) path.get(l);
					  System.out.println(g.getShortString());
				  }*/
					  //System.out.println((CodeNode) path.getObjectString(l));
				  startLevel = endLevel;
				  endLevel = path.size();
				  if(startLevel == endLevel)
					  break;
				  //determine the path using i
				  int childNum = 0;
				  for(int j = startLevel; j < endLevel; j++)
				  {
					  //calculate the number of subnodes on each path later than the selected path
					  //get the parent
					  CodeNode parent = (CodeNode) path.get(j);
					  parent = parent.parent;
					  //System.out.println("Parent is:" + parent.getObjectString());
					  //calculate the number of paths later on underneath the parent
					  int prodPrev = 1;
					  CodeNode e = (CodeNode) parent.children.get(childNum);
					  //System.out.println("e is:" + e.getObjectString() + "  cn:" + childNum);
					  for(int k = childNum; k < parent.children.size() - 1; k++)
					  {
						  CodeNode f = (CodeNode) parent.children.get(k + 1);
						  prodPrev *= f.nPaths;						
					  }
					  //System.out.println("pp:" + prodPrev);
					  //System.out.println("NDI:" + startLevel + " CN:" + childNum + " PP:" + prodPrev);
					  
					  if(childNum == parent.children.size() - 1)
					  {
						//the child is the last node: just grab whatever is left from the parent
						  e.currPath = parent.currPath;
						  childNum = 0;
					  }
					  else
					  {
						//use up "path" from the parent
						  e.currPath = parent.currPath / prodPrev;
						  parent.currPath %= prodPrev;
						  childNum++;
					  }
				  }
				  //printPath();
				  //add the path, replacing using the selected nodes only
				  //NOTE: this part selects one child node, rather than set the path for all child nodes,
				  //so this part is different from above
				  //System.out.println("SL" + startLevel + " EL" + endLevel);
				  for(int j = startLevel; j < endLevel; j++)
				  {
					  CodeNode d = (CodeNode) path.get(j);
					  int sum = 0;
					  for(int k = d.children.size() - 1; k >= 0; k--)
					  {
						  CodeNode e = (CodeNode) d.children.get(k);
						  sum += e.nPaths;
						  if(d.currPath < sum)
						  {
							 path.add(e);
							 e.currPath = d.currPath - sum + e.nPaths;  //e.currpath = currpath - the sum of all later paths
							 break;
						  }
					  }
				  }
				  startLevel = endLevel;
				  endLevel = path.size();
				  //System.out.println("SL" + startLevel + " EL" + endLevel);
			  }
			  //System.out.println("Path:" + i);
			  //printPath();
			  rtnVal = getParsedCodePath(path);
			  //rtnVal[rtnVal.length - 1 - i].output("", LineList.TESTPATH);
			  //rtnVal[rtnVal.length - 1 - i].outputWTDepth();
			  //System.out.println("....................");
		   //}
	   	return rtnVal;
	   }
	   
	   private LineList getParsedCodePath(LinkedList in/*, LineList out*/)
	   {
	   	LineList newList = new LineList();
	   	LineList currList = newList;
	   	
//	   	for(int i = 0; i < in.size(); i++)
//	   	{
//	   		CodeNode cn = (CodeNode) in.get(i);
//	   		System.out.print(cn.list.size() + ",");
//	   	}
//	   	System.out.println("");
	   	for(int i = 0; i < in.size(); i++)
	   	{
	   		CodeNode cn = (CodeNode) in.get(i);
	   		LineList subList = new LineList();
	   		getAllSublines(cn.list, subList);
	   		for(int j = 0; j < subList.size(); j++)
	   			newList.add(subList.getLine(j));
	   	}
	   	newList.sort();
	   	return newList;
	   }
	   
	   private LineList getParsedCodePath(LineList[] in)
	   {
	   	LineList newList = new LineList();
	   	for(int i = 0; i < in.length; i++)
	   	{
	   		LineList subList = new LineList();
	   		getAllSublines(in[i], subList);
	   		for(int j = 0; j < subList.size(); j++)
	   			newList.add(subList.getLine(j));
	   	}
	   	newList.sort();
	   	return newList;
	   }
	   
	   private void getAllSublines(LineList in, LineList out)
	   {
	   	for(int i = 0; i < in.size(); i++)
	   	{
	   		LineInfo li = in.getLine(i);
	   		out.add(li);
	   		if(li.subLines != null)
	   			getAllSublines(li.subLines, out);
	   	}
	   }
	   
	   private LineList getParsedCodePath(LinkedList nodes, LineList lines, int index)
	   {
	   	CodeNode parent = (CodeNode) nodes.get(index);
	   	for(int i = 0; i < parent.list.size(); i++)
	   		lines.add(parent.list.get(i));
	   	for(int i = 0; i < nodes.size(); i++)
	   	{
	   		CodeNode cn = (CodeNode) nodes.get(i);
	   		if(cn.parent != null && cn.parent == parent)
	   		{
	   			LineInfo sub = lines.getLine(cn.parentLine);
	   			getParsedCodePath(nodes, sub.subLines, i);
	   		}
	   	}
	   	return lines;
	   }

	   public String[] getCodePaths()
	   {
		   String[] rtnVal = new String[root.nPaths];
		   LinkedList path;
		   for(int i = 0; i < root.nPaths; i++)
		   {
			  path = new LinkedList();
			  path.add(root);
			  int startLevel = 0;
			  int endLevel = 1;
			  //int[] prevPathSel = new int[1];
			  root.currPath = i;
			  while(true)
			  {
				  //push the level
				  for(int j = startLevel; j < endLevel; j++)
				  {
					  CodeNode d = (CodeNode) path.get(j);
					  path.addAll(d.children);
				  }
				  startLevel = endLevel;
				  endLevel = path.size();
				  if(startLevel == endLevel)
					  break;
				  //determine the path using i
				  int childNum = 0;
				  for(int j = startLevel; j < endLevel; j++)
				  {
					  //calculate the number of subnodes on each path later than the selected path
					  //get the parent
					  CodeNode parent = (CodeNode) path.get(j);
					  parent = parent.parent;
					  
					  //calculate the number of paths later on underneath the parent
					  int prodPrev = 1;
					  CodeNode e = (CodeNode) parent.children.get(childNum);
					  for(int k = childNum; k < parent.children.size() - 1; k++)
					  {
						  CodeNode f = (CodeNode) parent.children.get(k + 1);
						  prodPrev *= f.nPaths;						
					  }
					  //System.out.println("NDI:" + startLevel + " CN:" + childNum + " PP:" + prodPrev);
					  
					  if(childNum == parent.children.size() - 1)
					  {
						//the child is the last node: just grab whatever is left from the parent
						  e.currPath = parent.currPath;
						  childNum = 0;
					  }
					  else
					  {
						//use up "path" from the parent
						  e.currPath = parent.currPath / prodPrev;
						  parent.currPath %= prodPrev;
						  childNum++;
					  }
				  }
				  //printPath();
				  //add the path, replacing using the selected nodes only
				  //NOTE: this part selects one child node, rather than set the path for all child nodes,
				  //so this part is different from above
				  for(int j = startLevel; j < endLevel; j++)
				  {
					  CodeNode d = (CodeNode) path.get(j);
					  int sum = 0;
					  for(int k = d.children.size() - 1; k >= 0; k--)
					  {
						  CodeNode e = (CodeNode) d.children.get(k);
						  sum += e.nPaths;
						  if(d.currPath < sum)
						  {
							 path.add(e);
							 e.currPath = d.currPath - sum + e.nPaths;  //e.currpath = currpath - the sum of all later paths
							 break;
						  }
					  }
				  }
				  startLevel = endLevel;
				  endLevel = path.size();
			  }
			  //printPath();
			  //System.out.println("Test:" + i + "********************************");
			  //for(int j = 0; j < path.size(); j++)
				  //System.out.println(path.get(j));
			  //System.out.println(i + "****************************");
				  rtnVal[rtnVal.length - 1 - i] = buildString(path, 0, (CodeNode) path.get(0));
			  //System.out.println(rtnVal[i]);
			  //System.out.println(i + "****************************");
		   }
		   return rtnVal;
	   }
	   
	   public void printPath()
	   {
		   int i = 0;
		   while(true)
		   {
			   CodeNode lst[] = this.levelTraverse(i);
			   if(lst.length == 0)
				   break;
			   else
			   {
				   for(int j = 0; j < lst.length; j++)
				   {
					   System.out.print(lst[j].currPath + "/" + lst[j].nPaths + "|");
				   }
				   System.out.println("");
				   i++;
			   }
		   }
	   }

	   private String buildString(LinkedList codePath, int parent, CodeNode parNode)
	   {
		   String rtnVal = "";
		   //int relLine = 0;
		   String[] all = parNode.code.split("\n");
		   int i = 0;
		   int line = 0;
		   
		   while(true)
		   {
			   boolean found = false;
			   for(int j = 0; j < codePath.size(); j++)
			   {
				   CodeNode d = (CodeNode) codePath.get(j);
				   if(d == parNode)
					   continue;
				   if(d.parentLine == parNode.absLineNo && d.relLineNo == line && d.blockType != -1)
				   {
					   found = true;   
					   rtnVal += buildString(codePath, line, d);
					   break;
				   }
				   
			   }
			   if(found == false)
			   {
				   rtnVal += all[i] + "\n";
				   i++;
				   if(i == all.length)
					   break;
			   }
			   line++;
		   }
		   return rtnVal;
	   }

	   private int sumLeaves(CodeNode c)
	   {
		   int sum = 0;
		   for(int i = 0; i < c.children.size(); i++)
		   {
			   CodeNode d = (CodeNode) c.children.get(i);
			   sumLeaves(d);
		   }
		   for(int i = 0; i < c.children.size(); i++)
		   {
			   CodeNode d = (CodeNode) c.children.get(i);
			   if(d.blockType == -1)
			   {
				   if(sum == 0)
					   sum = 1;
				   sum *= d.nPaths;
			   }
			   else
				   sum += d.nPaths;
		   }
		   if(sum == 0)
			   sum = 1;
		   c.nPaths = sum;
		   return sum;
	   }

	   private CodeNode[] levelTraverse(int level)
	   {
		   int i = 0;
		   int j = 0;
		   LinkedList list = new LinkedList();
		   list.add(root);
		   while(i < level || level == -1)
		   {
			   int k = list.size();
			   if(j == k)
				   break;
			   for(int l = j; l < k; l++)
			   {
				   CodeNode n = (CodeNode) list.get(l);
				   list.addAll(n.children);
			   }
			   j = k;
			   i++;
		   }
		   int k = 0;
		   if(level == -1)
			   k = 0;
		   else
			   k = j;
		   i = 0;
		   CodeNode arr[] = new CodeNode[list.size() - k];
		   while(k < list.size())
		   {
			   arr[i] = (CodeNode) list.get(k);
			   i++;
			   k++;
		   }
		   return arr;
	   }

	   private String printTree(int debug)
	   {
		   int i = 0;
		   String rtnVal = "//The Function Tree:\n";
	      while(true)
	      {
	    	 CodeNode[] arr = levelTraverse(i);
	    	 i++;
	    	 if(arr.length == 0)
	    		 break;
	    	 for(int j = 0; j < arr.length; j++)
	    	 {
	    		 rtnVal += ("//=======================================\n");
	    		 if(debug == 0)
	    			 rtnVal += (arr[j].toString());
	    		 else
	    		 {
	    			 rtnVal += arr[j].toString();
	    			 rtnVal += getQTCode(arr[j]).getCommentList();
	    		 }
	    		 rtnVal += ("//=======================================\n");
	    	 }
	    	 rtnVal += ("//############ End of level ####################\n");
	      }
	      rtnVal += ("//(((((((((( End of Tree )))))))))))))\n");
	      return rtnVal;
	   }
	   
	   private String getTreeInfo()
	   {
	   	int i = 0;
	   	String rtnVal = "";
	      while(true)
	      {
	    	 CodeNode[] arr = levelTraverse(i);
	    	 i++;
	    	 if(arr.length == 0)
	    		 break;
	    	 for(int j = 0; j < arr.length; j++)
	    	 {
	    		 //System.out.println("=======================================");
	    		 rtnVal += "[" + arr[j].getShortString() + "]";
	    		 //System.out.println("=======================================");
	    	 }
	    	 rtnVal += "\n";
	      }
	      return rtnVal;
	      //System.out.println("(((((((((( End of Tree )))))))))))))");
	   }
	   
//	   public void fprintTree()
//	   {
//	   int i = 0;
//	      while(true)
//	      {
//	    	 CodeNode[] arr = levelTraverse(i);
//	    	 i++;
//	    	 if(arr.length == 0)
//	    		 break;
//	    	 for(int j = 0; j < arr.length; j++)
//	    	 {
//	    		 System.out.println("=======================================");
//	    		 System.out.print(arr[j].toString());
//	    		 System.out.println("=======================================");
//	    	 }
//	    	 System.out.println("############ End of level ####################");
//	      }
//	   }
	   
	   public String getQuicktest()
	   {
	   	root.currPath = 1;
	   	calcBranchPath(root);
	   	//System.out.println(getTreeInfo());
	   	//System.out.println("==========");
	   	calcLeaves();
	   	//System.out.println(getTreeInfo());
	   	String rtnVal = /*printTree(0)*/ "";
	   	LinkedList ll = gatherAllNodes(false);
	   	LineList allLines = gatherQTCode(ll);
	   	//String rtnVal = "/*********\n" + printTree() + "\n************/\n";
	   	rtnVal += printTree(1) + allLines.outputWTDepth("   ", false);
	   	return rtnVal;
	   }
	   
	   private LinkedList gatherAllNodes(boolean debugPrint)
	   {
	   	if(debugPrint)
	   		System.out.println("===The tree of life===");
	   	LinkedList all = new LinkedList();
	   	all.push(root);
	   	if(debugPrint)
	   		System.out.println(root.currPath);
	   	int startLevel = 0;
	   	int endLevel = 1;
	   	while(startLevel != endLevel)
	   	{
	   		for(int i = startLevel; i < endLevel; i++)
	   		{
	   			CodeNode nde = (CodeNode) all.get(i);
	   			for(int j = 0; j < nde.children.size(); j++)
	   			{
	   				CodeNode d = (CodeNode) nde.children.get(j);
	   				all.add(d);
	   				if(debugPrint)
	   					System.out.print(d.currPath + "/");
	   			}
	   			if(debugPrint)
	   				System.out.print("||");
	   		}
	   		if(debugPrint)
	   			System.out.print("\n");
	   		startLevel = endLevel;
	   		endLevel = all.size();
	   	}
	   	if(debugPrint)
	   		System.out.println("===End of tree===");
	   	return all;
	   }
	   
	   private LineList getQTCode(CodeNode in)
	   { 
	   	System.out.println("Node: [" + in.getShortString() + "]\nLooking at:\n" + in.list.outputWTDepth("   ", false));
	   	return in.outputQTCode(this);
	   }
	   
	   private LineList gatherQTCode(LinkedList in)
	   {
	   	LineList[] all = new LineList[in.size()];
	   	for(int i = 0; i < in.size(); i++)
	   	{
	   		CodeNode cn = (CodeNode) in.get(i);
	   		all[i] = getQTCode(cn);
	   	}
	   	return getParsedCodePath(all);
	   }
	   
	   private void calcBranchPath(CodeNode parent)
	   {
	   	int sz = parent.children.size();
	   	for(int i = 0; i < sz; i++)
	   	{
	   		CodeNode n = (CodeNode) parent.children.get(i);
	   		int prodPrev = parent.currPath;
	   		for(int j = i + 1; j < sz; j++)
	   		{
	   			CodeNode d = (CodeNode) parent.children.get(j);
	   			prodPrev *= d.nPaths;
	   		}
	   		n.currPath = prodPrev;
	   	}
	   	for(int i = 0; i < sz; i++)
	   	{
	   		CodeNode n = (CodeNode) parent.children.get(i);
	   		if(n.children.size() > 0)
	   			calcBranchPath(n);
	   	}
	   }
	   
	   private void infixGather(CodeNode in, LinkedList ll)
	   {
	   	ll.add(in);
	   	for(int i = 0; i < in.children.size(); i++)
	   		infixGather((CodeNode) in.children.get(i), ll);
	   }
	   
	   private void calcLeaves()
	   {
	   	LinkedList all = new LinkedList();
	   	infixGather(root, all);  //this must be done with prefix OR infix traverse;
	   	//eliminate parent nodes
	   	for(int i = 0; i < all.size(); i++)
	   	{
	   		CodeNode nde = (CodeNode) all.get(i);
	   		if(nde.children.size() > 0)
	   		{
	   			//System.out.println("eliminating {" + nde.getShortString() + "}");
	   			nde.currPath = 0;
	   			all.remove(nde);
	   			i--;
	   		}
	   	}
	   	//look through the list, starting at the end, and find
	   	//component groups
	   	int currComponent = 1;
	   	int nMatches = 0;
	   	int compIndex = all.size();  //this is always one higher than the end of the list
	   	/*for(int i = 0; i < all.size(); i++)
	   	{
	   		CodeNode nde = (CodeNode) all.get(i);
	   		System.out.println(i + ":" + nde.getShortString());
	   	}
	   	System.out.println("+++++\n");*/
	   	for(int i = all.size() - 1; i >= 0; i--)
	   	{
	   		CodeNode nde = (CodeNode) all.get(i);
	   		if(currComponent == nde.currPath)
	   		{
	   			nMatches++;
	   		}
	   		else
	   		{
	   			//if you are at the end of a component group,
	   			//re-set each node in the component
	   			if(nMatches > 0)
	   			{
	   				//System.out.println("Changing Group starting at " + (i + 1) + " going to " + (compIndex - 1)); 
	   				for(int j = i + 1; j < compIndex; j++)
	   				{
	   					CodeNode n = (CodeNode) all.get(j);
	   					//System.out.print(j + ":" + n.getShortString() + " => ");
	   					n.currPath = (compIndex - j - 1) * currComponent;
	   					//System.out.println(n.getShortString());
	   				}
	   			}
	   			currComponent = nde.currPath;
	   			nMatches = 0;
	   			compIndex = i + 1;
	   			//System.out.println("compIndex changed to " + compIndex);
	   		}
	   	}
	   	if(nMatches > 0)
			{
				//System.out.println("Changing Group starting at " + 0 + " going to " + (compIndex - 1)); 
				for(int j = 0; j < compIndex; j++)
				{
					CodeNode n = (CodeNode) all.get(j);
					//System.out.print(j + ":" + n.getShortString() + " => ");
					n.currPath = (compIndex - j - 1) * currComponent;
					//System.out.println(n.getShortString());
				}
			}
	   }
	}

	public void addToTree(ClassList list, TreeStatus info, LinkedList nodeList) 
	{
		info.setCurrentMethod(this);
		if(info.getCurrentClass().getEndChar() < this.getStartChar())
		{
			info.setCurrentClass(list.findClassWithChar(this.getStartChar()));
		}
		info.getCurrentClass().methods.add(this);
	}
	
	/*
	 * genericMethodOrConstructorDecl:
	 *   typeParameters genericMethodOrConstructorDeclRest
	 *   
	 * methodDeclaration:
	 *   type ID methodDeclaratorRest
	 *   
	 * voidMethodDeclaratorRest
	 */
	public MethodInfo(ParseTree in, ParseTree info, String fromFile, Integer ci)
	{
		//System.out.println("Creating Method...");
		modifiers = VarInfo.processModifiers(info);
		
		String initNode = in.getText();
		if(initNode.equals("constructorDeclaratorRest") || initNode.equals("voidMethodDeclaratorRest"))
			in = (ParseTree) info.getChild(info.getChildCount() - 1);
		
		
		initNode = in.getText();
		//System.out.println("MethodInfo:" + initNode);
		String tpe = null;
		ParseTree restNode = null;
		int debugPath = -1;
		params = new VarList();
		if(initNode.equals("memberDecl"))
		{
			ParseTree ch1 = (ParseTree) in.getChild(0);
			if(ch1.getText().equals("void"))
			{
				//void ID mDeclRest
				//returnType = null;
				name = in.getChild(1).getText();
				tpe = "void";
				restNode = (ParseTree) in.getChild(2);
				debugPath = 0;
			}
			else
			{
				//ID constructordeclrest
				//returnType = null;
				name = ch1.getText();
				tpe = "ctor";
				restNode = (ParseTree) in.getChild(1);
				debugPath = 1;
			}
		}
		else if(initNode.equals("genericMethodOrConstructorDecl"))
		{
			//gmocd -> typeparams rest
			//deal with typeparams later
			
			ParseTree gmcdRest = (ParseTree) in.getChild(1);
			if(gmcdRest.getChildCount() == 2)
			{
				name = gmcdRest.getChild(0).getText();
				tpe = "ctor";
				restNode = (ParseTree) gmcdRest.getChild(1);
				debugPath = 2;
			}
			else
			{
				if(!gmcdRest.getChild(0).getText().equals("void"))
					tpe = ClassInfo.getTypeName((ParseTree) gmcdRest.getChild(0));
				else
					tpe = "void";
				name = gmcdRest.getChild(1).getText();
				restNode = (ParseTree) gmcdRest.getChild(2);
				debugPath = 3;
			}
		}
		else if(initNode.equals("methodDeclaration"))
		{
			//type ID rest
			tpe = ClassInfo.getTypeName((ParseTree) in.getChild(0));
			//returnType = new VarInfo();
			name = in.getChild(1).getText();
			restNode = (ParseTree) in.getChild(2);
			debugPath = 4;
		}
		else
		{
			System.err.println(initNode);
		}
		if(restNode == null)
			System.err.println("Debug Path:" + debugPath);
		//System.out.println("MI complete");
		//
		//System.out.println("returnType complete");
		processRest(restNode, tpe, name);
		otherSetup();
		//System.out.println("rest complete");
	}
	
	//methodDeclRest
	private void processRest(ParseTree in, String type, String name)
	{
		//fp []* throws qNameList
		//fp : ( formalParameterDecls )
		ParseTree fps;
		try
		{
		   fps = (ParseTree) in.getChild(0).getChild(1);
		}
		catch(NullPointerException ex)
		{
			System.err.println("EXCEPTION-1696");
			System.err.println("tree:" + in);
			System.err.println("Child0:" + in.getChild(0));
			return;
		}
		//System.out.println(in.getChild(0).getText());
		//System.out.println(fps.getText());
		//System.out.println("fps found");
		if(fps.getText().equals("formalParameterDecls"))
		{
			processParameters(fps);
		}
		//System.out.println("parameters complete");
		int i = 1;
		while(in.getChild(i).getText().equals("["))
		{
			//returnType.setType(returnType.getType() + "[]");
			type += "[]";
			i += 2;
		}
		throwsList = null;
		if(in.getChild(i).getText().equals("throws"))
		{
			throwsList = getQualifiedNames((ParseTree) in.getChild(i + 1));
			i += 2;
		}
		returnType = new VarInfo(type, name, 0);
		
	}
	
	//formalParameters
	private void processParameters(ParseTree in)
	{
		//( formalParameterDecls )
		//formalParameterDecls	:	variableModifier* type formalParameterDeclsRest?
		//	variableModifier:final or annotation
		//	formalParameterDeclsRest
		//				:	variableDeclaratorId (',' formalParameterDecls)?
		//				|   '...' variableDeclaratorId
		// variableDeclaratorId : ID ([]*)
		int i = 0;
		while(in.getChild(i).getText().equals("variableModifier"))
		{
			i++;
		}
		//System.out.println("Skipping variable modifiers");
		//ParseTree vmods = in.getChild(i);
		ParseTree type = (ParseTree) in.getChild(i);
		String tpe = ClassInfo.getTypeName(type);
		ParseTree fpdeclsRest = (ParseTree) in.getChild(i + 1);
		ParseTree vDeclId = (ParseTree) fpdeclsRest.getChild(0);
		String id = "";
		for(int j = 0; j < vDeclId.getChildCount(); j++)
			id += vDeclId.getChild(j).getText();
		params.add(new VarInfo(tpe, id, 0));
		ParseTree fpDecls = (ParseTree) fpdeclsRest.getChild(2);
		if(fpDecls != null)
			processParameters(fpDecls);
	}
	
	private String getQualifiedNames(ParseTree in)
	{
		int i = 0;
		String rtnVal = "";
		while(i < in.getChildCount())
		{
			ParseTree qName = (ParseTree) in.getChild(i);
			for(int j = 0; j < qName.getChildCount(); j++)
				rtnVal += qName.getChild(j).getText();
			if(in.getChild(i + 1) != null)
				rtnVal += ", ";
			i += 2;
		}
		return rtnVal;
	}
	
	private void otherSetup()
	{
		allLines = new LineList();
		tests = new TestList();
	}
	
	public String[] quickTest(String[][] in, ClassInfo ci, ClassList cl, LangConfig lc)
	{
		/*
		 * in[][] input structure:
		 *   in[x][0] = type
		 *   in[x][1] = param OR lineInput
		 *   in[x][2] = name
		 *   in[x][3] = value
		 */
		
		VarInfo[] ins = gatherAllInputs(ci);
		VarInfo[] inputs = reconcileInputs(in, ins);
		VarInfo[] outputs = gatherAllOutputs(cl);
		String qtFileName = "QuicktestTesting.java";
		String qtClass = writeQuicktestClass(ci, inputs, outputs, lc, cl);
		System.out.println("== The QuickTest Class ==");
		System.out.println(qtClass);
		System.out.println("== End QuickTest Class ==");
		WhiteboxUtils.writeFile(qtFileName, qtClass);
		runQuicktest(qtFileName , lc);
		return processQuicktestResults(outputs);
	}
	
	private String[] processQuicktestResults(VarInfo[] outputs)
	{
		String[] allIn = WhiteboxUtils.loadFile("qtOut.wbq");
		String[] rtnVal = new String[outputs.length + 1];
		rtnVal[0] = allIn[0];
		return rtnVal;
	}
	
	private void runQuicktest(String fName, LangConfig lc)
	{
		String debugVMFlags = "-Djava.security.policy=debug.policy -Djava.security.manager.QuicktestRunner";
		lc.runCompileCommand(fName);
		String jvF = fName.substring(fName.indexOf(".java"));
		lc.runRunCommand(debugVMFlags + " " + jvF);
	}
	
	private VarInfo[] gatherAllInputs(ClassInfo ci)
	{
		VarInfo[] p1 = TestInfo.getMethodParams(this);
		VarInfo[] p2 = TestInfo.getLineInputs(allLines, ci, p1);
		VarInfo[] rtnVal = new VarInfo[p1.length + p2.length];
		for(int i = 0; i < p1.length; i++)
			rtnVal[i] = p1[i].copy();
		for(int i = 0; i < p2.length; i++)
			rtnVal[i + p1.length] = p2[i].copy();
		return rtnVal;
	}
	
	private VarInfo[] reconcileInputs(String[][] in, VarInfo[] ins)
	{
		for(int i = 0; i < ins.length; i++)
		{
			VarInfo vi = ins[i];
			for(int j = 0; j < in.length; j++)
			{
				if(vi.getName().equals(in[j][2]))
					vi.initValue = in[j][3];
			}
		}
		return ins;
	}
	
	private VarInfo[] gatherAllOutputs(ClassList cl)
	{
		AssertionList al = TestInfo.findAssertions(allLines, cl, this);
		VarInfo[] rtnVal = new VarInfo[al.size()];
		for(int i = 0; i < al.size(); i++)
		{
			AssertionInfo ai = al.getAssertion(i);
			rtnVal[i] = ai.dataType;	
		}
		return rtnVal;
	}
	
	private String writeQuicktestClass(ClassInfo ci, VarInfo[] inputs, VarInfo[] outputs, LangConfig lc, ClassList cl)
	{
		//String rtnVal = "public class " + ci.className + "QuickTest extends " + ci.getClassTestName() + "\n";
		//rtnVal += "{\n";
		String rtnVal = "";
		//String fx = writeQuicktestFunction(ci);
		//rtnVal += writeQuicktestCtor(ci);
		ClassInfo outer = cl.findQtClass(ci);
		//rtnVal = cl.outputQTClass(outer, fx, ci);
		rtnVal += "\npublic class QuicktestTesting\n{\n";
		rtnVal += writeQuicktestMain(ci, inputs, lc, cl);
		rtnVal += "}\n";
		/*ClassList inQT = cl.getQTInstances(outer, false);
		for(int i = 0; i < inQT.size(); i++)
   	{
   		ClassInfo ci2 = inQT.getClass(i);
   		rtnVal = rtnVal.replaceAll(ci2.className, ci2.getQTClassName());
   	}*/
		return rtnVal;
	}
	
	
	
	private String writeQuicktestCtor(ClassInfo ci)
	{
		if(!returnType.getName().equals("ctor"))
			return "   " + ci.className + "QuickTest(){}\n\n";
		else
			return "";
	}
	
	private String writeQuicktestMain(ClassInfo ci, VarInfo[] inputs, LangConfig lc, ClassList cl)
	{
		String s = "   public static void main(String args[])\n";
		s += "   {\n";
		s += "      QuicktestRunner qtr = new QuicktestRunner();\n";
		s += "      QuicktestRunner.execPath = 0;\n";
		String[] y = cl.getQTInstanceChain(ci);
		s += y[0];
		
		if(returnType.getName().equals("ctor"))
			//s += "      " + ci.className + "QuickTest qt = new " + ci.className + "QuickTest(" + inputs[0].initValue;
			s += inputs[0].initValue;
		else
		{
			//s += "      " + ci.className + "QuickTest qt = new " + ci.className + "QuickTest();\n";
			s += ");\n";
			if(!returnType.getType().equals("void"))
				s += "      " + returnType.getType() + " out = " + y[1] + "." + name + "(" + inputs[0].initValue;
			else
				s += "      " + y[1] + "." + name + "(" + inputs[0].initValue;
		}
		
		for(int i = 1; i < inputs.length; i++)
			s += ", " + inputs[i].initValue;
		s += ");\n";
		s += "      String data = \"Exec Path:\" + QuicktestRunner.execPath + \"\\n----------\\n\";\n";
		s += "      data += qtr.inspectObject(c0) + \"\\n----------\\n\";\n";
		if(!returnType.getName().equals("void") && !returnType.getType().equals("void"))
		{
			if(!lc.isPrimitive(returnType.getType()))
				s += "      data += qtr.inspectObject(out);\n";
			else
				s += "      data += String.valueOf(out);\n";
		}
		s += "      WhiteboxUtils.writeFile(\"qtOut.wbq\", data);\n";
		s += "      QuicktestRunner.execPath = 0;\n";
		s += "   }\n\n";
		return s;
	}
	
	private String getFirstLine()
	{
		System.out.println(methodText);
		int y = methodText.indexOf("{");
		if(y > -1)
		{
			String x = methodText.substring(0, y - 1);
			return x;
		}
		else
			return methodText;
	}
	
	public String writeQuicktestFunction(ClassInfo ci)
	{
		String rtnVal = "";// allLines.getCommentList();
		rtnVal += getFirstLine();
		
		/*if(returnType.getName().equals("ctor"))
			//rtnVal = "   public " + ci.className + "QuickTest(";
			rtnVal = "   public " + ci.className + "(";
		else
			//rtnVal = "   public " + returnType.getType() + " quickTest(";
			rtnVal = "   public " + returnType.getType() + this.name + "(";*/
		//rtnVal  += this.params.getAsParamList() + ")\n";
		rtnVal += "   {\n";
		//rtnVal += "      String quicktestOutputs = \"\";\n";
		//rtnVal += "   int quicktestExecPath = 0;\n";
		FunctionTree ftree = new FunctionTree(this.allLines);
		//rtnVal += ftree.debugInfo;
		rtnVal += ftree.getQuicktest();
		rtnVal += "   }\n\n";
		return rtnVal;
	}
	
	private String getMappedParams(VarInfo[] in)
	{
		String rtnVal = "(";
		VarInfo[] x = TestInfo.getMethodParams(this);
		int y = in.length - x.length;
		for(int i = y; i < in.length; i++)
		{
			rtnVal += in[i].initValue;
			if(i < in.length - 1)
				rtnVal += ",";
		}
		rtnVal += ")";
		return rtnVal;
	}
	
	public boolean isEmptyCtor()
	{
		if(returnType.getType().equals("ctor") && params.size() == 0)
			return true;
		else
			return false;
	}
	
	public int quicktestTesting(int a, int b)
	{
		int rtnVal;
		if(a == 0)
			a = 1;
		else
			a++;
		if(a < b)
			return b;
		else if(b == 0)
			return 0;
		else
		{
			int m = a % b;
			switch(m)
			{
			case 0:
				rtnVal = a;
				break;
			case 1:
				rtnVal = a + 1;
				break;
			case 2:
				rtnVal = a + 4;
				break;
			default:
				rtnVal = a * b;
			}
		}
		return rtnVal;
	}
	
}


class MethodList extends LinkedList
{
   int classIndex;

   MethodList(int index)
   {
      super();
      classIndex = index;
   }

   public MethodInfo getMethod(int index)
   {
      if(index < size())
      {
         return (MethodInfo) super.get(index);
      }
      else
         return null;
   }

   public MethodInfo getFirstMethod()
   {
      return (MethodInfo) super.getFirst();
   }

   public MethodInfo getLastMethod()
   {
      return (MethodInfo) super.getLast();
   }

   public void replace(int index, MethodInfo mi)
   {
      set(index, mi);
   }

   public boolean isTest(MethodInfo mi)
   {
      String str = stripTestName(mi.name);
      if(str != null)
      {
         for(int i = 0; i < size(); i++)
         {
            if(getMethod(i).name.equals(str))
               return true;
         }
         return false;
      }
      else
         return false;
   }

   public void removeAllNonTestMethods()
   {
      int i = 0;
      while(i < size())
      {
         if(isTest(getMethod(i)))
            remove(i);
         else
            i++;
      }
   }

   private String stripTestName(String in)
   {
      int testIndex = in.lastIndexOf("Test");
      if(testIndex > 0)
         return in.substring(0, testIndex);
      else
         return null;
   }

   private int getMethodNameIndex(String in)
   {
	   int testIndex = in.lastIndexOf("Test");
	   if(testIndex > 0)
	   {
		  int in2 = in.lastIndexOf("_");
	      if(in2 < testIndex)
	    	  in2 = in.length();
		  in = in.substring(testIndex + 8, in2);
	      Integer rtnVal = Integer.parseInt(in);
	      return rtnVal.intValue();
	   }
	   return -1;
   }

   public MethodInfo getMethodForTest(String in)
   {
	  int mNumber = getMethodNameIndex(in);
      String str = stripTestName(in);
      int num = 1;
      if(str == null || mNumber == -1)
         return null;
      for(int i = 0; i < size(); i++)
      {
         if(getMethod(i).name.equals(str))
         {
        	if(mNumber == num)
               return getMethod(i);
        	else
        		num++;
         }
         else
        	 num = 1;
      }
      return null;
   }

   public MethodInfo getMethodWithName(String in)
   {
      for(int i = 0; i < size(); i++)
      {
         if(getMethod(i).name.equals(in))
            return getMethod(i);
      }
      return null;
   }
   
   public MethodInfo getMethodWithSignature(String in)
   {
   	for(int i = 0; i < size(); i++)
   	{
   		MethodInfo mi = getMethod(i);
   		if(mi.getMethodSignature().equals(in))
   			return mi;
   	}
   	return null;
   }

   public int countMethodsWithName(MethodInfo in)
   {
	   int rtnVal = 1;
	   for(int i = 0; i < size(); i++)
	   {
	      if(getMethod(i) == in)
	    	  return rtnVal;
		   if(getMethod(i).name.equals(in.name))
			   rtnVal++;
	   }
	   return rtnVal;
   }
   
   
   public void output()
   {
   	System.out.println(" Methods:");
   	for(int i = 0; i < size(); i++)
   	{
   		MethodInfo mi = this.getMethod(i);
   		System.out.println("  " + mi.name + " " + mi.startChar + " " + mi.endChar);
   		mi.allLines.output("     ", LineList.CODE);
   	}
   }
}

class VarInfo extends CodeMember
{
   private String name;
   private String type;
   String initValue;
   private String modifiers;
   private int nDimensions;
   int startLine;
   int endLine;
   int classIndex;
   VarList internalList;

   /*VarInfo(String in, int lineNo, int ci)
   {
      startLine = lineNo;
      endLine = lineNo;
      classIndex = ci;
      
      access = WhiteboxUtils.getAccessLevel(in);
      in = WhiteboxUtils.removeAccessModifiers(in);
      
      String temp = in;
      try
      {
         temp = temp.substring(0, temp.indexOf(';'));
         temp = temp.substring(0, temp.indexOf('='));
      }
      catch(StringIndexOutOfBoundsException ex)
      {}
      temp.trim();
      
      String[] vardecl = temp.split(" ");
      setType(vardecl[0]);
      setName(vardecl[1]);
      
      nDimensions = countDimensions();
      
   }*/

   VarInfo(String type, String name, int lineNo)
   {
      this.setType(type);
      this.setName(name);
      processDimensions();
      startLine = endLine = lineNo;
   }
   
   VarInfo(String type, String name, ParseTree rest, int ci, String mods)
   {
   	modifiers = mods;
   	initValue = null;
   	this.setType(type.trim());
   	this.setName(name.trim());
   	processRest(rest);
   	classIndex = ci;
   	
   	internalList = null;
   	
   }
   
   public VarInfo copy()
   {
   	return new VarInfo(getTypeWithDims(), getName(), startLine);
   }

   private int countDimensions()
   {
      String glob = getType() + getName();
      int bracketLevel = 0;
      int nDims = 0;
      for(int i = 0; i < glob.length(); i++)
      {
         if(glob.charAt(i) == '[')
            bracketLevel++;
         else if(glob.charAt(i) == ']')
         {
            bracketLevel--;
            if(bracketLevel == 0)
               nDims++;
         }
      }
      return nDims;
   }
   
   private void processDimensions()
   {
   	nDimensions = countDimensions();
   	if(name.indexOf("[") > -1)
   		name = name.substring(0, name.indexOf("["));
   	if(type.indexOf("[") > -1)
   		type = type.substring(0, type.indexOf("["));
   }

	public void addToTree(ClassList list, TreeStatus info, LinkedList nodeList) 
	{
		//System.out.println(this.getStartChar());
		//System.out.println(info.getCurrentClass().getEndChar());
		if(info.getCurrentClass().getEndChar() < this.getStartChar())
		{
			info.setCurrentClass(list.findClassWithChar(this.getStartChar()));
		}
		//info.getCurrentClass().methods.add(this);
	   info.getCurrentClass().vars.addAll(internalList);
	}
	
	/*
	 * fieldDeclaration: 
	 *  type variabledeclarators ';'
	 * variabledeclarators:
	 *  vdecl (',' vdecl)*
	 * vdecl: ID vdeclRest
	 * vdeclRest:
	 *  ('['']')+ ('=' variableInitializer)?
	 *     |	'=' variableInitializer
	 *     | 
	 */
	
	public static String processModifiers(ParseTree in)
	{
		String rtnVal = "";
		for(int i = 0; i < in.getChildCount() - 1; i++)
		{
			ParseTree xx = (ParseTree) in.getChild(i);
			ParseTree xy = (ParseTree) xx.getChild(0);
			//CommonToken tok = (CommonToken) xx.payload;
			//String tt = xx.getText();
			//if(!tt.equals("public"))
			if(!xy.getText().equals("annotation"))
				rtnVal += xy.getText() + " ";
		}
		return rtnVal;
	}
	
	private void processInitValue(ParseTree in)
	{
		initValue = new String();
		LinkedList ll = new LinkedList();
		
		//System.out.println("InitValue:" + in.getText());
		LineInfo.getTextTokens(in, ll);
		for(int i = 0; i < ll.size(); i++)
			initValue += (String) ll.get(i);
	}
	
	public VarInfo(ParseTree in, ParseTree xx, String fromfile, Integer classIndex)
	{
		//System.out.println("Making varinfo " + this.startChar + " " + this.endChar);
		//for(int i = 0; i < xx.getChildCount(); i++)
			//System.out.println(xx.getChild(i).getText());
		initValue = null;
		modifiers = processModifiers(xx);
		//System.out.println(modifiers);
		//ParseTree base = (ParseTree) in.getChild(in.getChildCount() - 1);
		//System.out.println(base.getText());
		//base = (ParseTree) base.getChild(0);
		setType(ClassInfo.getTypeName((ParseTree) in.getChild(0)));
		ParseTree info = (ParseTree) in.getChild(1);
		int i = 0;
		internalList = new VarList();
		while(i < info.getChildCount())
		{
			ParseTree info2 = (ParseTree) info.getChild(i);
			String name = info2.getChild(0).getText();
			internalList.add(new VarInfo(getType(), name, (ParseTree) info2.getChild(1), classIndex.intValue(), modifiers));
			i += 2;
		}
		
	}
	
	private void processRest(ParseTree in)
	{
		int i = 0;
		while(i < in.getChildCount())
		{
			ParseTree info = (ParseTree) in.getChild(i);
			if(info.getText().equals("["))
			{
				nDimensions++;
				i += 2;
			}
			else if(info.getText().equals("="))
			{
				i += 1;
				info = (ParseTree) in.getChild(i);
				processInitValue(info);
				System.out.println(modifiers + " " + getType() + " " + getName() + " = " + initValue);
				i++;
				//variable initializer - skip for now
			}	
		}
	}
	
	/*private void useParseTree(ParseTree in)
	{
		if(in.payload instanceof CommonToken)
		{
			CommonToken pay = (CommonToken) in.payload;
			System.out.println("  " + pay.getText() + " " + pay.getStartIndex());
			System.out.println("  " + pay.getText() + " " + pay.getStopIndex());
		}
		else
		{
			for(int i = 0; i < in.getChildCount(); i++)
			{
				useParseTree((ParseTree) in.getChild(i));
			}
		}
	}*/
	
	public void setStartChar(int in)
	{
		for(int i = 0; i < internalList.size(); i++)
		{
			CodeMember cm = internalList.getVar(i);
			cm.startChar = in;
		}
		startChar = in;
	}
	
	public void setEndChar(int in)
	{
		for(int i = 0; i < internalList.size(); i++)
		{
			CodeMember cm = internalList.getVar(i);
			cm.endChar = in;
		}
		endChar = in;
	}

	private void setName(String name) 
	{
		name = name.trim();
		if(name.startsWith("this."))
			name = name.substring(5, name.length());
		this.name = name;
		
	}

	String getName() 
	{
		return name;
	}

	private void setType(String type) 
	{
		this.type = type.trim();
	}

	String getType() 
	{
		return type;
	}
	
	String getTypeWithDims()
	{
		String rtnVal = type;
		for(int i = 0; i < nDimensions; i++)
			rtnVal += "[]";
		return rtnVal;
	}
	
	String getTypeSignature()
	{
		String rtnVal = getType();
		for(int i = 0; i < nDimensions; i++)
			rtnVal += "[]";
		rtnVal += " " + getName();
		return rtnVal;
	}
	
	String getModifiers(boolean withAccessModifiers)
	{
		String rtnVal = new String(modifiers);
		if(withAccessModifiers == false)
		{
			rtnVal = rtnVal.replaceFirst("public", "");
			rtnVal = rtnVal.replaceFirst("private", "");
			rtnVal = rtnVal.replaceFirst("protected", "");
		}
		return rtnVal;
	}
}

class VarList extends LinkedList
{

   public VarInfo getVar(int index)
   {
      return (VarInfo) super.get(index);
   }
   
   public VarInfo getVarWithName(String in)
   {
   	VarInfo rtnVal;
   	for(int i = 0; i < this.size(); i++)
   	{
   		rtnVal = getVar(i);
   		if(rtnVal.getName().equals(in))
   			return rtnVal;
   	}
   	return null;
   }

   public VarInfo getFirstVar()
   {
      return (VarInfo) super.getFirst();
   }

   public VarInfo getLastVar()
   {
      return (VarInfo) super.getLast();
   }
   
   public void output()
   {
   	System.out.println(" Vars:");
   	for(int i = 0; i < size(); i++)
   	{
   		VarInfo vi = getVar(i);
   		System.out.println("  " + vi.getType() + " " + vi.getName() + ": " + vi.startChar + " " + vi.endChar);
   	}
   }
   
   public String getAsParamList()
   {
   	String rtnVal = "";
   	for(int i = 0; i < size(); i++)
   	{
   		VarInfo vi = getVar(i);
   		//rtnVal += vi.getType();
   		//for(int j = 0; j < vi.nDimensions; j++)
   			//rtnVal += "[]";
   		rtnVal += vi.getTypeSignature() + ", ";
   	}
   	if(rtnVal.endsWith(", "))
   		rtnVal = rtnVal.substring(0, rtnVal.length() - 2);
   	return rtnVal;
   }
   
   public String publicList(String tab)
   {
   	String rtnVal = "";
   	for(int i = 0; i < size(); i++)
   	{
   		VarInfo vi = getVar(i);
   		rtnVal += tab + "public " + vi.getModifiers(false) + vi.getTypeSignature();
   		//for(int j = 0; j < vi.nDimensions; j++)
   			//rtnVal += "[]";
   		//rtnVal += " " + vi.getName();
   		if(vi.initValue != null)
   			rtnVal += " = " + vi.initValue;
   		rtnVal += ";\n";
   	}
   	return rtnVal;
   }
}

class AssertionInfo
{
   int line;
   VarInfo dataType;
   String expValue;
   String fromClass;
   //boolean isExplicit;
   boolean isReturn;
   //boolean isPrimitive;
   
   //public static final String[] PRIMITIVES;
   AssertionInfo()
   {
   	dataType = new VarInfo("", "", 0);
   	expValue = "";
   }

   AssertionInfo(String line, int lineNo, ClassList progTree)
   {
   	this();
   	String dataName = "";
   	//dataType = new VarInfo("", "", 0);
   	//System.err.println("Made Assertion: " + line);
      this.line = lineNo;
      line = line.trim();
      fromClass = "";
      if(line.startsWith("return"))
      {
         //dataName = "rtnVal";
      	VarInfo rtnT = progTree.findMethodWithChar(lineNo).returnType;
         dataType = new VarInfo(rtnT.getTypeWithDims(), "rtnVal", rtnT.startChar);
         //dataType.setName("rtnVal");
         isReturn = true;
      }
      else
      {
      	//isolate the right side
      	String oper = "";
      	for(int i = 0; i < LineInfo.ASSIGNS.length; i++)
      	{
      		if(line.indexOf(LineInfo.ASSIGNS[i]) > -1)
      			oper = LineInfo.ASSIGNS[i];
      	}
      	
         String[] equ = line.split(oper);
         dataName = equ[0].trim();
         
         //find the data type of the name
         String[] dots = dataName.split("\\.");
         String lastSection;
         if(dots.length == 0)
            lastSection = equ[0];
         else
            lastSection = dots[dots.length - 1];
         lastSection = lastSection.trim();
         String firstSection;
         if(dots.length == 0)
            firstSection = equ[0];
         else
            firstSection = dots[0];
         firstSection = firstSection.trim();
         
         if(firstSection.equals(lastSection) || firstSection.equals("this"))
         {
            fromClass = progTree.findClassWithChar(lineNo).className;
         }
         
         for(int i = 0; i < progTree.size(); i++)
         {
            ClassInfo ci = progTree.getClass(i);
            VarList vl = ci.vars;
            for(int j = 0; j < vl.size(); j++)
            {
               if(vl.getVar(j).getName().equals(firstSection) && !firstSection.equals(lastSection))
               {
                  fromClass = vl.getVar(j).getType();
               }
               if(vl.getVar(j).getName().equals(lastSection))
               {
                  dataType = vl.getVar(j);
               }
            }
         }
      }
      //dataType.name = dataName;
      //System.out.println("Found assertion on line " + lineNo + ":");
      //System.out.println("  line:" + line);
      //System.out.println("  assertion is on " + dataName + ", is of type " + dataType.type + ", and requires a |" + fromClass + "|");
   }

   /*AssertionInfo(int lineNo)  //testing purposes
   {
      line = lineNo;
   }*/

   public boolean equals(AssertionInfo ai)
   {
      if(ai.dataType.getName() == null)
         return false;
      if(dataType.getName().equals(ai.dataType.getName()) && fromClass.equals(ai.fromClass))
         return true;
      else
         return false;
   }
   
   public String outputLine(String tab)
   {
   	String[] primitives = {"int", "float", "double", "boolean", "long"};
   	String typeString = "(" + dataType.getType() + ")";
   	String valueString = expValue;
   	boolean isPrimitive = false;
   	for(int i = 0; i < primitives.length; i++)
   	{
   		if(dataType.getType().equals(primitives[i]))
   		{
   			typeString = "";
   			isPrimitive = true;
   		}
   	}
   	//dataType.setName(dataType.getName().trim());
   	String rtnVal = tab + "Assert.areEqual(" + dataType.getName() + ", " + typeString + " " + expValue + ");  // line:" + line + " fromClass:" + fromClass;
   	return rtnVal;
   }
}

class AssertionList extends LinkedList
{

   public AssertionInfo getAssertion(int index)
   {
      return (AssertionInfo) super.get(index);
   }

   public AssertionInfo getFirstAssertion()
   {
      return (AssertionInfo) super.getFirst();
   }

   public AssertionInfo getLastAssertion()
   {
      return (AssertionInfo) super.getLast();
   }   

   public boolean hasReturnAssertion()
   {
      for(int i = 0; i < size(); i++)
      {
         AssertionInfo ai = getAssertion(i);
         if(ai.isReturn)
            return true;
      }
      return false;
   }

   public void addAssertion(AssertionInfo newAssertion)
   {
      for(int i = 0; i < this.size(); i++)
      {
         AssertionInfo ai = getAssertion(i);
         if(ai.equals(newAssertion))
            return;
      }
      super.add(newAssertion);
   }

   public String getListString()
   {
      String rtnVal = "";
      for(int i = 0; i < size(); i++)
      {
         AssertionInfo ai = getAssertion(i);
         rtnVal += "line " + ai.line + ": " + ai.dataType.getName() + "\n";  
      }
      return rtnVal;
   }
   
   public void elimDuplicates()
   {
   	for(int i = 0; i < size(); i++)
   	{
   		AssertionInfo ai1 = getAssertion(i);
   		for(int j = i + 1; j < size(); j++)
   		{
   			AssertionInfo ai2 = getAssertion(j);
   			if(ai1.equals(ai2))
   			{
   				if(ai1.isReturn) //then eliminate the one with the latest line
   				{
   					if(ai1.line < ai2.line)
   						remove(ai2);
   					else
   						remove(ai1);	
   				}
   				else
   				{
   					if(ai1.line < ai2.line)  //then eliminate the one with the earliest line
   						remove(ai1);
   					else
   						remove(ai2);
   				}
   			}
   		}
   	}
   }
   
   public String getReqClasses(String tab)
   {
   	String rtnVal = "";
   	int rcIndex = 0;
   	LinkedList classes = new LinkedList();
   	for(int i = 0; i < size(); i++)
   	{
   		AssertionInfo ai = getAssertion(i);
   		if(ai.fromClass != "" && !ai.fromClass.equals("rtnVal"))
   		{
   			//find the class in the build list
   			rcIndex = -1;
   			for(int j = 0; j < classes.size(); j++)
   			{
   				String a = (String) classes.get(j);
   				if(a.equals(ai.fromClass))
   				{
   					rcIndex = j;
   					break;
   				}
   			}
		   	if(rcIndex == -1)
				{
					classes.add(ai.fromClass);
					rcIndex = classes.size() - 1;
					rtnVal += tab + ai.fromClass + "Test cls" + rcIndex + " = new " + ai.fromClass + "Test();\n";
					rtnVal += tab + " cls" + rcIndex + ".mockSetup();\n";
				}
   		}
   	}
   	return rtnVal;
   }
   
   public void setupReqClasses()
   {
   	String rtnVal = "";
   	int rcIndex = 0;
   	LinkedList classes = new LinkedList();
   	for(int i = 0; i < size(); i++)
   	{
   		AssertionInfo ai = getAssertion(i);
   		if(ai.fromClass != "")
   		{
   			//remove instances of "this"
   			
   			//find the class in the build list
   			rcIndex = -1;
   			for(int j = 0; j < classes.size(); j++)
   			{
   				String a = (String) classes.get(j);
   				if(a.equals(ai.fromClass))
   				{
   					rcIndex = j;
   					break;
   				}
   			}
   			if(rcIndex == -1)
   			{
   				classes.add(ai.fromClass);
					rcIndex = classes.size() - 1;
   			}
   			
   			//adjust the assertion's VarInfo to reflect the new class
   			VarInfo dt = ai.dataType;
   			String str = dt.getName();
   			if(ai.fromClass.equals("rtnVal"))
   			{
   				str = "rtnVal." + str;
   			}
   			else
   			{
	   			String dots[] = ai.dataType.getName().split("\\.");
	   			if(dots.length == 1)
	   				str = "cls" + rcIndex + "." + str;
	   			else
	   			{
	   				str = "cls" + rcIndex;
	   				for(int j = 1; j < dots.length; j++)
	   					str += ("." + dots[j]);
	   			}
   			}
   			ai.dataType = new VarInfo(dt.getTypeWithDims(), str, dt.startChar);
   		}
   	}
   }
}

class TestInfo
{
   int testIndex;
   String name;
   String commentName;
   boolean isExplicit;
   //boolean isUser;   //the test is a User test if the testIndex == 0
   String expectedException;
   String addlSetup;
   VarInfo[] lineInputs;
   VarInfo[] params;
   String[] inputValues;
   String postAsserts;
   int testState;
   int compileState;
   String[] testLines;
   LineList testLineList;
   String testCode;
   AssertionList asserts;
   MethodInfo assocMethod;
   int TESTPATH = 1;

   //This is for the add test
   TestInfo()
   {
      clear();
   }
   
   private void clear()
   {
   	asserts = new AssertionList();
      lineInputs = new VarInfo[0];
      params = new VarInfo[0];
      inputValues = new String[0];
      addlSetup = new String("");
      postAsserts = new String("");
   }

   TestInfo(String in, String name)
   {
	   testLines = in.split("\n");
	   asserts = new AssertionList();
   }
   
   TestInfo(LineList in, String name, ClassList cl, MethodInfo mi, int index)
   {
   	this();
   	this.name = name;
   	//testLineList = in;
   	//testLineList.group();
   	asserts = findAssertions(in, cl, mi);
   	assocMethod = mi;
   	ClassInfo temp = cl.getClass(mi.classIndex);
   	expectedException = "";
   	getInputs(in, temp, mi);
   	inputValues = new String[lineInputs.length + params.length];
   	testIndex = index + 1;
   	//addlClassSetup = new String[inputValues.length];
   	//this.testTestInfo(cl);
   }

   TestInfo(MethodInfo codeMi, String cn)
   {
	   name = codeMi.name;
	   testCode = codeMi.getLines();
	   commentName = cn;
   }
   
   TestInfo(MethodInfo mi, LineList in)
   {
   	assocMethod = mi;
   	testLineList = in;
   }
   
   public static VarInfo[] getLineInputs(LineList in, ClassInfo ci, VarInfo[] params)  //move to testInfo
	{
   	
		int strCount = 0;
		int[] usage = new int[ci.vars.size()];
		VarInfo[] allVars = new VarInfo[ci.vars.size()];
		for(int i = 0; i < ci.vars.size(); i++)
		{
			allVars[i] = ci.vars.getVar(i);
		}
		for(int k = 0; k < in.size(); k++)
		{
			LineInfo li = in.getLine(k);
			String[] rVal = li.getRValue();
			for(int i = 0; i < rVal.length; i++)
			{
				for(int j = 0; j < allVars.length; j++)
				{
					
				   if(rVal[i].equals(allVars[j].getName()))
				   {
				   	if(usage[j] == 0)
				   		strCount++;
				   	usage[j] = 1;
				   }
				}
			}
		}
		//filter out names that reference function parameters not class variables
		for(int i = 0; i < params.length; i++)
		{
			for(int j = 0; j < allVars.length; j++)
			{
				if(usage[j] > 0 && params[i].getName().equals(allVars[j].getName()))
				{
					usage[j] = 0;
					strCount--;
				}
			}
		}
		VarInfo[] rtnVal = new VarInfo[strCount];
		int x = 0;
		for(int i = 0; i < allVars.length; i++)
		{
			if(usage[i] > 0)
			{
				rtnVal[x] = allVars[i];
				x++;
			}
		}
		return rtnVal;
	}
   
   public static VarInfo[] getMethodParams(MethodInfo mi)
   {
   	VarInfo[] rtnVal = new VarInfo[mi.params.size()];
   	for(int i = 0; i < mi.params.size(); i++)
   		rtnVal[i] = mi.params.getVar(i);
   	return rtnVal;
   }
   
   private void getInputs(LineList in, ClassInfo ci, MethodInfo mi)
   {
   	params = getMethodParams(mi);
   	lineInputs = getLineInputs(in, ci, params);
   	/*String[] rtnVal = new String[lineInputs.length + methodParams.length];
   	for(int i = 0; i < lineInputs.length; i++)
   		rtnVal[i] = lineInputs[i];
   	for(int i = 0; i < methodParams.length; i++)
   		rtnVal[i + lineInputs.length] = methodParams[i];
   	return rtnVal;*/
   }
   
   //TODO: find a good way to find static vars if the method is static
   private static VarList getTestScope(ClassList cl, MethodInfo mi)
   {
   	VarList rtnVal = new VarList();
   	ClassInfo ci = cl.findClassWithMethod(mi);
   	rtnVal.addAll(ci.vars);
   	rtnVal.addAll(mi.params);
   	return rtnVal;
   }
	
   public static AssertionList findAssertions(LineList in, ClassList cl, MethodInfo mi)
   {
   	//int assertNo = 0;
   	//in.outputWTDepth("", true);
   	AssertionList rtnVal = new AssertionList();
   	VarList scope = getTestScope(cl, mi);
   	for(int i = 0; i < in.size(); i++)
   	{
   		LineInfo li = in.getLine(i);
   		AssertionInfo ai = li.yieldsAssertion(cl, mi, scope);
   		if(ai != null)
   		{
   			ai.line = li.assertionLine;
   			//System.out.println(li.lineText + " yielded\n   " + ai.outputLine(""));
   			//System.out.println("I added an assertion at line " + i);
   			rtnVal.add(ai);
   		}
   	}
   	rtnVal.elimDuplicates();
   	rtnVal.setupReqClasses();
   	return rtnVal;
   }

   String[] getTestLines()
   {
	   return testLines;
   }

   public String getIconState()
   {
      int iconState = compileState * 4 + testState;
      return("ts" + iconState + ".gif");
   }
   
   public String getNoveltyState()
   {
   	//because you are calling this function only on a newly extracted test,
   	//use the "new" test icon if it is being kept (testIndex > 0)
   	String ns = "O";
   	if(testIndex > 0)
   		ns = "N";
   	return("ts" + ns + ".gif");
   }
   
   public String getTestCode(String tab, ClassList cl)
   {
   	String rtnVal = getTestCode(tab);
   	//testMatch(rtnVal, cl);
   	return rtnVal;
   }

   public String getTestCode(String tab)
   {
   	//int nonParams = 0;
   	String ctorClass = "";
   	if(assocMethod != null)
   	{
   		if(assocMethod.returnType.getType().equals("ctor"))
   			ctorClass = assocMethod.name;
   	}
   	asserts.elimDuplicates();
   	String rtnVal = "public void " + this.name + "()\n";
   	rtnVal += "{\n";
   	rtnVal += tab + "//Class Setup\n";
   	rtnVal += asserts.getReqClasses(tab);
   	rtnVal += tab + "//Line Inputs\n";
   	for(int i = 0; i < lineInputs.length; i++)
   	{
   		String val = inputValues[i];
   		if(val == null)
   			val = "";
   		rtnVal += tab + lineInputs[i].getName() + " = " + val + ";\n";
   		/*if(inputValues[i] != null)
   			rtnVal += tab + lineInputs[i] + " = " + inputValues[i] + ";\n";*/
   	}
   	rtnVal += tab + "//Add'l Setup\n";
   	rtnVal += addlSetup + "\n";
   	rtnVal += tab + "//Test Code\n";
   	rtnVal += genMethodCall(tab);
   	for(int i = 0; i < asserts.size(); i++)
   	{
   		AssertionInfo ai = asserts.getAssertion(i);
   		rtnVal += ai.outputLine(tab) + "\n";
   	}
   	rtnVal += tab + "//Post-test\n";
   	rtnVal += postAsserts + "\n";
   	rtnVal += "}\n";
   	return rtnVal;
	   //return testCode;
   }
   
   public void testMatch(String in, ClassList cl)
   {
   	boolean mismatch = false;
   	TestInfo t2 = new TestInfo();
   	t2.gatherTestInfo(in, assocMethod, cl, lineInputs.length);
   	for(int i = 0; i < asserts.size(); i++)
   	{
   		AssertionInfo ai = asserts.getAssertion(i);
   		AssertionInfo ai2 = t2.asserts.getAssertion(i);
   		System.out.println("Assertion:" + i);
   		if(!ai.dataType.getName().equals(ai2.dataType.getName()) || !ai.dataType.getType().equals(ai2.dataType.getType()))
   		{
   			mismatch = true;
   			System.out.println("1:dataType:" + ai.dataType.getName() + ":" + ai.dataType.getType());
   			System.out.println("2:dataType:" + ai2.dataType.getName() + ":" + ai2.dataType.getType());
   		}
   		if(!ai.expValue.equals(ai2.expValue))
   		{
   			mismatch = true;
   			System.out.println("1:expValue:" + ai.expValue);
   			System.out.println("2:expValue:" + ai2.expValue);
   		}
   		
   		if(!ai.fromClass.equals(ai2.fromClass))
   		{
   			mismatch = true;
   			System.out.println("1:fromClass:" + ai.fromClass);
   			System.out.println("2:fromClass:" + ai2.fromClass);
   		}
   		if(ai.isReturn != ai2.isReturn)
   		{
   			mismatch = true;
   			System.out.println("1:isReturn:" + ai.isReturn);
   			System.out.println("2:isReturn:" + ai2.isReturn);
   		}
   		if(mismatch)
   		{
   			try{Thread.sleep(10000);}catch(Exception e){}
   		}
   		
   	}
   }
   
   public String getInputValue(int num)
   {
   	return inputValues[num];
   }
   
   private String genMethodCall(String tab)
   {
   	MethodInfo mi = assocMethod;
   	//in an empty test, assocMethod will be null
   	if(mi == null)
   		return "";
   	String rtnVal = "" + tab;
    	if(mi.returnType.getType().equals("ctor"))
   		rtnVal += mi.name + " rtnVal = new " + mi.name + "(";
    	else if(mi.returnType.getType().equals("void"))
    		rtnVal += mi.name + "(";
    	else
    		rtnVal += mi.returnType.getType() + " rtnVal = " + mi.name + "(";
    	
    	if(params.length == 0)
    		rtnVal += ")";
    	else
    	{
	   	//VarList pList = assocMethod.params;
	   	for(int i = 0; i < params.length; i++)
	   	{
	   		//VarInfo vi = (VarInfo) pList.get(i);
	   		//rtnVal += findUsableParam(vi);
	   		rtnVal += inputValues[i + lineInputs.length];
	   		if(i == params.length - 1)
	   			rtnVal += ")";
	   		else
	   			rtnVal += ",";
	   	}
    	}
   	return rtnVal + ";\n";
   }
   
   /*class valueFinder
   {
   	LineList tempLines;
   	LinkedList tempVars;
   	
   	//keeper
   	LineList findLinesWithCondition(LineList in)
   	{
   		LineList rtnVal = new LineList();
   	
   		for(int i = 0; i < in.size(); i++)
   		{
   			LineInfo li = in.getLine(i);
   			if(li.condition != null)
   				rtnVal.add(li);
   		}
   		return rtnVal;
   	}
   	
   	//this collates a list of vars - could be a dumper
   	void findVarInLine(LineInfo in)
   	{
   	   //int prevLen = tempVars.size();
   	   boolean recordOn = false;
   	   String lastVar = new String();
   		for(int i = 0; i < in.textTokens.size(); i++)
   		{
   			String tok = (String) in.textTokens.get(i);
   			//if it's not a reserved word or an operator it's a var
   			if(Character.isJavaIdentifierStart(tok.charAt(0)))
   			{
   				recordOn = true;
   				lastVar += tok;
   			}
   			else if(tok.equals(".") && recordOn == true)
   			{//append to the var
   				lastVar += tok;
   			}
   			else
   			{//store the var if there is one; if there is a ( it's not a var
   				if(!lastVar.isEmpty() && !tok.equals("("))
   				{
   					tempVars.add(lastVar);
   					lastVar = new String();
   				}
   				recordOn = false;
   			}
   		}
   		
   	}
   	
   	//this gets lines with vars in - could be a dumper
   	LineList getLinesWithVars(LineList in, LineList cond)
   	{
   		
   		LineList rtnVal = new LineList();
   		for(int i = 0; i < cond.size(); i++)
   		{
   			LineInfo li = cond.getLine(i);
   			findVarInLine(li);
   		}
   		for(int i = 0; i < in.size(); i++)
   		{
   			LineInfo li = in.getLine(i);   		
   			for(int j = 0; j < tempVars.size(); j++)
   			{
   				String tempVar = (String) tempVars.get(j);
   				if(li.lineText.indexOf(tempVar) > -1)
   					rtnVal.add(li);
   			}
   		}
   		return rtnVal;
   	}
   	
   	String getLValue(LineInfo in)
   	{
   		return null;
   	}
   	
   	String getRValue(LineInfo in)
   	{
   		return null;
   	}
   	
   	
   	LineInfo substitueVals(LineInfo in, String[] newRVals)
   	{
   		LineInfo rtnVal = new LineInfo(in);
   		for(int i = 0; i < tempVars.size(); i++)
   		{
   			String old = (String) tempVars.get(i);
   			if(rtnVal.lineText.indexOf(old) > -1 && !newRVals[i].isEmpty())
   			{
   				rtnVal.lineText.replaceAll(old, newRVals[i]);
   			}
   		}
   		return rtnVal;
   	}
   	
   	LineList substituteParams(LineList in, VarList params)
   	{
   		LineList rtnVal = new LineList();
   		LineInfo temp;
   		
   		String rVal[] = new String[tempVars.size()];
   		String lVal = "";
			for(int j = 0; j < in.size(); j++)
			{
				//boolean addLine = true;
				LineInfo li = in.getLine(j);
				lVal = getLValue(li);
				temp = substitueVals(li, rVal);
				for(int k = 0; k < tempVars.size(); k++)
				{
					if(lVal.equals((String) tempVars.get(k)))
					{
						rVal[k] = getRValue(li);
						//addLine = false;
					}
				}
				//if(addLine)
				rtnVal.add(temp);
			}
   		return rtnVal;
   	}
   	
   
   }*/
   
   /*private String findUsableParam(VarInfo var)
   {
   	LineList lst = testLineList;
   	ArrayList formula = new ArrayList();
   	//find each line with a condition to be met
   	
   	for(int i = 0; i < testLineList.size(); i++)
   	{
   		LineInfo li = testLineList.getLine(i);
   		if(containsCondition(li))
   		{
   			for(int j = 0; j < li.textTokens.size(); j++)
   				formula.add(li.textTokens.get(j));
   		}
   	}
   	for(int i = 0; i < testLineList.size(); i++)
   	{
   		LineInfo li = testLineList.getLine(i);
   		
   	
   	return "";
   }
   
   private boolean containsVar(LineInfo li, VarInfo vi)
   {
   	for(int i = 0; i < li.textTokens.size(); i++)
   	{
   		String xx = (String) li.textTokens.get(i);
   		if(xx.equals(vi.name))
   			return true;
   	}
   	return false;
   }
   
   private boolean containsCondition(LineInfo li)
   {
   	if(!li.condition.equals(""))
   	{
   		return true;
   	}
   	else
   		return false;
   }
   
   private void replaceVar(String tt, String var)
   {
   	tt = var;
   }*/

   public void setTestCode(String in)
   {
	   testCode = in;
   }

   public void setCommentName(String in)
   {
	   commentName = in;
   }

   public String getCommentName()
   {
	   return commentName;
   }

   public MethodInfo getAssocMethod()
   {
	   return assocMethod;
   }

   public void setAssocMethod(MethodInfo mi)
   {
	   assocMethod = mi;
   }
   
   public void output()
   {
   	System.out.println(name);
   	if(testLineList != null)
   	{
   		testLineList.outputWTDepth("   ", true);
   	}
   }

	public int getTestIndex() 
	{
		return testIndex;
	}

	/*public void setTestIndex(int testIndex) 
	{
		this.testIndex = testIndex;
	}*/
	
	public boolean isComplete()
	{
		for(int i = 0; i < this.inputValues.length; i++)
		{
			if(inputValues[i] == null || inputValues[i].isEmpty())
				return false;
		}
		for(int i = 0; i < asserts.size(); i++)
		{
			AssertionInfo ai = asserts.getAssertion(i);
			if(ai.expValue.isEmpty())
				return false;
		}
		return true;
	}
	
	public void gatherTestInfo(String in, MethodInfo mi, ClassList cl, int nLineInputs)
	{
		clear();
		System.out.println(in);
		lineInputs = new VarInfo[nLineInputs];
		params = new VarInfo[mi.params.size()];
		inputValues = new String[nLineInputs + mi.params.size()];
		int i = 2;
		int tempIndex = 0;
		String[] lines = in.split("\n");
		//lines 0 and 1 contain the test method name and open curly brace - no info is gathered
		//the next section is class setup info
		System.out.println("NLIs:" + nLineInputs);
		String lne = lines[i].trim();
		if(lne.startsWith("//Class Setup"))
		{
			do
			{
				i++;
				lne = lines[i].trim();
				System.out.println("Loop1: " + i + ":" + lne);
				if(lne.startsWith("//"))
					break;
				//else
					//addlClassSetup[tempIndex] += lne;
			}while(true);
			//tempIndex++;
		}
		if(lne.startsWith("//Line Inputs"))
		{
			tempIndex = 0;
			do
			{
				i++;
				lne = lines[i].trim();
				System.out.println("Loop2: " + i + ":" + lne);
				if(lne.startsWith("//"))
					break;
				else
				{
					String[] x = lne.split("=");
					this.lineInputs[tempIndex] = varLookup(x[0].trim(), mi, cl, 1);
					
					//lop off the semicolon at the end of the line
					String y = x[x.length - 1];
					y = y.substring(0, y.length() - 1);  //lop off the semicolon
					x[x.length - 1] = y;
					
					//remove the leading space
					String z = x[1];
					z = z.substring(1, z.length());
					x[1] = z;
					
					this.inputValues[tempIndex] = "";
					for(int j = 1; j < x.length; j++)
					{
						this.inputValues[tempIndex] += x[j];
						if(x.length > 2)
							this.inputValues[tempIndex] += "=";
					}
					inputValues[tempIndex] = inputValues[tempIndex].trim();
					tempIndex++;
				}
			}while(true);
		}
		System.out.println(lne);
		if(lne.startsWith("//Add'l Setup"))
		{
			do
			{
				i++;
				lne = lines[i];
				System.out.println("Loop3: " + i + ":" + lne);
				if(lne.indexOf("//Test Code") > -1)
					break;
				else
					addlSetup += lne + "\n";
			}while(true);
		}
		addlSetup = addlSetup.substring(0, addlSetup.length() - 1);
		i++;
		lne = lines[i];
		for(int j = 0; j < mi.params.size(); j++)
			this.params[j] = mi.params.getVar(j);
		System.out.println(lne);
		String pList = lne.substring(lne.indexOf("(") + 1, lne.lastIndexOf(");"));
		System.out.println("|" + pList + "|");
		//pList = pList.substring(0, pList.length());
		if(pList.length() > 0)
		{
			String[] x = pList.split(",");	
			for(int j = 0; j < x.length; j++)
				inputValues[tempIndex + j] = x[j];
		}
		//now the assertions
		do
		{
			i++;
			lne = lines[i].trim();
			System.out.println("Loop4: " + i + ":" + lne);
			if(lne.startsWith("//"))
				break;
			else if(lne.startsWith("}"))
				break;
			else
			{
				//AssertionInfo - VarInfo (name, type, nDimensions), expValue, fromClass
				AssertionInfo ai = assertionFromTestLine(lne, mi, cl, lines);
				asserts.add(ai);
				System.out.println("AI.expValue:" + ai.expValue);
				
			}
		}while(true);
		if(lne.startsWith("//Post-test"))
		{
			do
			{
				i++;
				lne = lines[i];
				System.out.println("Loop5: " + i + ":" + lne);
				if(lne.startsWith("}"))
					break;
				else
					this.postAsserts += lne + "\n";
			}while(true);
		}
		postAsserts = postAsserts.substring(0, postAsserts.length() - 1);
		asserts.setupReqClasses();
		for(int k = 0; k < asserts.size(); k++)
		{
			System.out.println("|" + asserts.getAssertion(k).expValue + "|");
		}
	}
	
	private String findClassName(String instanceName, String[] allLines)
	{
		for(int i = 0; i < allLines.length; i++)
		{
			if(allLines[i].contains(instanceName))
			{
				String x = allLines[i].trim();
				String[] y = x.split(" ");
				if(y[0].endsWith("Test"))
					y[0] = y[0].substring(0, y[0].length() - 4);
				return y[0];
			}
		}
		return null;
	}
	
	private VarInfo varLookup(String in, MethodInfo mi, ClassList cl, int mode)
	{
		ClassInfo ci = cl.findClassWithMethod(mi);
		VarInfo rtnVal = null;
		if((mode & 2) > 0)
			rtnVal = mi.params.getVarWithName(in);
		if(rtnVal == null && ((mode & 1) > 0))
			rtnVal = ci.vars.getVarWithName(in);
		return rtnVal;
	}
	
	private AssertionInfo assertionFromTestLine(String in, MethodInfo mi, ClassList cl, String[] lines)
	{
		//ClassList cl = wb.testProgram;
		AssertionInfo rtnVal = new AssertionInfo();
		//strip line down to ()s
		String sub = in.substring(in.indexOf("(") + 1, in.length() - 1);
		sub = sub.substring(0, sub.lastIndexOf(")"));
		//the actual variable is on the left, the value is on the right
		String[] vals = sub.split(",");
		for(int i = 0; i < vals.length; i++)
		{
			vals[i] = vals[i].trim();
		}
		
		if(vals[0].equals("rtnVal"))
		{
			rtnVal.fromClass = "";
			rtnVal.dataType = mi.returnType.copy();
			rtnVal.isReturn = true;
		}
		
		else
		{
			String[] dots = vals[0].split("\\.");
			//String varName = dots[dots.length - 1];
			String fromClass = "";
			for(int i = 0; i < dots.length - 1; i++)
				fromClass += dots[i] + ".";
			if(fromClass.length() > 0)
				fromClass = fromClass.substring(0, fromClass.length() - 1);
			if(fromClass.equals("rtnVal"))
				rtnVal.fromClass = fromClass;
			else
				rtnVal.fromClass = findClassName(fromClass, lines);
			
			//find the var
			//the first portion of dots is going to be a class instance name so we need to not work with that
			String initClassInstanceType = findClassName(dots[0], lines);
			System.out.println("Looking at " + initClassInstanceType + "; looking for " + dots[1]);
			ClassInfo ci = cl.findClassWithName(initClassInstanceType);
			VarInfo vi;
			for(int i = 1; i < dots.length - 1; i++)
			{
				
				vi = ci.vars.getVarWithName(dots[i]);
				ci = cl.findClassWithName(vi.getType());
				System.out.println("Looking at " + ci.className + "; looking for " + dots[i + 1]);
			}
			
			//System.out.println("Looking at " + ci.className + "; looking for " + dots[dots.length - 1]);
			vi = ci.vars.getVarWithName(dots[dots.length - 1]);
			rtnVal.dataType = vi.copy();
		}
		
		
		//extract the expected value
		if(cl.lang.isPrimitive(rtnVal.dataType.getType()))
			rtnVal.expValue = vals[1];
		else
		{
			String notinParens = vals[1].substring(vals[1].indexOf(") ") + 1, vals[1].length());
			rtnVal.expValue = notinParens;
			System.out.println("Before Trim:" + rtnVal.expValue);
			rtnVal.expValue = rtnVal.expValue.trim();
			System.out.println("After Trim:" + rtnVal.expValue);
			if(rtnVal.expValue.indexOf(")") > -1)
			{
				System.out.println("Error in expVal:");
				System.out.println("vals[1]:" + vals[1] + " nip:" + notinParens);
			}
		}
		return rtnVal;
	}
	
	/*private void testTestInfo(ClassList cl)
	{
		String[] tests = 
		{
				"FileReader fr = new FileReader(fromFile);",
		   	"BufferedReader br = new BufferedReader(fr);",
		   	"int pos = 0;",
		   	"for(int i = 0; i < methods.size(); i++)",
		   	"{",
		   	"	MethodInfo mi = methods.getMethod(i);",
		   	"	mi.methodText = \"\";",
		   	"	int s = mi.startChar;",
		   	"	int e = mi.endChar;",
		   	"	int len = e - s;",
		   	"	br.skip(s - pos);",
		   	"	pos = s;",
		   	"	for(int j = 0; j <= len; j++)",
		   	"	{",
		   	"		mi.methodText += (char) br.read();",
		   	"		pos++;",
		   	"	}",
		   	"	//this is a hack but it will do for now",
		   	"	if(mi.methodText.startsWith(\"(\"))",
		   	"	{",
		   	"		String tpe = mi.returnType.type + \" \";",
		   	"		if(tpe.equals(\"ctor \"))",
		   	"			tpe = \"\";",
		   	"		mi.methodText = tpe + mi.name + mi.methodText;",
		   	"	}",
		   	"	mi.methodText = \"   \" + mi.methodText;",
		   	"	//br.reset();",
		   	"}"
		};
		LineList ll = new LineList();
		for(int i = 0; i < tests.length; i++)
		{
			LineInfo li = new LineInfo(tests[i], 3);
			ll.add(li);
		}
		this.setupAssertions(ll, cl);
		System.exit(0);
	}*/
}

class TestList extends LinkedList
{

   public TestInfo getTest(int index)
   {
      return (TestInfo) super.get(index);
   }
   
   public String[] getNames()
   {
   	String[] rtnVal = new String[size()];
   	for(int i = 0; i < size(); i++)
   	{
   		TestInfo ti = getTest(i);
   		rtnVal[i] = ti.name;
   	}
   	return rtnVal;
   }

   public TestInfo getFirstTest()
   {
      return (TestInfo) super.getFirst();
   }

   public TestInfo getLastTest()
   {
      return (TestInfo) super.getLast();
   } 
   
   public void output()
   {
   	for(int i = 0; i < size(); i++)
   	{
   		TestInfo ti = getTest(i);
   		ti.output();
   		//System.out.println("------------------");
   	}
   }
   
   public TestList copy()
   {
   	TestList rtnVal = new TestList();
   	for(int i = 0; i < size(); i++)
   		rtnVal.add(get(i));
   	return rtnVal;
   }
   
   public void compare(TestList in, boolean preserveOld)
   {
   	int listSize = 0;
   	if(size() > in.size())
   		listSize = in.size();
   	else
   		listSize = size();
   	System.out.println("Comparing a size " + size() + " size list with a " + in.size() + " list; listSize is " + listSize);
   	for(int i = 0; i < listSize; i++)
   	{
   		String t1 = getTest(i).getTestCode("   ");
   		String t2 = in.getTest(i).getTestCode("   ");
   		if(!t1.equals(t2))
   			getTest(i).compileState = 0;
   	}
   	if(preserveOld)
   	{
   		for(int i = 0; i < in.size(); i++)
   		{
   			add(in.getTest(i));
   		}
   	}
   }
   
   public TestInfo findTestWithName(String in)
   {
   	for(int i = 0; i < size(); i++)
   	{
   		TestInfo ti = getTest(i);
   		if(ti.name.equals(in))
   			return ti;
   	}
   	return null;
   }
   
   public TestInfo[] toArray()
   {
   	TestInfo[] rtnVal = new TestInfo[size()];
   	for(int i = 0; i < size(); i++)
   	{
   		TestInfo ti = getTest(i);
   		rtnVal[i] = ti;
   	}
   	return rtnVal;
   }
}

class LineInfo extends CodeMember
{
	
	ParseTree tree;
	int branchType;
	int tabDepth;
	String lineText;
	String condition;
	LinkedList textTokens;
	LineList subLines;
	int assertionLine;
	
	static final int IF = 1;
	static final int ELSE = 2;
	static final int SWITCH = 3;
	static final int CASE = 4;
	static final int DEFAULT = 5;
	static final int TRY = 6;
	static final int TERNARY = 7;
	static final String NOWSCHARS = ".[]();:{}<>";
	static final String BLOCKSTART = "{";
	static final String BLOCKEND = "}";
	static final String[] ASSIGNS = {"+=", "++", "-=", "--", "*=", "/=", "="};
	public static final String STATIC_APPEND = ":STATIC";
	
	private void makeStatic(ParseTree in)
	{
		for(int i = 0; i < in.getChildCount(); i++)
		{
			ParseTree x = (ParseTree) in.getChild(i);
			//System.err.println(x.payload);
			//System.err.println(x.payload.getClass().getName());
			//CommonToken ct = (CommonToken) x.payload;
			if(x.payload instanceof String)
			{
				//System.err.println("Time to make it static");
				//System.err.println(x.payload);
				String str = new String((String) x.payload);
				if(str.equals("blockStatement"))
				{
					str += STATIC_APPEND;
					x.payload = str;
					//System.err.println(x.payload);
				}
				//System.err.println(x.payload);
				makeStatic(x);
			}
		}
	}
	
	/*  in: the tree it came from
	 *  info: a parse tree where additional info comes from
	 *  fromFile: the file it came from
	 *  xx (not used) - possible class index
	 */
	
	public LineInfo(ParseTree in, ParseTree info, String fromFile, Integer xx)
	{
		isStatic = false;
		
		if(info != null)
		{
			//System.err.println(info.getText());
			if(info.getText().equals("classBodyDeclaration"))
			{
				
				ParseTree ch1 = (ParseTree) info.getChild(0);
				//System.err.println(ch1.getText());
				if(ch1.getText().equals("static"))
				{
					//System.err.println("I may make this static");
					makeStatic(info);
					//isStatic = true;
				}
			}
		}
		if(in.payload.toString().endsWith(STATIC_APPEND))
			isStatic = true;
	   tree = in;
	   lineText = "";
	   for(int i = 0; i < in.getChildCount(); i++)
	   {
	   	ParseTree x = (ParseTree) in.getChild(i);
	   	//System.out.println(x.getText());
	   	if(x.getText().equals("ClassOrInterfaceDecl"))
	   	{
	   		in.deleteChild(i);
	   		i--;
	   	}
	   }
	   textTokens = new LinkedList();
	   lineText = getLineText(in, true, NOWSCHARS);
	   //System.out.println("TextTokens size: " + textTokens.size());
	   //System.out.println("Line is: " + lineText);
	   subLines = new LineList();
	   condition = "";
	   branchType = 0;
	   //processBranchType();  //moved to later processing
	}
	
	public LineInfo(String in, int tabWidth)
	{
		int i = 0;
		int spc = 0;
		tabDepth = 0;
		int l = in.length();
		if(l == 0)
		{
			tabDepth = 0;
			lineText = "";
		}
		else
		{
			//System.out.println("line size:" + l + " Line:" + in + "|");
			while(in.charAt(i) == '\t')
			{
				tabDepth++;
				i++;
				if(i == l)
					break;
				//System.out.print(i + ".");
			}
			if(i < l)
			{
				while(in.charAt(i) == ' ')
				{
					spc++;
					i++;
					if(i == l)
						break;
					//System.out.print(i + ".");
				}
			}
			tabDepth += spc / tabWidth;
			lineText = in.trim();
		}
	}
	
	public LineInfo(String in, int startC, int tabDepth)
	{
		lineText = in;
		startChar = startC;
		this.tabDepth = tabDepth;
	}
	
	private void processDo(ClassList list, TreeStatus info)
	{
		//do stmt while parexpression ;
		ParseTree cond = (ParseTree) tree.getChild(0).getChild(3);
		
		ParseTree condExp = (ParseTree) cond.getChild(1);
		String c = getLineText(condExp, false, NOWSCHARS);
		condition = c;
		lineText = "do{}";
		while(textTokens.size() > 3)
			textTokens.removeLast();
	}
	
	private void processBranchType(ClassList list, TreeStatus info)
	{
		//branchType = 0;
		ParseTree subTree = (ParseTree) tree.getChild(0);
		//String initText = ((ParseTree) textTokens.get(0)).getText();
		if(textTokens.size() == 0)
			return;
		String initText = (String) textTokens.get(0);
		if(initText.equals("do"))
		{
			System.out.println(lineText);
			processDo(list, info);
			return;
		}
		//System.out.println("IT:" + initText);
		if(initText.equals("if"))
		{
			int s = startChar;
			int e = endChar;
			branchType = IF;
			condition = getLineText((ParseTree) subTree.getChild(1), false, NOWSCHARS);
			//System.out.println("IF: " + startChar + "/" + endChar);
			//subLines = (ParseTree) tree.getChild(2);
			if(subTree.getChild(2) != null)  //there is a statement under the if
			{
				if(subTree.getChild(2).getChild(0).getText() != "block")
				{
					//break off the single-line if statement
					ParseTree n = new ParseTree("blockStmt");
					n.addChild(subTree.getChild(2));
					LineInfo li = new LineInfo(n, null, "", new Integer(0));
					li.findFit(n);
					li.addToTree(list, info, null);
					//make it no longer a part of the original if statement
					String rep = li.lineText;
					String bef = lineText.substring(0, lineText.indexOf(rep));
					String aft = lineText.substring(bef.length() + rep.length());
					this.lineText = bef + aft;
				}
			}
			if(subTree.getChild(3) != null)  //process else
			{
				ParseTree newElse = new ParseTree("elseStmt");
				LineInfo elseLine = new LineInfo(newElse, null, "", new Integer(0));
				elseLine.branchType = ELSE;
				elseLine.condition = condition;
				elseLine.findFit((ParseTree) subTree.getChild(4));
				elseLine.startChar -= 5;
				//strip the else clause from the if
				endChar = elseLine.startChar - 1;
				if(subTree.getChild(4).getChild(0).getText() != "block")
				{
					ParseTree n = new ParseTree("blockStmt");
					n.addChild(subTree.getChild(4));
					LineInfo li = new LineInfo(n, null, "", new Integer(0));
					li.findFit(n);
					e = li.endChar; 
					li.addToTree(list, info, null);
				}
				elseLine.addToTree(list, info, null);
			}
			{
				ParseTree newIf = new ParseTree("ifElseStmt");
				LineInfo ifLine = new LineInfo(newIf, null, "", new Integer(0));
				ifLine.branchType = TERNARY;
				ifLine.startChar = s - 1;
				ifLine.endChar = e;
				ifLine.addToTree(list, info, null);
			}
			if( lineText.indexOf(";else") > 0)
				lineText = lineText.substring(0, lineText.indexOf(";else"));
			else if(lineText.indexOf("}else") > 0)
				lineText = lineText.substring(0, lineText.indexOf("}else"));
			//System.out.println("After processing branch: " + this.lineText);
		}
		else if(initText.equals("switch"))
		{
			branchType = SWITCH;
			String cond2;
			condition = getLineText((ParseTree) subTree.getChild(1), false, NOWSCHARS);
			ParseTree cases = (ParseTree) subTree.getChild(3);
			//System.out.println("nCases=" + cases.getChildCount());
			for(int i = 0; i < cases.getChildCount(); i++)
			{
				ParseTree caseTree = (ParseTree) cases.getChild(i);
				//System.out.println(caseTree.getChild(0).getText());
				if(caseTree.getChild(0).getChild(0).getText().equals("default"))
				{
					cond2 = "default";
					//System.out.println("d");
				}
				else
				{
					cond2 = getLineText((ParseTree) caseTree.getChild(0).getChild(1), false, NOWSCHARS);  
				}
				LineInfo li = new LineInfo(caseTree, null, "", new Integer(0));
				li.branchType = CASE;
				li.condition = cond2;
				if(cond2.equals("default"))
				{
					//System.out.println("D");
					li.branchType = DEFAULT;
				}
				li.findFit(caseTree);
				//System.out.println("ADD CASE " + li.startChar + "/" + li.endChar);
				//add the case lines to the list of lines in the method
				li.addToTree(list, info, null);
			}
		}
		else if (initText.equals("try"))
		{
			processTryBlock(list, info);
			//these do contribute to cyclomatic complexity but it is inappropriate to
			//break it out into separate code branches; just note it and move on
			
			//10/10/08 - DO NOT change the branchtype as that breaks the function tree
			//by injecting an extra node
			
			//the cyclomatic complexity of a try block is INCREDIBLY LARGE: just ignore it for now
			//branchType = TRY;
		}
		ternaryTest(list, info);// == false)
		//{
			//branchType = 0;
		//}
	}
	
	private void processTryBlock(ClassList list, TreeStatus info)
	{
		ParseTree stmt = (ParseTree) tree.getChild(0);
		ParseTree catches = (ParseTree) stmt.getChild(2);
		ParseTree fin = null;
		int newEnd = 0;
		//find each catch statement
		if(catches.getText().equals("catches"))
		{
			for(int i = 0; i < catches.getChildCount(); i++)
			{
				ParseTree c = (ParseTree) catches.getChild(i);
				LineInfo li = new LineInfo(c, null, "", new Integer(0));
				li.findFit(c);
				li.addToTree(list, info, null);
				if(newEnd == 0)
					newEnd = li.startChar - 1;
			}
		}
		//and process the finally
		else
			fin = (ParseTree) stmt.getChild(3);
		if(fin == null && stmt.getChildCount() > 4)
			fin = (ParseTree) stmt.getChild(4);
		if(fin != null)
		{
			LineInfo li = new LineInfo(fin, null, "", new Integer(0));
			li.findFit(fin);
			li.textTokens.addFirst(new String("finally"));
			li.lineText = "finally{}";
			li.addToTree(list, info, null);
			if(newEnd == 0)
				newEnd = li.startChar - 1;
		}
		while(textTokens.size() > 3) //the line should only say "try{}"
			textTokens.remove(3);
		lineText = lineText.substring(0, 5);
		endChar = newEnd;
	}
	
	private boolean ternaryTest(ClassList list, TreeStatus info)
	{
		String[] path = {"statement", "statementExpression", "expression", "conditionalExpression"};
		ParseTree current = tree;
		for(int i = 0; i < 4; i++)
		{
			current = (ParseTree) current.getChild(0);
			if(current == null)
				return false;
			if(!(current.payload instanceof String))
				return false;
			String x = (String) current.payload;
			if(!(x.equals(path[i])))
				return false;
		}
		ParseTree qMark = (ParseTree) current.getChild(1);
		ParseTree colon = (ParseTree) current.getChild(3);
		if(qMark == null || colon == null)
			return false;
		else
		{
			//System.out.println("It's Ternary");
			condition = getLineText((ParseTree) current.getChild(0), false, NOWSCHARS);
			branchType = TERNARY;
			{  // make an ifstmt and add the first line
				ParseTree newIf = new ParseTree("ifStmt");
				LineInfo ifLine = new LineInfo(newIf, null, "", new Integer(0));
				ifLine.branchType = IF;
				ifLine.condition = condition;
				ParseTree n = new ParseTree("blockStmt");
				n.addChild(current.getChild(2));
				LineInfo li = new LineInfo(n, null, "", new Integer(0));
				li.findFit(n);
				li.addToTree(list, info, null);
				ifLine.startChar = li.startChar - 1;
				ifLine.endChar = li.endChar;
				ifLine.addToTree(list, info, null);
			}
			{  //make an else statement and add a second line 
				ParseTree newElse = new ParseTree("elseStmt");
				LineInfo elseLine = new LineInfo(newElse, null, "", new Integer(0));
				elseLine.branchType = ELSE;
				elseLine.condition = condition;
				ParseTree n2 = new ParseTree("blockStmt");
				n2.addChild(current.getChild(4));
				LineInfo li2 = new LineInfo(n2, null, "", new Integer(0));
				li2.findFit(n2);
				li2.addToTree(list, info, null);
				elseLine.startChar = li2.startChar - 1;
				elseLine.endChar = li2.endChar;
				elseLine.addToTree(list, info, null);
			}
			return true;
		}
	}
	
	public static void getTextTokens(ParseTree in, LinkedList tt)
	{
		if(in.getChildCount() == 0)
		{
			if(in.payload instanceof CommonToken)
			{
				CommonToken ct = (CommonToken) in.payload;
				tt.add(new String(ct.getText()));
			}
			/*if(tt.size() == 0)
			{
				System.out.println("For some reason I am adding " + in.payload);
				try{Thread.sleep(1000);}catch(Exception ex){}
				tt.add(in);
			}*/
		}
		else if(in.getText().equals("blockStatement") && tt.size() > 0)
			return;
		else
		{
			for(int i = 0; i < in.getChildCount(); i++)
				getTextTokens((ParseTree) in.getChild(i), tt);
		}
	}
	
	private String getLineText(ParseTree in, boolean setTokens, String noWS)
	{
		String rtnVal = "";// = depth;
		LinkedList temp = new LinkedList();
		getTextTokens(in, temp);
		if(setTokens)
		{
			textTokens = temp;
		}
		for(int i = 0; i < temp.size(); i++)
		{
			//ParseTree pt = (ParseTree) temp.get(i);
			String str = (String) temp.get(i);
			//if(pt.payload instanceof CommonToken)
			//{
				String tok = str;//pt.getText();
				boolean sp = false;
				if(noWS.indexOf(tok) > -1)
					sp = true;
				if(sp)
				{
					rtnVal = rtnVal.trim();
					rtnVal += tok;
				}
				else
					rtnVal += tok + " ";
			//}
		}
		return rtnVal;
	}

	@Override
	public void addToTree(ClassList list, TreeStatus info, LinkedList nodeList) 
	{
		//info.setCurrentMethod(this);
		//System.out.println("Adding line:" + lineText + " BT=" + branchType);
		
		if(this.isStatic)
		{
			list.staticContext.add(this);
		}
		else
		{
			/*System.out.println(getStartChar());
			System.out.println(this.lineText);
			System.out.println(list.findMethodWithChar(getStartChar()));*/
			if(info.getCurrentMethod().getEndChar() < this.getStartChar())
			{
				info.setCurrentMethod(list.findMethodWithChar(this.getStartChar()));
			}
			processBranchType(list, info);
			//System.out.println("Added to ST:" + this.toString());
			//System.out.println(info);
			//System.out.println(info.getCurrentMethod());
			//System.out.println(allLines);
			//this following line gets rid of the unneeded parse tree to save memory
			tree = null;
			info.getCurrentMethod().allLines.add(this);
		}
	}
	
	public String toString()
	{
		return super.toString() + " B:" + branchType + " :" + lineText;
	}
	
	public String getLIInformation()
	{
		return lineText + " {S:" + startChar + " E:" + endChar + " D:" + tabDepth + " BT: " + branchType + "}\n";
	}
	
	public String outputPathCode(String noWS)
	{
		String rtnVal = new String();
		//boolean outputSpace = false;
		//int cap = 0;
		switch(branchType)
		{
		case 0: case TRY: case TERNARY:
			rtnVal += this.lineText;
			break;
		case IF:
			rtnVal += "// because " + condition;
			break;
		case ELSE:
			rtnVal += "// because !" + condition;
			break;
		case SWITCH:
			rtnVal += "// switch on " + condition;
			break;
		case CASE:
			rtnVal += "// value is " + condition;
			break;
		case DEFAULT:
			rtnVal += "// all other values";
			break;
		}
		return rtnVal;
	}
	
	
	
	String[] getLValue()
	{
		int lvalLen = 0;
		for(int i = 0; i < textTokens.size(); i++)
		{
			String tok = (String) textTokens.get(i);
			for(int j = 0; j < ASSIGNS.length; j++)
			{
				if(tok.equals(ASSIGNS[j]))
				{
					lvalLen = i;
					break;
				}
			}
			if(lvalLen > 0)
				break;
		}
		String[] rtnVal = new String[lvalLen];
		for(int i = 0; i < lvalLen; i++)
		{
			rtnVal[i] = (String) textTokens.get(i);
		}
		return rtnVal;
	}
	
	String[] getRValue()
	{
		String[] lval = getLValue();
		int rvalLen = textTokens.size() - lval.length;
		String[] rtnVal = new String[rvalLen];
		for(int i = lval.length; i < textTokens.size(); i++)
			rtnVal[i - lval.length] = (String) textTokens.get(i);
		return rtnVal;
	}
	
	
	public AssertionInfo yieldsAssertion(ClassList cl, MethodInfo mi, VarList scope)
	{
		String line = this.lineText;
		//System.err.println(this.lineText);
		line = WhiteboxUtils.removeComments(line, false);
		line = line.trim();
      if(line.equals(""))
         return null;
      if(line.startsWith("return"))
         return new AssertionInfo(line, this.startChar, cl);
      
      //get the line's lvalue
      for(int k = 0; k < ASSIGNS.length; k++)
      {
      	int assgSplit = line.indexOf(ASSIGNS[k]);
      	if(assgSplit > -1)
      	{
      		String[] equ = new String[2]; //= line.split(ASSIGNS[k]);
      		equ[0] = line.substring(0, assgSplit);
      		equ[1] = line.substring(assgSplit, line.length() - 1);
      		
      		//lines with spaces in the lvalue are most likely local declarations
            if(equ[0].split(" ").length > 1)
               return null;
            else
            {
               String[] dots = equ[0].split("\\.");
               String lastSection;
               String firstSection;
               if(dots.length == 0)
               {
                  lastSection = equ[0];
                  firstSection = equ[0];
               }
               else
               {
                  lastSection = dots[dots.length - 1];
                  firstSection = dots[0];
               }
               lastSection = lastSection.trim();
               firstSection = firstSection.trim();
               
               //function calls, if statements, and loops don't yield assertions
               if(lastSection.indexOf('(') > -1)
                  return null;
               
               //lastSection has the var to look for
               System.out.println("finding: |" + lastSection + "|");
               for(int i = 0; i < cl.size(); i++)
               {
                  ClassInfo ci = cl.getClass(i);
                  VarList vl = ci.vars;
                  String assertionType = "";
               	String fromClassType = "";
                  for(int j = 0; j < vl.size(); j++)
                  {
                  	VarInfo vi = vl.getVar(j);
                     if(vi.getName().equals(lastSection))
                     {
                     	System.out.println("Class " + i + " Var " + j + " matches.");
                     	assertionType = vi.getType();
                     }
                     if(vi.getName().equals(firstSection))
                     	fromClassType = vi.getType();
                  }
                  if(!(assertionType.equals("")))
                  {
                     AssertionInfo ai = new AssertionInfo();
                     //TODO: this needs to be re-written using the constructors
                     ai.dataType = new VarInfo(assertionType, equ[0], 0);
                     //ai.dataType.setName(equ[0].trim());
                     System.out.println(ai.dataType.getName());
                     System.out.println(ai.dataType.getType());
                     //WhiteboxUtils.pause(1000);
                     //ai.dataType.setType(assertionType);
                     ///////////////////////////////////////////////////////////
                     if(dots[0].equals("this") || (firstSection.equals(lastSection)))
                     	ai.fromClass = ci.className;
                     else
                     	ai.fromClass = fromClassType;
                     if(!inScope(scope, ai.dataType, ai.fromClass, cl, ci))
                     	return null;
                     //assertions referencing values in a newly constructed class should
                     //reference the rtnVal of the constructor
                     if(mi.returnType.getType().equals("ctor") && ai.fromClass.equals(mi.returnType.getName()))
                     	ai.fromClass = "rtnVal";
                        //return new AssertionInfo(line, this.startChar, cl);
                     return ai;
                  }
               }
            }
      	}
      }
      return null;
	}
	
	private boolean inScope(VarList scope, VarInfo vi, String fromClass, ClassList cl, ClassInfo ci)
	{
		if(fromClass.isEmpty() || fromClass.equals(ci.className))
		{
			for(int i = 0; i < scope.size(); i++)
			{
				VarInfo vi2 = scope.getVar(i);
				if(vi2.getName().equals(vi.getName()) && vi2.getType().equals(vi.getType()))
					return true;
			}
			return false;
		}
		else
		{
			String classChain[] = vi.getName().split("\\.");
			for(int i = 0; i < scope.size(); i++)
			{
				VarInfo vi2 = scope.getVar(i);
				if(vi2.getName().equals(classChain[0]))
				{
					ClassInfo currClass;
					VarInfo currVar = vi2;
					for(int j = 1; j < classChain.length; j++)
					{
						currClass = cl.findClassWithName(currVar.getType());
						currVar = currClass.vars.getVarWithName(classChain[j]);
						if(currVar == null)
							return false;
					}
					return true;
				}
			}
			return false;
		}
	}
	
	public boolean isReturn()
	{
		if(textTokens == null)
			return false;
		if(textTokens.size() == 0)
			return false;
		String s = (String) textTokens.get(0);
		if(s.equals("return"))
			return true;
		else
			return false;
	}
	
	public boolean isDo()
	{
		if(textTokens == null)
			return false;
		if(textTokens.size() == 0)
			return false;
		String s = (String) textTokens.get(0);
		if(s.equals("do"))
			return true;
		else
			return false;
	}
	
	public boolean isBreak()
	{
		if(textTokens == null)
			return false;
		if(textTokens.size() == 0)
			return false;
		String s = (String) textTokens.get(0);
		if(s.equals("break"))
			return true;
		else
			return false;
	}
	
	public boolean isCase()
	{
		if(textTokens == null)
			return false;
		if(textTokens.size() == 0)
			return false;
		String s = (String) textTokens.get(0);
		String s2 = (String) textTokens.getLast();
		if((s.equals("case") || s.equals("default")) && s2.equals(":"))
			return true;
		else
			return false;
	}
	
	public LineInfo(LineInfo in)
	{
		this.branchType = in.branchType;
		this.condition = in.condition;
		this.endChar = in.endChar;
		this.isStatic = in.isStatic;
		this.lineText = in.lineText;
		this.startChar = in.startChar;
		this.subLines = new LineList();
		this.tabDepth = in.tabDepth;
		//not a strict copy, but it's not necessary as this value is only read
		this.textTokens = in.textTokens;
	}
	
	public String getPostgroup()
	{
		if(isDo())
		{
			return "while(" + condition + ");";
		}
		else
			return "";
	}
}

class LineList extends LinkedList
{
	public static final int TESTPATH = 1;
	public static final int CODE = 0;
	
	public LineInfo getLine(int index)
	{
	   return (LineInfo) super.get(index);
	}
	
	public String[] toStrArray(String initTab, boolean usePathCode)
	{
		String str = outputWTDepth(initTab, usePathCode);
		String[] rtnVal = str.split("\n");
		return rtnVal;
	}
	
	public String outputWTDepth(String initTab, boolean usePathCode)
	{
		return outputWTDepth(initTab, new RefInt(0), usePathCode);
	}
	
	public String getCommentList()
	{
		String rtnVal = "";
		rtnVal += "/***************************\n";
		rtnVal += "Processing list:\n";
		String x = commentSub(this);
		x = x.replaceAll("\\*/", "!!");
		rtnVal += x;
		rtnVal += "****************************/\n";
		return rtnVal;
	}
	
	private String commentSub(LineList in)
	{
		String rtnVal = "";
		for(int i = 0; i < in.size(); i++)
		{
			LineInfo li = in.getLine(i);
			rtnVal += li.lineText + " {S:" + li.startChar + " E:" + li.endChar + " D:" + li.tabDepth + " BT: " + li.branchType + "}\n";
			if(li.subLines != null && li.subLines.size() > 0)
			{
				rtnVal += "<sublist>\n";
				rtnVal += commentSub(li.subLines);
				rtnVal += "</sublist>\n";
			}
		}
		return rtnVal;
	}
	
	private String[] setupPostgroup()
	{
		int max = 0;
		for(int i = 0; i < size(); i++)
		{
			if(getLine(i).tabDepth > max)
				max = getLine(i).tabDepth;
		}
		String[] rtnVal = new String[max];
		for(int i = 0; i < max; i++)
			rtnVal[i] = new String();
		return rtnVal;
	}
	
	private String outputWTDepth(String initTab, RefInt depth, boolean usePathCode)
	{
	   //oldDepth = initDepth;
		String rtnVal = "";
		String[] postGroup = setupPostgroup();
		int aLine = 0;
		rtnVal += getCommentList();
		for(int i = 0; i < size(); i++)
		{
			LineInfo li = getLine(i);
			final String GROUPTOKEN = LineInfo.BLOCKSTART + LineInfo.BLOCKEND;
			boolean isGroup = false;
			//boolean isDo = false;
			if(li.lineText.endsWith(GROUPTOKEN))
			{
				//rtnVal += "//line(" + li.lineText + ") is a group\n";
				if((i + 1) < size())
				{
					LineInfo lz = getLine(i + 1);
					if(lz.tabDepth > li.tabDepth)
					{
						isGroup = true;
						li.lineText = li.lineText.substring(0, li.lineText.length() - GROUPTOKEN.length());
						
					}
				}
			}
			if(depth.getValue() < li.tabDepth)
			{
				//rtnVal += "//line depth(" + li.tabDepth + ") > depth(" + depth.getValue() + "); indenting\n"; 
				rtnVal += initTab;
				for(int j = 0; j < li.tabDepth - 1; j++)
					rtnVal += initTab;
				rtnVal += LineInfo.BLOCKSTART + "\n";
				aLine++;
			}
			while(depth.getValue() > li.tabDepth)
			{
				//rtnVal += "//line depth(" + li.tabDepth + ") < depth(" + depth.getValue() + "); outdenting\n";
				rtnVal += initTab;
				depth.decrement();
				for(int j = 0; j < depth.getValue(); j++)
					rtnVal += initTab;
				rtnVal += LineInfo.BLOCKEND + postGroup[depth.getValue()] + "\n";
				//postGroup.remove(depth.getValue());
				aLine++;
			}
			rtnVal += initTab;
			for(int j = 0; j < li.tabDepth; j++)
				rtnVal += initTab;
			if(usePathCode == true)
				rtnVal += li.outputPathCode(LineInfo.NOWSCHARS);// + "\n";
			else
				rtnVal += li.lineText;// + "\n";
			rtnVal += " //S:" + li.startChar + "   E:" + li.endChar + " D: " + li.tabDepth + "BT: " + li.branchType + "\n";
			
			depth.setValue(li.tabDepth);
			if(isGroup)
			{
				li.lineText += GROUPTOKEN;
				postGroup[li.tabDepth] = li.getPostgroup();
			}
			li.assertionLine = aLine;
			
			
			
			
			
			aLine++;
			/*if(li.subLines != null)
			{
				if(li.subLines.size() > 0)
				{
					System.out.println("Sublines in output:" + li.subLines.size());
					rtnVal += li.subLines.outputWTDepth(initTab, depth, usePathCode);
					
				}
			}*/
		}
		//put in the closing cascade of closing stuff at the end
		while(depth.getValue() > 0)
		{
			rtnVal += initTab;
			depth.decrement();
			for(int j = 0; j < depth.getValue(); j++)
				rtnVal += initTab;
			rtnVal += LineInfo.BLOCKEND;
			//if(depth.getValue() > 0)
			//{
			rtnVal += postGroup[depth.getValue()] + "\n";
				//postGroup.remove(depth.getValue());
			//}
			//else
				//rtnVal += "\n";
		}
		return rtnVal;
	}
	
	public void output(String tab, int outputType)
	{
		//System.out.println(tab + "LineList size = " + size());
		//group();
		
		final String GROUPTOKEN = LineInfo.BLOCKSTART + LineInfo.BLOCKEND;
		boolean isGroup = false;
		for(int i = 0; i < size(); i++)
		{
			LineInfo li = getLine(i);
			if(li.lineText.endsWith(GROUPTOKEN))
			{
				isGroup = true;
				//System.out.println(li.lineText + " is a group ");
				li.lineText = li.lineText.substring(0, li.lineText.length() - GROUPTOKEN.length());
			}
			switch(outputType)
			{
			case CODE:
				System.out.println(tab + li.lineText + ":" + li.getStartChar() + " " + li.getEndChar() + " " + li.tabDepth);
				break;
			case TESTPATH:
				//group();
				System.out.println(tab + li.outputPathCode(".;[]():"));
				break;
			}
			if(isGroup)
				System.out.println(tab + LineInfo.BLOCKSTART);
			li.subLines.output(tab + "   ", outputType);
			if(isGroup)
			{
				System.out.println(tab + LineInfo.BLOCKEND);
				li.lineText += GROUPTOKEN;
			}
			isGroup = false;
		}
	}
	
	public void group()
	{
		sort();
		//System.out.println("grouping:" + this.size());
		
		for(int i = 0; i < size(); i++)
		{
			LineInfo li = getLine(i);
			//System.out.println("   " + li.toString());
			int min = li.startChar;
			int max = li.endChar;
			int baseDepth = li.tabDepth;
			for(int j = i + 1; j < size(); j++)
			{
				LineInfo li2 = getLine(j);
				li2.tabDepth = baseDepth;
				if(li2.startChar > min && li2.endChar <= max)
				{
					if(li.lineText != "")
					{
						li2.tabDepth++;
						//System.out.println(li.lineText);
					}
					//else
						//System.out.println("NoTabDepth");
					li.subLines.add(li2);
					remove(j);
					j--;
				}
			}
			li.subLines.group();
		}
		
	}
	
	public void sort()
	{
		//System.out.println("sorting");
		for(int i = 0; i < size(); i++)
		{
			for(int j = i + 1; j < size(); j++)
			{
				LineInfo li = getLine(i);
				LineInfo li2 = getLine(j);
				if(li.startChar > li2.startChar)
				{
					set(i, li2);
					set(j, li);
				}
			}
		}
	}
}

class Preamble extends CodeMember
{
	String val;
	
	Preamble(ParseTree in, ParseTree xx, String fromFile, Integer classIndex)
	{
		//System.out.println("Making payload:");
		val = "";
		int sChar = -1;
		int eChar = 0;
		for(int i = 0; i < in.getChildCount(); i++)
		{
			ParseTree x = (ParseTree) in.getChild(i);
			if(x != null)
			{
				//System.out.println(x.payload);
				CommonToken xo = (CommonToken) x.payload;
				val += xo.getText();
				if(i == 0)
					val += " ";
			}
		}
	}

	public void addToTree(ClassList list, TreeStatus info, LinkedList nodeList) 
	{
		info.getPreambles().add(this);
	}
}

class PreambleList extends LinkedList
{
	public Preamble getPreamble(int index)
	{
	   return (Preamble) super.get(index);
	}
	
	public String listAll(String pre)
	{
		String rtnVal = "";
		for(int i = 0; i < this.size(); i++)
		{
			rtnVal += pre + getPreamble(i).val + " " + getPreamble(i).startChar + " " + getPreamble(i).endChar + "\n";
		}
		return rtnVal;
	}
	
	public void output()
	{
		System.out.println(" Imports:");
		System.out.print(listAll("  "));
	}
	
	public String dumpList()
	{
		String rtnVal = "";
		for(int i = 0; i < size(); i++)
		{
			rtnVal += getPreamble(i).val + "\n";
		}
		return rtnVal  + "\n";
	}
}

class TreeStatus
{
	private PreambleList preambles;
	private ClassInfo currentClass;
	private MethodInfo currentMethod;
	
	TreeStatus()
	{
		preambles = new PreambleList();
		currentClass = null;
		currentMethod = null;
	}
	
	public PreambleList getPreambles() 
	{
		return preambles;
	}
	
	public void setPreambles(PreambleList preambles) 
	{
		this.preambles = preambles;
	}
	
	public ClassInfo getCurrentClass() 
	{
		return currentClass;
	}
	
	public void setCurrentClass(ClassInfo currentClass) 
	{
		this.currentClass = currentClass;
	}
	
	public MethodInfo getCurrentMethod() 
	{
		return currentMethod;
	}
	
	public void setCurrentMethod(MethodInfo currentMethod) 
	{
		this.currentMethod = currentMethod;
	}
}

abstract class CodeMember
{	
	int startChar;
	int endChar;
	boolean isStatic;
	
	public int getStartChar()
	{
		return startChar;
	}
	
	public int getEndChar()
	{
		return endChar;
	}
	
	abstract public void addToTree(ClassList list, TreeStatus info, LinkedList nodeList);

	public void setStartChar(int startChar) 
	{
		this.startChar = startChar;
	}
	
	public void findFit(ParseTree in)
	{
		//startChar = -1;
		for(int i = 0; i < in.getChildCount(); i++)
		{
			ParseTree x = (ParseTree) in.getChild(i);
			findFit(x);
		}
		if(in.payload instanceof CommonToken)
		{
			CommonToken tok = (CommonToken) in.payload;
			int s = tok.getStartIndex();
			int e = tok.getStopIndex();
			//System.out.println("FF S:" + s + " E:" + e);
			if(s < startChar || startChar == 0)
				startChar = s;
			if(e > endChar)
				endChar = e;
		}
	}

	public void setEndChar(int endChar) 
	{
		this.endChar = endChar;
	}
	
	public String toString()
	{
		return super.toString() + " S:" + startChar + " E:" + endChar;
	}
}

/******************************************
 * 
 * @author Aaron
 * A basic terminal represents a lexer token in the parse stream.
 * Examples are: 5.6, int, IDENT, {, 
 * 
 * We need to extract the start and end characters of these
 * so that we know what parser tokens to trim from the overall tree.
 */
class BasicTerminal extends CodeMember
{
	BasicTerminal(ParseTree in)
	{
		CommonToken tok = (CommonToken) in.payload;
		startChar = tok.getStartIndex();
		endChar = tok.getStopIndex();
	}
	
	public void addToTree(ClassList list, TreeStatus info, LinkedList nodeList)
	{
		//throw new WTF are you doing?!? exception
	}
}

/*
 * A basic non-terminal represents a parser token in a parse stream.
 * Examples are IfStatement, Expr, SwitchStatement, MethodDeclaratorRest
 * 
 * We merely need a placeholder from these; the start and end will be
 * determined by the lexer tokens they have in WhiteboxProgram.walkParseTree();
 */
class BasicNonTerminal extends CodeMember
{
	String nodeType;
	
	BasicNonTerminal(ParseTree in)
	{
		nodeType = in.getText();
	}
	
	public void addToTree(ClassList list, TreeStatus info, LinkedList nodeList)
	{
		//throw new WTF are you doing?!? exception
	}
}

class MethodTextInfo extends CodeMember
{
	boolean useMe;
	
	MethodTextInfo(ParseTree in, ParseTree info, String fromFile, Integer xx)
	{
		//we want to restrict creation of these to actual methods so let's filter
		//out creation on non-method parse trees 
		useMe = true;
		ParseTree a = (ParseTree) in.getChild(0);
		if(a.getText().equals("static"))
		{
			useMe = false;
			return;
		}
		ParseTree b = (ParseTree) a.getChild(a.getChildCount() - 1);
		String[] bad = {"fieldDeclaration", "interfaceDeclaration", "classDeclaration"};
		for(int i = 0; i < bad.length; i++)
		{
			if(b.getText().equals(bad[i]))
			{
				useMe = false;
				return;
			}
		}
	}

	@Override
	public void addToTree(ClassList list, TreeStatus info, LinkedList nodeList) 
	{
		if(useMe)
		{
			//the method will not be in the classList because it has not been added yet
			//(MTIs come before the actual methods in the list)
			//so we need to look forward in the list for the method this needs to be
			//assigned to
			for(int i = 0; i < nodeList.size(); i++)
			{
				Object obj = nodeList.get(i);
				if(obj instanceof MethodInfo)
				{
					MethodInfo mi = (MethodInfo) obj;
					if(mi.endChar == endChar)
					{
						mi.mti = this;
						System.out.println("MTI: I found my method!");
						return;
					}
				}
			}	
		}
	}
}

