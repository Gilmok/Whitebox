import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class MethodInfoTest extends CodeMemberTest
{
   public String name;
   public VarListTest params;
   public String modifiers;
   public VarInfoTest returnType;
   public String throwsList;
   public int startLine;
   public int endLine;
   public String methodText;
   public AssertionListTest asserts;
   public LineListTest allLines;
   public TestListTest tests;
   public int compileState;
   public int testState;
   public int classIndex;
   public int complexity;
   public CodeMemberTest src;
   public MethodTextInfoTest mti;

   public String getMethodSignature()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String rtnVal = name + "("; {S:18064 E:18090 D:0 BT: 0}
rtnVal += params.getAsParamList(); {S:18302 E:18335 D:0 BT: 0}
return rtnVal + ")"; {S:18342 E:18361 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = name + "("; {S:18064 E:18090 D:0 BT: 0}
rtnVal += params.getAsParamList(); {S:18302 E:18335 D:0 BT: 0}
return rtnVal + ")"; {S:18342 E:18361 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = name + "("; {S:18064 E:18090 D:0 BT: 0}
rtnVal += params.getAsParamList(); {S:18302 E:18335 D:0 BT: 0}
return rtnVal + ")"; {S:18342 E:18361 D:0 BT: 0}
****************************/
   String rtnVal = name + "("; //S:18064   E:18090 D: 0BT: 0
   rtnVal += params.getAsParamList(); //S:18302   E:18335 D: 0BT: 0
   return rtnVal + ")"; //S:18342   E:18361 D: 0BT: 0
   }

   public void end(int lineNo)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
endLine = lineNo; {S:18416 E:18432 D:0 BT: 0}
****************************/
/***************************
Processing list:
endLine = lineNo; {S:18416 E:18432 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
endLine = lineNo; {S:18416 E:18432 D:0 BT: 0}
****************************/
   endLine = lineNo; //S:18416   E:18432 D: 0BT: 0
   }

   public void setLines(String[] in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
for(int i = 0;i<in.length;i ++)allLines.add(new LineInfoTest(in[i], 3)); {S:18512 E:18589 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<in.length;i ++)allLines.add(new LineInfoTest(in[i], 3)); {S:18512 E:18589 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<in.length;i ++)allLines.add(new LineInfoTest(in[i], 3)); {S:18512 E:18589 D:0 BT: 0}
****************************/
   for(int i = 0;i<in.length;i ++)allLines.add(new LineInfoTest(in[i], 3)); //S:18512   E:18589 D: 0BT: 0
   }

   public void setLines(String in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String[]lines = in.split("\n"); {S:18671 E:18702 D:0 BT: 0}
setLines(lines); {S:18711 E:18726 D:0 BT: 0}
****************************/
/***************************
Processing list:
String[]lines = in.split("\n"); {S:18671 E:18702 D:0 BT: 0}
setLines(lines); {S:18711 E:18726 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String[]lines = in.split("\n"); {S:18671 E:18702 D:0 BT: 0}
setLines(lines); {S:18711 E:18726 D:0 BT: 0}
****************************/
   String[]lines = in.split("\n"); //S:18671   E:18702 D: 0BT: 0
   setLines(lines); //S:18711   E:18726 D: 0BT: 0
   }

   public String getLines()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return methodText; {S:19083 E:19100 D:0 BT: 0}
****************************/
/***************************
Processing list:
return methodText; {S:19083 E:19100 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return methodText; {S:19083 E:19100 D:0 BT: 0}
****************************/
   return methodText; //S:19083   E:19100 D: 0BT: 0
   }

   public boolean isSame(MethodInfoTest other)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return true; {S:19414 E:19425 D:0 BT: 0}
****************************/
/***************************
Processing list:
return true; {S:19414 E:19425 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return true; {S:19414 E:19425 D:0 BT: 0}
****************************/
   return true; //S:19414   E:19425 D: 0BT: 0
   }

   public String getMethodText()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return methodText; {S:19482 E:19499 D:0 BT: 0}
****************************/
/***************************
Processing list:
return methodText; {S:19482 E:19499 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return methodText; {S:19482 E:19499 D:0 BT: 0}
****************************/
   return methodText; //S:19482   E:19499 D: 0BT: 0
   }

   public void setTestState(int x)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
testState = x; {S:19633 E:19646 D:0 BT: 0}
****************************/
/***************************
Processing list:
testState = x; {S:19633 E:19646 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
testState = x; {S:19633 E:19646 D:0 BT: 0}
****************************/
   testState = x; //S:19633   E:19646 D: 0BT: 0
   }

   public void setCompileState(int x)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
compileState = x; {S:19708 E:19724 D:0 BT: 0}
****************************/
/***************************
Processing list:
compileState = x; {S:19708 E:19724 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
compileState = x; {S:19708 E:19724 D:0 BT: 0}
****************************/
   compileState = x; //S:19708   E:19724 D: 0BT: 0
   }

   public String getIconState()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
int iconState = compileState * 4 + testState; {S:19780 E:19824 D:0 BT: 0}
return("ts" + iconState + ".gif"); {S:19833 E:19866 D:0 BT: 0}
****************************/
/***************************
Processing list:
int iconState = compileState * 4 + testState; {S:19780 E:19824 D:0 BT: 0}
return("ts" + iconState + ".gif"); {S:19833 E:19866 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int iconState = compileState * 4 + testState; {S:19780 E:19824 D:0 BT: 0}
return("ts" + iconState + ".gif"); {S:19833 E:19866 D:0 BT: 0}
****************************/
   int iconState = compileState * 4 + testState; //S:19780   E:19824 D: 0BT: 0
   return("ts" + iconState + ".gif"); //S:19833   E:19866 D: 0BT: 0
   }

   public String stripTestName(String in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
int testIndex = in.lastIndexOf("Test"); {S:19932 E:19970 D:0 BT: 0}
****************************/
/***************************
Processing list:
int testIndex = in.lastIndexOf("Test"); {S:19932 E:19970 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:19978 E:20075 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:19978 E:20075 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(testIndex>0)else return null; {S:19979 E:20058 D:0 BT: 1}
return in.substring(0 , testIndex); {S:20007 E:20040 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(testIndex>0){} {S:19979 E:20058 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:20007 E:0 D:1 BT: 0}
return in.substring(0 , testIndex); {S:20007 E:20040 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:20059 E:20075 D:0 BT: 2}
return null; {S:20064 E:20075 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:20059 E:20075 D:0 BT: 2}
return null; {S:20064 E:20075 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int testIndex = in.lastIndexOf("Test"); {S:19932 E:19970 D:0 BT: 0}
 {S:19978 E:20075 D:0 BT: 7}
if(testIndex>0){} {S:19979 E:20058 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:20007 E:0 D:1 BT: 0}
return in.substring(0 , testIndex); {S:20007 E:20040 D:1 BT: 0}
else{} {S:20059 E:20075 D:0 BT: 2}
return null; {S:20064 E:20075 D:1 BT: 0}
****************************/
   int testIndex = in.lastIndexOf("Test"); //S:19932   E:19970 D: 0BT: 0
    //S:19978   E:20075 D: 0BT: 7
   if(testIndex>0) //S:19979   E:20058 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:20007   E:0 D: 1BT: 0
      return in.substring(0 , testIndex); //S:20007   E:20040 D: 1BT: 0
   }
   else //S:20059   E:20075 D: 0BT: 2
   {
      return null; //S:20064   E:20075 D: 1BT: 0
   }
   }

   public String getTestFirstLine()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
String line = ""; {S:20454 E:20470 D:0 BT: 0}
line += "(" + params.getAsParamList()+ ")"; {S:20611 E:20654 D:0 BT: 0}
return line; {S:20661 E:20672 D:0 BT: 0}
****************************/
/***************************
Processing list:
String line = ""; {S:20454 E:20470 D:0 BT: 0}
line += "(" + params.getAsParamList()+ ")"; {S:20611 E:20654 D:0 BT: 0}
return line; {S:20661 E:20672 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:20476 E:20604 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:20476 E:20604 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(returnType.getType().equals("ctor"))else line += returnType.getType()+ " " + name; {S:20477 E:20557 D:0 BT: 1}
line += name + "Tests"; {S:20523 E:20545 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(returnType.getType().equals("ctor")){} {S:20477 E:20557 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:20523 E:0 D:1 BT: 0}
line += name + "Tests"; {S:20523 E:20545 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:20558 E:20604 D:0 BT: 2}
line += returnType.getType()+ " " + name; {S:20563 E:20604 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:20558 E:20604 D:0 BT: 2}
line += returnType.getType()+ " " + name; {S:20563 E:20604 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String line = ""; {S:20454 E:20470 D:0 BT: 0}
 {S:20476 E:20604 D:0 BT: 7}
if(returnType.getType().equals("ctor")){} {S:20477 E:20557 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:20523 E:0 D:1 BT: 0}
line += name + "Tests"; {S:20523 E:20545 D:1 BT: 0}
else{} {S:20558 E:20604 D:0 BT: 2}
line += returnType.getType()+ " " + name; {S:20563 E:20604 D:1 BT: 0}
line += "(" + params.getAsParamList()+ ")"; {S:20611 E:20654 D:0 BT: 0}
return line; {S:20661 E:20672 D:0 BT: 0}
****************************/
   String line = ""; //S:20454   E:20470 D: 0BT: 0
    //S:20476   E:20604 D: 0BT: 7
   if(returnType.getType().equals("ctor")) //S:20477   E:20557 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:20523   E:0 D: 1BT: 0
      line += name + "Tests"; //S:20523   E:20545 D: 1BT: 0
   }
   else //S:20558   E:20604 D: 0BT: 2
   {
      line += returnType.getType()+ " " + name; //S:20563   E:20604 D: 1BT: 0
   }
   line += "(" + params.getAsParamList()+ ")"; //S:20611   E:20654 D: 0BT: 0
   return line; //S:20661   E:20672 D: 0BT: 0
   }

   public String extractParsedTests(ClassListTest cl)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:21175 E:21193 D:0 BT: 0}
String n = allLines.getCommentList(); {S:21200 E:21236 D:0 BT: 0}
FunctionTreeTest tree = new FunctionTreeTest(allLines); {S:21243 E:21289 D:0 BT: 0}
complexity = tree.root.nPaths; {S:21409 E:21438 D:0 BT: 0}
rtnVal += this.name + ": " + tree.root.nPaths + "\n"; {S:21468 E:21520 D:0 BT: 0}
rtnVal += tree.getTreeInfo(); {S:21539 E:21567 D:0 BT: 0}
rtnVal += "=====================\n"; {S:21577 E:21612 D:0 BT: 0}
System.out.println(this.name + ": processing " + tree.root.nPaths + " paths."); {S:21888 E:21966 D:0 BT: 0}
for(int i = 0;i<tree.root.nPaths;i ++){} {S:21974 E:22587 D:0 BT: 0}
<sublist>
LineListTest fx = tree.getParsedCodePath(i); {S:22142 E:22181 D:1 BT: 0}
TestInfoTest ti = new TestInfoTest(fx , name + "Test_" + i , cl , this , i); {S:22193 E:22256 D:1 BT: 0}
tests.add(ti); {S:22337 E:22350 D:1 BT: 0}
</sublist>
return rtnVal; {S:22842 E:22855 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:21175 E:21193 D:0 BT: 0}
String n = allLines.getCommentList(); {S:21200 E:21236 D:0 BT: 0}
FunctionTreeTest tree = new FunctionTreeTest(allLines); {S:21243 E:21289 D:0 BT: 0}
complexity = tree.root.nPaths; {S:21409 E:21438 D:0 BT: 0}
rtnVal += this.name + ": " + tree.root.nPaths + "\n"; {S:21468 E:21520 D:0 BT: 0}
rtnVal += tree.getTreeInfo(); {S:21539 E:21567 D:0 BT: 0}
rtnVal += "=====================\n"; {S:21577 E:21612 D:0 BT: 0}
System.out.println(this.name + ": processing " + tree.root.nPaths + " paths."); {S:21888 E:21966 D:0 BT: 0}
for(int i = 0;i<tree.root.nPaths;i ++){} {S:21974 E:22587 D:0 BT: 0}
<sublist>
LineListTest fx = tree.getParsedCodePath(i); {S:22142 E:22181 D:1 BT: 0}
TestInfoTest ti = new TestInfoTest(fx , name + "Test_" + i , cl , this , i); {S:22193 E:22256 D:1 BT: 0}
tests.add(ti); {S:22337 E:22350 D:1 BT: 0}
</sublist>
return rtnVal; {S:22842 E:22855 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:21301 E:21402 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:21301 E:21402 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:21621 E:21802 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:21621 E:21802 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(! n.equals(allLines.getCommentList())) {S:21302 E:21402 D:0 BT: 1}
throw new RuntimeException("Method line data lost\n"); {S:21349 E:21402 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(! n.equals(allLines.getCommentList())){} {S:21302 E:21402 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:21349 E:0 D:1 BT: 0}
throw new RuntimeException("Method line data lost\n"); {S:21349 E:21402 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(tree.root.nPaths>500){} {S:21622 E:21802 D:0 BT: 1}
System.out.println(this.name + " has exceeded the complexity threshold.  Skipping test extraction."); {S:21668 E:21768 D:1 BT: 0}
return rtnVal; {S:21779 E:21792 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(tree.root.nPaths>500){} {S:21622 E:21802 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:21668 E:0 D:1 BT: 0}
System.out.println(this.name + " has exceeded the complexity threshold.  Skipping test extraction."); {S:21668 E:21768 D:1 BT: 0}
return rtnVal; {S:21779 E:21792 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:21175 E:21193 D:0 BT: 0}
String n = allLines.getCommentList(); {S:21200 E:21236 D:0 BT: 0}
FunctionTreeTest tree = new FunctionTreeTest(allLines); {S:21243 E:21289 D:0 BT: 0}
 {S:21301 E:21402 D:0 BT: 7}
if(! n.equals(allLines.getCommentList())){} {S:21302 E:21402 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:21349 E:0 D:1 BT: 0}
throw new RuntimeException("Method line data lost\n"); {S:21349 E:21402 D:1 BT: 0}
complexity = tree.root.nPaths; {S:21409 E:21438 D:0 BT: 0}
rtnVal += this.name + ": " + tree.root.nPaths + "\n"; {S:21468 E:21520 D:0 BT: 0}
rtnVal += tree.getTreeInfo(); {S:21539 E:21567 D:0 BT: 0}
rtnVal += "=====================\n"; {S:21577 E:21612 D:0 BT: 0}
 {S:21621 E:21802 D:0 BT: 7}
if(tree.root.nPaths>500){} {S:21622 E:21802 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:21668 E:0 D:1 BT: 0}
System.out.println(this.name + " has exceeded the complexity threshold.  Skipping test extraction."); {S:21668 E:21768 D:1 BT: 0}
return rtnVal; {S:21779 E:21792 D:1 BT: 0}
System.out.println(this.name + ": processing " + tree.root.nPaths + " paths."); {S:21888 E:21966 D:0 BT: 0}
for(int i = 0;i<tree.root.nPaths;i ++){} {S:21974 E:22587 D:0 BT: 0}
<sublist>
LineListTest fx = tree.getParsedCodePath(i); {S:22142 E:22181 D:1 BT: 0}
TestInfoTest ti = new TestInfoTest(fx , name + "Test_" + i , cl , this , i); {S:22193 E:22256 D:1 BT: 0}
tests.add(ti); {S:22337 E:22350 D:1 BT: 0}
</sublist>
LineListTest fx = tree.getParsedCodePath(i); {S:22142 E:22181 D:1 BT: 0}
TestInfoTest ti = new TestInfoTest(fx , name + "Test_" + i , cl , this , i); {S:22193 E:22256 D:1 BT: 0}
tests.add(ti); {S:22337 E:22350 D:1 BT: 0}
return rtnVal; {S:22842 E:22855 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:21175   E:21193 D: 0BT: 0
   String n = allLines.getCommentList(); //S:21200   E:21236 D: 0BT: 0
   FunctionTreeTest tree = new FunctionTreeTest(allLines); //S:21243   E:21289 D: 0BT: 0
    //S:21301   E:21402 D: 0BT: 7
   if(! n.equals(allLines.getCommentList())) //S:21302   E:21402 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:21349   E:0 D: 1BT: 0
      throw new RuntimeException("Method line data lost\n"); //S:21349   E:21402 D: 1BT: 0
   }
   complexity = tree.root.nPaths; //S:21409   E:21438 D: 0BT: 0
   rtnVal += this.name + ": " + tree.root.nPaths + "\n"; //S:21468   E:21520 D: 0BT: 0
   rtnVal += tree.getTreeInfo(); //S:21539   E:21567 D: 0BT: 0
   rtnVal += "=====================\n"; //S:21577   E:21612 D: 0BT: 0
    //S:21621   E:21802 D: 0BT: 7
   if(tree.root.nPaths>500) //S:21622   E:21802 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:21668   E:0 D: 1BT: 0
      System.out.println(this.name + " has exceeded the complexity threshold.  Skipping test extraction."); //S:21668   E:21768 D: 1BT: 0
      return rtnVal; //S:21779   E:21792 D: 1BT: 0
   }
   System.out.println(this.name + ": processing " + tree.root.nPaths + " paths."); //S:21888   E:21966 D: 0BT: 0
   for(int i = 0;i<tree.root.nPaths;i ++) //S:21974   E:22587 D: 0BT: 0
   {
      LineListTest fx = tree.getParsedCodePath(i); //S:22142   E:22181 D: 1BT: 0
      TestInfoTest ti = new TestInfoTest(fx , name + "Test_" + i , cl , this , i); //S:22193   E:22256 D: 1BT: 0
      tests.add(ti); //S:22337   E:22350 D: 1BT: 0
   }
   return rtnVal; //S:22842   E:22855 D: 0BT: 0
   }

   public LineListTest getExtractedTest(int input)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
FunctionTreeTest ft = new FunctionTreeTest(allLines); {S:22927 E:22971 D:0 BT: 0}
return ft.getParsedCodePath(input); {S:22978 E:23012 D:0 BT: 0}
****************************/
/***************************
Processing list:
FunctionTreeTest ft = new FunctionTreeTest(allLines); {S:22927 E:22971 D:0 BT: 0}
return ft.getParsedCodePath(input); {S:22978 E:23012 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
FunctionTreeTest ft = new FunctionTreeTest(allLines); {S:22927 E:22971 D:0 BT: 0}
return ft.getParsedCodePath(input); {S:22978 E:23012 D:0 BT: 0}
****************************/
   FunctionTreeTest ft = new FunctionTreeTest(allLines); //S:22927   E:22971 D: 0BT: 0
   return ft.getParsedCodePath(input); //S:22978   E:23012 D: 0BT: 0
   }

   public String[] getAllPaths(String[] meth)  //public for testing only
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
FunctionTreeTest tree = new FunctionTreeTest(meth); {S:23117 E:23159 D:0 BT: 0}
return null; {S:23166 E:23177 D:0 BT: 0}
****************************/
/***************************
Processing list:
FunctionTreeTest tree = new FunctionTreeTest(meth); {S:23117 E:23159 D:0 BT: 0}
return null; {S:23166 E:23177 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
FunctionTreeTest tree = new FunctionTreeTest(meth); {S:23117 E:23159 D:0 BT: 0}
return null; {S:23166 E:23177 D:0 BT: 0}
****************************/
   FunctionTreeTest tree = new FunctionTreeTest(meth); //S:23117   E:23159 D: 0BT: 0
   return null; //S:23166   E:23177 D: 0BT: 0
   }

   public String[] getAllPaths(LineListTest in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
FunctionTreeTest tree = new FunctionTreeTest(in); {S:23282 E:23322 D:0 BT: 0}
return(tree.getCodePaths()); {S:23329 E:23356 D:0 BT: 0}
****************************/
/***************************
Processing list:
FunctionTreeTest tree = new FunctionTreeTest(in); {S:23282 E:23322 D:0 BT: 0}
return(tree.getCodePaths()); {S:23329 E:23356 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
FunctionTreeTest tree = new FunctionTreeTest(in); {S:23282 E:23322 D:0 BT: 0}
return(tree.getCodePaths()); {S:23329 E:23356 D:0 BT: 0}
****************************/
   FunctionTreeTest tree = new FunctionTreeTest(in); //S:23282   E:23322 D: 0BT: 0
   return(tree.getCodePaths()); //S:23329   E:23356 D: 0BT: 0
   }

   public void addToTree(ClassListTest list, TreeStatusTest info, LinkedList nodeList) 
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
info.setCurrentMethod(this); {S:74503 E:74530 D:0 BT: 0}
info.getCurrentClass().methods.add(this); {S:74681 E:74721 D:0 BT: 0}
****************************/
/***************************
Processing list:
info.setCurrentMethod(this); {S:74503 E:74530 D:0 BT: 0}
info.getCurrentClass().methods.add(this); {S:74681 E:74721 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:74534 E:74676 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:74534 E:74676 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(info.getCurrentClass().getEndChar()<this.getStartChar()){} {S:74535 E:74676 D:0 BT: 1}
info.setCurrentClass(list.findClassWithChar(this.getStartChar())); {S:74606 E:74671 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(info.getCurrentClass().getEndChar()<this.getStartChar()){} {S:74535 E:74676 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:74606 E:0 D:1 BT: 0}
info.setCurrentClass(list.findClassWithChar(this.getStartChar())); {S:74606 E:74671 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
info.setCurrentMethod(this); {S:74503 E:74530 D:0 BT: 0}
 {S:74534 E:74676 D:0 BT: 7}
if(info.getCurrentClass().getEndChar()<this.getStartChar()){} {S:74535 E:74676 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:74606 E:0 D:1 BT: 0}
info.setCurrentClass(list.findClassWithChar(this.getStartChar())); {S:74606 E:74671 D:1 BT: 0}
info.getCurrentClass().methods.add(this); {S:74681 E:74721 D:0 BT: 0}
****************************/
   info.setCurrentMethod(this); //S:74503   E:74530 D: 0BT: 0
    //S:74534   E:74676 D: 0BT: 7
   if(info.getCurrentClass().getEndChar()<this.getStartChar()) //S:74535   E:74676 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:74606   E:0 D: 1BT: 0
      info.setCurrentClass(list.findClassWithChar(this.getStartChar())); //S:74606   E:74671 D: 1BT: 0
   }
   info.getCurrentClass().methods.add(this); //S:74681   E:74721 D: 0BT: 0
   }

   public MethodInfoTest(ParseTree in, ParseTree info, String fromFile, Integer ci)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:28 CP:0
/***************************
Processing list:
modifiers = VarInfoTest.processModifiers(info); {S:75074 E:75116 D:0 BT: 0}
String initNode = in.getText(); {S:75125 E:75155 D:0 BT: 0}
initNode = in.getText(); {S:75329 E:75352 D:0 BT: 0}
String tpe = null; {S:75408 E:75425 D:0 BT: 0}
ParseTree restNode = null; {S:75430 E:75455 D:0 BT: 0}
int debugPath = - 1; {S:75460 E:75478 D:0 BT: 0}
params = new VarListTest(); {S:75483 E:75505 D:0 BT: 0}
processRest(restNode , tpe , name); {S:77173 E:77205 D:0 BT: 0}
otherSetup(); {S:77210 E:77222 D:0 BT: 0}
****************************/
/***************************
Processing list:
modifiers = VarInfoTest.processModifiers(info); {S:75074 E:75116 D:0 BT: 0}
String initNode = in.getText(); {S:75125 E:75155 D:0 BT: 0}
initNode = in.getText(); {S:75329 E:75352 D:0 BT: 0}
String tpe = null; {S:75408 E:75425 D:0 BT: 0}
ParseTree restNode = null; {S:75430 E:75455 D:0 BT: 0}
int debugPath = - 1; {S:75460 E:75478 D:0 BT: 0}
params = new VarListTest(); {S:75483 E:75505 D:0 BT: 0}
processRest(restNode , tpe , name); {S:77173 E:77205 D:0 BT: 0}
otherSetup(); {S:77210 E:77222 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:75159 E:75316 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:75159 E:75316 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:7 CP:0
/***************************
Processing list:
 {S:75509 E:76999 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:75509 E:76999 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:77003 E:77074 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:77003 E:77074 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:14
/***************************
Processing list:
if(initNode.equals("constructorDeclaratorRest")|| initNode.equals("voidMethodDeclaratorRest")) {S:75160 E:75316 D:0 BT: 1}
in =(ParseTree)info.getChild(info.getChildCount()- 1); {S:75260 E:75316 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(initNode.equals("constructorDeclaratorRest")|| initNode.equals("voidMethodDeclaratorRest")){} {S:75160 E:75316 D:0 BT: 1}
QuicktestRunner.execPath += 14; {S:75260 E:0 D:1 BT: 0}
in =(ParseTree)info.getChild(info.getChildCount()- 1); {S:75260 E:75316 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(initNode.equals("memberDecl")){ {S:75510 E:76012 D:0 BT: 1}
ParseTree ch1 =(ParseTree)in.getChild(0); {S:75553 E:75595 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(initNode.equals("memberDecl")){} {S:75510 E:76012 D:0 BT: 1}
ParseTree ch1 =(ParseTree)in.getChild(0); {S:75553 E:75595 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#8(3) Type:2 Paths:5 CP:0
/***************************
Processing list:
 {S:76013 E:76999 D:0 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:76013 E:76999 D:0 BT: 2}
****************************/
//=======================================
//=======================================
//#9(4) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(restNode == null) {S:77004 E:77074 D:0 BT: 1}
System.err.println("Debug Path:" + debugPath); {S:77029 E:77074 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(restNode == null){} {S:77004 E:77074 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:77029 E:0 D:1 BT: 0}
System.err.println("Debug Path:" + debugPath); {S:77029 E:77074 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(7) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:75600 E:76003 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:75600 E:76003 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#12(8) Type:-1 Paths:5 CP:0
/***************************
Processing list:
 {S:76017 E:76999 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:76017 E:76999 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#13(11) Type:1 Paths:1 CP:10
/***************************
Processing list:
if(ch1.getText().equals("void")){ {S:75601 E:75825 D:1 BT: 1}
name = in.getChild(1).getText(); {S:75696 E:75727 D:2 BT: 0}
tpe = "void"; {S:75734 E:75746 D:2 BT: 0}
restNode =(ParseTree)in.getChild(2); {S:75753 E:75790 D:2 BT: 0}
debugPath = 0; {S:75797 E:75810 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ch1.getText().equals("void")){} {S:75601 E:75825 D:1 BT: 1}
QuicktestRunner.execPath += 10; {S:75696 E:0 D:2 BT: 0}
name = in.getChild(1).getText(); {S:75696 E:75727 D:2 BT: 0}
tpe = "void"; {S:75734 E:75746 D:2 BT: 0}
restNode =(ParseTree)in.getChild(2); {S:75753 E:75790 D:2 BT: 0}
debugPath = 0; {S:75797 E:75810 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#14(11) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:75826 E:76003 D:1 BT: 2}
name = ch1.getText(); {S:75894 E:75914 D:1 BT: 0}
tpe = "ctor"; {S:75921 E:75933 D:1 BT: 0}
restNode =(ParseTree)in.getChild(1); {S:75940 E:75977 D:1 BT: 0}
debugPath = 1; {S:75984 E:75997 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:75826 E:76003 D:1 BT: 2}
name = ch1.getText(); {S:75894 E:75914 D:2 BT: 0}
tpe = "ctor"; {S:75921 E:75933 D:2 BT: 0}
restNode =(ParseTree)in.getChild(1); {S:75940 E:75977 D:2 BT: 0}
debugPath = 1; {S:75984 E:75997 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#15(12) Type:1 Paths:3 CP:0
/***************************
Processing list:
if(initNode.equals("genericMethodOrConstructorDecl")){ {S:76018 E:76679 D:2 BT: 1}
ParseTree gmcdRest =(ParseTree)in.getChild(1); {S:76150 E:76197 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(initNode.equals("genericMethodOrConstructorDecl")){} {S:76018 E:76679 D:2 BT: 1}
ParseTree gmcdRest =(ParseTree)in.getChild(1); {S:76150 E:76197 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#16(12) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:76680 E:76999 D:2 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:76680 E:76999 D:2 BT: 2}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#17(15) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:76202 E:76670 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:76202 E:76670 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#18(16) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:76684 E:76999 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:76684 E:76999 D:4 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#19(17) Type:1 Paths:1 CP:8
/***************************
Processing list:
if(gmcdRest.getChildCount()== 2){ {S:76203 E:76389 D:3 BT: 1}
name = gmcdRest.getChild(0).getText(); {S:76248 E:76285 D:4 BT: 0}
tpe = "ctor"; {S:76292 E:76304 D:4 BT: 0}
restNode =(ParseTree)gmcdRest.getChild(1); {S:76311 E:76354 D:4 BT: 0}
debugPath = 2; {S:76361 E:76374 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(gmcdRest.getChildCount()== 2){} {S:76203 E:76389 D:3 BT: 1}
QuicktestRunner.execPath += 8; {S:76248 E:0 D:4 BT: 0}
name = gmcdRest.getChild(0).getText(); {S:76248 E:76285 D:4 BT: 0}
tpe = "ctor"; {S:76292 E:76304 D:4 BT: 0}
restNode =(ParseTree)gmcdRest.getChild(1); {S:76311 E:76354 D:4 BT: 0}
debugPath = 2; {S:76361 E:76374 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#20(17) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:76390 E:76670 D:3 BT: 2}
name = gmcdRest.getChild(1).getText(); {S:76557 E:76594 D:3 BT: 0}
restNode =(ParseTree)gmcdRest.getChild(2); {S:76601 E:76644 D:3 BT: 0}
debugPath = 3; {S:76651 E:76664 D:3 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:76390 E:76670 D:3 BT: 2}
name = gmcdRest.getChild(1).getText(); {S:76557 E:76594 D:4 BT: 0}
restNode =(ParseTree)gmcdRest.getChild(2); {S:76601 E:76644 D:4 BT: 0}
debugPath = 3; {S:76651 E:76664 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#21(18) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(initNode.equals("methodDeclaration")){ {S:76685 E:76954 D:4 BT: 1}
tpe = ClassInfoTest.getTypeName((ParseTree)in.getChild(0)); {S:76754 E:76809 D:5 BT: 0}
name = in.getChild(1).getText(); {S:76849 E:76880 D:5 BT: 0}
restNode =(ParseTree)in.getChild(2); {S:76886 E:76923 D:5 BT: 0}
debugPath = 4; {S:76929 E:76942 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(initNode.equals("methodDeclaration")){} {S:76685 E:76954 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:76754 E:0 D:5 BT: 0}
tpe = ClassInfoTest.getTypeName((ParseTree)in.getChild(0)); {S:76754 E:76809 D:5 BT: 0}
name = in.getChild(1).getText(); {S:76849 E:76880 D:5 BT: 0}
restNode =(ParseTree)in.getChild(2); {S:76886 E:76923 D:5 BT: 0}
debugPath = 4; {S:76929 E:76942 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#22(18) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:76955 E:76999 D:4 BT: 2}
System.err.println(initNode); {S:76966 E:76994 D:4 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:76955 E:76999 D:4 BT: 2}
System.err.println(initNode); {S:76966 E:76994 D:5 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#23(20) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:76401 E:76550 D:5 BT: 7}
****************************/
/***************************
Processing list:
 {S:76401 E:76550 D:5 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#24(23) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(! gmcdRest.getChild(0).getText().equals("void"))else tpe = "void"; {S:76402 E:76532 D:5 BT: 1}
tpe = ClassInfoTest.getTypeName((ParseTree)gmcdRest.getChild(0)); {S:76459 E:76520 D:6 BT: 0}
****************************/
/***************************
Processing list:
if(! gmcdRest.getChild(0).getText().equals("void")){} {S:76402 E:76532 D:5 BT: 1}
QuicktestRunner.execPath += 4; {S:76459 E:0 D:6 BT: 0}
tpe = ClassInfoTest.getTypeName((ParseTree)gmcdRest.getChild(0)); {S:76459 E:76520 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#25(23) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:76533 E:76550 D:5 BT: 2}
tpe = "void"; {S:76538 E:76550 D:5 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:76533 E:76550 D:5 BT: 2}
tpe = "void"; {S:76538 E:76550 D:6 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
modifiers = VarInfoTest.processModifiers(info); {S:75074 E:75116 D:0 BT: 0}
String initNode = in.getText(); {S:75125 E:75155 D:0 BT: 0}
 {S:75159 E:75316 D:0 BT: 7}
if(initNode.equals("constructorDeclaratorRest")|| initNode.equals("voidMethodDeclaratorRest")){} {S:75160 E:75316 D:0 BT: 1}
QuicktestRunner.execPath += 14; {S:75260 E:0 D:1 BT: 0}
in =(ParseTree)info.getChild(info.getChildCount()- 1); {S:75260 E:75316 D:1 BT: 0}
initNode = in.getText(); {S:75329 E:75352 D:0 BT: 0}
String tpe = null; {S:75408 E:75425 D:0 BT: 0}
ParseTree restNode = null; {S:75430 E:75455 D:0 BT: 0}
int debugPath = - 1; {S:75460 E:75478 D:0 BT: 0}
params = new VarListTest(); {S:75483 E:75505 D:0 BT: 0}
 {S:75509 E:76999 D:0 BT: 7}
if(initNode.equals("memberDecl")){} {S:75510 E:76012 D:0 BT: 1}
ParseTree ch1 =(ParseTree)in.getChild(0); {S:75553 E:75595 D:1 BT: 0}
 {S:75600 E:76003 D:1 BT: 7}
if(ch1.getText().equals("void")){} {S:75601 E:75825 D:1 BT: 1}
QuicktestRunner.execPath += 10; {S:75696 E:0 D:2 BT: 0}
name = in.getChild(1).getText(); {S:75696 E:75727 D:2 BT: 0}
tpe = "void"; {S:75734 E:75746 D:2 BT: 0}
restNode =(ParseTree)in.getChild(2); {S:75753 E:75790 D:2 BT: 0}
debugPath = 0; {S:75797 E:75810 D:2 BT: 0}
else{} {S:75826 E:76003 D:1 BT: 2}
name = ch1.getText(); {S:75894 E:75914 D:2 BT: 0}
tpe = "ctor"; {S:75921 E:75933 D:2 BT: 0}
restNode =(ParseTree)in.getChild(1); {S:75940 E:75977 D:2 BT: 0}
debugPath = 1; {S:75984 E:75997 D:2 BT: 0}
else{} {S:76013 E:76999 D:0 BT: 2}
 {S:76017 E:76999 D:1 BT: 7}
if(initNode.equals("genericMethodOrConstructorDecl")){} {S:76018 E:76679 D:1 BT: 1}
ParseTree gmcdRest =(ParseTree)in.getChild(1); {S:76150 E:76197 D:2 BT: 0}
 {S:76202 E:76670 D:2 BT: 7}
if(gmcdRest.getChildCount()== 2){} {S:76203 E:76389 D:2 BT: 1}
QuicktestRunner.execPath += 8; {S:76248 E:0 D:3 BT: 0}
name = gmcdRest.getChild(0).getText(); {S:76248 E:76285 D:3 BT: 0}
tpe = "ctor"; {S:76292 E:76304 D:3 BT: 0}
restNode =(ParseTree)gmcdRest.getChild(1); {S:76311 E:76354 D:3 BT: 0}
debugPath = 2; {S:76361 E:76374 D:3 BT: 0}
else{} {S:76390 E:76670 D:2 BT: 2}
 {S:76401 E:76550 D:3 BT: 7}
if(! gmcdRest.getChild(0).getText().equals("void")){} {S:76402 E:76532 D:3 BT: 1}
QuicktestRunner.execPath += 4; {S:76459 E:0 D:4 BT: 0}
tpe = ClassInfoTest.getTypeName((ParseTree)gmcdRest.getChild(0)); {S:76459 E:76520 D:4 BT: 0}
else{} {S:76533 E:76550 D:3 BT: 2}
tpe = "void"; {S:76538 E:76550 D:4 BT: 0}
name = gmcdRest.getChild(1).getText(); {S:76557 E:76594 D:3 BT: 0}
restNode =(ParseTree)gmcdRest.getChild(2); {S:76601 E:76644 D:3 BT: 0}
debugPath = 3; {S:76651 E:76664 D:3 BT: 0}
else{} {S:76680 E:76999 D:1 BT: 2}
 {S:76684 E:76999 D:2 BT: 7}
if(initNode.equals("methodDeclaration")){} {S:76685 E:76954 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:76754 E:0 D:3 BT: 0}
tpe = ClassInfoTest.getTypeName((ParseTree)in.getChild(0)); {S:76754 E:76809 D:3 BT: 0}
name = in.getChild(1).getText(); {S:76849 E:76880 D:3 BT: 0}
restNode =(ParseTree)in.getChild(2); {S:76886 E:76923 D:3 BT: 0}
debugPath = 4; {S:76929 E:76942 D:3 BT: 0}
else{} {S:76955 E:76999 D:2 BT: 2}
System.err.println(initNode); {S:76966 E:76994 D:3 BT: 0}
 {S:77003 E:77074 D:0 BT: 7}
if(restNode == null){} {S:77004 E:77074 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:77029 E:0 D:1 BT: 0}
System.err.println("Debug Path:" + debugPath); {S:77029 E:77074 D:1 BT: 0}
processRest(restNode , tpe , name); {S:77173 E:77205 D:0 BT: 0}
otherSetup(); {S:77210 E:77222 D:0 BT: 0}
****************************/
   modifiers = VarInfoTest.processModifiers(info); //S:75074   E:75116 D: 0BT: 0
   String initNode = in.getText(); //S:75125   E:75155 D: 0BT: 0
    //S:75159   E:75316 D: 0BT: 7
   if(initNode.equals("constructorDeclaratorRest")|| initNode.equals("voidMethodDeclaratorRest")) //S:75160   E:75316 D: 0BT: 1
   {
      QuicktestRunner.execPath += 14; //S:75260   E:0 D: 1BT: 0
      in =(ParseTree)info.getChild(info.getChildCount()- 1); //S:75260   E:75316 D: 1BT: 0
   }
   initNode = in.getText(); //S:75329   E:75352 D: 0BT: 0
   String tpe = null; //S:75408   E:75425 D: 0BT: 0
   ParseTree restNode = null; //S:75430   E:75455 D: 0BT: 0
   int debugPath = - 1; //S:75460   E:75478 D: 0BT: 0
   params = new VarListTest(); //S:75483   E:75505 D: 0BT: 0
    //S:75509   E:76999 D: 0BT: 7
   if(initNode.equals("memberDecl")) //S:75510   E:76012 D: 0BT: 1
   {
      ParseTree ch1 =(ParseTree)in.getChild(0); //S:75553   E:75595 D: 1BT: 0
       //S:75600   E:76003 D: 1BT: 7
      if(ch1.getText().equals("void")) //S:75601   E:75825 D: 1BT: 1
      {
         QuicktestRunner.execPath += 10; //S:75696   E:0 D: 2BT: 0
         name = in.getChild(1).getText(); //S:75696   E:75727 D: 2BT: 0
         tpe = "void"; //S:75734   E:75746 D: 2BT: 0
         restNode =(ParseTree)in.getChild(2); //S:75753   E:75790 D: 2BT: 0
         debugPath = 0; //S:75797   E:75810 D: 2BT: 0
      }
      else //S:75826   E:76003 D: 1BT: 2
      {
         name = ch1.getText(); //S:75894   E:75914 D: 2BT: 0
         tpe = "ctor"; //S:75921   E:75933 D: 2BT: 0
         restNode =(ParseTree)in.getChild(1); //S:75940   E:75977 D: 2BT: 0
         debugPath = 1; //S:75984   E:75997 D: 2BT: 0
      }
   }
   else //S:76013   E:76999 D: 0BT: 2
   {
       //S:76017   E:76999 D: 1BT: 7
      if(initNode.equals("genericMethodOrConstructorDecl")) //S:76018   E:76679 D: 1BT: 1
      {
         ParseTree gmcdRest =(ParseTree)in.getChild(1); //S:76150   E:76197 D: 2BT: 0
          //S:76202   E:76670 D: 2BT: 7
         if(gmcdRest.getChildCount()== 2) //S:76203   E:76389 D: 2BT: 1
         {
            QuicktestRunner.execPath += 8; //S:76248   E:0 D: 3BT: 0
            name = gmcdRest.getChild(0).getText(); //S:76248   E:76285 D: 3BT: 0
            tpe = "ctor"; //S:76292   E:76304 D: 3BT: 0
            restNode =(ParseTree)gmcdRest.getChild(1); //S:76311   E:76354 D: 3BT: 0
            debugPath = 2; //S:76361   E:76374 D: 3BT: 0
         }
         else //S:76390   E:76670 D: 2BT: 2
         {
             //S:76401   E:76550 D: 3BT: 7
            if(! gmcdRest.getChild(0).getText().equals("void")) //S:76402   E:76532 D: 3BT: 1
            {
               QuicktestRunner.execPath += 4; //S:76459   E:0 D: 4BT: 0
               tpe = ClassInfoTest.getTypeName((ParseTree)gmcdRest.getChild(0)); //S:76459   E:76520 D: 4BT: 0
            }
            else //S:76533   E:76550 D: 3BT: 2
            {
               tpe = "void"; //S:76538   E:76550 D: 4BT: 0
            }
            name = gmcdRest.getChild(1).getText(); //S:76557   E:76594 D: 3BT: 0
            restNode =(ParseTree)gmcdRest.getChild(2); //S:76601   E:76644 D: 3BT: 0
            debugPath = 3; //S:76651   E:76664 D: 3BT: 0
         }
      }
      else //S:76680   E:76999 D: 1BT: 2
      {
          //S:76684   E:76999 D: 2BT: 7
         if(initNode.equals("methodDeclaration")) //S:76685   E:76954 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:76754   E:0 D: 3BT: 0
            tpe = ClassInfoTest.getTypeName((ParseTree)in.getChild(0)); //S:76754   E:76809 D: 3BT: 0
            name = in.getChild(1).getText(); //S:76849   E:76880 D: 3BT: 0
            restNode =(ParseTree)in.getChild(2); //S:76886   E:76923 D: 3BT: 0
            debugPath = 4; //S:76929   E:76942 D: 3BT: 0
         }
         else //S:76955   E:76999 D: 2BT: 2
         {
            System.err.println(initNode); //S:76966   E:76994 D: 3BT: 0
         }
      }
   }
    //S:77003   E:77074 D: 0BT: 7
   if(restNode == null) //S:77004   E:77074 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:77029   E:0 D: 1BT: 0
      System.err.println("Debug Path:" + debugPath); //S:77029   E:77074 D: 1BT: 0
   }
   processRest(restNode , tpe , name); //S:77173   E:77205 D: 0BT: 0
   otherSetup(); //S:77210   E:77222 D: 0BT: 0
   }

   private void processRest(ParseTree in, String type, String name)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
ParseTree fps; {S:77430 E:77443 D:0 BT: 0}
try{} {S:77448 E:77516 D:0 BT: 0}
<sublist>
fps =(ParseTree)in.getChild(0).getChild(1); {S:77463 E:77507 D:1 BT: 0}
</sublist>
catch(NullPointerException ex){} {S:77517 E:77700 D:0 BT: 0}
<sublist>
System.err.println("EXCEPTION-1696"); {S:77557 E:77593 D:1 BT: 0}
System.err.println("tree:" + in); {S:77599 E:77631 D:1 BT: 0}
System.err.println("Child0:" + in.getChild(0)); {S:77637 E:77683 D:1 BT: 0}
return; {S:77689 E:77695 D:1 BT: 0}
</sublist>
int i = 1; {S:77972 E:77981 D:0 BT: 0}
while(in.getChild(i).getText().equals("[")){} {S:77986 E:78123 D:0 BT: 0}
<sublist>
type += "[]"; {S:78094 E:78106 D:1 BT: 0}
i += 2; {S:78112 E:78118 D:1 BT: 0}
</sublist>
throwsList = null; {S:78128 E:78145 D:0 BT: 0}
returnType = new VarInfoTest(type , name , 0); {S:78289 E:78328 D:0 BT: 0}
****************************/
/***************************
Processing list:
ParseTree fps; {S:77430 E:77443 D:0 BT: 0}
try{} {S:77448 E:77516 D:0 BT: 0}
<sublist>
fps =(ParseTree)in.getChild(0).getChild(1); {S:77463 E:77507 D:1 BT: 0}
</sublist>
catch(NullPointerException ex){} {S:77517 E:77700 D:0 BT: 0}
<sublist>
System.err.println("EXCEPTION-1696"); {S:77557 E:77593 D:1 BT: 0}
System.err.println("tree:" + in); {S:77599 E:77631 D:1 BT: 0}
System.err.println("Child0:" + in.getChild(0)); {S:77637 E:77683 D:1 BT: 0}
return; {S:77689 E:77695 D:1 BT: 0}
</sublist>
int i = 1; {S:77972 E:77981 D:0 BT: 0}
while(in.getChild(i).getText().equals("[")){} {S:77986 E:78123 D:0 BT: 0}
<sublist>
type += "[]"; {S:78094 E:78106 D:1 BT: 0}
i += 2; {S:78112 E:78118 D:1 BT: 0}
</sublist>
throwsList = null; {S:78128 E:78145 D:0 BT: 0}
returnType = new VarInfoTest(type , name , 0); {S:78289 E:78328 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:77833 E:77919 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:77833 E:77919 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:78149 E:78284 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:78149 E:78284 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(fps.getText().equals("formalParameterDecls")){} {S:77834 E:77919 D:0 BT: 1}
processParameters(fps); {S:77892 E:77914 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(fps.getText().equals("formalParameterDecls")){} {S:77834 E:77919 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:77892 E:0 D:1 BT: 0}
processParameters(fps); {S:77892 E:77914 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(in.getChild(i).getText().equals("throws")){} {S:78150 E:78284 D:0 BT: 1}
throwsList = getQualifiedNames((ParseTree)in.getChild(i + 1)); {S:78205 E:78267 D:1 BT: 0}
i += 2; {S:78273 E:78279 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(in.getChild(i).getText().equals("throws")){} {S:78150 E:78284 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:78205 E:0 D:1 BT: 0}
throwsList = getQualifiedNames((ParseTree)in.getChild(i + 1)); {S:78205 E:78267 D:1 BT: 0}
i += 2; {S:78273 E:78279 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
ParseTree fps; {S:77430 E:77443 D:0 BT: 0}
try{} {S:77448 E:77516 D:0 BT: 0}
<sublist>
fps =(ParseTree)in.getChild(0).getChild(1); {S:77463 E:77507 D:1 BT: 0}
</sublist>
fps =(ParseTree)in.getChild(0).getChild(1); {S:77463 E:77507 D:1 BT: 0}
catch(NullPointerException ex){} {S:77517 E:77700 D:0 BT: 0}
<sublist>
System.err.println("EXCEPTION-1696"); {S:77557 E:77593 D:1 BT: 0}
System.err.println("tree:" + in); {S:77599 E:77631 D:1 BT: 0}
System.err.println("Child0:" + in.getChild(0)); {S:77637 E:77683 D:1 BT: 0}
return; {S:77689 E:77695 D:1 BT: 0}
</sublist>
System.err.println("EXCEPTION-1696"); {S:77557 E:77593 D:1 BT: 0}
System.err.println("tree:" + in); {S:77599 E:77631 D:1 BT: 0}
System.err.println("Child0:" + in.getChild(0)); {S:77637 E:77683 D:1 BT: 0}
return; {S:77689 E:77695 D:1 BT: 0}
 {S:77833 E:77919 D:0 BT: 7}
if(fps.getText().equals("formalParameterDecls")){} {S:77834 E:77919 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:77892 E:0 D:1 BT: 0}
processParameters(fps); {S:77892 E:77914 D:1 BT: 0}
int i = 1; {S:77972 E:77981 D:0 BT: 0}
while(in.getChild(i).getText().equals("[")){} {S:77986 E:78123 D:0 BT: 0}
<sublist>
type += "[]"; {S:78094 E:78106 D:1 BT: 0}
i += 2; {S:78112 E:78118 D:1 BT: 0}
</sublist>
type += "[]"; {S:78094 E:78106 D:1 BT: 0}
i += 2; {S:78112 E:78118 D:1 BT: 0}
throwsList = null; {S:78128 E:78145 D:0 BT: 0}
 {S:78149 E:78284 D:0 BT: 7}
if(in.getChild(i).getText().equals("throws")){} {S:78150 E:78284 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:78205 E:0 D:1 BT: 0}
throwsList = getQualifiedNames((ParseTree)in.getChild(i + 1)); {S:78205 E:78267 D:1 BT: 0}
i += 2; {S:78273 E:78279 D:1 BT: 0}
returnType = new VarInfoTest(type , name , 0); {S:78289 E:78328 D:0 BT: 0}
****************************/
   ParseTree fps; //S:77430   E:77443 D: 0BT: 0
   try //S:77448   E:77516 D: 0BT: 0
   {
      fps =(ParseTree)in.getChild(0).getChild(1); //S:77463   E:77507 D: 1BT: 0
   }
   catch(NullPointerException ex) //S:77517   E:77700 D: 0BT: 0
   {
      System.err.println("EXCEPTION-1696"); //S:77557   E:77593 D: 1BT: 0
      System.err.println("tree:" + in); //S:77599   E:77631 D: 1BT: 0
      System.err.println("Child0:" + in.getChild(0)); //S:77637   E:77683 D: 1BT: 0
      return; //S:77689   E:77695 D: 1BT: 0
   }
    //S:77833   E:77919 D: 0BT: 7
   if(fps.getText().equals("formalParameterDecls")) //S:77834   E:77919 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:77892   E:0 D: 1BT: 0
      processParameters(fps); //S:77892   E:77914 D: 1BT: 0
   }
   int i = 1; //S:77972   E:77981 D: 0BT: 0
   while(in.getChild(i).getText().equals("[")) //S:77986   E:78123 D: 0BT: 0
   {
      type += "[]"; //S:78094   E:78106 D: 1BT: 0
      i += 2; //S:78112   E:78118 D: 1BT: 0
   }
   throwsList = null; //S:78128   E:78145 D: 0BT: 0
    //S:78149   E:78284 D: 0BT: 7
   if(in.getChild(i).getText().equals("throws")) //S:78150   E:78284 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:78205   E:0 D: 1BT: 0
      throwsList = getQualifiedNames((ParseTree)in.getChild(i + 1)); //S:78205   E:78267 D: 1BT: 0
      i += 2; //S:78273   E:78279 D: 1BT: 0
   }
   returnType = new VarInfoTest(type , name , 0); //S:78289   E:78328 D: 0BT: 0
   }

   private void processParameters(ParseTree in)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
int i = 0; {S:78735 E:78744 D:0 BT: 0}
while(in.getChild(i).getText().equals("variableModifier")){} {S:78749 E:78825 D:0 BT: 0}
<sublist>
i ++; {S:78817 E:78820 D:1 BT: 0}
</sublist>
ParseTree type =(ParseTree)in.getChild(i); {S:78925 E:78968 D:0 BT: 0}
String tpe = ClassInfoTest.getTypeName(type); {S:78973 E:79013 D:0 BT: 0}
ParseTree fpdeclsRest =(ParseTree)in.getChild(i + 1); {S:79018 E:79072 D:0 BT: 0}
ParseTree vDeclId =(ParseTree)fpdeclsRest.getChild(0); {S:79077 E:79132 D:0 BT: 0}
String id = ""; {S:79137 E:79151 D:0 BT: 0}
for(int j = 0;j<vDeclId.getChildCount();j ++)id += vDeclId.getChild(j).getText(); {S:79156 E:79244 D:0 BT: 0}
params.add(new VarInfoTest(tpe , id , 0)); {S:79249 E:79284 D:0 BT: 0}
ParseTree fpDecls =(ParseTree)fpdeclsRest.getChild(2); {S:79289 E:79344 D:0 BT: 0}
****************************/
/***************************
Processing list:
int i = 0; {S:78735 E:78744 D:0 BT: 0}
while(in.getChild(i).getText().equals("variableModifier")){} {S:78749 E:78825 D:0 BT: 0}
<sublist>
i ++; {S:78817 E:78820 D:1 BT: 0}
</sublist>
ParseTree type =(ParseTree)in.getChild(i); {S:78925 E:78968 D:0 BT: 0}
String tpe = ClassInfoTest.getTypeName(type); {S:78973 E:79013 D:0 BT: 0}
ParseTree fpdeclsRest =(ParseTree)in.getChild(i + 1); {S:79018 E:79072 D:0 BT: 0}
ParseTree vDeclId =(ParseTree)fpdeclsRest.getChild(0); {S:79077 E:79132 D:0 BT: 0}
String id = ""; {S:79137 E:79151 D:0 BT: 0}
for(int j = 0;j<vDeclId.getChildCount();j ++)id += vDeclId.getChild(j).getText(); {S:79156 E:79244 D:0 BT: 0}
params.add(new VarInfoTest(tpe , id , 0)); {S:79249 E:79284 D:0 BT: 0}
ParseTree fpDecls =(ParseTree)fpdeclsRest.getChild(2); {S:79289 E:79344 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:79348 E:79399 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:79348 E:79399 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(fpDecls != null) {S:79349 E:79399 D:0 BT: 1}
processParameters(fpDecls); {S:79373 E:79399 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(fpDecls != null){} {S:79349 E:79399 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:79373 E:0 D:1 BT: 0}
processParameters(fpDecls); {S:79373 E:79399 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int i = 0; {S:78735 E:78744 D:0 BT: 0}
while(in.getChild(i).getText().equals("variableModifier")){} {S:78749 E:78825 D:0 BT: 0}
<sublist>
i ++; {S:78817 E:78820 D:1 BT: 0}
</sublist>
i ++; {S:78817 E:78820 D:1 BT: 0}
ParseTree type =(ParseTree)in.getChild(i); {S:78925 E:78968 D:0 BT: 0}
String tpe = ClassInfoTest.getTypeName(type); {S:78973 E:79013 D:0 BT: 0}
ParseTree fpdeclsRest =(ParseTree)in.getChild(i + 1); {S:79018 E:79072 D:0 BT: 0}
ParseTree vDeclId =(ParseTree)fpdeclsRest.getChild(0); {S:79077 E:79132 D:0 BT: 0}
String id = ""; {S:79137 E:79151 D:0 BT: 0}
for(int j = 0;j<vDeclId.getChildCount();j ++)id += vDeclId.getChild(j).getText(); {S:79156 E:79244 D:0 BT: 0}
params.add(new VarInfoTest(tpe , id , 0)); {S:79249 E:79284 D:0 BT: 0}
ParseTree fpDecls =(ParseTree)fpdeclsRest.getChild(2); {S:79289 E:79344 D:0 BT: 0}
 {S:79348 E:79399 D:0 BT: 7}
if(fpDecls != null){} {S:79349 E:79399 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:79373 E:0 D:1 BT: 0}
processParameters(fpDecls); {S:79373 E:79399 D:1 BT: 0}
****************************/
   int i = 0; //S:78735   E:78744 D: 0BT: 0
   while(in.getChild(i).getText().equals("variableModifier")) //S:78749   E:78825 D: 0BT: 0
   {
      i ++; //S:78817   E:78820 D: 1BT: 0
   }
   ParseTree type =(ParseTree)in.getChild(i); //S:78925   E:78968 D: 0BT: 0
   String tpe = ClassInfoTest.getTypeName(type); //S:78973   E:79013 D: 0BT: 0
   ParseTree fpdeclsRest =(ParseTree)in.getChild(i + 1); //S:79018   E:79072 D: 0BT: 0
   ParseTree vDeclId =(ParseTree)fpdeclsRest.getChild(0); //S:79077   E:79132 D: 0BT: 0
   String id = ""; //S:79137   E:79151 D: 0BT: 0
   for(int j = 0;j<vDeclId.getChildCount();j ++)id += vDeclId.getChild(j).getText(); //S:79156   E:79244 D: 0BT: 0
   params.add(new VarInfoTest(tpe , id , 0)); //S:79249   E:79284 D: 0BT: 0
   ParseTree fpDecls =(ParseTree)fpdeclsRest.getChild(2); //S:79289   E:79344 D: 0BT: 0
    //S:79348   E:79399 D: 0BT: 7
   if(fpDecls != null) //S:79349   E:79399 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:79373   E:0 D: 1BT: 0
      processParameters(fpDecls); //S:79373   E:79399 D: 1BT: 0
   }
   }

   private String getQualifiedNames(ParseTree in)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
int i = 0; {S:79464 E:79473 D:0 BT: 0}
String rtnVal = ""; {S:79478 E:79496 D:0 BT: 0}
while(i<in.getChildCount()){} {S:79501 E:79752 D:0 BT: 0}
<sublist>
ParseTree qName =(ParseTree)in.getChild(i); {S:79540 E:79584 D:1 BT: 0}
for(int j = 0;j<qName.getChildCount();j ++)rtnVal += qName.getChild(j).getText(); {S:79590 E:79679 D:1 BT: 0}
i += 2; {S:79741 E:79747 D:1 BT: 0}
</sublist>
return rtnVal; {S:79757 E:79770 D:0 BT: 0}
****************************/
/***************************
Processing list:
int i = 0; {S:79464 E:79473 D:0 BT: 0}
String rtnVal = ""; {S:79478 E:79496 D:0 BT: 0}
while(i<in.getChildCount()){} {S:79501 E:79752 D:0 BT: 0}
<sublist>
ParseTree qName =(ParseTree)in.getChild(i); {S:79540 E:79584 D:1 BT: 0}
for(int j = 0;j<qName.getChildCount();j ++)rtnVal += qName.getChild(j).getText(); {S:79590 E:79679 D:1 BT: 0}
i += 2; {S:79741 E:79747 D:1 BT: 0}
</sublist>
return rtnVal; {S:79757 E:79770 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:79684 E:79735 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:79684 E:79735 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(in.getChild(i + 1)!= null) {S:79685 E:79735 D:1 BT: 1}
rtnVal += ", "; {S:79721 E:79735 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(in.getChild(i + 1)!= null){} {S:79685 E:79735 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:79721 E:0 D:2 BT: 0}
rtnVal += ", "; {S:79721 E:79735 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int i = 0; {S:79464 E:79473 D:0 BT: 0}
String rtnVal = ""; {S:79478 E:79496 D:0 BT: 0}
while(i<in.getChildCount()){} {S:79501 E:79752 D:0 BT: 0}
<sublist>
ParseTree qName =(ParseTree)in.getChild(i); {S:79540 E:79584 D:1 BT: 0}
for(int j = 0;j<qName.getChildCount();j ++)rtnVal += qName.getChild(j).getText(); {S:79590 E:79679 D:1 BT: 0}
i += 2; {S:79741 E:79747 D:1 BT: 0}
</sublist>
ParseTree qName =(ParseTree)in.getChild(i); {S:79540 E:79584 D:1 BT: 0}
for(int j = 0;j<qName.getChildCount();j ++)rtnVal += qName.getChild(j).getText(); {S:79590 E:79679 D:1 BT: 0}
 {S:79684 E:79735 D:1 BT: 7}
if(in.getChild(i + 1)!= null){} {S:79685 E:79735 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:79721 E:0 D:2 BT: 0}
rtnVal += ", "; {S:79721 E:79735 D:2 BT: 0}
i += 2; {S:79741 E:79747 D:1 BT: 0}
return rtnVal; {S:79757 E:79770 D:0 BT: 0}
****************************/
   int i = 0; //S:79464   E:79473 D: 0BT: 0
   String rtnVal = ""; //S:79478   E:79496 D: 0BT: 0
   while(i<in.getChildCount()) //S:79501   E:79752 D: 0BT: 0
   {
      ParseTree qName =(ParseTree)in.getChild(i); //S:79540   E:79584 D: 1BT: 0
      for(int j = 0;j<qName.getChildCount();j ++)rtnVal += qName.getChild(j).getText(); //S:79590   E:79679 D: 1BT: 0
       //S:79684   E:79735 D: 1BT: 7
      if(in.getChild(i + 1)!= null) //S:79685   E:79735 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:79721   E:0 D: 2BT: 0
         rtnVal += ", "; //S:79721   E:79735 D: 2BT: 0
      }
      i += 2; //S:79741   E:79747 D: 1BT: 0
   }
   return rtnVal; //S:79757   E:79770 D: 0BT: 0
   }

   private void otherSetup()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
allLines = new LineListTest(); {S:79814 E:79839 D:0 BT: 0}
tests = new TestListTest(); {S:79844 E:79866 D:0 BT: 0}
****************************/
/***************************
Processing list:
allLines = new LineListTest(); {S:79814 E:79839 D:0 BT: 0}
tests = new TestListTest(); {S:79844 E:79866 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
allLines = new LineListTest(); {S:79814 E:79839 D:0 BT: 0}
tests = new TestListTest(); {S:79844 E:79866 D:0 BT: 0}
****************************/
   allLines = new LineListTest(); //S:79814   E:79839 D: 0BT: 0
   tests = new TestListTest(); //S:79844   E:79866 D: 0BT: 0
   }

   public String[] quickTest(String[][] in, ClassInfoTest ci, ClassListTest cl, LangConfig lc)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
VarInfoTest[]ins = gatherAllInputs(ci); {S:80126 E:80161 D:0 BT: 0}
VarInfoTest[]inputs = reconcileInputs(in , ins); {S:80166 E:80209 D:0 BT: 0}
VarInfoTest[]outputs = gatherAllOutputs(cl); {S:80214 E:80254 D:0 BT: 0}
String qtFileName = "QuicktestTesting.java"; {S:80259 E:80302 D:0 BT: 0}
String qtClass = writeQuicktestClass(ci , inputs , outputs , lc , cl); {S:80307 E:80372 D:0 BT: 0}
System.out.println("== The QuickTest Class =="); {S:80377 E:80424 D:0 BT: 0}
System.out.println(qtClass); {S:80429 E:80456 D:0 BT: 0}
System.out.println("== End QuickTest Class =="); {S:80461 E:80508 D:0 BT: 0}
WhiteboxUtils.writeFile(qtFileName , qtClass); {S:80513 E:80557 D:0 BT: 0}
runQuicktest(qtFileName , lc); {S:80562 E:80591 D:0 BT: 0}
return processQuicktestResults(outputs); {S:80596 E:80635 D:0 BT: 0}
****************************/
/***************************
Processing list:
VarInfoTest[]ins = gatherAllInputs(ci); {S:80126 E:80161 D:0 BT: 0}
VarInfoTest[]inputs = reconcileInputs(in , ins); {S:80166 E:80209 D:0 BT: 0}
VarInfoTest[]outputs = gatherAllOutputs(cl); {S:80214 E:80254 D:0 BT: 0}
String qtFileName = "QuicktestTesting.java"; {S:80259 E:80302 D:0 BT: 0}
String qtClass = writeQuicktestClass(ci , inputs , outputs , lc , cl); {S:80307 E:80372 D:0 BT: 0}
System.out.println("== The QuickTest Class =="); {S:80377 E:80424 D:0 BT: 0}
System.out.println(qtClass); {S:80429 E:80456 D:0 BT: 0}
System.out.println("== End QuickTest Class =="); {S:80461 E:80508 D:0 BT: 0}
WhiteboxUtils.writeFile(qtFileName , qtClass); {S:80513 E:80557 D:0 BT: 0}
runQuicktest(qtFileName , lc); {S:80562 E:80591 D:0 BT: 0}
return processQuicktestResults(outputs); {S:80596 E:80635 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
VarInfoTest[]ins = gatherAllInputs(ci); {S:80126 E:80161 D:0 BT: 0}
VarInfoTest[]inputs = reconcileInputs(in , ins); {S:80166 E:80209 D:0 BT: 0}
VarInfoTest[]outputs = gatherAllOutputs(cl); {S:80214 E:80254 D:0 BT: 0}
String qtFileName = "QuicktestTesting.java"; {S:80259 E:80302 D:0 BT: 0}
String qtClass = writeQuicktestClass(ci , inputs , outputs , lc , cl); {S:80307 E:80372 D:0 BT: 0}
System.out.println("== The QuickTest Class =="); {S:80377 E:80424 D:0 BT: 0}
System.out.println(qtClass); {S:80429 E:80456 D:0 BT: 0}
System.out.println("== End QuickTest Class =="); {S:80461 E:80508 D:0 BT: 0}
WhiteboxUtils.writeFile(qtFileName , qtClass); {S:80513 E:80557 D:0 BT: 0}
runQuicktest(qtFileName , lc); {S:80562 E:80591 D:0 BT: 0}
return processQuicktestResults(outputs); {S:80596 E:80635 D:0 BT: 0}
****************************/
   VarInfoTest[]ins = gatherAllInputs(ci); //S:80126   E:80161 D: 0BT: 0
   VarInfoTest[]inputs = reconcileInputs(in , ins); //S:80166   E:80209 D: 0BT: 0
   VarInfoTest[]outputs = gatherAllOutputs(cl); //S:80214   E:80254 D: 0BT: 0
   String qtFileName = "QuicktestTesting.java"; //S:80259   E:80302 D: 0BT: 0
   String qtClass = writeQuicktestClass(ci , inputs , outputs , lc , cl); //S:80307   E:80372 D: 0BT: 0
   System.out.println("== The QuickTest Class =="); //S:80377   E:80424 D: 0BT: 0
   System.out.println(qtClass); //S:80429   E:80456 D: 0BT: 0
   System.out.println("== End QuickTest Class =="); //S:80461   E:80508 D: 0BT: 0
   WhiteboxUtils.writeFile(qtFileName , qtClass); //S:80513   E:80557 D: 0BT: 0
   runQuicktest(qtFileName , lc); //S:80562   E:80591 D: 0BT: 0
   return processQuicktestResults(outputs); //S:80596   E:80635 D: 0BT: 0
   }

   private String[] processQuicktestResults(VarInfoTest[] outputs)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String[]allIn = WhiteboxUtils.loadFile("qtOut.wbq"); {S:80713 E:80765 D:0 BT: 0}
String[]rtnVal = new String[outputs.length + 1]; {S:80770 E:80818 D:0 BT: 0}
rtnVal[0]= allIn[0]; {S:80823 E:80843 D:0 BT: 0}
return rtnVal; {S:80848 E:80861 D:0 BT: 0}
****************************/
/***************************
Processing list:
String[]allIn = WhiteboxUtils.loadFile("qtOut.wbq"); {S:80713 E:80765 D:0 BT: 0}
String[]rtnVal = new String[outputs.length + 1]; {S:80770 E:80818 D:0 BT: 0}
rtnVal[0]= allIn[0]; {S:80823 E:80843 D:0 BT: 0}
return rtnVal; {S:80848 E:80861 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String[]allIn = WhiteboxUtils.loadFile("qtOut.wbq"); {S:80713 E:80765 D:0 BT: 0}
String[]rtnVal = new String[outputs.length + 1]; {S:80770 E:80818 D:0 BT: 0}
rtnVal[0]= allIn[0]; {S:80823 E:80843 D:0 BT: 0}
return rtnVal; {S:80848 E:80861 D:0 BT: 0}
****************************/
   String[]allIn = WhiteboxUtils.loadFile("qtOut.wbq"); //S:80713   E:80765 D: 0BT: 0
   String[]rtnVal = new String[outputs.length + 1]; //S:80770   E:80818 D: 0BT: 0
   rtnVal[0]= allIn[0]; //S:80823   E:80843 D: 0BT: 0
   return rtnVal; //S:80848   E:80861 D: 0BT: 0
   }

   private void runQuicktest(String fName, LangConfig lc)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String debugVMFlags = "-Djava.security.policy=debug.policy -Djava.security.manager.QuicktestRunner"; {S:80934 E:81033 D:0 BT: 0}
lc.runCompileCommand(fName); {S:81038 E:81065 D:0 BT: 0}
String jvF = fName.substring(fName.indexOf(".java")); {S:81070 E:81122 D:0 BT: 0}
lc.runRunCommand(debugVMFlags + " " + jvF); {S:81127 E:81169 D:0 BT: 0}
****************************/
/***************************
Processing list:
String debugVMFlags = "-Djava.security.policy=debug.policy -Djava.security.manager.QuicktestRunner"; {S:80934 E:81033 D:0 BT: 0}
lc.runCompileCommand(fName); {S:81038 E:81065 D:0 BT: 0}
String jvF = fName.substring(fName.indexOf(".java")); {S:81070 E:81122 D:0 BT: 0}
lc.runRunCommand(debugVMFlags + " " + jvF); {S:81127 E:81169 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String debugVMFlags = "-Djava.security.policy=debug.policy -Djava.security.manager.QuicktestRunner"; {S:80934 E:81033 D:0 BT: 0}
lc.runCompileCommand(fName); {S:81038 E:81065 D:0 BT: 0}
String jvF = fName.substring(fName.indexOf(".java")); {S:81070 E:81122 D:0 BT: 0}
lc.runRunCommand(debugVMFlags + " " + jvF); {S:81127 E:81169 D:0 BT: 0}
****************************/
   String debugVMFlags = "-Djava.security.policy=debug.policy -Djava.security.manager.QuicktestRunner"; //S:80934   E:81033 D: 0BT: 0
   lc.runCompileCommand(fName); //S:81038   E:81065 D: 0BT: 0
   String jvF = fName.substring(fName.indexOf(".java")); //S:81070   E:81122 D: 0BT: 0
   lc.runRunCommand(debugVMFlags + " " + jvF); //S:81127   E:81169 D: 0BT: 0
   }

   private VarInfoTest[] gatherAllInputs(ClassInfoTest ci)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
VarInfoTest[]p1 = TestInfoTest.getMethodParams(this); {S:81235 E:81280 D:0 BT: 0}
VarInfoTest[]p2 = TestInfoTest.getLineInputs(allLines , ci , p1); {S:81285 E:81340 D:0 BT: 0}
VarInfoTest[]rtnVal = new VarInfoTest[p1.length + p2.length]; {S:81345 E:81398 D:0 BT: 0}
for(int i = 0;i<p1.length;i ++)rtnVal[i]= p1[i].copy(); {S:81403 E:81466 D:0 BT: 0}
for(int i = 0;i<p2.length;i ++)rtnVal[i + p1.length]= p2[i].copy(); {S:81471 E:81546 D:0 BT: 0}
return rtnVal; {S:81551 E:81564 D:0 BT: 0}
****************************/
/***************************
Processing list:
VarInfoTest[]p1 = TestInfoTest.getMethodParams(this); {S:81235 E:81280 D:0 BT: 0}
VarInfoTest[]p2 = TestInfoTest.getLineInputs(allLines , ci , p1); {S:81285 E:81340 D:0 BT: 0}
VarInfoTest[]rtnVal = new VarInfoTest[p1.length + p2.length]; {S:81345 E:81398 D:0 BT: 0}
for(int i = 0;i<p1.length;i ++)rtnVal[i]= p1[i].copy(); {S:81403 E:81466 D:0 BT: 0}
for(int i = 0;i<p2.length;i ++)rtnVal[i + p1.length]= p2[i].copy(); {S:81471 E:81546 D:0 BT: 0}
return rtnVal; {S:81551 E:81564 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
VarInfoTest[]p1 = TestInfoTest.getMethodParams(this); {S:81235 E:81280 D:0 BT: 0}
VarInfoTest[]p2 = TestInfoTest.getLineInputs(allLines , ci , p1); {S:81285 E:81340 D:0 BT: 0}
VarInfoTest[]rtnVal = new VarInfoTest[p1.length + p2.length]; {S:81345 E:81398 D:0 BT: 0}
for(int i = 0;i<p1.length;i ++)rtnVal[i]= p1[i].copy(); {S:81403 E:81466 D:0 BT: 0}
for(int i = 0;i<p2.length;i ++)rtnVal[i + p1.length]= p2[i].copy(); {S:81471 E:81546 D:0 BT: 0}
return rtnVal; {S:81551 E:81564 D:0 BT: 0}
****************************/
   VarInfoTest[]p1 = TestInfoTest.getMethodParams(this); //S:81235   E:81280 D: 0BT: 0
   VarInfoTest[]p2 = TestInfoTest.getLineInputs(allLines , ci , p1); //S:81285   E:81340 D: 0BT: 0
   VarInfoTest[]rtnVal = new VarInfoTest[p1.length + p2.length]; //S:81345   E:81398 D: 0BT: 0
   for(int i = 0;i<p1.length;i ++)rtnVal[i]= p1[i].copy(); //S:81403   E:81466 D: 0BT: 0
   for(int i = 0;i<p2.length;i ++)rtnVal[i + p1.length]= p2[i].copy(); //S:81471   E:81546 D: 0BT: 0
   return rtnVal; //S:81551   E:81564 D: 0BT: 0
   }

   private VarInfoTest[] reconcileInputs(String[][] in, VarInfoTest[] ins)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
for(int i = 0;i<ins.length;i ++){} {S:81646 E:81836 D:0 BT: 0}
<sublist>
VarInfoTest vi = ins[i]; {S:81691 E:81710 D:1 BT: 0}
for(int j = 0;j<in.length;j ++){} {S:81716 E:81831 D:1 BT: 0}
</sublist>
return ins; {S:81841 E:81851 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<ins.length;i ++){} {S:81646 E:81836 D:0 BT: 0}
<sublist>
VarInfoTest vi = ins[i]; {S:81691 E:81710 D:1 BT: 0}
for(int j = 0;j<in.length;j ++){} {S:81716 E:81831 D:1 BT: 0}
</sublist>
return ins; {S:81841 E:81851 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:81761 E:81825 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:81761 E:81825 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(vi.getName().equals(in[j][2])) {S:81762 E:81825 D:2 BT: 1}
vi.initValue = in[j][3]; {S:81802 E:81825 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(vi.getName().equals(in[j][2])){} {S:81762 E:81825 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:81802 E:0 D:3 BT: 0}
vi.initValue = in[j][3]; {S:81802 E:81825 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<ins.length;i ++){} {S:81646 E:81836 D:0 BT: 0}
<sublist>
VarInfoTest vi = ins[i]; {S:81691 E:81710 D:1 BT: 0}
for(int j = 0;j<in.length;j ++){} {S:81716 E:81831 D:1 BT: 0}
</sublist>
VarInfoTest vi = ins[i]; {S:81691 E:81710 D:1 BT: 0}
for(int j = 0;j<in.length;j ++){} {S:81716 E:81831 D:1 BT: 0}
 {S:81761 E:81825 D:2 BT: 7}
if(vi.getName().equals(in[j][2])){} {S:81762 E:81825 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:81802 E:0 D:3 BT: 0}
vi.initValue = in[j][3]; {S:81802 E:81825 D:3 BT: 0}
return ins; {S:81841 E:81851 D:0 BT: 0}
****************************/
   for(int i = 0;i<ins.length;i ++) //S:81646   E:81836 D: 0BT: 0
   {
      VarInfoTest vi = ins[i]; //S:81691   E:81710 D: 1BT: 0
      for(int j = 0;j<in.length;j ++) //S:81716   E:81831 D: 1BT: 0
      {
          //S:81761   E:81825 D: 2BT: 7
         if(vi.getName().equals(in[j][2])) //S:81762   E:81825 D: 2BT: 1
         {
            QuicktestRunner.execPath += 1; //S:81802   E:0 D: 3BT: 0
            vi.initValue = in[j][3]; //S:81802   E:81825 D: 3BT: 0
         }
      }
   }
   return ins; //S:81841   E:81851 D: 0BT: 0
   }

   private VarInfoTest[] gatherAllOutputs(ClassListTest cl)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
AssertionListTest al = TestInfoTest.findAssertions(allLines , cl , this); {S:81918 E:81980 D:0 BT: 0}
VarInfoTest[]rtnVal = new VarInfoTest[al.size()]; {S:81985 E:82026 D:0 BT: 0}
for(int i = 0;i<al.size();i ++){} {S:82031 E:82147 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = al.getAssertion(i); {S:82075 E:82112 D:1 BT: 0}
rtnVal[i]= ai.dataType; {S:82118 E:82141 D:1 BT: 0}
</sublist>
return rtnVal; {S:82152 E:82165 D:0 BT: 0}
****************************/
/***************************
Processing list:
AssertionListTest al = TestInfoTest.findAssertions(allLines , cl , this); {S:81918 E:81980 D:0 BT: 0}
VarInfoTest[]rtnVal = new VarInfoTest[al.size()]; {S:81985 E:82026 D:0 BT: 0}
for(int i = 0;i<al.size();i ++){} {S:82031 E:82147 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = al.getAssertion(i); {S:82075 E:82112 D:1 BT: 0}
rtnVal[i]= ai.dataType; {S:82118 E:82141 D:1 BT: 0}
</sublist>
return rtnVal; {S:82152 E:82165 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
AssertionListTest al = TestInfoTest.findAssertions(allLines , cl , this); {S:81918 E:81980 D:0 BT: 0}
VarInfoTest[]rtnVal = new VarInfoTest[al.size()]; {S:81985 E:82026 D:0 BT: 0}
for(int i = 0;i<al.size();i ++){} {S:82031 E:82147 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = al.getAssertion(i); {S:82075 E:82112 D:1 BT: 0}
rtnVal[i]= ai.dataType; {S:82118 E:82141 D:1 BT: 0}
</sublist>
AssertionInfoTest ai = al.getAssertion(i); {S:82075 E:82112 D:1 BT: 0}
rtnVal[i]= ai.dataType; {S:82118 E:82141 D:1 BT: 0}
return rtnVal; {S:82152 E:82165 D:0 BT: 0}
****************************/
   AssertionListTest al = TestInfoTest.findAssertions(allLines , cl , this); //S:81918   E:81980 D: 0BT: 0
   VarInfoTest[]rtnVal = new VarInfoTest[al.size()]; //S:81985   E:82026 D: 0BT: 0
   for(int i = 0;i<al.size();i ++) //S:82031   E:82147 D: 0BT: 0
   {
      AssertionInfoTest ai = al.getAssertion(i); //S:82075   E:82112 D: 1BT: 0
      rtnVal[i]= ai.dataType; //S:82118   E:82141 D: 1BT: 0
   }
   return rtnVal; //S:82152   E:82165 D: 0BT: 0
   }

   private String writeQuicktestClass(ClassInfoTest ci, VarInfoTest[] inputs, VarInfoTest[] outputs, LangConfig lc, ClassListTest cl)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:82427 E:82445 D:0 BT: 0}
ClassInfoTest outer = cl.findQtClass(ci); {S:82534 E:82570 D:0 BT: 0}
rtnVal += "\npublic class QuicktestTesting\n{\n"; {S:82622 E:82670 D:0 BT: 0}
rtnVal += writeQuicktestMain(ci , inputs , lc , cl); {S:82675 E:82723 D:0 BT: 0}
rtnVal += "}\n"; {S:82728 E:82743 D:0 BT: 0}
return rtnVal; {S:82970 E:82983 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:82427 E:82445 D:0 BT: 0}
ClassInfoTest outer = cl.findQtClass(ci); {S:82534 E:82570 D:0 BT: 0}
rtnVal += "\npublic class QuicktestTesting\n{\n"; {S:82622 E:82670 D:0 BT: 0}
rtnVal += writeQuicktestMain(ci , inputs , lc , cl); {S:82675 E:82723 D:0 BT: 0}
rtnVal += "}\n"; {S:82728 E:82743 D:0 BT: 0}
return rtnVal; {S:82970 E:82983 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:82427 E:82445 D:0 BT: 0}
ClassInfoTest outer = cl.findQtClass(ci); {S:82534 E:82570 D:0 BT: 0}
rtnVal += "\npublic class QuicktestTesting\n{\n"; {S:82622 E:82670 D:0 BT: 0}
rtnVal += writeQuicktestMain(ci , inputs , lc , cl); {S:82675 E:82723 D:0 BT: 0}
rtnVal += "}\n"; {S:82728 E:82743 D:0 BT: 0}
return rtnVal; {S:82970 E:82983 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:82427   E:82445 D: 0BT: 0
   ClassInfoTest outer = cl.findQtClass(ci); //S:82534   E:82570 D: 0BT: 0
   rtnVal += "\npublic class QuicktestTesting\n{\n"; //S:82622   E:82670 D: 0BT: 0
   rtnVal += writeQuicktestMain(ci , inputs , lc , cl); //S:82675   E:82723 D: 0BT: 0
   rtnVal += "}\n"; //S:82728   E:82743 D: 0BT: 0
   return rtnVal; //S:82970   E:82983 D: 0BT: 0
   }

   private String writeQuicktestCtor(ClassInfoTest ci)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:83054 E:83172 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:83054 E:83172 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(! returnType.getName().equals("ctor"))else return ""; {S:83055 E:83157 D:0 BT: 1}
return "   " + ci.className + "QuickTest(){}\n\n"; {S:83100 E:83149 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(! returnType.getName().equals("ctor")){} {S:83055 E:83157 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:83100 E:0 D:1 BT: 0}
return "   " + ci.className + "QuickTest(){}\n\n"; {S:83100 E:83149 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:83158 E:83172 D:0 BT: 2}
return ""; {S:83163 E:83172 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:83158 E:83172 D:0 BT: 2}
return ""; {S:83163 E:83172 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:83054 E:83172 D:0 BT: 7}
if(! returnType.getName().equals("ctor")){} {S:83055 E:83157 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:83100 E:0 D:1 BT: 0}
return "   " + ci.className + "QuickTest(){}\n\n"; {S:83100 E:83149 D:1 BT: 0}
else{} {S:83158 E:83172 D:0 BT: 2}
return ""; {S:83163 E:83172 D:1 BT: 0}
****************************/
    //S:83054   E:83172 D: 0BT: 7
   if(! returnType.getName().equals("ctor")) //S:83055   E:83157 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:83100   E:0 D: 1BT: 0
      return "   " + ci.className + "QuickTest(){}\n\n"; //S:83100   E:83149 D: 1BT: 0
   }
   else //S:83158   E:83172 D: 0BT: 2
   {
      return ""; //S:83163   E:83172 D: 1BT: 0
   }
   }

   private String writeQuicktestMain(ClassInfoTest ci, VarInfoTest[] inputs, LangConfig lc, ClassListTest cl)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:9 CP:0
/***************************
Processing list:
String s = "   public static void main(String args[])\n"; {S:83285 E:83341 D:0 BT: 0}
s += "   {\n"; {S:83346 E:83359 D:0 BT: 0}
s += "      QuicktestRunner qtr = new QuicktestRunner();\n"; {S:83364 E:83423 D:0 BT: 0}
s += "      QuicktestRunner.execPath = 0;\n"; {S:83428 E:83472 D:0 BT: 0}
String[]y = cl.getQTInstanceChain(ci); {S:83477 E:83515 D:0 BT: 0}
s += y[0]; {S:83520 E:83529 D:0 BT: 0}
for(int i = 1;i<inputs.length;i ++)s += ", " + inputs[i].initValue; {S:84081 E:84155 D:0 BT: 0}
s += ");\n"; {S:84160 E:84171 D:0 BT: 0}
s += "      String data = \"Exec Path:\" + QuicktestRunner.execPath + \"\\n----------\\n\";\n"; {S:84176 E:84270 D:0 BT: 0}
s += "      data += qtr.inspectObject(c0) + \"\\n----------\\n\";\n"; {S:84275 E:84343 D:0 BT: 0}
s += "      WhiteboxUtils.writeFile(\"qtOut.wbq\", data);\n"; {S:84600 E:84660 D:0 BT: 0}
s += "      QuicktestRunner.execPath = 0;\n"; {S:84665 E:84709 D:0 BT: 0}
s += "   }\n\n"; {S:84714 E:84729 D:0 BT: 0}
return s; {S:84734 E:84742 D:0 BT: 0}
****************************/
/***************************
Processing list:
String s = "   public static void main(String args[])\n"; {S:83285 E:83341 D:0 BT: 0}
s += "   {\n"; {S:83346 E:83359 D:0 BT: 0}
s += "      QuicktestRunner qtr = new QuicktestRunner();\n"; {S:83364 E:83423 D:0 BT: 0}
s += "      QuicktestRunner.execPath = 0;\n"; {S:83428 E:83472 D:0 BT: 0}
String[]y = cl.getQTInstanceChain(ci); {S:83477 E:83515 D:0 BT: 0}
s += y[0]; {S:83520 E:83529 D:0 BT: 0}
for(int i = 1;i<inputs.length;i ++)s += ", " + inputs[i].initValue; {S:84081 E:84155 D:0 BT: 0}
s += ");\n"; {S:84160 E:84171 D:0 BT: 0}
s += "      String data = \"Exec Path:\" + QuicktestRunner.execPath + \"\\n----------\\n\";\n"; {S:84176 E:84270 D:0 BT: 0}
s += "      data += qtr.inspectObject(c0) + \"\\n----------\\n\";\n"; {S:84275 E:84343 D:0 BT: 0}
s += "      WhiteboxUtils.writeFile(\"qtOut.wbq\", data);\n"; {S:84600 E:84660 D:0 BT: 0}
s += "      QuicktestRunner.execPath = 0;\n"; {S:84665 E:84709 D:0 BT: 0}
s += "   }\n\n"; {S:84714 E:84729 D:0 BT: 0}
return s; {S:84734 E:84742 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:83537 E:84072 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:83537 E:84072 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:84347 E:84595 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:84347 E:84595 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:6
/***************************
Processing list:
if(returnType.getName().equals("ctor"))else{} {S:83538 E:83725 D:0 BT: 1}
s += inputs[0].initValue; {S:83694 E:83718 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(returnType.getName().equals("ctor")){} {S:83538 E:83725 D:0 BT: 1}
QuicktestRunner.execPath += 6; {S:83694 E:0 D:1 BT: 0}
s += inputs[0].initValue; {S:83694 E:83718 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:83726 E:84072 D:0 BT: 2}
s += ");\n"; {S:83831 E:83842 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:83726 E:84072 D:0 BT: 2}
s += ");\n"; {S:83831 E:83842 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(! returnType.getName().equals("void")&& ! returnType.getType().equals("void")){} {S:84348 E:84595 D:0 BT: 1}
****************************/
/***************************
Processing list:
if(! returnType.getName().equals("void")&& ! returnType.getType().equals("void")){} {S:84348 E:84595 D:0 BT: 1}
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(5) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:83847 E:84067 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:83847 E:84067 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#9(6) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:84437 E:84590 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:84437 E:84590 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#10(8) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(! returnType.getType().equals("void"))else s += "      " + y[1]+ "." + name + "(" + inputs[0].initValue; {S:83848 E:84000 D:2 BT: 1}
s += "      " + returnType.getType()+ " out = " + y[1]+ "." + name + "(" + inputs[0].initValue; {S:83894 E:83990 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(! returnType.getType().equals("void")){} {S:83848 E:84000 D:2 BT: 1}
QuicktestRunner.execPath += 3; {S:83894 E:0 D:3 BT: 0}
s += "      " + returnType.getType()+ " out = " + y[1]+ "." + name + "(" + inputs[0].initValue; {S:83894 E:83990 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#11(8) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:84001 E:84067 D:2 BT: 2}
s += "      " + y[1]+ "." + name + "(" + inputs[0].initValue; {S:84006 E:84067 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:84001 E:84067 D:2 BT: 2}
s += "      " + y[1]+ "." + name + "(" + inputs[0].initValue; {S:84006 E:84067 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#12(9) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(! lc.isPrimitive(returnType.getType()))else s += "      data += String.valueOf(out);\n"; {S:84438 E:84541 D:1 BT: 1}
s += "      data += qtr.inspectObject(out);\n"; {S:84485 E:84531 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(! lc.isPrimitive(returnType.getType())){} {S:84438 E:84541 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:84485 E:0 D:2 BT: 0}
s += "      data += qtr.inspectObject(out);\n"; {S:84485 E:84531 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#13(9) Type:2 Paths:1 CP:1
/***************************
Processing list:
 {S:84542 E:84590 D:1 BT: 2}
s += "      data += String.valueOf(out);\n"; {S:84547 E:84590 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:84542 E:84590 D:1 BT: 2}
QuicktestRunner.execPath += 1; {S:84547 E:0 D:2 BT: 0}
s += "      data += String.valueOf(out);\n"; {S:84547 E:84590 D:2 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String s = "   public static void main(String args[])\n"; {S:83285 E:83341 D:0 BT: 0}
s += "   {\n"; {S:83346 E:83359 D:0 BT: 0}
s += "      QuicktestRunner qtr = new QuicktestRunner();\n"; {S:83364 E:83423 D:0 BT: 0}
s += "      QuicktestRunner.execPath = 0;\n"; {S:83428 E:83472 D:0 BT: 0}
String[]y = cl.getQTInstanceChain(ci); {S:83477 E:83515 D:0 BT: 0}
s += y[0]; {S:83520 E:83529 D:0 BT: 0}
 {S:83537 E:84072 D:0 BT: 7}
if(returnType.getName().equals("ctor")){} {S:83538 E:83725 D:0 BT: 1}
QuicktestRunner.execPath += 6; {S:83694 E:0 D:1 BT: 0}
s += inputs[0].initValue; {S:83694 E:83718 D:1 BT: 0}
else{} {S:83726 E:84072 D:0 BT: 2}
s += ");\n"; {S:83831 E:83842 D:1 BT: 0}
 {S:83847 E:84067 D:1 BT: 7}
if(! returnType.getType().equals("void")){} {S:83848 E:84000 D:1 BT: 1}
QuicktestRunner.execPath += 3; {S:83894 E:0 D:2 BT: 0}
s += "      " + returnType.getType()+ " out = " + y[1]+ "." + name + "(" + inputs[0].initValue; {S:83894 E:83990 D:2 BT: 0}
else{} {S:84001 E:84067 D:1 BT: 2}
s += "      " + y[1]+ "." + name + "(" + inputs[0].initValue; {S:84006 E:84067 D:2 BT: 0}
for(int i = 1;i<inputs.length;i ++)s += ", " + inputs[i].initValue; {S:84081 E:84155 D:0 BT: 0}
s += ");\n"; {S:84160 E:84171 D:0 BT: 0}
s += "      String data = \"Exec Path:\" + QuicktestRunner.execPath + \"\\n----------\\n\";\n"; {S:84176 E:84270 D:0 BT: 0}
s += "      data += qtr.inspectObject(c0) + \"\\n----------\\n\";\n"; {S:84275 E:84343 D:0 BT: 0}
 {S:84347 E:84595 D:0 BT: 7}
if(! returnType.getName().equals("void")&& ! returnType.getType().equals("void")){} {S:84348 E:84595 D:0 BT: 1}
 {S:84437 E:84590 D:1 BT: 7}
if(! lc.isPrimitive(returnType.getType())){} {S:84438 E:84541 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:84485 E:0 D:2 BT: 0}
s += "      data += qtr.inspectObject(out);\n"; {S:84485 E:84531 D:2 BT: 0}
else{} {S:84542 E:84590 D:1 BT: 2}
QuicktestRunner.execPath += 1; {S:84547 E:0 D:2 BT: 0}
s += "      data += String.valueOf(out);\n"; {S:84547 E:84590 D:2 BT: 0}
s += "      WhiteboxUtils.writeFile(\"qtOut.wbq\", data);\n"; {S:84600 E:84660 D:0 BT: 0}
s += "      QuicktestRunner.execPath = 0;\n"; {S:84665 E:84709 D:0 BT: 0}
s += "   }\n\n"; {S:84714 E:84729 D:0 BT: 0}
return s; {S:84734 E:84742 D:0 BT: 0}
****************************/
   String s = "   public static void main(String args[])\n"; //S:83285   E:83341 D: 0BT: 0
   s += "   {\n"; //S:83346   E:83359 D: 0BT: 0
   s += "      QuicktestRunner qtr = new QuicktestRunner();\n"; //S:83364   E:83423 D: 0BT: 0
   s += "      QuicktestRunner.execPath = 0;\n"; //S:83428   E:83472 D: 0BT: 0
   String[]y = cl.getQTInstanceChain(ci); //S:83477   E:83515 D: 0BT: 0
   s += y[0]; //S:83520   E:83529 D: 0BT: 0
    //S:83537   E:84072 D: 0BT: 7
   if(returnType.getName().equals("ctor")) //S:83538   E:83725 D: 0BT: 1
   {
      QuicktestRunner.execPath += 6; //S:83694   E:0 D: 1BT: 0
      s += inputs[0].initValue; //S:83694   E:83718 D: 1BT: 0
   }
   else //S:83726   E:84072 D: 0BT: 2
   {
      s += ");\n"; //S:83831   E:83842 D: 1BT: 0
       //S:83847   E:84067 D: 1BT: 7
      if(! returnType.getType().equals("void")) //S:83848   E:84000 D: 1BT: 1
      {
         QuicktestRunner.execPath += 3; //S:83894   E:0 D: 2BT: 0
         s += "      " + returnType.getType()+ " out = " + y[1]+ "." + name + "(" + inputs[0].initValue; //S:83894   E:83990 D: 2BT: 0
      }
      else //S:84001   E:84067 D: 1BT: 2
      {
         s += "      " + y[1]+ "." + name + "(" + inputs[0].initValue; //S:84006   E:84067 D: 2BT: 0
      }
   }
   for(int i = 1;i<inputs.length;i ++)s += ", " + inputs[i].initValue; //S:84081   E:84155 D: 0BT: 0
   s += ");\n"; //S:84160   E:84171 D: 0BT: 0
   s += "      String data = \"Exec Path:\" + QuicktestRunner.execPath + \"\\n----------\\n\";\n"; //S:84176   E:84270 D: 0BT: 0
   s += "      data += qtr.inspectObject(c0) + \"\\n----------\\n\";\n"; //S:84275   E:84343 D: 0BT: 0
    //S:84347   E:84595 D: 0BT: 7
   if(! returnType.getName().equals("void")&& ! returnType.getType().equals("void")) //S:84348   E:84595 D: 0BT: 1
   {
       //S:84437   E:84590 D: 1BT: 7
      if(! lc.isPrimitive(returnType.getType())) //S:84438   E:84541 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:84485   E:0 D: 2BT: 0
         s += "      data += qtr.inspectObject(out);\n"; //S:84485   E:84531 D: 2BT: 0
      }
      else //S:84542   E:84590 D: 1BT: 2
      {
         QuicktestRunner.execPath += 1; //S:84547   E:0 D: 2BT: 0
         s += "      data += String.valueOf(out);\n"; //S:84547   E:84590 D: 2BT: 0
      }
   }
   s += "      WhiteboxUtils.writeFile(\"qtOut.wbq\", data);\n"; //S:84600   E:84660 D: 0BT: 0
   s += "      QuicktestRunner.execPath = 0;\n"; //S:84665   E:84709 D: 0BT: 0
   s += "   }\n\n"; //S:84714   E:84729 D: 0BT: 0
   return s; //S:84734   E:84742 D: 0BT: 0
   }

   private String getFirstLine()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
System.out.println(methodText); {S:84790 E:84820 D:0 BT: 0}
int y = methodText.indexOf("{"); {S:84825 E:84856 D:0 BT: 0}
****************************/
/***************************
Processing list:
System.out.println(methodText); {S:84790 E:84820 D:0 BT: 0}
int y = methodText.indexOf("{"); {S:84825 E:84856 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:84860 E:84972 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:84860 E:84972 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(y>- 1){ {S:84861 E:84949 D:0 BT: 1}
String x = methodText.substring(0 , y - 1); {S:84881 E:84922 D:1 BT: 0}
return x; {S:84928 E:84936 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(y>- 1){} {S:84861 E:84949 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:84881 E:0 D:1 BT: 0}
String x = methodText.substring(0 , y - 1); {S:84881 E:84922 D:1 BT: 0}
return x; {S:84928 E:84936 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:84950 E:84972 D:0 BT: 2}
return methodText; {S:84955 E:84972 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:84950 E:84972 D:0 BT: 2}
return methodText; {S:84955 E:84972 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
System.out.println(methodText); {S:84790 E:84820 D:0 BT: 0}
int y = methodText.indexOf("{"); {S:84825 E:84856 D:0 BT: 0}
 {S:84860 E:84972 D:0 BT: 7}
if(y>- 1){} {S:84861 E:84949 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:84881 E:0 D:1 BT: 0}
String x = methodText.substring(0 , y - 1); {S:84881 E:84922 D:1 BT: 0}
return x; {S:84928 E:84936 D:1 BT: 0}
else{} {S:84950 E:84972 D:0 BT: 2}
return methodText; {S:84955 E:84972 D:1 BT: 0}
****************************/
   System.out.println(methodText); //S:84790   E:84820 D: 0BT: 0
   int y = methodText.indexOf("{"); //S:84825   E:84856 D: 0BT: 0
    //S:84860   E:84972 D: 0BT: 7
   if(y>- 1) //S:84861   E:84949 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:84881   E:0 D: 1BT: 0
      String x = methodText.substring(0 , y - 1); //S:84881   E:84922 D: 1BT: 0
      return x; //S:84928   E:84936 D: 1BT: 0
   }
   else //S:84950   E:84972 D: 0BT: 2
   {
      return methodText; //S:84955   E:84972 D: 1BT: 0
   }
   }

   public String writeQuicktestFunction(ClassInfoTest ci)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:85041 E:85059 D:0 BT: 0}
rtnVal += getFirstLine(); {S:85093 E:85117 D:0 BT: 0}
rtnVal += "   {\n"; {S:85478 E:85496 D:0 BT: 0}
FunctionTreeTest ftree = new FunctionTreeTest(this.allLines); {S:85609 E:85661 D:0 BT: 0}
rtnVal += ftree.getQuicktest(); {S:85698 E:85728 D:0 BT: 0}
rtnVal += "   }\n\n"; {S:85733 E:85753 D:0 BT: 0}
return rtnVal; {S:85758 E:85771 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:85041 E:85059 D:0 BT: 0}
rtnVal += getFirstLine(); {S:85093 E:85117 D:0 BT: 0}
rtnVal += "   {\n"; {S:85478 E:85496 D:0 BT: 0}
FunctionTreeTest ftree = new FunctionTreeTest(this.allLines); {S:85609 E:85661 D:0 BT: 0}
rtnVal += ftree.getQuicktest(); {S:85698 E:85728 D:0 BT: 0}
rtnVal += "   }\n\n"; {S:85733 E:85753 D:0 BT: 0}
return rtnVal; {S:85758 E:85771 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:85041 E:85059 D:0 BT: 0}
rtnVal += getFirstLine(); {S:85093 E:85117 D:0 BT: 0}
rtnVal += "   {\n"; {S:85478 E:85496 D:0 BT: 0}
FunctionTreeTest ftree = new FunctionTreeTest(this.allLines); {S:85609 E:85661 D:0 BT: 0}
rtnVal += ftree.getQuicktest(); {S:85698 E:85728 D:0 BT: 0}
rtnVal += "   }\n\n"; {S:85733 E:85753 D:0 BT: 0}
return rtnVal; {S:85758 E:85771 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:85041   E:85059 D: 0BT: 0
   rtnVal += getFirstLine(); //S:85093   E:85117 D: 0BT: 0
   rtnVal += "   {\n"; //S:85478   E:85496 D: 0BT: 0
   FunctionTreeTest ftree = new FunctionTreeTest(this.allLines); //S:85609   E:85661 D: 0BT: 0
   rtnVal += ftree.getQuicktest(); //S:85698   E:85728 D: 0BT: 0
   rtnVal += "   }\n\n"; //S:85733   E:85753 D: 0BT: 0
   return rtnVal; //S:85758   E:85771 D: 0BT: 0
   }

   private String getMappedParams(VarInfoTest[] in)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
String rtnVal = "("; {S:85834 E:85853 D:0 BT: 0}
VarInfoTest[]x = TestInfoTest.getMethodParams(this); {S:85858 E:85902 D:0 BT: 0}
int y = in.length - x.length; {S:85907 E:85935 D:0 BT: 0}
for(int i = y;i<in.length;i ++){} {S:85940 E:86060 D:0 BT: 0}
<sublist>
rtnVal += in[i].initValue; {S:85984 E:86009 D:1 BT: 0}
</sublist>
rtnVal += ")"; {S:86065 E:86078 D:0 BT: 0}
return rtnVal; {S:86083 E:86096 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = "("; {S:85834 E:85853 D:0 BT: 0}
VarInfoTest[]x = TestInfoTest.getMethodParams(this); {S:85858 E:85902 D:0 BT: 0}
int y = in.length - x.length; {S:85907 E:85935 D:0 BT: 0}
for(int i = y;i<in.length;i ++){} {S:85940 E:86060 D:0 BT: 0}
<sublist>
rtnVal += in[i].initValue; {S:85984 E:86009 D:1 BT: 0}
</sublist>
rtnVal += ")"; {S:86065 E:86078 D:0 BT: 0}
return rtnVal; {S:86083 E:86096 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:86014 E:86055 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:86014 E:86055 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(i<in.length - 1) {S:86015 E:86055 D:1 BT: 1}
rtnVal += ","; {S:86042 E:86055 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(i<in.length - 1){} {S:86015 E:86055 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:86042 E:0 D:2 BT: 0}
rtnVal += ","; {S:86042 E:86055 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = "("; {S:85834 E:85853 D:0 BT: 0}
VarInfoTest[]x = TestInfoTest.getMethodParams(this); {S:85858 E:85902 D:0 BT: 0}
int y = in.length - x.length; {S:85907 E:85935 D:0 BT: 0}
for(int i = y;i<in.length;i ++){} {S:85940 E:86060 D:0 BT: 0}
<sublist>
rtnVal += in[i].initValue; {S:85984 E:86009 D:1 BT: 0}
</sublist>
rtnVal += in[i].initValue; {S:85984 E:86009 D:1 BT: 0}
 {S:86014 E:86055 D:1 BT: 7}
if(i<in.length - 1){} {S:86015 E:86055 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:86042 E:0 D:2 BT: 0}
rtnVal += ","; {S:86042 E:86055 D:2 BT: 0}
rtnVal += ")"; {S:86065 E:86078 D:0 BT: 0}
return rtnVal; {S:86083 E:86096 D:0 BT: 0}
****************************/
   String rtnVal = "("; //S:85834   E:85853 D: 0BT: 0
   VarInfoTest[]x = TestInfoTest.getMethodParams(this); //S:85858   E:85902 D: 0BT: 0
   int y = in.length - x.length; //S:85907   E:85935 D: 0BT: 0
   for(int i = y;i<in.length;i ++) //S:85940   E:86060 D: 0BT: 0
   {
      rtnVal += in[i].initValue; //S:85984   E:86009 D: 1BT: 0
       //S:86014   E:86055 D: 1BT: 7
      if(i<in.length - 1) //S:86015   E:86055 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:86042   E:0 D: 2BT: 0
         rtnVal += ","; //S:86042   E:86055 D: 2BT: 0
      }
   }
   rtnVal += ")"; //S:86065   E:86078 D: 0BT: 0
   return rtnVal; //S:86083   E:86096 D: 0BT: 0
   }

   public boolean isEmptyCtor()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:86142 E:86246 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:86142 E:86246 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(returnType.getType().equals("ctor")&& params.size()== 0)else return false; {S:86143 E:86228 D:0 BT: 1}
return true; {S:86209 E:86220 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(returnType.getType().equals("ctor")&& params.size()== 0){} {S:86143 E:86228 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:86209 E:0 D:1 BT: 0}
return true; {S:86209 E:86220 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:86229 E:86246 D:0 BT: 2}
return false; {S:86234 E:86246 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:86229 E:86246 D:0 BT: 2}
return false; {S:86234 E:86246 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:86142 E:86246 D:0 BT: 7}
if(returnType.getType().equals("ctor")&& params.size()== 0){} {S:86143 E:86228 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:86209 E:0 D:1 BT: 0}
return true; {S:86209 E:86220 D:1 BT: 0}
else{} {S:86229 E:86246 D:0 BT: 2}
return false; {S:86234 E:86246 D:1 BT: 0}
****************************/
    //S:86142   E:86246 D: 0BT: 7
   if(returnType.getType().equals("ctor")&& params.size()== 0) //S:86143   E:86228 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:86209   E:0 D: 1BT: 0
      return true; //S:86209   E:86220 D: 1BT: 0
   }
   else //S:86229   E:86246 D: 0BT: 2
   {
      return false; //S:86234   E:86246 D: 1BT: 0
   }
   }

   public int quicktestTesting(int a, int b)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:12 CP:0
/***************************
Processing list:
int rtnVal; {S:86306 E:86316 D:0 BT: 0}
return rtnVal; {S:86651 E:86664 D:0 BT: 0}
****************************/
/***************************
Processing list:
int rtnVal; {S:86306 E:86316 D:0 BT: 0}
return rtnVal; {S:86651 E:86664 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:86320 E:86358 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:86320 E:86358 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:6 CP:0
/***************************
Processing list:
 {S:86362 E:86646 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:86362 E:86646 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:6
/***************************
Processing list:
if(a == 0)else a ++; {S:86321 E:86349 D:0 BT: 1}
a = 1; {S:86336 E:86341 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(a == 0){} {S:86321 E:86349 D:0 BT: 1}
QuicktestRunner.execPath += 6; {S:86336 E:0 D:1 BT: 0}
a = 1; {S:86336 E:86341 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:86350 E:86358 D:0 BT: 2}
a ++; {S:86355 E:86358 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:86350 E:86358 D:0 BT: 2}
a ++; {S:86355 E:86358 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:1 CP:5
/***************************
Processing list:
if(a<b)else if(b == 0)return 0 {S:86363 E:86389 D:0 BT: 1}
return b; {S:86377 E:86385 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(a<b){} {S:86363 E:86389 D:0 BT: 1}
QuicktestRunner.execPath += 5; {S:86377 E:0 D:1 BT: 0}
return b; {S:86377 E:86385 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:5 CP:0
/***************************
Processing list:
 {S:86390 E:86646 D:0 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:86390 E:86646 D:0 BT: 2}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(7) Type:-1 Paths:5 CP:0
/***************************
Processing list:
 {S:86394 E:86646 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:86394 E:86646 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#9(8) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(b == 0)else{} {S:86395 E:86425 D:2 BT: 1}
return 0; {S:86410 E:86418 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(b == 0){} {S:86395 E:86425 D:2 BT: 1}
QuicktestRunner.execPath += 4; {S:86410 E:0 D:3 BT: 0}
return 0; {S:86410 E:86418 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#10(8) Type:2 Paths:4 CP:0
/***************************
Processing list:
 {S:86426 E:86646 D:2 BT: 2}
int m = a % b; {S:86437 E:86450 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:86426 E:86646 D:2 BT: 2}
int m = a % b; {S:86437 E:86450 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(10) Type:-1 Paths:4 CP:0
/***************************
Processing list:
switch(m){case 0:case 1:case 2:default:} {S:86456 E:86641 D:4 BT: 3}
****************************/
/***************************
Processing list:
switch(m){} {S:86456 E:86641 D:4 BT: 3}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#12(11) Type:4 Paths:1 CP:3
/***************************
Processing list:
case 0: {S:86476 E:86511 D:5 BT: 4}
rtnVal = a; {S:86489 E:86499 D:6 BT: 0}
break; {S:86506 E:86511 D:6 BT: 0}
****************************/
/***************************
Processing list:
case 0: {S:86476 E:86511 D:5 BT: 4}
QuicktestRunner.execPath += 3; {S:86489 E:0 D:6 BT: 0}
rtnVal = a; {S:86489 E:86499 D:6 BT: 0}
break; {S:86506 E:86511 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#13(11) Type:4 Paths:1 CP:2
/***************************
Processing list:
case 1: {S:86517 E:86556 D:5 BT: 4}
rtnVal = a + 1; {S:86530 E:86544 D:6 BT: 0}
break; {S:86551 E:86556 D:6 BT: 0}
****************************/
/***************************
Processing list:
case 1: {S:86517 E:86556 D:5 BT: 4}
QuicktestRunner.execPath += 2; {S:86530 E:0 D:6 BT: 0}
rtnVal = a + 1; {S:86530 E:86544 D:6 BT: 0}
break; {S:86551 E:86556 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#14(11) Type:4 Paths:1 CP:1
/***************************
Processing list:
case 2: {S:86562 E:86601 D:5 BT: 4}
rtnVal = a + 4; {S:86575 E:86589 D:6 BT: 0}
break; {S:86596 E:86601 D:6 BT: 0}
****************************/
/***************************
Processing list:
case 2: {S:86562 E:86601 D:5 BT: 4}
QuicktestRunner.execPath += 1; {S:86575 E:0 D:6 BT: 0}
rtnVal = a + 4; {S:86575 E:86589 D:6 BT: 0}
break; {S:86596 E:86601 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#15(11) Type:5 Paths:1 CP:0
/***************************
Processing list:
default: {S:86607 E:86635 D:5 BT: 5}
rtnVal = a * b; {S:86621 E:86635 D:6 BT: 0}
****************************/
/***************************
Processing list:
default: {S:86607 E:86635 D:5 BT: 5}
rtnVal = a * b; {S:86621 E:86635 D:6 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int rtnVal; {S:86306 E:86316 D:0 BT: 0}
 {S:86320 E:86358 D:0 BT: 7}
if(a == 0){} {S:86321 E:86349 D:0 BT: 1}
QuicktestRunner.execPath += 6; {S:86336 E:0 D:1 BT: 0}
a = 1; {S:86336 E:86341 D:1 BT: 0}
else{} {S:86350 E:86358 D:0 BT: 2}
a ++; {S:86355 E:86358 D:1 BT: 0}
 {S:86362 E:86646 D:0 BT: 7}
if(a<b){} {S:86363 E:86389 D:0 BT: 1}
QuicktestRunner.execPath += 5; {S:86377 E:0 D:1 BT: 0}
return b; {S:86377 E:86385 D:1 BT: 0}
else{} {S:86390 E:86646 D:0 BT: 2}
 {S:86394 E:86646 D:1 BT: 7}
if(b == 0){} {S:86395 E:86425 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:86410 E:0 D:2 BT: 0}
return 0; {S:86410 E:86418 D:2 BT: 0}
else{} {S:86426 E:86646 D:1 BT: 2}
int m = a % b; {S:86437 E:86450 D:2 BT: 0}
switch(m){} {S:86456 E:86641 D:2 BT: 3}
case 0: {S:86476 E:86511 D:3 BT: 4}
QuicktestRunner.execPath += 3; {S:86489 E:0 D:4 BT: 0}
rtnVal = a; {S:86489 E:86499 D:4 BT: 0}
break; {S:86506 E:86511 D:4 BT: 0}
case 1: {S:86517 E:86556 D:3 BT: 4}
QuicktestRunner.execPath += 2; {S:86530 E:0 D:4 BT: 0}
rtnVal = a + 1; {S:86530 E:86544 D:4 BT: 0}
break; {S:86551 E:86556 D:4 BT: 0}
case 2: {S:86562 E:86601 D:3 BT: 4}
QuicktestRunner.execPath += 1; {S:86575 E:0 D:4 BT: 0}
rtnVal = a + 4; {S:86575 E:86589 D:4 BT: 0}
break; {S:86596 E:86601 D:4 BT: 0}
default: {S:86607 E:86635 D:3 BT: 5}
rtnVal = a * b; {S:86621 E:86635 D:4 BT: 0}
return rtnVal; {S:86651 E:86664 D:0 BT: 0}
****************************/
   int rtnVal; //S:86306   E:86316 D: 0BT: 0
    //S:86320   E:86358 D: 0BT: 7
   if(a == 0) //S:86321   E:86349 D: 0BT: 1
   {
      QuicktestRunner.execPath += 6; //S:86336   E:0 D: 1BT: 0
      a = 1; //S:86336   E:86341 D: 1BT: 0
   }
   else //S:86350   E:86358 D: 0BT: 2
   {
      a ++; //S:86355   E:86358 D: 1BT: 0
   }
    //S:86362   E:86646 D: 0BT: 7
   if(a<b) //S:86363   E:86389 D: 0BT: 1
   {
      QuicktestRunner.execPath += 5; //S:86377   E:0 D: 1BT: 0
      return b; //S:86377   E:86385 D: 1BT: 0
   }
   else //S:86390   E:86646 D: 0BT: 2
   {
       //S:86394   E:86646 D: 1BT: 7
      if(b == 0) //S:86395   E:86425 D: 1BT: 1
      {
         QuicktestRunner.execPath += 4; //S:86410   E:0 D: 2BT: 0
         return 0; //S:86410   E:86418 D: 2BT: 0
      }
      else //S:86426   E:86646 D: 1BT: 2
      {
         int m = a % b; //S:86437   E:86450 D: 2BT: 0
         switch(m) //S:86456   E:86641 D: 2BT: 3
         {
            case 0: //S:86476   E:86511 D: 3BT: 4
            {
               QuicktestRunner.execPath += 3; //S:86489   E:0 D: 4BT: 0
               rtnVal = a; //S:86489   E:86499 D: 4BT: 0
               break; //S:86506   E:86511 D: 4BT: 0
            }
            case 1: //S:86517   E:86556 D: 3BT: 4
            {
               QuicktestRunner.execPath += 2; //S:86530   E:0 D: 4BT: 0
               rtnVal = a + 1; //S:86530   E:86544 D: 4BT: 0
               break; //S:86551   E:86556 D: 4BT: 0
            }
            case 2: //S:86562   E:86601 D: 3BT: 4
            {
               QuicktestRunner.execPath += 1; //S:86575   E:0 D: 4BT: 0
               rtnVal = a + 4; //S:86575   E:86589 D: 4BT: 0
               break; //S:86596   E:86601 D: 4BT: 0
            }
            default: //S:86607   E:86635 D: 3BT: 5
            {
               rtnVal = a * b; //S:86621   E:86635 D: 4BT: 0
            }
         }
      }
   }
   return rtnVal; //S:86651   E:86664 D: 0BT: 0
   }

   public MethodInfoTest(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

class CodeNodeTest
{
   public String code;
   public int parentLine;
   public int absLineNo;
   public int relLineNo;
   public int blockType;
   public int nPaths;
   public int depth;
   public CodeNodeTest parent;
   public int currPath;
   public LinkedList children;
   public LineListTest list;
   public int index;

   CodeNodeTest()
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
nPaths = 1; {S:23677 E:23687 D:0 BT: 0}
code = ""; {S:23719 E:23728 D:0 BT: 0}
children = new LinkedList(); {S:23736 E:23763 D:0 BT: 0}
currPath = 0; {S:23771 E:23783 D:0 BT: 0}
list = null; {S:23791 E:23802 D:0 BT: 0}
****************************/
/***************************
Processing list:
nPaths = 1; {S:23677 E:23687 D:0 BT: 0}
code = ""; {S:23719 E:23728 D:0 BT: 0}
children = new LinkedList(); {S:23736 E:23763 D:0 BT: 0}
currPath = 0; {S:23771 E:23783 D:0 BT: 0}
list = null; {S:23791 E:23802 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
nPaths = 1; {S:23677 E:23687 D:0 BT: 0}
code = ""; {S:23719 E:23728 D:0 BT: 0}
children = new LinkedList(); {S:23736 E:23763 D:0 BT: 0}
currPath = 0; {S:23771 E:23783 D:0 BT: 0}
list = null; {S:23791 E:23802 D:0 BT: 0}
****************************/
   nPaths = 1; //S:23677   E:23687 D: 0BT: 0
   code = ""; //S:23719   E:23728 D: 0BT: 0
   children = new LinkedList(); //S:23736   E:23763 D: 0BT: 0
   currPath = 0; //S:23771   E:23783 D: 0BT: 0
   list = null; //S:23791   E:23802 D: 0BT: 0
   }

   CodeNodeTest(String in)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
this(); {S:23851 E:23857 D:0 BT: 0}
String btPart = in.substring(3 , in.indexOf("|")); {S:23865 E:23913 D:0 BT: 0}
String ln1 = in.substring(in.indexOf("L:")); {S:23921 E:23964 D:0 BT: 0}
String lnPart = ln1.substring(2 , ln1.indexOf("|")); {S:23972 E:24022 D:0 BT: 0}
String ln2 = in.substring(in.indexOf("R:")); {S:24030 E:24073 D:0 BT: 0}
String lnPart2 = ln2.substring(2 , ln2.indexOf("|")); {S:24081 E:24132 D:0 BT: 0}
String par1 = in.substring(in.indexOf("P:")); {S:24140 E:24184 D:0 BT: 0}
String pnPart = par1.substring(2 , par1.indexOf("|")); {S:24192 E:24244 D:0 BT: 0}
code = in.substring(in.indexOf("\n")+ 1 , in.length()); {S:24252 E:24306 D:0 BT: 0}
parentLine = Integer.parseInt(pnPart); {S:24314 E:24351 D:0 BT: 0}
blockType = Integer.parseInt(btPart); {S:24359 E:24395 D:0 BT: 0}
absLineNo = Integer.parseInt(lnPart); {S:24403 E:24439 D:0 BT: 0}
relLineNo = Integer.parseInt(lnPart2); {S:24447 E:24484 D:0 BT: 0}
list = null; {S:24492 E:24503 D:0 BT: 0}
****************************/
/***************************
Processing list:
this(); {S:23851 E:23857 D:0 BT: 0}
String btPart = in.substring(3 , in.indexOf("|")); {S:23865 E:23913 D:0 BT: 0}
String ln1 = in.substring(in.indexOf("L:")); {S:23921 E:23964 D:0 BT: 0}
String lnPart = ln1.substring(2 , ln1.indexOf("|")); {S:23972 E:24022 D:0 BT: 0}
String ln2 = in.substring(in.indexOf("R:")); {S:24030 E:24073 D:0 BT: 0}
String lnPart2 = ln2.substring(2 , ln2.indexOf("|")); {S:24081 E:24132 D:0 BT: 0}
String par1 = in.substring(in.indexOf("P:")); {S:24140 E:24184 D:0 BT: 0}
String pnPart = par1.substring(2 , par1.indexOf("|")); {S:24192 E:24244 D:0 BT: 0}
code = in.substring(in.indexOf("\n")+ 1 , in.length()); {S:24252 E:24306 D:0 BT: 0}
parentLine = Integer.parseInt(pnPart); {S:24314 E:24351 D:0 BT: 0}
blockType = Integer.parseInt(btPart); {S:24359 E:24395 D:0 BT: 0}
absLineNo = Integer.parseInt(lnPart); {S:24403 E:24439 D:0 BT: 0}
relLineNo = Integer.parseInt(lnPart2); {S:24447 E:24484 D:0 BT: 0}
list = null; {S:24492 E:24503 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
this(); {S:23851 E:23857 D:0 BT: 0}
String btPart = in.substring(3 , in.indexOf("|")); {S:23865 E:23913 D:0 BT: 0}
String ln1 = in.substring(in.indexOf("L:")); {S:23921 E:23964 D:0 BT: 0}
String lnPart = ln1.substring(2 , ln1.indexOf("|")); {S:23972 E:24022 D:0 BT: 0}
String ln2 = in.substring(in.indexOf("R:")); {S:24030 E:24073 D:0 BT: 0}
String lnPart2 = ln2.substring(2 , ln2.indexOf("|")); {S:24081 E:24132 D:0 BT: 0}
String par1 = in.substring(in.indexOf("P:")); {S:24140 E:24184 D:0 BT: 0}
String pnPart = par1.substring(2 , par1.indexOf("|")); {S:24192 E:24244 D:0 BT: 0}
code = in.substring(in.indexOf("\n")+ 1 , in.length()); {S:24252 E:24306 D:0 BT: 0}
parentLine = Integer.parseInt(pnPart); {S:24314 E:24351 D:0 BT: 0}
blockType = Integer.parseInt(btPart); {S:24359 E:24395 D:0 BT: 0}
absLineNo = Integer.parseInt(lnPart); {S:24403 E:24439 D:0 BT: 0}
relLineNo = Integer.parseInt(lnPart2); {S:24447 E:24484 D:0 BT: 0}
list = null; {S:24492 E:24503 D:0 BT: 0}
****************************/
   this(); //S:23851   E:23857 D: 0BT: 0
   String btPart = in.substring(3 , in.indexOf("|")); //S:23865   E:23913 D: 0BT: 0
   String ln1 = in.substring(in.indexOf("L:")); //S:23921   E:23964 D: 0BT: 0
   String lnPart = ln1.substring(2 , ln1.indexOf("|")); //S:23972   E:24022 D: 0BT: 0
   String ln2 = in.substring(in.indexOf("R:")); //S:24030   E:24073 D: 0BT: 0
   String lnPart2 = ln2.substring(2 , ln2.indexOf("|")); //S:24081   E:24132 D: 0BT: 0
   String par1 = in.substring(in.indexOf("P:")); //S:24140   E:24184 D: 0BT: 0
   String pnPart = par1.substring(2 , par1.indexOf("|")); //S:24192   E:24244 D: 0BT: 0
   code = in.substring(in.indexOf("\n")+ 1 , in.length()); //S:24252   E:24306 D: 0BT: 0
   parentLine = Integer.parseInt(pnPart); //S:24314   E:24351 D: 0BT: 0
   blockType = Integer.parseInt(btPart); //S:24359   E:24395 D: 0BT: 0
   absLineNo = Integer.parseInt(lnPart); //S:24403   E:24439 D: 0BT: 0
   relLineNo = Integer.parseInt(lnPart2); //S:24447   E:24484 D: 0BT: 0
   list = null; //S:24492   E:24503 D: 0BT: 0
   }

   CodeNodeTest(LineInfoTest in)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
list = new LineListTest(); {S:24558 E:24579 D:0 BT: 0}
code = in.lineText; {S:24587 E:24605 D:0 BT: 0}
list.add(in); {S:24613 E:24625 D:0 BT: 0}
blockType = in.branchType; {S:24633 E:24658 D:0 BT: 0}
children = new LinkedList(); {S:24666 E:24693 D:0 BT: 0}
****************************/
/***************************
Processing list:
list = new LineListTest(); {S:24558 E:24579 D:0 BT: 0}
code = in.lineText; {S:24587 E:24605 D:0 BT: 0}
list.add(in); {S:24613 E:24625 D:0 BT: 0}
blockType = in.branchType; {S:24633 E:24658 D:0 BT: 0}
children = new LinkedList(); {S:24666 E:24693 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
list = new LineListTest(); {S:24558 E:24579 D:0 BT: 0}
code = in.lineText; {S:24587 E:24605 D:0 BT: 0}
list.add(in); {S:24613 E:24625 D:0 BT: 0}
blockType = in.branchType; {S:24633 E:24658 D:0 BT: 0}
children = new LinkedList(); {S:24666 E:24693 D:0 BT: 0}
****************************/
   list = new LineListTest(); //S:24558   E:24579 D: 0BT: 0
   code = in.lineText; //S:24587   E:24605 D: 0BT: 0
   list.add(in); //S:24613   E:24625 D: 0BT: 0
   blockType = in.branchType; //S:24633   E:24658 D: 0BT: 0
   children = new LinkedList(); //S:24666   E:24693 D: 0BT: 0
   }

   public void addLineInfoTest(LineInfoTest in)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
code += in.lineText; {S:24806 E:24825 D:0 BT: 0}
list.add(in); {S:24833 E:24845 D:0 BT: 0}
****************************/
/***************************
Processing list:
code += in.lineText; {S:24806 E:24825 D:0 BT: 0}
list.add(in); {S:24833 E:24845 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
code += in.lineText; {S:24806 E:24825 D:0 BT: 0}
list.add(in); {S:24833 E:24845 D:0 BT: 0}
****************************/
   code += in.lineText; //S:24806   E:24825 D: 0BT: 0
   list.add(in); //S:24833   E:24845 D: 0BT: 0
   }

   public void addChild(CodeNodeTest node)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
children.add(node); {S:24910 E:24928 D:0 BT: 0}
node.parent = this; {S:24936 E:24954 D:0 BT: 0}
node.depth = depth + 1; {S:24962 E:24984 D:0 BT: 0}
****************************/
/***************************
Processing list:
children.add(node); {S:24910 E:24928 D:0 BT: 0}
node.parent = this; {S:24936 E:24954 D:0 BT: 0}
node.depth = depth + 1; {S:24962 E:24984 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
children.add(node); {S:24910 E:24928 D:0 BT: 0}
node.parent = this; {S:24936 E:24954 D:0 BT: 0}
node.depth = depth + 1; {S:24962 E:24984 D:0 BT: 0}
****************************/
   children.add(node); //S:24910   E:24928 D: 0BT: 0
   node.parent = this; //S:24936   E:24954 D: 0BT: 0
   node.depth = depth + 1; //S:24962   E:24984 D: 0BT: 0
   }

   public String toString()
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:25038 E:25056 D:0 BT: 0}
rtnVal = getShortString()+ "\n"; {S:25064 E:25096 D:0 BT: 0}
return rtnVal; {S:25528 E:25541 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:25038 E:25056 D:0 BT: 0}
rtnVal = getShortString()+ "\n"; {S:25064 E:25096 D:0 BT: 0}
return rtnVal; {S:25528 E:25541 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:25361 E:25462 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:25361 E:25462 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(list.size()== 0)else rtnVal += list.getCommentList(); {S:25362 E:25425 D:0 BT: 1}
rtnVal += code + "\n"; {S:25390 E:25411 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(list.size()== 0){} {S:25362 E:25425 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:25390 E:0 D:1 BT: 0}
rtnVal += code + "\n"; {S:25390 E:25411 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:25426 E:25462 D:0 BT: 2}
rtnVal += list.getCommentList(); {S:25431 E:25462 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:25426 E:25462 D:0 BT: 2}
rtnVal += list.getCommentList(); {S:25431 E:25462 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:25038 E:25056 D:0 BT: 0}
rtnVal = getShortString()+ "\n"; {S:25064 E:25096 D:0 BT: 0}
 {S:25361 E:25462 D:0 BT: 7}
if(list.size()== 0){} {S:25362 E:25425 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:25390 E:0 D:1 BT: 0}
rtnVal += code + "\n"; {S:25390 E:25411 D:1 BT: 0}
else{} {S:25426 E:25462 D:0 BT: 2}
rtnVal += list.getCommentList(); {S:25431 E:25462 D:1 BT: 0}
return rtnVal; {S:25528 E:25541 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:25038   E:25056 D: 0BT: 0
   rtnVal = getShortString()+ "\n"; //S:25064   E:25096 D: 0BT: 0
    //S:25361   E:25462 D: 0BT: 7
   if(list.size()== 0) //S:25362   E:25425 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:25390   E:0 D: 1BT: 0
      rtnVal += code + "\n"; //S:25390   E:25411 D: 1BT: 0
   }
   else //S:25426   E:25462 D: 0BT: 2
   {
      rtnVal += list.getCommentList(); //S:25431   E:25462 D: 1BT: 0
   }
   return rtnVal; //S:25528   E:25541 D: 0BT: 0
   }

   public String getShortString()
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
String rtnVal; {S:25605 E:25618 D:0 BT: 0}
rtnVal = "//#" + index; {S:25725 E:25747 D:0 BT: 0}
rtnVal += " Type:" + blockType + " Paths:" + nPaths + " CP:" + currPath; {S:25823 E:25894 D:0 BT: 0}
return rtnVal; {S:25902 E:25915 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal; {S:25605 E:25618 D:0 BT: 0}
rtnVal = "//#" + index; {S:25725 E:25747 D:0 BT: 0}
rtnVal += " Type:" + blockType + " Paths:" + nPaths + " CP:" + currPath; {S:25823 E:25894 D:0 BT: 0}
return rtnVal; {S:25902 E:25915 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:25754 E:25815 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:25754 E:25815 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(parent != null) {S:25755 E:25815 D:0 BT: 1}
rtnVal += "(" + parent.index + ")"; {S:25781 E:25815 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(parent != null){} {S:25755 E:25815 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:25781 E:0 D:1 BT: 0}
rtnVal += "(" + parent.index + ")"; {S:25781 E:25815 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal; {S:25605 E:25618 D:0 BT: 0}
rtnVal = "//#" + index; {S:25725 E:25747 D:0 BT: 0}
 {S:25754 E:25815 D:0 BT: 7}
if(parent != null){} {S:25755 E:25815 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:25781 E:0 D:1 BT: 0}
rtnVal += "(" + parent.index + ")"; {S:25781 E:25815 D:1 BT: 0}
rtnVal += " Type:" + blockType + " Paths:" + nPaths + " CP:" + currPath; {S:25823 E:25894 D:0 BT: 0}
return rtnVal; {S:25902 E:25915 D:0 BT: 0}
****************************/
   String rtnVal; //S:25605   E:25618 D: 0BT: 0
   rtnVal = "//#" + index; //S:25725   E:25747 D: 0BT: 0
    //S:25754   E:25815 D: 0BT: 7
   if(parent != null) //S:25755   E:25815 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:25781   E:0 D: 1BT: 0
      rtnVal += "(" + parent.index + ")"; //S:25781   E:25815 D: 1BT: 0
   }
   rtnVal += " Type:" + blockType + " Paths:" + nPaths + " CP:" + currPath; //S:25823   E:25894 D: 0BT: 0
   return rtnVal; //S:25902   E:25915 D: 0BT: 0
   }

   public String getObjectString()
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return super.toString(); {S:25980 E:26003 D:0 BT: 0}
****************************/
/***************************
Processing list:
return super.toString(); {S:25980 E:26003 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return super.toString(); {S:25980 E:26003 D:0 BT: 0}
****************************/
   return super.toString(); //S:25980   E:26003 D: 0BT: 0
   }

   private int[] getBlockData(LineInfoTest in)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:3 CP:0
/***************************
Processing list:
int[]rtnVal = new int[2]; {S:26076 E:26101 D:0 BT: 0}
return rtnVal; {S:26611 E:26624 D:0 BT: 0}
****************************/
/***************************
Processing list:
int[]rtnVal = new int[2]; {S:26076 E:26101 D:0 BT: 0}
return rtnVal; {S:26611 E:26624 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:26108 E:26603 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:26108 E:26603 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(in != null){ {S:26109 E:26216 D:0 BT: 1}
rtnVal[0]= in.startChar; {S:26139 E:26163 D:1 BT: 0}
rtnVal[1]= in.tabDepth; {S:26172 E:26195 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(in != null){} {S:26109 E:26216 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:26139 E:0 D:1 BT: 0}
rtnVal[0]= in.startChar; {S:26139 E:26163 D:1 BT: 0}
rtnVal[1]= in.tabDepth; {S:26172 E:26195 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:26217 E:26603 D:0 BT: 2}
CodeNodeTest pr =(CodeNodeTest)parent; {S:26231 E:26262 D:0 BT: 0}
int idx = pr.children.indexOf(this); {S:26271 E:26306 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:26217 E:26603 D:0 BT: 2}
CodeNodeTest pr =(CodeNodeTest)parent; {S:26231 E:26262 D:1 BT: 0}
int idx = pr.children.indexOf(this); {S:26271 E:26306 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(4) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:26314 E:26595 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:26314 E:26595 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(idx == 0)else{} {S:26315 E:26362 D:2 BT: 1}
return null; {S:26336 E:26347 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(idx == 0){} {S:26315 E:26362 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:26336 E:0 D:3 BT: 0}
return null; {S:26336 E:26347 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:26363 E:26595 D:2 BT: 2}
CodeNodeTest p =(CodeNodeTest)pr.children.get(pr.children.indexOf(this)- 1); {S:26378 E:26448 D:2 BT: 0}
LineInfoTest li = p.list.getLine(0); {S:26458 E:26489 D:2 BT: 0}
rtnVal[0]= li.endChar; {S:26499 E:26521 D:2 BT: 0}
li = p.list.getLine(0); {S:26531 E:26553 D:2 BT: 0}
rtnVal[1]= li.tabDepth; {S:26563 E:26586 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:26363 E:26595 D:2 BT: 2}
CodeNodeTest p =(CodeNodeTest)pr.children.get(pr.children.indexOf(this)- 1); {S:26378 E:26448 D:3 BT: 0}
LineInfoTest li = p.list.getLine(0); {S:26458 E:26489 D:3 BT: 0}
rtnVal[0]= li.endChar; {S:26499 E:26521 D:3 BT: 0}
li = p.list.getLine(0); {S:26531 E:26553 D:3 BT: 0}
rtnVal[1]= li.tabDepth; {S:26563 E:26586 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int[]rtnVal = new int[2]; {S:26076 E:26101 D:0 BT: 0}
 {S:26108 E:26603 D:0 BT: 7}
if(in != null){} {S:26109 E:26216 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:26139 E:0 D:1 BT: 0}
rtnVal[0]= in.startChar; {S:26139 E:26163 D:1 BT: 0}
rtnVal[1]= in.tabDepth; {S:26172 E:26195 D:1 BT: 0}
else{} {S:26217 E:26603 D:0 BT: 2}
CodeNodeTest pr =(CodeNodeTest)parent; {S:26231 E:26262 D:1 BT: 0}
int idx = pr.children.indexOf(this); {S:26271 E:26306 D:1 BT: 0}
 {S:26314 E:26595 D:1 BT: 7}
if(idx == 0){} {S:26315 E:26362 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:26336 E:0 D:2 BT: 0}
return null; {S:26336 E:26347 D:2 BT: 0}
else{} {S:26363 E:26595 D:1 BT: 2}
CodeNodeTest p =(CodeNodeTest)pr.children.get(pr.children.indexOf(this)- 1); {S:26378 E:26448 D:2 BT: 0}
LineInfoTest li = p.list.getLine(0); {S:26458 E:26489 D:2 BT: 0}
rtnVal[0]= li.endChar; {S:26499 E:26521 D:2 BT: 0}
li = p.list.getLine(0); {S:26531 E:26553 D:2 BT: 0}
rtnVal[1]= li.tabDepth; {S:26563 E:26586 D:2 BT: 0}
return rtnVal; {S:26611 E:26624 D:0 BT: 0}
****************************/
   int[]rtnVal = new int[2]; //S:26076   E:26101 D: 0BT: 0
    //S:26108   E:26603 D: 0BT: 7
   if(in != null) //S:26109   E:26216 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:26139   E:0 D: 1BT: 0
      rtnVal[0]= in.startChar; //S:26139   E:26163 D: 1BT: 0
      rtnVal[1]= in.tabDepth; //S:26172   E:26195 D: 1BT: 0
   }
   else //S:26217   E:26603 D: 0BT: 2
   {
      CodeNodeTest pr =(CodeNodeTest)parent; //S:26231   E:26262 D: 1BT: 0
      int idx = pr.children.indexOf(this); //S:26271   E:26306 D: 1BT: 0
       //S:26314   E:26595 D: 1BT: 7
      if(idx == 0) //S:26315   E:26362 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:26336   E:0 D: 2BT: 0
         return null; //S:26336   E:26347 D: 2BT: 0
      }
      else //S:26363   E:26595 D: 1BT: 2
      {
         CodeNodeTest p =(CodeNodeTest)pr.children.get(pr.children.indexOf(this)- 1); //S:26378   E:26448 D: 2BT: 0
         LineInfoTest li = p.list.getLine(0); //S:26458   E:26489 D: 2BT: 0
         rtnVal[0]= li.endChar; //S:26499   E:26521 D: 2BT: 0
         li = p.list.getLine(0); //S:26531   E:26553 D: 2BT: 0
         rtnVal[1]= li.tabDepth; //S:26563   E:26586 D: 2BT: 0
      }
   }
   return rtnVal; //S:26611   E:26624 D: 0BT: 0
   }

   private LineListTest getQTLines(FunctionTreeTest in)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
LineListTest llCopy = in.copyLineListTest(list); {S:26708 E:26747 D:0 BT: 0}
for(int i = 0;i<llCopy.size();i ++){} {S:26755 E:26938 D:0 BT: 0}
<sublist>
LineInfoTest li = llCopy.getLine(i); {S:26809 E:26840 D:1 BT: 0}
</sublist>
return llCopy; {S:26946 E:26959 D:0 BT: 0}
****************************/
/***************************
Processing list:
LineListTest llCopy = in.copyLineListTest(list); {S:26708 E:26747 D:0 BT: 0}
for(int i = 0;i<llCopy.size();i ++){} {S:26755 E:26938 D:0 BT: 0}
<sublist>
LineInfoTest li = llCopy.getLine(i); {S:26809 E:26840 D:1 BT: 0}
</sublist>
return llCopy; {S:26946 E:26959 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:26848 E:26930 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:26848 E:26930 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(li.lineText.isEmpty()){} {S:26849 E:26930 D:1 BT: 1}
llCopy.remove(i); {S:26892 E:26908 D:2 BT: 0}
i --; {S:26918 E:26921 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(li.lineText.isEmpty()){} {S:26849 E:26930 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:26892 E:0 D:2 BT: 0}
llCopy.remove(i); {S:26892 E:26908 D:2 BT: 0}
i --; {S:26918 E:26921 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
LineListTest llCopy = in.copyLineListTest(list); {S:26708 E:26747 D:0 BT: 0}
for(int i = 0;i<llCopy.size();i ++){} {S:26755 E:26938 D:0 BT: 0}
<sublist>
LineInfoTest li = llCopy.getLine(i); {S:26809 E:26840 D:1 BT: 0}
</sublist>
LineInfoTest li = llCopy.getLine(i); {S:26809 E:26840 D:1 BT: 0}
 {S:26848 E:26930 D:1 BT: 7}
if(li.lineText.isEmpty()){} {S:26849 E:26930 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:26892 E:0 D:2 BT: 0}
llCopy.remove(i); {S:26892 E:26908 D:2 BT: 0}
i --; {S:26918 E:26921 D:2 BT: 0}
return llCopy; {S:26946 E:26959 D:0 BT: 0}
****************************/
   LineListTest llCopy = in.copyLineListTest(list); //S:26708   E:26747 D: 0BT: 0
   for(int i = 0;i<llCopy.size();i ++) //S:26755   E:26938 D: 0BT: 0
   {
      LineInfoTest li = llCopy.getLine(i); //S:26809   E:26840 D: 1BT: 0
       //S:26848   E:26930 D: 1BT: 7
      if(li.lineText.isEmpty()) //S:26849   E:26930 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:26892   E:0 D: 2BT: 0
         llCopy.remove(i); //S:26892   E:26908 D: 2BT: 0
         i --; //S:26918   E:26921 D: 2BT: 0
      }
   }
   return llCopy; //S:26946   E:26959 D: 0BT: 0
   }

   private void indentAll(CodeNodeTest in, int startIndex, LineListTest ll)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
LineListTest x; {S:27057 E:27067 D:0 BT: 0}
for(int i = startIndex;i<x.size();i ++){} {S:27142 E:27451 D:0 BT: 0}
<sublist>
LineInfoTest li = x.getLine(i); {S:27241 E:27267 D:1 BT: 0}
li.tabDepth ++; {S:27276 E:27289 D:1 BT: 0}
indentAll(null , 0 , li.subLines); {S:27298 E:27329 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
LineListTest x; {S:27057 E:27067 D:0 BT: 0}
for(int i = startIndex;i<x.size();i ++){} {S:27142 E:27451 D:0 BT: 0}
<sublist>
LineInfoTest li = x.getLine(i); {S:27241 E:27267 D:1 BT: 0}
li.tabDepth ++; {S:27276 E:27289 D:1 BT: 0}
indentAll(null , 0 , li.subLines); {S:27298 E:27329 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:27074 E:27134 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:27074 E:27134 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:27458 E:27640 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:27458 E:27640 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(ll == null)else x = ll; {S:27075 E:27122 D:0 BT: 1}
x = in.list; {S:27097 E:27108 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(ll == null){} {S:27075 E:27122 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:27097 E:0 D:1 BT: 0}
x = in.list; {S:27097 E:27108 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:27123 E:27134 D:0 BT: 2}
x = ll; {S:27128 E:27134 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:27123 E:27134 D:0 BT: 2}
x = ll; {S:27128 E:27134 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(in != null){} {S:27459 E:27640 D:0 BT: 1}
for(int i = 0;i<in.children.size();i ++){} {S:27489 E:27632 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)in.children.get(i); {S:27550 E:27592 D:2 BT: 0}
indentAll(d , 0 , null); {S:27602 E:27623 D:2 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(in != null){} {S:27459 E:27640 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:27489 E:0 D:1 BT: 0}
for(int i = 0;i<in.children.size();i ++){} {S:27489 E:27632 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)in.children.get(i); {S:27550 E:27592 D:2 BT: 0}
indentAll(d , 0 , null); {S:27602 E:27623 D:2 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
LineListTest x; {S:27057 E:27067 D:0 BT: 0}
 {S:27074 E:27134 D:0 BT: 7}
if(ll == null){} {S:27075 E:27122 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:27097 E:0 D:1 BT: 0}
x = in.list; {S:27097 E:27108 D:1 BT: 0}
else{} {S:27123 E:27134 D:0 BT: 2}
x = ll; {S:27128 E:27134 D:1 BT: 0}
for(int i = startIndex;i<x.size();i ++){} {S:27142 E:27451 D:0 BT: 0}
<sublist>
LineInfoTest li = x.getLine(i); {S:27241 E:27267 D:1 BT: 0}
li.tabDepth ++; {S:27276 E:27289 D:1 BT: 0}
indentAll(null , 0 , li.subLines); {S:27298 E:27329 D:1 BT: 0}
</sublist>
LineInfoTest li = x.getLine(i); {S:27241 E:27267 D:1 BT: 0}
li.tabDepth ++; {S:27276 E:27289 D:1 BT: 0}
indentAll(null , 0 , li.subLines); {S:27298 E:27329 D:1 BT: 0}
 {S:27458 E:27640 D:0 BT: 7}
if(in != null){} {S:27459 E:27640 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:27489 E:0 D:1 BT: 0}
for(int i = 0;i<in.children.size();i ++){} {S:27489 E:27632 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)in.children.get(i); {S:27550 E:27592 D:2 BT: 0}
indentAll(d , 0 , null); {S:27602 E:27623 D:2 BT: 0}
</sublist>
CodeNodeTest d =(CodeNodeTest)in.children.get(i); {S:27550 E:27592 D:2 BT: 0}
indentAll(d , 0 , null); {S:27602 E:27623 D:2 BT: 0}
****************************/
   LineListTest x; //S:27057   E:27067 D: 0BT: 0
    //S:27074   E:27134 D: 0BT: 7
   if(ll == null) //S:27075   E:27122 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:27097   E:0 D: 1BT: 0
      x = in.list; //S:27097   E:27108 D: 1BT: 0
   }
   else //S:27123   E:27134 D: 0BT: 2
   {
      x = ll; //S:27128   E:27134 D: 1BT: 0
   }
   for(int i = startIndex;i<x.size();i ++) //S:27142   E:27451 D: 0BT: 0
   {
      LineInfoTest li = x.getLine(i); //S:27241   E:27267 D: 1BT: 0
      li.tabDepth ++; //S:27276   E:27289 D: 1BT: 0
      indentAll(null , 0 , li.subLines); //S:27298   E:27329 D: 1BT: 0
   }
    //S:27458   E:27640 D: 0BT: 7
   if(in != null) //S:27459   E:27640 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:27489   E:0 D: 1BT: 0
      for(int i = 0;i<in.children.size();i ++) //S:27489   E:27632 D: 1BT: 0
      {
         CodeNodeTest d =(CodeNodeTest)in.children.get(i); //S:27550   E:27592 D: 2BT: 0
         indentAll(d , 0 , null); //S:27602   E:27623 D: 2BT: 0
      }
   }
   }

   public LineListTest outputQTCode(FunctionTreeTest in)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:416 CP:0
/***************************
Processing list:
LineListTest llCopy = in.copyLineListTest(list); {S:27803 E:27842 D:0 BT: 0}
final String GT = LineInfoTest.BLOCKSTART + LineInfoTest.BLOCKEND; {S:27850 E:27907 D:0 BT: 0}
int insertIndex = 0; {S:27915 E:27934 D:0 BT: 0}
int blockStartChar = 0; {S:27942 E:27964 D:0 BT: 0}
int blockTabDepth = 0; {S:27972 E:27993 D:0 BT: 0}
for(int i = 0;i<llCopy.size();i ++){} {S:28008 E:28151 D:0 BT: 0}
<sublist>
LineInfoTest li = llCopy.getLine(i); {S:28062 E:28093 D:1 BT: 0}
System.out.println("|" + li.lineText + "|"); {S:28102 E:28143 D:1 BT: 0}
</sublist>
System.out.println("Changed to:\n" + llCopy.outputWTDepth("   " , false)); {S:34737 E:34809 D:0 BT: 0}
return llCopy; {S:34817 E:34830 D:0 BT: 0}
****************************/
/***************************
Processing list:
LineListTest llCopy = in.copyLineListTest(list); {S:27803 E:27842 D:0 BT: 0}
final String GT = LineInfoTest.BLOCKSTART + LineInfoTest.BLOCKEND; {S:27850 E:27907 D:0 BT: 0}
int insertIndex = 0; {S:27915 E:27934 D:0 BT: 0}
int blockStartChar = 0; {S:27942 E:27964 D:0 BT: 0}
int blockTabDepth = 0; {S:27972 E:27993 D:0 BT: 0}
for(int i = 0;i<llCopy.size();i ++){} {S:28008 E:28151 D:0 BT: 0}
<sublist>
LineInfoTest li = llCopy.getLine(i); {S:28062 E:28093 D:1 BT: 0}
System.out.println("|" + li.lineText + "|"); {S:28102 E:28143 D:1 BT: 0}
</sublist>
System.out.println("Changed to:\n" + llCopy.outputWTDepth("   " , false)); {S:34737 E:34809 D:0 BT: 0}
return llCopy; {S:34817 E:34830 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:8 CP:0
/***************************
Processing list:
switch(blockType){case FunctionTreeTest.IF:case FunctionTreeTest.ELSE:case FunctionTreeTest.MULT_NODE:case FunctionTreeTest.CASE:case FunctionTreeTest.DEFAULT:} {S:28159 E:30814 D:0 BT: 3}
****************************/
/***************************
Processing list:
switch(blockType){} {S:28159 E:30814 D:0 BT: 3}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:13 CP:0
/***************************
Processing list:
 {S:30821 E:32693 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:30821 E:32693 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:33289 E:34729 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:33289 E:34729 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:4 Paths:1 CP:208
/***************************
Processing list:
case FunctionTreeTest.IF: {S:28191 E:28863 D:1 BT: 4}
{} {S:28219 E:28849 D:2 BT: 0}
<sublist>
String str; {S:28228 E:28238 D:3 BT: 0}
LineInfoTest ref0 = llCopy.getLine(0); {S:28255 E:28288 D:3 BT: 0}
CodeNodeTest p = parent.parent; {S:28297 E:28323 D:3 BT: 0}
str = "if"; {S:28478 E:28488 D:3 BT: 0}
LineInfoTest newIf = new LineInfoTest(str + ref0.condition + GT , ref0.startChar , ref0.tabDepth); {S:28497 E:28584 D:3 BT: 0}
newIf.branchType = FunctionTreeTest.IF; {S:28593 E:28627 D:3 BT: 0}
newIf.endChar = ref0.endChar; {S:28636 E:28664 D:3 BT: 0}
llCopy.remove(0); {S:28673 E:28689 D:3 BT: 0}
llCopy.addFirst(newIf); {S:28698 E:28720 D:3 BT: 0}
insertIndex ++; {S:28764 E:28777 D:3 BT: 0}
System.out.println("I took case IF; ii=" + insertIndex); {S:28786 E:28841 D:3 BT: 0}
</sublist>
break; {S:28858 E:28863 D:2 BT: 0}
****************************/
/***************************
Processing list:
case FunctionTreeTest.IF: {S:28191 E:28863 D:1 BT: 4}
QuicktestRunner.execPath += 208; {S:28219 E:0 D:2 BT: 0}
{} {S:28219 E:28849 D:2 BT: 0}
<sublist>
String str; {S:28228 E:28238 D:3 BT: 0}
LineInfoTest ref0 = llCopy.getLine(0); {S:28255 E:28288 D:3 BT: 0}
CodeNodeTest p = parent.parent; {S:28297 E:28323 D:3 BT: 0}
str = "if"; {S:28478 E:28488 D:3 BT: 0}
LineInfoTest newIf = new LineInfoTest(str + ref0.condition + GT , ref0.startChar , ref0.tabDepth); {S:28497 E:28584 D:3 BT: 0}
newIf.branchType = FunctionTreeTest.IF; {S:28593 E:28627 D:3 BT: 0}
newIf.endChar = ref0.endChar; {S:28636 E:28664 D:3 BT: 0}
llCopy.remove(0); {S:28673 E:28689 D:3 BT: 0}
llCopy.addFirst(newIf); {S:28698 E:28720 D:3 BT: 0}
insertIndex ++; {S:28764 E:28777 D:3 BT: 0}
System.out.println("I took case IF; ii=" + insertIndex); {S:28786 E:28841 D:3 BT: 0}
</sublist>
break; {S:28858 E:28863 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:4 Paths:2 CP:0
/***************************
Processing list:
case FunctionTreeTest.ELSE: {S:28871 E:29478 D:1 BT: 4}
System.out.println("I took case ELSE; ii=" + insertIndex); {S:29407 E:29464 D:2 BT: 0}
break; {S:29473 E:29478 D:2 BT: 0}
****************************/
/***************************
Processing list:
case FunctionTreeTest.ELSE: {S:28871 E:29478 D:1 BT: 4}
System.out.println("I took case ELSE; ii=" + insertIndex); {S:29407 E:29464 D:2 BT: 0}
break; {S:29473 E:29478 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#7(2) Type:4 Paths:2 CP:0
/***************************
Processing list:
case FunctionTreeTest.MULT_NODE: {S:29486 E:30628 D:1 BT: 4}
CodeNodeTest d =(CodeNodeTest)children.get(0); {S:29606 E:29645 D:2 BT: 0}
break; {S:30623 E:30628 D:2 BT: 0}
****************************/
/***************************
Processing list:
case FunctionTreeTest.MULT_NODE: {S:29486 E:30628 D:1 BT: 4}
CodeNodeTest d =(CodeNodeTest)children.get(0); {S:29606 E:29645 D:2 BT: 0}
break; {S:30623 E:30628 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#8(2) Type:4 Paths:1 CP:104
/***************************
Processing list:
case FunctionTreeTest.CASE: {S:30636 E:30658 D:1 BT: 4}
case FunctionTreeTest.DEFAULT: {S:30667 E:30806 D:1 BT: 4}
insertIndex ++; {S:30701 E:30714 D:2 BT: 0}
System.out.println("I took case CASE; ii=" + insertIndex); {S:30749 E:30806 D:2 BT: 0}
****************************/
/***************************
Processing list:
case FunctionTreeTest.CASE: {S:30636 E:30658 D:1 BT: 4}
QuicktestRunner.execPath += 104; {S:30667 E:0 D:1 BT: 0}
QuicktestRunner.execPath -= 52; {S:30667 E:0 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#9(2) Type:4 Paths:1 CP:52
/***************************
Processing list:
case FunctionTreeTest.DEFAULT: {S:30667 E:30806 D:1 BT: 4}
insertIndex ++; {S:30701 E:30714 D:2 BT: 0}
System.out.println("I took case CASE; ii=" + insertIndex); {S:30749 E:30806 D:2 BT: 0}
****************************/
/***************************
Processing list:
case FunctionTreeTest.DEFAULT: {S:30667 E:30806 D:1 BT: 4}
QuicktestRunner.execPath += 52; {S:30701 E:0 D:2 BT: 0}
insertIndex ++; {S:30701 E:30714 D:2 BT: 0}
System.out.println("I took case CASE; ii=" + insertIndex); {S:30749 E:30806 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#10(2) Type:5 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#11(3) Type:1 Paths:12 CP:0
/***************************
Processing list:
if(currPath>0){} {S:30822 E:32693 D:0 BT: 1}
LineInfoTest ref1; {S:30854 E:30867 D:1 BT: 0}
System.out.println("Comparing ii=" + insertIndex + " and size=" + llCopy.size()); {S:30909 E:30989 D:1 BT: 0}
int[]info = getBlockData(ref1); {S:31123 E:31154 D:1 BT: 0}
blockStartChar += info[0]; {S:31350 E:31375 D:1 BT: 0}
blockTabDepth += info[1]; {S:31384 E:31408 D:1 BT: 0}
LineInfoTest cpLine; {S:31462 E:31477 D:1 BT: 0}
System.out.println(llCopy.outputWTDepth("   " , false)); {S:32384 E:32438 D:1 BT: 0}
System.out.println("Line list size:" + llCopy.size()+ " insertion point:" + insertIndex); {S:32447 E:32536 D:1 BT: 0}
llCopy.add(insertIndex , cpLine); {S:32545 E:32576 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(currPath>0){} {S:30822 E:32693 D:0 BT: 1}
LineInfoTest ref1; {S:30854 E:30867 D:1 BT: 0}
System.out.println("Comparing ii=" + insertIndex + " and size=" + llCopy.size()); {S:30909 E:30989 D:1 BT: 0}
int[]info = getBlockData(ref1); {S:31123 E:31154 D:1 BT: 0}
blockStartChar += info[0]; {S:31350 E:31375 D:1 BT: 0}
blockTabDepth += info[1]; {S:31384 E:31408 D:1 BT: 0}
LineInfoTest cpLine; {S:31462 E:31477 D:1 BT: 0}
System.out.println(llCopy.outputWTDepth("   " , false)); {S:32384 E:32438 D:1 BT: 0}
System.out.println("Line list size:" + llCopy.size()+ " insertion point:" + insertIndex); {S:32447 E:32536 D:1 BT: 0}
llCopy.add(insertIndex , cpLine); {S:32545 E:32576 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#12(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#13(4) Type:1 Paths:3 CP:0
/***************************
Processing list:
if(blockType == FunctionTreeTest.CASE){} {S:33290 E:34729 D:0 BT: 1}
for(int i = 1;i<llCopy.size();i ++){} {S:33340 E:34469 D:1 BT: 0}
<sublist>
LineInfoTest caseLine = llCopy.getLine(i); {S:33396 E:33433 D:2 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(blockType == FunctionTreeTest.CASE){} {S:33290 E:34729 D:0 BT: 1}
for(int i = 1;i<llCopy.size();i ++){} {S:33340 E:34469 D:1 BT: 0}
<sublist>
LineInfoTest caseLine = llCopy.getLine(i); {S:33396 E:33433 D:2 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#14(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#15(6) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:28979 E:29398 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:28979 E:29398 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#16(7) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:29653 E:30614 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:29653 E:30614 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#17(11) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:30997 E:31106 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:30997 E:31106 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#18(11) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:31162 E:31341 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:31162 E:31341 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#19(11) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:31485 E:32375 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:31485 E:32375 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#20(13) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:33541 E:34460 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:33541 E:34460 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#21(15) Type:1 Paths:1 CP:104
/***************************
Processing list:
if(llCopy.size()>0){} {S:28980 E:29398 D:2 BT: 1}
LineInfoTest ref0 = llCopy.getLine(0); {S:29019 E:29052 D:3 BT: 0}
LineInfoTest newElse = new LineInfoTest("else" + GT , ref0.startChar , ref0.tabDepth); {S:29062 E:29137 D:3 BT: 0}
newElse.branchType = FunctionTreeTest.ELSE; {S:29147 E:29185 D:3 BT: 0}
newElse.endChar = ref0.endChar; {S:29195 E:29225 D:3 BT: 0}
llCopy.remove(0); {S:29235 E:29251 D:3 BT: 0}
llCopy.addFirst(newElse); {S:29261 E:29285 D:3 BT: 0}
indentAll(this , 1 , llCopy); {S:29304 E:29330 D:3 BT: 0}
insertIndex ++; {S:29376 E:29389 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(llCopy.size()>0){} {S:28980 E:29398 D:2 BT: 1}
QuicktestRunner.execPath += 104; {S:29019 E:0 D:3 BT: 0}
LineInfoTest ref0 = llCopy.getLine(0); {S:29019 E:29052 D:3 BT: 0}
LineInfoTest newElse = new LineInfoTest("else" + GT , ref0.startChar , ref0.tabDepth); {S:29062 E:29137 D:3 BT: 0}
newElse.branchType = FunctionTreeTest.ELSE; {S:29147 E:29185 D:3 BT: 0}
newElse.endChar = ref0.endChar; {S:29195 E:29225 D:3 BT: 0}
llCopy.remove(0); {S:29235 E:29251 D:3 BT: 0}
llCopy.addFirst(newElse); {S:29261 E:29285 D:3 BT: 0}
indentAll(this , 1 , llCopy); {S:29304 E:29330 D:3 BT: 0}
insertIndex ++; {S:29376 E:29389 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#22(15) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#23(16) Type:1 Paths:1 CP:208
/***************************
Processing list:
if(d.blockType == FunctionTreeTest.CASE){} {S:29654 E:30614 D:2 BT: 1}
LineInfoTest ref0 = llCopy.getLine(0); {S:29772 E:29805 D:3 BT: 0}
LineInfoTest newS = new LineInfoTest("switch" + ref0.condition + GT , ref0.startChar , ref0.tabDepth); {S:29815 E:29906 D:3 BT: 0}
newS.branchType = FunctionTreeTest.SWITCH; {S:29916 E:29953 D:3 BT: 0}
newS.endChar = ref0.endChar; {S:29963 E:29990 D:3 BT: 0}
llCopy.remove(0); {S:30000 E:30016 D:3 BT: 0}
for(int i = 0;i<llCopy.size();i ++){} {S:30081 E:30234 D:3 BT: 0}
<sublist>
LineInfoTest li = llCopy.getLine(i); {S:30139 E:30170 D:4 BT: 0}
</sublist>
llCopy.addFirst(newS); {S:30295 E:30316 D:3 BT: 0}
for(int i = 0;i<llCopy.size();i ++){} {S:30326 E:30477 D:3 BT: 0}
<sublist>
LineInfoTest li = llCopy.getLine(i); {S:30384 E:30415 D:4 BT: 0}
System.out.println("|" + li.lineText + "|"); {S:30426 E:30467 D:4 BT: 0}
</sublist>
System.out.println("I took case SWITCH; ii=" + insertIndex); {S:30523 E:30582 D:3 BT: 0}
insertIndex ++; {S:30592 E:30605 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(d.blockType == FunctionTreeTest.CASE){} {S:29654 E:30614 D:2 BT: 1}
QuicktestRunner.execPath += 208; {S:29772 E:0 D:3 BT: 0}
LineInfoTest ref0 = llCopy.getLine(0); {S:29772 E:29805 D:3 BT: 0}
LineInfoTest newS = new LineInfoTest("switch" + ref0.condition + GT , ref0.startChar , ref0.tabDepth); {S:29815 E:29906 D:3 BT: 0}
newS.branchType = FunctionTreeTest.SWITCH; {S:29916 E:29953 D:3 BT: 0}
newS.endChar = ref0.endChar; {S:29963 E:29990 D:3 BT: 0}
llCopy.remove(0); {S:30000 E:30016 D:3 BT: 0}
for(int i = 0;i<llCopy.size();i ++){} {S:30081 E:30234 D:3 BT: 0}
<sublist>
LineInfoTest li = llCopy.getLine(i); {S:30139 E:30170 D:4 BT: 0}
</sublist>
llCopy.addFirst(newS); {S:30295 E:30316 D:3 BT: 0}
for(int i = 0;i<llCopy.size();i ++){} {S:30326 E:30477 D:3 BT: 0}
<sublist>
LineInfoTest li = llCopy.getLine(i); {S:30384 E:30415 D:4 BT: 0}
System.out.println("|" + li.lineText + "|"); {S:30426 E:30467 D:4 BT: 0}
</sublist>
System.out.println("I took case SWITCH; ii=" + insertIndex); {S:30523 E:30582 D:3 BT: 0}
insertIndex ++; {S:30592 E:30605 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#24(16) Type:2 Paths:1 CP:156

/***************************
Processing list:
else {S:30614 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 156; {S:30615 E:0 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#25(17) Type:1 Paths:1 CP:24
/***************************
Processing list:
if(insertIndex>= llCopy.size())else ref1 = llCopy.getLine(insertIndex); {S:30998 E:31066 D:1 BT: 1}
ref1 = null; {S:31039 E:31050 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(insertIndex>= llCopy.size()){} {S:30998 E:31066 D:1 BT: 1}
QuicktestRunner.execPath += 24; {S:31039 E:0 D:2 BT: 0}
ref1 = null; {S:31039 E:31050 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#26(17) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:31067 E:31106 D:1 BT: 2}
ref1 = llCopy.getLine(insertIndex); {S:31072 E:31106 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:31067 E:31106 D:1 BT: 2}
ref1 = llCopy.getLine(insertIndex); {S:31072 E:31106 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#27(18) Type:1 Paths:1 CP:12
/***************************
Processing list:
if(info == null){} {S:31163 E:31341 D:1 BT: 1}
info = getBlockData(llCopy.getLine(insertIndex - 1)); {S:31242 E:31294 D:2 BT: 0}
info[0]++; {S:31304 E:31313 D:2 BT: 0}
info[1]++; {S:31323 E:31332 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(info == null){} {S:31163 E:31341 D:1 BT: 1}
QuicktestRunner.execPath += 12; {S:31242 E:0 D:2 BT: 0}
info = getBlockData(llCopy.getLine(insertIndex - 1)); {S:31242 E:31294 D:2 BT: 0}
info[0]++; {S:31304 E:31313 D:2 BT: 0}
info[1]++; {S:31323 E:31332 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#28(18) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#29(19) Type:1 Paths:1 CP:8
/***************************
Processing list:
if(ref1 != null)else{} {S:31486 E:31693 D:1 BT: 1}
cpLine = new LineInfoTest("QuicktestRunner.execPath += " + currPath + ";" , blockStartChar , blockTabDepth); {S:31511 E:31612 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ref1 != null){} {S:31486 E:31693 D:1 BT: 1}
QuicktestRunner.execPath += 8; {S:31511 E:0 D:2 BT: 0}
cpLine = new LineInfoTest("QuicktestRunner.execPath += " + currPath + ";" , blockStartChar , blockTabDepth); {S:31511 E:31612 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#30(19) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:31694 E:32375 D:1 BT: 2}
insertIndex ++; {S:32160 E:32173 D:1 BT: 0}
blockStartChar ++; {S:32183 E:32199 D:1 BT: 0}
blockTabDepth ++; {S:32209 E:32224 D:1 BT: 0}
cpLine = new LineInfoTest("QuicktestRunner.execPath += " + currPath + ";" , blockStartChar , blockTabDepth); {S:32265 E:32366 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:31694 E:32375 D:1 BT: 2}
insertIndex ++; {S:32160 E:32173 D:2 BT: 0}
blockStartChar ++; {S:32183 E:32199 D:2 BT: 0}
blockTabDepth ++; {S:32209 E:32224 D:2 BT: 0}
cpLine = new LineInfoTest("QuicktestRunner.execPath += " + currPath + ";" , blockStartChar , blockTabDepth); {S:32265 E:32366 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#31(20) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(caseLine.isCase()){} {S:33542 E:34460 D:2 BT: 1}
caseLine = llCopy.getLine(i - 1); {S:33583 E:33615 D:3 BT: 0}
while(i<llCopy.size()){} {S:33626 E:33833 D:3 BT: 0}
<sublist>
LineInfoTest rm = llCopy.getLine(i); {S:33672 E:33703 D:4 BT: 0}
System.out.println("Duplicate case: removing |" + rm.lineText + "|"); {S:33715 E:33783 D:4 BT: 0}
llCopy.remove(i); {S:33795 E:33811 D:4 BT: 0}
</sublist>
int[]xy = this.getBlockData(caseLine); {S:33844 E:33882 D:3 BT: 0}
CodeNodeTest par = parent; {S:33895 E:33916 D:3 BT: 0}
int sz = parent.children.size(); {S:33929 E:33960 D:3 BT: 0}
for(int j = 0;j<sz - 1;j ++){} {S:34061 E:34450 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(caseLine.isCase()){} {S:33542 E:34460 D:2 BT: 1}
caseLine = llCopy.getLine(i - 1); {S:33583 E:33615 D:3 BT: 0}
while(i<llCopy.size()){} {S:33626 E:33833 D:3 BT: 0}
<sublist>
LineInfoTest rm = llCopy.getLine(i); {S:33672 E:33703 D:4 BT: 0}
System.out.println("Duplicate case: removing |" + rm.lineText + "|"); {S:33715 E:33783 D:4 BT: 0}
llCopy.remove(i); {S:33795 E:33811 D:4 BT: 0}
</sublist>
int[]xy = this.getBlockData(caseLine); {S:33844 E:33882 D:3 BT: 0}
CodeNodeTest par = parent; {S:33895 E:33916 D:3 BT: 0}
int sz = parent.children.size(); {S:33929 E:33960 D:3 BT: 0}
for(int j = 0;j<sz - 1;j ++){} {S:34061 E:34450 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#32(20) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:34460 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:34461 E:0 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#33(30) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:31708 E:32150 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:31708 E:32150 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#34(31) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:34117 E:34437 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:34117 E:34437 D:4 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#35(33) Type:1 Paths:1 CP:8
/***************************
Processing list:
if(blockType == FunctionTreeTest.ELSE){ {S:31709 E:32007 D:3 BT: 1}
LineInfoTest newElseLine = new LineInfoTest("else" , blockStartChar , blockTabDepth); {S:31762 E:31836 D:4 BT: 0}
llCopy.add(newElseLine); {S:31846 E:31869 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(blockType == FunctionTreeTest.ELSE){} {S:31709 E:32007 D:3 BT: 1}
QuicktestRunner.execPath += 8; {S:31762 E:0 D:4 BT: 0}
LineInfoTest newElseLine = new LineInfoTest("else" , blockStartChar , blockTabDepth); {S:31762 E:31836 D:4 BT: 0}
llCopy.add(newElseLine); {S:31846 E:31869 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#36(33) Type:2 Paths:1 CP:4
/***************************
Processing list:
 {S:32008 E:32150 D:3 BT: 2}
LineInfoTest newElseLine = new LineInfoTest("default:" , blockStartChar , blockTabDepth - 1); {S:32024 E:32106 D:3 BT: 0}
llCopy.add(newElseLine); {S:32117 E:32140 D:3 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:32008 E:32150 D:3 BT: 2}
QuicktestRunner.execPath += 4; {S:32024 E:0 D:4 BT: 0}
LineInfoTest newElseLine = new LineInfoTest("default:" , blockStartChar , blockTabDepth - 1); {S:32024 E:32106 D:4 BT: 0}
llCopy.add(newElseLine); {S:32117 E:32140 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#37(34) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(parent.children.get(j)== this){} {S:34118 E:34437 D:4 BT: 1}
CodeNodeTest d =(CodeNodeTest)parent.children.get(j + 1); {S:34180 E:34230 D:5 BT: 0}
int x = d.currPath; {S:34245 E:34263 D:5 BT: 0}
LineInfoTest newLine = new LineInfoTest("QuicktestRunner.execPath -= " + x + ";" , xy[0], xy[1]); {S:34278 E:34365 D:5 BT: 0}
llCopy.addLast(newLine); {S:34380 E:34403 D:5 BT: 0}
break; {S:34418 E:34423 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(parent.children.get(j)== this){} {S:34118 E:34437 D:4 BT: 1}
QuicktestRunner.execPath += 3; {S:34180 E:0 D:5 BT: 0}
CodeNodeTest d =(CodeNodeTest)parent.children.get(j + 1); {S:34180 E:34230 D:5 BT: 0}
int x = d.currPath; {S:34245 E:34263 D:5 BT: 0}
LineInfoTest newLine = new LineInfoTest("QuicktestRunner.execPath -= " + x + ";" , xy[0], xy[1]); {S:34278 E:34365 D:5 BT: 0}
llCopy.addLast(newLine); {S:34380 E:34403 D:5 BT: 0}
break; {S:34418 E:34423 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#38(34) Type:2 Paths:1 CP:2

/***************************
Processing list:
else {S:34437 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 2; {S:34438 E:0 D:5 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
LineListTest llCopy = in.copyLineListTest(list); {S:27803 E:27842 D:0 BT: 0}
final String GT = LineInfoTest.BLOCKSTART + LineInfoTest.BLOCKEND; {S:27850 E:27907 D:0 BT: 0}
int insertIndex = 0; {S:27915 E:27934 D:0 BT: 0}
int blockStartChar = 0; {S:27942 E:27964 D:0 BT: 0}
int blockTabDepth = 0; {S:27972 E:27993 D:0 BT: 0}
for(int i = 0;i<llCopy.size();i ++){} {S:28008 E:28151 D:0 BT: 0}
<sublist>
LineInfoTest li = llCopy.getLine(i); {S:28062 E:28093 D:1 BT: 0}
System.out.println("|" + li.lineText + "|"); {S:28102 E:28143 D:1 BT: 0}
</sublist>
LineInfoTest li = llCopy.getLine(i); {S:28062 E:28093 D:1 BT: 0}
System.out.println("|" + li.lineText + "|"); {S:28102 E:28143 D:1 BT: 0}
switch(blockType){} {S:28159 E:30814 D:0 BT: 3}
case FunctionTreeTest.IF: {S:28191 E:28863 D:1 BT: 4}
QuicktestRunner.execPath += 208; {S:28219 E:0 D:2 BT: 0}
{} {S:28219 E:28849 D:2 BT: 0}
<sublist>
String str; {S:28228 E:28238 D:3 BT: 0}
LineInfoTest ref0 = llCopy.getLine(0); {S:28255 E:28288 D:3 BT: 0}
CodeNodeTest p = parent.parent; {S:28297 E:28323 D:3 BT: 0}
str = "if"; {S:28478 E:28488 D:3 BT: 0}
LineInfoTest newIf = new LineInfoTest(str + ref0.condition + GT , ref0.startChar , ref0.tabDepth); {S:28497 E:28584 D:3 BT: 0}
newIf.branchType = FunctionTreeTest.IF; {S:28593 E:28627 D:3 BT: 0}
newIf.endChar = ref0.endChar; {S:28636 E:28664 D:3 BT: 0}
llCopy.remove(0); {S:28673 E:28689 D:3 BT: 0}
llCopy.addFirst(newIf); {S:28698 E:28720 D:3 BT: 0}
insertIndex ++; {S:28764 E:28777 D:3 BT: 0}
System.out.println("I took case IF; ii=" + insertIndex); {S:28786 E:28841 D:3 BT: 0}
</sublist>
String str; {S:28228 E:28238 D:3 BT: 0}
LineInfoTest ref0 = llCopy.getLine(0); {S:28255 E:28288 D:3 BT: 0}
CodeNodeTest p = parent.parent; {S:28297 E:28323 D:3 BT: 0}
str = "if"; {S:28478 E:28488 D:3 BT: 0}
LineInfoTest newIf = new LineInfoTest(str + ref0.condition + GT , ref0.startChar , ref0.tabDepth); {S:28497 E:28584 D:3 BT: 0}
newIf.branchType = FunctionTreeTest.IF; {S:28593 E:28627 D:3 BT: 0}
newIf.endChar = ref0.endChar; {S:28636 E:28664 D:3 BT: 0}
llCopy.remove(0); {S:28673 E:28689 D:3 BT: 0}
llCopy.addFirst(newIf); {S:28698 E:28720 D:3 BT: 0}
insertIndex ++; {S:28764 E:28777 D:3 BT: 0}
System.out.println("I took case IF; ii=" + insertIndex); {S:28786 E:28841 D:3 BT: 0}
break; {S:28858 E:28863 D:2 BT: 0}
case FunctionTreeTest.ELSE: {S:28871 E:29478 D:1 BT: 4}
 {S:28979 E:29398 D:2 BT: 7}
if(llCopy.size()>0){} {S:28980 E:29398 D:2 BT: 1}
QuicktestRunner.execPath += 104; {S:29019 E:0 D:3 BT: 0}
LineInfoTest ref0 = llCopy.getLine(0); {S:29019 E:29052 D:3 BT: 0}
LineInfoTest newElse = new LineInfoTest("else" + GT , ref0.startChar , ref0.tabDepth); {S:29062 E:29137 D:3 BT: 0}
newElse.branchType = FunctionTreeTest.ELSE; {S:29147 E:29185 D:3 BT: 0}
newElse.endChar = ref0.endChar; {S:29195 E:29225 D:3 BT: 0}
llCopy.remove(0); {S:29235 E:29251 D:3 BT: 0}
llCopy.addFirst(newElse); {S:29261 E:29285 D:3 BT: 0}
indentAll(this , 1 , llCopy); {S:29304 E:29330 D:3 BT: 0}
insertIndex ++; {S:29376 E:29389 D:3 BT: 0}
System.out.println("I took case ELSE; ii=" + insertIndex); {S:29407 E:29464 D:2 BT: 0}
break; {S:29473 E:29478 D:2 BT: 0}
case FunctionTreeTest.MULT_NODE: {S:29486 E:30628 D:1 BT: 4}
CodeNodeTest d =(CodeNodeTest)children.get(0); {S:29606 E:29645 D:2 BT: 0}
 {S:29653 E:30614 D:2 BT: 7}
if(d.blockType == FunctionTreeTest.CASE){} {S:29654 E:30614 D:2 BT: 1}
QuicktestRunner.execPath += 208; {S:29772 E:0 D:3 BT: 0}
LineInfoTest ref0 = llCopy.getLine(0); {S:29772 E:29805 D:3 BT: 0}
LineInfoTest newS = new LineInfoTest("switch" + ref0.condition + GT , ref0.startChar , ref0.tabDepth); {S:29815 E:29906 D:3 BT: 0}
newS.branchType = FunctionTreeTest.SWITCH; {S:29916 E:29953 D:3 BT: 0}
newS.endChar = ref0.endChar; {S:29963 E:29990 D:3 BT: 0}
llCopy.remove(0); {S:30000 E:30016 D:3 BT: 0}
for(int i = 0;i<llCopy.size();i ++){} {S:30081 E:30234 D:3 BT: 0}
<sublist>
LineInfoTest li = llCopy.getLine(i); {S:30139 E:30170 D:4 BT: 0}
</sublist>
LineInfoTest li = llCopy.getLine(i); {S:30139 E:30170 D:4 BT: 0}
llCopy.addFirst(newS); {S:30295 E:30316 D:3 BT: 0}
for(int i = 0;i<llCopy.size();i ++){} {S:30326 E:30477 D:3 BT: 0}
<sublist>
LineInfoTest li = llCopy.getLine(i); {S:30384 E:30415 D:4 BT: 0}
System.out.println("|" + li.lineText + "|"); {S:30426 E:30467 D:4 BT: 0}
</sublist>
LineInfoTest li = llCopy.getLine(i); {S:30384 E:30415 D:4 BT: 0}
System.out.println("|" + li.lineText + "|"); {S:30426 E:30467 D:4 BT: 0}
System.out.println("I took case SWITCH; ii=" + insertIndex); {S:30523 E:30582 D:3 BT: 0}
insertIndex ++; {S:30592 E:30605 D:3 BT: 0}
else {S:30614 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 156; {S:30615 E:0 D:3 BT: 0}
break; {S:30623 E:30628 D:2 BT: 0}
case FunctionTreeTest.CASE: {S:30636 E:30658 D:1 BT: 4}
case FunctionTreeTest.DEFAULT: {S:30667 E:30806 D:1 BT: 4}
QuicktestRunner.execPath += 104; {S:30667 E:0 D:1 BT: 0}
QuicktestRunner.execPath -= 52; {S:30667 E:0 D:1 BT: 0}
insertIndex ++; {S:30701 E:30714 D:2 BT: 0}
QuicktestRunner.execPath += 52; {S:30701 E:0 D:2 BT: 0}
System.out.println("I took case CASE; ii=" + insertIndex); {S:30749 E:30806 D:2 BT: 0}
 {S:30821 E:32693 D:0 BT: 7}
if(currPath>0){} {S:30822 E:32693 D:0 BT: 1}
LineInfoTest ref1; {S:30854 E:30867 D:1 BT: 0}
System.out.println("Comparing ii=" + insertIndex + " and size=" + llCopy.size()); {S:30909 E:30989 D:1 BT: 0}
 {S:30997 E:31106 D:1 BT: 7}
if(insertIndex>= llCopy.size()){} {S:30998 E:31066 D:1 BT: 1}
QuicktestRunner.execPath += 24; {S:31039 E:0 D:2 BT: 0}
ref1 = null; {S:31039 E:31050 D:2 BT: 0}
else{} {S:31067 E:31106 D:1 BT: 2}
ref1 = llCopy.getLine(insertIndex); {S:31072 E:31106 D:2 BT: 0}
int[]info = getBlockData(ref1); {S:31123 E:31154 D:1 BT: 0}
 {S:31162 E:31341 D:1 BT: 7}
if(info == null){} {S:31163 E:31341 D:1 BT: 1}
QuicktestRunner.execPath += 12; {S:31242 E:0 D:2 BT: 0}
info = getBlockData(llCopy.getLine(insertIndex - 1)); {S:31242 E:31294 D:2 BT: 0}
info[0]++; {S:31304 E:31313 D:2 BT: 0}
info[1]++; {S:31323 E:31332 D:2 BT: 0}
blockStartChar += info[0]; {S:31350 E:31375 D:1 BT: 0}
blockTabDepth += info[1]; {S:31384 E:31408 D:1 BT: 0}
LineInfoTest cpLine; {S:31462 E:31477 D:1 BT: 0}
 {S:31485 E:32375 D:1 BT: 7}
if(ref1 != null){} {S:31486 E:31693 D:1 BT: 1}
QuicktestRunner.execPath += 8; {S:31511 E:0 D:2 BT: 0}
cpLine = new LineInfoTest("QuicktestRunner.execPath += " + currPath + ";" , blockStartChar , blockTabDepth); {S:31511 E:31612 D:2 BT: 0}
else{} {S:31694 E:32375 D:1 BT: 2}
 {S:31708 E:32150 D:2 BT: 7}
if(blockType == FunctionTreeTest.ELSE){} {S:31709 E:32007 D:2 BT: 1}
QuicktestRunner.execPath += 8; {S:31762 E:0 D:3 BT: 0}
LineInfoTest newElseLine = new LineInfoTest("else" , blockStartChar , blockTabDepth); {S:31762 E:31836 D:3 BT: 0}
llCopy.add(newElseLine); {S:31846 E:31869 D:3 BT: 0}
else{} {S:32008 E:32150 D:2 BT: 2}
QuicktestRunner.execPath += 4; {S:32024 E:0 D:3 BT: 0}
LineInfoTest newElseLine = new LineInfoTest("default:" , blockStartChar , blockTabDepth - 1); {S:32024 E:32106 D:3 BT: 0}
llCopy.add(newElseLine); {S:32117 E:32140 D:3 BT: 0}
insertIndex ++; {S:32160 E:32173 D:2 BT: 0}
blockStartChar ++; {S:32183 E:32199 D:2 BT: 0}
blockTabDepth ++; {S:32209 E:32224 D:2 BT: 0}
cpLine = new LineInfoTest("QuicktestRunner.execPath += " + currPath + ";" , blockStartChar , blockTabDepth); {S:32265 E:32366 D:2 BT: 0}
System.out.println(llCopy.outputWTDepth("   " , false)); {S:32384 E:32438 D:1 BT: 0}
System.out.println("Line list size:" + llCopy.size()+ " insertion point:" + insertIndex); {S:32447 E:32536 D:1 BT: 0}
llCopy.add(insertIndex , cpLine); {S:32545 E:32576 D:1 BT: 0}
 {S:33289 E:34729 D:0 BT: 7}
if(blockType == FunctionTreeTest.CASE){} {S:33290 E:34729 D:0 BT: 1}
for(int i = 1;i<llCopy.size();i ++){} {S:33340 E:34469 D:1 BT: 0}
<sublist>
LineInfoTest caseLine = llCopy.getLine(i); {S:33396 E:33433 D:2 BT: 0}
</sublist>
LineInfoTest caseLine = llCopy.getLine(i); {S:33396 E:33433 D:2 BT: 0}
 {S:33541 E:34460 D:2 BT: 7}
if(caseLine.isCase()){} {S:33542 E:34460 D:2 BT: 1}
caseLine = llCopy.getLine(i - 1); {S:33583 E:33615 D:3 BT: 0}
while(i<llCopy.size()){} {S:33626 E:33833 D:3 BT: 0}
<sublist>
LineInfoTest rm = llCopy.getLine(i); {S:33672 E:33703 D:4 BT: 0}
System.out.println("Duplicate case: removing |" + rm.lineText + "|"); {S:33715 E:33783 D:4 BT: 0}
llCopy.remove(i); {S:33795 E:33811 D:4 BT: 0}
</sublist>
LineInfoTest rm = llCopy.getLine(i); {S:33672 E:33703 D:4 BT: 0}
System.out.println("Duplicate case: removing |" + rm.lineText + "|"); {S:33715 E:33783 D:4 BT: 0}
llCopy.remove(i); {S:33795 E:33811 D:4 BT: 0}
int[]xy = this.getBlockData(caseLine); {S:33844 E:33882 D:3 BT: 0}
CodeNodeTest par = parent; {S:33895 E:33916 D:3 BT: 0}
int sz = parent.children.size(); {S:33929 E:33960 D:3 BT: 0}
for(int j = 0;j<sz - 1;j ++){} {S:34061 E:34450 D:3 BT: 0}
 {S:34117 E:34437 D:4 BT: 7}
if(parent.children.get(j)== this){} {S:34118 E:34437 D:4 BT: 1}
QuicktestRunner.execPath += 3; {S:34180 E:0 D:5 BT: 0}
CodeNodeTest d =(CodeNodeTest)parent.children.get(j + 1); {S:34180 E:34230 D:5 BT: 0}
int x = d.currPath; {S:34245 E:34263 D:5 BT: 0}
LineInfoTest newLine = new LineInfoTest("QuicktestRunner.execPath -= " + x + ";" , xy[0], xy[1]); {S:34278 E:34365 D:5 BT: 0}
llCopy.addLast(newLine); {S:34380 E:34403 D:5 BT: 0}
break; {S:34418 E:34423 D:5 BT: 0}
else {S:34437 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 2; {S:34438 E:0 D:5 BT: 0}
else {S:34460 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:34461 E:0 D:3 BT: 0}
System.out.println("Changed to:\n" + llCopy.outputWTDepth("   " , false)); {S:34737 E:34809 D:0 BT: 0}
return llCopy; {S:34817 E:34830 D:0 BT: 0}
****************************/
   LineListTest llCopy = in.copyLineListTest(list); //S:27803   E:27842 D: 0BT: 0
   final String GT = LineInfoTest.BLOCKSTART + LineInfoTest.BLOCKEND; //S:27850   E:27907 D: 0BT: 0
   int insertIndex = 0; //S:27915   E:27934 D: 0BT: 0
   int blockStartChar = 0; //S:27942   E:27964 D: 0BT: 0
   int blockTabDepth = 0; //S:27972   E:27993 D: 0BT: 0
   for(int i = 0;i<llCopy.size();i ++) //S:28008   E:28151 D: 0BT: 0
   {
      LineInfoTest li = llCopy.getLine(i); //S:28062   E:28093 D: 1BT: 0
      System.out.println("|" + li.lineText + "|"); //S:28102   E:28143 D: 1BT: 0
   }
   switch(blockType) //S:28159   E:30814 D: 0BT: 3
   {
      case FunctionTreeTest.IF: //S:28191   E:28863 D: 1BT: 4
      {
         QuicktestRunner.execPath += 208; //S:28219   E:0 D: 2BT: 0
          //S:28219   E:28849 D: 2BT: 0
         {
            String str; //S:28228   E:28238 D: 3BT: 0
            LineInfoTest ref0 = llCopy.getLine(0); //S:28255   E:28288 D: 3BT: 0
            CodeNodeTest p = parent.parent; //S:28297   E:28323 D: 3BT: 0
            str = "if"; //S:28478   E:28488 D: 3BT: 0
            LineInfoTest newIf = new LineInfoTest(str + ref0.condition + GT , ref0.startChar , ref0.tabDepth); //S:28497   E:28584 D: 3BT: 0
            newIf.branchType = FunctionTreeTest.IF; //S:28593   E:28627 D: 3BT: 0
            newIf.endChar = ref0.endChar; //S:28636   E:28664 D: 3BT: 0
            llCopy.remove(0); //S:28673   E:28689 D: 3BT: 0
            llCopy.addFirst(newIf); //S:28698   E:28720 D: 3BT: 0
            insertIndex ++; //S:28764   E:28777 D: 3BT: 0
            System.out.println("I took case IF; ii=" + insertIndex); //S:28786   E:28841 D: 3BT: 0
         }
         break; //S:28858   E:28863 D: 2BT: 0
      }
      case FunctionTreeTest.ELSE: //S:28871   E:29478 D: 1BT: 4
      {
          //S:28979   E:29398 D: 2BT: 7
         if(llCopy.size()>0) //S:28980   E:29398 D: 2BT: 1
         {
            QuicktestRunner.execPath += 104; //S:29019   E:0 D: 3BT: 0
            LineInfoTest ref0 = llCopy.getLine(0); //S:29019   E:29052 D: 3BT: 0
            LineInfoTest newElse = new LineInfoTest("else" + GT , ref0.startChar , ref0.tabDepth); //S:29062   E:29137 D: 3BT: 0
            newElse.branchType = FunctionTreeTest.ELSE; //S:29147   E:29185 D: 3BT: 0
            newElse.endChar = ref0.endChar; //S:29195   E:29225 D: 3BT: 0
            llCopy.remove(0); //S:29235   E:29251 D: 3BT: 0
            llCopy.addFirst(newElse); //S:29261   E:29285 D: 3BT: 0
            indentAll(this , 1 , llCopy); //S:29304   E:29330 D: 3BT: 0
            insertIndex ++; //S:29376   E:29389 D: 3BT: 0
         }
         System.out.println("I took case ELSE; ii=" + insertIndex); //S:29407   E:29464 D: 2BT: 0
         break; //S:29473   E:29478 D: 2BT: 0
      }
      case FunctionTreeTest.MULT_NODE: //S:29486   E:30628 D: 1BT: 4
      {
         CodeNodeTest d =(CodeNodeTest)children.get(0); //S:29606   E:29645 D: 2BT: 0
          //S:29653   E:30614 D: 2BT: 7
         if(d.blockType == FunctionTreeTest.CASE) //S:29654   E:30614 D: 2BT: 1
         {
            QuicktestRunner.execPath += 208; //S:29772   E:0 D: 3BT: 0
            LineInfoTest ref0 = llCopy.getLine(0); //S:29772   E:29805 D: 3BT: 0
            LineInfoTest newS = new LineInfoTest("switch" + ref0.condition + GT , ref0.startChar , ref0.tabDepth); //S:29815   E:29906 D: 3BT: 0
            newS.branchType = FunctionTreeTest.SWITCH; //S:29916   E:29953 D: 3BT: 0
            newS.endChar = ref0.endChar; //S:29963   E:29990 D: 3BT: 0
            llCopy.remove(0); //S:30000   E:30016 D: 3BT: 0
            for(int i = 0;i<llCopy.size();i ++) //S:30081   E:30234 D: 3BT: 0
            {
               LineInfoTest li = llCopy.getLine(i); //S:30139   E:30170 D: 4BT: 0
            }
            llCopy.addFirst(newS); //S:30295   E:30316 D: 3BT: 0
            for(int i = 0;i<llCopy.size();i ++) //S:30326   E:30477 D: 3BT: 0
            {
               LineInfoTest li = llCopy.getLine(i); //S:30384   E:30415 D: 4BT: 0
               System.out.println("|" + li.lineText + "|"); //S:30426   E:30467 D: 4BT: 0
            }
            System.out.println("I took case SWITCH; ii=" + insertIndex); //S:30523   E:30582 D: 3BT: 0
            insertIndex ++; //S:30592   E:30605 D: 3BT: 0
         }
         else //S:30614   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 156; //S:30615   E:0 D: 3BT: 0
         }
         break; //S:30623   E:30628 D: 2BT: 0
      }
      case FunctionTreeTest.CASE: //S:30636   E:30658 D: 1BT: 4
      case FunctionTreeTest.DEFAULT: //S:30667   E:30806 D: 1BT: 4
      QuicktestRunner.execPath += 104; //S:30667   E:0 D: 1BT: 0
      QuicktestRunner.execPath -= 52; //S:30667   E:0 D: 1BT: 0
      {
         insertIndex ++; //S:30701   E:30714 D: 2BT: 0
         QuicktestRunner.execPath += 52; //S:30701   E:0 D: 2BT: 0
         System.out.println("I took case CASE; ii=" + insertIndex); //S:30749   E:30806 D: 2BT: 0
      }
   }
    //S:30821   E:32693 D: 0BT: 7
   if(currPath>0) //S:30822   E:32693 D: 0BT: 1
   {
      LineInfoTest ref1; //S:30854   E:30867 D: 1BT: 0
      System.out.println("Comparing ii=" + insertIndex + " and size=" + llCopy.size()); //S:30909   E:30989 D: 1BT: 0
       //S:30997   E:31106 D: 1BT: 7
      if(insertIndex>= llCopy.size()) //S:30998   E:31066 D: 1BT: 1
      {
         QuicktestRunner.execPath += 24; //S:31039   E:0 D: 2BT: 0
         ref1 = null; //S:31039   E:31050 D: 2BT: 0
      }
      else //S:31067   E:31106 D: 1BT: 2
      {
         ref1 = llCopy.getLine(insertIndex); //S:31072   E:31106 D: 2BT: 0
      }
      int[]info = getBlockData(ref1); //S:31123   E:31154 D: 1BT: 0
       //S:31162   E:31341 D: 1BT: 7
      if(info == null) //S:31163   E:31341 D: 1BT: 1
      {
         QuicktestRunner.execPath += 12; //S:31242   E:0 D: 2BT: 0
         info = getBlockData(llCopy.getLine(insertIndex - 1)); //S:31242   E:31294 D: 2BT: 0
         info[0]++; //S:31304   E:31313 D: 2BT: 0
         info[1]++; //S:31323   E:31332 D: 2BT: 0
      }
      blockStartChar += info[0]; //S:31350   E:31375 D: 1BT: 0
      blockTabDepth += info[1]; //S:31384   E:31408 D: 1BT: 0
      LineInfoTest cpLine; //S:31462   E:31477 D: 1BT: 0
       //S:31485   E:32375 D: 1BT: 7
      if(ref1 != null) //S:31486   E:31693 D: 1BT: 1
      {
         QuicktestRunner.execPath += 8; //S:31511   E:0 D: 2BT: 0
         cpLine = new LineInfoTest("QuicktestRunner.execPath += " + currPath + ";" , blockStartChar , blockTabDepth); //S:31511   E:31612 D: 2BT: 0
      }
      else //S:31694   E:32375 D: 1BT: 2
      {
          //S:31708   E:32150 D: 2BT: 7
         if(blockType == FunctionTreeTest.ELSE) //S:31709   E:32007 D: 2BT: 1
         {
            QuicktestRunner.execPath += 8; //S:31762   E:0 D: 3BT: 0
            LineInfoTest newElseLine = new LineInfoTest("else" , blockStartChar , blockTabDepth); //S:31762   E:31836 D: 3BT: 0
            llCopy.add(newElseLine); //S:31846   E:31869 D: 3BT: 0
         }
         else //S:32008   E:32150 D: 2BT: 2
         {
            QuicktestRunner.execPath += 4; //S:32024   E:0 D: 3BT: 0
            LineInfoTest newElseLine = new LineInfoTest("default:" , blockStartChar , blockTabDepth - 1); //S:32024   E:32106 D: 3BT: 0
            llCopy.add(newElseLine); //S:32117   E:32140 D: 3BT: 0
         }
         insertIndex ++; //S:32160   E:32173 D: 2BT: 0
         blockStartChar ++; //S:32183   E:32199 D: 2BT: 0
         blockTabDepth ++; //S:32209   E:32224 D: 2BT: 0
         cpLine = new LineInfoTest("QuicktestRunner.execPath += " + currPath + ";" , blockStartChar , blockTabDepth); //S:32265   E:32366 D: 2BT: 0
      }
      System.out.println(llCopy.outputWTDepth("   " , false)); //S:32384   E:32438 D: 1BT: 0
      System.out.println("Line list size:" + llCopy.size()+ " insertion point:" + insertIndex); //S:32447   E:32536 D: 1BT: 0
      llCopy.add(insertIndex , cpLine); //S:32545   E:32576 D: 1BT: 0
   }
    //S:33289   E:34729 D: 0BT: 7
   if(blockType == FunctionTreeTest.CASE) //S:33290   E:34729 D: 0BT: 1
   {
      for(int i = 1;i<llCopy.size();i ++) //S:33340   E:34469 D: 1BT: 0
      {
         LineInfoTest caseLine = llCopy.getLine(i); //S:33396   E:33433 D: 2BT: 0
          //S:33541   E:34460 D: 2BT: 7
         if(caseLine.isCase()) //S:33542   E:34460 D: 2BT: 1
         {
            caseLine = llCopy.getLine(i - 1); //S:33583   E:33615 D: 3BT: 0
            while(i<llCopy.size()) //S:33626   E:33833 D: 3BT: 0
            {
               LineInfoTest rm = llCopy.getLine(i); //S:33672   E:33703 D: 4BT: 0
               System.out.println("Duplicate case: removing |" + rm.lineText + "|"); //S:33715   E:33783 D: 4BT: 0
               llCopy.remove(i); //S:33795   E:33811 D: 4BT: 0
            }
            int[]xy = this.getBlockData(caseLine); //S:33844   E:33882 D: 3BT: 0
            CodeNodeTest par = parent; //S:33895   E:33916 D: 3BT: 0
            int sz = parent.children.size(); //S:33929   E:33960 D: 3BT: 0
            for(int j = 0;j<sz - 1;j ++) //S:34061   E:34450 D: 3BT: 0
            {
                //S:34117   E:34437 D: 4BT: 7
               if(parent.children.get(j)== this) //S:34118   E:34437 D: 4BT: 1
               {
                  QuicktestRunner.execPath += 3; //S:34180   E:0 D: 5BT: 0
                  CodeNodeTest d =(CodeNodeTest)parent.children.get(j + 1); //S:34180   E:34230 D: 5BT: 0
                  int x = d.currPath; //S:34245   E:34263 D: 5BT: 0
                  LineInfoTest newLine = new LineInfoTest("QuicktestRunner.execPath -= " + x + ";" , xy[0], xy[1]); //S:34278   E:34365 D: 5BT: 0
                  llCopy.addLast(newLine); //S:34380   E:34403 D: 5BT: 0
                  break; //S:34418   E:34423 D: 5BT: 0
               }
               else //S:34437   E:0 D: 4BT: 0
               {
                  QuicktestRunner.execPath += 2; //S:34438   E:0 D: 5BT: 0
               }
            }
         }
         else //S:34460   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 1; //S:34461   E:0 D: 3BT: 0
         }
      }
   }
   System.out.println("Changed to:\n" + llCopy.outputWTDepth("   " , false)); //S:34737   E:34809 D: 0BT: 0
   return llCopy; //S:34817   E:34830 D: 0BT: 0
   }

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

class FunctionTreeTest
{
   public CodeNodeTest root;
   public int pcpLineNo;
   public String debugInfo;
   public static final int OTHER = 0;
   public static final int IF = LineInfoTest.IF;
   public static final int ELSE = LineInfoTest.ELSE;
   public static final int SWITCH = LineInfoTest.SWITCH;
   public static final int CASE = LineInfoTest.CASE;
   public static final int DEFAULT = LineInfoTest.DEFAULT;
   public static final int TRY = LineInfoTest.TRY;
   public static final int TERNARY = LineInfoTest.TERNARY;
   public static final int MULT_NODE = -1;

   FunctionTreeTest(String[] meth)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
pcpLineNo = 0; {S:35370 E:35383 D:0 BT: 0}
LinkedList parts = processCodePath(new LinkedList(), meth , 0 , 0 , 0); {S:35391 E:35458 D:0 BT: 0}
System.out.println("Done getting all " + parts.size()+ " code paths."); {S:35466 E:35537 D:0 BT: 0}
String str2 = ""; {S:35545 E:35561 D:0 BT: 0}
for(int i = 0;i<parts.size();i ++){} {S:35569 E:35740 D:0 BT: 0}
<sublist>
String str =(String)parts.get(i); {S:35622 E:35656 D:1 BT: 0}
CodeNodeTest cn = new CodeNodeTest(str); {S:35665 E:35696 D:1 BT: 0}
str2 += cn.getShortString(); {S:35705 E:35732 D:1 BT: 0}
</sublist>
System.out.println(str2); {S:35782 E:35806 D:0 BT: 0}
CodeNodeTest[]nodes = extractNodes(parts); {S:35814 E:35852 D:0 BT: 0}
linkTree(nodes); {S:35860 E:35875 D:0 BT: 0}
makeEmptyElseNodes(nodes); {S:35883 E:35908 D:0 BT: 0}
aggregateCases(nodes); {S:35916 E:35937 D:0 BT: 0}
setupSubnodes(nodes); {S:35945 E:35965 D:0 BT: 0}
sumLeaves(root); {S:35973 E:35988 D:0 BT: 0}
System.out.println("nPaths = " + parts.size()); {S:35996 E:36042 D:0 BT: 0}
System.out.println("Cyclo = " + root.nPaths); {S:36050 E:36094 D:0 BT: 0}
printTree(0); {S:36102 E:36114 D:0 BT: 0}
****************************/
/***************************
Processing list:
pcpLineNo = 0; {S:35370 E:35383 D:0 BT: 0}
LinkedList parts = processCodePath(new LinkedList(), meth , 0 , 0 , 0); {S:35391 E:35458 D:0 BT: 0}
System.out.println("Done getting all " + parts.size()+ " code paths."); {S:35466 E:35537 D:0 BT: 0}
String str2 = ""; {S:35545 E:35561 D:0 BT: 0}
for(int i = 0;i<parts.size();i ++){} {S:35569 E:35740 D:0 BT: 0}
<sublist>
String str =(String)parts.get(i); {S:35622 E:35656 D:1 BT: 0}
CodeNodeTest cn = new CodeNodeTest(str); {S:35665 E:35696 D:1 BT: 0}
str2 += cn.getShortString(); {S:35705 E:35732 D:1 BT: 0}
</sublist>
System.out.println(str2); {S:35782 E:35806 D:0 BT: 0}
CodeNodeTest[]nodes = extractNodes(parts); {S:35814 E:35852 D:0 BT: 0}
linkTree(nodes); {S:35860 E:35875 D:0 BT: 0}
makeEmptyElseNodes(nodes); {S:35883 E:35908 D:0 BT: 0}
aggregateCases(nodes); {S:35916 E:35937 D:0 BT: 0}
setupSubnodes(nodes); {S:35945 E:35965 D:0 BT: 0}
sumLeaves(root); {S:35973 E:35988 D:0 BT: 0}
System.out.println("nPaths = " + parts.size()); {S:35996 E:36042 D:0 BT: 0}
System.out.println("Cyclo = " + root.nPaths); {S:36050 E:36094 D:0 BT: 0}
printTree(0); {S:36102 E:36114 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
pcpLineNo = 0; {S:35370 E:35383 D:0 BT: 0}
LinkedList parts = processCodePath(new LinkedList(), meth , 0 , 0 , 0); {S:35391 E:35458 D:0 BT: 0}
System.out.println("Done getting all " + parts.size()+ " code paths."); {S:35466 E:35537 D:0 BT: 0}
String str2 = ""; {S:35545 E:35561 D:0 BT: 0}
for(int i = 0;i<parts.size();i ++){} {S:35569 E:35740 D:0 BT: 0}
<sublist>
String str =(String)parts.get(i); {S:35622 E:35656 D:1 BT: 0}
CodeNodeTest cn = new CodeNodeTest(str); {S:35665 E:35696 D:1 BT: 0}
str2 += cn.getShortString(); {S:35705 E:35732 D:1 BT: 0}
</sublist>
String str =(String)parts.get(i); {S:35622 E:35656 D:1 BT: 0}
CodeNodeTest cn = new CodeNodeTest(str); {S:35665 E:35696 D:1 BT: 0}
str2 += cn.getShortString(); {S:35705 E:35732 D:1 BT: 0}
System.out.println(str2); {S:35782 E:35806 D:0 BT: 0}
CodeNodeTest[]nodes = extractNodes(parts); {S:35814 E:35852 D:0 BT: 0}
linkTree(nodes); {S:35860 E:35875 D:0 BT: 0}
makeEmptyElseNodes(nodes); {S:35883 E:35908 D:0 BT: 0}
aggregateCases(nodes); {S:35916 E:35937 D:0 BT: 0}
setupSubnodes(nodes); {S:35945 E:35965 D:0 BT: 0}
sumLeaves(root); {S:35973 E:35988 D:0 BT: 0}
System.out.println("nPaths = " + parts.size()); {S:35996 E:36042 D:0 BT: 0}
System.out.println("Cyclo = " + root.nPaths); {S:36050 E:36094 D:0 BT: 0}
printTree(0); {S:36102 E:36114 D:0 BT: 0}
****************************/
   pcpLineNo = 0; //S:35370   E:35383 D: 0BT: 0
   LinkedList parts = processCodePath(new LinkedList(), meth , 0 , 0 , 0); //S:35391   E:35458 D: 0BT: 0
   System.out.println("Done getting all " + parts.size()+ " code paths."); //S:35466   E:35537 D: 0BT: 0
   String str2 = ""; //S:35545   E:35561 D: 0BT: 0
   for(int i = 0;i<parts.size();i ++) //S:35569   E:35740 D: 0BT: 0
   {
      String str =(String)parts.get(i); //S:35622   E:35656 D: 1BT: 0
      CodeNodeTest cn = new CodeNodeTest(str); //S:35665   E:35696 D: 1BT: 0
      str2 += cn.getShortString(); //S:35705   E:35732 D: 1BT: 0
   }
   System.out.println(str2); //S:35782   E:35806 D: 0BT: 0
   CodeNodeTest[]nodes = extractNodes(parts); //S:35814   E:35852 D: 0BT: 0
   linkTree(nodes); //S:35860   E:35875 D: 0BT: 0
   makeEmptyElseNodes(nodes); //S:35883   E:35908 D: 0BT: 0
   aggregateCases(nodes); //S:35916   E:35937 D: 0BT: 0
   setupSubnodes(nodes); //S:35945   E:35965 D: 0BT: 0
   sumLeaves(root); //S:35973   E:35988 D: 0BT: 0
   System.out.println("nPaths = " + parts.size()); //S:35996   E:36042 D: 0BT: 0
   System.out.println("Cyclo = " + root.nPaths); //S:36050   E:36094 D: 0BT: 0
   printTree(0); //S:36102   E:36114 D: 0BT: 0
   }

   FunctionTreeTest(LineListTest in)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
System.out.println("Method name: " + name + "(" + params.getAsParamList()+ ")"); {S:36173 E:36253 D:0 BT: 0}
System.out.println("======================"); {S:36261 E:36305 D:0 BT: 0}
System.out.println(in.outputWTDepth("   " , false)); {S:36313 E:36363 D:0 BT: 0}
int n = in.size(); {S:36371 E:36388 D:0 BT: 0}
LineListTest llCopy = copyLineListTest(in); {S:36396 E:36430 D:0 BT: 0}
root = new CodeNodeTest(); {S:36438 E:36459 D:0 BT: 0}
root.depth = 0; {S:36467 E:36481 D:0 BT: 0}
root.list = new LineListTest(); {S:36489 E:36515 D:0 BT: 0}
debugInfo = "/********************\n"; {S:36523 E:36560 D:0 BT: 0}
debugInfo += "* Link Tree info:\n"; {S:36568 E:36602 D:0 BT: 0}
debugInfo += linkTree(llCopy , root , true); {S:36610 E:36651 D:0 BT: 0}
debugInfo += "*******************!!\n"; {S:36659 E:36697 D:0 BT: 0}
makeEmptyBranches(root); {S:36760 E:36783 D:0 BT: 0}
aggregateCases(root); {S:36846 E:36866 D:0 BT: 0}
setupSubnodes(root); {S:36929 E:36948 D:0 BT: 0}
markIndeces(root); {S:36990 E:37007 D:0 BT: 0}
sumLeaves(root); {S:37015 E:37030 D:0 BT: 0}
System.out.println("---------------------------------"); {S:37038 E:37093 D:0 BT: 0}
System.out.println(in.outputWTDepth("   " , false)); {S:37101 E:37151 D:0 BT: 0}
****************************/
/***************************
Processing list:
System.out.println("Method name: " + name + "(" + params.getAsParamList()+ ")"); {S:36173 E:36253 D:0 BT: 0}
System.out.println("======================"); {S:36261 E:36305 D:0 BT: 0}
System.out.println(in.outputWTDepth("   " , false)); {S:36313 E:36363 D:0 BT: 0}
int n = in.size(); {S:36371 E:36388 D:0 BT: 0}
LineListTest llCopy = copyLineListTest(in); {S:36396 E:36430 D:0 BT: 0}
root = new CodeNodeTest(); {S:36438 E:36459 D:0 BT: 0}
root.depth = 0; {S:36467 E:36481 D:0 BT: 0}
root.list = new LineListTest(); {S:36489 E:36515 D:0 BT: 0}
debugInfo = "/********************\n"; {S:36523 E:36560 D:0 BT: 0}
debugInfo += "* Link Tree info:\n"; {S:36568 E:36602 D:0 BT: 0}
debugInfo += linkTree(llCopy , root , true); {S:36610 E:36651 D:0 BT: 0}
debugInfo += "*******************!!\n"; {S:36659 E:36697 D:0 BT: 0}
makeEmptyBranches(root); {S:36760 E:36783 D:0 BT: 0}
aggregateCases(root); {S:36846 E:36866 D:0 BT: 0}
setupSubnodes(root); {S:36929 E:36948 D:0 BT: 0}
markIndeces(root); {S:36990 E:37007 D:0 BT: 0}
sumLeaves(root); {S:37015 E:37030 D:0 BT: 0}
System.out.println("---------------------------------"); {S:37038 E:37093 D:0 BT: 0}
System.out.println(in.outputWTDepth("   " , false)); {S:37101 E:37151 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:37158 E:37246 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:37158 E:37246 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(n != in.size()) {S:37159 E:37246 D:0 BT: 1}
System.err.println("Error in original list - it got munched"); {S:37185 E:37246 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(n != in.size()){} {S:37159 E:37246 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:37185 E:0 D:1 BT: 0}
System.err.println("Error in original list - it got munched"); {S:37185 E:37246 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
System.out.println("Method name: " + name + "(" + params.getAsParamList()+ ")"); {S:36173 E:36253 D:0 BT: 0}
System.out.println("======================"); {S:36261 E:36305 D:0 BT: 0}
System.out.println(in.outputWTDepth("   " , false)); {S:36313 E:36363 D:0 BT: 0}
int n = in.size(); {S:36371 E:36388 D:0 BT: 0}
LineListTest llCopy = copyLineListTest(in); {S:36396 E:36430 D:0 BT: 0}
root = new CodeNodeTest(); {S:36438 E:36459 D:0 BT: 0}
root.depth = 0; {S:36467 E:36481 D:0 BT: 0}
root.list = new LineListTest(); {S:36489 E:36515 D:0 BT: 0}
debugInfo = "/********************\n"; {S:36523 E:36560 D:0 BT: 0}
debugInfo += "* Link Tree info:\n"; {S:36568 E:36602 D:0 BT: 0}
debugInfo += linkTree(llCopy , root , true); {S:36610 E:36651 D:0 BT: 0}
debugInfo += "*******************!!\n"; {S:36659 E:36697 D:0 BT: 0}
makeEmptyBranches(root); {S:36760 E:36783 D:0 BT: 0}
aggregateCases(root); {S:36846 E:36866 D:0 BT: 0}
setupSubnodes(root); {S:36929 E:36948 D:0 BT: 0}
markIndeces(root); {S:36990 E:37007 D:0 BT: 0}
sumLeaves(root); {S:37015 E:37030 D:0 BT: 0}
System.out.println("---------------------------------"); {S:37038 E:37093 D:0 BT: 0}
System.out.println(in.outputWTDepth("   " , false)); {S:37101 E:37151 D:0 BT: 0}
 {S:37158 E:37246 D:0 BT: 7}
if(n != in.size()){} {S:37159 E:37246 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:37185 E:0 D:1 BT: 0}
System.err.println("Error in original list - it got munched"); {S:37185 E:37246 D:1 BT: 0}
****************************/
   System.out.println("Method name: " + name + "(" + params.getAsParamList()+ ")"); //S:36173   E:36253 D: 0BT: 0
   System.out.println("======================"); //S:36261   E:36305 D: 0BT: 0
   System.out.println(in.outputWTDepth("   " , false)); //S:36313   E:36363 D: 0BT: 0
   int n = in.size(); //S:36371   E:36388 D: 0BT: 0
   LineListTest llCopy = copyLineListTest(in); //S:36396   E:36430 D: 0BT: 0
   root = new CodeNodeTest(); //S:36438   E:36459 D: 0BT: 0
   root.depth = 0; //S:36467   E:36481 D: 0BT: 0
   root.list = new LineListTest(); //S:36489   E:36515 D: 0BT: 0
   debugInfo = "/********************\n"; //S:36523   E:36560 D: 0BT: 0
   debugInfo += "* Link Tree info:\n"; //S:36568   E:36602 D: 0BT: 0
   debugInfo += linkTree(llCopy , root , true); //S:36610   E:36651 D: 0BT: 0
   debugInfo += "********************/\n"; //S:36659   E:36697 D: 0BT: 0
   makeEmptyBranches(root); //S:36760   E:36783 D: 0BT: 0
   aggregateCases(root); //S:36846   E:36866 D: 0BT: 0
   setupSubnodes(root); //S:36929   E:36948 D: 0BT: 0
   markIndeces(root); //S:36990   E:37007 D: 0BT: 0
   sumLeaves(root); //S:37015   E:37030 D: 0BT: 0
   System.out.println("---------------------------------"); //S:37038   E:37093 D: 0BT: 0
   System.out.println(in.outputWTDepth("   " , false)); //S:37101   E:37151 D: 0BT: 0
    //S:37158   E:37246 D: 0BT: 7
   if(n != in.size()) //S:37159   E:37246 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:37185   E:0 D: 1BT: 0
      System.err.println("Error in original list - it got munched"); //S:37185   E:37246 D: 1BT: 0
   }
   }

   public LineListTest copyLineListTest(LineListTest in)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
LineListTest newList = new LineListTest(); {S:37376 E:37409 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:37417 E:37736 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:37467 E:37494 D:1 BT: 0}
LineInfoTest newLine = new LineInfoTest(li); {S:37503 E:37538 D:1 BT: 0}
newList.add(newLine); {S:37708 E:37728 D:1 BT: 0}
</sublist>
return newList; {S:37744 E:37758 D:0 BT: 0}
****************************/
/***************************
Processing list:
LineListTest newList = new LineListTest(); {S:37376 E:37409 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:37417 E:37736 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:37467 E:37494 D:1 BT: 0}
LineInfoTest newLine = new LineInfoTest(li); {S:37503 E:37538 D:1 BT: 0}
newList.add(newLine); {S:37708 E:37728 D:1 BT: 0}
</sublist>
return newList; {S:37744 E:37758 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:37546 E:37699 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:37546 E:37699 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(li.subLines == null)else newLine.subLines = copyLineListTest(li.subLines); {S:37547 E:37649 D:1 BT: 1}
System.err.println(li.lineText + " has null subLines"); {S:37579 E:37633 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(li.subLines == null){} {S:37547 E:37649 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:37579 E:0 D:2 BT: 0}
System.err.println(li.lineText + " has null subLines"); {S:37579 E:37633 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:37650 E:37699 D:1 BT: 2}
newLine.subLines = copyLineListTest(li.subLines); {S:37655 E:37699 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:37650 E:37699 D:1 BT: 2}
newLine.subLines = copyLineListTest(li.subLines); {S:37655 E:37699 D:2 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
LineListTest newList = new LineListTest(); {S:37376 E:37409 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:37417 E:37736 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:37467 E:37494 D:1 BT: 0}
LineInfoTest newLine = new LineInfoTest(li); {S:37503 E:37538 D:1 BT: 0}
newList.add(newLine); {S:37708 E:37728 D:1 BT: 0}
</sublist>
LineInfoTest li = in.getLine(i); {S:37467 E:37494 D:1 BT: 0}
LineInfoTest newLine = new LineInfoTest(li); {S:37503 E:37538 D:1 BT: 0}
 {S:37546 E:37699 D:1 BT: 7}
if(li.subLines == null){} {S:37547 E:37649 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:37579 E:0 D:2 BT: 0}
System.err.println(li.lineText + " has null subLines"); {S:37579 E:37633 D:2 BT: 0}
else{} {S:37650 E:37699 D:1 BT: 2}
newLine.subLines = copyLineListTest(li.subLines); {S:37655 E:37699 D:2 BT: 0}
newList.add(newLine); {S:37708 E:37728 D:1 BT: 0}
return newList; {S:37744 E:37758 D:0 BT: 0}
****************************/
   LineListTest newList = new LineListTest(); //S:37376   E:37409 D: 0BT: 0
   for(int i = 0;i<in.size();i ++) //S:37417   E:37736 D: 0BT: 0
   {
      LineInfoTest li = in.getLine(i); //S:37467   E:37494 D: 1BT: 0
      LineInfoTest newLine = new LineInfoTest(li); //S:37503   E:37538 D: 1BT: 0
       //S:37546   E:37699 D: 1BT: 7
      if(li.subLines == null) //S:37547   E:37649 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:37579   E:0 D: 2BT: 0
         System.err.println(li.lineText + " has null subLines"); //S:37579   E:37633 D: 2BT: 0
      }
      else //S:37650   E:37699 D: 1BT: 2
      {
         newLine.subLines = copyLineListTest(li.subLines); //S:37655   E:37699 D: 2BT: 0
      }
      newList.add(newLine); //S:37708   E:37728 D: 1BT: 0
   }
   return newList; //S:37744   E:37758 D: 0BT: 0
   }

   private CodeNodeTest[] extractNodes(LinkedList codeParts)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
CodeNodeTest temp[]= new CodeNodeTest[codeParts.size()]; {S:37841 E:37889 D:0 BT: 0}
root = new CodeNodeTest(); {S:37897 E:37918 D:0 BT: 0}
for(int i = 0;i<codeParts.size();i ++){} {S:37949 E:38206 D:0 BT: 0}
<sublist>
String part =(String)codeParts.get(i); {S:38006 E:38045 D:1 BT: 0}
CodeNodeTest node = new CodeNodeTest(part); {S:38054 E:38088 D:1 BT: 0}
temp[i]= node; {S:38097 E:38111 D:1 BT: 0}
</sublist>
return temp; {S:38214 E:38225 D:0 BT: 0}
****************************/
/***************************
Processing list:
CodeNodeTest temp[]= new CodeNodeTest[codeParts.size()]; {S:37841 E:37889 D:0 BT: 0}
root = new CodeNodeTest(); {S:37897 E:37918 D:0 BT: 0}
for(int i = 0;i<codeParts.size();i ++){} {S:37949 E:38206 D:0 BT: 0}
<sublist>
String part =(String)codeParts.get(i); {S:38006 E:38045 D:1 BT: 0}
CodeNodeTest node = new CodeNodeTest(part); {S:38054 E:38088 D:1 BT: 0}
temp[i]= node; {S:38097 E:38111 D:1 BT: 0}
</sublist>
return temp; {S:38214 E:38225 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:38119 E:38163 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:38119 E:38163 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(node.absLineNo == 0) {S:38120 E:38163 D:1 BT: 1}
root = node; {S:38152 E:38163 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(node.absLineNo == 0){} {S:38120 E:38163 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:38152 E:0 D:2 BT: 0}
root = node; {S:38152 E:38163 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
CodeNodeTest temp[]= new CodeNodeTest[codeParts.size()]; {S:37841 E:37889 D:0 BT: 0}
root = new CodeNodeTest(); {S:37897 E:37918 D:0 BT: 0}
for(int i = 0;i<codeParts.size();i ++){} {S:37949 E:38206 D:0 BT: 0}
<sublist>
String part =(String)codeParts.get(i); {S:38006 E:38045 D:1 BT: 0}
CodeNodeTest node = new CodeNodeTest(part); {S:38054 E:38088 D:1 BT: 0}
temp[i]= node; {S:38097 E:38111 D:1 BT: 0}
</sublist>
String part =(String)codeParts.get(i); {S:38006 E:38045 D:1 BT: 0}
CodeNodeTest node = new CodeNodeTest(part); {S:38054 E:38088 D:1 BT: 0}
temp[i]= node; {S:38097 E:38111 D:1 BT: 0}
 {S:38119 E:38163 D:1 BT: 7}
if(node.absLineNo == 0){} {S:38120 E:38163 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:38152 E:0 D:2 BT: 0}
root = node; {S:38152 E:38163 D:2 BT: 0}
return temp; {S:38214 E:38225 D:0 BT: 0}
****************************/
   CodeNodeTest temp[]= new CodeNodeTest[codeParts.size()]; //S:37841   E:37889 D: 0BT: 0
   root = new CodeNodeTest(); //S:37897   E:37918 D: 0BT: 0
   for(int i = 0;i<codeParts.size();i ++) //S:37949   E:38206 D: 0BT: 0
   {
      String part =(String)codeParts.get(i); //S:38006   E:38045 D: 1BT: 0
      CodeNodeTest node = new CodeNodeTest(part); //S:38054   E:38088 D: 1BT: 0
      temp[i]= node; //S:38097   E:38111 D: 1BT: 0
       //S:38119   E:38163 D: 1BT: 7
      if(node.absLineNo == 0) //S:38120   E:38163 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:38152   E:0 D: 2BT: 0
         root = node; //S:38152   E:38163 D: 2BT: 0
      }
   }
   return temp; //S:38214   E:38225 D: 0BT: 0
   }

   private String linkTree(LineListTest in, CodeNodeTest root, boolean trueRoot)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
String rtnVal = "LinkingTree\n"; {S:38328 E:38359 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:38367 E:39635 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:38417 E:38444 D:1 BT: 0}
rtnVal += "Looking at:" + li.getLIInformation(); {S:38453 E:38500 D:1 BT: 0}
CodeNodeTest n = new CodeNodeTest(li); {S:38509 E:38538 D:1 BT: 0}
</sublist>
return rtnVal; {S:39643 E:39656 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = "LinkingTree\n"; {S:38328 E:38359 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:38367 E:39635 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:38417 E:38444 D:1 BT: 0}
rtnVal += "Looking at:" + li.getLIInformation(); {S:38453 E:38500 D:1 BT: 0}
CodeNodeTest n = new CodeNodeTest(li); {S:38509 E:38538 D:1 BT: 0}
</sublist>
return rtnVal; {S:39643 E:39656 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:38546 E:39627 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:38546 E:39627 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(li.branchType != 0){ {S:38547 E:39200 D:1 BT: 1}
rtnVal += "Making subnode\n"; {S:38587 E:38615 D:2 BT: 0}
root.addChild(n); {S:38736 E:38752 D:2 BT: 0}
n.parent = root; {S:38762 E:38777 D:2 BT: 0}
n.parentLine = i; {S:38787 E:38803 D:2 BT: 0}
rtnVal += linkTree(li.subLines , n , true); {S:38850 E:38890 D:2 BT: 0}
li.subLines = new LineListTest(); {S:38979 E:39007 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(li.branchType != 0){} {S:38547 E:39200 D:1 BT: 1}
rtnVal += "Making subnode\n"; {S:38587 E:38615 D:2 BT: 0}
root.addChild(n); {S:38736 E:38752 D:2 BT: 0}
n.parent = root; {S:38762 E:38777 D:2 BT: 0}
n.parentLine = i; {S:38787 E:38803 D:2 BT: 0}
rtnVal += linkTree(li.subLines , n , true); {S:38850 E:38890 D:2 BT: 0}
li.subLines = new LineListTest(); {S:38979 E:39007 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:39201 E:39627 D:1 BT: 2}
rtnVal += linkTree(li.subLines , root , false); {S:39534 E:39578 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:39201 E:39627 D:1 BT: 2}
rtnVal += linkTree(li.subLines , root , false); {S:39534 E:39578 D:2 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(3) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:39105 E:39176 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:39105 E:39176 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#6(4) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:39417 E:39524 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:39417 E:39524 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#7(5) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(! trueRoot){} {S:39106 E:39176 D:2 BT: 1}
in.remove(li); {S:39139 E:39152 D:3 BT: 0}
i --; {S:39163 E:39166 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(! trueRoot){} {S:39106 E:39176 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:39139 E:0 D:3 BT: 0}
in.remove(li); {S:39139 E:39152 D:3 BT: 0}
i --; {S:39163 E:39166 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#8(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#9(6) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(trueRoot){} {S:39418 E:39524 D:3 BT: 1}
root.addLineInfoTest(li); {S:39450 E:39470 D:4 BT: 0}
rtnVal += "Adding subline line\n"; {S:39481 E:39514 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(trueRoot){} {S:39418 E:39524 D:3 BT: 1}
QuicktestRunner.execPath += 1; {S:39450 E:0 D:4 BT: 0}
root.addLineInfoTest(li); {S:39450 E:39470 D:4 BT: 0}
rtnVal += "Adding subline line\n"; {S:39481 E:39514 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#10(6) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = "LinkingTree\n"; {S:38328 E:38359 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:38367 E:39635 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:38417 E:38444 D:1 BT: 0}
rtnVal += "Looking at:" + li.getLIInformation(); {S:38453 E:38500 D:1 BT: 0}
CodeNodeTest n = new CodeNodeTest(li); {S:38509 E:38538 D:1 BT: 0}
</sublist>
LineInfoTest li = in.getLine(i); {S:38417 E:38444 D:1 BT: 0}
rtnVal += "Looking at:" + li.getLIInformation(); {S:38453 E:38500 D:1 BT: 0}
CodeNodeTest n = new CodeNodeTest(li); {S:38509 E:38538 D:1 BT: 0}
 {S:38546 E:39627 D:1 BT: 7}
if(li.branchType != 0){} {S:38547 E:39200 D:1 BT: 1}
rtnVal += "Making subnode\n"; {S:38587 E:38615 D:2 BT: 0}
root.addChild(n); {S:38736 E:38752 D:2 BT: 0}
n.parent = root; {S:38762 E:38777 D:2 BT: 0}
n.parentLine = i; {S:38787 E:38803 D:2 BT: 0}
rtnVal += linkTree(li.subLines , n , true); {S:38850 E:38890 D:2 BT: 0}
li.subLines = new LineListTest(); {S:38979 E:39007 D:2 BT: 0}
 {S:39105 E:39176 D:2 BT: 7}
if(! trueRoot){} {S:39106 E:39176 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:39139 E:0 D:3 BT: 0}
in.remove(li); {S:39139 E:39152 D:3 BT: 0}
i --; {S:39163 E:39166 D:3 BT: 0}
else{} {S:39201 E:39627 D:1 BT: 2}
 {S:39417 E:39524 D:2 BT: 7}
if(trueRoot){} {S:39418 E:39524 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:39450 E:0 D:3 BT: 0}
root.addLineInfoTest(li); {S:39450 E:39470 D:3 BT: 0}
rtnVal += "Adding subline line\n"; {S:39481 E:39514 D:3 BT: 0}
rtnVal += linkTree(li.subLines , root , false); {S:39534 E:39578 D:2 BT: 0}
return rtnVal; {S:39643 E:39656 D:0 BT: 0}
****************************/
   String rtnVal = "LinkingTree\n"; //S:38328   E:38359 D: 0BT: 0
   for(int i = 0;i<in.size();i ++) //S:38367   E:39635 D: 0BT: 0
   {
      LineInfoTest li = in.getLine(i); //S:38417   E:38444 D: 1BT: 0
      rtnVal += "Looking at:" + li.getLIInformation(); //S:38453   E:38500 D: 1BT: 0
      CodeNodeTest n = new CodeNodeTest(li); //S:38509   E:38538 D: 1BT: 0
       //S:38546   E:39627 D: 1BT: 7
      if(li.branchType != 0) //S:38547   E:39200 D: 1BT: 1
      {
         rtnVal += "Making subnode\n"; //S:38587   E:38615 D: 2BT: 0
         root.addChild(n); //S:38736   E:38752 D: 2BT: 0
         n.parent = root; //S:38762   E:38777 D: 2BT: 0
         n.parentLine = i; //S:38787   E:38803 D: 2BT: 0
         rtnVal += linkTree(li.subLines , n , true); //S:38850   E:38890 D: 2BT: 0
         li.subLines = new LineListTest(); //S:38979   E:39007 D: 2BT: 0
          //S:39105   E:39176 D: 2BT: 7
         if(! trueRoot) //S:39106   E:39176 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:39139   E:0 D: 3BT: 0
            in.remove(li); //S:39139   E:39152 D: 3BT: 0
            i --; //S:39163   E:39166 D: 3BT: 0
         }
      }
      else //S:39201   E:39627 D: 1BT: 2
      {
          //S:39417   E:39524 D: 2BT: 7
         if(trueRoot) //S:39418   E:39524 D: 2BT: 1
         {
            QuicktestRunner.execPath += 1; //S:39450   E:0 D: 3BT: 0
            root.addLineInfoTest(li); //S:39450   E:39470 D: 3BT: 0
            rtnVal += "Adding subline line\n"; //S:39481   E:39514 D: 3BT: 0
         }
         rtnVal += linkTree(li.subLines , root , false); //S:39534   E:39578 D: 2BT: 0
      }
   }
   return rtnVal; //S:39643   E:39656 D: 0BT: 0
   }

   private void makeEmptyBranches(CodeNodeTest root)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:5 CP:0
/***************************
Processing list:
int sz = root.children.size(); {S:40151 E:40180 D:0 BT: 0}
for(int i = 0;i<sz;i ++){} {S:40188 E:41094 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)root.children.get(i); {S:40231 E:40277 D:1 BT: 0}
makeEmptyBranches(nde); {S:41064 E:41086 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
int sz = root.children.size(); {S:40151 E:40180 D:0 BT: 0}
for(int i = 0;i<sz;i ++){} {S:40188 E:41094 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)root.children.get(i); {S:40231 E:40277 D:1 BT: 0}
makeEmptyBranches(nde); {S:41064 E:41086 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:5 CP:0
/***************************
Processing list:
 {S:40285 E:41055 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:40285 E:41055 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(nde.blockType == TERNARY){ {S:40286 E:40726 D:1 BT: 1}
int sz2 = nde.children.size(); {S:40332 E:40361 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(nde.blockType == TERNARY){} {S:40286 E:40726 D:1 BT: 1}
int sz2 = nde.children.size(); {S:40332 E:40361 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:3 CP:0
/***************************
Processing list:
 {S:40727 E:41055 D:1 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:40727 E:41055 D:1 BT: 2}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(3) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:40556 E:40709 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:40556 E:40709 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#6(4) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:40731 E:41055 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:40731 E:41055 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#7(5) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(sz2 == 1){} {S:40557 E:40709 D:2 BT: 1}
CodeNodeTest c = new CodeNodeTest(); {S:40589 E:40616 D:3 BT: 0}
c.blockType = ELSE; {S:40625 E:40643 D:3 BT: 0}
c.list = new LineListTest(); {S:40652 E:40675 D:3 BT: 0}
nde.addChild(c); {S:40684 E:40699 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(sz2 == 1){} {S:40557 E:40709 D:2 BT: 1}
QuicktestRunner.execPath += 3; {S:40589 E:0 D:3 BT: 0}
CodeNodeTest c = new CodeNodeTest(); {S:40589 E:40616 D:3 BT: 0}
c.blockType = ELSE; {S:40625 E:40643 D:3 BT: 0}
c.list = new LineListTest(); {S:40652 E:40675 D:3 BT: 0}
nde.addChild(c); {S:40684 E:40699 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#8(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#9(6) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(nde.blockType == SWITCH){} {S:40732 E:41055 D:3 BT: 1}
int sz2 = nde.children.size(); {S:40777 E:40806 D:4 BT: 0}
CodeNodeTest cn =(CodeNodeTest)nde.children.get(sz2 - 1); {S:40816 E:40866 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(nde.blockType == SWITCH){} {S:40732 E:41055 D:3 BT: 1}
int sz2 = nde.children.size(); {S:40777 E:40806 D:4 BT: 0}
CodeNodeTest cn =(CodeNodeTest)nde.children.get(sz2 - 1); {S:40816 E:40866 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#10(6) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(9) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:40875 E:41046 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:40875 E:41046 D:4 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#12(11) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(cn.blockType != DEFAULT){} {S:40876 E:41046 D:4 BT: 1}
CodeNodeTest c = new CodeNodeTest(); {S:40923 E:40950 D:5 BT: 0}
c.blockType = DEFAULT; {S:40959 E:40980 D:5 BT: 0}
c.list = new LineListTest(); {S:40989 E:41012 D:5 BT: 0}
nde.addChild(c); {S:41021 E:41036 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(cn.blockType != DEFAULT){} {S:40876 E:41046 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:40923 E:0 D:5 BT: 0}
CodeNodeTest c = new CodeNodeTest(); {S:40923 E:40950 D:5 BT: 0}
c.blockType = DEFAULT; {S:40959 E:40980 D:5 BT: 0}
c.list = new LineListTest(); {S:40989 E:41012 D:5 BT: 0}
nde.addChild(c); {S:41021 E:41036 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#13(11) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:41046 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 1; {S:41047 E:0 D:5 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int sz = root.children.size(); {S:40151 E:40180 D:0 BT: 0}
for(int i = 0;i<sz;i ++){} {S:40188 E:41094 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)root.children.get(i); {S:40231 E:40277 D:1 BT: 0}
makeEmptyBranches(nde); {S:41064 E:41086 D:1 BT: 0}
</sublist>
CodeNodeTest nde =(CodeNodeTest)root.children.get(i); {S:40231 E:40277 D:1 BT: 0}
 {S:40285 E:41055 D:1 BT: 7}
if(nde.blockType == TERNARY){} {S:40286 E:40726 D:1 BT: 1}
int sz2 = nde.children.size(); {S:40332 E:40361 D:2 BT: 0}
 {S:40556 E:40709 D:2 BT: 7}
if(sz2 == 1){} {S:40557 E:40709 D:2 BT: 1}
QuicktestRunner.execPath += 3; {S:40589 E:0 D:3 BT: 0}
CodeNodeTest c = new CodeNodeTest(); {S:40589 E:40616 D:3 BT: 0}
c.blockType = ELSE; {S:40625 E:40643 D:3 BT: 0}
c.list = new LineListTest(); {S:40652 E:40675 D:3 BT: 0}
nde.addChild(c); {S:40684 E:40699 D:3 BT: 0}
else{} {S:40727 E:41055 D:1 BT: 2}
 {S:40731 E:41055 D:2 BT: 7}
if(nde.blockType == SWITCH){} {S:40732 E:41055 D:2 BT: 1}
int sz2 = nde.children.size(); {S:40777 E:40806 D:3 BT: 0}
CodeNodeTest cn =(CodeNodeTest)nde.children.get(sz2 - 1); {S:40816 E:40866 D:3 BT: 0}
 {S:40875 E:41046 D:3 BT: 7}
if(cn.blockType != DEFAULT){} {S:40876 E:41046 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:40923 E:0 D:4 BT: 0}
CodeNodeTest c = new CodeNodeTest(); {S:40923 E:40950 D:4 BT: 0}
c.blockType = DEFAULT; {S:40959 E:40980 D:4 BT: 0}
c.list = new LineListTest(); {S:40989 E:41012 D:4 BT: 0}
nde.addChild(c); {S:41021 E:41036 D:4 BT: 0}
else {S:41046 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 1; {S:41047 E:0 D:4 BT: 0}
makeEmptyBranches(nde); {S:41064 E:41086 D:1 BT: 0}
****************************/
   int sz = root.children.size(); //S:40151   E:40180 D: 0BT: 0
   for(int i = 0;i<sz;i ++) //S:40188   E:41094 D: 0BT: 0
   {
      CodeNodeTest nde =(CodeNodeTest)root.children.get(i); //S:40231   E:40277 D: 1BT: 0
       //S:40285   E:41055 D: 1BT: 7
      if(nde.blockType == TERNARY) //S:40286   E:40726 D: 1BT: 1
      {
         int sz2 = nde.children.size(); //S:40332   E:40361 D: 2BT: 0
          //S:40556   E:40709 D: 2BT: 7
         if(sz2 == 1) //S:40557   E:40709 D: 2BT: 1
         {
            QuicktestRunner.execPath += 3; //S:40589   E:0 D: 3BT: 0
            CodeNodeTest c = new CodeNodeTest(); //S:40589   E:40616 D: 3BT: 0
            c.blockType = ELSE; //S:40625   E:40643 D: 3BT: 0
            c.list = new LineListTest(); //S:40652   E:40675 D: 3BT: 0
            nde.addChild(c); //S:40684   E:40699 D: 3BT: 0
         }
      }
      else //S:40727   E:41055 D: 1BT: 2
      {
          //S:40731   E:41055 D: 2BT: 7
         if(nde.blockType == SWITCH) //S:40732   E:41055 D: 2BT: 1
         {
            int sz2 = nde.children.size(); //S:40777   E:40806 D: 3BT: 0
            CodeNodeTest cn =(CodeNodeTest)nde.children.get(sz2 - 1); //S:40816   E:40866 D: 3BT: 0
             //S:40875   E:41046 D: 3BT: 7
            if(cn.blockType != DEFAULT) //S:40876   E:41046 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:40923   E:0 D: 4BT: 0
               CodeNodeTest c = new CodeNodeTest(); //S:40923   E:40950 D: 4BT: 0
               c.blockType = DEFAULT; //S:40959   E:40980 D: 4BT: 0
               c.list = new LineListTest(); //S:40989   E:41012 D: 4BT: 0
               nde.addChild(c); //S:41021   E:41036 D: 4BT: 0
            }
            else //S:41046   E:0 D: 3BT: 0
            {
               QuicktestRunner.execPath += 1; //S:41047   E:0 D: 4BT: 0
            }
         }
      }
      makeEmptyBranches(nde); //S:41064   E:41086 D: 1BT: 0
   }
   }

   private void aggregateCases(CodeNodeTest root)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
int sz = root.children.size(); {S:41170 E:41199 D:0 BT: 0}
for(int i = 0;i<sz;i ++){} {S:41207 E:42370 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)root.children.get(i); {S:41250 E:41296 D:1 BT: 0}
aggregateCases(nde); {S:42343 E:42362 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
int sz = root.children.size(); {S:41170 E:41199 D:0 BT: 0}
for(int i = 0;i<sz;i ++){} {S:41207 E:42370 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)root.children.get(i); {S:41250 E:41296 D:1 BT: 0}
aggregateCases(nde); {S:42343 E:42362 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:41304 E:42334 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:41304 E:42334 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:3 CP:0
/***************************
Processing list:
if(nde.blockType == CASE){} {S:41305 E:42334 D:1 BT: 1}
LineInfoTest li =(LineInfoTest)nde.list.getLast(); {S:41409 E:41452 D:2 BT: 0}
String bk =(String)li.textTokens.get(0); {S:41608 E:41649 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(nde.blockType == CASE){} {S:41305 E:42334 D:1 BT: 1}
LineInfoTest li =(LineInfoTest)nde.list.getLast(); {S:41409 E:41452 D:2 BT: 0}
String bk =(String)li.textTokens.get(0); {S:41608 E:41649 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(3) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:41692 E:42325 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:41692 E:42325 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:2 CP:0
/***************************
Processing list:
if((bk.equals("break"))== false){} {S:41693 E:42325 D:2 BT: 1}
for(int j = i + 1;j<sz;j ++){} {S:41895 E:42315 D:3 BT: 0}
<sublist>
CodeNodeTest addCase =(CodeNodeTest)root.children.get(j); {S:41976 E:42026 D:4 BT: 0}
LineInfoTest li2 = null; {S:42038 E:42057 D:4 BT: 0}
for(int k = 0;k<addCase.list.size();k ++){} {S:42069 E:42224 D:4 BT: 0}
<sublist>
li2 = addCase.list.getLine(k); {S:42137 E:42166 D:5 BT: 0}
nde.addLineInfoTest(li2); {S:42179 E:42199 D:5 BT: 0}
</sublist>
</sublist>
****************************/
/***************************
Processing list:
if((bk.equals("break"))== false){} {S:41693 E:42325 D:2 BT: 1}
for(int j = i + 1;j<sz;j ++){} {S:41895 E:42315 D:3 BT: 0}
<sublist>
CodeNodeTest addCase =(CodeNodeTest)root.children.get(j); {S:41976 E:42026 D:4 BT: 0}
LineInfoTest li2 = null; {S:42038 E:42057 D:4 BT: 0}
for(int k = 0;k<addCase.list.size();k ++){} {S:42069 E:42224 D:4 BT: 0}
<sublist>
li2 = addCase.list.getLine(k); {S:42137 E:42166 D:5 BT: 0}
nde.addLineInfoTest(li2); {S:42179 E:42199 D:5 BT: 0}
</sublist>
</sublist>
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:42325 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:42326 E:0 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(6) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:42235 E:42304 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:42235 E:42304 D:4 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#9(8) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(li2 != null && li2.lineText.startsWith("break")) {S:42236 E:42304 D:4 BT: 1}
break; {S:42299 E:42304 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(li2 != null && li2.lineText.startsWith("break")){} {S:42236 E:42304 D:4 BT: 1}
QuicktestRunner.execPath += 3; {S:42299 E:0 D:5 BT: 0}
break; {S:42299 E:42304 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#10(8) Type:2 Paths:1 CP:2

/***************************
Processing list:
else {S:42304 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 2; {S:42305 E:0 D:5 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int sz = root.children.size(); {S:41170 E:41199 D:0 BT: 0}
for(int i = 0;i<sz;i ++){} {S:41207 E:42370 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)root.children.get(i); {S:41250 E:41296 D:1 BT: 0}
aggregateCases(nde); {S:42343 E:42362 D:1 BT: 0}
</sublist>
CodeNodeTest nde =(CodeNodeTest)root.children.get(i); {S:41250 E:41296 D:1 BT: 0}
 {S:41304 E:42334 D:1 BT: 7}
if(nde.blockType == CASE){} {S:41305 E:42334 D:1 BT: 1}
LineInfoTest li =(LineInfoTest)nde.list.getLast(); {S:41409 E:41452 D:2 BT: 0}
String bk =(String)li.textTokens.get(0); {S:41608 E:41649 D:2 BT: 0}
 {S:41692 E:42325 D:2 BT: 7}
if((bk.equals("break"))== false){} {S:41693 E:42325 D:2 BT: 1}
for(int j = i + 1;j<sz;j ++){} {S:41895 E:42315 D:3 BT: 0}
<sublist>
CodeNodeTest addCase =(CodeNodeTest)root.children.get(j); {S:41976 E:42026 D:4 BT: 0}
LineInfoTest li2 = null; {S:42038 E:42057 D:4 BT: 0}
for(int k = 0;k<addCase.list.size();k ++){} {S:42069 E:42224 D:4 BT: 0}
<sublist>
li2 = addCase.list.getLine(k); {S:42137 E:42166 D:5 BT: 0}
nde.addLineInfoTest(li2); {S:42179 E:42199 D:5 BT: 0}
</sublist>
</sublist>
CodeNodeTest addCase =(CodeNodeTest)root.children.get(j); {S:41976 E:42026 D:4 BT: 0}
LineInfoTest li2 = null; {S:42038 E:42057 D:4 BT: 0}
for(int k = 0;k<addCase.list.size();k ++){} {S:42069 E:42224 D:4 BT: 0}
<sublist>
li2 = addCase.list.getLine(k); {S:42137 E:42166 D:5 BT: 0}
nde.addLineInfoTest(li2); {S:42179 E:42199 D:5 BT: 0}
</sublist>
li2 = addCase.list.getLine(k); {S:42137 E:42166 D:5 BT: 0}
nde.addLineInfoTest(li2); {S:42179 E:42199 D:5 BT: 0}
 {S:42235 E:42304 D:4 BT: 7}
if(li2 != null && li2.lineText.startsWith("break")){} {S:42236 E:42304 D:4 BT: 1}
QuicktestRunner.execPath += 3; {S:42299 E:0 D:5 BT: 0}
break; {S:42299 E:42304 D:5 BT: 0}
else {S:42304 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 2; {S:42305 E:0 D:5 BT: 0}
else {S:42325 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:42326 E:0 D:3 BT: 0}
aggregateCases(nde); {S:42343 E:42362 D:1 BT: 0}
****************************/
   int sz = root.children.size(); //S:41170   E:41199 D: 0BT: 0
   for(int i = 0;i<sz;i ++) //S:41207   E:42370 D: 0BT: 0
   {
      CodeNodeTest nde =(CodeNodeTest)root.children.get(i); //S:41250   E:41296 D: 1BT: 0
       //S:41304   E:42334 D: 1BT: 7
      if(nde.blockType == CASE) //S:41305   E:42334 D: 1BT: 1
      {
         LineInfoTest li =(LineInfoTest)nde.list.getLast(); //S:41409   E:41452 D: 2BT: 0
         String bk =(String)li.textTokens.get(0); //S:41608   E:41649 D: 2BT: 0
          //S:41692   E:42325 D: 2BT: 7
         if((bk.equals("break"))== false) //S:41693   E:42325 D: 2BT: 1
         {
            for(int j = i + 1;j<sz;j ++) //S:41895   E:42315 D: 3BT: 0
            {
               CodeNodeTest addCase =(CodeNodeTest)root.children.get(j); //S:41976   E:42026 D: 4BT: 0
               LineInfoTest li2 = null; //S:42038   E:42057 D: 4BT: 0
               for(int k = 0;k<addCase.list.size();k ++) //S:42069   E:42224 D: 4BT: 0
               {
                  li2 = addCase.list.getLine(k); //S:42137   E:42166 D: 5BT: 0
                  nde.addLineInfoTest(li2); //S:42179   E:42199 D: 5BT: 0
               }
                //S:42235   E:42304 D: 4BT: 7
               if(li2 != null && li2.lineText.startsWith("break")) //S:42236   E:42304 D: 4BT: 1
               {
                  QuicktestRunner.execPath += 3; //S:42299   E:0 D: 5BT: 0
                  break; //S:42299   E:42304 D: 5BT: 0
               }
               else //S:42304   E:0 D: 4BT: 0
               {
                  QuicktestRunner.execPath += 2; //S:42305   E:0 D: 5BT: 0
               }
            }
         }
         else //S:42325   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 1; //S:42326   E:0 D: 3BT: 0
         }
      }
      aggregateCases(nde); //S:42343   E:42362 D: 1BT: 0
   }
   }

   private void setupSubnodes(CodeNodeTest root)  //this f(x) may not even be needed
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:7 CP:0
/***************************
Processing list:
int sz = root.children.size(); {S:42481 E:42510 D:0 BT: 0}
for(int i = 0;i<sz;i ++){} {S:42518 E:42860 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)root.children.get(i); {S:42561 E:42607 D:1 BT: 0}
setupSubnodes(nde); {S:42834 E:42852 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
int sz = root.children.size(); {S:42481 E:42510 D:0 BT: 0}
for(int i = 0;i<sz;i ++){} {S:42518 E:42860 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)root.children.get(i); {S:42561 E:42607 D:1 BT: 0}
setupSubnodes(nde); {S:42834 E:42852 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:7 CP:0
/***************************
Processing list:
switch(nde.blockType){case 0:case CASE:case DEFAULT:case IF:case ELSE:case TRY:default:} {S:42616 E:42825 D:1 BT: 3}
****************************/
/***************************
Processing list:
switch(nde.blockType){} {S:42616 E:42825 D:1 BT: 3}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:4 Paths:1 CP:6
/***************************
Processing list:
case 0: {S:42654 E:42660 D:2 BT: 4}
case CASE: {S:42669 E:42678 D:2 BT: 4}
case DEFAULT: {S:42687 E:42699 D:2 BT: 4}
case IF: {S:42708 E:42715 D:2 BT: 4}
case ELSE: {S:42724 E:42733 D:2 BT: 4}
case TRY: {S:42742 E:42765 D:2 BT: 4}
break; {S:42760 E:42765 D:3 BT: 0}
****************************/
/***************************
Processing list:
case 0: {S:42654 E:42660 D:2 BT: 4}
QuicktestRunner.execPath += 6; {S:42669 E:0 D:2 BT: 0}
QuicktestRunner.execPath -= 5; {S:42669 E:0 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:4 Paths:1 CP:5
/***************************
Processing list:
case CASE: {S:42669 E:42678 D:2 BT: 4}
case DEFAULT: {S:42687 E:42699 D:2 BT: 4}
case IF: {S:42708 E:42715 D:2 BT: 4}
case ELSE: {S:42724 E:42733 D:2 BT: 4}
case TRY: {S:42742 E:42765 D:2 BT: 4}
break; {S:42760 E:42765 D:3 BT: 0}
****************************/
/***************************
Processing list:
case CASE: {S:42669 E:42678 D:2 BT: 4}
QuicktestRunner.execPath += 5; {S:42687 E:0 D:2 BT: 0}
QuicktestRunner.execPath -= 4; {S:42687 E:0 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:4 Paths:1 CP:4
/***************************
Processing list:
case DEFAULT: {S:42687 E:42699 D:2 BT: 4}
case IF: {S:42708 E:42715 D:2 BT: 4}
case ELSE: {S:42724 E:42733 D:2 BT: 4}
case TRY: {S:42742 E:42765 D:2 BT: 4}
break; {S:42760 E:42765 D:3 BT: 0}
****************************/
/***************************
Processing list:
case DEFAULT: {S:42687 E:42699 D:2 BT: 4}
QuicktestRunner.execPath += 4; {S:42708 E:0 D:2 BT: 0}
QuicktestRunner.execPath -= 3; {S:42708 E:0 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:4 Paths:1 CP:3
/***************************
Processing list:
case IF: {S:42708 E:42715 D:2 BT: 4}
case ELSE: {S:42724 E:42733 D:2 BT: 4}
case TRY: {S:42742 E:42765 D:2 BT: 4}
break; {S:42760 E:42765 D:3 BT: 0}
****************************/
/***************************
Processing list:
case IF: {S:42708 E:42715 D:2 BT: 4}
QuicktestRunner.execPath += 3; {S:42724 E:0 D:2 BT: 0}
QuicktestRunner.execPath -= 2; {S:42724 E:0 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#7(2) Type:4 Paths:1 CP:2
/***************************
Processing list:
case ELSE: {S:42724 E:42733 D:2 BT: 4}
case TRY: {S:42742 E:42765 D:2 BT: 4}
break; {S:42760 E:42765 D:3 BT: 0}
****************************/
/***************************
Processing list:
case ELSE: {S:42724 E:42733 D:2 BT: 4}
QuicktestRunner.execPath += 2; {S:42742 E:0 D:2 BT: 0}
QuicktestRunner.execPath -= 1; {S:42742 E:0 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#8(2) Type:4 Paths:1 CP:1
/***************************
Processing list:
case TRY: {S:42742 E:42765 D:2 BT: 4}
break; {S:42760 E:42765 D:3 BT: 0}
****************************/
/***************************
Processing list:
case TRY: {S:42742 E:42765 D:2 BT: 4}
QuicktestRunner.execPath += 1; {S:42760 E:0 D:3 BT: 0}
break; {S:42760 E:42765 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#9(2) Type:5 Paths:1 CP:0
/***************************
Processing list:
default: {S:42774 E:42816 D:2 BT: 5}
nde.blockType = MULT_NODE; {S:42791 E:42816 D:3 BT: 0}
****************************/
/***************************
Processing list:
default: {S:42774 E:42816 D:2 BT: 5}
nde.blockType = MULT_NODE; {S:42791 E:42816 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int sz = root.children.size(); {S:42481 E:42510 D:0 BT: 0}
for(int i = 0;i<sz;i ++){} {S:42518 E:42860 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)root.children.get(i); {S:42561 E:42607 D:1 BT: 0}
setupSubnodes(nde); {S:42834 E:42852 D:1 BT: 0}
</sublist>
CodeNodeTest nde =(CodeNodeTest)root.children.get(i); {S:42561 E:42607 D:1 BT: 0}
switch(nde.blockType){} {S:42616 E:42825 D:1 BT: 3}
case 0: {S:42654 E:42660 D:2 BT: 4}
QuicktestRunner.execPath += 6; {S:42669 E:0 D:2 BT: 0}
QuicktestRunner.execPath -= 5; {S:42669 E:0 D:2 BT: 0}
case CASE: {S:42669 E:42678 D:2 BT: 4}
QuicktestRunner.execPath += 5; {S:42687 E:0 D:2 BT: 0}
QuicktestRunner.execPath -= 4; {S:42687 E:0 D:2 BT: 0}
case DEFAULT: {S:42687 E:42699 D:2 BT: 4}
QuicktestRunner.execPath += 4; {S:42708 E:0 D:2 BT: 0}
QuicktestRunner.execPath -= 3; {S:42708 E:0 D:2 BT: 0}
case IF: {S:42708 E:42715 D:2 BT: 4}
QuicktestRunner.execPath += 3; {S:42724 E:0 D:2 BT: 0}
QuicktestRunner.execPath -= 2; {S:42724 E:0 D:2 BT: 0}
case ELSE: {S:42724 E:42733 D:2 BT: 4}
QuicktestRunner.execPath += 2; {S:42742 E:0 D:2 BT: 0}
QuicktestRunner.execPath -= 1; {S:42742 E:0 D:2 BT: 0}
case TRY: {S:42742 E:42765 D:2 BT: 4}
QuicktestRunner.execPath += 1; {S:42760 E:0 D:3 BT: 0}
break; {S:42760 E:42765 D:3 BT: 0}
default: {S:42774 E:42816 D:2 BT: 5}
nde.blockType = MULT_NODE; {S:42791 E:42816 D:3 BT: 0}
setupSubnodes(nde); {S:42834 E:42852 D:1 BT: 0}
****************************/
   int sz = root.children.size(); //S:42481   E:42510 D: 0BT: 0
   for(int i = 0;i<sz;i ++) //S:42518   E:42860 D: 0BT: 0
   {
      CodeNodeTest nde =(CodeNodeTest)root.children.get(i); //S:42561   E:42607 D: 1BT: 0
      switch(nde.blockType) //S:42616   E:42825 D: 1BT: 3
      {
         case 0: //S:42654   E:42660 D: 2BT: 4
         QuicktestRunner.execPath += 6; //S:42669   E:0 D: 2BT: 0
         QuicktestRunner.execPath -= 5; //S:42669   E:0 D: 2BT: 0
         case CASE: //S:42669   E:42678 D: 2BT: 4
         QuicktestRunner.execPath += 5; //S:42687   E:0 D: 2BT: 0
         QuicktestRunner.execPath -= 4; //S:42687   E:0 D: 2BT: 0
         case DEFAULT: //S:42687   E:42699 D: 2BT: 4
         QuicktestRunner.execPath += 4; //S:42708   E:0 D: 2BT: 0
         QuicktestRunner.execPath -= 3; //S:42708   E:0 D: 2BT: 0
         case IF: //S:42708   E:42715 D: 2BT: 4
         QuicktestRunner.execPath += 3; //S:42724   E:0 D: 2BT: 0
         QuicktestRunner.execPath -= 2; //S:42724   E:0 D: 2BT: 0
         case ELSE: //S:42724   E:42733 D: 2BT: 4
         QuicktestRunner.execPath += 2; //S:42742   E:0 D: 2BT: 0
         QuicktestRunner.execPath -= 1; //S:42742   E:0 D: 2BT: 0
         case TRY: //S:42742   E:42765 D: 2BT: 4
         {
            QuicktestRunner.execPath += 1; //S:42760   E:0 D: 3BT: 0
            break; //S:42760   E:42765 D: 3BT: 0
         }
         default: //S:42774   E:42816 D: 2BT: 5
         {
            nde.blockType = MULT_NODE; //S:42791   E:42816 D: 3BT: 0
         }
      }
      setupSubnodes(nde); //S:42834   E:42852 D: 1BT: 0
   }
   }

   private void markIndeces(CodeNodeTest root)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
int level = 0; {S:42933 E:42946 D:0 BT: 0}
int index = 1; {S:42954 E:42967 D:0 BT: 0}
root.index = 0; {S:42975 E:42989 D:0 BT: 0}
while(true){} {S:42997 E:43292 D:0 BT: 0}
<sublist>
CodeNodeTest[]lst = this.levelTraverse(level); {S:43024 E:43066 D:1 BT: 0}
for(int i = 0;i<lst.length;i ++){} {S:43117 E:43268 D:1 BT: 0}
<sublist>
lst[i].index = index; {S:43170 E:43190 D:2 BT: 0}
index ++; {S:43252 E:43259 D:2 BT: 0}
</sublist>
level ++; {S:43277 E:43284 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
int level = 0; {S:42933 E:42946 D:0 BT: 0}
int index = 1; {S:42954 E:42967 D:0 BT: 0}
root.index = 0; {S:42975 E:42989 D:0 BT: 0}
while(true){} {S:42997 E:43292 D:0 BT: 0}
<sublist>
CodeNodeTest[]lst = this.levelTraverse(level); {S:43024 E:43066 D:1 BT: 0}
for(int i = 0;i<lst.length;i ++){} {S:43117 E:43268 D:1 BT: 0}
<sublist>
lst[i].index = index; {S:43170 E:43190 D:2 BT: 0}
index ++; {S:43252 E:43259 D:2 BT: 0}
</sublist>
level ++; {S:43277 E:43284 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:43074 E:43108 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:43074 E:43108 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(lst.length == 0) {S:43075 E:43108 D:1 BT: 1}
break; {S:43103 E:43108 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(lst.length == 0){} {S:43075 E:43108 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:43103 E:0 D:2 BT: 0}
break; {S:43103 E:43108 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int level = 0; {S:42933 E:42946 D:0 BT: 0}
int index = 1; {S:42954 E:42967 D:0 BT: 0}
root.index = 0; {S:42975 E:42989 D:0 BT: 0}
while(true){} {S:42997 E:43292 D:0 BT: 0}
<sublist>
CodeNodeTest[]lst = this.levelTraverse(level); {S:43024 E:43066 D:1 BT: 0}
for(int i = 0;i<lst.length;i ++){} {S:43117 E:43268 D:1 BT: 0}
<sublist>
lst[i].index = index; {S:43170 E:43190 D:2 BT: 0}
index ++; {S:43252 E:43259 D:2 BT: 0}
</sublist>
level ++; {S:43277 E:43284 D:1 BT: 0}
</sublist>
CodeNodeTest[]lst = this.levelTraverse(level); {S:43024 E:43066 D:1 BT: 0}
 {S:43074 E:43108 D:1 BT: 7}
if(lst.length == 0){} {S:43075 E:43108 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:43103 E:0 D:2 BT: 0}
break; {S:43103 E:43108 D:2 BT: 0}
for(int i = 0;i<lst.length;i ++){} {S:43117 E:43268 D:1 BT: 0}
<sublist>
lst[i].index = index; {S:43170 E:43190 D:2 BT: 0}
index ++; {S:43252 E:43259 D:2 BT: 0}
</sublist>
lst[i].index = index; {S:43170 E:43190 D:2 BT: 0}
index ++; {S:43252 E:43259 D:2 BT: 0}
level ++; {S:43277 E:43284 D:1 BT: 0}
****************************/
   int level = 0; //S:42933   E:42946 D: 0BT: 0
   int index = 1; //S:42954   E:42967 D: 0BT: 0
   root.index = 0; //S:42975   E:42989 D: 0BT: 0
   while(true) //S:42997   E:43292 D: 0BT: 0
   {
      CodeNodeTest[]lst = this.levelTraverse(level); //S:43024   E:43066 D: 1BT: 0
       //S:43074   E:43108 D: 1BT: 7
      if(lst.length == 0) //S:43075   E:43108 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:43103   E:0 D: 2BT: 0
         break; //S:43103   E:43108 D: 2BT: 0
      }
      for(int i = 0;i<lst.length;i ++) //S:43117   E:43268 D: 1BT: 0
      {
         lst[i].index = index; //S:43170   E:43190 D: 2BT: 0
         index ++; //S:43252   E:43259 D: 2BT: 0
      }
      level ++; //S:43277   E:43284 D: 1BT: 0
   }
   }

   private void linkTree(CodeNodeTest[] temp)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:6 CP:0
/***************************
Processing list:
for(int i = 0;i<temp.length;i ++){} {S:44275 E:44635 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<temp.length;i ++){} {S:44275 E:44635 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:44326 E:44363 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:44326 E:44363 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:44371 E:44627 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:44371 E:44627 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(temp[i]== root) {S:44327 E:44363 D:1 BT: 1}
continue; {S:44355 E:44363 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(temp[i]== root){} {S:44327 E:44363 D:1 BT: 1}
QuicktestRunner.execPath += 3; {S:44355 E:0 D:2 BT: 0}
continue; {S:44355 E:44363 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(temp[i].parentLine == 0)else{} {S:44372 E:44447 D:1 BT: 1}
root.addChild(temp[i]); {S:44410 E:44432 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(temp[i].parentLine == 0){} {S:44372 E:44447 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:44410 E:0 D:2 BT: 0}
root.addChild(temp[i]); {S:44410 E:44432 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:44448 E:44627 D:1 BT: 2}
for(int j = 0;j<temp.length;j ++){} {S:44463 E:44618 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:44448 E:44627 D:1 BT: 2}
for(int j = 0;j<temp.length;j ++){} {S:44463 E:44618 D:2 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(7) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:44518 E:44608 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:44518 E:44608 D:4 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#9(8) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(temp[j].absLineNo == temp[i].parentLine && i != j) {S:44519 E:44608 D:4 BT: 1}
temp[j].addChild(temp[i]); {S:44583 E:44608 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(temp[j].absLineNo == temp[i].parentLine && i != j){} {S:44519 E:44608 D:4 BT: 1}
QuicktestRunner.execPath += 1; {S:44583 E:0 D:5 BT: 0}
temp[j].addChild(temp[i]); {S:44583 E:44608 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#10(8) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<temp.length;i ++){} {S:44275 E:44635 D:0 BT: 0}
 {S:44326 E:44363 D:1 BT: 7}
if(temp[i]== root){} {S:44327 E:44363 D:1 BT: 1}
QuicktestRunner.execPath += 3; {S:44355 E:0 D:2 BT: 0}
continue; {S:44355 E:44363 D:2 BT: 0}
 {S:44371 E:44627 D:1 BT: 7}
if(temp[i].parentLine == 0){} {S:44372 E:44447 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:44410 E:0 D:2 BT: 0}
root.addChild(temp[i]); {S:44410 E:44432 D:2 BT: 0}
else{} {S:44448 E:44627 D:1 BT: 2}
for(int j = 0;j<temp.length;j ++){} {S:44463 E:44618 D:2 BT: 0}
 {S:44518 E:44608 D:3 BT: 7}
if(temp[j].absLineNo == temp[i].parentLine && i != j){} {S:44519 E:44608 D:3 BT: 1}
QuicktestRunner.execPath += 1; {S:44583 E:0 D:4 BT: 0}
temp[j].addChild(temp[i]); {S:44583 E:44608 D:4 BT: 0}
****************************/
   for(int i = 0;i<temp.length;i ++) //S:44275   E:44635 D: 0BT: 0
   {
       //S:44326   E:44363 D: 1BT: 7
      if(temp[i]== root) //S:44327   E:44363 D: 1BT: 1
      {
         QuicktestRunner.execPath += 3; //S:44355   E:0 D: 2BT: 0
         continue; //S:44355   E:44363 D: 2BT: 0
      }
       //S:44371   E:44627 D: 1BT: 7
      if(temp[i].parentLine == 0) //S:44372   E:44447 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:44410   E:0 D: 2BT: 0
         root.addChild(temp[i]); //S:44410   E:44432 D: 2BT: 0
      }
      else //S:44448   E:44627 D: 1BT: 2
      {
         for(int j = 0;j<temp.length;j ++) //S:44463   E:44618 D: 2BT: 0
         {
             //S:44518   E:44608 D: 3BT: 7
            if(temp[j].absLineNo == temp[i].parentLine && i != j) //S:44519   E:44608 D: 3BT: 1
            {
               QuicktestRunner.execPath += 1; //S:44583   E:0 D: 4BT: 0
               temp[j].addChild(temp[i]); //S:44583   E:44608 D: 4BT: 0
            }
         }
      }
   }
   }

   private void makeEmptyElseNodes(CodeNodeTest[] temp)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:6 CP:0
/***************************
Processing list:
int i = 0; {S:44717 E:44726 D:0 BT: 0}
while(true){} {S:44734 E:45617 D:0 BT: 0}
<sublist>
CodeNodeTest[]lst = levelTraverse(i); {S:44760 E:44793 D:1 BT: 0}
for(int j = 0;j<lst.length;j ++){} {S:44841 E:45598 D:1 BT: 0}
i ++; {S:45606 E:45609 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
int i = 0; {S:44717 E:44726 D:0 BT: 0}
while(true){} {S:44734 E:45617 D:0 BT: 0}
<sublist>
CodeNodeTest[]lst = levelTraverse(i); {S:44760 E:44793 D:1 BT: 0}
for(int j = 0;j<lst.length;j ++){} {S:44841 E:45598 D:1 BT: 0}
i ++; {S:45606 E:45609 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:44800 E:44833 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:44800 E:44833 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:44891 E:45590 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:44891 E:45590 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(lst.length == 0) {S:44801 E:44833 D:1 BT: 1}
break; {S:44828 E:44833 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(lst.length == 0){} {S:44801 E:44833 D:1 BT: 1}
QuicktestRunner.execPath += 3; {S:44828 E:0 D:2 BT: 0}
break; {S:44828 E:44833 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(lst[j].blockType == IF){} {S:44892 E:45590 D:2 BT: 1}
****************************/
/***************************
Processing list:
if(lst[j].blockType == IF){} {S:44892 E:45590 D:2 BT: 1}
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(6) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:44975 E:45379 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:44975 E:45379 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#9(8) Type:1 Paths:1 CP:2
/***************************
Processing list:
if((j + 1)== lst.length || lst[j + 1].blockType != ELSE){} {S:44976 E:45379 D:3 BT: 1}
CodeNodeTest c = new CodeNodeTest(); {S:45108 E:45135 D:4 BT: 0}
c.blockType = ELSE; {S:45145 E:45163 D:4 BT: 0}
c.absLineNo = lst[j].absLineNo; {S:45173 E:45203 D:4 BT: 0}
c.relLineNo = lst[j].relLineNo; {S:45213 E:45243 D:4 BT: 0}
c.parent = lst[j].parent; {S:45253 E:45277 D:4 BT: 0}
c.parentLine = lst[j].parentLine; {S:45287 E:45319 D:4 BT: 0}
c.code = ""; {S:45329 E:45340 D:4 BT: 0}
c.parent.addChild(c); {S:45350 E:45370 D:4 BT: 0}
****************************/
/***************************
Processing list:
if((j + 1)== lst.length || lst[j + 1].blockType != ELSE){} {S:44976 E:45379 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:45108 E:0 D:4 BT: 0}
CodeNodeTest c = new CodeNodeTest(); {S:45108 E:45135 D:4 BT: 0}
c.blockType = ELSE; {S:45145 E:45163 D:4 BT: 0}
c.absLineNo = lst[j].absLineNo; {S:45173 E:45203 D:4 BT: 0}
c.relLineNo = lst[j].relLineNo; {S:45213 E:45243 D:4 BT: 0}
c.parent = lst[j].parent; {S:45253 E:45277 D:4 BT: 0}
c.parentLine = lst[j].parentLine; {S:45287 E:45319 D:4 BT: 0}
c.code = ""; {S:45329 E:45340 D:4 BT: 0}
c.parent.addChild(c); {S:45350 E:45370 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#10(8) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:45379 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 1; {S:45380 E:0 D:4 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int i = 0; {S:44717 E:44726 D:0 BT: 0}
while(true){} {S:44734 E:45617 D:0 BT: 0}
<sublist>
CodeNodeTest[]lst = levelTraverse(i); {S:44760 E:44793 D:1 BT: 0}
for(int j = 0;j<lst.length;j ++){} {S:44841 E:45598 D:1 BT: 0}
i ++; {S:45606 E:45609 D:1 BT: 0}
</sublist>
CodeNodeTest[]lst = levelTraverse(i); {S:44760 E:44793 D:1 BT: 0}
 {S:44800 E:44833 D:1 BT: 7}
if(lst.length == 0){} {S:44801 E:44833 D:1 BT: 1}
QuicktestRunner.execPath += 3; {S:44828 E:0 D:2 BT: 0}
break; {S:44828 E:44833 D:2 BT: 0}
for(int j = 0;j<lst.length;j ++){} {S:44841 E:45598 D:1 BT: 0}
 {S:44891 E:45590 D:2 BT: 7}
if(lst[j].blockType == IF){} {S:44892 E:45590 D:2 BT: 1}
 {S:44975 E:45379 D:3 BT: 7}
if((j + 1)== lst.length || lst[j + 1].blockType != ELSE){} {S:44976 E:45379 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:45108 E:0 D:4 BT: 0}
CodeNodeTest c = new CodeNodeTest(); {S:45108 E:45135 D:4 BT: 0}
c.blockType = ELSE; {S:45145 E:45163 D:4 BT: 0}
c.absLineNo = lst[j].absLineNo; {S:45173 E:45203 D:4 BT: 0}
c.relLineNo = lst[j].relLineNo; {S:45213 E:45243 D:4 BT: 0}
c.parent = lst[j].parent; {S:45253 E:45277 D:4 BT: 0}
c.parentLine = lst[j].parentLine; {S:45287 E:45319 D:4 BT: 0}
c.code = ""; {S:45329 E:45340 D:4 BT: 0}
c.parent.addChild(c); {S:45350 E:45370 D:4 BT: 0}
else {S:45379 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 1; {S:45380 E:0 D:4 BT: 0}
i ++; {S:45606 E:45609 D:1 BT: 0}
****************************/
   int i = 0; //S:44717   E:44726 D: 0BT: 0
   while(true) //S:44734   E:45617 D: 0BT: 0
   {
      CodeNodeTest[]lst = levelTraverse(i); //S:44760   E:44793 D: 1BT: 0
       //S:44800   E:44833 D: 1BT: 7
      if(lst.length == 0) //S:44801   E:44833 D: 1BT: 1
      {
         QuicktestRunner.execPath += 3; //S:44828   E:0 D: 2BT: 0
         break; //S:44828   E:44833 D: 2BT: 0
      }
      for(int j = 0;j<lst.length;j ++) //S:44841   E:45598 D: 1BT: 0
      {
          //S:44891   E:45590 D: 2BT: 7
         if(lst[j].blockType == IF) //S:44892   E:45590 D: 2BT: 1
         {
             //S:44975   E:45379 D: 3BT: 7
            if((j + 1)== lst.length || lst[j + 1].blockType != ELSE) //S:44976   E:45379 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:45108   E:0 D: 4BT: 0
               CodeNodeTest c = new CodeNodeTest(); //S:45108   E:45135 D: 4BT: 0
               c.blockType = ELSE; //S:45145   E:45163 D: 4BT: 0
               c.absLineNo = lst[j].absLineNo; //S:45173   E:45203 D: 4BT: 0
               c.relLineNo = lst[j].relLineNo; //S:45213   E:45243 D: 4BT: 0
               c.parent = lst[j].parent; //S:45253   E:45277 D: 4BT: 0
               c.parentLine = lst[j].parentLine; //S:45287   E:45319 D: 4BT: 0
               c.code = ""; //S:45329   E:45340 D: 4BT: 0
               c.parent.addChild(c); //S:45350   E:45370 D: 4BT: 0
            }
            else //S:45379   E:0 D: 3BT: 0
            {
               QuicktestRunner.execPath += 1; //S:45380   E:0 D: 4BT: 0
            }
         }
      }
      i ++; //S:45606   E:45609 D: 1BT: 0
   }
   }

   private void aggregateCases(CodeNodeTest[] temp)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:34 CP:0
/***************************
Processing list:
int i = 1; {S:45794 E:45803 D:0 BT: 0}
while(true){} {S:45811 E:47868 D:0 BT: 0}
<sublist>
CodeNodeTest[]lst = levelTraverse(i); {S:45837 E:45870 D:1 BT: 0}
for(int j = 0;j<lst.length;j ++){} {S:46080 E:47849 D:1 BT: 0}
i ++; {S:47857 E:47860 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
int i = 1; {S:45794 E:45803 D:0 BT: 0}
while(true){} {S:45811 E:47868 D:0 BT: 0}
<sublist>
CodeNodeTest[]lst = levelTraverse(i); {S:45837 E:45870 D:1 BT: 0}
for(int j = 0;j<lst.length;j ++){} {S:46080 E:47849 D:1 BT: 0}
i ++; {S:47857 E:47860 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:45877 E:46047 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:45877 E:46047 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:17 CP:0
/***************************
Processing list:
 {S:46166 E:47841 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:46166 E:47841 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:17
/***************************
Processing list:
if(lst.length == 0)else{} {S:45878 E:45924 D:1 BT: 1}
break; {S:45905 E:45910 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(lst.length == 0){} {S:45878 E:45924 D:1 BT: 1}
QuicktestRunner.execPath += 17; {S:45905 E:0 D:2 BT: 0}
break; {S:45905 E:45910 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:45925 E:46047 D:1 BT: 2}
for(int j = 0;j<lst.length;j ++)System.out.println(j + ":" + lst[j].getShortString()); {S:45940 E:46038 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:45925 E:46047 D:1 BT: 2}
for(int j = 0;j<lst.length;j ++)System.out.println(j + ":" + lst[j].getShortString()); {S:45940 E:46038 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:16 CP:0
/***************************
Processing list:
if(lst[j].blockType == SWITCH){} {S:46167 E:47841 D:2 BT: 1}
CodeNodeTest[]lst2 = new CodeNodeTest[lst[j].children.size()]; {S:46215 E:46269 D:3 BT: 0}
int lastCase = 0; {S:46279 E:46295 D:3 BT: 0}
for(int k = 0;k<lst[j].children.size();k ++){} {S:46367 E:46569 D:3 BT: 0}
<sublist>
lst2[k]=(CodeNodeTest)lst[j].children.get(k); {S:46434 E:46477 D:4 BT: 0}
</sublist>
for(int k = 0;k<lst2.length;k ++){} {S:46650 E:47551 D:3 BT: 0}
for(int k = 0;k<lst2.length;k ++){} {S:47621 E:47832 D:3 BT: 0}
<sublist>
int brk = lst2[k].code.lastIndexOf(" break;"); {S:47677 E:47722 D:4 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(lst[j].blockType == SWITCH){} {S:46167 E:47841 D:2 BT: 1}
CodeNodeTest[]lst2 = new CodeNodeTest[lst[j].children.size()]; {S:46215 E:46269 D:3 BT: 0}
int lastCase = 0; {S:46279 E:46295 D:3 BT: 0}
for(int k = 0;k<lst[j].children.size();k ++){} {S:46367 E:46569 D:3 BT: 0}
<sublist>
lst2[k]=(CodeNodeTest)lst[j].children.get(k); {S:46434 E:46477 D:4 BT: 0}
</sublist>
for(int k = 0;k<lst2.length;k ++){} {S:46650 E:47551 D:3 BT: 0}
for(int k = 0;k<lst2.length;k ++){} {S:47621 E:47832 D:3 BT: 0}
<sublist>
int brk = lst2[k].code.lastIndexOf(" break;"); {S:47677 E:47722 D:4 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(6) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:46487 E:46559 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:46487 E:46559 D:4 BT: 7}
****************************/
//=======================================
//=======================================
//#9(6) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:46705 E:47541 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:46705 E:47541 D:4 BT: 7}
****************************/
//=======================================
//=======================================
//#10(6) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:47732 E:47822 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:47732 E:47822 D:4 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(8) Type:1 Paths:1 CP:8
/***************************
Processing list:
if(lst2[k].absLineNo>lastCase) {S:46488 E:46559 D:4 BT: 1}
lastCase = lst2[k].absLineNo; {S:46531 E:46559 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(lst2[k].absLineNo>lastCase){} {S:46488 E:46559 D:4 BT: 1}
QuicktestRunner.execPath += 8; {S:46531 E:0 D:5 BT: 0}
lastCase = lst2[k].absLineNo; {S:46531 E:46559 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#12(8) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#13(9) Type:1 Paths:3 CP:0
/***************************
Processing list:
if(lst2[k].blockType == CASE && lst2[k].code.indexOf(" break;")== - 1){} {S:46706 E:47541 D:4 BT: 1}
int lastLine = lst2[k].absLineNo + 1; {S:46848 E:46884 D:5 BT: 0}
while(lastLine<= lastCase){} {S:46949 E:47530 D:5 BT: 0}
<sublist>
for(int l = 0;l<lst2.length;l ++){} {S:47052 E:47495 D:6 BT: 0}
lastLine ++; {S:47508 E:47518 D:6 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(lst2[k].blockType == CASE && lst2[k].code.indexOf(" break;")== - 1){} {S:46706 E:47541 D:4 BT: 1}
int lastLine = lst2[k].absLineNo + 1; {S:46848 E:46884 D:5 BT: 0}
while(lastLine<= lastCase){} {S:46949 E:47530 D:5 BT: 0}
<sublist>
for(int l = 0;l<lst2.length;l ++){} {S:47052 E:47495 D:6 BT: 0}
lastLine ++; {S:47508 E:47518 D:6 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#14(9) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#15(10) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(brk>0){} {S:47733 E:47822 D:4 BT: 1}
lst2[k].code = lst2[k].code.substring(0 , brk); {S:47766 E:47811 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(brk>0){} {S:47733 E:47822 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:47766 E:0 D:5 BT: 0}
lst2[k].code = lst2[k].code.substring(0 , brk); {S:47766 E:47811 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#16(10) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:47822 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 1; {S:47823 E:0 D:5 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#17(13) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:47113 E:47482 D:7 BT: 7}
****************************/
/***************************
Processing list:
 {S:47113 E:47482 D:7 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#18(17) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(lst2[l].absLineNo == lastLine){} {S:47114 E:47482 D:7 BT: 1}
lst2[k].code += lst2[l].code; {S:47220 E:47248 D:8 BT: 0}
****************************/
/***************************
Processing list:
if(lst2[l].absLineNo == lastLine){} {S:47114 E:47482 D:7 BT: 1}
lst2[k].code += lst2[l].code; {S:47220 E:47248 D:8 BT: 0}
****************************/
//=======================================
//=======================================
//#19(17) Type:2 Paths:1 CP:2

/***************************
Processing list:
else {S:47482 E:0 D:7 BT: 0}
QuicktestRunner.execPath += 2; {S:47483 E:0 D:8 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#20(18) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:47348 E:47468 D:8 BT: 7}
****************************/
/***************************
Processing list:
 {S:47348 E:47468 D:8 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#21(20) Type:1 Paths:1 CP:6
/***************************
Processing list:
if(lst2[l].code.indexOf(" break;")== - 1)else lastLine = lastCase; {S:47349 E:47443 D:8 BT: 1}
lastLine ++; {S:47405 E:47415 D:9 BT: 0}
****************************/
/***************************
Processing list:
if(lst2[l].code.indexOf(" break;")== - 1){} {S:47349 E:47443 D:8 BT: 1}
QuicktestRunner.execPath += 6; {S:47405 E:0 D:9 BT: 0}
lastLine ++; {S:47405 E:47415 D:9 BT: 0}
****************************/
//=======================================
//=======================================
//#22(20) Type:2 Paths:1 CP:4
/***************************
Processing list:
 {S:47444 E:47468 D:8 BT: 2}
lastLine = lastCase; {S:47449 E:47468 D:8 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:47444 E:47468 D:8 BT: 2}
QuicktestRunner.execPath += 4; {S:47449 E:0 D:9 BT: 0}
lastLine = lastCase; {S:47449 E:47468 D:9 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int i = 1; {S:45794 E:45803 D:0 BT: 0}
while(true){} {S:45811 E:47868 D:0 BT: 0}
<sublist>
CodeNodeTest[]lst = levelTraverse(i); {S:45837 E:45870 D:1 BT: 0}
for(int j = 0;j<lst.length;j ++){} {S:46080 E:47849 D:1 BT: 0}
i ++; {S:47857 E:47860 D:1 BT: 0}
</sublist>
CodeNodeTest[]lst = levelTraverse(i); {S:45837 E:45870 D:1 BT: 0}
 {S:45877 E:46047 D:1 BT: 7}
if(lst.length == 0){} {S:45878 E:45924 D:1 BT: 1}
QuicktestRunner.execPath += 17; {S:45905 E:0 D:2 BT: 0}
break; {S:45905 E:45910 D:2 BT: 0}
else{} {S:45925 E:46047 D:1 BT: 2}
for(int j = 0;j<lst.length;j ++)System.out.println(j + ":" + lst[j].getShortString()); {S:45940 E:46038 D:2 BT: 0}
for(int j = 0;j<lst.length;j ++){} {S:46080 E:47849 D:1 BT: 0}
 {S:46166 E:47841 D:2 BT: 7}
if(lst[j].blockType == SWITCH){} {S:46167 E:47841 D:2 BT: 1}
CodeNodeTest[]lst2 = new CodeNodeTest[lst[j].children.size()]; {S:46215 E:46269 D:3 BT: 0}
int lastCase = 0; {S:46279 E:46295 D:3 BT: 0}
for(int k = 0;k<lst[j].children.size();k ++){} {S:46367 E:46569 D:3 BT: 0}
<sublist>
lst2[k]=(CodeNodeTest)lst[j].children.get(k); {S:46434 E:46477 D:4 BT: 0}
</sublist>
lst2[k]=(CodeNodeTest)lst[j].children.get(k); {S:46434 E:46477 D:4 BT: 0}
 {S:46487 E:46559 D:4 BT: 7}
if(lst2[k].absLineNo>lastCase){} {S:46488 E:46559 D:4 BT: 1}
QuicktestRunner.execPath += 8; {S:46531 E:0 D:5 BT: 0}
lastCase = lst2[k].absLineNo; {S:46531 E:46559 D:5 BT: 0}
for(int k = 0;k<lst2.length;k ++){} {S:46650 E:47551 D:3 BT: 0}
 {S:46705 E:47541 D:4 BT: 7}
if(lst2[k].blockType == CASE && lst2[k].code.indexOf(" break;")== - 1){} {S:46706 E:47541 D:4 BT: 1}
int lastLine = lst2[k].absLineNo + 1; {S:46848 E:46884 D:5 BT: 0}
while(lastLine<= lastCase){} {S:46949 E:47530 D:5 BT: 0}
<sublist>
for(int l = 0;l<lst2.length;l ++){} {S:47052 E:47495 D:6 BT: 0}
lastLine ++; {S:47508 E:47518 D:6 BT: 0}
</sublist>
for(int l = 0;l<lst2.length;l ++){} {S:47052 E:47495 D:6 BT: 0}
 {S:47113 E:47482 D:7 BT: 7}
if(lst2[l].absLineNo == lastLine){} {S:47114 E:47482 D:7 BT: 1}
lst2[k].code += lst2[l].code; {S:47220 E:47248 D:8 BT: 0}
 {S:47348 E:47468 D:8 BT: 7}
if(lst2[l].code.indexOf(" break;")== - 1){} {S:47349 E:47443 D:8 BT: 1}
QuicktestRunner.execPath += 6; {S:47405 E:0 D:9 BT: 0}
lastLine ++; {S:47405 E:47415 D:9 BT: 0}
else{} {S:47444 E:47468 D:8 BT: 2}
QuicktestRunner.execPath += 4; {S:47449 E:0 D:9 BT: 0}
lastLine = lastCase; {S:47449 E:47468 D:9 BT: 0}
else {S:47482 E:0 D:7 BT: 0}
QuicktestRunner.execPath += 2; {S:47483 E:0 D:8 BT: 0}
lastLine ++; {S:47508 E:47518 D:6 BT: 0}
for(int k = 0;k<lst2.length;k ++){} {S:47621 E:47832 D:3 BT: 0}
<sublist>
int brk = lst2[k].code.lastIndexOf(" break;"); {S:47677 E:47722 D:4 BT: 0}
</sublist>
int brk = lst2[k].code.lastIndexOf(" break;"); {S:47677 E:47722 D:4 BT: 0}
 {S:47732 E:47822 D:4 BT: 7}
if(brk>0){} {S:47733 E:47822 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:47766 E:0 D:5 BT: 0}
lst2[k].code = lst2[k].code.substring(0 , brk); {S:47766 E:47811 D:5 BT: 0}
else {S:47822 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 1; {S:47823 E:0 D:5 BT: 0}
i ++; {S:47857 E:47860 D:1 BT: 0}
****************************/
   int i = 1; //S:45794   E:45803 D: 0BT: 0
   while(true) //S:45811   E:47868 D: 0BT: 0
   {
      CodeNodeTest[]lst = levelTraverse(i); //S:45837   E:45870 D: 1BT: 0
       //S:45877   E:46047 D: 1BT: 7
      if(lst.length == 0) //S:45878   E:45924 D: 1BT: 1
      {
         QuicktestRunner.execPath += 17; //S:45905   E:0 D: 2BT: 0
         break; //S:45905   E:45910 D: 2BT: 0
      }
      else //S:45925   E:46047 D: 1BT: 2
      {
         for(int j = 0;j<lst.length;j ++)System.out.println(j + ":" + lst[j].getShortString()); //S:45940   E:46038 D: 2BT: 0
      }
      for(int j = 0;j<lst.length;j ++) //S:46080   E:47849 D: 1BT: 0
      {
          //S:46166   E:47841 D: 2BT: 7
         if(lst[j].blockType == SWITCH) //S:46167   E:47841 D: 2BT: 1
         {
            CodeNodeTest[]lst2 = new CodeNodeTest[lst[j].children.size()]; //S:46215   E:46269 D: 3BT: 0
            int lastCase = 0; //S:46279   E:46295 D: 3BT: 0
            for(int k = 0;k<lst[j].children.size();k ++) //S:46367   E:46569 D: 3BT: 0
            {
               lst2[k]=(CodeNodeTest)lst[j].children.get(k); //S:46434   E:46477 D: 4BT: 0
                //S:46487   E:46559 D: 4BT: 7
               if(lst2[k].absLineNo>lastCase) //S:46488   E:46559 D: 4BT: 1
               {
                  QuicktestRunner.execPath += 8; //S:46531   E:0 D: 5BT: 0
                  lastCase = lst2[k].absLineNo; //S:46531   E:46559 D: 5BT: 0
               }
            }
            for(int k = 0;k<lst2.length;k ++) //S:46650   E:47551 D: 3BT: 0
            {
                //S:46705   E:47541 D: 4BT: 7
               if(lst2[k].blockType == CASE && lst2[k].code.indexOf(" break;")== - 1) //S:46706   E:47541 D: 4BT: 1
               {
                  int lastLine = lst2[k].absLineNo + 1; //S:46848   E:46884 D: 5BT: 0
                  while(lastLine<= lastCase) //S:46949   E:47530 D: 5BT: 0
                  {
                     for(int l = 0;l<lst2.length;l ++) //S:47052   E:47495 D: 6BT: 0
                     {
                         //S:47113   E:47482 D: 7BT: 7
                        if(lst2[l].absLineNo == lastLine) //S:47114   E:47482 D: 7BT: 1
                        {
                           lst2[k].code += lst2[l].code; //S:47220   E:47248 D: 8BT: 0
                            //S:47348   E:47468 D: 8BT: 7
                           if(lst2[l].code.indexOf(" break;")== - 1) //S:47349   E:47443 D: 8BT: 1
                           {
                              QuicktestRunner.execPath += 6; //S:47405   E:0 D: 9BT: 0
                              lastLine ++; //S:47405   E:47415 D: 9BT: 0
                           }
                           else //S:47444   E:47468 D: 8BT: 2
                           {
                              QuicktestRunner.execPath += 4; //S:47449   E:0 D: 9BT: 0
                              lastLine = lastCase; //S:47449   E:47468 D: 9BT: 0
                           }
                        }
                        else //S:47482   E:0 D: 7BT: 0
                        {
                           QuicktestRunner.execPath += 2; //S:47483   E:0 D: 8BT: 0
                        }
                     }
                     lastLine ++; //S:47508   E:47518 D: 6BT: 0
                  }
               }
            }
            for(int k = 0;k<lst2.length;k ++) //S:47621   E:47832 D: 3BT: 0
            {
               int brk = lst2[k].code.lastIndexOf(" break;"); //S:47677   E:47722 D: 4BT: 0
                //S:47732   E:47822 D: 4BT: 7
               if(brk>0) //S:47733   E:47822 D: 4BT: 1
               {
                  QuicktestRunner.execPath += 2; //S:47766   E:0 D: 5BT: 0
                  lst2[k].code = lst2[k].code.substring(0 , brk); //S:47766   E:47811 D: 5BT: 0
               }
               else //S:47822   E:0 D: 4BT: 0
               {
                  QuicktestRunner.execPath += 1; //S:47823   E:0 D: 5BT: 0
               }
            }
         }
      }
      i ++; //S:47857   E:47860 D: 1BT: 0
   }
   }

   private void setupSubnodes(CodeNodeTest[] temp)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:16 CP:0
/***************************
Processing list:
int i = 1; {S:48012 E:48021 D:0 BT: 0}
while(true){} {S:48029 E:49611 D:0 BT: 0}
<sublist>
CodeNodeTest[]lst = levelTraverse(i); {S:48055 E:48088 D:1 BT: 0}
System.out.println("Level " + i + " has " + lst.length + " nodes."); {S:48096 E:48163 D:1 BT: 0}
CodeNodeTest[]newLvl = new CodeNodeTest[lst.length]; {S:48236 E:48280 D:1 BT: 0}
int l = 0; {S:48288 E:48297 D:1 BT: 0}
for(int j = 0;j<lst.length;j ++){} {S:48305 E:49560 D:1 BT: 0}
<sublist>
boolean found = false; {S:48617 E:48638 D:2 BT: 0}
for(int k = 0;k<newLvl.length;k ++){} {S:48647 E:49055 D:2 BT: 0}
</sublist>
i += 2; {S:49597 E:49603 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
int i = 1; {S:48012 E:48021 D:0 BT: 0}
while(true){} {S:48029 E:49611 D:0 BT: 0}
<sublist>
CodeNodeTest[]lst = levelTraverse(i); {S:48055 E:48088 D:1 BT: 0}
System.out.println("Level " + i + " has " + lst.length + " nodes."); {S:48096 E:48163 D:1 BT: 0}
CodeNodeTest[]newLvl = new CodeNodeTest[lst.length]; {S:48236 E:48280 D:1 BT: 0}
int l = 0; {S:48288 E:48297 D:1 BT: 0}
for(int j = 0;j<lst.length;j ++){} {S:48305 E:49560 D:1 BT: 0}
<sublist>
boolean found = false; {S:48617 E:48638 D:2 BT: 0}
for(int k = 0;k<newLvl.length;k ++){} {S:48647 E:49055 D:2 BT: 0}
</sublist>
i += 2; {S:49597 E:49603 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:48170 E:48203 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:48170 E:48203 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:48441 E:48534 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:48441 E:48534 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:48700 E:49047 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:48700 E:49047 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#5(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:49062 E:49552 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:49062 E:49552 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(2) Type:1 Paths:1 CP:8
/***************************
Processing list:
if(lst.length == 0) {S:48171 E:48203 D:1 BT: 1}
break; {S:48198 E:48203 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(lst.length == 0){} {S:48171 E:48203 D:1 BT: 1}
QuicktestRunner.execPath += 8; {S:48198 E:0 D:2 BT: 0}
break; {S:48198 E:48203 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#7(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#8(3) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(lst[j].blockType == SWITCH){} {S:48442 E:48534 D:2 BT: 1}
lst[j].blockType = - 1; {S:48488 E:48509 D:3 BT: 0}
continue; {S:48518 E:48526 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(lst[j].blockType == SWITCH){} {S:48442 E:48534 D:2 BT: 1}
QuicktestRunner.execPath += 4; {S:48488 E:0 D:3 BT: 0}
lst[j].blockType = - 1; {S:48488 E:48509 D:3 BT: 0}
continue; {S:48518 E:48526 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#9(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#10(4) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(newLvl[k]!= null && newLvl[k].relLineNo == lst[j].relLineNo && newLvl[k].parentLine == lst[j].parentLine){} {S:48701 E:49047 D:3 BT: 1}
lst[j].parent.children.remove(lst[j]); {S:48928 E:48965 D:4 BT: 0}
newLvl[k].addChild(lst[j]); {S:48975 E:49001 D:4 BT: 0}
found = true; {S:49011 E:49023 D:4 BT: 0}
break; {S:49033 E:49038 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(newLvl[k]!= null && newLvl[k].relLineNo == lst[j].relLineNo && newLvl[k].parentLine == lst[j].parentLine){} {S:48701 E:49047 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:48928 E:0 D:4 BT: 0}
lst[j].parent.children.remove(lst[j]); {S:48928 E:48965 D:4 BT: 0}
newLvl[k].addChild(lst[j]); {S:48975 E:49001 D:4 BT: 0}
found = true; {S:49011 E:49023 D:4 BT: 0}
break; {S:49033 E:49038 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#11(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#12(5) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(found == false){} {S:49063 E:49552 D:2 BT: 1}
newLvl[l]= new CodeNodeTest(); {S:49208 E:49234 D:3 BT: 0}
newLvl[l].absLineNo = lst[j].absLineNo; {S:49242 E:49280 D:3 BT: 0}
newLvl[l].relLineNo = lst[j].relLineNo; {S:49288 E:49326 D:3 BT: 0}
newLvl[l].parentLine = lst[j].parentLine; {S:49334 E:49374 D:3 BT: 0}
newLvl[l].blockType = - 1; {S:49382 E:49406 D:3 BT: 0}
lst[j].parent.addChild(newLvl[l]); {S:49421 E:49454 D:3 BT: 0}
lst[j].parent.children.remove(lst[j]); {S:49462 E:49499 D:3 BT: 0}
newLvl[l].addChild(lst[j]); {S:49507 E:49533 D:3 BT: 0}
l ++; {S:49541 E:49544 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(found == false){} {S:49063 E:49552 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:49208 E:0 D:3 BT: 0}
newLvl[l]= new CodeNodeTest(); {S:49208 E:49234 D:3 BT: 0}
newLvl[l].absLineNo = lst[j].absLineNo; {S:49242 E:49280 D:3 BT: 0}
newLvl[l].relLineNo = lst[j].relLineNo; {S:49288 E:49326 D:3 BT: 0}
newLvl[l].parentLine = lst[j].parentLine; {S:49334 E:49374 D:3 BT: 0}
newLvl[l].blockType = - 1; {S:49382 E:49406 D:3 BT: 0}
lst[j].parent.addChild(newLvl[l]); {S:49421 E:49454 D:3 BT: 0}
lst[j].parent.children.remove(lst[j]); {S:49462 E:49499 D:3 BT: 0}
newLvl[l].addChild(lst[j]); {S:49507 E:49533 D:3 BT: 0}
l ++; {S:49541 E:49544 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#13(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int i = 1; {S:48012 E:48021 D:0 BT: 0}
while(true){} {S:48029 E:49611 D:0 BT: 0}
<sublist>
CodeNodeTest[]lst = levelTraverse(i); {S:48055 E:48088 D:1 BT: 0}
System.out.println("Level " + i + " has " + lst.length + " nodes."); {S:48096 E:48163 D:1 BT: 0}
CodeNodeTest[]newLvl = new CodeNodeTest[lst.length]; {S:48236 E:48280 D:1 BT: 0}
int l = 0; {S:48288 E:48297 D:1 BT: 0}
for(int j = 0;j<lst.length;j ++){} {S:48305 E:49560 D:1 BT: 0}
<sublist>
boolean found = false; {S:48617 E:48638 D:2 BT: 0}
for(int k = 0;k<newLvl.length;k ++){} {S:48647 E:49055 D:2 BT: 0}
</sublist>
i += 2; {S:49597 E:49603 D:1 BT: 0}
</sublist>
CodeNodeTest[]lst = levelTraverse(i); {S:48055 E:48088 D:1 BT: 0}
System.out.println("Level " + i + " has " + lst.length + " nodes."); {S:48096 E:48163 D:1 BT: 0}
 {S:48170 E:48203 D:1 BT: 7}
if(lst.length == 0){} {S:48171 E:48203 D:1 BT: 1}
QuicktestRunner.execPath += 8; {S:48198 E:0 D:2 BT: 0}
break; {S:48198 E:48203 D:2 BT: 0}
CodeNodeTest[]newLvl = new CodeNodeTest[lst.length]; {S:48236 E:48280 D:1 BT: 0}
int l = 0; {S:48288 E:48297 D:1 BT: 0}
for(int j = 0;j<lst.length;j ++){} {S:48305 E:49560 D:1 BT: 0}
<sublist>
boolean found = false; {S:48617 E:48638 D:2 BT: 0}
for(int k = 0;k<newLvl.length;k ++){} {S:48647 E:49055 D:2 BT: 0}
</sublist>
 {S:48441 E:48534 D:2 BT: 7}
if(lst[j].blockType == SWITCH){} {S:48442 E:48534 D:2 BT: 1}
QuicktestRunner.execPath += 4; {S:48488 E:0 D:3 BT: 0}
lst[j].blockType = - 1; {S:48488 E:48509 D:3 BT: 0}
continue; {S:48518 E:48526 D:3 BT: 0}
boolean found = false; {S:48617 E:48638 D:2 BT: 0}
for(int k = 0;k<newLvl.length;k ++){} {S:48647 E:49055 D:2 BT: 0}
 {S:48700 E:49047 D:3 BT: 7}
if(newLvl[k]!= null && newLvl[k].relLineNo == lst[j].relLineNo && newLvl[k].parentLine == lst[j].parentLine){} {S:48701 E:49047 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:48928 E:0 D:4 BT: 0}
lst[j].parent.children.remove(lst[j]); {S:48928 E:48965 D:4 BT: 0}
newLvl[k].addChild(lst[j]); {S:48975 E:49001 D:4 BT: 0}
found = true; {S:49011 E:49023 D:4 BT: 0}
break; {S:49033 E:49038 D:4 BT: 0}
 {S:49062 E:49552 D:2 BT: 7}
if(found == false){} {S:49063 E:49552 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:49208 E:0 D:3 BT: 0}
newLvl[l]= new CodeNodeTest(); {S:49208 E:49234 D:3 BT: 0}
newLvl[l].absLineNo = lst[j].absLineNo; {S:49242 E:49280 D:3 BT: 0}
newLvl[l].relLineNo = lst[j].relLineNo; {S:49288 E:49326 D:3 BT: 0}
newLvl[l].parentLine = lst[j].parentLine; {S:49334 E:49374 D:3 BT: 0}
newLvl[l].blockType = - 1; {S:49382 E:49406 D:3 BT: 0}
lst[j].parent.addChild(newLvl[l]); {S:49421 E:49454 D:3 BT: 0}
lst[j].parent.children.remove(lst[j]); {S:49462 E:49499 D:3 BT: 0}
newLvl[l].addChild(lst[j]); {S:49507 E:49533 D:3 BT: 0}
l ++; {S:49541 E:49544 D:3 BT: 0}
i += 2; {S:49597 E:49603 D:1 BT: 0}
****************************/
   int i = 1; //S:48012   E:48021 D: 0BT: 0
   while(true) //S:48029   E:49611 D: 0BT: 0
   {
      CodeNodeTest[]lst = levelTraverse(i); //S:48055   E:48088 D: 1BT: 0
      System.out.println("Level " + i + " has " + lst.length + " nodes."); //S:48096   E:48163 D: 1BT: 0
       //S:48170   E:48203 D: 1BT: 7
      if(lst.length == 0) //S:48171   E:48203 D: 1BT: 1
      {
         QuicktestRunner.execPath += 8; //S:48198   E:0 D: 2BT: 0
         break; //S:48198   E:48203 D: 2BT: 0
      }
      CodeNodeTest[]newLvl = new CodeNodeTest[lst.length]; //S:48236   E:48280 D: 1BT: 0
      int l = 0; //S:48288   E:48297 D: 1BT: 0
      for(int j = 0;j<lst.length;j ++) //S:48305   E:49560 D: 1BT: 0
      {
          //S:48441   E:48534 D: 2BT: 7
         if(lst[j].blockType == SWITCH) //S:48442   E:48534 D: 2BT: 1
         {
            QuicktestRunner.execPath += 4; //S:48488   E:0 D: 3BT: 0
            lst[j].blockType = - 1; //S:48488   E:48509 D: 3BT: 0
            continue; //S:48518   E:48526 D: 3BT: 0
         }
         boolean found = false; //S:48617   E:48638 D: 2BT: 0
         for(int k = 0;k<newLvl.length;k ++) //S:48647   E:49055 D: 2BT: 0
         {
             //S:48700   E:49047 D: 3BT: 7
            if(newLvl[k]!= null && newLvl[k].relLineNo == lst[j].relLineNo && newLvl[k].parentLine == lst[j].parentLine) //S:48701   E:49047 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:48928   E:0 D: 4BT: 0
               lst[j].parent.children.remove(lst[j]); //S:48928   E:48965 D: 4BT: 0
               newLvl[k].addChild(lst[j]); //S:48975   E:49001 D: 4BT: 0
               found = true; //S:49011   E:49023 D: 4BT: 0
               break; //S:49033   E:49038 D: 4BT: 0
            }
         }
          //S:49062   E:49552 D: 2BT: 7
         if(found == false) //S:49063   E:49552 D: 2BT: 1
         {
            QuicktestRunner.execPath += 1; //S:49208   E:0 D: 3BT: 0
            newLvl[l]= new CodeNodeTest(); //S:49208   E:49234 D: 3BT: 0
            newLvl[l].absLineNo = lst[j].absLineNo; //S:49242   E:49280 D: 3BT: 0
            newLvl[l].relLineNo = lst[j].relLineNo; //S:49288   E:49326 D: 3BT: 0
            newLvl[l].parentLine = lst[j].parentLine; //S:49334   E:49374 D: 3BT: 0
            newLvl[l].blockType = - 1; //S:49382   E:49406 D: 3BT: 0
            lst[j].parent.addChild(newLvl[l]); //S:49421   E:49454 D: 3BT: 0
            lst[j].parent.children.remove(lst[j]); //S:49462   E:49499 D: 3BT: 0
            newLvl[l].addChild(lst[j]); //S:49507   E:49533 D: 3BT: 0
            l ++; //S:49541   E:49544 D: 3BT: 0
         }
      }
      i += 2; //S:49597   E:49603 D: 1BT: 0
   }
   }

   private synchronized LinkedList processCodePath(LinkedList paths, String[] meth, int lineNo, int blockType, int parentLineNo)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:164 CP:0
/***************************
Processing list:
String currPath = new String("BT:" + blockType + "|L:" + pcpLineNo + "|R:" + lineNo + "|P:" + parentLineNo + "|\n"); {S:50566 E:50680 D:0 BT: 0}
String tokens[]={"else" , "if(" , "switch(" , "case " , "default:"}; {S:50687 E:50780 D:0 BT: 0}
boolean endedBlock = false; {S:50787 E:50813 D:0 BT: 0}
String line; {S:50820 E:50831 D:0 BT: 0}
int branchPos = - 1; {S:50838 E:50856 D:0 BT: 0}
int blockDepth = 0; {S:50863 E:50881 D:0 BT: 0}
int relativeLine = 0; {S:50888 E:50908 D:0 BT: 0}
int parLine = pcpLineNo; {S:50915 E:50938 D:0 BT: 0}
int i = 0; {S:50945 E:50954 D:0 BT: 0}
while(pcpLineNo<meth.length){} {S:50967 E:55896 D:0 BT: 0}
<sublist>
i = pcpLineNo; {S:51010 E:51023 D:1 BT: 0}
line = new String(meth[i]); {S:51030 E:51056 D:1 BT: 0}
line = WhiteboxUtils.removeNonCode(line , true); {S:51063 E:51109 D:1 BT: 0}
int foundNum = - 1; {S:51116 E:51133 D:1 BT: 0}
int ifEnd = 0; {S:51140 E:51153 D:1 BT: 0}
for(int j = 0;j<tokens.length;j ++){} {S:51231 E:51479 D:1 BT: 0}
<sublist>
branchPos = line.indexOf(tokens[j]); {S:51283 E:51318 D:2 BT: 0}
</sublist>
</sublist>
paths.add(currPath); {S:55965 E:55984 D:0 BT: 0}
return paths; {S:55991 E:56003 D:0 BT: 0}
****************************/
/***************************
Processing list:
String currPath = new String("BT:" + blockType + "|L:" + pcpLineNo + "|R:" + lineNo + "|P:" + parentLineNo + "|\n"); {S:50566 E:50680 D:0 BT: 0}
String tokens[]={"else" , "if(" , "switch(" , "case " , "default:"}; {S:50687 E:50780 D:0 BT: 0}
boolean endedBlock = false; {S:50787 E:50813 D:0 BT: 0}
String line; {S:50820 E:50831 D:0 BT: 0}
int branchPos = - 1; {S:50838 E:50856 D:0 BT: 0}
int blockDepth = 0; {S:50863 E:50881 D:0 BT: 0}
int relativeLine = 0; {S:50888 E:50908 D:0 BT: 0}
int parLine = pcpLineNo; {S:50915 E:50938 D:0 BT: 0}
int i = 0; {S:50945 E:50954 D:0 BT: 0}
while(pcpLineNo<meth.length){} {S:50967 E:55896 D:0 BT: 0}
<sublist>
i = pcpLineNo; {S:51010 E:51023 D:1 BT: 0}
line = new String(meth[i]); {S:51030 E:51056 D:1 BT: 0}
line = WhiteboxUtils.removeNonCode(line , true); {S:51063 E:51109 D:1 BT: 0}
int foundNum = - 1; {S:51116 E:51133 D:1 BT: 0}
int ifEnd = 0; {S:51140 E:51153 D:1 BT: 0}
for(int j = 0;j<tokens.length;j ++){} {S:51231 E:51479 D:1 BT: 0}
<sublist>
branchPos = line.indexOf(tokens[j]); {S:51283 E:51318 D:2 BT: 0}
</sublist>
</sublist>
paths.add(currPath); {S:55965 E:55984 D:0 BT: 0}
return paths; {S:55991 E:56003 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:51325 E:51396 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:51325 E:51396 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:51403 E:51472 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:51403 E:51472 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:41 CP:0
/***************************
Processing list:
switch(foundNum){case 0:case 1:case 2:case 3:case 4:case - 1:} {S:51622 E:55889 D:1 BT: 3}
****************************/
/***************************
Processing list:
switch(foundNum){} {S:51622 E:55889 D:1 BT: 3}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:82
/***************************
Processing list:
if(branchPos>0 && line.charAt(branchPos - 1)>= '0') {S:51326 E:51396 D:2 BT: 1}
continue; {S:51388 E:51396 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(branchPos>0 && line.charAt(branchPos - 1)>= '0'){} {S:51326 E:51396 D:2 BT: 1}
QuicktestRunner.execPath += 82; {S:51388 E:0 D:3 BT: 0}
continue; {S:51388 E:51396 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:1 CP:41
/***************************
Processing list:
if(branchPos>- 1){} {S:51404 E:51472 D:2 BT: 1}
foundNum = j; {S:51438 E:51450 D:3 BT: 0}
break; {S:51459 E:51464 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(branchPos>- 1){} {S:51404 E:51472 D:2 BT: 1}
QuicktestRunner.execPath += 41; {S:51438 E:0 D:3 BT: 0}
foundNum = j; {S:51438 E:51450 D:3 BT: 0}
break; {S:51459 E:51464 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#8(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#9(4) Type:4 Paths:1 CP:256
/***************************
Processing list:
case 0: {S:51651 E:51905 D:2 BT: 4}
ifEnd = branchPos + 4; {S:51673 E:51694 D:3 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ "/*else!!" + meth[i].substring(ifEnd); {S:51702 E:51783 D:3 BT: 0}
relativeLine --; {S:51791 E:51805 D:3 BT: 0}
processCodePath(paths , meth , relativeLine , ELSE , parLine); {S:51813 E:51870 D:3 BT: 0}
relativeLine ++; {S:51878 E:51892 D:3 BT: 0}
break; {S:51900 E:51905 D:3 BT: 0}
****************************/
/***************************
Processing list:
case 0: {S:51651 E:51905 D:2 BT: 4}
QuicktestRunner.execPath += 256; {S:51673 E:0 D:3 BT: 0}
ifEnd = branchPos + 4; {S:51673 E:51694 D:3 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ "/*else!!" + meth[i].substring(ifEnd); {S:51702 E:51783 D:3 BT: 0}
relativeLine --; {S:51791 E:51805 D:3 BT: 0}
processCodePath(paths , meth , relativeLine , ELSE , parLine); {S:51813 E:51870 D:3 BT: 0}
relativeLine ++; {S:51878 E:51892 D:3 BT: 0}
break; {S:51900 E:51905 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:4 Paths:2 CP:0
/***************************
Processing list:
case 1: {S:51912 E:52602 D:2 BT: 4}
ifEnd = WhiteboxUtils.findClosingParen(line , branchPos + 4)+ 1; {S:51932 E:51995 D:3 BT: 0}
String condition = meth[i].substring(branchPos , ifEnd); {S:52003 E:52057 D:3 BT: 0}
condition = condition.substring(condition.indexOf("if(")+ 2); {S:52065 E:52126 D:3 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ "/* because" + condition + " !!" + meth[i].substring(ifEnd); {S:52134 E:52237 D:3 BT: 0}
processCodePath(paths , meth , relativeLine , IF , parLine); {S:52245 E:52300 D:3 BT: 0}
break; {S:52597 E:52602 D:3 BT: 0}
****************************/
/***************************
Processing list:
case 1: {S:51912 E:52602 D:2 BT: 4}
ifEnd = WhiteboxUtils.findClosingParen(line , branchPos + 4)+ 1; {S:51932 E:51995 D:3 BT: 0}
String condition = meth[i].substring(branchPos , ifEnd); {S:52003 E:52057 D:3 BT: 0}
condition = condition.substring(condition.indexOf("if(")+ 2); {S:52065 E:52126 D:3 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ "/* because" + condition + " !!" + meth[i].substring(ifEnd); {S:52134 E:52237 D:3 BT: 0}
processCodePath(paths , meth , relativeLine , IF , parLine); {S:52245 E:52300 D:3 BT: 0}
break; {S:52597 E:52602 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#11(4) Type:4 Paths:1 CP:0
/***************************
Processing list:
case 2: {S:52609 E:52942 D:2 BT: 4}
ifEnd = WhiteboxUtils.findClosingParen(line , branchPos + 8)+ 1; {S:52633 E:52696 D:3 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ "/* switch on " + meth[i].substring(branchPos + 7 , ifEnd)+ " !!" + meth[i].substring(ifEnd); {S:52704 E:52840 D:3 BT: 0}
processCodePath(paths , meth , relativeLine , SWITCH , parLine); {S:52848 E:52907 D:3 BT: 0}
relativeLine ++; {S:52915 E:52929 D:3 BT: 0}
break; {S:52937 E:52942 D:3 BT: 0}
****************************/
/***************************
Processing list:
case 2: {S:52609 E:52942 D:2 BT: 4}
ifEnd = WhiteboxUtils.findClosingParen(line , branchPos + 8)+ 1; {S:52633 E:52696 D:3 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ "/* switch on " + meth[i].substring(branchPos + 7 , ifEnd)+ " !!" + meth[i].substring(ifEnd); {S:52704 E:52840 D:3 BT: 0}
processCodePath(paths , meth , relativeLine , SWITCH , parLine); {S:52848 E:52907 D:3 BT: 0}
relativeLine ++; {S:52915 E:52929 D:3 BT: 0}
break; {S:52937 E:52942 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#12(4) Type:4 Paths:2 CP:0
/***************************
Processing list:
case 3: {S:52949 E:53608 D:2 BT: 4}
break; {S:53603 E:53608 D:3 BT: 0}
****************************/
/***************************
Processing list:
case 3: {S:52949 E:53608 D:2 BT: 4}
break; {S:53603 E:53608 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#13(4) Type:4 Paths:2 CP:0
/***************************
Processing list:
case 4: {S:53615 E:54172 D:2 BT: 4}
break; {S:54167 E:54172 D:3 BT: 0}
****************************/
/***************************
Processing list:
case 4: {S:53615 E:54172 D:2 BT: 4}
break; {S:54167 E:54172 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#14(4) Type:4 Paths:32 CP:0
/***************************
Processing list:
case - 1: {S:54179 E:55882 D:2 BT: 4}
currPath += meth[i]+ "\n"; {S:55509 E:55535 D:3 BT: 0}
break; {S:55877 E:55882 D:3 BT: 0}
****************************/
/***************************
Processing list:
case - 1: {S:54179 E:55882 D:2 BT: 4}
currPath += meth[i]+ "\n"; {S:55509 E:55535 D:3 BT: 0}
break; {S:55877 E:55882 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#15(4) Type:5 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#16(10) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:52307 E:52589 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:52307 E:52589 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#17(12) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:52970 E:53595 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:52970 E:53595 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#18(13) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:53641 E:54159 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:53641 E:54159 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#19(14) Type:-1 Paths:16 CP:0
/***************************
Processing list:
switch(blockType){case 0:case IF:case ELSE:case SWITCH:case CASE:case DEFAULT:} {S:54205 E:55501 D:3 BT: 3}
****************************/
/***************************
Processing list:
switch(blockType){} {S:54205 E:55501 D:3 BT: 3}
****************************/
//=======================================
//=======================================
//#20(14) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:55579 E:55869 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:55579 E:55869 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#21(16) Type:1 Paths:1 CP:256
/***************************
Processing list:
if(i == parLine && blockType == ELSE){ {S:52308 E:52569 D:3 BT: 1}
paths.add(currPath); {S:52507 E:52526 D:4 BT: 0}
return paths; {S:52535 E:52547 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(i == parLine && blockType == ELSE){} {S:52308 E:52569 D:3 BT: 1}
QuicktestRunner.execPath += 256; {S:52507 E:0 D:4 BT: 0}
paths.add(currPath); {S:52507 E:52526 D:4 BT: 0}
return paths; {S:52535 E:52547 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#22(16) Type:2 Paths:1 CP:128
/***************************
Processing list:
 {S:52570 E:52589 D:3 BT: 2}
relativeLine ++; {S:52575 E:52589 D:3 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:52570 E:52589 D:3 BT: 2}
QuicktestRunner.execPath += 128; {S:52575 E:0 D:4 BT: 0}
relativeLine ++; {S:52575 E:52589 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#23(17) Type:1 Paths:1 CP:64
/***************************
Processing list:
if(blockType == CASE){ {S:52971 E:53227 D:3 BT: 1}
paths.add(currPath); {S:53166 E:53185 D:4 BT: 0}
return paths; {S:53194 E:53206 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(blockType == CASE){} {S:52971 E:53227 D:3 BT: 1}
QuicktestRunner.execPath += 64; {S:53166 E:0 D:4 BT: 0}
paths.add(currPath); {S:53166 E:53185 D:4 BT: 0}
return paths; {S:53194 E:53206 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#24(17) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:53228 E:53595 D:3 BT: 2}
ifEnd = line.indexOf(":" , branchPos + 6)+ 1; {S:53242 E:53286 D:3 BT: 0}
int caseEnd = line.indexOf("case ")+ 5; {S:53295 E:53334 D:3 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ "/* value is " + meth[i].substring(caseEnd , ifEnd)+ " !!" + meth[i].substring(ifEnd); {S:53343 E:53473 D:3 BT: 0}
relativeLine = 2; {S:53482 E:53498 D:3 BT: 0}
processCodePath(paths , meth , relativeLine , CASE , parLine); {S:53507 E:53564 D:3 BT: 0}
relativeLine ++; {S:53573 E:53587 D:3 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:53228 E:53595 D:3 BT: 2}
ifEnd = line.indexOf(":" , branchPos + 6)+ 1; {S:53242 E:53286 D:4 BT: 0}
int caseEnd = line.indexOf("case ")+ 5; {S:53295 E:53334 D:4 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ "/* value is " + meth[i].substring(caseEnd , ifEnd)+ " !!" + meth[i].substring(ifEnd); {S:53343 E:53473 D:4 BT: 0}
relativeLine = 2; {S:53482 E:53498 D:4 BT: 0}
processCodePath(paths , meth , relativeLine , CASE , parLine); {S:53507 E:53564 D:4 BT: 0}
relativeLine ++; {S:53573 E:53587 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#25(18) Type:1 Paths:1 CP:32
/***************************
Processing list:
if(blockType == CASE){ {S:53642 E:53898 D:3 BT: 1}
paths.add(currPath); {S:53837 E:53856 D:4 BT: 0}
return paths; {S:53865 E:53877 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(blockType == CASE){} {S:53642 E:53898 D:3 BT: 1}
QuicktestRunner.execPath += 32; {S:53837 E:0 D:4 BT: 0}
paths.add(currPath); {S:53837 E:53856 D:4 BT: 0}
return paths; {S:53865 E:53877 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#26(18) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:53899 E:54159 D:3 BT: 2}
ifEnd = line.indexOf(":" , branchPos + 7)+ 1; {S:53913 E:53957 D:3 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ meth[i].substring(ifEnd); {S:53966 E:54034 D:3 BT: 0}
relativeLine = 2; {S:54043 E:54059 D:3 BT: 0}
processCodePath(paths , meth , relativeLine , DEFAULT , parLine); {S:54068 E:54128 D:3 BT: 0}
relativeLine ++; {S:54137 E:54151 D:3 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:53899 E:54159 D:3 BT: 2}
ifEnd = line.indexOf(":" , branchPos + 7)+ 1; {S:53913 E:53957 D:4 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ meth[i].substring(ifEnd); {S:53966 E:54034 D:4 BT: 0}
relativeLine = 2; {S:54043 E:54059 D:4 BT: 0}
processCodePath(paths , meth , relativeLine , DEFAULT , parLine); {S:54068 E:54128 D:4 BT: 0}
relativeLine ++; {S:54137 E:54151 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#27(19) Type:4 Paths:4 CP:0
/***************************
Processing list:
case 0: {S:54240 E:54514 D:4 BT: 4}
break; {S:54509 E:54514 D:5 BT: 0}
****************************/
/***************************
Processing list:
case 0: {S:54240 E:54514 D:4 BT: 4}
break; {S:54509 E:54514 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#28(19) Type:4 Paths:1 CP:0
/***************************
Processing list:
case IF: {S:54543 E:54550 D:4 BT: 4}
case ELSE: {S:54559 E:55117 D:4 BT: 4}
break; {S:55112 E:55117 D:5 BT: 0}
****************************/
/***************************
Processing list:
case IF: {S:54543 E:54550 D:4 BT: 4}
QuicktestRunner.execPath -= 0; {S:54543 E:0 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#29(19) Type:4 Paths:4 CP:0
/***************************
Processing list:
case ELSE: {S:54559 E:55117 D:4 BT: 4}
break; {S:55112 E:55117 D:5 BT: 0}
****************************/
/***************************
Processing list:
case ELSE: {S:54559 E:55117 D:4 BT: 4}
break; {S:55112 E:55117 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#30(19) Type:4 Paths:2 CP:0
/***************************
Processing list:
case SWITCH: {S:55148 E:55243 D:4 BT: 4}
break; {S:55238 E:55243 D:5 BT: 0}
****************************/
/***************************
Processing list:
case SWITCH: {S:55148 E:55243 D:4 BT: 4}
break; {S:55238 E:55243 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#31(19) Type:4 Paths:1 CP:0
/***************************
Processing list:
case CASE: {S:55274 E:55283 D:4 BT: 4}
case DEFAULT: {S:55292 E:55493 D:4 BT: 4}
break; {S:55488 E:55493 D:5 BT: 0}
****************************/
/***************************
Processing list:
case CASE: {S:55274 E:55283 D:4 BT: 4}
QuicktestRunner.execPath -= 0; {S:55274 E:0 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#32(19) Type:4 Paths:3 CP:0
/***************************
Processing list:
case DEFAULT: {S:55292 E:55493 D:4 BT: 4}
break; {S:55488 E:55493 D:5 BT: 0}
****************************/
/***************************
Processing list:
case DEFAULT: {S:55292 E:55493 D:4 BT: 4}
break; {S:55488 E:55493 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#33(19) Type:5 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#34(20) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(endedBlock){ {S:55580 E:55812 D:3 BT: 1}
paths.add(currPath); {S:55731 E:55750 D:4 BT: 0}
pcpLineNo ++; {S:55759 E:55770 D:4 BT: 0}
return paths; {S:55779 E:55791 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(endedBlock){} {S:55580 E:55812 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:55731 E:0 D:4 BT: 0}
paths.add(currPath); {S:55731 E:55750 D:4 BT: 0}
pcpLineNo ++; {S:55759 E:55770 D:4 BT: 0}
return paths; {S:55779 E:55791 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#35(20) Type:2 Paths:1 CP:1
/***************************
Processing list:
 {S:55813 E:55869 D:3 BT: 2}
relativeLine ++; {S:55827 E:55841 D:3 BT: 0}
pcpLineNo ++; {S:55850 E:55861 D:3 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:55813 E:55869 D:3 BT: 2}
QuicktestRunner.execPath += 1; {S:55827 E:0 D:4 BT: 0}
relativeLine ++; {S:55827 E:55841 D:4 BT: 0}
pcpLineNo ++; {S:55850 E:55861 D:4 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#36(27) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:54259 E:54497 D:5 BT: 7}
****************************/
/***************************
Processing list:
 {S:54259 E:54497 D:5 BT: 7}
****************************/
//=======================================
//=======================================
//#37(29) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:54579 E:55100 D:5 BT: 7}
****************************/
/***************************
Processing list:
 {S:54579 E:55100 D:5 BT: 7}
****************************/
//=======================================
//=======================================
//#38(30) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:55170 E:55226 D:5 BT: 7}
****************************/
/***************************
Processing list:
 {S:55170 E:55226 D:5 BT: 7}
****************************/
//=======================================
//=======================================
//#39(32) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:55313 E:55478 D:5 BT: 7}
****************************/
/***************************
Processing list:
 {S:55313 E:55478 D:5 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#40(36) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(line.indexOf("}")>= 0){ {S:54260 E:54439 D:5 BT: 1}
****************************/
/***************************
Processing list:
if(line.indexOf("}")>= 0){} {S:54260 E:54439 D:5 BT: 1}
****************************/
//=======================================
//=======================================
//#41(36) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:54440 E:54497 D:5 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:54440 E:54497 D:5 BT: 2}
****************************/
//=======================================
//=======================================
//#42(37) Type:1 Paths:1 CP:36
/***************************
Processing list:
if(line.indexOf("{")>= 0){}else if(line.trim().endsWith(";"))endedBlock = true {S:54580 E:54668 D:5 BT: 1}
blockType = 0; {S:54632 E:54645 D:6 BT: 0}
****************************/
/***************************
Processing list:
if(line.indexOf("{")>= 0){} {S:54580 E:54668 D:5 BT: 1}
QuicktestRunner.execPath += 36; {S:54632 E:0 D:6 BT: 0}
blockType = 0; {S:54632 E:54645 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#43(37) Type:2 Paths:3 CP:0
/***************************
Processing list:
 {S:54669 E:55100 D:5 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:54669 E:55100 D:5 BT: 2}
****************************/
//=======================================
//=======================================
//#44(38) Type:1 Paths:1 CP:12
/***************************
Processing list:
if(line.indexOf("}")>= 0) {S:55171 E:55226 D:5 BT: 1}
endedBlock = true; {S:55209 E:55226 D:6 BT: 0}
****************************/
/***************************
Processing list:
if(line.indexOf("}")>= 0){} {S:55171 E:55226 D:5 BT: 1}
QuicktestRunner.execPath += 12; {S:55209 E:0 D:6 BT: 0}
endedBlock = true; {S:55209 E:55226 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#45(38) Type:2 Paths:1 CP:6

/***************************
Processing list:
else {S:55226 E:0 D:5 BT: 0}
QuicktestRunner.execPath += 6; {S:55227 E:0 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#46(39) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(line.indexOf("{")>= 0){ {S:55314 E:55412 D:5 BT: 1}
blockType = 0; {S:55362 E:55375 D:6 BT: 0}
break; {S:55388 E:55393 D:6 BT: 0}
****************************/
/***************************
Processing list:
if(line.indexOf("{")>= 0){} {S:55314 E:55412 D:5 BT: 1}
QuicktestRunner.execPath += 4; {S:55362 E:0 D:6 BT: 0}
blockType = 0; {S:55362 E:55375 D:6 BT: 0}
break; {S:55388 E:55393 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#47(39) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:55413 E:55478 D:5 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:55413 E:55478 D:5 BT: 2}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#48(40) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:54313 E:54412 D:6 BT: 7}
****************************/
/***************************
Processing list:
 {S:54313 E:54412 D:6 BT: 7}
****************************/
//=======================================
//=======================================
//#49(41) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:54444 E:54497 D:7 BT: 7}
****************************/
/***************************
Processing list:
 {S:54444 E:54497 D:7 BT: 7}
****************************/
//=======================================
//=======================================
//#50(43) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:54673 E:55100 D:7 BT: 7}
****************************/
/***************************
Processing list:
 {S:54673 E:55100 D:7 BT: 7}
****************************/
//=======================================
//=======================================
//#51(47) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:55417 E:55478 D:7 BT: 7}
****************************/
/***************************
Processing list:
 {S:55417 E:55478 D:7 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#52(48) Type:1 Paths:1 CP:96
/***************************
Processing list:
if(blockDepth == 0)else blockDepth --; {S:54314 E:54394 D:6 BT: 1}
endedBlock = true; {S:54350 E:54367 D:7 BT: 0}
****************************/
/***************************
Processing list:
if(blockDepth == 0){} {S:54314 E:54394 D:6 BT: 1}
QuicktestRunner.execPath += 96; {S:54350 E:0 D:7 BT: 0}
endedBlock = true; {S:54350 E:54367 D:7 BT: 0}
****************************/
//=======================================
//=======================================
//#53(48) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:54395 E:54412 D:6 BT: 2}
blockDepth --; {S:54400 E:54412 D:6 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:54395 E:54412 D:6 BT: 2}
blockDepth --; {S:54400 E:54412 D:7 BT: 0}
****************************/
//=======================================
//=======================================
//#54(49) Type:1 Paths:1 CP:96
/***************************
Processing list:
if(line.indexOf("{")>= 0) {S:54445 E:54497 D:7 BT: 1}
blockDepth ++; {S:54485 E:54497 D:8 BT: 0}
****************************/
/***************************
Processing list:
if(line.indexOf("{")>= 0){} {S:54445 E:54497 D:7 BT: 1}
QuicktestRunner.execPath += 96; {S:54485 E:0 D:8 BT: 0}
blockDepth ++; {S:54485 E:54497 D:8 BT: 0}
****************************/
//=======================================
//=======================================
//#55(49) Type:2 Paths:1 CP:48

/***************************
Processing list:
else {S:54497 E:0 D:7 BT: 0}
QuicktestRunner.execPath += 48; {S:54498 E:0 D:8 BT: 0}
****************************/
//=======================================
//=======================================
//#56(50) Type:1 Paths:1 CP:24
/***************************
Processing list:
if(line.trim().endsWith(";"))else if(pcpLineNo>parLine){} {S:54674 E:54742 D:7 BT: 1}
endedBlock = true; {S:54714 E:54731 D:8 BT: 0}
****************************/
/***************************
Processing list:
if(line.trim().endsWith(";")){} {S:54674 E:54742 D:7 BT: 1}
QuicktestRunner.execPath += 24; {S:54714 E:0 D:8 BT: 0}
endedBlock = true; {S:54714 E:54731 D:8 BT: 0}
****************************/
//=======================================
//=======================================
//#57(50) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:54743 E:55100 D:7 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:54743 E:55100 D:7 BT: 2}
****************************/
//=======================================
//=======================================
//#58(51) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(line.indexOf("break;")>= 0) {S:55418 E:55478 D:7 BT: 1}
endedBlock = true; {S:55461 E:55478 D:8 BT: 0}
****************************/
/***************************
Processing list:
if(line.indexOf("break;")>= 0){} {S:55418 E:55478 D:7 BT: 1}
QuicktestRunner.execPath += 4; {S:55461 E:0 D:8 BT: 0}
endedBlock = true; {S:55461 E:55478 D:8 BT: 0}
****************************/
//=======================================
//=======================================
//#59(51) Type:2 Paths:1 CP:2

/***************************
Processing list:
else {S:55478 E:0 D:7 BT: 0}
QuicktestRunner.execPath += 2; {S:55479 E:0 D:8 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#60(57) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:54747 E:55100 D:9 BT: 7}
****************************/
/***************************
Processing list:
 {S:54747 E:55100 D:9 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#61(60) Type:1 Paths:1 CP:12
/***************************
Processing list:
if(pcpLineNo>parLine){} {S:54748 E:55100 D:9 BT: 1}
paths.add(currPath); {S:55044 E:55063 D:10 BT: 0}
return paths; {S:55076 E:55088 D:10 BT: 0}
****************************/
/***************************
Processing list:
if(pcpLineNo>parLine){} {S:54748 E:55100 D:9 BT: 1}
QuicktestRunner.execPath += 12; {S:55044 E:0 D:10 BT: 0}
paths.add(currPath); {S:55044 E:55063 D:10 BT: 0}
return paths; {S:55076 E:55088 D:10 BT: 0}
****************************/
//=======================================
//=======================================
//#62(60) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String currPath = new String("BT:" + blockType + "|L:" + pcpLineNo + "|R:" + lineNo + "|P:" + parentLineNo + "|\n"); {S:50566 E:50680 D:0 BT: 0}
String tokens[]={"else" , "if(" , "switch(" , "case " , "default:"}; {S:50687 E:50780 D:0 BT: 0}
boolean endedBlock = false; {S:50787 E:50813 D:0 BT: 0}
String line; {S:50820 E:50831 D:0 BT: 0}
int branchPos = - 1; {S:50838 E:50856 D:0 BT: 0}
int blockDepth = 0; {S:50863 E:50881 D:0 BT: 0}
int relativeLine = 0; {S:50888 E:50908 D:0 BT: 0}
int parLine = pcpLineNo; {S:50915 E:50938 D:0 BT: 0}
int i = 0; {S:50945 E:50954 D:0 BT: 0}
while(pcpLineNo<meth.length){} {S:50967 E:55896 D:0 BT: 0}
<sublist>
i = pcpLineNo; {S:51010 E:51023 D:1 BT: 0}
line = new String(meth[i]); {S:51030 E:51056 D:1 BT: 0}
line = WhiteboxUtils.removeNonCode(line , true); {S:51063 E:51109 D:1 BT: 0}
int foundNum = - 1; {S:51116 E:51133 D:1 BT: 0}
int ifEnd = 0; {S:51140 E:51153 D:1 BT: 0}
for(int j = 0;j<tokens.length;j ++){} {S:51231 E:51479 D:1 BT: 0}
<sublist>
branchPos = line.indexOf(tokens[j]); {S:51283 E:51318 D:2 BT: 0}
</sublist>
</sublist>
i = pcpLineNo; {S:51010 E:51023 D:1 BT: 0}
line = new String(meth[i]); {S:51030 E:51056 D:1 BT: 0}
line = WhiteboxUtils.removeNonCode(line , true); {S:51063 E:51109 D:1 BT: 0}
int foundNum = - 1; {S:51116 E:51133 D:1 BT: 0}
int ifEnd = 0; {S:51140 E:51153 D:1 BT: 0}
for(int j = 0;j<tokens.length;j ++){} {S:51231 E:51479 D:1 BT: 0}
<sublist>
branchPos = line.indexOf(tokens[j]); {S:51283 E:51318 D:2 BT: 0}
</sublist>
branchPos = line.indexOf(tokens[j]); {S:51283 E:51318 D:2 BT: 0}
 {S:51325 E:51396 D:2 BT: 7}
if(branchPos>0 && line.charAt(branchPos - 1)>= '0'){} {S:51326 E:51396 D:2 BT: 1}
QuicktestRunner.execPath += 82; {S:51388 E:0 D:3 BT: 0}
continue; {S:51388 E:51396 D:3 BT: 0}
 {S:51403 E:51472 D:2 BT: 7}
if(branchPos>- 1){} {S:51404 E:51472 D:2 BT: 1}
QuicktestRunner.execPath += 41; {S:51438 E:0 D:3 BT: 0}
foundNum = j; {S:51438 E:51450 D:3 BT: 0}
break; {S:51459 E:51464 D:3 BT: 0}
switch(foundNum){} {S:51622 E:55889 D:1 BT: 3}
case 0: {S:51651 E:51905 D:2 BT: 4}
QuicktestRunner.execPath += 256; {S:51673 E:0 D:3 BT: 0}
ifEnd = branchPos + 4; {S:51673 E:51694 D:3 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ "/*else!!" + meth[i].substring(ifEnd); {S:51702 E:51783 D:3 BT: 0}
relativeLine --; {S:51791 E:51805 D:3 BT: 0}
processCodePath(paths , meth , relativeLine , ELSE , parLine); {S:51813 E:51870 D:3 BT: 0}
relativeLine ++; {S:51878 E:51892 D:3 BT: 0}
break; {S:51900 E:51905 D:3 BT: 0}
case 1: {S:51912 E:52602 D:2 BT: 4}
ifEnd = WhiteboxUtils.findClosingParen(line , branchPos + 4)+ 1; {S:51932 E:51995 D:3 BT: 0}
String condition = meth[i].substring(branchPos , ifEnd); {S:52003 E:52057 D:3 BT: 0}
condition = condition.substring(condition.indexOf("if(")+ 2); {S:52065 E:52126 D:3 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ "/* because" + condition + " !!" + meth[i].substring(ifEnd); {S:52134 E:52237 D:3 BT: 0}
processCodePath(paths , meth , relativeLine , IF , parLine); {S:52245 E:52300 D:3 BT: 0}
 {S:52307 E:52589 D:3 BT: 7}
if(i == parLine && blockType == ELSE){} {S:52308 E:52569 D:3 BT: 1}
QuicktestRunner.execPath += 256; {S:52507 E:0 D:4 BT: 0}
paths.add(currPath); {S:52507 E:52526 D:4 BT: 0}
return paths; {S:52535 E:52547 D:4 BT: 0}
else{} {S:52570 E:52589 D:3 BT: 2}
QuicktestRunner.execPath += 128; {S:52575 E:0 D:4 BT: 0}
relativeLine ++; {S:52575 E:52589 D:4 BT: 0}
break; {S:52597 E:52602 D:3 BT: 0}
case 2: {S:52609 E:52942 D:2 BT: 4}
ifEnd = WhiteboxUtils.findClosingParen(line , branchPos + 8)+ 1; {S:52633 E:52696 D:3 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ "/* switch on " + meth[i].substring(branchPos + 7 , ifEnd)+ " !!" + meth[i].substring(ifEnd); {S:52704 E:52840 D:3 BT: 0}
processCodePath(paths , meth , relativeLine , SWITCH , parLine); {S:52848 E:52907 D:3 BT: 0}
relativeLine ++; {S:52915 E:52929 D:3 BT: 0}
break; {S:52937 E:52942 D:3 BT: 0}
case 3: {S:52949 E:53608 D:2 BT: 4}
 {S:52970 E:53595 D:3 BT: 7}
if(blockType == CASE){} {S:52971 E:53227 D:3 BT: 1}
QuicktestRunner.execPath += 64; {S:53166 E:0 D:4 BT: 0}
paths.add(currPath); {S:53166 E:53185 D:4 BT: 0}
return paths; {S:53194 E:53206 D:4 BT: 0}
else{} {S:53228 E:53595 D:3 BT: 2}
ifEnd = line.indexOf(":" , branchPos + 6)+ 1; {S:53242 E:53286 D:4 BT: 0}
int caseEnd = line.indexOf("case ")+ 5; {S:53295 E:53334 D:4 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ "/* value is " + meth[i].substring(caseEnd , ifEnd)+ " !!" + meth[i].substring(ifEnd); {S:53343 E:53473 D:4 BT: 0}
relativeLine = 2; {S:53482 E:53498 D:4 BT: 0}
processCodePath(paths , meth , relativeLine , CASE , parLine); {S:53507 E:53564 D:4 BT: 0}
relativeLine ++; {S:53573 E:53587 D:4 BT: 0}
break; {S:53603 E:53608 D:3 BT: 0}
case 4: {S:53615 E:54172 D:2 BT: 4}
 {S:53641 E:54159 D:3 BT: 7}
if(blockType == CASE){} {S:53642 E:53898 D:3 BT: 1}
QuicktestRunner.execPath += 32; {S:53837 E:0 D:4 BT: 0}
paths.add(currPath); {S:53837 E:53856 D:4 BT: 0}
return paths; {S:53865 E:53877 D:4 BT: 0}
else{} {S:53899 E:54159 D:3 BT: 2}
ifEnd = line.indexOf(":" , branchPos + 7)+ 1; {S:53913 E:53957 D:4 BT: 0}
meth[i]= meth[i].substring(0 , branchPos)+ meth[i].substring(ifEnd); {S:53966 E:54034 D:4 BT: 0}
relativeLine = 2; {S:54043 E:54059 D:4 BT: 0}
processCodePath(paths , meth , relativeLine , DEFAULT , parLine); {S:54068 E:54128 D:4 BT: 0}
relativeLine ++; {S:54137 E:54151 D:4 BT: 0}
break; {S:54167 E:54172 D:3 BT: 0}
case - 1: {S:54179 E:55882 D:2 BT: 4}
switch(blockType){} {S:54205 E:55501 D:3 BT: 3}
case 0: {S:54240 E:54514 D:4 BT: 4}
 {S:54259 E:54497 D:5 BT: 7}
if(line.indexOf("}")>= 0){} {S:54260 E:54439 D:5 BT: 1}
 {S:54313 E:54412 D:6 BT: 7}
if(blockDepth == 0){} {S:54314 E:54394 D:6 BT: 1}
QuicktestRunner.execPath += 96; {S:54350 E:0 D:7 BT: 0}
endedBlock = true; {S:54350 E:54367 D:7 BT: 0}
else{} {S:54395 E:54412 D:6 BT: 2}
blockDepth --; {S:54400 E:54412 D:7 BT: 0}
else{} {S:54440 E:54497 D:5 BT: 2}
 {S:54444 E:54497 D:6 BT: 7}
if(line.indexOf("{")>= 0){} {S:54445 E:54497 D:6 BT: 1}
QuicktestRunner.execPath += 96; {S:54485 E:0 D:7 BT: 0}
blockDepth ++; {S:54485 E:54497 D:7 BT: 0}
else {S:54497 E:0 D:6 BT: 0}
QuicktestRunner.execPath += 48; {S:54498 E:0 D:7 BT: 0}
break; {S:54509 E:54514 D:5 BT: 0}
QuicktestRunner.execPath -= 0; {S:54543 E:0 D:4 BT: 0}
case IF: {S:54543 E:54550 D:4 BT: 4}
case ELSE: {S:54559 E:55117 D:4 BT: 4}
 {S:54579 E:55100 D:5 BT: 7}
if(line.indexOf("{")>= 0){} {S:54580 E:54668 D:5 BT: 1}
QuicktestRunner.execPath += 36; {S:54632 E:0 D:6 BT: 0}
blockType = 0; {S:54632 E:54645 D:6 BT: 0}
else{} {S:54669 E:55100 D:5 BT: 2}
 {S:54673 E:55100 D:6 BT: 7}
if(line.trim().endsWith(";")){} {S:54674 E:54742 D:6 BT: 1}
QuicktestRunner.execPath += 24; {S:54714 E:0 D:7 BT: 0}
endedBlock = true; {S:54714 E:54731 D:7 BT: 0}
else{} {S:54743 E:55100 D:6 BT: 2}
 {S:54747 E:55100 D:7 BT: 7}
if(pcpLineNo>parLine){} {S:54748 E:55100 D:7 BT: 1}
QuicktestRunner.execPath += 12; {S:55044 E:0 D:8 BT: 0}
paths.add(currPath); {S:55044 E:55063 D:8 BT: 0}
return paths; {S:55076 E:55088 D:8 BT: 0}
break; {S:55112 E:55117 D:5 BT: 0}
case SWITCH: {S:55148 E:55243 D:4 BT: 4}
 {S:55170 E:55226 D:5 BT: 7}
if(line.indexOf("}")>= 0){} {S:55171 E:55226 D:5 BT: 1}
QuicktestRunner.execPath += 12; {S:55209 E:0 D:6 BT: 0}
endedBlock = true; {S:55209 E:55226 D:6 BT: 0}
else {S:55226 E:0 D:5 BT: 0}
QuicktestRunner.execPath += 6; {S:55227 E:0 D:6 BT: 0}
break; {S:55238 E:55243 D:5 BT: 0}
case CASE: {S:55274 E:55283 D:4 BT: 4}
QuicktestRunner.execPath -= 0; {S:55274 E:0 D:4 BT: 0}
case DEFAULT: {S:55292 E:55493 D:4 BT: 4}
 {S:55313 E:55478 D:5 BT: 7}
if(line.indexOf("{")>= 0){} {S:55314 E:55412 D:5 BT: 1}
QuicktestRunner.execPath += 4; {S:55362 E:0 D:6 BT: 0}
blockType = 0; {S:55362 E:55375 D:6 BT: 0}
break; {S:55388 E:55393 D:6 BT: 0}
else{} {S:55413 E:55478 D:5 BT: 2}
 {S:55417 E:55478 D:6 BT: 7}
if(line.indexOf("break;")>= 0){} {S:55418 E:55478 D:6 BT: 1}
endedBlock = true; {S:55461 E:55478 D:7 BT: 0}
QuicktestRunner.execPath += 4; {S:55461 E:0 D:7 BT: 0}
else {S:55478 E:0 D:6 BT: 0}
QuicktestRunner.execPath += 2; {S:55479 E:0 D:7 BT: 0}
break; {S:55488 E:55493 D:5 BT: 0}
currPath += meth[i]+ "\n"; {S:55509 E:55535 D:3 BT: 0}
 {S:55579 E:55869 D:3 BT: 7}
if(endedBlock){} {S:55580 E:55812 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:55731 E:0 D:4 BT: 0}
paths.add(currPath); {S:55731 E:55750 D:4 BT: 0}
pcpLineNo ++; {S:55759 E:55770 D:4 BT: 0}
return paths; {S:55779 E:55791 D:4 BT: 0}
else{} {S:55813 E:55869 D:3 BT: 2}
QuicktestRunner.execPath += 1; {S:55827 E:0 D:4 BT: 0}
relativeLine ++; {S:55827 E:55841 D:4 BT: 0}
pcpLineNo ++; {S:55850 E:55861 D:4 BT: 0}
break; {S:55877 E:55882 D:3 BT: 0}
paths.add(currPath); {S:55965 E:55984 D:0 BT: 0}
return paths; {S:55991 E:56003 D:0 BT: 0}
****************************/
   String currPath = new String("BT:" + blockType + "|L:" + pcpLineNo + "|R:" + lineNo + "|P:" + parentLineNo + "|\n"); //S:50566   E:50680 D: 0BT: 0
   String tokens[]={"else" , "if(" , "switch(" , "case " , "default:"}; //S:50687   E:50780 D: 0BT: 0
   boolean endedBlock = false; //S:50787   E:50813 D: 0BT: 0
   String line; //S:50820   E:50831 D: 0BT: 0
   int branchPos = - 1; //S:50838   E:50856 D: 0BT: 0
   int blockDepth = 0; //S:50863   E:50881 D: 0BT: 0
   int relativeLine = 0; //S:50888   E:50908 D: 0BT: 0
   int parLine = pcpLineNo; //S:50915   E:50938 D: 0BT: 0
   int i = 0; //S:50945   E:50954 D: 0BT: 0
   while(pcpLineNo<meth.length) //S:50967   E:55896 D: 0BT: 0
   {
      i = pcpLineNo; //S:51010   E:51023 D: 1BT: 0
      line = new String(meth[i]); //S:51030   E:51056 D: 1BT: 0
      line = WhiteboxUtils.removeNonCode(line , true); //S:51063   E:51109 D: 1BT: 0
      int foundNum = - 1; //S:51116   E:51133 D: 1BT: 0
      int ifEnd = 0; //S:51140   E:51153 D: 1BT: 0
      for(int j = 0;j<tokens.length;j ++) //S:51231   E:51479 D: 1BT: 0
      {
         branchPos = line.indexOf(tokens[j]); //S:51283   E:51318 D: 2BT: 0
          //S:51325   E:51396 D: 2BT: 7
         if(branchPos>0 && line.charAt(branchPos - 1)>= '0') //S:51326   E:51396 D: 2BT: 1
         {
            QuicktestRunner.execPath += 82; //S:51388   E:0 D: 3BT: 0
            continue; //S:51388   E:51396 D: 3BT: 0
         }
          //S:51403   E:51472 D: 2BT: 7
         if(branchPos>- 1) //S:51404   E:51472 D: 2BT: 1
         {
            QuicktestRunner.execPath += 41; //S:51438   E:0 D: 3BT: 0
            foundNum = j; //S:51438   E:51450 D: 3BT: 0
            break; //S:51459   E:51464 D: 3BT: 0
         }
      }
      switch(foundNum) //S:51622   E:55889 D: 1BT: 3
      {
         case 0: //S:51651   E:51905 D: 2BT: 4
         {
            QuicktestRunner.execPath += 256; //S:51673   E:0 D: 3BT: 0
            ifEnd = branchPos + 4; //S:51673   E:51694 D: 3BT: 0
            meth[i]= meth[i].substring(0 , branchPos)+ "/*else*/" + meth[i].substring(ifEnd); //S:51702   E:51783 D: 3BT: 0
            relativeLine --; //S:51791   E:51805 D: 3BT: 0
            processCodePath(paths , meth , relativeLine , ELSE , parLine); //S:51813   E:51870 D: 3BT: 0
            relativeLine ++; //S:51878   E:51892 D: 3BT: 0
            break; //S:51900   E:51905 D: 3BT: 0
         }
         case 1: //S:51912   E:52602 D: 2BT: 4
         {
            ifEnd = WhiteboxUtils.findClosingParen(line , branchPos + 4)+ 1; //S:51932   E:51995 D: 3BT: 0
            String condition = meth[i].substring(branchPos , ifEnd); //S:52003   E:52057 D: 3BT: 0
            condition = condition.substring(condition.indexOf("if(")+ 2); //S:52065   E:52126 D: 3BT: 0
            meth[i]= meth[i].substring(0 , branchPos)+ "/* because" + condition + " */" + meth[i].substring(ifEnd); //S:52134   E:52237 D: 3BT: 0
            processCodePath(paths , meth , relativeLine , IF , parLine); //S:52245   E:52300 D: 3BT: 0
             //S:52307   E:52589 D: 3BT: 7
            if(i == parLine && blockType == ELSE) //S:52308   E:52569 D: 3BT: 1
            {
               QuicktestRunner.execPath += 256; //S:52507   E:0 D: 4BT: 0
               paths.add(currPath); //S:52507   E:52526 D: 4BT: 0
               return paths; //S:52535   E:52547 D: 4BT: 0
            }
            else //S:52570   E:52589 D: 3BT: 2
            {
               QuicktestRunner.execPath += 128; //S:52575   E:0 D: 4BT: 0
               relativeLine ++; //S:52575   E:52589 D: 4BT: 0
            }
            break; //S:52597   E:52602 D: 3BT: 0
         }
         case 2: //S:52609   E:52942 D: 2BT: 4
         {
            ifEnd = WhiteboxUtils.findClosingParen(line , branchPos + 8)+ 1; //S:52633   E:52696 D: 3BT: 0
            meth[i]= meth[i].substring(0 , branchPos)+ "/* switch on " + meth[i].substring(branchPos + 7 , ifEnd)+ " */" + meth[i].substring(ifEnd); //S:52704   E:52840 D: 3BT: 0
            processCodePath(paths , meth , relativeLine , SWITCH , parLine); //S:52848   E:52907 D: 3BT: 0
            relativeLine ++; //S:52915   E:52929 D: 3BT: 0
            break; //S:52937   E:52942 D: 3BT: 0
         }
         case 3: //S:52949   E:53608 D: 2BT: 4
         {
             //S:52970   E:53595 D: 3BT: 7
            if(blockType == CASE) //S:52971   E:53227 D: 3BT: 1
            {
               QuicktestRunner.execPath += 64; //S:53166   E:0 D: 4BT: 0
               paths.add(currPath); //S:53166   E:53185 D: 4BT: 0
               return paths; //S:53194   E:53206 D: 4BT: 0
            }
            else //S:53228   E:53595 D: 3BT: 2
            {
               ifEnd = line.indexOf(":" , branchPos + 6)+ 1; //S:53242   E:53286 D: 4BT: 0
               int caseEnd = line.indexOf("case ")+ 5; //S:53295   E:53334 D: 4BT: 0
               meth[i]= meth[i].substring(0 , branchPos)+ "/* value is " + meth[i].substring(caseEnd , ifEnd)+ " */" + meth[i].substring(ifEnd); //S:53343   E:53473 D: 4BT: 0
               relativeLine = 2; //S:53482   E:53498 D: 4BT: 0
               processCodePath(paths , meth , relativeLine , CASE , parLine); //S:53507   E:53564 D: 4BT: 0
               relativeLine ++; //S:53573   E:53587 D: 4BT: 0
            }
            break; //S:53603   E:53608 D: 3BT: 0
         }
         case 4: //S:53615   E:54172 D: 2BT: 4
         {
             //S:53641   E:54159 D: 3BT: 7
            if(blockType == CASE) //S:53642   E:53898 D: 3BT: 1
            {
               QuicktestRunner.execPath += 32; //S:53837   E:0 D: 4BT: 0
               paths.add(currPath); //S:53837   E:53856 D: 4BT: 0
               return paths; //S:53865   E:53877 D: 4BT: 0
            }
            else //S:53899   E:54159 D: 3BT: 2
            {
               ifEnd = line.indexOf(":" , branchPos + 7)+ 1; //S:53913   E:53957 D: 4BT: 0
               meth[i]= meth[i].substring(0 , branchPos)+ meth[i].substring(ifEnd); //S:53966   E:54034 D: 4BT: 0
               relativeLine = 2; //S:54043   E:54059 D: 4BT: 0
               processCodePath(paths , meth , relativeLine , DEFAULT , parLine); //S:54068   E:54128 D: 4BT: 0
               relativeLine ++; //S:54137   E:54151 D: 4BT: 0
            }
            break; //S:54167   E:54172 D: 3BT: 0
         }
         case - 1: //S:54179   E:55882 D: 2BT: 4
         {
            switch(blockType) //S:54205   E:55501 D: 3BT: 3
            {
               case 0: //S:54240   E:54514 D: 4BT: 4
               {
                   //S:54259   E:54497 D: 5BT: 7
                  if(line.indexOf("}")>= 0) //S:54260   E:54439 D: 5BT: 1
                  {
                      //S:54313   E:54412 D: 6BT: 7
                     if(blockDepth == 0) //S:54314   E:54394 D: 6BT: 1
                     {
                        QuicktestRunner.execPath += 96; //S:54350   E:0 D: 7BT: 0
                        endedBlock = true; //S:54350   E:54367 D: 7BT: 0
                     }
                     else //S:54395   E:54412 D: 6BT: 2
                     {
                        blockDepth --; //S:54400   E:54412 D: 7BT: 0
                     }
                  }
                  else //S:54440   E:54497 D: 5BT: 2
                  {
                      //S:54444   E:54497 D: 6BT: 7
                     if(line.indexOf("{")>= 0) //S:54445   E:54497 D: 6BT: 1
                     {
                        QuicktestRunner.execPath += 96; //S:54485   E:0 D: 7BT: 0
                        blockDepth ++; //S:54485   E:54497 D: 7BT: 0
                     }
                     else //S:54497   E:0 D: 6BT: 0
                     {
                        QuicktestRunner.execPath += 48; //S:54498   E:0 D: 7BT: 0
                     }
                  }
                  break; //S:54509   E:54514 D: 5BT: 0
               }
               QuicktestRunner.execPath -= 0; //S:54543   E:0 D: 4BT: 0
               case IF: //S:54543   E:54550 D: 4BT: 4
               case ELSE: //S:54559   E:55117 D: 4BT: 4
               {
                   //S:54579   E:55100 D: 5BT: 7
                  if(line.indexOf("{")>= 0) //S:54580   E:54668 D: 5BT: 1
                  {
                     QuicktestRunner.execPath += 36; //S:54632   E:0 D: 6BT: 0
                     blockType = 0; //S:54632   E:54645 D: 6BT: 0
                  }
                  else //S:54669   E:55100 D: 5BT: 2
                  {
                      //S:54673   E:55100 D: 6BT: 7
                     if(line.trim().endsWith(";")) //S:54674   E:54742 D: 6BT: 1
                     {
                        QuicktestRunner.execPath += 24; //S:54714   E:0 D: 7BT: 0
                        endedBlock = true; //S:54714   E:54731 D: 7BT: 0
                     }
                     else //S:54743   E:55100 D: 6BT: 2
                     {
                         //S:54747   E:55100 D: 7BT: 7
                        if(pcpLineNo>parLine) //S:54748   E:55100 D: 7BT: 1
                        {
                           QuicktestRunner.execPath += 12; //S:55044   E:0 D: 8BT: 0
                           paths.add(currPath); //S:55044   E:55063 D: 8BT: 0
                           return paths; //S:55076   E:55088 D: 8BT: 0
                        }
                     }
                  }
                  break; //S:55112   E:55117 D: 5BT: 0
               }
               case SWITCH: //S:55148   E:55243 D: 4BT: 4
               {
                   //S:55170   E:55226 D: 5BT: 7
                  if(line.indexOf("}")>= 0) //S:55171   E:55226 D: 5BT: 1
                  {
                     QuicktestRunner.execPath += 12; //S:55209   E:0 D: 6BT: 0
                     endedBlock = true; //S:55209   E:55226 D: 6BT: 0
                  }
                  else //S:55226   E:0 D: 5BT: 0
                  {
                     QuicktestRunner.execPath += 6; //S:55227   E:0 D: 6BT: 0
                  }
                  break; //S:55238   E:55243 D: 5BT: 0
               }
               case CASE: //S:55274   E:55283 D: 4BT: 4
               QuicktestRunner.execPath -= 0; //S:55274   E:0 D: 4BT: 0
               case DEFAULT: //S:55292   E:55493 D: 4BT: 4
               {
                   //S:55313   E:55478 D: 5BT: 7
                  if(line.indexOf("{")>= 0) //S:55314   E:55412 D: 5BT: 1
                  {
                     QuicktestRunner.execPath += 4; //S:55362   E:0 D: 6BT: 0
                     blockType = 0; //S:55362   E:55375 D: 6BT: 0
                     break; //S:55388   E:55393 D: 6BT: 0
                  }
                  else //S:55413   E:55478 D: 5BT: 2
                  {
                      //S:55417   E:55478 D: 6BT: 7
                     if(line.indexOf("break;")>= 0) //S:55418   E:55478 D: 6BT: 1
                     {
                        endedBlock = true; //S:55461   E:55478 D: 7BT: 0
                        QuicktestRunner.execPath += 4; //S:55461   E:0 D: 7BT: 0
                     }
                     else //S:55478   E:0 D: 6BT: 0
                     {
                        QuicktestRunner.execPath += 2; //S:55479   E:0 D: 7BT: 0
                     }
                  }
                  break; //S:55488   E:55493 D: 5BT: 0
               }
            }
            currPath += meth[i]+ "\n"; //S:55509   E:55535 D: 3BT: 0
             //S:55579   E:55869 D: 3BT: 7
            if(endedBlock) //S:55580   E:55812 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:55731   E:0 D: 4BT: 0
               paths.add(currPath); //S:55731   E:55750 D: 4BT: 0
               pcpLineNo ++; //S:55759   E:55770 D: 4BT: 0
               return paths; //S:55779   E:55791 D: 4BT: 0
            }
            else //S:55813   E:55869 D: 3BT: 2
            {
               QuicktestRunner.execPath += 1; //S:55827   E:0 D: 4BT: 0
               relativeLine ++; //S:55827   E:55841 D: 4BT: 0
               pcpLineNo ++; //S:55850   E:55861 D: 4BT: 0
            }
            break; //S:55877   E:55882 D: 3BT: 0
         }
      }
   }
   paths.add(currPath); //S:55965   E:55984 D: 0BT: 0
   return paths; //S:55991   E:56003 D: 0BT: 0
   }

   public LineListTest[] getParsedCodePaths()
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
LineListTest[]rtnVal = new LineListTest[root.nPaths]; {S:56075 E:56120 D:0 BT: 0}
for(int i = 0;i<root.nPaths;i ++){} {S:56128 E:56220 D:0 BT: 0}
<sublist>
rtnVal[i]= getParsedCodePath(i); {S:56180 E:56212 D:1 BT: 0}
</sublist>
return rtnVal; {S:56228 E:56241 D:0 BT: 0}
****************************/
/***************************
Processing list:
LineListTest[]rtnVal = new LineListTest[root.nPaths]; {S:56075 E:56120 D:0 BT: 0}
for(int i = 0;i<root.nPaths;i ++){} {S:56128 E:56220 D:0 BT: 0}
<sublist>
rtnVal[i]= getParsedCodePath(i); {S:56180 E:56212 D:1 BT: 0}
</sublist>
return rtnVal; {S:56228 E:56241 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
LineListTest[]rtnVal = new LineListTest[root.nPaths]; {S:56075 E:56120 D:0 BT: 0}
for(int i = 0;i<root.nPaths;i ++){} {S:56128 E:56220 D:0 BT: 0}
<sublist>
rtnVal[i]= getParsedCodePath(i); {S:56180 E:56212 D:1 BT: 0}
</sublist>
rtnVal[i]= getParsedCodePath(i); {S:56180 E:56212 D:1 BT: 0}
return rtnVal; {S:56228 E:56241 D:0 BT: 0}
****************************/
   LineListTest[]rtnVal = new LineListTest[root.nPaths]; //S:56075   E:56120 D: 0BT: 0
   for(int i = 0;i<root.nPaths;i ++) //S:56128   E:56220 D: 0BT: 0
   {
      rtnVal[i]= getParsedCodePath(i); //S:56180   E:56212 D: 1BT: 0
   }
   return rtnVal; //S:56228   E:56241 D: 0BT: 0
   }

   public LineListTest getParsedCodePath(int pathNum)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:8 CP:0
/***************************
Processing list:
LineListTest rtnVal; {S:56321 E:56336 D:0 BT: 0}
LinkedList path; {S:56344 E:56359 D:0 BT: 0}
path = new LinkedList(); {S:56459 E:56482 D:0 BT: 0}
path.add(root); {S:56490 E:56504 D:0 BT: 0}
int startLevel = 0; {S:56512 E:56530 D:0 BT: 0}
int endLevel = 1; {S:56538 E:56554 D:0 BT: 0}
root.currPath = pathNum; {S:56602 E:56625 D:0 BT: 0}
while(true){} {S:56693 E:59572 D:0 BT: 0}
<sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:56744 E:56881 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:56804 E:56839 D:2 BT: 0}
path.addAll(d.children); {S:56849 E:56872 D:2 BT: 0}
</sublist>
startLevel = endLevel; {S:57198 E:57219 D:1 BT: 0}
endLevel = path.size(); {S:57228 E:57250 D:1 BT: 0}
int childNum = 0; {S:57344 E:57360 D:1 BT: 0}
for(int j = startLevel;j<endLevel;j ++){} {S:57369 E:58660 D:1 BT: 0}
<sublist>
CodeNodeTest parent =(CodeNodeTest)path.get(j); {S:57539 E:57579 D:2 BT: 0}
parent = parent.parent; {S:57589 E:57611 D:2 BT: 0}
int prodPrev = 1; {S:57763 E:57779 D:2 BT: 0}
CodeNodeTest e =(CodeNodeTest)parent.children.get(childNum); {S:57789 E:57842 D:2 BT: 0}
for(int k = childNum;k<parent.children.size()- 1;k ++){} {S:57934 E:58109 D:2 BT: 0}
<sublist>
CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); {S:58012 E:58062 D:3 BT: 0}
prodPrev *= f.nPaths; {S:58073 E:58093 D:3 BT: 0}
</sublist>
</sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:58962 E:59436 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:59022 E:59057 D:2 BT: 0}
int sum = 0; {S:59067 E:59078 D:2 BT: 0}
for(int k = d.children.size()- 1;k>= 0;k --){} {S:59088 E:59427 D:2 BT: 0}
<sublist>
CodeNodeTest e =(CodeNodeTest)d.children.get(k); {S:59155 E:59196 D:3 BT: 0}
sum += e.nPaths; {S:59207 E:59222 D:3 BT: 0}
</sublist>
</sublist>
startLevel = endLevel; {S:59445 E:59466 D:1 BT: 0}
endLevel = path.size(); {S:59475 E:59497 D:1 BT: 0}
</sublist>
rtnVal = getParsedCodePath(path); {S:59642 E:59674 D:0 BT: 0}
return rtnVal; {S:59868 E:59881 D:0 BT: 0}
****************************/
/***************************
Processing list:
LineListTest rtnVal; {S:56321 E:56336 D:0 BT: 0}
LinkedList path; {S:56344 E:56359 D:0 BT: 0}
path = new LinkedList(); {S:56459 E:56482 D:0 BT: 0}
path.add(root); {S:56490 E:56504 D:0 BT: 0}
int startLevel = 0; {S:56512 E:56530 D:0 BT: 0}
int endLevel = 1; {S:56538 E:56554 D:0 BT: 0}
root.currPath = pathNum; {S:56602 E:56625 D:0 BT: 0}
while(true){} {S:56693 E:59572 D:0 BT: 0}
<sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:56744 E:56881 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:56804 E:56839 D:2 BT: 0}
path.addAll(d.children); {S:56849 E:56872 D:2 BT: 0}
</sublist>
startLevel = endLevel; {S:57198 E:57219 D:1 BT: 0}
endLevel = path.size(); {S:57228 E:57250 D:1 BT: 0}
int childNum = 0; {S:57344 E:57360 D:1 BT: 0}
for(int j = startLevel;j<endLevel;j ++){} {S:57369 E:58660 D:1 BT: 0}
<sublist>
CodeNodeTest parent =(CodeNodeTest)path.get(j); {S:57539 E:57579 D:2 BT: 0}
parent = parent.parent; {S:57589 E:57611 D:2 BT: 0}
int prodPrev = 1; {S:57763 E:57779 D:2 BT: 0}
CodeNodeTest e =(CodeNodeTest)parent.children.get(childNum); {S:57789 E:57842 D:2 BT: 0}
for(int k = childNum;k<parent.children.size()- 1;k ++){} {S:57934 E:58109 D:2 BT: 0}
<sublist>
CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); {S:58012 E:58062 D:3 BT: 0}
prodPrev *= f.nPaths; {S:58073 E:58093 D:3 BT: 0}
</sublist>
</sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:58962 E:59436 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:59022 E:59057 D:2 BT: 0}
int sum = 0; {S:59067 E:59078 D:2 BT: 0}
for(int k = d.children.size()- 1;k>= 0;k --){} {S:59088 E:59427 D:2 BT: 0}
<sublist>
CodeNodeTest e =(CodeNodeTest)d.children.get(k); {S:59155 E:59196 D:3 BT: 0}
sum += e.nPaths; {S:59207 E:59222 D:3 BT: 0}
</sublist>
</sublist>
startLevel = endLevel; {S:59445 E:59466 D:1 BT: 0}
endLevel = path.size(); {S:59475 E:59497 D:1 BT: 0}
</sublist>
rtnVal = getParsedCodePath(path); {S:59642 E:59674 D:0 BT: 0}
return rtnVal; {S:59868 E:59881 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:57258 E:57299 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:57258 E:57299 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:58266 E:58651 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:58266 E:58651 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:59232 E:59417 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:59232 E:59417 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(startLevel == endLevel) {S:57259 E:57299 D:1 BT: 1}
break; {S:57294 E:57299 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(startLevel == endLevel){} {S:57259 E:57299 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:57294 E:0 D:2 BT: 0}
break; {S:57294 E:57299 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(childNum == parent.children.size()- 1){ {S:58267 E:58487 D:2 BT: 1}
e.currPath = parent.currPath; {S:58409 E:58437 D:3 BT: 0}
childNum = 0; {S:58448 E:58460 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(childNum == parent.children.size()- 1){} {S:58267 E:58487 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:58409 E:0 D:3 BT: 0}
e.currPath = parent.currPath; {S:58409 E:58437 D:3 BT: 0}
childNum = 0; {S:58448 E:58460 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#8(3) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:58488 E:58651 D:2 BT: 2}
e.currPath = parent.currPath / prodPrev; {S:58543 E:58582 D:2 BT: 0}
parent.currPath %= prodPrev; {S:58593 E:58620 D:2 BT: 0}
childNum ++; {S:58631 E:58641 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:58488 E:58651 D:2 BT: 2}
e.currPath = parent.currPath / prodPrev; {S:58543 E:58582 D:3 BT: 0}
parent.currPath %= prodPrev; {S:58593 E:58620 D:3 BT: 0}
childNum ++; {S:58631 E:58641 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#9(4) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(d.currPath<sum){} {S:59233 E:59417 D:3 BT: 1}
path.add(e); {S:59274 E:59285 D:4 BT: 0}
e.currPath = d.currPath - sum + e.nPaths; {S:59296 E:59336 D:4 BT: 0}
break; {S:59401 E:59406 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(d.currPath<sum){} {S:59233 E:59417 D:3 BT: 1}
QuicktestRunner.execPath += 1; {S:59274 E:0 D:4 BT: 0}
path.add(e); {S:59274 E:59285 D:4 BT: 0}
e.currPath = d.currPath - sum + e.nPaths; {S:59296 E:59336 D:4 BT: 0}
break; {S:59401 E:59406 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
LineListTest rtnVal; {S:56321 E:56336 D:0 BT: 0}
LinkedList path; {S:56344 E:56359 D:0 BT: 0}
path = new LinkedList(); {S:56459 E:56482 D:0 BT: 0}
path.add(root); {S:56490 E:56504 D:0 BT: 0}
int startLevel = 0; {S:56512 E:56530 D:0 BT: 0}
int endLevel = 1; {S:56538 E:56554 D:0 BT: 0}
root.currPath = pathNum; {S:56602 E:56625 D:0 BT: 0}
while(true){} {S:56693 E:59572 D:0 BT: 0}
<sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:56744 E:56881 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:56804 E:56839 D:2 BT: 0}
path.addAll(d.children); {S:56849 E:56872 D:2 BT: 0}
</sublist>
startLevel = endLevel; {S:57198 E:57219 D:1 BT: 0}
endLevel = path.size(); {S:57228 E:57250 D:1 BT: 0}
int childNum = 0; {S:57344 E:57360 D:1 BT: 0}
for(int j = startLevel;j<endLevel;j ++){} {S:57369 E:58660 D:1 BT: 0}
<sublist>
CodeNodeTest parent =(CodeNodeTest)path.get(j); {S:57539 E:57579 D:2 BT: 0}
parent = parent.parent; {S:57589 E:57611 D:2 BT: 0}
int prodPrev = 1; {S:57763 E:57779 D:2 BT: 0}
CodeNodeTest e =(CodeNodeTest)parent.children.get(childNum); {S:57789 E:57842 D:2 BT: 0}
for(int k = childNum;k<parent.children.size()- 1;k ++){} {S:57934 E:58109 D:2 BT: 0}
<sublist>
CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); {S:58012 E:58062 D:3 BT: 0}
prodPrev *= f.nPaths; {S:58073 E:58093 D:3 BT: 0}
</sublist>
</sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:58962 E:59436 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:59022 E:59057 D:2 BT: 0}
int sum = 0; {S:59067 E:59078 D:2 BT: 0}
for(int k = d.children.size()- 1;k>= 0;k --){} {S:59088 E:59427 D:2 BT: 0}
<sublist>
CodeNodeTest e =(CodeNodeTest)d.children.get(k); {S:59155 E:59196 D:3 BT: 0}
sum += e.nPaths; {S:59207 E:59222 D:3 BT: 0}
</sublist>
</sublist>
startLevel = endLevel; {S:59445 E:59466 D:1 BT: 0}
endLevel = path.size(); {S:59475 E:59497 D:1 BT: 0}
</sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:56744 E:56881 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:56804 E:56839 D:2 BT: 0}
path.addAll(d.children); {S:56849 E:56872 D:2 BT: 0}
</sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:56804 E:56839 D:2 BT: 0}
path.addAll(d.children); {S:56849 E:56872 D:2 BT: 0}
startLevel = endLevel; {S:57198 E:57219 D:1 BT: 0}
endLevel = path.size(); {S:57228 E:57250 D:1 BT: 0}
 {S:57258 E:57299 D:1 BT: 7}
if(startLevel == endLevel){} {S:57259 E:57299 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:57294 E:0 D:2 BT: 0}
break; {S:57294 E:57299 D:2 BT: 0}
int childNum = 0; {S:57344 E:57360 D:1 BT: 0}
for(int j = startLevel;j<endLevel;j ++){} {S:57369 E:58660 D:1 BT: 0}
<sublist>
CodeNodeTest parent =(CodeNodeTest)path.get(j); {S:57539 E:57579 D:2 BT: 0}
parent = parent.parent; {S:57589 E:57611 D:2 BT: 0}
int prodPrev = 1; {S:57763 E:57779 D:2 BT: 0}
CodeNodeTest e =(CodeNodeTest)parent.children.get(childNum); {S:57789 E:57842 D:2 BT: 0}
for(int k = childNum;k<parent.children.size()- 1;k ++){} {S:57934 E:58109 D:2 BT: 0}
<sublist>
CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); {S:58012 E:58062 D:3 BT: 0}
prodPrev *= f.nPaths; {S:58073 E:58093 D:3 BT: 0}
</sublist>
</sublist>
CodeNodeTest parent =(CodeNodeTest)path.get(j); {S:57539 E:57579 D:2 BT: 0}
parent = parent.parent; {S:57589 E:57611 D:2 BT: 0}
int prodPrev = 1; {S:57763 E:57779 D:2 BT: 0}
CodeNodeTest e =(CodeNodeTest)parent.children.get(childNum); {S:57789 E:57842 D:2 BT: 0}
for(int k = childNum;k<parent.children.size()- 1;k ++){} {S:57934 E:58109 D:2 BT: 0}
<sublist>
CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); {S:58012 E:58062 D:3 BT: 0}
prodPrev *= f.nPaths; {S:58073 E:58093 D:3 BT: 0}
</sublist>
CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); {S:58012 E:58062 D:3 BT: 0}
prodPrev *= f.nPaths; {S:58073 E:58093 D:3 BT: 0}
 {S:58266 E:58651 D:2 BT: 7}
if(childNum == parent.children.size()- 1){} {S:58267 E:58487 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:58409 E:0 D:3 BT: 0}
e.currPath = parent.currPath; {S:58409 E:58437 D:3 BT: 0}
childNum = 0; {S:58448 E:58460 D:3 BT: 0}
else{} {S:58488 E:58651 D:2 BT: 2}
e.currPath = parent.currPath / prodPrev; {S:58543 E:58582 D:3 BT: 0}
parent.currPath %= prodPrev; {S:58593 E:58620 D:3 BT: 0}
childNum ++; {S:58631 E:58641 D:3 BT: 0}
for(int j = startLevel;j<endLevel;j ++){} {S:58962 E:59436 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:59022 E:59057 D:2 BT: 0}
int sum = 0; {S:59067 E:59078 D:2 BT: 0}
for(int k = d.children.size()- 1;k>= 0;k --){} {S:59088 E:59427 D:2 BT: 0}
<sublist>
CodeNodeTest e =(CodeNodeTest)d.children.get(k); {S:59155 E:59196 D:3 BT: 0}
sum += e.nPaths; {S:59207 E:59222 D:3 BT: 0}
</sublist>
</sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:59022 E:59057 D:2 BT: 0}
int sum = 0; {S:59067 E:59078 D:2 BT: 0}
for(int k = d.children.size()- 1;k>= 0;k --){} {S:59088 E:59427 D:2 BT: 0}
<sublist>
CodeNodeTest e =(CodeNodeTest)d.children.get(k); {S:59155 E:59196 D:3 BT: 0}
sum += e.nPaths; {S:59207 E:59222 D:3 BT: 0}
</sublist>
CodeNodeTest e =(CodeNodeTest)d.children.get(k); {S:59155 E:59196 D:3 BT: 0}
sum += e.nPaths; {S:59207 E:59222 D:3 BT: 0}
 {S:59232 E:59417 D:3 BT: 7}
if(d.currPath<sum){} {S:59233 E:59417 D:3 BT: 1}
QuicktestRunner.execPath += 1; {S:59274 E:0 D:4 BT: 0}
path.add(e); {S:59274 E:59285 D:4 BT: 0}
e.currPath = d.currPath - sum + e.nPaths; {S:59296 E:59336 D:4 BT: 0}
break; {S:59401 E:59406 D:4 BT: 0}
startLevel = endLevel; {S:59445 E:59466 D:1 BT: 0}
endLevel = path.size(); {S:59475 E:59497 D:1 BT: 0}
rtnVal = getParsedCodePath(path); {S:59642 E:59674 D:0 BT: 0}
return rtnVal; {S:59868 E:59881 D:0 BT: 0}
****************************/
   LineListTest rtnVal; //S:56321   E:56336 D: 0BT: 0
   LinkedList path; //S:56344   E:56359 D: 0BT: 0
   path = new LinkedList(); //S:56459   E:56482 D: 0BT: 0
   path.add(root); //S:56490   E:56504 D: 0BT: 0
   int startLevel = 0; //S:56512   E:56530 D: 0BT: 0
   int endLevel = 1; //S:56538   E:56554 D: 0BT: 0
   root.currPath = pathNum; //S:56602   E:56625 D: 0BT: 0
   while(true) //S:56693   E:59572 D: 0BT: 0
   {
      for(int j = startLevel;j<endLevel;j ++) //S:56744   E:56881 D: 1BT: 0
      {
         CodeNodeTest d =(CodeNodeTest)path.get(j); //S:56804   E:56839 D: 2BT: 0
         path.addAll(d.children); //S:56849   E:56872 D: 2BT: 0
      }
      startLevel = endLevel; //S:57198   E:57219 D: 1BT: 0
      endLevel = path.size(); //S:57228   E:57250 D: 1BT: 0
       //S:57258   E:57299 D: 1BT: 7
      if(startLevel == endLevel) //S:57259   E:57299 D: 1BT: 1
      {
         QuicktestRunner.execPath += 4; //S:57294   E:0 D: 2BT: 0
         break; //S:57294   E:57299 D: 2BT: 0
      }
      int childNum = 0; //S:57344   E:57360 D: 1BT: 0
      for(int j = startLevel;j<endLevel;j ++) //S:57369   E:58660 D: 1BT: 0
      {
         CodeNodeTest parent =(CodeNodeTest)path.get(j); //S:57539   E:57579 D: 2BT: 0
         parent = parent.parent; //S:57589   E:57611 D: 2BT: 0
         int prodPrev = 1; //S:57763   E:57779 D: 2BT: 0
         CodeNodeTest e =(CodeNodeTest)parent.children.get(childNum); //S:57789   E:57842 D: 2BT: 0
         for(int k = childNum;k<parent.children.size()- 1;k ++) //S:57934   E:58109 D: 2BT: 0
         {
            CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); //S:58012   E:58062 D: 3BT: 0
            prodPrev *= f.nPaths; //S:58073   E:58093 D: 3BT: 0
         }
          //S:58266   E:58651 D: 2BT: 7
         if(childNum == parent.children.size()- 1) //S:58267   E:58487 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:58409   E:0 D: 3BT: 0
            e.currPath = parent.currPath; //S:58409   E:58437 D: 3BT: 0
            childNum = 0; //S:58448   E:58460 D: 3BT: 0
         }
         else //S:58488   E:58651 D: 2BT: 2
         {
            e.currPath = parent.currPath / prodPrev; //S:58543   E:58582 D: 3BT: 0
            parent.currPath %= prodPrev; //S:58593   E:58620 D: 3BT: 0
            childNum ++; //S:58631   E:58641 D: 3BT: 0
         }
      }
      for(int j = startLevel;j<endLevel;j ++) //S:58962   E:59436 D: 1BT: 0
      {
         CodeNodeTest d =(CodeNodeTest)path.get(j); //S:59022   E:59057 D: 2BT: 0
         int sum = 0; //S:59067   E:59078 D: 2BT: 0
         for(int k = d.children.size()- 1;k>= 0;k --) //S:59088   E:59427 D: 2BT: 0
         {
            CodeNodeTest e =(CodeNodeTest)d.children.get(k); //S:59155   E:59196 D: 3BT: 0
            sum += e.nPaths; //S:59207   E:59222 D: 3BT: 0
             //S:59232   E:59417 D: 3BT: 7
            if(d.currPath<sum) //S:59233   E:59417 D: 3BT: 1
            {
               QuicktestRunner.execPath += 1; //S:59274   E:0 D: 4BT: 0
               path.add(e); //S:59274   E:59285 D: 4BT: 0
               e.currPath = d.currPath - sum + e.nPaths; //S:59296   E:59336 D: 4BT: 0
               break; //S:59401   E:59406 D: 4BT: 0
            }
         }
      }
      startLevel = endLevel; //S:59445   E:59466 D: 1BT: 0
      endLevel = path.size(); //S:59475   E:59497 D: 1BT: 0
   }
   rtnVal = getParsedCodePath(path); //S:59642   E:59674 D: 0BT: 0
   return rtnVal; //S:59868   E:59881 D: 0BT: 0
   }

   private LineListTest getParsedCodePath(LinkedList in/*, LineListTest out*/)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
LineListTest newList = new LineListTest(); {S:59982 E:60015 D:0 BT: 0}
LineListTest currList = newList; {S:60023 E:60050 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:60254 E:60517 D:0 BT: 0}
<sublist>
CodeNodeTest cn =(CodeNodeTest)in.get(i); {S:60304 E:60338 D:1 BT: 0}
LineListTest subList = new LineListTest(); {S:60347 E:60380 D:1 BT: 0}
getAllSublines(cn.list , subList); {S:60389 E:60421 D:1 BT: 0}
for(int j = 0;j<subList.size();j ++)newList.add(subList.getLine(j)); {S:60430 E:60509 D:1 BT: 0}
</sublist>
newList.sort(); {S:60525 E:60539 D:0 BT: 0}
return newList; {S:60547 E:60561 D:0 BT: 0}
****************************/
/***************************
Processing list:
LineListTest newList = new LineListTest(); {S:59982 E:60015 D:0 BT: 0}
LineListTest currList = newList; {S:60023 E:60050 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:60254 E:60517 D:0 BT: 0}
<sublist>
CodeNodeTest cn =(CodeNodeTest)in.get(i); {S:60304 E:60338 D:1 BT: 0}
LineListTest subList = new LineListTest(); {S:60347 E:60380 D:1 BT: 0}
getAllSublines(cn.list , subList); {S:60389 E:60421 D:1 BT: 0}
for(int j = 0;j<subList.size();j ++)newList.add(subList.getLine(j)); {S:60430 E:60509 D:1 BT: 0}
</sublist>
newList.sort(); {S:60525 E:60539 D:0 BT: 0}
return newList; {S:60547 E:60561 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
LineListTest newList = new LineListTest(); {S:59982 E:60015 D:0 BT: 0}
LineListTest currList = newList; {S:60023 E:60050 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:60254 E:60517 D:0 BT: 0}
<sublist>
CodeNodeTest cn =(CodeNodeTest)in.get(i); {S:60304 E:60338 D:1 BT: 0}
LineListTest subList = new LineListTest(); {S:60347 E:60380 D:1 BT: 0}
getAllSublines(cn.list , subList); {S:60389 E:60421 D:1 BT: 0}
for(int j = 0;j<subList.size();j ++)newList.add(subList.getLine(j)); {S:60430 E:60509 D:1 BT: 0}
</sublist>
CodeNodeTest cn =(CodeNodeTest)in.get(i); {S:60304 E:60338 D:1 BT: 0}
LineListTest subList = new LineListTest(); {S:60347 E:60380 D:1 BT: 0}
getAllSublines(cn.list , subList); {S:60389 E:60421 D:1 BT: 0}
for(int j = 0;j<subList.size();j ++)newList.add(subList.getLine(j)); {S:60430 E:60509 D:1 BT: 0}
newList.sort(); {S:60525 E:60539 D:0 BT: 0}
return newList; {S:60547 E:60561 D:0 BT: 0}
****************************/
   LineListTest newList = new LineListTest(); //S:59982   E:60015 D: 0BT: 0
   LineListTest currList = newList; //S:60023   E:60050 D: 0BT: 0
   for(int i = 0;i<in.size();i ++) //S:60254   E:60517 D: 0BT: 0
   {
      CodeNodeTest cn =(CodeNodeTest)in.get(i); //S:60304   E:60338 D: 1BT: 0
      LineListTest subList = new LineListTest(); //S:60347   E:60380 D: 1BT: 0
      getAllSublines(cn.list , subList); //S:60389   E:60421 D: 1BT: 0
      for(int j = 0;j<subList.size();j ++)newList.add(subList.getLine(j)); //S:60430   E:60509 D: 1BT: 0
   }
   newList.sort(); //S:60525   E:60539 D: 0BT: 0
   return newList; //S:60547   E:60561 D: 0BT: 0
   }

   private LineListTest getParsedCodePath(LineListTest[] in)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
LineListTest newList = new LineListTest(); {S:60644 E:60677 D:0 BT: 0}
for(int i = 0;i<in.length;i ++){} {S:60685 E:60903 D:0 BT: 0}
<sublist>
LineListTest subList = new LineListTest(); {S:60735 E:60768 D:1 BT: 0}
getAllSublines(in[i], subList); {S:60777 E:60807 D:1 BT: 0}
for(int j = 0;j<subList.size();j ++)newList.add(subList.getLine(j)); {S:60816 E:60895 D:1 BT: 0}
</sublist>
newList.sort(); {S:60911 E:60925 D:0 BT: 0}
return newList; {S:60933 E:60947 D:0 BT: 0}
****************************/
/***************************
Processing list:
LineListTest newList = new LineListTest(); {S:60644 E:60677 D:0 BT: 0}
for(int i = 0;i<in.length;i ++){} {S:60685 E:60903 D:0 BT: 0}
<sublist>
LineListTest subList = new LineListTest(); {S:60735 E:60768 D:1 BT: 0}
getAllSublines(in[i], subList); {S:60777 E:60807 D:1 BT: 0}
for(int j = 0;j<subList.size();j ++)newList.add(subList.getLine(j)); {S:60816 E:60895 D:1 BT: 0}
</sublist>
newList.sort(); {S:60911 E:60925 D:0 BT: 0}
return newList; {S:60933 E:60947 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
LineListTest newList = new LineListTest(); {S:60644 E:60677 D:0 BT: 0}
for(int i = 0;i<in.length;i ++){} {S:60685 E:60903 D:0 BT: 0}
<sublist>
LineListTest subList = new LineListTest(); {S:60735 E:60768 D:1 BT: 0}
getAllSublines(in[i], subList); {S:60777 E:60807 D:1 BT: 0}
for(int j = 0;j<subList.size();j ++)newList.add(subList.getLine(j)); {S:60816 E:60895 D:1 BT: 0}
</sublist>
LineListTest subList = new LineListTest(); {S:60735 E:60768 D:1 BT: 0}
getAllSublines(in[i], subList); {S:60777 E:60807 D:1 BT: 0}
for(int j = 0;j<subList.size();j ++)newList.add(subList.getLine(j)); {S:60816 E:60895 D:1 BT: 0}
newList.sort(); {S:60911 E:60925 D:0 BT: 0}
return newList; {S:60933 E:60947 D:0 BT: 0}
****************************/
   LineListTest newList = new LineListTest(); //S:60644   E:60677 D: 0BT: 0
   for(int i = 0;i<in.length;i ++) //S:60685   E:60903 D: 0BT: 0
   {
      LineListTest subList = new LineListTest(); //S:60735   E:60768 D: 1BT: 0
      getAllSublines(in[i], subList); //S:60777   E:60807 D: 1BT: 0
      for(int j = 0;j<subList.size();j ++)newList.add(subList.getLine(j)); //S:60816   E:60895 D: 1BT: 0
   }
   newList.sort(); //S:60911   E:60925 D: 0BT: 0
   return newList; //S:60933   E:60947 D: 0BT: 0
   }

   private void getAllSublines(LineListTest in, LineListTest out)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
for(int i = 0;i<in.size();i ++){} {S:61035 E:61213 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:61085 E:61112 D:1 BT: 0}
out.add(li); {S:61121 E:61132 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
for(int i = 0;i<in.size();i ++){} {S:61035 E:61213 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:61085 E:61112 D:1 BT: 0}
out.add(li); {S:61121 E:61132 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:61140 E:61205 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:61140 E:61205 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(li.subLines != null) {S:61141 E:61205 D:1 BT: 1}
getAllSublines(li.subLines , out); {S:61173 E:61205 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(li.subLines != null){} {S:61141 E:61205 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:61173 E:0 D:2 BT: 0}
getAllSublines(li.subLines , out); {S:61173 E:61205 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<in.size();i ++){} {S:61035 E:61213 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:61085 E:61112 D:1 BT: 0}
out.add(li); {S:61121 E:61132 D:1 BT: 0}
</sublist>
LineInfoTest li = in.getLine(i); {S:61085 E:61112 D:1 BT: 0}
out.add(li); {S:61121 E:61132 D:1 BT: 0}
 {S:61140 E:61205 D:1 BT: 7}
if(li.subLines != null){} {S:61141 E:61205 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:61173 E:0 D:2 BT: 0}
getAllSublines(li.subLines , out); {S:61173 E:61205 D:2 BT: 0}
****************************/
   for(int i = 0;i<in.size();i ++) //S:61035   E:61213 D: 0BT: 0
   {
      LineInfoTest li = in.getLine(i); //S:61085   E:61112 D: 1BT: 0
      out.add(li); //S:61121   E:61132 D: 1BT: 0
       //S:61140   E:61205 D: 1BT: 7
      if(li.subLines != null) //S:61141   E:61205 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:61173   E:0 D: 2BT: 0
         getAllSublines(li.subLines , out); //S:61173   E:61205 D: 2BT: 0
      }
   }
   }

   private LineListTest getParsedCodePath(LinkedList nodes, LineListTest lines, int index)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
CodeNodeTest parent =(CodeNodeTest)nodes.get(index); {S:61326 E:61371 D:0 BT: 0}
for(int i = 0;i<parent.list.size();i ++)lines.add(parent.list.get(i)); {S:61379 E:61459 D:0 BT: 0}
for(int i = 0;i<nodes.size();i ++){} {S:61467 E:61739 D:0 BT: 0}
<sublist>
CodeNodeTest cn =(CodeNodeTest)nodes.get(i); {S:61520 E:61557 D:1 BT: 0}
</sublist>
return lines; {S:61747 E:61759 D:0 BT: 0}
****************************/
/***************************
Processing list:
CodeNodeTest parent =(CodeNodeTest)nodes.get(index); {S:61326 E:61371 D:0 BT: 0}
for(int i = 0;i<parent.list.size();i ++)lines.add(parent.list.get(i)); {S:61379 E:61459 D:0 BT: 0}
for(int i = 0;i<nodes.size();i ++){} {S:61467 E:61739 D:0 BT: 0}
<sublist>
CodeNodeTest cn =(CodeNodeTest)nodes.get(i); {S:61520 E:61557 D:1 BT: 0}
</sublist>
return lines; {S:61747 E:61759 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:61565 E:61731 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:61565 E:61731 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(cn.parent != null && cn.parent == parent){} {S:61566 E:61731 D:1 BT: 1}
LineInfoTest sub = lines.getLine(cn.parentLine); {S:61628 E:61671 D:2 BT: 0}
getParsedCodePath(nodes , sub.subLines , i); {S:61681 E:61722 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(cn.parent != null && cn.parent == parent){} {S:61566 E:61731 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:61628 E:0 D:2 BT: 0}
LineInfoTest sub = lines.getLine(cn.parentLine); {S:61628 E:61671 D:2 BT: 0}
getParsedCodePath(nodes , sub.subLines , i); {S:61681 E:61722 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
CodeNodeTest parent =(CodeNodeTest)nodes.get(index); {S:61326 E:61371 D:0 BT: 0}
for(int i = 0;i<parent.list.size();i ++)lines.add(parent.list.get(i)); {S:61379 E:61459 D:0 BT: 0}
for(int i = 0;i<nodes.size();i ++){} {S:61467 E:61739 D:0 BT: 0}
<sublist>
CodeNodeTest cn =(CodeNodeTest)nodes.get(i); {S:61520 E:61557 D:1 BT: 0}
</sublist>
CodeNodeTest cn =(CodeNodeTest)nodes.get(i); {S:61520 E:61557 D:1 BT: 0}
 {S:61565 E:61731 D:1 BT: 7}
if(cn.parent != null && cn.parent == parent){} {S:61566 E:61731 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:61628 E:0 D:2 BT: 0}
LineInfoTest sub = lines.getLine(cn.parentLine); {S:61628 E:61671 D:2 BT: 0}
getParsedCodePath(nodes , sub.subLines , i); {S:61681 E:61722 D:2 BT: 0}
return lines; {S:61747 E:61759 D:0 BT: 0}
****************************/
   CodeNodeTest parent =(CodeNodeTest)nodes.get(index); //S:61326   E:61371 D: 0BT: 0
   for(int i = 0;i<parent.list.size();i ++)lines.add(parent.list.get(i)); //S:61379   E:61459 D: 0BT: 0
   for(int i = 0;i<nodes.size();i ++) //S:61467   E:61739 D: 0BT: 0
   {
      CodeNodeTest cn =(CodeNodeTest)nodes.get(i); //S:61520   E:61557 D: 1BT: 0
       //S:61565   E:61731 D: 1BT: 7
      if(cn.parent != null && cn.parent == parent) //S:61566   E:61731 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:61628   E:0 D: 2BT: 0
         LineInfoTest sub = lines.getLine(cn.parentLine); //S:61628   E:61671 D: 2BT: 0
         getParsedCodePath(nodes , sub.subLines , i); //S:61681   E:61722 D: 2BT: 0
      }
   }
   return lines; //S:61747   E:61759 D: 0BT: 0
   }

   public String[] getCodePaths()
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:8 CP:0
/***************************
Processing list:
String[]rtnVal = new String[root.nPaths]; {S:61819 E:61860 D:0 BT: 0}
LinkedList path; {S:61868 E:61883 D:0 BT: 0}
for(int i = 0;i<root.nPaths;i ++){} {S:61891 E:64801 D:0 BT: 0}
<sublist>
path = new LinkedList(); {S:61942 E:61965 D:1 BT: 0}
path.add(root); {S:61973 E:61987 D:1 BT: 0}
int startLevel = 0; {S:61995 E:62013 D:1 BT: 0}
int endLevel = 1; {S:62021 E:62037 D:1 BT: 0}
root.currPath = i; {S:62085 E:62102 D:1 BT: 0}
while(true){} {S:62110 E:64355 D:1 BT: 0}
<sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:62161 E:62298 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:62221 E:62256 D:3 BT: 0}
path.addAll(d.children); {S:62266 E:62289 D:3 BT: 0}
</sublist>
startLevel = endLevel; {S:62307 E:62328 D:2 BT: 0}
endLevel = path.size(); {S:62337 E:62359 D:2 BT: 0}
int childNum = 0; {S:62453 E:62469 D:2 BT: 0}
for(int j = startLevel;j<endLevel;j ++){} {S:62478 E:63577 D:2 BT: 0}
<sublist>
CodeNodeTest parent =(CodeNodeTest)path.get(j); {S:62648 E:62688 D:3 BT: 0}
parent = parent.parent; {S:62698 E:62720 D:3 BT: 0}
int prodPrev = 1; {S:62810 E:62826 D:3 BT: 0}
CodeNodeTest e =(CodeNodeTest)parent.children.get(childNum); {S:62836 E:62889 D:3 BT: 0}
for(int k = childNum;k<parent.children.size()- 1;k ++){} {S:62899 E:63074 D:3 BT: 0}
<sublist>
CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); {S:62977 E:63027 D:4 BT: 0}
prodPrev *= f.nPaths; {S:63038 E:63058 D:4 BT: 0}
</sublist>
</sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:63812 E:64286 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:63872 E:63907 D:3 BT: 0}
int sum = 0; {S:63917 E:63928 D:3 BT: 0}
for(int k = d.children.size()- 1;k>= 0;k --){} {S:63938 E:64277 D:3 BT: 0}
<sublist>
CodeNodeTest e =(CodeNodeTest)d.children.get(k); {S:64005 E:64046 D:4 BT: 0}
sum += e.nPaths; {S:64057 E:64072 D:4 BT: 0}
</sublist>
</sublist>
startLevel = endLevel; {S:64295 E:64316 D:2 BT: 0}
endLevel = path.size(); {S:64325 E:64347 D:2 BT: 0}
</sublist>
rtnVal[rtnVal.length - 1 - i]= buildString(path , 0 ,(CodeNodeTest)path.get(0)); {S:64614 E:64690 D:1 BT: 0}
</sublist>
return rtnVal; {S:64809 E:64822 D:0 BT: 0}
****************************/
/***************************
Processing list:
String[]rtnVal = new String[root.nPaths]; {S:61819 E:61860 D:0 BT: 0}
LinkedList path; {S:61868 E:61883 D:0 BT: 0}
for(int i = 0;i<root.nPaths;i ++){} {S:61891 E:64801 D:0 BT: 0}
<sublist>
path = new LinkedList(); {S:61942 E:61965 D:1 BT: 0}
path.add(root); {S:61973 E:61987 D:1 BT: 0}
int startLevel = 0; {S:61995 E:62013 D:1 BT: 0}
int endLevel = 1; {S:62021 E:62037 D:1 BT: 0}
root.currPath = i; {S:62085 E:62102 D:1 BT: 0}
while(true){} {S:62110 E:64355 D:1 BT: 0}
<sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:62161 E:62298 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:62221 E:62256 D:3 BT: 0}
path.addAll(d.children); {S:62266 E:62289 D:3 BT: 0}
</sublist>
startLevel = endLevel; {S:62307 E:62328 D:2 BT: 0}
endLevel = path.size(); {S:62337 E:62359 D:2 BT: 0}
int childNum = 0; {S:62453 E:62469 D:2 BT: 0}
for(int j = startLevel;j<endLevel;j ++){} {S:62478 E:63577 D:2 BT: 0}
<sublist>
CodeNodeTest parent =(CodeNodeTest)path.get(j); {S:62648 E:62688 D:3 BT: 0}
parent = parent.parent; {S:62698 E:62720 D:3 BT: 0}
int prodPrev = 1; {S:62810 E:62826 D:3 BT: 0}
CodeNodeTest e =(CodeNodeTest)parent.children.get(childNum); {S:62836 E:62889 D:3 BT: 0}
for(int k = childNum;k<parent.children.size()- 1;k ++){} {S:62899 E:63074 D:3 BT: 0}
<sublist>
CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); {S:62977 E:63027 D:4 BT: 0}
prodPrev *= f.nPaths; {S:63038 E:63058 D:4 BT: 0}
</sublist>
</sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:63812 E:64286 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:63872 E:63907 D:3 BT: 0}
int sum = 0; {S:63917 E:63928 D:3 BT: 0}
for(int k = d.children.size()- 1;k>= 0;k --){} {S:63938 E:64277 D:3 BT: 0}
<sublist>
CodeNodeTest e =(CodeNodeTest)d.children.get(k); {S:64005 E:64046 D:4 BT: 0}
sum += e.nPaths; {S:64057 E:64072 D:4 BT: 0}
</sublist>
</sublist>
startLevel = endLevel; {S:64295 E:64316 D:2 BT: 0}
endLevel = path.size(); {S:64325 E:64347 D:2 BT: 0}
</sublist>
rtnVal[rtnVal.length - 1 - i]= buildString(path , 0 ,(CodeNodeTest)path.get(0)); {S:64614 E:64690 D:1 BT: 0}
</sublist>
return rtnVal; {S:64809 E:64822 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:62367 E:62408 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:62367 E:62408 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:63183 E:63568 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:63183 E:63568 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:64082 E:64267 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:64082 E:64267 D:4 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(startLevel == endLevel) {S:62368 E:62408 D:2 BT: 1}
break; {S:62403 E:62408 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(startLevel == endLevel){} {S:62368 E:62408 D:2 BT: 1}
QuicktestRunner.execPath += 4; {S:62403 E:0 D:3 BT: 0}
break; {S:62403 E:62408 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(childNum == parent.children.size()- 1){ {S:63184 E:63404 D:3 BT: 1}
e.currPath = parent.currPath; {S:63326 E:63354 D:4 BT: 0}
childNum = 0; {S:63365 E:63377 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(childNum == parent.children.size()- 1){} {S:63184 E:63404 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:63326 E:0 D:4 BT: 0}
e.currPath = parent.currPath; {S:63326 E:63354 D:4 BT: 0}
childNum = 0; {S:63365 E:63377 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#8(3) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:63405 E:63568 D:3 BT: 2}
e.currPath = parent.currPath / prodPrev; {S:63460 E:63499 D:3 BT: 0}
parent.currPath %= prodPrev; {S:63510 E:63537 D:3 BT: 0}
childNum ++; {S:63548 E:63558 D:3 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:63405 E:63568 D:3 BT: 2}
e.currPath = parent.currPath / prodPrev; {S:63460 E:63499 D:4 BT: 0}
parent.currPath %= prodPrev; {S:63510 E:63537 D:4 BT: 0}
childNum ++; {S:63548 E:63558 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#9(4) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(d.currPath<sum){} {S:64083 E:64267 D:4 BT: 1}
path.add(e); {S:64124 E:64135 D:5 BT: 0}
e.currPath = d.currPath - sum + e.nPaths; {S:64146 E:64186 D:5 BT: 0}
break; {S:64251 E:64256 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(d.currPath<sum){} {S:64083 E:64267 D:4 BT: 1}
QuicktestRunner.execPath += 1; {S:64124 E:0 D:5 BT: 0}
path.add(e); {S:64124 E:64135 D:5 BT: 0}
e.currPath = d.currPath - sum + e.nPaths; {S:64146 E:64186 D:5 BT: 0}
break; {S:64251 E:64256 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String[]rtnVal = new String[root.nPaths]; {S:61819 E:61860 D:0 BT: 0}
LinkedList path; {S:61868 E:61883 D:0 BT: 0}
for(int i = 0;i<root.nPaths;i ++){} {S:61891 E:64801 D:0 BT: 0}
<sublist>
path = new LinkedList(); {S:61942 E:61965 D:1 BT: 0}
path.add(root); {S:61973 E:61987 D:1 BT: 0}
int startLevel = 0; {S:61995 E:62013 D:1 BT: 0}
int endLevel = 1; {S:62021 E:62037 D:1 BT: 0}
root.currPath = i; {S:62085 E:62102 D:1 BT: 0}
while(true){} {S:62110 E:64355 D:1 BT: 0}
<sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:62161 E:62298 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:62221 E:62256 D:3 BT: 0}
path.addAll(d.children); {S:62266 E:62289 D:3 BT: 0}
</sublist>
startLevel = endLevel; {S:62307 E:62328 D:2 BT: 0}
endLevel = path.size(); {S:62337 E:62359 D:2 BT: 0}
int childNum = 0; {S:62453 E:62469 D:2 BT: 0}
for(int j = startLevel;j<endLevel;j ++){} {S:62478 E:63577 D:2 BT: 0}
<sublist>
CodeNodeTest parent =(CodeNodeTest)path.get(j); {S:62648 E:62688 D:3 BT: 0}
parent = parent.parent; {S:62698 E:62720 D:3 BT: 0}
int prodPrev = 1; {S:62810 E:62826 D:3 BT: 0}
CodeNodeTest e =(CodeNodeTest)parent.children.get(childNum); {S:62836 E:62889 D:3 BT: 0}
for(int k = childNum;k<parent.children.size()- 1;k ++){} {S:62899 E:63074 D:3 BT: 0}
<sublist>
CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); {S:62977 E:63027 D:4 BT: 0}
prodPrev *= f.nPaths; {S:63038 E:63058 D:4 BT: 0}
</sublist>
</sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:63812 E:64286 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:63872 E:63907 D:3 BT: 0}
int sum = 0; {S:63917 E:63928 D:3 BT: 0}
for(int k = d.children.size()- 1;k>= 0;k --){} {S:63938 E:64277 D:3 BT: 0}
<sublist>
CodeNodeTest e =(CodeNodeTest)d.children.get(k); {S:64005 E:64046 D:4 BT: 0}
sum += e.nPaths; {S:64057 E:64072 D:4 BT: 0}
</sublist>
</sublist>
startLevel = endLevel; {S:64295 E:64316 D:2 BT: 0}
endLevel = path.size(); {S:64325 E:64347 D:2 BT: 0}
</sublist>
rtnVal[rtnVal.length - 1 - i]= buildString(path , 0 ,(CodeNodeTest)path.get(0)); {S:64614 E:64690 D:1 BT: 0}
</sublist>
path = new LinkedList(); {S:61942 E:61965 D:1 BT: 0}
path.add(root); {S:61973 E:61987 D:1 BT: 0}
int startLevel = 0; {S:61995 E:62013 D:1 BT: 0}
int endLevel = 1; {S:62021 E:62037 D:1 BT: 0}
root.currPath = i; {S:62085 E:62102 D:1 BT: 0}
while(true){} {S:62110 E:64355 D:1 BT: 0}
<sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:62161 E:62298 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:62221 E:62256 D:3 BT: 0}
path.addAll(d.children); {S:62266 E:62289 D:3 BT: 0}
</sublist>
startLevel = endLevel; {S:62307 E:62328 D:2 BT: 0}
endLevel = path.size(); {S:62337 E:62359 D:2 BT: 0}
int childNum = 0; {S:62453 E:62469 D:2 BT: 0}
for(int j = startLevel;j<endLevel;j ++){} {S:62478 E:63577 D:2 BT: 0}
<sublist>
CodeNodeTest parent =(CodeNodeTest)path.get(j); {S:62648 E:62688 D:3 BT: 0}
parent = parent.parent; {S:62698 E:62720 D:3 BT: 0}
int prodPrev = 1; {S:62810 E:62826 D:3 BT: 0}
CodeNodeTest e =(CodeNodeTest)parent.children.get(childNum); {S:62836 E:62889 D:3 BT: 0}
for(int k = childNum;k<parent.children.size()- 1;k ++){} {S:62899 E:63074 D:3 BT: 0}
<sublist>
CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); {S:62977 E:63027 D:4 BT: 0}
prodPrev *= f.nPaths; {S:63038 E:63058 D:4 BT: 0}
</sublist>
</sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:63812 E:64286 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:63872 E:63907 D:3 BT: 0}
int sum = 0; {S:63917 E:63928 D:3 BT: 0}
for(int k = d.children.size()- 1;k>= 0;k --){} {S:63938 E:64277 D:3 BT: 0}
<sublist>
CodeNodeTest e =(CodeNodeTest)d.children.get(k); {S:64005 E:64046 D:4 BT: 0}
sum += e.nPaths; {S:64057 E:64072 D:4 BT: 0}
</sublist>
</sublist>
startLevel = endLevel; {S:64295 E:64316 D:2 BT: 0}
endLevel = path.size(); {S:64325 E:64347 D:2 BT: 0}
</sublist>
for(int j = startLevel;j<endLevel;j ++){} {S:62161 E:62298 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:62221 E:62256 D:3 BT: 0}
path.addAll(d.children); {S:62266 E:62289 D:3 BT: 0}
</sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:62221 E:62256 D:3 BT: 0}
path.addAll(d.children); {S:62266 E:62289 D:3 BT: 0}
startLevel = endLevel; {S:62307 E:62328 D:2 BT: 0}
endLevel = path.size(); {S:62337 E:62359 D:2 BT: 0}
 {S:62367 E:62408 D:2 BT: 7}
if(startLevel == endLevel){} {S:62368 E:62408 D:2 BT: 1}
QuicktestRunner.execPath += 4; {S:62403 E:0 D:3 BT: 0}
break; {S:62403 E:62408 D:3 BT: 0}
int childNum = 0; {S:62453 E:62469 D:2 BT: 0}
for(int j = startLevel;j<endLevel;j ++){} {S:62478 E:63577 D:2 BT: 0}
<sublist>
CodeNodeTest parent =(CodeNodeTest)path.get(j); {S:62648 E:62688 D:3 BT: 0}
parent = parent.parent; {S:62698 E:62720 D:3 BT: 0}
int prodPrev = 1; {S:62810 E:62826 D:3 BT: 0}
CodeNodeTest e =(CodeNodeTest)parent.children.get(childNum); {S:62836 E:62889 D:3 BT: 0}
for(int k = childNum;k<parent.children.size()- 1;k ++){} {S:62899 E:63074 D:3 BT: 0}
<sublist>
CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); {S:62977 E:63027 D:4 BT: 0}
prodPrev *= f.nPaths; {S:63038 E:63058 D:4 BT: 0}
</sublist>
</sublist>
CodeNodeTest parent =(CodeNodeTest)path.get(j); {S:62648 E:62688 D:3 BT: 0}
parent = parent.parent; {S:62698 E:62720 D:3 BT: 0}
int prodPrev = 1; {S:62810 E:62826 D:3 BT: 0}
CodeNodeTest e =(CodeNodeTest)parent.children.get(childNum); {S:62836 E:62889 D:3 BT: 0}
for(int k = childNum;k<parent.children.size()- 1;k ++){} {S:62899 E:63074 D:3 BT: 0}
<sublist>
CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); {S:62977 E:63027 D:4 BT: 0}
prodPrev *= f.nPaths; {S:63038 E:63058 D:4 BT: 0}
</sublist>
CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); {S:62977 E:63027 D:4 BT: 0}
prodPrev *= f.nPaths; {S:63038 E:63058 D:4 BT: 0}
 {S:63183 E:63568 D:3 BT: 7}
if(childNum == parent.children.size()- 1){} {S:63184 E:63404 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:63326 E:0 D:4 BT: 0}
e.currPath = parent.currPath; {S:63326 E:63354 D:4 BT: 0}
childNum = 0; {S:63365 E:63377 D:4 BT: 0}
else{} {S:63405 E:63568 D:3 BT: 2}
e.currPath = parent.currPath / prodPrev; {S:63460 E:63499 D:4 BT: 0}
parent.currPath %= prodPrev; {S:63510 E:63537 D:4 BT: 0}
childNum ++; {S:63548 E:63558 D:4 BT: 0}
for(int j = startLevel;j<endLevel;j ++){} {S:63812 E:64286 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:63872 E:63907 D:3 BT: 0}
int sum = 0; {S:63917 E:63928 D:3 BT: 0}
for(int k = d.children.size()- 1;k>= 0;k --){} {S:63938 E:64277 D:3 BT: 0}
<sublist>
CodeNodeTest e =(CodeNodeTest)d.children.get(k); {S:64005 E:64046 D:4 BT: 0}
sum += e.nPaths; {S:64057 E:64072 D:4 BT: 0}
</sublist>
</sublist>
CodeNodeTest d =(CodeNodeTest)path.get(j); {S:63872 E:63907 D:3 BT: 0}
int sum = 0; {S:63917 E:63928 D:3 BT: 0}
for(int k = d.children.size()- 1;k>= 0;k --){} {S:63938 E:64277 D:3 BT: 0}
<sublist>
CodeNodeTest e =(CodeNodeTest)d.children.get(k); {S:64005 E:64046 D:4 BT: 0}
sum += e.nPaths; {S:64057 E:64072 D:4 BT: 0}
</sublist>
CodeNodeTest e =(CodeNodeTest)d.children.get(k); {S:64005 E:64046 D:4 BT: 0}
sum += e.nPaths; {S:64057 E:64072 D:4 BT: 0}
 {S:64082 E:64267 D:4 BT: 7}
if(d.currPath<sum){} {S:64083 E:64267 D:4 BT: 1}
QuicktestRunner.execPath += 1; {S:64124 E:0 D:5 BT: 0}
path.add(e); {S:64124 E:64135 D:5 BT: 0}
e.currPath = d.currPath - sum + e.nPaths; {S:64146 E:64186 D:5 BT: 0}
break; {S:64251 E:64256 D:5 BT: 0}
startLevel = endLevel; {S:64295 E:64316 D:2 BT: 0}
endLevel = path.size(); {S:64325 E:64347 D:2 BT: 0}
rtnVal[rtnVal.length - 1 - i]= buildString(path , 0 ,(CodeNodeTest)path.get(0)); {S:64614 E:64690 D:1 BT: 0}
return rtnVal; {S:64809 E:64822 D:0 BT: 0}
****************************/
   String[]rtnVal = new String[root.nPaths]; //S:61819   E:61860 D: 0BT: 0
   LinkedList path; //S:61868   E:61883 D: 0BT: 0
   for(int i = 0;i<root.nPaths;i ++) //S:61891   E:64801 D: 0BT: 0
   {
      path = new LinkedList(); //S:61942   E:61965 D: 1BT: 0
      path.add(root); //S:61973   E:61987 D: 1BT: 0
      int startLevel = 0; //S:61995   E:62013 D: 1BT: 0
      int endLevel = 1; //S:62021   E:62037 D: 1BT: 0
      root.currPath = i; //S:62085   E:62102 D: 1BT: 0
      while(true) //S:62110   E:64355 D: 1BT: 0
      {
         for(int j = startLevel;j<endLevel;j ++) //S:62161   E:62298 D: 2BT: 0
         {
            CodeNodeTest d =(CodeNodeTest)path.get(j); //S:62221   E:62256 D: 3BT: 0
            path.addAll(d.children); //S:62266   E:62289 D: 3BT: 0
         }
         startLevel = endLevel; //S:62307   E:62328 D: 2BT: 0
         endLevel = path.size(); //S:62337   E:62359 D: 2BT: 0
          //S:62367   E:62408 D: 2BT: 7
         if(startLevel == endLevel) //S:62368   E:62408 D: 2BT: 1
         {
            QuicktestRunner.execPath += 4; //S:62403   E:0 D: 3BT: 0
            break; //S:62403   E:62408 D: 3BT: 0
         }
         int childNum = 0; //S:62453   E:62469 D: 2BT: 0
         for(int j = startLevel;j<endLevel;j ++) //S:62478   E:63577 D: 2BT: 0
         {
            CodeNodeTest parent =(CodeNodeTest)path.get(j); //S:62648   E:62688 D: 3BT: 0
            parent = parent.parent; //S:62698   E:62720 D: 3BT: 0
            int prodPrev = 1; //S:62810   E:62826 D: 3BT: 0
            CodeNodeTest e =(CodeNodeTest)parent.children.get(childNum); //S:62836   E:62889 D: 3BT: 0
            for(int k = childNum;k<parent.children.size()- 1;k ++) //S:62899   E:63074 D: 3BT: 0
            {
               CodeNodeTest f =(CodeNodeTest)parent.children.get(k + 1); //S:62977   E:63027 D: 4BT: 0
               prodPrev *= f.nPaths; //S:63038   E:63058 D: 4BT: 0
            }
             //S:63183   E:63568 D: 3BT: 7
            if(childNum == parent.children.size()- 1) //S:63184   E:63404 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:63326   E:0 D: 4BT: 0
               e.currPath = parent.currPath; //S:63326   E:63354 D: 4BT: 0
               childNum = 0; //S:63365   E:63377 D: 4BT: 0
            }
            else //S:63405   E:63568 D: 3BT: 2
            {
               e.currPath = parent.currPath / prodPrev; //S:63460   E:63499 D: 4BT: 0
               parent.currPath %= prodPrev; //S:63510   E:63537 D: 4BT: 0
               childNum ++; //S:63548   E:63558 D: 4BT: 0
            }
         }
         for(int j = startLevel;j<endLevel;j ++) //S:63812   E:64286 D: 2BT: 0
         {
            CodeNodeTest d =(CodeNodeTest)path.get(j); //S:63872   E:63907 D: 3BT: 0
            int sum = 0; //S:63917   E:63928 D: 3BT: 0
            for(int k = d.children.size()- 1;k>= 0;k --) //S:63938   E:64277 D: 3BT: 0
            {
               CodeNodeTest e =(CodeNodeTest)d.children.get(k); //S:64005   E:64046 D: 4BT: 0
               sum += e.nPaths; //S:64057   E:64072 D: 4BT: 0
                //S:64082   E:64267 D: 4BT: 7
               if(d.currPath<sum) //S:64083   E:64267 D: 4BT: 1
               {
                  QuicktestRunner.execPath += 1; //S:64124   E:0 D: 5BT: 0
                  path.add(e); //S:64124   E:64135 D: 5BT: 0
                  e.currPath = d.currPath - sum + e.nPaths; //S:64146   E:64186 D: 5BT: 0
                  break; //S:64251   E:64256 D: 5BT: 0
               }
            }
         }
         startLevel = endLevel; //S:64295   E:64316 D: 2BT: 0
         endLevel = path.size(); //S:64325   E:64347 D: 2BT: 0
      }
      rtnVal[rtnVal.length - 1 - i]= buildString(path , 0 ,(CodeNodeTest)path.get(0)); //S:64614   E:64690 D: 1BT: 0
   }
   return rtnVal; //S:64809   E:64822 D: 0BT: 0
   }

   public void printPath()
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
int i = 0; {S:64879 E:64888 D:0 BT: 0}
while(true){} {S:64896 E:65222 D:0 BT: 0}
<sublist>
CodeNodeTest lst[]= this.levelTraverse(i); {S:64923 E:64961 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
int i = 0; {S:64879 E:64888 D:0 BT: 0}
while(true){} {S:64896 E:65222 D:0 BT: 0}
<sublist>
CodeNodeTest lst[]= this.levelTraverse(i); {S:64923 E:64961 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:64969 E:65214 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:64969 E:65214 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(lst.length == 0)else{} {S:64970 E:65018 D:1 BT: 1}
break; {S:64998 E:65003 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(lst.length == 0){} {S:64970 E:65018 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:64998 E:0 D:2 BT: 0}
break; {S:64998 E:65003 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:65019 E:65214 D:1 BT: 2}
for(int j = 0;j<lst.length;j ++){} {S:65034 E:65160 D:1 BT: 0}
<sublist>
System.out.print(lst[j].currPath + "/" + lst[j].nPaths + "|"); {S:65089 E:65150 D:2 BT: 0}
</sublist>
System.out.println(""); {S:65170 E:65192 D:1 BT: 0}
i ++; {S:65202 E:65205 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:65019 E:65214 D:1 BT: 2}
for(int j = 0;j<lst.length;j ++){} {S:65034 E:65160 D:2 BT: 0}
<sublist>
System.out.print(lst[j].currPath + "/" + lst[j].nPaths + "|"); {S:65089 E:65150 D:3 BT: 0}
</sublist>
System.out.println(""); {S:65170 E:65192 D:2 BT: 0}
i ++; {S:65202 E:65205 D:2 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int i = 0; {S:64879 E:64888 D:0 BT: 0}
while(true){} {S:64896 E:65222 D:0 BT: 0}
<sublist>
CodeNodeTest lst[]= this.levelTraverse(i); {S:64923 E:64961 D:1 BT: 0}
</sublist>
CodeNodeTest lst[]= this.levelTraverse(i); {S:64923 E:64961 D:1 BT: 0}
 {S:64969 E:65214 D:1 BT: 7}
if(lst.length == 0){} {S:64970 E:65018 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:64998 E:0 D:2 BT: 0}
break; {S:64998 E:65003 D:2 BT: 0}
else{} {S:65019 E:65214 D:1 BT: 2}
for(int j = 0;j<lst.length;j ++){} {S:65034 E:65160 D:2 BT: 0}
<sublist>
System.out.print(lst[j].currPath + "/" + lst[j].nPaths + "|"); {S:65089 E:65150 D:3 BT: 0}
</sublist>
System.out.print(lst[j].currPath + "/" + lst[j].nPaths + "|"); {S:65089 E:65150 D:3 BT: 0}
System.out.println(""); {S:65170 E:65192 D:2 BT: 0}
i ++; {S:65202 E:65205 D:2 BT: 0}
****************************/
   int i = 0; //S:64879   E:64888 D: 0BT: 0
   while(true) //S:64896   E:65222 D: 0BT: 0
   {
      CodeNodeTest lst[]= this.levelTraverse(i); //S:64923   E:64961 D: 1BT: 0
       //S:64969   E:65214 D: 1BT: 7
      if(lst.length == 0) //S:64970   E:65018 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:64998   E:0 D: 2BT: 0
         break; //S:64998   E:65003 D: 2BT: 0
      }
      else //S:65019   E:65214 D: 1BT: 2
      {
         for(int j = 0;j<lst.length;j ++) //S:65034   E:65160 D: 2BT: 0
         {
            System.out.print(lst[j].currPath + "/" + lst[j].nPaths + "|"); //S:65089   E:65150 D: 3BT: 0
         }
         System.out.println(""); //S:65170   E:65192 D: 2BT: 0
         i ++; //S:65202   E:65205 D: 2BT: 0
      }
   }
   }

public void printPathTest_0()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   printPath();
   //Post-test

}

public void printPathTest_1()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   printPath();
   //Post-test

}

   private String buildString(LinkedList codePath, int parent, CodeNodeTest parNode)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:12 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:65329 E:65347 D:0 BT: 0}
String[]all = parNode.code.split("\n"); {S:65380 E:65419 D:0 BT: 0}
int i = 0; {S:65427 E:65436 D:0 BT: 0}
int line = 0; {S:65444 E:65456 D:0 BT: 0}
while(true){} {S:65471 E:66047 D:0 BT: 0}
<sublist>
boolean found = false; {S:65498 E:65519 D:1 BT: 0}
for(int j = 0;j<codePath.size();j ++){} {S:65528 E:65890 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)codePath.get(j); {S:65586 E:65625 D:2 BT: 0}
</sublist>
line ++; {S:66033 E:66039 D:1 BT: 0}
</sublist>
return rtnVal; {S:66055 E:66068 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:65329 E:65347 D:0 BT: 0}
String[]all = parNode.code.split("\n"); {S:65380 E:65419 D:0 BT: 0}
int i = 0; {S:65427 E:65436 D:0 BT: 0}
int line = 0; {S:65444 E:65456 D:0 BT: 0}
while(true){} {S:65471 E:66047 D:0 BT: 0}
<sublist>
boolean found = false; {S:65498 E:65519 D:1 BT: 0}
for(int j = 0;j<codePath.size();j ++){} {S:65528 E:65890 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)codePath.get(j); {S:65586 E:65625 D:2 BT: 0}
</sublist>
line ++; {S:66033 E:66039 D:1 BT: 0}
</sublist>
return rtnVal; {S:66055 E:66068 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:65634 E:65669 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:65634 E:65669 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:65678 E:65872 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:65678 E:65872 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:65898 E:66024 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:65898 E:66024 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:6
/***************************
Processing list:
if(d == parNode) {S:65635 E:65669 D:2 BT: 1}
continue; {S:65661 E:65669 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(d == parNode){} {S:65635 E:65669 D:2 BT: 1}
QuicktestRunner.execPath += 6; {S:65661 E:0 D:3 BT: 0}
continue; {S:65661 E:65669 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(d.parentLine == parNode.absLineNo && d.relLineNo == line && d.blockType != - 1){} {S:65679 E:65872 D:2 BT: 1}
found = true; {S:65780 E:65792 D:3 BT: 0}
rtnVal += buildString(codePath , line , d); {S:65806 E:65846 D:3 BT: 0}
break; {S:65857 E:65862 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(d.parentLine == parNode.absLineNo && d.relLineNo == line && d.blockType != - 1){} {S:65679 E:65872 D:2 BT: 1}
QuicktestRunner.execPath += 3; {S:65780 E:0 D:3 BT: 0}
found = true; {S:65780 E:65792 D:3 BT: 0}
rtnVal += buildString(codePath , line , d); {S:65806 E:65846 D:3 BT: 0}
break; {S:65857 E:65862 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#8(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#9(4) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(found == false){} {S:65899 E:66024 D:1 BT: 1}
rtnVal += all[i]+ "\n"; {S:65935 E:65958 D:2 BT: 0}
i ++; {S:65968 E:65971 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(found == false){} {S:65899 E:66024 D:1 BT: 1}
rtnVal += all[i]+ "\n"; {S:65935 E:65958 D:2 BT: 0}
i ++; {S:65968 E:65971 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(9) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:65980 E:66015 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:65980 E:66015 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#12(11) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(i == all.length) {S:65981 E:66015 D:2 BT: 1}
break; {S:66010 E:66015 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(i == all.length){} {S:65981 E:66015 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:66010 E:0 D:3 BT: 0}
break; {S:66010 E:66015 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#13(11) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:66015 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:66016 E:0 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:65329 E:65347 D:0 BT: 0}
String[]all = parNode.code.split("\n"); {S:65380 E:65419 D:0 BT: 0}
int i = 0; {S:65427 E:65436 D:0 BT: 0}
int line = 0; {S:65444 E:65456 D:0 BT: 0}
while(true){} {S:65471 E:66047 D:0 BT: 0}
<sublist>
boolean found = false; {S:65498 E:65519 D:1 BT: 0}
for(int j = 0;j<codePath.size();j ++){} {S:65528 E:65890 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)codePath.get(j); {S:65586 E:65625 D:2 BT: 0}
</sublist>
line ++; {S:66033 E:66039 D:1 BT: 0}
</sublist>
boolean found = false; {S:65498 E:65519 D:1 BT: 0}
for(int j = 0;j<codePath.size();j ++){} {S:65528 E:65890 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)codePath.get(j); {S:65586 E:65625 D:2 BT: 0}
</sublist>
CodeNodeTest d =(CodeNodeTest)codePath.get(j); {S:65586 E:65625 D:2 BT: 0}
 {S:65634 E:65669 D:2 BT: 7}
if(d == parNode){} {S:65635 E:65669 D:2 BT: 1}
QuicktestRunner.execPath += 6; {S:65661 E:0 D:3 BT: 0}
continue; {S:65661 E:65669 D:3 BT: 0}
 {S:65678 E:65872 D:2 BT: 7}
if(d.parentLine == parNode.absLineNo && d.relLineNo == line && d.blockType != - 1){} {S:65679 E:65872 D:2 BT: 1}
QuicktestRunner.execPath += 3; {S:65780 E:0 D:3 BT: 0}
found = true; {S:65780 E:65792 D:3 BT: 0}
rtnVal += buildString(codePath , line , d); {S:65806 E:65846 D:3 BT: 0}
break; {S:65857 E:65862 D:3 BT: 0}
 {S:65898 E:66024 D:1 BT: 7}
if(found == false){} {S:65899 E:66024 D:1 BT: 1}
rtnVal += all[i]+ "\n"; {S:65935 E:65958 D:2 BT: 0}
i ++; {S:65968 E:65971 D:2 BT: 0}
 {S:65980 E:66015 D:2 BT: 7}
if(i == all.length){} {S:65981 E:66015 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:66010 E:0 D:3 BT: 0}
break; {S:66010 E:66015 D:3 BT: 0}
else {S:66015 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:66016 E:0 D:3 BT: 0}
line ++; {S:66033 E:66039 D:1 BT: 0}
return rtnVal; {S:66055 E:66068 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:65329   E:65347 D: 0BT: 0
   String[]all = parNode.code.split("\n"); //S:65380   E:65419 D: 0BT: 0
   int i = 0; //S:65427   E:65436 D: 0BT: 0
   int line = 0; //S:65444   E:65456 D: 0BT: 0
   while(true) //S:65471   E:66047 D: 0BT: 0
   {
      boolean found = false; //S:65498   E:65519 D: 1BT: 0
      for(int j = 0;j<codePath.size();j ++) //S:65528   E:65890 D: 1BT: 0
      {
         CodeNodeTest d =(CodeNodeTest)codePath.get(j); //S:65586   E:65625 D: 2BT: 0
          //S:65634   E:65669 D: 2BT: 7
         if(d == parNode) //S:65635   E:65669 D: 2BT: 1
         {
            QuicktestRunner.execPath += 6; //S:65661   E:0 D: 3BT: 0
            continue; //S:65661   E:65669 D: 3BT: 0
         }
          //S:65678   E:65872 D: 2BT: 7
         if(d.parentLine == parNode.absLineNo && d.relLineNo == line && d.blockType != - 1) //S:65679   E:65872 D: 2BT: 1
         {
            QuicktestRunner.execPath += 3; //S:65780   E:0 D: 3BT: 0
            found = true; //S:65780   E:65792 D: 3BT: 0
            rtnVal += buildString(codePath , line , d); //S:65806   E:65846 D: 3BT: 0
            break; //S:65857   E:65862 D: 3BT: 0
         }
      }
       //S:65898   E:66024 D: 1BT: 7
      if(found == false) //S:65899   E:66024 D: 1BT: 1
      {
         rtnVal += all[i]+ "\n"; //S:65935   E:65958 D: 2BT: 0
         i ++; //S:65968   E:65971 D: 2BT: 0
          //S:65980   E:66015 D: 2BT: 7
         if(i == all.length) //S:65981   E:66015 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:66010   E:0 D: 3BT: 0
            break; //S:66010   E:66015 D: 3BT: 0
         }
         else //S:66015   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 1; //S:66016   E:0 D: 3BT: 0
         }
      }
      line ++; //S:66033   E:66039 D: 1BT: 0
   }
   return rtnVal; //S:66055   E:66068 D: 0BT: 0
   }

   private int sumLeaves(CodeNodeTest c)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:6 CP:0
/***************************
Processing list:
int sum = 0; {S:66131 E:66142 D:0 BT: 0}
for(int i = 0;i<c.children.size();i ++){} {S:66150 E:66278 D:0 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)c.children.get(i); {S:66208 E:66249 D:1 BT: 0}
sumLeaves(d); {S:66258 E:66270 D:1 BT: 0}
</sublist>
for(int i = 0;i<c.children.size();i ++){} {S:66286 E:66541 D:0 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)c.children.get(i); {S:66344 E:66385 D:1 BT: 0}
</sublist>
c.nPaths = sum; {S:66584 E:66598 D:0 BT: 0}
return sum; {S:66606 E:66616 D:0 BT: 0}
****************************/
/***************************
Processing list:
int sum = 0; {S:66131 E:66142 D:0 BT: 0}
for(int i = 0;i<c.children.size();i ++){} {S:66150 E:66278 D:0 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)c.children.get(i); {S:66208 E:66249 D:1 BT: 0}
sumLeaves(d); {S:66258 E:66270 D:1 BT: 0}
</sublist>
for(int i = 0;i<c.children.size();i ++){} {S:66286 E:66541 D:0 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)c.children.get(i); {S:66344 E:66385 D:1 BT: 0}
</sublist>
c.nPaths = sum; {S:66584 E:66598 D:0 BT: 0}
return sum; {S:66606 E:66616 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:66393 E:66533 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:66393 E:66533 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:66548 E:66576 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:66548 E:66576 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(d.blockType == - 1){ {S:66394 E:66512 D:1 BT: 1}
sum *= d.nPaths; {S:66472 E:66487 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(d.blockType == - 1){} {S:66394 E:66512 D:1 BT: 1}
sum *= d.nPaths; {S:66472 E:66487 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:66513 E:66533 D:1 BT: 2}
sum += d.nPaths; {S:66518 E:66533 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:66513 E:66533 D:1 BT: 2}
sum += d.nPaths; {S:66518 E:66533 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(sum == 0) {S:66549 E:66576 D:0 BT: 1}
sum = 1; {S:66569 E:66576 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(sum == 0){} {S:66549 E:66576 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:66569 E:0 D:1 BT: 0}
sum = 1; {S:66569 E:66576 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(4) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:66432 E:66462 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:66432 E:66462 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#9(8) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(sum == 0) {S:66433 E:66462 D:2 BT: 1}
sum = 1; {S:66455 E:66462 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(sum == 0){} {S:66433 E:66462 D:2 BT: 1}
QuicktestRunner.execPath += 4; {S:66455 E:0 D:3 BT: 0}
sum = 1; {S:66455 E:66462 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#10(8) Type:2 Paths:1 CP:2

/***************************
Processing list:
else {S:66462 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 2; {S:66463 E:0 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int sum = 0; {S:66131 E:66142 D:0 BT: 0}
for(int i = 0;i<c.children.size();i ++){} {S:66150 E:66278 D:0 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)c.children.get(i); {S:66208 E:66249 D:1 BT: 0}
sumLeaves(d); {S:66258 E:66270 D:1 BT: 0}
</sublist>
CodeNodeTest d =(CodeNodeTest)c.children.get(i); {S:66208 E:66249 D:1 BT: 0}
sumLeaves(d); {S:66258 E:66270 D:1 BT: 0}
for(int i = 0;i<c.children.size();i ++){} {S:66286 E:66541 D:0 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)c.children.get(i); {S:66344 E:66385 D:1 BT: 0}
</sublist>
CodeNodeTest d =(CodeNodeTest)c.children.get(i); {S:66344 E:66385 D:1 BT: 0}
 {S:66393 E:66533 D:1 BT: 7}
if(d.blockType == - 1){} {S:66394 E:66512 D:1 BT: 1}
 {S:66432 E:66462 D:2 BT: 7}
if(sum == 0){} {S:66433 E:66462 D:2 BT: 1}
QuicktestRunner.execPath += 4; {S:66455 E:0 D:3 BT: 0}
sum = 1; {S:66455 E:66462 D:3 BT: 0}
else {S:66462 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 2; {S:66463 E:0 D:3 BT: 0}
sum *= d.nPaths; {S:66472 E:66487 D:2 BT: 0}
else{} {S:66513 E:66533 D:1 BT: 2}
sum += d.nPaths; {S:66518 E:66533 D:2 BT: 0}
 {S:66548 E:66576 D:0 BT: 7}
if(sum == 0){} {S:66549 E:66576 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:66569 E:0 D:1 BT: 0}
sum = 1; {S:66569 E:66576 D:1 BT: 0}
c.nPaths = sum; {S:66584 E:66598 D:0 BT: 0}
return sum; {S:66606 E:66616 D:0 BT: 0}
****************************/
   int sum = 0; //S:66131   E:66142 D: 0BT: 0
   for(int i = 0;i<c.children.size();i ++) //S:66150   E:66278 D: 0BT: 0
   {
      CodeNodeTest d =(CodeNodeTest)c.children.get(i); //S:66208   E:66249 D: 1BT: 0
      sumLeaves(d); //S:66258   E:66270 D: 1BT: 0
   }
   for(int i = 0;i<c.children.size();i ++) //S:66286   E:66541 D: 0BT: 0
   {
      CodeNodeTest d =(CodeNodeTest)c.children.get(i); //S:66344   E:66385 D: 1BT: 0
       //S:66393   E:66533 D: 1BT: 7
      if(d.blockType == - 1) //S:66394   E:66512 D: 1BT: 1
      {
          //S:66432   E:66462 D: 2BT: 7
         if(sum == 0) //S:66433   E:66462 D: 2BT: 1
         {
            QuicktestRunner.execPath += 4; //S:66455   E:0 D: 3BT: 0
            sum = 1; //S:66455   E:66462 D: 3BT: 0
         }
         else //S:66462   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 2; //S:66463   E:0 D: 3BT: 0
         }
         sum *= d.nPaths; //S:66472   E:66487 D: 2BT: 0
      }
      else //S:66513   E:66533 D: 1BT: 2
      {
         sum += d.nPaths; //S:66518   E:66533 D: 2BT: 0
      }
   }
    //S:66548   E:66576 D: 0BT: 7
   if(sum == 0) //S:66549   E:66576 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:66569   E:0 D: 1BT: 0
      sum = 1; //S:66569   E:66576 D: 1BT: 0
   }
   c.nPaths = sum; //S:66584   E:66598 D: 0BT: 0
   return sum; //S:66606   E:66616 D: 0BT: 0
   }

   private CodeNodeTest[] levelTraverse(int level)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
int i = 0; {S:66689 E:66698 D:0 BT: 0}
int j = 0; {S:66706 E:66715 D:0 BT: 0}
LinkedList list = new LinkedList(); {S:66723 E:66757 D:0 BT: 0}
list.add(root); {S:66765 E:66779 D:0 BT: 0}
while(i<level || level == - 1){} {S:66787 E:67050 D:0 BT: 0}
<sublist>
int k = list.size(); {S:66834 E:66853 D:1 BT: 0}
for(int l = j;l<k;l ++){} {S:66895 E:67016 D:1 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)list.get(l); {S:66939 E:66974 D:2 BT: 0}
list.addAll(n.children); {S:66984 E:67007 D:2 BT: 0}
</sublist>
j = k; {S:67025 E:67030 D:1 BT: 0}
i ++; {S:67039 E:67042 D:1 BT: 0}
</sublist>
int k = 0; {S:67058 E:67067 D:0 BT: 0}
i = 0; {S:67136 E:67141 D:0 BT: 0}
CodeNodeTest arr[]= new CodeNodeTest[list.size()- k]; {S:67149 E:67195 D:0 BT: 0}
while(k<list.size()){} {S:67203 E:67304 D:0 BT: 0}
<sublist>
arr[i]=(CodeNodeTest)list.get(k); {S:67241 E:67272 D:1 BT: 0}
i ++; {S:67281 E:67284 D:1 BT: 0}
k ++; {S:67293 E:67296 D:1 BT: 0}
</sublist>
return arr; {S:67312 E:67322 D:0 BT: 0}
****************************/
/***************************
Processing list:
int i = 0; {S:66689 E:66698 D:0 BT: 0}
int j = 0; {S:66706 E:66715 D:0 BT: 0}
LinkedList list = new LinkedList(); {S:66723 E:66757 D:0 BT: 0}
list.add(root); {S:66765 E:66779 D:0 BT: 0}
while(i<level || level == - 1){} {S:66787 E:67050 D:0 BT: 0}
<sublist>
int k = list.size(); {S:66834 E:66853 D:1 BT: 0}
for(int l = j;l<k;l ++){} {S:66895 E:67016 D:1 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)list.get(l); {S:66939 E:66974 D:2 BT: 0}
list.addAll(n.children); {S:66984 E:67007 D:2 BT: 0}
</sublist>
j = k; {S:67025 E:67030 D:1 BT: 0}
i ++; {S:67039 E:67042 D:1 BT: 0}
</sublist>
int k = 0; {S:67058 E:67067 D:0 BT: 0}
i = 0; {S:67136 E:67141 D:0 BT: 0}
CodeNodeTest arr[]= new CodeNodeTest[list.size()- k]; {S:67149 E:67195 D:0 BT: 0}
while(k<list.size()){} {S:67203 E:67304 D:0 BT: 0}
<sublist>
arr[i]=(CodeNodeTest)list.get(k); {S:67241 E:67272 D:1 BT: 0}
i ++; {S:67281 E:67284 D:1 BT: 0}
k ++; {S:67293 E:67296 D:1 BT: 0}
</sublist>
return arr; {S:67312 E:67322 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:66861 E:66886 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:66861 E:66886 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:67074 E:67128 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:67074 E:67128 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(j == k) {S:66862 E:66886 D:1 BT: 1}
break; {S:66881 E:66886 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(j == k){} {S:66862 E:66886 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:66881 E:0 D:2 BT: 0}
break; {S:66881 E:66886 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(level == - 1)else k = j; {S:67075 E:67117 D:0 BT: 1}
k = 0; {S:67098 E:67103 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(level == - 1){} {S:67075 E:67117 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:67098 E:0 D:1 BT: 0}
k = 0; {S:67098 E:67103 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:67118 E:67128 D:0 BT: 2}
k = j; {S:67123 E:67128 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:67118 E:67128 D:0 BT: 2}
k = j; {S:67123 E:67128 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int i = 0; {S:66689 E:66698 D:0 BT: 0}
int j = 0; {S:66706 E:66715 D:0 BT: 0}
LinkedList list = new LinkedList(); {S:66723 E:66757 D:0 BT: 0}
list.add(root); {S:66765 E:66779 D:0 BT: 0}
while(i<level || level == - 1){} {S:66787 E:67050 D:0 BT: 0}
<sublist>
int k = list.size(); {S:66834 E:66853 D:1 BT: 0}
for(int l = j;l<k;l ++){} {S:66895 E:67016 D:1 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)list.get(l); {S:66939 E:66974 D:2 BT: 0}
list.addAll(n.children); {S:66984 E:67007 D:2 BT: 0}
</sublist>
j = k; {S:67025 E:67030 D:1 BT: 0}
i ++; {S:67039 E:67042 D:1 BT: 0}
</sublist>
int k = list.size(); {S:66834 E:66853 D:1 BT: 0}
 {S:66861 E:66886 D:1 BT: 7}
if(j == k){} {S:66862 E:66886 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:66881 E:0 D:2 BT: 0}
break; {S:66881 E:66886 D:2 BT: 0}
for(int l = j;l<k;l ++){} {S:66895 E:67016 D:1 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)list.get(l); {S:66939 E:66974 D:2 BT: 0}
list.addAll(n.children); {S:66984 E:67007 D:2 BT: 0}
</sublist>
CodeNodeTest n =(CodeNodeTest)list.get(l); {S:66939 E:66974 D:2 BT: 0}
list.addAll(n.children); {S:66984 E:67007 D:2 BT: 0}
j = k; {S:67025 E:67030 D:1 BT: 0}
i ++; {S:67039 E:67042 D:1 BT: 0}
int k = 0; {S:67058 E:67067 D:0 BT: 0}
 {S:67074 E:67128 D:0 BT: 7}
if(level == - 1){} {S:67075 E:67117 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:67098 E:0 D:1 BT: 0}
k = 0; {S:67098 E:67103 D:1 BT: 0}
else{} {S:67118 E:67128 D:0 BT: 2}
k = j; {S:67123 E:67128 D:1 BT: 0}
i = 0; {S:67136 E:67141 D:0 BT: 0}
CodeNodeTest arr[]= new CodeNodeTest[list.size()- k]; {S:67149 E:67195 D:0 BT: 0}
while(k<list.size()){} {S:67203 E:67304 D:0 BT: 0}
<sublist>
arr[i]=(CodeNodeTest)list.get(k); {S:67241 E:67272 D:1 BT: 0}
i ++; {S:67281 E:67284 D:1 BT: 0}
k ++; {S:67293 E:67296 D:1 BT: 0}
</sublist>
arr[i]=(CodeNodeTest)list.get(k); {S:67241 E:67272 D:1 BT: 0}
i ++; {S:67281 E:67284 D:1 BT: 0}
k ++; {S:67293 E:67296 D:1 BT: 0}
return arr; {S:67312 E:67322 D:0 BT: 0}
****************************/
   int i = 0; //S:66689   E:66698 D: 0BT: 0
   int j = 0; //S:66706   E:66715 D: 0BT: 0
   LinkedList list = new LinkedList(); //S:66723   E:66757 D: 0BT: 0
   list.add(root); //S:66765   E:66779 D: 0BT: 0
   while(i<level || level == - 1) //S:66787   E:67050 D: 0BT: 0
   {
      int k = list.size(); //S:66834   E:66853 D: 1BT: 0
       //S:66861   E:66886 D: 1BT: 7
      if(j == k) //S:66862   E:66886 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:66881   E:0 D: 2BT: 0
         break; //S:66881   E:66886 D: 2BT: 0
      }
      for(int l = j;l<k;l ++) //S:66895   E:67016 D: 1BT: 0
      {
         CodeNodeTest n =(CodeNodeTest)list.get(l); //S:66939   E:66974 D: 2BT: 0
         list.addAll(n.children); //S:66984   E:67007 D: 2BT: 0
      }
      j = k; //S:67025   E:67030 D: 1BT: 0
      i ++; //S:67039   E:67042 D: 1BT: 0
   }
   int k = 0; //S:67058   E:67067 D: 0BT: 0
    //S:67074   E:67128 D: 0BT: 7
   if(level == - 1) //S:67075   E:67117 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:67098   E:0 D: 1BT: 0
      k = 0; //S:67098   E:67103 D: 1BT: 0
   }
   else //S:67118   E:67128 D: 0BT: 2
   {
      k = j; //S:67123   E:67128 D: 1BT: 0
   }
   i = 0; //S:67136   E:67141 D: 0BT: 0
   CodeNodeTest arr[]= new CodeNodeTest[list.size()- k]; //S:67149   E:67195 D: 0BT: 0
   while(k<list.size()) //S:67203   E:67304 D: 0BT: 0
   {
      arr[i]=(CodeNodeTest)list.get(k); //S:67241   E:67272 D: 1BT: 0
      i ++; //S:67281   E:67284 D: 1BT: 0
      k ++; //S:67293   E:67296 D: 1BT: 0
   }
   return arr; //S:67312   E:67322 D: 0BT: 0
   }

   private String printTree(int debug)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
int i = 0; {S:67387 E:67396 D:0 BT: 0}
String rtnVal = "//The Function Tree:\n"; {S:67404 E:67444 D:0 BT: 0}
while(true){} {S:67454 E:68054 D:0 BT: 0}
<sublist>
CodeNodeTest[]arr = levelTraverse(i); {S:67484 E:67517 D:1 BT: 0}
i ++; {S:67527 E:67530 D:1 BT: 0}
for(int j = 0;j<arr.length;j ++){} {S:67584 E:67970 D:1 BT: 0}
<sublist>
rtnVal +=("//=======================================\n"); {S:67639 E:67696 D:2 BT: 0}
rtnVal +=("//=======================================\n"); {S:67903 E:67960 D:2 BT: 0}
</sublist>
rtnVal +=("//############ End of level ####################\n"); {S:67980 E:68044 D:1 BT: 0}
</sublist>
rtnVal +=("//(((((((((( End of Tree )))))))))))))\n"); {S:68064 E:68118 D:0 BT: 0}
return rtnVal; {S:68128 E:68141 D:0 BT: 0}
****************************/
/***************************
Processing list:
int i = 0; {S:67387 E:67396 D:0 BT: 0}
String rtnVal = "//The Function Tree:\n"; {S:67404 E:67444 D:0 BT: 0}
while(true){} {S:67454 E:68054 D:0 BT: 0}
<sublist>
CodeNodeTest[]arr = levelTraverse(i); {S:67484 E:67517 D:1 BT: 0}
i ++; {S:67527 E:67530 D:1 BT: 0}
for(int j = 0;j<arr.length;j ++){} {S:67584 E:67970 D:1 BT: 0}
<sublist>
rtnVal +=("//=======================================\n"); {S:67639 E:67696 D:2 BT: 0}
rtnVal +=("//=======================================\n"); {S:67903 E:67960 D:2 BT: 0}
</sublist>
rtnVal +=("//############ End of level ####################\n"); {S:67980 E:68044 D:1 BT: 0}
</sublist>
rtnVal +=("//(((((((((( End of Tree )))))))))))))\n"); {S:68064 E:68118 D:0 BT: 0}
return rtnVal; {S:68128 E:68141 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:67539 E:67574 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:67539 E:67574 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:67706 E:67892 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:67706 E:67892 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(arr.length == 0) {S:67540 E:67574 D:1 BT: 1}
break; {S:67569 E:67574 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(arr.length == 0){} {S:67540 E:67574 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:67569 E:0 D:2 BT: 0}
break; {S:67569 E:67574 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(debug == 0)else{} {S:67707 E:67780 D:2 BT: 1}
rtnVal +=(arr[j].toString()); {S:67732 E:67761 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(debug == 0){} {S:67707 E:67780 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:67732 E:0 D:3 BT: 0}
rtnVal +=(arr[j].toString()); {S:67732 E:67761 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:67781 E:67892 D:2 BT: 2}
rtnVal += arr[j].toString(); {S:67798 E:67825 D:2 BT: 0}
rtnVal += getQTCode(arr[j]).getCommentList(); {S:67837 E:67881 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:67781 E:67892 D:2 BT: 2}
rtnVal += arr[j].toString(); {S:67798 E:67825 D:3 BT: 0}
rtnVal += getQTCode(arr[j]).getCommentList(); {S:67837 E:67881 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int i = 0; {S:67387 E:67396 D:0 BT: 0}
String rtnVal = "//The Function Tree:\n"; {S:67404 E:67444 D:0 BT: 0}
while(true){} {S:67454 E:68054 D:0 BT: 0}
<sublist>
CodeNodeTest[]arr = levelTraverse(i); {S:67484 E:67517 D:1 BT: 0}
i ++; {S:67527 E:67530 D:1 BT: 0}
for(int j = 0;j<arr.length;j ++){} {S:67584 E:67970 D:1 BT: 0}
<sublist>
rtnVal +=("//=======================================\n"); {S:67639 E:67696 D:2 BT: 0}
rtnVal +=("//=======================================\n"); {S:67903 E:67960 D:2 BT: 0}
</sublist>
rtnVal +=("//############ End of level ####################\n"); {S:67980 E:68044 D:1 BT: 0}
</sublist>
CodeNodeTest[]arr = levelTraverse(i); {S:67484 E:67517 D:1 BT: 0}
i ++; {S:67527 E:67530 D:1 BT: 0}
 {S:67539 E:67574 D:1 BT: 7}
if(arr.length == 0){} {S:67540 E:67574 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:67569 E:0 D:2 BT: 0}
break; {S:67569 E:67574 D:2 BT: 0}
for(int j = 0;j<arr.length;j ++){} {S:67584 E:67970 D:1 BT: 0}
<sublist>
rtnVal +=("//=======================================\n"); {S:67639 E:67696 D:2 BT: 0}
rtnVal +=("//=======================================\n"); {S:67903 E:67960 D:2 BT: 0}
</sublist>
rtnVal +=("//=======================================\n"); {S:67639 E:67696 D:2 BT: 0}
 {S:67706 E:67892 D:2 BT: 7}
if(debug == 0){} {S:67707 E:67780 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:67732 E:0 D:3 BT: 0}
rtnVal +=(arr[j].toString()); {S:67732 E:67761 D:3 BT: 0}
else{} {S:67781 E:67892 D:2 BT: 2}
rtnVal += arr[j].toString(); {S:67798 E:67825 D:3 BT: 0}
rtnVal += getQTCode(arr[j]).getCommentList(); {S:67837 E:67881 D:3 BT: 0}
rtnVal +=("//=======================================\n"); {S:67903 E:67960 D:2 BT: 0}
rtnVal +=("//############ End of level ####################\n"); {S:67980 E:68044 D:1 BT: 0}
rtnVal +=("//(((((((((( End of Tree )))))))))))))\n"); {S:68064 E:68118 D:0 BT: 0}
return rtnVal; {S:68128 E:68141 D:0 BT: 0}
****************************/
   int i = 0; //S:67387   E:67396 D: 0BT: 0
   String rtnVal = "//The Function Tree:\n"; //S:67404   E:67444 D: 0BT: 0
   while(true) //S:67454   E:68054 D: 0BT: 0
   {
      CodeNodeTest[]arr = levelTraverse(i); //S:67484   E:67517 D: 1BT: 0
      i ++; //S:67527   E:67530 D: 1BT: 0
       //S:67539   E:67574 D: 1BT: 7
      if(arr.length == 0) //S:67540   E:67574 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:67569   E:0 D: 2BT: 0
         break; //S:67569   E:67574 D: 2BT: 0
      }
      for(int j = 0;j<arr.length;j ++) //S:67584   E:67970 D: 1BT: 0
      {
         rtnVal +=("//=======================================\n"); //S:67639   E:67696 D: 2BT: 0
          //S:67706   E:67892 D: 2BT: 7
         if(debug == 0) //S:67707   E:67780 D: 2BT: 1
         {
            QuicktestRunner.execPath += 1; //S:67732   E:0 D: 3BT: 0
            rtnVal +=(arr[j].toString()); //S:67732   E:67761 D: 3BT: 0
         }
         else //S:67781   E:67892 D: 2BT: 2
         {
            rtnVal += arr[j].toString(); //S:67798   E:67825 D: 3BT: 0
            rtnVal += getQTCode(arr[j]).getCommentList(); //S:67837   E:67881 D: 3BT: 0
         }
         rtnVal +=("//=======================================\n"); //S:67903   E:67960 D: 2BT: 0
      }
      rtnVal +=("//############ End of level ####################\n"); //S:67980   E:68044 D: 1BT: 0
   }
   rtnVal +=("//(((((((((( End of Tree )))))))))))))\n"); //S:68064   E:68118 D: 0BT: 0
   return rtnVal; //S:68128   E:68141 D: 0BT: 0
   }

   private String getTreeInfo()
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
int i = 0; {S:68203 E:68212 D:0 BT: 0}
String rtnVal = ""; {S:68220 E:68238 D:0 BT: 0}
while(true){} {S:68248 E:68670 D:0 BT: 0}
<sublist>
CodeNodeTest[]arr = levelTraverse(i); {S:68278 E:68311 D:1 BT: 0}
i ++; {S:68321 E:68324 D:1 BT: 0}
for(int j = 0;j<arr.length;j ++){} {S:68378 E:68636 D:1 BT: 0}
<sublist>
rtnVal += "[" + arr[j].getShortString()+ "]"; {S:68507 E:68552 D:2 BT: 0}
</sublist>
rtnVal += "\n"; {S:68646 E:68660 D:1 BT: 0}
</sublist>
return rtnVal; {S:68680 E:68693 D:0 BT: 0}
****************************/
/***************************
Processing list:
int i = 0; {S:68203 E:68212 D:0 BT: 0}
String rtnVal = ""; {S:68220 E:68238 D:0 BT: 0}
while(true){} {S:68248 E:68670 D:0 BT: 0}
<sublist>
CodeNodeTest[]arr = levelTraverse(i); {S:68278 E:68311 D:1 BT: 0}
i ++; {S:68321 E:68324 D:1 BT: 0}
for(int j = 0;j<arr.length;j ++){} {S:68378 E:68636 D:1 BT: 0}
<sublist>
rtnVal += "[" + arr[j].getShortString()+ "]"; {S:68507 E:68552 D:2 BT: 0}
</sublist>
rtnVal += "\n"; {S:68646 E:68660 D:1 BT: 0}
</sublist>
return rtnVal; {S:68680 E:68693 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:68333 E:68368 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:68333 E:68368 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(arr.length == 0) {S:68334 E:68368 D:1 BT: 1}
break; {S:68363 E:68368 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(arr.length == 0){} {S:68334 E:68368 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:68363 E:0 D:2 BT: 0}
break; {S:68363 E:68368 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int i = 0; {S:68203 E:68212 D:0 BT: 0}
String rtnVal = ""; {S:68220 E:68238 D:0 BT: 0}
while(true){} {S:68248 E:68670 D:0 BT: 0}
<sublist>
CodeNodeTest[]arr = levelTraverse(i); {S:68278 E:68311 D:1 BT: 0}
i ++; {S:68321 E:68324 D:1 BT: 0}
for(int j = 0;j<arr.length;j ++){} {S:68378 E:68636 D:1 BT: 0}
<sublist>
rtnVal += "[" + arr[j].getShortString()+ "]"; {S:68507 E:68552 D:2 BT: 0}
</sublist>
rtnVal += "\n"; {S:68646 E:68660 D:1 BT: 0}
</sublist>
CodeNodeTest[]arr = levelTraverse(i); {S:68278 E:68311 D:1 BT: 0}
i ++; {S:68321 E:68324 D:1 BT: 0}
 {S:68333 E:68368 D:1 BT: 7}
if(arr.length == 0){} {S:68334 E:68368 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:68363 E:0 D:2 BT: 0}
break; {S:68363 E:68368 D:2 BT: 0}
for(int j = 0;j<arr.length;j ++){} {S:68378 E:68636 D:1 BT: 0}
<sublist>
rtnVal += "[" + arr[j].getShortString()+ "]"; {S:68507 E:68552 D:2 BT: 0}
</sublist>
rtnVal += "[" + arr[j].getShortString()+ "]"; {S:68507 E:68552 D:2 BT: 0}
rtnVal += "\n"; {S:68646 E:68660 D:1 BT: 0}
return rtnVal; {S:68680 E:68693 D:0 BT: 0}
****************************/
   int i = 0; //S:68203   E:68212 D: 0BT: 0
   String rtnVal = ""; //S:68220   E:68238 D: 0BT: 0
   while(true) //S:68248   E:68670 D: 0BT: 0
   {
      CodeNodeTest[]arr = levelTraverse(i); //S:68278   E:68311 D: 1BT: 0
      i ++; //S:68321   E:68324 D: 1BT: 0
       //S:68333   E:68368 D: 1BT: 7
      if(arr.length == 0) //S:68334   E:68368 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:68363   E:0 D: 2BT: 0
         break; //S:68363   E:68368 D: 2BT: 0
      }
      for(int j = 0;j<arr.length;j ++) //S:68378   E:68636 D: 1BT: 0
      {
         rtnVal += "[" + arr[j].getShortString()+ "]"; //S:68507   E:68552 D: 2BT: 0
      }
      rtnVal += "\n"; //S:68646   E:68660 D: 1BT: 0
   }
   return rtnVal; //S:68680   E:68693 D: 0BT: 0
   }

   public String getQuicktest()
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
root.currPath = 1; {S:69399 E:69416 D:0 BT: 0}
calcBranchPath(root); {S:69424 E:69444 D:0 BT: 0}
calcLeaves(); {S:69537 E:69549 D:0 BT: 0}
String rtnVal = ""; {S:69600 E:69635 D:0 BT: 0}
LinkedList ll = gatherAllNodes(false); {S:69643 E:69680 D:0 BT: 0}
LineListTest allLines = gatherQTCode(ll); {S:69688 E:69724 D:0 BT: 0}
rtnVal += printTree(1)+ allLines.outputWTDepth("   " , false); {S:69808 E:69869 D:0 BT: 0}
return rtnVal; {S:69877 E:69890 D:0 BT: 0}
****************************/
/***************************
Processing list:
root.currPath = 1; {S:69399 E:69416 D:0 BT: 0}
calcBranchPath(root); {S:69424 E:69444 D:0 BT: 0}
calcLeaves(); {S:69537 E:69549 D:0 BT: 0}
String rtnVal = ""; {S:69600 E:69635 D:0 BT: 0}
LinkedList ll = gatherAllNodes(false); {S:69643 E:69680 D:0 BT: 0}
LineListTest allLines = gatherQTCode(ll); {S:69688 E:69724 D:0 BT: 0}
rtnVal += printTree(1)+ allLines.outputWTDepth("   " , false); {S:69808 E:69869 D:0 BT: 0}
return rtnVal; {S:69877 E:69890 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
root.currPath = 1; {S:69399 E:69416 D:0 BT: 0}
calcBranchPath(root); {S:69424 E:69444 D:0 BT: 0}
calcLeaves(); {S:69537 E:69549 D:0 BT: 0}
String rtnVal = ""; {S:69600 E:69635 D:0 BT: 0}
LinkedList ll = gatherAllNodes(false); {S:69643 E:69680 D:0 BT: 0}
LineListTest allLines = gatherQTCode(ll); {S:69688 E:69724 D:0 BT: 0}
rtnVal += printTree(1)+ allLines.outputWTDepth("   " , false); {S:69808 E:69869 D:0 BT: 0}
return rtnVal; {S:69877 E:69890 D:0 BT: 0}
****************************/
   root.currPath = 1; //S:69399   E:69416 D: 0BT: 0
   calcBranchPath(root); //S:69424   E:69444 D: 0BT: 0
   calcLeaves(); //S:69537   E:69549 D: 0BT: 0
   String rtnVal = ""; //S:69600   E:69635 D: 0BT: 0
   LinkedList ll = gatherAllNodes(false); //S:69643   E:69680 D: 0BT: 0
   LineListTest allLines = gatherQTCode(ll); //S:69688   E:69724 D: 0BT: 0
   rtnVal += printTree(1)+ allLines.outputWTDepth("   " , false); //S:69808   E:69869 D: 0BT: 0
   return rtnVal; //S:69877   E:69890 D: 0BT: 0
   }

   private LinkedList gatherAllNodes(boolean debugPrint)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:64 CP:0
/***************************
Processing list:
LinkedList all = new LinkedList(); {S:70051 E:70084 D:0 BT: 0}
all.push(root); {S:70092 E:70106 D:0 BT: 0}
int startLevel = 0; {S:70177 E:70195 D:0 BT: 0}
int endLevel = 1; {S:70203 E:70219 D:0 BT: 0}
while(startLevel != endLevel){} {S:70227 E:70773 D:0 BT: 0}
<sublist>
for(int i = startLevel;i<endLevel;i ++){} {S:70272 E:70651 D:1 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)all.get(i); {S:70332 E:70368 D:2 BT: 0}
for(int j = 0;j<nde.children.size();j ++){} {S:70378 E:70586 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)nde.children.get(j); {S:70442 E:70485 D:3 BT: 0}
all.add(d); {S:70496 E:70506 D:3 BT: 0}
</sublist>
</sublist>
startLevel = endLevel; {S:70714 E:70735 D:1 BT: 0}
endLevel = all.size(); {S:70744 E:70765 D:1 BT: 0}
</sublist>
return all; {S:70850 E:70860 D:0 BT: 0}
****************************/
/***************************
Processing list:
LinkedList all = new LinkedList(); {S:70051 E:70084 D:0 BT: 0}
all.push(root); {S:70092 E:70106 D:0 BT: 0}
int startLevel = 0; {S:70177 E:70195 D:0 BT: 0}
int endLevel = 1; {S:70203 E:70219 D:0 BT: 0}
while(startLevel != endLevel){} {S:70227 E:70773 D:0 BT: 0}
<sublist>
for(int i = startLevel;i<endLevel;i ++){} {S:70272 E:70651 D:1 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)all.get(i); {S:70332 E:70368 D:2 BT: 0}
for(int j = 0;j<nde.children.size();j ++){} {S:70378 E:70586 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)nde.children.get(j); {S:70442 E:70485 D:3 BT: 0}
all.add(d); {S:70496 E:70506 D:3 BT: 0}
</sublist>
</sublist>
startLevel = endLevel; {S:70714 E:70735 D:1 BT: 0}
endLevel = all.size(); {S:70744 E:70765 D:1 BT: 0}
</sublist>
return all; {S:70850 E:70860 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:69976 E:70043 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:69976 E:70043 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:70113 E:70169 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:70113 E:70169 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:70516 E:70576 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:70516 E:70576 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#5(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:70595 E:70642 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:70595 E:70642 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#6(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:70659 E:70705 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:70659 E:70705 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#7(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:70780 E:70842 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:70780 E:70842 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(2) Type:1 Paths:1 CP:32
/***************************
Processing list:
if(debugPrint) {S:69977 E:70043 D:0 BT: 1}
System.out.println("===The tree of life==="); {S:69999 E:70043 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(debugPrint){} {S:69977 E:70043 D:0 BT: 1}
QuicktestRunner.execPath += 32; {S:69999 E:0 D:1 BT: 0}
System.out.println("===The tree of life==="); {S:69999 E:70043 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#9(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#10(3) Type:1 Paths:1 CP:16
/***************************
Processing list:
if(debugPrint) {S:70114 E:70169 D:0 BT: 1}
System.out.println(root.currPath); {S:70136 E:70169 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(debugPrint){} {S:70114 E:70169 D:0 BT: 1}
QuicktestRunner.execPath += 16; {S:70136 E:0 D:1 BT: 0}
System.out.println(root.currPath); {S:70136 E:70169 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#11(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#12(4) Type:1 Paths:1 CP:8
/***************************
Processing list:
if(debugPrint) {S:70517 E:70576 D:3 BT: 1}
System.out.print(d.currPath + "/"); {S:70542 E:70576 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(debugPrint){} {S:70517 E:70576 D:3 BT: 1}
QuicktestRunner.execPath += 8; {S:70542 E:0 D:4 BT: 0}
System.out.print(d.currPath + "/"); {S:70542 E:70576 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#13(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#14(5) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(debugPrint) {S:70596 E:70642 D:2 BT: 1}
System.out.print("||"); {S:70620 E:70642 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(debugPrint){} {S:70596 E:70642 D:2 BT: 1}
QuicktestRunner.execPath += 4; {S:70620 E:0 D:3 BT: 0}
System.out.print("||"); {S:70620 E:70642 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#15(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#16(6) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(debugPrint) {S:70660 E:70705 D:1 BT: 1}
System.out.print("\n"); {S:70683 E:70705 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(debugPrint){} {S:70660 E:70705 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:70683 E:0 D:2 BT: 0}
System.out.print("\n"); {S:70683 E:70705 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#17(6) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#18(7) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(debugPrint) {S:70781 E:70842 D:0 BT: 1}
System.out.println("===End of tree==="); {S:70803 E:70842 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(debugPrint){} {S:70781 E:70842 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:70803 E:0 D:1 BT: 0}
System.out.println("===End of tree==="); {S:70803 E:70842 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#19(7) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:69976 E:70043 D:0 BT: 7}
if(debugPrint){} {S:69977 E:70043 D:0 BT: 1}
QuicktestRunner.execPath += 32; {S:69999 E:0 D:1 BT: 0}
System.out.println("===The tree of life==="); {S:69999 E:70043 D:1 BT: 0}
LinkedList all = new LinkedList(); {S:70051 E:70084 D:0 BT: 0}
all.push(root); {S:70092 E:70106 D:0 BT: 0}
 {S:70113 E:70169 D:0 BT: 7}
if(debugPrint){} {S:70114 E:70169 D:0 BT: 1}
QuicktestRunner.execPath += 16; {S:70136 E:0 D:1 BT: 0}
System.out.println(root.currPath); {S:70136 E:70169 D:1 BT: 0}
int startLevel = 0; {S:70177 E:70195 D:0 BT: 0}
int endLevel = 1; {S:70203 E:70219 D:0 BT: 0}
while(startLevel != endLevel){} {S:70227 E:70773 D:0 BT: 0}
<sublist>
for(int i = startLevel;i<endLevel;i ++){} {S:70272 E:70651 D:1 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)all.get(i); {S:70332 E:70368 D:2 BT: 0}
for(int j = 0;j<nde.children.size();j ++){} {S:70378 E:70586 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)nde.children.get(j); {S:70442 E:70485 D:3 BT: 0}
all.add(d); {S:70496 E:70506 D:3 BT: 0}
</sublist>
</sublist>
startLevel = endLevel; {S:70714 E:70735 D:1 BT: 0}
endLevel = all.size(); {S:70744 E:70765 D:1 BT: 0}
</sublist>
for(int i = startLevel;i<endLevel;i ++){} {S:70272 E:70651 D:1 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)all.get(i); {S:70332 E:70368 D:2 BT: 0}
for(int j = 0;j<nde.children.size();j ++){} {S:70378 E:70586 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)nde.children.get(j); {S:70442 E:70485 D:3 BT: 0}
all.add(d); {S:70496 E:70506 D:3 BT: 0}
</sublist>
</sublist>
CodeNodeTest nde =(CodeNodeTest)all.get(i); {S:70332 E:70368 D:2 BT: 0}
for(int j = 0;j<nde.children.size();j ++){} {S:70378 E:70586 D:2 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)nde.children.get(j); {S:70442 E:70485 D:3 BT: 0}
all.add(d); {S:70496 E:70506 D:3 BT: 0}
</sublist>
CodeNodeTest d =(CodeNodeTest)nde.children.get(j); {S:70442 E:70485 D:3 BT: 0}
all.add(d); {S:70496 E:70506 D:3 BT: 0}
 {S:70516 E:70576 D:3 BT: 7}
if(debugPrint){} {S:70517 E:70576 D:3 BT: 1}
QuicktestRunner.execPath += 8; {S:70542 E:0 D:4 BT: 0}
System.out.print(d.currPath + "/"); {S:70542 E:70576 D:4 BT: 0}
 {S:70595 E:70642 D:2 BT: 7}
if(debugPrint){} {S:70596 E:70642 D:2 BT: 1}
QuicktestRunner.execPath += 4; {S:70620 E:0 D:3 BT: 0}
System.out.print("||"); {S:70620 E:70642 D:3 BT: 0}
 {S:70659 E:70705 D:1 BT: 7}
if(debugPrint){} {S:70660 E:70705 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:70683 E:0 D:2 BT: 0}
System.out.print("\n"); {S:70683 E:70705 D:2 BT: 0}
startLevel = endLevel; {S:70714 E:70735 D:1 BT: 0}
endLevel = all.size(); {S:70744 E:70765 D:1 BT: 0}
 {S:70780 E:70842 D:0 BT: 7}
if(debugPrint){} {S:70781 E:70842 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:70803 E:0 D:1 BT: 0}
System.out.println("===End of tree==="); {S:70803 E:70842 D:1 BT: 0}
return all; {S:70850 E:70860 D:0 BT: 0}
****************************/
    //S:69976   E:70043 D: 0BT: 7
   if(debugPrint) //S:69977   E:70043 D: 0BT: 1
   {
      QuicktestRunner.execPath += 32; //S:69999   E:0 D: 1BT: 0
      System.out.println("===The tree of life==="); //S:69999   E:70043 D: 1BT: 0
   }
   LinkedList all = new LinkedList(); //S:70051   E:70084 D: 0BT: 0
   all.push(root); //S:70092   E:70106 D: 0BT: 0
    //S:70113   E:70169 D: 0BT: 7
   if(debugPrint) //S:70114   E:70169 D: 0BT: 1
   {
      QuicktestRunner.execPath += 16; //S:70136   E:0 D: 1BT: 0
      System.out.println(root.currPath); //S:70136   E:70169 D: 1BT: 0
   }
   int startLevel = 0; //S:70177   E:70195 D: 0BT: 0
   int endLevel = 1; //S:70203   E:70219 D: 0BT: 0
   while(startLevel != endLevel) //S:70227   E:70773 D: 0BT: 0
   {
      for(int i = startLevel;i<endLevel;i ++) //S:70272   E:70651 D: 1BT: 0
      {
         CodeNodeTest nde =(CodeNodeTest)all.get(i); //S:70332   E:70368 D: 2BT: 0
         for(int j = 0;j<nde.children.size();j ++) //S:70378   E:70586 D: 2BT: 0
         {
            CodeNodeTest d =(CodeNodeTest)nde.children.get(j); //S:70442   E:70485 D: 3BT: 0
            all.add(d); //S:70496   E:70506 D: 3BT: 0
             //S:70516   E:70576 D: 3BT: 7
            if(debugPrint) //S:70517   E:70576 D: 3BT: 1
            {
               QuicktestRunner.execPath += 8; //S:70542   E:0 D: 4BT: 0
               System.out.print(d.currPath + "/"); //S:70542   E:70576 D: 4BT: 0
            }
         }
          //S:70595   E:70642 D: 2BT: 7
         if(debugPrint) //S:70596   E:70642 D: 2BT: 1
         {
            QuicktestRunner.execPath += 4; //S:70620   E:0 D: 3BT: 0
            System.out.print("||"); //S:70620   E:70642 D: 3BT: 0
         }
      }
       //S:70659   E:70705 D: 1BT: 7
      if(debugPrint) //S:70660   E:70705 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:70683   E:0 D: 2BT: 0
         System.out.print("\n"); //S:70683   E:70705 D: 2BT: 0
      }
      startLevel = endLevel; //S:70714   E:70735 D: 1BT: 0
      endLevel = all.size(); //S:70744   E:70765 D: 1BT: 0
   }
    //S:70780   E:70842 D: 0BT: 7
   if(debugPrint) //S:70781   E:70842 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:70803   E:0 D: 1BT: 0
      System.out.println("===End of tree==="); //S:70803   E:70842 D: 1BT: 0
   }
   return all; //S:70850   E:70860 D: 0BT: 0
   }

   private LineListTest getQTCode(CodeNodeTest in)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
System.out.println("Node: [" + in.getShortString()+ "]\nLooking at:\n" + in.list.outputWTDepth("   " , false)); {S:70934 E:71044 D:0 BT: 0}
return in.outputQTCode(this); {S:71052 E:71080 D:0 BT: 0}
****************************/
/***************************
Processing list:
System.out.println("Node: [" + in.getShortString()+ "]\nLooking at:\n" + in.list.outputWTDepth("   " , false)); {S:70934 E:71044 D:0 BT: 0}
return in.outputQTCode(this); {S:71052 E:71080 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
System.out.println("Node: [" + in.getShortString()+ "]\nLooking at:\n" + in.list.outputWTDepth("   " , false)); {S:70934 E:71044 D:0 BT: 0}
return in.outputQTCode(this); {S:71052 E:71080 D:0 BT: 0}
****************************/
   System.out.println("Node: [" + in.getShortString()+ "]\nLooking at:\n" + in.list.outputWTDepth("   " , false)); //S:70934   E:71044 D: 0BT: 0
   return in.outputQTCode(this); //S:71052   E:71080 D: 0BT: 0
   }

   private LineListTest gatherQTCode(LinkedList in)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
LineListTest[]all = new LineListTest[in.size()]; {S:71158 E:71198 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:71206 E:71329 D:0 BT: 0}
<sublist>
CodeNodeTest cn =(CodeNodeTest)in.get(i); {S:71256 E:71290 D:1 BT: 0}
all[i]= getQTCode(cn); {S:71299 E:71321 D:1 BT: 0}
</sublist>
return getParsedCodePath(all); {S:71337 E:71366 D:0 BT: 0}
****************************/
/***************************
Processing list:
LineListTest[]all = new LineListTest[in.size()]; {S:71158 E:71198 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:71206 E:71329 D:0 BT: 0}
<sublist>
CodeNodeTest cn =(CodeNodeTest)in.get(i); {S:71256 E:71290 D:1 BT: 0}
all[i]= getQTCode(cn); {S:71299 E:71321 D:1 BT: 0}
</sublist>
return getParsedCodePath(all); {S:71337 E:71366 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
LineListTest[]all = new LineListTest[in.size()]; {S:71158 E:71198 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:71206 E:71329 D:0 BT: 0}
<sublist>
CodeNodeTest cn =(CodeNodeTest)in.get(i); {S:71256 E:71290 D:1 BT: 0}
all[i]= getQTCode(cn); {S:71299 E:71321 D:1 BT: 0}
</sublist>
CodeNodeTest cn =(CodeNodeTest)in.get(i); {S:71256 E:71290 D:1 BT: 0}
all[i]= getQTCode(cn); {S:71299 E:71321 D:1 BT: 0}
return getParsedCodePath(all); {S:71337 E:71366 D:0 BT: 0}
****************************/
   LineListTest[]all = new LineListTest[in.size()]; //S:71158   E:71198 D: 0BT: 0
   for(int i = 0;i<in.size();i ++) //S:71206   E:71329 D: 0BT: 0
   {
      CodeNodeTest cn =(CodeNodeTest)in.get(i); //S:71256   E:71290 D: 1BT: 0
      all[i]= getQTCode(cn); //S:71299   E:71321 D: 1BT: 0
   }
   return getParsedCodePath(all); //S:71337   E:71366 D: 0BT: 0
   }

   private void calcBranchPath(CodeNodeTest parent)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
int sz = parent.children.size(); {S:71444 E:71475 D:0 BT: 0}
for(int i = 0;i<sz;i ++){} {S:71483 E:71792 D:0 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)parent.children.get(i); {S:71526 E:71572 D:1 BT: 0}
int prodPrev = parent.currPath; {S:71581 E:71611 D:1 BT: 0}
for(int j = i + 1;j<sz;j ++){} {S:71620 E:71754 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)parent.children.get(j); {S:71669 E:71715 D:2 BT: 0}
prodPrev *= d.nPaths; {S:71725 E:71745 D:2 BT: 0}
</sublist>
n.currPath = prodPrev; {S:71763 E:71784 D:1 BT: 0}
</sublist>
for(int i = 0;i<sz;i ++){} {S:71800 E:71957 D:0 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)parent.children.get(i); {S:71843 E:71889 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
int sz = parent.children.size(); {S:71444 E:71475 D:0 BT: 0}
for(int i = 0;i<sz;i ++){} {S:71483 E:71792 D:0 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)parent.children.get(i); {S:71526 E:71572 D:1 BT: 0}
int prodPrev = parent.currPath; {S:71581 E:71611 D:1 BT: 0}
for(int j = i + 1;j<sz;j ++){} {S:71620 E:71754 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)parent.children.get(j); {S:71669 E:71715 D:2 BT: 0}
prodPrev *= d.nPaths; {S:71725 E:71745 D:2 BT: 0}
</sublist>
n.currPath = prodPrev; {S:71763 E:71784 D:1 BT: 0}
</sublist>
for(int i = 0;i<sz;i ++){} {S:71800 E:71957 D:0 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)parent.children.get(i); {S:71843 E:71889 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:71897 E:71949 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:71897 E:71949 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(n.children.size()>0) {S:71898 E:71949 D:1 BT: 1}
calcBranchPath(n); {S:71932 E:71949 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(n.children.size()>0){} {S:71898 E:71949 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:71932 E:0 D:2 BT: 0}
calcBranchPath(n); {S:71932 E:71949 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int sz = parent.children.size(); {S:71444 E:71475 D:0 BT: 0}
for(int i = 0;i<sz;i ++){} {S:71483 E:71792 D:0 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)parent.children.get(i); {S:71526 E:71572 D:1 BT: 0}
int prodPrev = parent.currPath; {S:71581 E:71611 D:1 BT: 0}
for(int j = i + 1;j<sz;j ++){} {S:71620 E:71754 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)parent.children.get(j); {S:71669 E:71715 D:2 BT: 0}
prodPrev *= d.nPaths; {S:71725 E:71745 D:2 BT: 0}
</sublist>
n.currPath = prodPrev; {S:71763 E:71784 D:1 BT: 0}
</sublist>
CodeNodeTest n =(CodeNodeTest)parent.children.get(i); {S:71526 E:71572 D:1 BT: 0}
int prodPrev = parent.currPath; {S:71581 E:71611 D:1 BT: 0}
for(int j = i + 1;j<sz;j ++){} {S:71620 E:71754 D:1 BT: 0}
<sublist>
CodeNodeTest d =(CodeNodeTest)parent.children.get(j); {S:71669 E:71715 D:2 BT: 0}
prodPrev *= d.nPaths; {S:71725 E:71745 D:2 BT: 0}
</sublist>
CodeNodeTest d =(CodeNodeTest)parent.children.get(j); {S:71669 E:71715 D:2 BT: 0}
prodPrev *= d.nPaths; {S:71725 E:71745 D:2 BT: 0}
n.currPath = prodPrev; {S:71763 E:71784 D:1 BT: 0}
for(int i = 0;i<sz;i ++){} {S:71800 E:71957 D:0 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)parent.children.get(i); {S:71843 E:71889 D:1 BT: 0}
</sublist>
CodeNodeTest n =(CodeNodeTest)parent.children.get(i); {S:71843 E:71889 D:1 BT: 0}
 {S:71897 E:71949 D:1 BT: 7}
if(n.children.size()>0){} {S:71898 E:71949 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:71932 E:0 D:2 BT: 0}
calcBranchPath(n); {S:71932 E:71949 D:2 BT: 0}
****************************/
   int sz = parent.children.size(); //S:71444   E:71475 D: 0BT: 0
   for(int i = 0;i<sz;i ++) //S:71483   E:71792 D: 0BT: 0
   {
      CodeNodeTest n =(CodeNodeTest)parent.children.get(i); //S:71526   E:71572 D: 1BT: 0
      int prodPrev = parent.currPath; //S:71581   E:71611 D: 1BT: 0
      for(int j = i + 1;j<sz;j ++) //S:71620   E:71754 D: 1BT: 0
      {
         CodeNodeTest d =(CodeNodeTest)parent.children.get(j); //S:71669   E:71715 D: 2BT: 0
         prodPrev *= d.nPaths; //S:71725   E:71745 D: 2BT: 0
      }
      n.currPath = prodPrev; //S:71763   E:71784 D: 1BT: 0
   }
   for(int i = 0;i<sz;i ++) //S:71800   E:71957 D: 0BT: 0
   {
      CodeNodeTest n =(CodeNodeTest)parent.children.get(i); //S:71843   E:71889 D: 1BT: 0
       //S:71897   E:71949 D: 1BT: 7
      if(n.children.size()>0) //S:71898   E:71949 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:71932   E:0 D: 2BT: 0
         calcBranchPath(n); //S:71932   E:71949 D: 2BT: 0
      }
   }
   }

   private void infixGather(CodeNodeTest in, LinkedList ll)
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
ll.add(in); {S:72043 E:72053 D:0 BT: 0}
for(int i = 0;i<in.children.size();i ++)infixGather((CodeNodeTest)in.children.get(i), ll); {S:72061 E:72158 D:0 BT: 0}
****************************/
/***************************
Processing list:
ll.add(in); {S:72043 E:72053 D:0 BT: 0}
for(int i = 0;i<in.children.size();i ++)infixGather((CodeNodeTest)in.children.get(i), ll); {S:72061 E:72158 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
ll.add(in); {S:72043 E:72053 D:0 BT: 0}
for(int i = 0;i<in.children.size();i ++)infixGather((CodeNodeTest)in.children.get(i), ll); {S:72061 E:72158 D:0 BT: 0}
****************************/
   ll.add(in); //S:72043   E:72053 D: 0BT: 0
   for(int i = 0;i<in.children.size();i ++)infixGather((CodeNodeTest)in.children.get(i), ll); //S:72061   E:72158 D: 0BT: 0
   }

   private void calcLeaves()
	     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:12 CP:0
/***************************
Processing list:
LinkedList all = new LinkedList(); {S:72217 E:72250 D:0 BT: 0}
infixGather(root , all); {S:72258 E:72280 D:0 BT: 0}
for(int i = 0;i<all.size();i ++){} {S:72371 E:72659 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)all.get(i); {S:72422 E:72458 D:1 BT: 0}
</sublist>
int currComponent = 1; {S:72753 E:72774 D:0 BT: 0}
int nMatches = 0; {S:72782 E:72798 D:0 BT: 0}
int compIndex = all.size(); {S:72806 E:72832 D:0 BT: 0}
for(int i = all.size()- 1;i>= 0;i --){} {S:73097 E:74006 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)all.get(i); {S:73153 E:73189 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
LinkedList all = new LinkedList(); {S:72217 E:72250 D:0 BT: 0}
infixGather(root , all); {S:72258 E:72280 D:0 BT: 0}
for(int i = 0;i<all.size();i ++){} {S:72371 E:72659 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)all.get(i); {S:72422 E:72458 D:1 BT: 0}
</sublist>
int currComponent = 1; {S:72753 E:72774 D:0 BT: 0}
int nMatches = 0; {S:72782 E:72798 D:0 BT: 0}
int compIndex = all.size(); {S:72806 E:72832 D:0 BT: 0}
for(int i = all.size()- 1;i>= 0;i --){} {S:73097 E:74006 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)all.get(i); {S:73153 E:73189 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:72466 E:72651 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:72466 E:72651 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:73197 E:73998 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:73197 E:73998 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:74013 E:74402 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:74013 E:74402 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:6
/***************************
Processing list:
if(nde.children.size()>0){} {S:72467 E:72651 D:1 BT: 1}
nde.currPath = 0; {S:72588 E:72604 D:2 BT: 0}
all.remove(nde); {S:72614 E:72629 D:2 BT: 0}
i --; {S:72639 E:72642 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(nde.children.size()>0){} {S:72467 E:72651 D:1 BT: 1}
QuicktestRunner.execPath += 6; {S:72588 E:0 D:2 BT: 0}
nde.currPath = 0; {S:72588 E:72604 D:2 BT: 0}
all.remove(nde); {S:72614 E:72629 D:2 BT: 0}
i --; {S:72639 E:72642 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(currComponent == nde.currPath){ {S:73198 E:73283 D:1 BT: 1}
nMatches ++; {S:73249 E:73259 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(currComponent == nde.currPath){} {S:73198 E:73283 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:73249 E:0 D:2 BT: 0}
nMatches ++; {S:73249 E:73259 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#8(3) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:73284 E:73998 D:1 BT: 2}
currComponent = nde.currPath; {S:73845 E:73873 D:1 BT: 0}
nMatches = 0; {S:73883 E:73895 D:1 BT: 0}
compIndex = i + 1; {S:73905 E:73922 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:73284 E:73998 D:1 BT: 2}
currComponent = nde.currPath; {S:73845 E:73873 D:2 BT: 0}
nMatches = 0; {S:73883 E:73895 D:2 BT: 0}
compIndex = i + 1; {S:73905 E:73922 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#9(4) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(nMatches>0){} {S:74014 E:74402 D:0 BT: 1}
for(int j = 0;j<compIndex;j ++){} {S:74138 E:74396 D:1 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)all.get(j); {S:74186 E:74220 D:2 BT: 0}
n.currPath =(compIndex - j - 1)* currComponent; {S:74293 E:74341 D:2 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(nMatches>0){} {S:74014 E:74402 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:74138 E:0 D:1 BT: 0}
for(int j = 0;j<compIndex;j ++){} {S:74138 E:74396 D:1 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)all.get(j); {S:74186 E:74220 D:2 BT: 0}
n.currPath =(compIndex - j - 1)* currComponent; {S:74293 E:74341 D:2 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(8) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:73396 E:73835 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:73396 E:73835 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#12(11) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(nMatches>0){} {S:73397 E:73835 D:3 BT: 1}
for(int j = i + 1;j<compIndex;j ++){} {S:73539 E:73825 D:4 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)all.get(j); {S:73599 E:73633 D:5 BT: 0}
n.currPath =(compIndex - j - 1)* currComponent; {S:73714 E:73762 D:5 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(nMatches>0){} {S:73397 E:73835 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:73539 E:0 D:4 BT: 0}
for(int j = i + 1;j<compIndex;j ++){} {S:73539 E:73825 D:4 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)all.get(j); {S:73599 E:73633 D:5 BT: 0}
n.currPath =(compIndex - j - 1)* currComponent; {S:73714 E:73762 D:5 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#13(11) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
LinkedList all = new LinkedList(); {S:72217 E:72250 D:0 BT: 0}
infixGather(root , all); {S:72258 E:72280 D:0 BT: 0}
for(int i = 0;i<all.size();i ++){} {S:72371 E:72659 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)all.get(i); {S:72422 E:72458 D:1 BT: 0}
</sublist>
CodeNodeTest nde =(CodeNodeTest)all.get(i); {S:72422 E:72458 D:1 BT: 0}
 {S:72466 E:72651 D:1 BT: 7}
if(nde.children.size()>0){} {S:72467 E:72651 D:1 BT: 1}
QuicktestRunner.execPath += 6; {S:72588 E:0 D:2 BT: 0}
nde.currPath = 0; {S:72588 E:72604 D:2 BT: 0}
all.remove(nde); {S:72614 E:72629 D:2 BT: 0}
i --; {S:72639 E:72642 D:2 BT: 0}
int currComponent = 1; {S:72753 E:72774 D:0 BT: 0}
int nMatches = 0; {S:72782 E:72798 D:0 BT: 0}
int compIndex = all.size(); {S:72806 E:72832 D:0 BT: 0}
for(int i = all.size()- 1;i>= 0;i --){} {S:73097 E:74006 D:0 BT: 0}
<sublist>
CodeNodeTest nde =(CodeNodeTest)all.get(i); {S:73153 E:73189 D:1 BT: 0}
</sublist>
CodeNodeTest nde =(CodeNodeTest)all.get(i); {S:73153 E:73189 D:1 BT: 0}
 {S:73197 E:73998 D:1 BT: 7}
if(currComponent == nde.currPath){} {S:73198 E:73283 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:73249 E:0 D:2 BT: 0}
nMatches ++; {S:73249 E:73259 D:2 BT: 0}
else{} {S:73284 E:73998 D:1 BT: 2}
 {S:73396 E:73835 D:2 BT: 7}
if(nMatches>0){} {S:73397 E:73835 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:73539 E:0 D:3 BT: 0}
for(int j = i + 1;j<compIndex;j ++){} {S:73539 E:73825 D:3 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)all.get(j); {S:73599 E:73633 D:4 BT: 0}
n.currPath =(compIndex - j - 1)* currComponent; {S:73714 E:73762 D:4 BT: 0}
</sublist>
CodeNodeTest n =(CodeNodeTest)all.get(j); {S:73599 E:73633 D:4 BT: 0}
n.currPath =(compIndex - j - 1)* currComponent; {S:73714 E:73762 D:4 BT: 0}
currComponent = nde.currPath; {S:73845 E:73873 D:2 BT: 0}
nMatches = 0; {S:73883 E:73895 D:2 BT: 0}
compIndex = i + 1; {S:73905 E:73922 D:2 BT: 0}
 {S:74013 E:74402 D:0 BT: 7}
if(nMatches>0){} {S:74014 E:74402 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:74138 E:0 D:1 BT: 0}
for(int j = 0;j<compIndex;j ++){} {S:74138 E:74396 D:1 BT: 0}
<sublist>
CodeNodeTest n =(CodeNodeTest)all.get(j); {S:74186 E:74220 D:2 BT: 0}
n.currPath =(compIndex - j - 1)* currComponent; {S:74293 E:74341 D:2 BT: 0}
</sublist>
CodeNodeTest n =(CodeNodeTest)all.get(j); {S:74186 E:74220 D:2 BT: 0}
n.currPath =(compIndex - j - 1)* currComponent; {S:74293 E:74341 D:2 BT: 0}
****************************/
   LinkedList all = new LinkedList(); //S:72217   E:72250 D: 0BT: 0
   infixGather(root , all); //S:72258   E:72280 D: 0BT: 0
   for(int i = 0;i<all.size();i ++) //S:72371   E:72659 D: 0BT: 0
   {
      CodeNodeTest nde =(CodeNodeTest)all.get(i); //S:72422   E:72458 D: 1BT: 0
       //S:72466   E:72651 D: 1BT: 7
      if(nde.children.size()>0) //S:72467   E:72651 D: 1BT: 1
      {
         QuicktestRunner.execPath += 6; //S:72588   E:0 D: 2BT: 0
         nde.currPath = 0; //S:72588   E:72604 D: 2BT: 0
         all.remove(nde); //S:72614   E:72629 D: 2BT: 0
         i --; //S:72639   E:72642 D: 2BT: 0
      }
   }
   int currComponent = 1; //S:72753   E:72774 D: 0BT: 0
   int nMatches = 0; //S:72782   E:72798 D: 0BT: 0
   int compIndex = all.size(); //S:72806   E:72832 D: 0BT: 0
   for(int i = all.size()- 1;i>= 0;i --) //S:73097   E:74006 D: 0BT: 0
   {
      CodeNodeTest nde =(CodeNodeTest)all.get(i); //S:73153   E:73189 D: 1BT: 0
       //S:73197   E:73998 D: 1BT: 7
      if(currComponent == nde.currPath) //S:73198   E:73283 D: 1BT: 1
      {
         QuicktestRunner.execPath += 4; //S:73249   E:0 D: 2BT: 0
         nMatches ++; //S:73249   E:73259 D: 2BT: 0
      }
      else //S:73284   E:73998 D: 1BT: 2
      {
          //S:73396   E:73835 D: 2BT: 7
         if(nMatches>0) //S:73397   E:73835 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:73539   E:0 D: 3BT: 0
            for(int j = i + 1;j<compIndex;j ++) //S:73539   E:73825 D: 3BT: 0
            {
               CodeNodeTest n =(CodeNodeTest)all.get(j); //S:73599   E:73633 D: 4BT: 0
               n.currPath =(compIndex - j - 1)* currComponent; //S:73714   E:73762 D: 4BT: 0
            }
         }
         currComponent = nde.currPath; //S:73845   E:73873 D: 2BT: 0
         nMatches = 0; //S:73883   E:73895 D: 2BT: 0
         compIndex = i + 1; //S:73905   E:73922 D: 2BT: 0
      }
   }
    //S:74013   E:74402 D: 0BT: 7
   if(nMatches>0) //S:74014   E:74402 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:74138   E:0 D: 1BT: 0
      for(int j = 0;j<compIndex;j ++) //S:74138   E:74396 D: 1BT: 0
      {
         CodeNodeTest n =(CodeNodeTest)all.get(j); //S:74186   E:74220 D: 2BT: 0
         n.currPath =(compIndex - j - 1)* currComponent; //S:74293   E:74341 D: 2BT: 0
      }
   }
   }

public void calcLeavesTest_3()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   calcLeaves();
   //Post-test

}

public void calcLeavesTest_7()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   calcLeaves();
   //Post-test

}

public void calcLeavesTest_11()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   calcLeaves();
   //Post-test

}

public void calcLeavesTest_0()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   calcLeaves();
   //Post-test

}

public void calcLeavesTest_4()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   calcLeaves();
   //Post-test

}

public void calcLeavesTest_10()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   calcLeaves();
   //Post-test

}

public void calcLeavesTest_1()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   calcLeaves();
   //Post-test

}

public void calcLeavesTest_2()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   calcLeaves();
   //Post-test

}

public void calcLeavesTest_5()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   calcLeaves();
   //Post-test

}

public void calcLeavesTest_6()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   calcLeaves();
   //Post-test

}

public void calcLeavesTest_8()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   calcLeaves();
   //Post-test

}

public void calcLeavesTest_9()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   calcLeaves();
   //Post-test

}

   public FunctionTreeTest(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

}

