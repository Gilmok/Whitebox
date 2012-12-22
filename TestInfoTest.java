import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class TestInfoTest
{
   public int testIndex;
   public String name;
   public String commentName;
   public boolean isExplicit;
   public String expectedException;
   public String addlSetup;
   public VarInfoTest[] lineInputs;
   public VarInfoTest[] params;
   public String[] inputValues;
   public String postAsserts;
   public int testState;
   public int compileState;
   public String[] testLines;
   public LineListTest testLineListTest;
   public String testCode;
   public AssertionListTest asserts;
   public MethodInfoTest assocMethod;
   public int TESTPATH = 1;

   TestInfoTest()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
clear(); {S:107022 E:107029 D:0 BT: 0}
****************************/
/***************************
Processing list:
clear(); {S:107022 E:107029 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
clear(); {S:107022 E:107029 D:0 BT: 0}
****************************/
   clear(); //S:107022   E:107029 D: 0BT: 0
   }

public void TestInfoTestTest_0()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   TestInfoTest rtnVal = new TestInfoTest();
   //Post-test

}

   private void clear()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
asserts = new AssertionListTest(); {S:107078 E:107107 D:0 BT: 0}
lineInputs = new VarInfoTest[0]; {S:107116 E:107143 D:0 BT: 0}
params = new VarInfoTest[0]; {S:107152 E:107175 D:0 BT: 0}
inputValues = new String[0]; {S:107184 E:107211 D:0 BT: 0}
addlSetup = new String(""); {S:107220 E:107246 D:0 BT: 0}
postAsserts = new String(""); {S:107255 E:107283 D:0 BT: 0}
****************************/
/***************************
Processing list:
asserts = new AssertionListTest(); {S:107078 E:107107 D:0 BT: 0}
lineInputs = new VarInfoTest[0]; {S:107116 E:107143 D:0 BT: 0}
params = new VarInfoTest[0]; {S:107152 E:107175 D:0 BT: 0}
inputValues = new String[0]; {S:107184 E:107211 D:0 BT: 0}
addlSetup = new String(""); {S:107220 E:107246 D:0 BT: 0}
postAsserts = new String(""); {S:107255 E:107283 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
asserts = new AssertionListTest(); {S:107078 E:107107 D:0 BT: 0}
lineInputs = new VarInfoTest[0]; {S:107116 E:107143 D:0 BT: 0}
params = new VarInfoTest[0]; {S:107152 E:107175 D:0 BT: 0}
inputValues = new String[0]; {S:107184 E:107211 D:0 BT: 0}
addlSetup = new String(""); {S:107220 E:107246 D:0 BT: 0}
postAsserts = new String(""); {S:107255 E:107283 D:0 BT: 0}
****************************/
   asserts = new AssertionListTest(); //S:107078   E:107107 D: 0BT: 0
   lineInputs = new VarInfoTest[0]; //S:107116   E:107143 D: 0BT: 0
   params = new VarInfoTest[0]; //S:107152   E:107175 D: 0BT: 0
   inputValues = new String[0]; //S:107184   E:107211 D: 0BT: 0
   addlSetup = new String(""); //S:107220   E:107246 D: 0BT: 0
   postAsserts = new String(""); //S:107255   E:107283 D: 0BT: 0
   }

   TestInfoTest(String in, String name)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
testLines = in.split("\n"); {S:107341 E:107367 D:0 BT: 0}
asserts = new AssertionListTest(); {S:107374 E:107403 D:0 BT: 0}
****************************/
/***************************
Processing list:
testLines = in.split("\n"); {S:107341 E:107367 D:0 BT: 0}
asserts = new AssertionListTest(); {S:107374 E:107403 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
testLines = in.split("\n"); {S:107341 E:107367 D:0 BT: 0}
asserts = new AssertionListTest(); {S:107374 E:107403 D:0 BT: 0}
****************************/
   testLines = in.split("\n"); //S:107341   E:107367 D: 0BT: 0
   asserts = new AssertionListTest(); //S:107374   E:107403 D: 0BT: 0
   }

   TestInfoTest(LineListTest in, String name, ClassListTest cl, MethodInfoTest mi, int index)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
this(); {S:107506 E:107512 D:0 BT: 0}
this.name = name; {S:107519 E:107535 D:0 BT: 0}
asserts = findAssertions(in , cl , mi); {S:107597 E:107633 D:0 BT: 0}
assocMethod = mi; {S:107640 E:107656 D:0 BT: 0}
ClassInfoTest temp = cl.getClass(mi.classIndex); {S:107663 E:107706 D:0 BT: 0}
expectedException = ""; {S:107713 E:107735 D:0 BT: 0}
getInputs(in , temp , mi); {S:107742 E:107765 D:0 BT: 0}
inputValues = new String[lineInputs.length + params.length]; {S:107772 E:107831 D:0 BT: 0}
testIndex = index + 1; {S:107838 E:107859 D:0 BT: 0}
****************************/
/***************************
Processing list:
this(); {S:107506 E:107512 D:0 BT: 0}
this.name = name; {S:107519 E:107535 D:0 BT: 0}
asserts = findAssertions(in , cl , mi); {S:107597 E:107633 D:0 BT: 0}
assocMethod = mi; {S:107640 E:107656 D:0 BT: 0}
ClassInfoTest temp = cl.getClass(mi.classIndex); {S:107663 E:107706 D:0 BT: 0}
expectedException = ""; {S:107713 E:107735 D:0 BT: 0}
getInputs(in , temp , mi); {S:107742 E:107765 D:0 BT: 0}
inputValues = new String[lineInputs.length + params.length]; {S:107772 E:107831 D:0 BT: 0}
testIndex = index + 1; {S:107838 E:107859 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
this(); {S:107506 E:107512 D:0 BT: 0}
this.name = name; {S:107519 E:107535 D:0 BT: 0}
asserts = findAssertions(in , cl , mi); {S:107597 E:107633 D:0 BT: 0}
assocMethod = mi; {S:107640 E:107656 D:0 BT: 0}
ClassInfoTest temp = cl.getClass(mi.classIndex); {S:107663 E:107706 D:0 BT: 0}
expectedException = ""; {S:107713 E:107735 D:0 BT: 0}
getInputs(in , temp , mi); {S:107742 E:107765 D:0 BT: 0}
inputValues = new String[lineInputs.length + params.length]; {S:107772 E:107831 D:0 BT: 0}
testIndex = index + 1; {S:107838 E:107859 D:0 BT: 0}
****************************/
   this(); //S:107506   E:107512 D: 0BT: 0
   this.name = name; //S:107519   E:107535 D: 0BT: 0
   asserts = findAssertions(in , cl , mi); //S:107597   E:107633 D: 0BT: 0
   assocMethod = mi; //S:107640   E:107656 D: 0BT: 0
   ClassInfoTest temp = cl.getClass(mi.classIndex); //S:107663   E:107706 D: 0BT: 0
   expectedException = ""; //S:107713   E:107735 D: 0BT: 0
   getInputs(in , temp , mi); //S:107742   E:107765 D: 0BT: 0
   inputValues = new String[lineInputs.length + params.length]; //S:107772   E:107831 D: 0BT: 0
   testIndex = index + 1; //S:107838   E:107859 D: 0BT: 0
   }

   TestInfoTest(MethodInfoTest codeMi, String cn)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
name = codeMi.name; {S:108009 E:108027 D:0 BT: 0}
testCode = codeMi.getLines(); {S:108034 E:108062 D:0 BT: 0}
commentName = cn; {S:108069 E:108085 D:0 BT: 0}
****************************/
/***************************
Processing list:
name = codeMi.name; {S:108009 E:108027 D:0 BT: 0}
testCode = codeMi.getLines(); {S:108034 E:108062 D:0 BT: 0}
commentName = cn; {S:108069 E:108085 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
name = codeMi.name; {S:108009 E:108027 D:0 BT: 0}
testCode = codeMi.getLines(); {S:108034 E:108062 D:0 BT: 0}
commentName = cn; {S:108069 E:108085 D:0 BT: 0}
****************************/
   name = codeMi.name; //S:108009   E:108027 D: 0BT: 0
   testCode = codeMi.getLines(); //S:108034   E:108062 D: 0BT: 0
   commentName = cn; //S:108069   E:108085 D: 0BT: 0
   }

   TestInfoTest(MethodInfoTest mi, LineListTest in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
assocMethod = mi; {S:108150 E:108166 D:0 BT: 0}
testLineListTest = in; {S:108173 E:108190 D:0 BT: 0}
****************************/
/***************************
Processing list:
assocMethod = mi; {S:108150 E:108166 D:0 BT: 0}
testLineListTest = in; {S:108173 E:108190 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
assocMethod = mi; {S:108150 E:108166 D:0 BT: 0}
testLineListTest = in; {S:108173 E:108190 D:0 BT: 0}
****************************/
   assocMethod = mi; //S:108150   E:108166 D: 0BT: 0
   testLineListTest = in; //S:108173   E:108190 D: 0BT: 0
   }

   public static VarInfoTest[] getLineInputs(LineListTest in, ClassInfoTest ci, VarInfoTest[] params)  //move to testInfo
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:12 CP:0
/***************************
Processing list:
int strCount = 0; {S:108323 E:108339 D:0 BT: 0}
int[]usage = new int[ci.vars.size()]; {S:108344 E:108381 D:0 BT: 0}
VarInfoTest[]allVars = new VarInfoTest[ci.vars.size()]; {S:108386 E:108433 D:0 BT: 0}
for(int i = 0;i<ci.vars.size();i ++){} {S:108438 E:108522 D:0 BT: 0}
<sublist>
allVars[i]= ci.vars.getVar(i); {S:108487 E:108517 D:1 BT: 0}
</sublist>
for(int k = 0;k<in.size();k ++){} {S:108527 E:108899 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(k); {S:108571 E:108598 D:1 BT: 0}
String[]rVal = li.getRValue(); {S:108604 E:108634 D:1 BT: 0}
for(int i = 0;i<rVal.length;i ++){} {S:108640 E:108894 D:1 BT: 0}
<sublist>
for(int j = 0;j<allVars.length;j ++){} {S:108688 E:108888 D:2 BT: 0}
</sublist>
</sublist>
for(int i = 0;i<params.length;i ++){} {S:108981 E:109210 D:0 BT: 0}
<sublist>
for(int j = 0;j<allVars.length;j ++){} {S:109029 E:109205 D:1 BT: 0}
</sublist>
VarInfoTest[]rtnVal = new VarInfoTest[strCount]; {S:109215 E:109255 D:0 BT: 0}
int x = 0; {S:109260 E:109269 D:0 BT: 0}
for(int i = 0;i<allVars.length;i ++){} {S:109274 E:109394 D:0 BT: 0}
return rtnVal; {S:109399 E:109412 D:0 BT: 0}
****************************/
/***************************
Processing list:
int strCount = 0; {S:108323 E:108339 D:0 BT: 0}
int[]usage = new int[ci.vars.size()]; {S:108344 E:108381 D:0 BT: 0}
VarInfoTest[]allVars = new VarInfoTest[ci.vars.size()]; {S:108386 E:108433 D:0 BT: 0}
for(int i = 0;i<ci.vars.size();i ++){} {S:108438 E:108522 D:0 BT: 0}
<sublist>
allVars[i]= ci.vars.getVar(i); {S:108487 E:108517 D:1 BT: 0}
</sublist>
for(int k = 0;k<in.size();k ++){} {S:108527 E:108899 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(k); {S:108571 E:108598 D:1 BT: 0}
String[]rVal = li.getRValue(); {S:108604 E:108634 D:1 BT: 0}
for(int i = 0;i<rVal.length;i ++){} {S:108640 E:108894 D:1 BT: 0}
<sublist>
for(int j = 0;j<allVars.length;j ++){} {S:108688 E:108888 D:2 BT: 0}
</sublist>
</sublist>
for(int i = 0;i<params.length;i ++){} {S:108981 E:109210 D:0 BT: 0}
<sublist>
for(int j = 0;j<allVars.length;j ++){} {S:109029 E:109205 D:1 BT: 0}
</sublist>
VarInfoTest[]rtnVal = new VarInfoTest[strCount]; {S:109215 E:109255 D:0 BT: 0}
int x = 0; {S:109260 E:109269 D:0 BT: 0}
for(int i = 0;i<allVars.length;i ++){} {S:109274 E:109394 D:0 BT: 0}
return rtnVal; {S:109399 E:109412 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:108749 E:108881 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:108749 E:108881 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:109079 E:109199 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:109079 E:109199 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:109322 E:109389 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:109322 E:109389 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(rVal[i].equals(allVars[j].getName())){} {S:108750 E:108881 D:3 BT: 1}
usage[j]= 1; {S:108859 E:108871 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(rVal[i].equals(allVars[j].getName())){} {S:108750 E:108881 D:3 BT: 1}
usage[j]= 1; {S:108859 E:108871 D:4 BT: 0}
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
if(usage[j]>0 && params[i].getName().equals(allVars[j].getName())){} {S:109080 E:109199 D:2 BT: 1}
usage[j]= 0; {S:109162 E:109174 D:3 BT: 0}
strCount --; {S:109182 E:109192 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(usage[j]>0 && params[i].getName().equals(allVars[j].getName())){} {S:109080 E:109199 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:109162 E:0 D:3 BT: 0}
usage[j]= 0; {S:109162 E:109174 D:3 BT: 0}
strCount --; {S:109182 E:109192 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#8(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#9(4) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(usage[i]>0){} {S:109323 E:109389 D:1 BT: 1}
rtnVal[x]= allVars[i]; {S:109351 E:109373 D:2 BT: 0}
x ++; {S:109380 E:109383 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(usage[i]>0){} {S:109323 E:109389 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:109351 E:0 D:2 BT: 0}
rtnVal[x]= allVars[i]; {S:109351 E:109373 D:2 BT: 0}
x ++; {S:109380 E:109383 D:2 BT: 0}
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
//#11(5) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:108809 E:108848 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:108809 E:108848 D:4 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#12(11) Type:1 Paths:1 CP:8
/***************************
Processing list:
if(usage[j]== 0) {S:108810 E:108848 D:4 BT: 1}
strCount ++; {S:108838 E:108848 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(usage[j]== 0){} {S:108810 E:108848 D:4 BT: 1}
QuicktestRunner.execPath += 8; {S:108838 E:0 D:5 BT: 0}
strCount ++; {S:108838 E:108848 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#13(11) Type:2 Paths:1 CP:4

/***************************
Processing list:
else {S:108848 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 4; {S:108849 E:0 D:5 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int strCount = 0; {S:108323 E:108339 D:0 BT: 0}
int[]usage = new int[ci.vars.size()]; {S:108344 E:108381 D:0 BT: 0}
VarInfoTest[]allVars = new VarInfoTest[ci.vars.size()]; {S:108386 E:108433 D:0 BT: 0}
for(int i = 0;i<ci.vars.size();i ++){} {S:108438 E:108522 D:0 BT: 0}
<sublist>
allVars[i]= ci.vars.getVar(i); {S:108487 E:108517 D:1 BT: 0}
</sublist>
allVars[i]= ci.vars.getVar(i); {S:108487 E:108517 D:1 BT: 0}
for(int k = 0;k<in.size();k ++){} {S:108527 E:108899 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(k); {S:108571 E:108598 D:1 BT: 0}
String[]rVal = li.getRValue(); {S:108604 E:108634 D:1 BT: 0}
for(int i = 0;i<rVal.length;i ++){} {S:108640 E:108894 D:1 BT: 0}
<sublist>
for(int j = 0;j<allVars.length;j ++){} {S:108688 E:108888 D:2 BT: 0}
</sublist>
</sublist>
LineInfoTest li = in.getLine(k); {S:108571 E:108598 D:1 BT: 0}
String[]rVal = li.getRValue(); {S:108604 E:108634 D:1 BT: 0}
for(int i = 0;i<rVal.length;i ++){} {S:108640 E:108894 D:1 BT: 0}
<sublist>
for(int j = 0;j<allVars.length;j ++){} {S:108688 E:108888 D:2 BT: 0}
</sublist>
for(int j = 0;j<allVars.length;j ++){} {S:108688 E:108888 D:2 BT: 0}
 {S:108749 E:108881 D:3 BT: 7}
if(rVal[i].equals(allVars[j].getName())){} {S:108750 E:108881 D:3 BT: 1}
 {S:108809 E:108848 D:4 BT: 7}
if(usage[j]== 0){} {S:108810 E:108848 D:4 BT: 1}
QuicktestRunner.execPath += 8; {S:108838 E:0 D:5 BT: 0}
strCount ++; {S:108838 E:108848 D:5 BT: 0}
else {S:108848 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 4; {S:108849 E:0 D:5 BT: 0}
usage[j]= 1; {S:108859 E:108871 D:4 BT: 0}
for(int i = 0;i<params.length;i ++){} {S:108981 E:109210 D:0 BT: 0}
<sublist>
for(int j = 0;j<allVars.length;j ++){} {S:109029 E:109205 D:1 BT: 0}
</sublist>
for(int j = 0;j<allVars.length;j ++){} {S:109029 E:109205 D:1 BT: 0}
 {S:109079 E:109199 D:2 BT: 7}
if(usage[j]>0 && params[i].getName().equals(allVars[j].getName())){} {S:109080 E:109199 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:109162 E:0 D:3 BT: 0}
usage[j]= 0; {S:109162 E:109174 D:3 BT: 0}
strCount --; {S:109182 E:109192 D:3 BT: 0}
VarInfoTest[]rtnVal = new VarInfoTest[strCount]; {S:109215 E:109255 D:0 BT: 0}
int x = 0; {S:109260 E:109269 D:0 BT: 0}
for(int i = 0;i<allVars.length;i ++){} {S:109274 E:109394 D:0 BT: 0}
 {S:109322 E:109389 D:1 BT: 7}
if(usage[i]>0){} {S:109323 E:109389 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:109351 E:0 D:2 BT: 0}
rtnVal[x]= allVars[i]; {S:109351 E:109373 D:2 BT: 0}
x ++; {S:109380 E:109383 D:2 BT: 0}
return rtnVal; {S:109399 E:109412 D:0 BT: 0}
****************************/
   int strCount = 0; //S:108323   E:108339 D: 0BT: 0
   int[]usage = new int[ci.vars.size()]; //S:108344   E:108381 D: 0BT: 0
   VarInfoTest[]allVars = new VarInfoTest[ci.vars.size()]; //S:108386   E:108433 D: 0BT: 0
   for(int i = 0;i<ci.vars.size();i ++) //S:108438   E:108522 D: 0BT: 0
   {
      allVars[i]= ci.vars.getVar(i); //S:108487   E:108517 D: 1BT: 0
   }
   for(int k = 0;k<in.size();k ++) //S:108527   E:108899 D: 0BT: 0
   {
      LineInfoTest li = in.getLine(k); //S:108571   E:108598 D: 1BT: 0
      String[]rVal = li.getRValue(); //S:108604   E:108634 D: 1BT: 0
      for(int i = 0;i<rVal.length;i ++) //S:108640   E:108894 D: 1BT: 0
      {
         for(int j = 0;j<allVars.length;j ++) //S:108688   E:108888 D: 2BT: 0
         {
             //S:108749   E:108881 D: 3BT: 7
            if(rVal[i].equals(allVars[j].getName())) //S:108750   E:108881 D: 3BT: 1
            {
                //S:108809   E:108848 D: 4BT: 7
               if(usage[j]== 0) //S:108810   E:108848 D: 4BT: 1
               {
                  QuicktestRunner.execPath += 8; //S:108838   E:0 D: 5BT: 0
                  strCount ++; //S:108838   E:108848 D: 5BT: 0
               }
               else //S:108848   E:0 D: 4BT: 0
               {
                  QuicktestRunner.execPath += 4; //S:108849   E:0 D: 5BT: 0
               }
               usage[j]= 1; //S:108859   E:108871 D: 4BT: 0
            }
         }
      }
   }
   for(int i = 0;i<params.length;i ++) //S:108981   E:109210 D: 0BT: 0
   {
      for(int j = 0;j<allVars.length;j ++) //S:109029   E:109205 D: 1BT: 0
      {
          //S:109079   E:109199 D: 2BT: 7
         if(usage[j]>0 && params[i].getName().equals(allVars[j].getName())) //S:109080   E:109199 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:109162   E:0 D: 3BT: 0
            usage[j]= 0; //S:109162   E:109174 D: 3BT: 0
            strCount --; //S:109182   E:109192 D: 3BT: 0
         }
      }
   }
   VarInfoTest[]rtnVal = new VarInfoTest[strCount]; //S:109215   E:109255 D: 0BT: 0
   int x = 0; //S:109260   E:109269 D: 0BT: 0
   for(int i = 0;i<allVars.length;i ++) //S:109274   E:109394 D: 0BT: 0
   {
       //S:109322   E:109389 D: 1BT: 7
      if(usage[i]>0) //S:109323   E:109389 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:109351   E:0 D: 2BT: 0
         rtnVal[x]= allVars[i]; //S:109351   E:109373 D: 2BT: 0
         x ++; //S:109380   E:109383 D: 2BT: 0
      }
   }
   return rtnVal; //S:109399   E:109412 D: 0BT: 0
   }

   public static VarInfoTest[] getMethodParams(MethodInfoTest mi)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
VarInfoTest[]rtnVal = new VarInfoTest[mi.params.size()]; {S:109493 E:109541 D:0 BT: 0}
for(int i = 0;i<mi.params.size();i ++)rtnVal[i]= mi.params.getVar(i); {S:109548 E:109627 D:0 BT: 0}
return rtnVal; {S:109634 E:109647 D:0 BT: 0}
****************************/
/***************************
Processing list:
VarInfoTest[]rtnVal = new VarInfoTest[mi.params.size()]; {S:109493 E:109541 D:0 BT: 0}
for(int i = 0;i<mi.params.size();i ++)rtnVal[i]= mi.params.getVar(i); {S:109548 E:109627 D:0 BT: 0}
return rtnVal; {S:109634 E:109647 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
VarInfoTest[]rtnVal = new VarInfoTest[mi.params.size()]; {S:109493 E:109541 D:0 BT: 0}
for(int i = 0;i<mi.params.size();i ++)rtnVal[i]= mi.params.getVar(i); {S:109548 E:109627 D:0 BT: 0}
return rtnVal; {S:109634 E:109647 D:0 BT: 0}
****************************/
   VarInfoTest[]rtnVal = new VarInfoTest[mi.params.size()]; //S:109493   E:109541 D: 0BT: 0
   for(int i = 0;i<mi.params.size();i ++)rtnVal[i]= mi.params.getVar(i); //S:109548   E:109627 D: 0BT: 0
   return rtnVal; //S:109634   E:109647 D: 0BT: 0
   }

   private void getInputs(LineListTest in, ClassInfoTest ci, MethodInfoTest mi)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
params = getMethodParams(mi); {S:109740 E:109768 D:0 BT: 0}
lineInputs = getLineInputs(in , ci , params); {S:109775 E:109817 D:0 BT: 0}
****************************/
/***************************
Processing list:
params = getMethodParams(mi); {S:109740 E:109768 D:0 BT: 0}
lineInputs = getLineInputs(in , ci , params); {S:109775 E:109817 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
params = getMethodParams(mi); {S:109740 E:109768 D:0 BT: 0}
lineInputs = getLineInputs(in , ci , params); {S:109775 E:109817 D:0 BT: 0}
****************************/
   params = getMethodParams(mi); //S:109740   E:109768 D: 0BT: 0
   lineInputs = getLineInputs(in , ci , params); //S:109775   E:109817 D: 0BT: 0
   }

   private static VarListTest getTestScope(ClassListTest cl, MethodInfoTest mi)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
VarListTest rtnVal = new VarListTest(); {S:110268 E:110298 D:0 BT: 0}
ClassInfoTest ci = cl.findClassWithMethod(mi); {S:110305 E:110346 D:0 BT: 0}
rtnVal.addAll(ci.vars); {S:110353 E:110375 D:0 BT: 0}
rtnVal.addAll(mi.params); {S:110382 E:110406 D:0 BT: 0}
return rtnVal; {S:110413 E:110426 D:0 BT: 0}
****************************/
/***************************
Processing list:
VarListTest rtnVal = new VarListTest(); {S:110268 E:110298 D:0 BT: 0}
ClassInfoTest ci = cl.findClassWithMethod(mi); {S:110305 E:110346 D:0 BT: 0}
rtnVal.addAll(ci.vars); {S:110353 E:110375 D:0 BT: 0}
rtnVal.addAll(mi.params); {S:110382 E:110406 D:0 BT: 0}
return rtnVal; {S:110413 E:110426 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
VarListTest rtnVal = new VarListTest(); {S:110268 E:110298 D:0 BT: 0}
ClassInfoTest ci = cl.findClassWithMethod(mi); {S:110305 E:110346 D:0 BT: 0}
rtnVal.addAll(ci.vars); {S:110353 E:110375 D:0 BT: 0}
rtnVal.addAll(mi.params); {S:110382 E:110406 D:0 BT: 0}
return rtnVal; {S:110413 E:110426 D:0 BT: 0}
****************************/
   VarListTest rtnVal = new VarListTest(); //S:110268   E:110298 D: 0BT: 0
   ClassInfoTest ci = cl.findClassWithMethod(mi); //S:110305   E:110346 D: 0BT: 0
   rtnVal.addAll(ci.vars); //S:110353   E:110375 D: 0BT: 0
   rtnVal.addAll(mi.params); //S:110382   E:110406 D: 0BT: 0
   return rtnVal; //S:110413   E:110426 D: 0BT: 0
   }

   public static AssertionListTest findAssertions(LineListTest in, ClassListTest cl, MethodInfoTest mi)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
AssertionListTest rtnVal = new AssertionListTest(); {S:110597 E:110639 D:0 BT: 0}
VarListTest scope = getTestScope(cl , mi); {S:110646 E:110682 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:110689 E:111072 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:110737 E:110764 D:1 BT: 0}
AssertionInfoTest ai = li.yieldsAssertion(cl , mi , scope); {S:110772 E:110824 D:1 BT: 0}
</sublist>
rtnVal.elimDuplicates(); {S:111079 E:111102 D:0 BT: 0}
rtnVal.setupReqClasses(); {S:111109 E:111133 D:0 BT: 0}
return rtnVal; {S:111140 E:111153 D:0 BT: 0}
****************************/
/***************************
Processing list:
AssertionListTest rtnVal = new AssertionListTest(); {S:110597 E:110639 D:0 BT: 0}
VarListTest scope = getTestScope(cl , mi); {S:110646 E:110682 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:110689 E:111072 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:110737 E:110764 D:1 BT: 0}
AssertionInfoTest ai = li.yieldsAssertion(cl , mi , scope); {S:110772 E:110824 D:1 BT: 0}
</sublist>
rtnVal.elimDuplicates(); {S:111079 E:111102 D:0 BT: 0}
rtnVal.setupReqClasses(); {S:111109 E:111133 D:0 BT: 0}
return rtnVal; {S:111140 E:111153 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:110831 E:111065 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:110831 E:111065 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(ai != null){} {S:110832 E:111065 D:1 BT: 1}
ai.line = li.assertionLine; {S:110862 E:110888 D:2 BT: 0}
rtnVal.add(ai); {S:111043 E:111057 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ai != null){} {S:110832 E:111065 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:110862 E:0 D:2 BT: 0}
ai.line = li.assertionLine; {S:110862 E:110888 D:2 BT: 0}
rtnVal.add(ai); {S:111043 E:111057 D:2 BT: 0}
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
AssertionListTest rtnVal = new AssertionListTest(); {S:110597 E:110639 D:0 BT: 0}
VarListTest scope = getTestScope(cl , mi); {S:110646 E:110682 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:110689 E:111072 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:110737 E:110764 D:1 BT: 0}
AssertionInfoTest ai = li.yieldsAssertion(cl , mi , scope); {S:110772 E:110824 D:1 BT: 0}
</sublist>
LineInfoTest li = in.getLine(i); {S:110737 E:110764 D:1 BT: 0}
AssertionInfoTest ai = li.yieldsAssertion(cl , mi , scope); {S:110772 E:110824 D:1 BT: 0}
 {S:110831 E:111065 D:1 BT: 7}
if(ai != null){} {S:110832 E:111065 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:110862 E:0 D:2 BT: 0}
ai.line = li.assertionLine; {S:110862 E:110888 D:2 BT: 0}
rtnVal.add(ai); {S:111043 E:111057 D:2 BT: 0}
rtnVal.elimDuplicates(); {S:111079 E:111102 D:0 BT: 0}
rtnVal.setupReqClasses(); {S:111109 E:111133 D:0 BT: 0}
return rtnVal; {S:111140 E:111153 D:0 BT: 0}
****************************/
   AssertionListTest rtnVal = new AssertionListTest(); //S:110597   E:110639 D: 0BT: 0
   VarListTest scope = getTestScope(cl , mi); //S:110646   E:110682 D: 0BT: 0
   for(int i = 0;i<in.size();i ++) //S:110689   E:111072 D: 0BT: 0
   {
      LineInfoTest li = in.getLine(i); //S:110737   E:110764 D: 1BT: 0
      AssertionInfoTest ai = li.yieldsAssertion(cl , mi , scope); //S:110772   E:110824 D: 1BT: 0
       //S:110831   E:111065 D: 1BT: 7
      if(ai != null) //S:110832   E:111065 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:110862   E:0 D: 2BT: 0
         ai.line = li.assertionLine; //S:110862   E:110888 D: 2BT: 0
         rtnVal.add(ai); //S:111043   E:111057 D: 2BT: 0
      }
   }
   rtnVal.elimDuplicates(); //S:111079   E:111102 D: 0BT: 0
   rtnVal.setupReqClasses(); //S:111109   E:111133 D: 0BT: 0
   return rtnVal; //S:111140   E:111153 D: 0BT: 0
   }

   String[] getTestLines()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return testLines; {S:111202 E:111218 D:0 BT: 0}
****************************/
/***************************
Processing list:
return testLines; {S:111202 E:111218 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return testLines; {S:111202 E:111218 D:0 BT: 0}
****************************/
   return testLines; //S:111202   E:111218 D: 0BT: 0
   }

   public String getIconState()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
int iconState = compileState * 4 + testState; {S:111274 E:111318 D:0 BT: 0}
return("ts" + iconState + ".gif"); {S:111327 E:111360 D:0 BT: 0}
****************************/
/***************************
Processing list:
int iconState = compileState * 4 + testState; {S:111274 E:111318 D:0 BT: 0}
return("ts" + iconState + ".gif"); {S:111327 E:111360 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int iconState = compileState * 4 + testState; {S:111274 E:111318 D:0 BT: 0}
return("ts" + iconState + ".gif"); {S:111327 E:111360 D:0 BT: 0}
****************************/
   int iconState = compileState * 4 + testState; //S:111274   E:111318 D: 0BT: 0
   return("ts" + iconState + ".gif"); //S:111327   E:111360 D: 0BT: 0
   }

   public String getNoveltyState()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
String ns = "O"; {S:111564 E:111579 D:0 BT: 0}
return("ts" + ns + ".gif"); {S:111625 E:111651 D:0 BT: 0}
****************************/
/***************************
Processing list:
String ns = "O"; {S:111564 E:111579 D:0 BT: 0}
return("ts" + ns + ".gif"); {S:111625 E:111651 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:111585 E:111618 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:111585 E:111618 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(testIndex>0) {S:111586 E:111618 D:0 BT: 1}
ns = "N"; {S:111610 E:111618 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(testIndex>0){} {S:111586 E:111618 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:111610 E:0 D:1 BT: 0}
ns = "N"; {S:111610 E:111618 D:1 BT: 0}
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
String ns = "O"; {S:111564 E:111579 D:0 BT: 0}
 {S:111585 E:111618 D:0 BT: 7}
if(testIndex>0){} {S:111586 E:111618 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:111610 E:0 D:1 BT: 0}
ns = "N"; {S:111610 E:111618 D:1 BT: 0}
return("ts" + ns + ".gif"); {S:111625 E:111651 D:0 BT: 0}
****************************/
   String ns = "O"; //S:111564   E:111579 D: 0BT: 0
    //S:111585   E:111618 D: 0BT: 7
   if(testIndex>0) //S:111586   E:111618 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:111610   E:0 D: 1BT: 0
      ns = "N"; //S:111610   E:111618 D: 1BT: 0
   }
   return("ts" + ns + ".gif"); //S:111625   E:111651 D: 0BT: 0
   }

   public String getTestCode(String tab, ClassListTest cl)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String rtnVal = getTestCode(tab); {S:111731 E:111763 D:0 BT: 0}
return rtnVal; {S:111800 E:111813 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = getTestCode(tab); {S:111731 E:111763 D:0 BT: 0}
return rtnVal; {S:111800 E:111813 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = getTestCode(tab); {S:111731 E:111763 D:0 BT: 0}
return rtnVal; {S:111800 E:111813 D:0 BT: 0}
****************************/
   String rtnVal = getTestCode(tab); //S:111731   E:111763 D: 0BT: 0
   return rtnVal; //S:111800   E:111813 D: 0BT: 0
   }

   public String getTestCode(String tab)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:6 CP:0
/***************************
Processing list:
String ctorClass = ""; {S:111902 E:111923 D:0 BT: 0}
asserts.elimDuplicates(); {S:112068 E:112092 D:0 BT: 0}
String rtnVal = "public void " + this.name + "()\n"; {S:112099 E:112150 D:0 BT: 0}
rtnVal += "{\n"; {S:112157 E:112172 D:0 BT: 0}
rtnVal += tab + "//Class Setup\n"; {S:112179 E:112212 D:0 BT: 0}
rtnVal += asserts.getReqClasses(tab); {S:112219 E:112255 D:0 BT: 0}
rtnVal += tab + "//Line Inputs\n"; {S:112262 E:112295 D:0 BT: 0}
for(int i = 0;i<lineInputs.length;i ++){} {S:112302 E:112608 D:0 BT: 0}
<sublist>
String val = inputValues[i]; {S:112358 E:112385 D:1 BT: 0}
rtnVal += tab + lineInputs[i].getName()+ " = " + val + ";\n"; {S:112432 E:112493 D:1 BT: 0}
</sublist>
rtnVal += tab + "//Add'l Setup\n"; {S:112615 E:112648 D:0 BT: 0}
rtnVal += addlSetup + "\n"; {S:112655 E:112681 D:0 BT: 0}
rtnVal += tab + "//Test Code\n"; {S:112688 E:112719 D:0 BT: 0}
rtnVal += genMethodCall(tab); {S:112726 E:112754 D:0 BT: 0}
for(int i = 0;i<asserts.size();i ++){} {S:112761 E:112906 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = asserts.getAssertion(i); {S:112814 E:112856 D:1 BT: 0}
rtnVal += ai.outputLine(tab)+ "\n"; {S:112864 E:112899 D:1 BT: 0}
</sublist>
rtnVal += tab + "//Post-test\n"; {S:112913 E:112944 D:0 BT: 0}
rtnVal += postAsserts + "\n"; {S:112951 E:112979 D:0 BT: 0}
rtnVal += "}\n"; {S:112986 E:113001 D:0 BT: 0}
return rtnVal; {S:113008 E:113021 D:0 BT: 0}
****************************/
/***************************
Processing list:
String ctorClass = ""; {S:111902 E:111923 D:0 BT: 0}
asserts.elimDuplicates(); {S:112068 E:112092 D:0 BT: 0}
String rtnVal = "public void " + this.name + "()\n"; {S:112099 E:112150 D:0 BT: 0}
rtnVal += "{\n"; {S:112157 E:112172 D:0 BT: 0}
rtnVal += tab + "//Class Setup\n"; {S:112179 E:112212 D:0 BT: 0}
rtnVal += asserts.getReqClasses(tab); {S:112219 E:112255 D:0 BT: 0}
rtnVal += tab + "//Line Inputs\n"; {S:112262 E:112295 D:0 BT: 0}
for(int i = 0;i<lineInputs.length;i ++){} {S:112302 E:112608 D:0 BT: 0}
<sublist>
String val = inputValues[i]; {S:112358 E:112385 D:1 BT: 0}
rtnVal += tab + lineInputs[i].getName()+ " = " + val + ";\n"; {S:112432 E:112493 D:1 BT: 0}
</sublist>
rtnVal += tab + "//Add'l Setup\n"; {S:112615 E:112648 D:0 BT: 0}
rtnVal += addlSetup + "\n"; {S:112655 E:112681 D:0 BT: 0}
rtnVal += tab + "//Test Code\n"; {S:112688 E:112719 D:0 BT: 0}
rtnVal += genMethodCall(tab); {S:112726 E:112754 D:0 BT: 0}
for(int i = 0;i<asserts.size();i ++){} {S:112761 E:112906 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = asserts.getAssertion(i); {S:112814 E:112856 D:1 BT: 0}
rtnVal += ai.outputLine(tab)+ "\n"; {S:112864 E:112899 D:1 BT: 0}
</sublist>
rtnVal += tab + "//Post-test\n"; {S:112913 E:112944 D:0 BT: 0}
rtnVal += postAsserts + "\n"; {S:112951 E:112979 D:0 BT: 0}
rtnVal += "}\n"; {S:112986 E:113001 D:0 BT: 0}
return rtnVal; {S:113008 E:113021 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:111929 E:112061 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:111929 E:112061 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:112392 E:112424 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:112392 E:112424 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(assocMethod != null){} {S:111930 E:112061 D:0 BT: 1}
****************************/
/***************************
Processing list:
if(assocMethod != null){} {S:111930 E:112061 D:0 BT: 1}
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
if(val == null) {S:112393 E:112424 D:1 BT: 1}
val = ""; {S:112416 E:112424 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(val == null){} {S:112393 E:112424 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:112416 E:0 D:2 BT: 0}
val = ""; {S:112416 E:112424 D:2 BT: 0}
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
 {S:111966 E:112054 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:111966 E:112054 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#9(8) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(assocMethod.returnType.getType().equals("ctor")) {S:111967 E:112054 D:1 BT: 1}
ctorClass = assocMethod.name; {S:112026 E:112054 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(assocMethod.returnType.getType().equals("ctor")){} {S:111967 E:112054 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:112026 E:0 D:2 BT: 0}
ctorClass = assocMethod.name; {S:112026 E:112054 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#10(8) Type:2 Paths:1 CP:2

/***************************
Processing list:
else {S:112054 E:0 D:1 BT: 0}
QuicktestRunner.execPath += 2; {S:112055 E:0 D:2 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String ctorClass = ""; {S:111902 E:111923 D:0 BT: 0}
 {S:111929 E:112061 D:0 BT: 7}
if(assocMethod != null){} {S:111930 E:112061 D:0 BT: 1}
 {S:111966 E:112054 D:1 BT: 7}
if(assocMethod.returnType.getType().equals("ctor")){} {S:111967 E:112054 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:112026 E:0 D:2 BT: 0}
ctorClass = assocMethod.name; {S:112026 E:112054 D:2 BT: 0}
else {S:112054 E:0 D:1 BT: 0}
QuicktestRunner.execPath += 2; {S:112055 E:0 D:2 BT: 0}
asserts.elimDuplicates(); {S:112068 E:112092 D:0 BT: 0}
String rtnVal = "public void " + this.name + "()\n"; {S:112099 E:112150 D:0 BT: 0}
rtnVal += "{\n"; {S:112157 E:112172 D:0 BT: 0}
rtnVal += tab + "//Class Setup\n"; {S:112179 E:112212 D:0 BT: 0}
rtnVal += asserts.getReqClasses(tab); {S:112219 E:112255 D:0 BT: 0}
rtnVal += tab + "//Line Inputs\n"; {S:112262 E:112295 D:0 BT: 0}
for(int i = 0;i<lineInputs.length;i ++){} {S:112302 E:112608 D:0 BT: 0}
<sublist>
String val = inputValues[i]; {S:112358 E:112385 D:1 BT: 0}
rtnVal += tab + lineInputs[i].getName()+ " = " + val + ";\n"; {S:112432 E:112493 D:1 BT: 0}
</sublist>
String val = inputValues[i]; {S:112358 E:112385 D:1 BT: 0}
 {S:112392 E:112424 D:1 BT: 7}
if(val == null){} {S:112393 E:112424 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:112416 E:0 D:2 BT: 0}
val = ""; {S:112416 E:112424 D:2 BT: 0}
rtnVal += tab + lineInputs[i].getName()+ " = " + val + ";\n"; {S:112432 E:112493 D:1 BT: 0}
rtnVal += tab + "//Add'l Setup\n"; {S:112615 E:112648 D:0 BT: 0}
rtnVal += addlSetup + "\n"; {S:112655 E:112681 D:0 BT: 0}
rtnVal += tab + "//Test Code\n"; {S:112688 E:112719 D:0 BT: 0}
rtnVal += genMethodCall(tab); {S:112726 E:112754 D:0 BT: 0}
for(int i = 0;i<asserts.size();i ++){} {S:112761 E:112906 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = asserts.getAssertion(i); {S:112814 E:112856 D:1 BT: 0}
rtnVal += ai.outputLine(tab)+ "\n"; {S:112864 E:112899 D:1 BT: 0}
</sublist>
AssertionInfoTest ai = asserts.getAssertion(i); {S:112814 E:112856 D:1 BT: 0}
rtnVal += ai.outputLine(tab)+ "\n"; {S:112864 E:112899 D:1 BT: 0}
rtnVal += tab + "//Post-test\n"; {S:112913 E:112944 D:0 BT: 0}
rtnVal += postAsserts + "\n"; {S:112951 E:112979 D:0 BT: 0}
rtnVal += "}\n"; {S:112986 E:113001 D:0 BT: 0}
return rtnVal; {S:113008 E:113021 D:0 BT: 0}
****************************/
   String ctorClass = ""; //S:111902   E:111923 D: 0BT: 0
    //S:111929   E:112061 D: 0BT: 7
   if(assocMethod != null) //S:111930   E:112061 D: 0BT: 1
   {
       //S:111966   E:112054 D: 1BT: 7
      if(assocMethod.returnType.getType().equals("ctor")) //S:111967   E:112054 D: 1BT: 1
      {
         QuicktestRunner.execPath += 4; //S:112026   E:0 D: 2BT: 0
         ctorClass = assocMethod.name; //S:112026   E:112054 D: 2BT: 0
      }
      else //S:112054   E:0 D: 1BT: 0
      {
         QuicktestRunner.execPath += 2; //S:112055   E:0 D: 2BT: 0
      }
   }
   asserts.elimDuplicates(); //S:112068   E:112092 D: 0BT: 0
   String rtnVal = "public void " + this.name + "()\n"; //S:112099   E:112150 D: 0BT: 0
   rtnVal += "{\n"; //S:112157   E:112172 D: 0BT: 0
   rtnVal += tab + "//Class Setup\n"; //S:112179   E:112212 D: 0BT: 0
   rtnVal += asserts.getReqClasses(tab); //S:112219   E:112255 D: 0BT: 0
   rtnVal += tab + "//Line Inputs\n"; //S:112262   E:112295 D: 0BT: 0
   for(int i = 0;i<lineInputs.length;i ++) //S:112302   E:112608 D: 0BT: 0
   {
      String val = inputValues[i]; //S:112358   E:112385 D: 1BT: 0
       //S:112392   E:112424 D: 1BT: 7
      if(val == null) //S:112393   E:112424 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:112416   E:0 D: 2BT: 0
         val = ""; //S:112416   E:112424 D: 2BT: 0
      }
      rtnVal += tab + lineInputs[i].getName()+ " = " + val + ";\n"; //S:112432   E:112493 D: 1BT: 0
   }
   rtnVal += tab + "//Add'l Setup\n"; //S:112615   E:112648 D: 0BT: 0
   rtnVal += addlSetup + "\n"; //S:112655   E:112681 D: 0BT: 0
   rtnVal += tab + "//Test Code\n"; //S:112688   E:112719 D: 0BT: 0
   rtnVal += genMethodCall(tab); //S:112726   E:112754 D: 0BT: 0
   for(int i = 0;i<asserts.size();i ++) //S:112761   E:112906 D: 0BT: 0
   {
      AssertionInfoTest ai = asserts.getAssertion(i); //S:112814   E:112856 D: 1BT: 0
      rtnVal += ai.outputLine(tab)+ "\n"; //S:112864   E:112899 D: 1BT: 0
   }
   rtnVal += tab + "//Post-test\n"; //S:112913   E:112944 D: 0BT: 0
   rtnVal += postAsserts + "\n"; //S:112951   E:112979 D: 0BT: 0
   rtnVal += "}\n"; //S:112986   E:113001 D: 0BT: 0
   return rtnVal; //S:113008   E:113021 D: 0BT: 0
   }

   public void testMatch(String in, ClassListTest cl)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:32 CP:0
/***************************
Processing list:
boolean mismatch = false; {S:113120 E:113144 D:0 BT: 0}
TestInfoTest t2 = new TestInfoTest(); {S:113151 E:113179 D:0 BT: 0}
t2.gatherTestInfoTest(in , assocMethod , cl , lineInputs.length); {S:113186 E:113243 D:0 BT: 0}
for(int i = 0;i<asserts.size();i ++){} {S:113250 E:114498 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = asserts.getAssertion(i); {S:113303 E:113345 D:1 BT: 0}
AssertionInfoTest ai2 = t2.asserts.getAssertion(i); {S:113353 E:113399 D:1 BT: 0}
System.out.println("Assertion:" + i); {S:113407 E:113443 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
boolean mismatch = false; {S:113120 E:113144 D:0 BT: 0}
TestInfoTest t2 = new TestInfoTest(); {S:113151 E:113179 D:0 BT: 0}
t2.gatherTestInfoTest(in , assocMethod , cl , lineInputs.length); {S:113186 E:113243 D:0 BT: 0}
for(int i = 0;i<asserts.size();i ++){} {S:113250 E:114498 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = asserts.getAssertion(i); {S:113303 E:113345 D:1 BT: 0}
AssertionInfoTest ai2 = t2.asserts.getAssertion(i); {S:113353 E:113399 D:1 BT: 0}
System.out.println("Assertion:" + i); {S:113407 E:113443 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:113450 E:113798 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:113450 E:113798 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:113805 E:113995 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:113805 E:113995 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:114009 E:114205 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:114009 E:114205 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#5(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:114212 E:114396 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:114212 E:114396 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#6(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:114403 E:114484 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:114403 E:114484 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#7(2) Type:1 Paths:1 CP:16
/***************************
Processing list:
if(! ai.dataType.getName().equals(ai2.dataType.getName())|| ! ai.dataType.getType().equals(ai2.dataType.getType())){} {S:113451 E:113798 D:1 BT: 1}
mismatch = true; {S:113581 E:113596 D:2 BT: 0}
System.out.println("1:dataType:" + ai.dataType.getName()+ ":" + ai.dataType.getType()); {S:113605 E:113692 D:2 BT: 0}
System.out.println("2:dataType:" + ai2.dataType.getName()+ ":" + ai2.dataType.getType()); {S:113701 E:113790 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(! ai.dataType.getName().equals(ai2.dataType.getName())|| ! ai.dataType.getType().equals(ai2.dataType.getType())){} {S:113451 E:113798 D:1 BT: 1}
QuicktestRunner.execPath += 16; {S:113581 E:0 D:2 BT: 0}
mismatch = true; {S:113581 E:113596 D:2 BT: 0}
System.out.println("1:dataType:" + ai.dataType.getName()+ ":" + ai.dataType.getType()); {S:113605 E:113692 D:2 BT: 0}
System.out.println("2:dataType:" + ai2.dataType.getName()+ ":" + ai2.dataType.getType()); {S:113701 E:113790 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#8(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#9(3) Type:1 Paths:1 CP:8
/***************************
Processing list:
if(! ai.expValue.equals(ai2.expValue)){} {S:113806 E:113995 D:1 BT: 1}
mismatch = true; {S:113859 E:113874 D:2 BT: 0}
System.out.println("1:expValue:" + ai.expValue); {S:113883 E:113930 D:2 BT: 0}
System.out.println("2:expValue:" + ai2.expValue); {S:113939 E:113987 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(! ai.expValue.equals(ai2.expValue)){} {S:113806 E:113995 D:1 BT: 1}
QuicktestRunner.execPath += 8; {S:113859 E:0 D:2 BT: 0}
mismatch = true; {S:113859 E:113874 D:2 BT: 0}
System.out.println("1:expValue:" + ai.expValue); {S:113883 E:113930 D:2 BT: 0}
System.out.println("2:expValue:" + ai2.expValue); {S:113939 E:113987 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#10(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#11(4) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(! ai.fromClass.equals(ai2.fromClass)){} {S:114010 E:114205 D:1 BT: 1}
mismatch = true; {S:114065 E:114080 D:2 BT: 0}
System.out.println("1:fromClass:" + ai.fromClass); {S:114089 E:114138 D:2 BT: 0}
System.out.println("2:fromClass:" + ai2.fromClass); {S:114147 E:114197 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(! ai.fromClass.equals(ai2.fromClass)){} {S:114010 E:114205 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:114065 E:0 D:2 BT: 0}
mismatch = true; {S:114065 E:114080 D:2 BT: 0}
System.out.println("1:fromClass:" + ai.fromClass); {S:114089 E:114138 D:2 BT: 0}
System.out.println("2:fromClass:" + ai2.fromClass); {S:114147 E:114197 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#12(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#13(5) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(ai.isReturn != ai2.isReturn){} {S:114213 E:114396 D:1 BT: 1}
mismatch = true; {S:114260 E:114275 D:2 BT: 0}
System.out.println("1:isReturn:" + ai.isReturn); {S:114284 E:114331 D:2 BT: 0}
System.out.println("2:isReturn:" + ai2.isReturn); {S:114340 E:114388 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ai.isReturn != ai2.isReturn){} {S:114213 E:114396 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:114260 E:0 D:2 BT: 0}
mismatch = true; {S:114260 E:114275 D:2 BT: 0}
System.out.println("1:isReturn:" + ai.isReturn); {S:114284 E:114331 D:2 BT: 0}
System.out.println("2:isReturn:" + ai2.isReturn); {S:114340 E:114388 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#14(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#15(6) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(mismatch){} {S:114404 E:114484 D:1 BT: 1}
try{} {S:114432 E:114456 D:2 BT: 0}
<sublist>
Thread.sleep(10000); {S:114436 E:114455 D:3 BT: 0}
</sublist>
catch(Exception e){} {S:114457 E:114476 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(mismatch){} {S:114404 E:114484 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:114432 E:0 D:2 BT: 0}
try{} {S:114432 E:114456 D:2 BT: 0}
<sublist>
Thread.sleep(10000); {S:114436 E:114455 D:3 BT: 0}
</sublist>
catch(Exception e){} {S:114457 E:114476 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#16(6) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
boolean mismatch = false; {S:113120 E:113144 D:0 BT: 0}
TestInfoTest t2 = new TestInfoTest(); {S:113151 E:113179 D:0 BT: 0}
t2.gatherTestInfoTest(in , assocMethod , cl , lineInputs.length); {S:113186 E:113243 D:0 BT: 0}
for(int i = 0;i<asserts.size();i ++){} {S:113250 E:114498 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = asserts.getAssertion(i); {S:113303 E:113345 D:1 BT: 0}
AssertionInfoTest ai2 = t2.asserts.getAssertion(i); {S:113353 E:113399 D:1 BT: 0}
System.out.println("Assertion:" + i); {S:113407 E:113443 D:1 BT: 0}
</sublist>
AssertionInfoTest ai = asserts.getAssertion(i); {S:113303 E:113345 D:1 BT: 0}
AssertionInfoTest ai2 = t2.asserts.getAssertion(i); {S:113353 E:113399 D:1 BT: 0}
System.out.println("Assertion:" + i); {S:113407 E:113443 D:1 BT: 0}
 {S:113450 E:113798 D:1 BT: 7}
if(! ai.dataType.getName().equals(ai2.dataType.getName())|| ! ai.dataType.getType().equals(ai2.dataType.getType())){} {S:113451 E:113798 D:1 BT: 1}
QuicktestRunner.execPath += 16; {S:113581 E:0 D:2 BT: 0}
mismatch = true; {S:113581 E:113596 D:2 BT: 0}
System.out.println("1:dataType:" + ai.dataType.getName()+ ":" + ai.dataType.getType()); {S:113605 E:113692 D:2 BT: 0}
System.out.println("2:dataType:" + ai2.dataType.getName()+ ":" + ai2.dataType.getType()); {S:113701 E:113790 D:2 BT: 0}
 {S:113805 E:113995 D:1 BT: 7}
if(! ai.expValue.equals(ai2.expValue)){} {S:113806 E:113995 D:1 BT: 1}
QuicktestRunner.execPath += 8; {S:113859 E:0 D:2 BT: 0}
mismatch = true; {S:113859 E:113874 D:2 BT: 0}
System.out.println("1:expValue:" + ai.expValue); {S:113883 E:113930 D:2 BT: 0}
System.out.println("2:expValue:" + ai2.expValue); {S:113939 E:113987 D:2 BT: 0}
 {S:114009 E:114205 D:1 BT: 7}
if(! ai.fromClass.equals(ai2.fromClass)){} {S:114010 E:114205 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:114065 E:0 D:2 BT: 0}
mismatch = true; {S:114065 E:114080 D:2 BT: 0}
System.out.println("1:fromClass:" + ai.fromClass); {S:114089 E:114138 D:2 BT: 0}
System.out.println("2:fromClass:" + ai2.fromClass); {S:114147 E:114197 D:2 BT: 0}
 {S:114212 E:114396 D:1 BT: 7}
if(ai.isReturn != ai2.isReturn){} {S:114213 E:114396 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:114260 E:0 D:2 BT: 0}
mismatch = true; {S:114260 E:114275 D:2 BT: 0}
System.out.println("1:isReturn:" + ai.isReturn); {S:114284 E:114331 D:2 BT: 0}
System.out.println("2:isReturn:" + ai2.isReturn); {S:114340 E:114388 D:2 BT: 0}
 {S:114403 E:114484 D:1 BT: 7}
if(mismatch){} {S:114404 E:114484 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:114432 E:0 D:2 BT: 0}
try{} {S:114432 E:114456 D:2 BT: 0}
<sublist>
Thread.sleep(10000); {S:114436 E:114455 D:3 BT: 0}
</sublist>
Thread.sleep(10000); {S:114436 E:114455 D:3 BT: 0}
catch(Exception e){} {S:114457 E:114476 D:2 BT: 0}
****************************/
   boolean mismatch = false; //S:113120   E:113144 D: 0BT: 0
   TestInfoTest t2 = new TestInfoTest(); //S:113151   E:113179 D: 0BT: 0
   t2.gatherTestInfoTest(in , assocMethod , cl , lineInputs.length); //S:113186   E:113243 D: 0BT: 0
   for(int i = 0;i<asserts.size();i ++) //S:113250   E:114498 D: 0BT: 0
   {
      AssertionInfoTest ai = asserts.getAssertion(i); //S:113303   E:113345 D: 1BT: 0
      AssertionInfoTest ai2 = t2.asserts.getAssertion(i); //S:113353   E:113399 D: 1BT: 0
      System.out.println("Assertion:" + i); //S:113407   E:113443 D: 1BT: 0
       //S:113450   E:113798 D: 1BT: 7
      if(! ai.dataType.getName().equals(ai2.dataType.getName())|| ! ai.dataType.getType().equals(ai2.dataType.getType())) //S:113451   E:113798 D: 1BT: 1
      {
         QuicktestRunner.execPath += 16; //S:113581   E:0 D: 2BT: 0
         mismatch = true; //S:113581   E:113596 D: 2BT: 0
         System.out.println("1:dataType:" + ai.dataType.getName()+ ":" + ai.dataType.getType()); //S:113605   E:113692 D: 2BT: 0
         System.out.println("2:dataType:" + ai2.dataType.getName()+ ":" + ai2.dataType.getType()); //S:113701   E:113790 D: 2BT: 0
      }
       //S:113805   E:113995 D: 1BT: 7
      if(! ai.expValue.equals(ai2.expValue)) //S:113806   E:113995 D: 1BT: 1
      {
         QuicktestRunner.execPath += 8; //S:113859   E:0 D: 2BT: 0
         mismatch = true; //S:113859   E:113874 D: 2BT: 0
         System.out.println("1:expValue:" + ai.expValue); //S:113883   E:113930 D: 2BT: 0
         System.out.println("2:expValue:" + ai2.expValue); //S:113939   E:113987 D: 2BT: 0
      }
       //S:114009   E:114205 D: 1BT: 7
      if(! ai.fromClass.equals(ai2.fromClass)) //S:114010   E:114205 D: 1BT: 1
      {
         QuicktestRunner.execPath += 4; //S:114065   E:0 D: 2BT: 0
         mismatch = true; //S:114065   E:114080 D: 2BT: 0
         System.out.println("1:fromClass:" + ai.fromClass); //S:114089   E:114138 D: 2BT: 0
         System.out.println("2:fromClass:" + ai2.fromClass); //S:114147   E:114197 D: 2BT: 0
      }
       //S:114212   E:114396 D: 1BT: 7
      if(ai.isReturn != ai2.isReturn) //S:114213   E:114396 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:114260   E:0 D: 2BT: 0
         mismatch = true; //S:114260   E:114275 D: 2BT: 0
         System.out.println("1:isReturn:" + ai.isReturn); //S:114284   E:114331 D: 2BT: 0
         System.out.println("2:isReturn:" + ai2.isReturn); //S:114340   E:114388 D: 2BT: 0
      }
       //S:114403   E:114484 D: 1BT: 7
      if(mismatch) //S:114404   E:114484 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:114432   E:0 D: 2BT: 0
         try //S:114432   E:114456 D: 2BT: 0
         {
            Thread.sleep(10000); //S:114436   E:114455 D: 3BT: 0
         }
         catch(Exception e){} //S:114457   E:114476 D: 2BT: 0
      }
   }
   }

   public String getInputValue(int num)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return inputValues[num]; {S:114563 E:114586 D:0 BT: 0}
****************************/
/***************************
Processing list:
return inputValues[num]; {S:114563 E:114586 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return inputValues[num]; {S:114563 E:114586 D:0 BT: 0}
****************************/
   return inputValues[num]; //S:114563   E:114586 D: 0BT: 0
   }

   private String genMethodCall(String tab)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:18 CP:0
/***************************
Processing list:
MethodInfoTest mi = assocMethod; {S:114655 E:114682 D:0 BT: 0}
String rtnVal = "" + tab; {S:114776 E:114800 D:0 BT: 0}
return rtnVal + ";\n"; {S:115507 E:115528 D:0 BT: 0}
****************************/
/***************************
Processing list:
MethodInfoTest mi = assocMethod; {S:114655 E:114682 D:0 BT: 0}
String rtnVal = "" + tab; {S:114776 E:114800 D:0 BT: 0}
return rtnVal + ";\n"; {S:115507 E:115528 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:114738 E:114769 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:114738 E:114769 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:114807 E:115079 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:114807 E:115079 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:115093 E:115500 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:115093 E:115500 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:9
/***************************
Processing list:
if(mi == null) {S:114739 E:114769 D:0 BT: 1}
return ""; {S:114760 E:114769 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(mi == null){} {S:114739 E:114769 D:0 BT: 1}
QuicktestRunner.execPath += 9; {S:114760 E:0 D:1 BT: 0}
return ""; {S:114760 E:114769 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:1 CP:6
/***************************
Processing list:
if(mi.returnType.getType().equals("ctor"))else if(mi.returnType.getType().equals("void"))rtnVal += mi.name + "(" {S:114808 E:114916 D:0 BT: 1}
rtnVal += mi.name + " rtnVal = new " + mi.name + "("; {S:114857 E:114909 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(mi.returnType.getType().equals("ctor")){} {S:114808 E:114916 D:0 BT: 1}
QuicktestRunner.execPath += 6; {S:114857 E:0 D:1 BT: 0}
rtnVal += mi.name + " rtnVal = new " + mi.name + "("; {S:114857 E:114909 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#8(3) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:114917 E:115079 D:0 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:114917 E:115079 D:0 BT: 2}
****************************/
//=======================================
//=======================================
//#9(4) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(params.length == 0)else{} {S:115094 E:115150 D:0 BT: 1}
rtnVal += ")"; {S:115124 E:115137 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(params.length == 0){} {S:115094 E:115150 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:115124 E:0 D:1 BT: 0}
rtnVal += ")"; {S:115124 E:115137 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:115151 E:115500 D:0 BT: 2}
for(int i = 0;i<params.length;i ++){} {S:115208 E:115492 D:0 BT: 0}
<sublist>
rtnVal += inputValues[i + lineInputs.length]; {S:115348 E:115392 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
else{} {S:115151 E:115500 D:0 BT: 2}
for(int i = 0;i<params.length;i ++){} {S:115208 E:115492 D:1 BT: 0}
<sublist>
rtnVal += inputValues[i + lineInputs.length]; {S:115348 E:115392 D:2 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(8) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:114921 E:115079 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:114921 E:115079 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#12(10) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:115400 E:115484 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:115400 E:115484 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#13(11) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(mi.returnType.getType().equals("void"))else rtnVal += mi.returnType.getType()+ " rtnVal = " + mi.name + "("; {S:114922 E:115009 D:2 BT: 1}
rtnVal += mi.name + "("; {S:114972 E:114995 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(mi.returnType.getType().equals("void")){} {S:114922 E:115009 D:2 BT: 1}
QuicktestRunner.execPath += 3; {S:114972 E:0 D:3 BT: 0}
rtnVal += mi.name + "("; {S:114972 E:114995 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#14(11) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:115010 E:115079 D:2 BT: 2}
rtnVal += mi.returnType.getType()+ " rtnVal = " + mi.name + "("; {S:115015 E:115079 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:115010 E:115079 D:2 BT: 2}
rtnVal += mi.returnType.getType()+ " rtnVal = " + mi.name + "("; {S:115015 E:115079 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#15(12) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(i == params.length - 1)else rtnVal += ","; {S:115401 E:115465 D:3 BT: 1}
rtnVal += ")"; {S:115436 E:115449 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(i == params.length - 1){} {S:115401 E:115465 D:3 BT: 1}
QuicktestRunner.execPath += 1; {S:115436 E:0 D:4 BT: 0}
rtnVal += ")"; {S:115436 E:115449 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#16(12) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:115466 E:115484 D:3 BT: 2}
rtnVal += ","; {S:115471 E:115484 D:3 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:115466 E:115484 D:3 BT: 2}
rtnVal += ","; {S:115471 E:115484 D:4 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
MethodInfoTest mi = assocMethod; {S:114655 E:114682 D:0 BT: 0}
 {S:114738 E:114769 D:0 BT: 7}
if(mi == null){} {S:114739 E:114769 D:0 BT: 1}
QuicktestRunner.execPath += 9; {S:114760 E:0 D:1 BT: 0}
return ""; {S:114760 E:114769 D:1 BT: 0}
String rtnVal = "" + tab; {S:114776 E:114800 D:0 BT: 0}
 {S:114807 E:115079 D:0 BT: 7}
if(mi.returnType.getType().equals("ctor")){} {S:114808 E:114916 D:0 BT: 1}
QuicktestRunner.execPath += 6; {S:114857 E:0 D:1 BT: 0}
rtnVal += mi.name + " rtnVal = new " + mi.name + "("; {S:114857 E:114909 D:1 BT: 0}
else{} {S:114917 E:115079 D:0 BT: 2}
 {S:114921 E:115079 D:1 BT: 7}
if(mi.returnType.getType().equals("void")){} {S:114922 E:115009 D:1 BT: 1}
QuicktestRunner.execPath += 3; {S:114972 E:0 D:2 BT: 0}
rtnVal += mi.name + "("; {S:114972 E:114995 D:2 BT: 0}
else{} {S:115010 E:115079 D:1 BT: 2}
rtnVal += mi.returnType.getType()+ " rtnVal = " + mi.name + "("; {S:115015 E:115079 D:2 BT: 0}
 {S:115093 E:115500 D:0 BT: 7}
if(params.length == 0){} {S:115094 E:115150 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:115124 E:0 D:1 BT: 0}
rtnVal += ")"; {S:115124 E:115137 D:1 BT: 0}
else{} {S:115151 E:115500 D:0 BT: 2}
for(int i = 0;i<params.length;i ++){} {S:115208 E:115492 D:1 BT: 0}
<sublist>
rtnVal += inputValues[i + lineInputs.length]; {S:115348 E:115392 D:2 BT: 0}
</sublist>
rtnVal += inputValues[i + lineInputs.length]; {S:115348 E:115392 D:2 BT: 0}
 {S:115400 E:115484 D:2 BT: 7}
if(i == params.length - 1){} {S:115401 E:115465 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:115436 E:0 D:3 BT: 0}
rtnVal += ")"; {S:115436 E:115449 D:3 BT: 0}
else{} {S:115466 E:115484 D:2 BT: 2}
rtnVal += ","; {S:115471 E:115484 D:3 BT: 0}
return rtnVal + ";\n"; {S:115507 E:115528 D:0 BT: 0}
****************************/
   MethodInfoTest mi = assocMethod; //S:114655   E:114682 D: 0BT: 0
    //S:114738   E:114769 D: 0BT: 7
   if(mi == null) //S:114739   E:114769 D: 0BT: 1
   {
      QuicktestRunner.execPath += 9; //S:114760   E:0 D: 1BT: 0
      return ""; //S:114760   E:114769 D: 1BT: 0
   }
   String rtnVal = "" + tab; //S:114776   E:114800 D: 0BT: 0
    //S:114807   E:115079 D: 0BT: 7
   if(mi.returnType.getType().equals("ctor")) //S:114808   E:114916 D: 0BT: 1
   {
      QuicktestRunner.execPath += 6; //S:114857   E:0 D: 1BT: 0
      rtnVal += mi.name + " rtnVal = new " + mi.name + "("; //S:114857   E:114909 D: 1BT: 0
   }
   else //S:114917   E:115079 D: 0BT: 2
   {
       //S:114921   E:115079 D: 1BT: 7
      if(mi.returnType.getType().equals("void")) //S:114922   E:115009 D: 1BT: 1
      {
         QuicktestRunner.execPath += 3; //S:114972   E:0 D: 2BT: 0
         rtnVal += mi.name + "("; //S:114972   E:114995 D: 2BT: 0
      }
      else //S:115010   E:115079 D: 1BT: 2
      {
         rtnVal += mi.returnType.getType()+ " rtnVal = " + mi.name + "("; //S:115015   E:115079 D: 2BT: 0
      }
   }
    //S:115093   E:115500 D: 0BT: 7
   if(params.length == 0) //S:115094   E:115150 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:115124   E:0 D: 1BT: 0
      rtnVal += ")"; //S:115124   E:115137 D: 1BT: 0
   }
   else //S:115151   E:115500 D: 0BT: 2
   {
      for(int i = 0;i<params.length;i ++) //S:115208   E:115492 D: 1BT: 0
      {
         rtnVal += inputValues[i + lineInputs.length]; //S:115348   E:115392 D: 2BT: 0
          //S:115400   E:115484 D: 2BT: 7
         if(i == params.length - 1) //S:115401   E:115465 D: 2BT: 1
         {
            QuicktestRunner.execPath += 1; //S:115436   E:0 D: 3BT: 0
            rtnVal += ")"; //S:115436   E:115449 D: 3BT: 0
         }
         else //S:115466   E:115484 D: 2BT: 2
         {
            rtnVal += ","; //S:115471   E:115484 D: 3BT: 0
         }
      }
   }
   return rtnVal + ";\n"; //S:115507   E:115528 D: 0BT: 0
   }

   public void setTestCode(String in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
testCode = in; {S:119799 E:119812 D:0 BT: 0}
****************************/
/***************************
Processing list:
testCode = in; {S:119799 E:119812 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
testCode = in; {S:119799 E:119812 D:0 BT: 0}
****************************/
   testCode = in; //S:119799   E:119812 D: 0BT: 0
   }

   public void setCommentName(String in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
commentName = in; {S:119875 E:119891 D:0 BT: 0}
****************************/
/***************************
Processing list:
commentName = in; {S:119875 E:119891 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
commentName = in; {S:119875 E:119891 D:0 BT: 0}
****************************/
   commentName = in; //S:119875   E:119891 D: 0BT: 0
   }

   public String getCommentName()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return commentName; {S:119947 E:119965 D:0 BT: 0}
****************************/
/***************************
Processing list:
return commentName; {S:119947 E:119965 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return commentName; {S:119947 E:119965 D:0 BT: 0}
****************************/
   return commentName; //S:119947   E:119965 D: 0BT: 0
   }

   public MethodInfoTest getAssocMethod()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return assocMethod; {S:120025 E:120043 D:0 BT: 0}
****************************/
/***************************
Processing list:
return assocMethod; {S:120025 E:120043 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return assocMethod; {S:120025 E:120043 D:0 BT: 0}
****************************/
   return assocMethod; //S:120025   E:120043 D: 0BT: 0
   }

   public void setAssocMethod(MethodInfoTest mi)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
assocMethod = mi; {S:120110 E:120126 D:0 BT: 0}
****************************/
/***************************
Processing list:
assocMethod = mi; {S:120110 E:120126 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
assocMethod = mi; {S:120110 E:120126 D:0 BT: 0}
****************************/
   assocMethod = mi; //S:120110   E:120126 D: 0BT: 0
   }

   public void output()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
System.out.println(name); {S:120175 E:120199 D:0 BT: 0}
****************************/
/***************************
Processing list:
System.out.println(name); {S:120175 E:120199 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:120205 E:120290 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:120205 E:120290 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(testLineListTest != null){} {S:120206 E:120290 D:0 BT: 1}
testLineListTest.outputWTDepth("   " , true); {S:120244 E:120283 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(testLineListTest != null){} {S:120206 E:120290 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:120244 E:0 D:1 BT: 0}
testLineListTest.outputWTDepth("   " , true); {S:120244 E:120283 D:1 BT: 0}
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
System.out.println(name); {S:120175 E:120199 D:0 BT: 0}
 {S:120205 E:120290 D:0 BT: 7}
if(testLineListTest != null){} {S:120206 E:120290 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:120244 E:0 D:1 BT: 0}
testLineListTest.outputWTDepth("   " , true); {S:120244 E:120283 D:1 BT: 0}
****************************/
   System.out.println(name); //S:120175   E:120199 D: 0BT: 0
    //S:120205   E:120290 D: 0BT: 7
   if(testLineListTest != null) //S:120206   E:120290 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:120244   E:0 D: 1BT: 0
      testLineListTest.outputWTDepth("   " , true); //S:120244   E:120283 D: 1BT: 0
   }
   }

public void outputTest_0()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   output();
   //Post-test

}

public void outputTest_1()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   output();
   //Post-test

}

   public int getTestIndex() 
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return testIndex; {S:120336 E:120352 D:0 BT: 0}
****************************/
/***************************
Processing list:
return testIndex; {S:120336 E:120352 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return testIndex; {S:120336 E:120352 D:0 BT: 0}
****************************/
   return testIndex; //S:120336   E:120352 D: 0BT: 0
   }

   public boolean isComplete()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
for(int i = 0;i<this.inputValues.length;i ++){} {S:120486 E:120621 D:0 BT: 0}
for(int i = 0;i<asserts.size();i ++){} {S:120626 E:120771 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = asserts.getAssertion(i); {S:120675 E:120717 D:1 BT: 0}
</sublist>
return true; {S:120776 E:120787 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<this.inputValues.length;i ++){} {S:120486 E:120621 D:0 BT: 0}
for(int i = 0;i<asserts.size();i ++){} {S:120626 E:120771 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = asserts.getAssertion(i); {S:120675 E:120717 D:1 BT: 0}
</sublist>
return true; {S:120776 E:120787 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:120543 E:120616 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:120543 E:120616 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:120722 E:120766 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:120722 E:120766 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(inputValues[i]== null || inputValues[i].isEmpty()) {S:120544 E:120616 D:1 BT: 1}
return false; {S:120604 E:120616 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(inputValues[i]== null || inputValues[i].isEmpty()){} {S:120544 E:120616 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:120604 E:0 D:2 BT: 0}
return false; {S:120604 E:120616 D:2 BT: 0}
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
if(ai.expValue.isEmpty()) {S:120723 E:120766 D:1 BT: 1}
return false; {S:120754 E:120766 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ai.expValue.isEmpty()){} {S:120723 E:120766 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:120754 E:0 D:2 BT: 0}
return false; {S:120754 E:120766 D:2 BT: 0}
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
for(int i = 0;i<this.inputValues.length;i ++){} {S:120486 E:120621 D:0 BT: 0}
 {S:120543 E:120616 D:1 BT: 7}
if(inputValues[i]== null || inputValues[i].isEmpty()){} {S:120544 E:120616 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:120604 E:0 D:2 BT: 0}
return false; {S:120604 E:120616 D:2 BT: 0}
for(int i = 0;i<asserts.size();i ++){} {S:120626 E:120771 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = asserts.getAssertion(i); {S:120675 E:120717 D:1 BT: 0}
</sublist>
AssertionInfoTest ai = asserts.getAssertion(i); {S:120675 E:120717 D:1 BT: 0}
 {S:120722 E:120766 D:1 BT: 7}
if(ai.expValue.isEmpty()){} {S:120723 E:120766 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:120754 E:0 D:2 BT: 0}
return false; {S:120754 E:120766 D:2 BT: 0}
return true; {S:120776 E:120787 D:0 BT: 0}
****************************/
   for(int i = 0;i<this.inputValues.length;i ++) //S:120486   E:120621 D: 0BT: 0
   {
       //S:120543   E:120616 D: 1BT: 7
      if(inputValues[i]== null || inputValues[i].isEmpty()) //S:120544   E:120616 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:120604   E:0 D: 2BT: 0
         return false; //S:120604   E:120616 D: 2BT: 0
      }
   }
   for(int i = 0;i<asserts.size();i ++) //S:120626   E:120771 D: 0BT: 0
   {
      AssertionInfoTest ai = asserts.getAssertion(i); //S:120675   E:120717 D: 1BT: 0
       //S:120722   E:120766 D: 1BT: 7
      if(ai.expValue.isEmpty()) //S:120723   E:120766 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:120754   E:0 D: 2BT: 0
         return false; //S:120754   E:120766 D: 2BT: 0
      }
   }
   return true; //S:120776   E:120787 D: 0BT: 0
   }

   public void gatherTestInfoTest(String in, MethodInfoTest mi, ClassListTest cl, int nLineInputs)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:648 CP:0
/***************************
Processing list:
clear(); {S:120889 E:120896 D:0 BT: 0}
System.out.println(in); {S:120901 E:120923 D:0 BT: 0}
lineInputs = new VarInfoTest[nLineInputs]; {S:120928 E:120965 D:0 BT: 0}
params = new VarInfoTest[mi.params.size()]; {S:120970 E:121008 D:0 BT: 0}
inputValues = new String[nLineInputs + mi.params.size()]; {S:121013 E:121069 D:0 BT: 0}
int i = 2; {S:121074 E:121083 D:0 BT: 0}
int tempIndex = 0; {S:121088 E:121105 D:0 BT: 0}
String[]lines = in.split("\n"); {S:121110 E:121141 D:0 BT: 0}
System.out.println("NLIs:" + nLineInputs); {S:121279 E:121320 D:0 BT: 0}
String lne = lines[i].trim(); {S:121325 E:121353 D:0 BT: 0}
System.out.println(lne); {S:122606 E:122629 D:0 BT: 0}
addlSetup = addlSetup.substring(0 , addlSetup.length()- 1); {S:122892 E:122950 D:0 BT: 0}
i ++; {S:122955 E:122958 D:0 BT: 0}
lne = lines[i]; {S:122963 E:122977 D:0 BT: 0}
for(int j = 0;j<mi.params.size();j ++)this.params[j]= mi.params.getVar(j); {S:122982 E:123064 D:0 BT: 0}
System.out.println(lne); {S:123069 E:123092 D:0 BT: 0}
String pList = lne.substring(lne.indexOf("(")+ 1 , lne.lastIndexOf(");")); {S:123097 E:123170 D:0 BT: 0}
System.out.println("|" + pList + "|"); {S:123175 E:123212 D:0 BT: 0}
do{} {S:123440 E:123885 D:0 BT: 0}
<sublist>
i ++; {S:123452 E:123455 D:1 BT: 0}
lne = lines[i].trim(); {S:123461 E:123482 D:1 BT: 0}
System.out.println("Loop4: " + i + ":" + lne); {S:123488 E:123533 D:1 BT: 0}
</sublist>
postAsserts = postAsserts.substring(0 , postAsserts.length()- 1); {S:124141 E:124205 D:0 BT: 0}
asserts.setupReqClasses(); {S:124210 E:124235 D:0 BT: 0}
for(int k = 0;k<asserts.size();k ++){} {S:124240 E:124358 D:0 BT: 0}
<sublist>
System.out.println("|" + asserts.getAssertion(k).expValue + "|"); {S:124289 E:124353 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
clear(); {S:120889 E:120896 D:0 BT: 0}
System.out.println(in); {S:120901 E:120923 D:0 BT: 0}
lineInputs = new VarInfoTest[nLineInputs]; {S:120928 E:120965 D:0 BT: 0}
params = new VarInfoTest[mi.params.size()]; {S:120970 E:121008 D:0 BT: 0}
inputValues = new String[nLineInputs + mi.params.size()]; {S:121013 E:121069 D:0 BT: 0}
int i = 2; {S:121074 E:121083 D:0 BT: 0}
int tempIndex = 0; {S:121088 E:121105 D:0 BT: 0}
String[]lines = in.split("\n"); {S:121110 E:121141 D:0 BT: 0}
System.out.println("NLIs:" + nLineInputs); {S:121279 E:121320 D:0 BT: 0}
String lne = lines[i].trim(); {S:121325 E:121353 D:0 BT: 0}
System.out.println(lne); {S:122606 E:122629 D:0 BT: 0}
addlSetup = addlSetup.substring(0 , addlSetup.length()- 1); {S:122892 E:122950 D:0 BT: 0}
i ++; {S:122955 E:122958 D:0 BT: 0}
lne = lines[i]; {S:122963 E:122977 D:0 BT: 0}
for(int j = 0;j<mi.params.size();j ++)this.params[j]= mi.params.getVar(j); {S:122982 E:123064 D:0 BT: 0}
System.out.println(lne); {S:123069 E:123092 D:0 BT: 0}
String pList = lne.substring(lne.indexOf("(")+ 1 , lne.lastIndexOf(");")); {S:123097 E:123170 D:0 BT: 0}
System.out.println("|" + pList + "|"); {S:123175 E:123212 D:0 BT: 0}
do{} {S:123440 E:123885 D:0 BT: 0}
<sublist>
i ++; {S:123452 E:123455 D:1 BT: 0}
lne = lines[i].trim(); {S:123461 E:123482 D:1 BT: 0}
System.out.println("Loop4: " + i + ":" + lne); {S:123488 E:123533 D:1 BT: 0}
</sublist>
postAsserts = postAsserts.substring(0 , postAsserts.length()- 1); {S:124141 E:124205 D:0 BT: 0}
asserts.setupReqClasses(); {S:124210 E:124235 D:0 BT: 0}
for(int k = 0;k<asserts.size();k ++){} {S:124240 E:124358 D:0 BT: 0}
<sublist>
System.out.println("|" + asserts.getAssertion(k).expValue + "|"); {S:124289 E:124353 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:121357 E:121639 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:121357 E:121639 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:121643 E:122601 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:121643 E:122601 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:122633 E:122887 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:122633 E:122887 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#5(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:123265 E:123411 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:123265 E:123411 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#6(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:123538 E:123868 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:123538 E:123868 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#7(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:123889 E:124136 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:123889 E:124136 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(lne.startsWith("//Class Setup")){} {S:121358 E:121639 D:0 BT: 1}
do{} {S:121403 E:121615 D:1 BT: 0}
<sublist>
i ++; {S:121417 E:121420 D:2 BT: 0}
lne = lines[i].trim(); {S:121427 E:121448 D:2 BT: 0}
System.out.println("Loop1: " + i + ":" + lne); {S:121455 E:121500 D:2 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(lne.startsWith("//Class Setup")){} {S:121358 E:121639 D:0 BT: 1}
do{} {S:121403 E:121615 D:1 BT: 0}
<sublist>
i ++; {S:121417 E:121420 D:2 BT: 0}
lne = lines[i].trim(); {S:121427 E:121448 D:2 BT: 0}
System.out.println("Loop1: " + i + ":" + lne); {S:121455 E:121500 D:2 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#9(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#10(3) Type:1 Paths:3 CP:0
/***************************
Processing list:
if(lne.startsWith("//Line Inputs")){} {S:121644 E:122601 D:0 BT: 1}
tempIndex = 0; {S:121689 E:121702 D:1 BT: 0}
do{} {S:121708 E:122596 D:1 BT: 0}
<sublist>
i ++; {S:121722 E:121725 D:2 BT: 0}
lne = lines[i].trim(); {S:121732 E:121753 D:2 BT: 0}
System.out.println("Loop2: " + i + ":" + lne); {S:121760 E:121805 D:2 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(lne.startsWith("//Line Inputs")){} {S:121644 E:122601 D:0 BT: 1}
tempIndex = 0; {S:121689 E:121702 D:1 BT: 0}
do{} {S:121708 E:122596 D:1 BT: 0}
<sublist>
i ++; {S:121722 E:121725 D:2 BT: 0}
lne = lines[i].trim(); {S:121732 E:121753 D:2 BT: 0}
System.out.println("Loop2: " + i + ":" + lne); {S:121760 E:121805 D:2 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#11(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#12(4) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(lne.startsWith("//Add'l Setup")){} {S:122634 E:122887 D:0 BT: 1}
do{} {S:122679 E:122882 D:1 BT: 0}
<sublist>
i ++; {S:122693 E:122696 D:2 BT: 0}
lne = lines[i]; {S:122703 E:122717 D:2 BT: 0}
System.out.println("Loop3: " + i + ":" + lne); {S:122724 E:122769 D:2 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(lne.startsWith("//Add'l Setup")){} {S:122634 E:122887 D:0 BT: 1}
do{} {S:122679 E:122882 D:1 BT: 0}
<sublist>
i ++; {S:122693 E:122696 D:2 BT: 0}
lne = lines[i]; {S:122703 E:122717 D:2 BT: 0}
System.out.println("Loop3: " + i + ":" + lne); {S:122724 E:122769 D:2 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#13(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#14(5) Type:1 Paths:1 CP:9
/***************************
Processing list:
if(pList.length()>0){} {S:123266 E:123411 D:0 BT: 1}
String[]x = pList.split(","); {S:123298 E:123327 D:1 BT: 0}
for(int j = 0;j<x.length;j ++)inputValues[tempIndex + j]= x[j]; {S:123334 E:123406 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(pList.length()>0){} {S:123266 E:123411 D:0 BT: 1}
QuicktestRunner.execPath += 9; {S:123298 E:0 D:1 BT: 0}
String[]x = pList.split(","); {S:123298 E:123327 D:1 BT: 0}
for(int j = 0;j<x.length;j ++)inputValues[tempIndex + j]= x[j]; {S:123334 E:123406 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#15(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#16(6) Type:1 Paths:1 CP:6
/***************************
Processing list:
if(lne.startsWith("//"))else if(lne.startsWith("}"))break {S:123539 E:123579 D:1 BT: 1}
break; {S:123569 E:123574 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(lne.startsWith("//")){} {S:123539 E:123579 D:1 BT: 1}
QuicktestRunner.execPath += 6; {S:123569 E:0 D:2 BT: 0}
break; {S:123569 E:123574 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#17(6) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:123580 E:123868 D:1 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:123580 E:123868 D:1 BT: 2}
****************************/
//=======================================
//=======================================
//#18(7) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(lne.startsWith("//Post-test")){} {S:123890 E:124136 D:0 BT: 1}
do{} {S:123933 E:124131 D:1 BT: 0}
<sublist>
i ++; {S:123947 E:123950 D:2 BT: 0}
lne = lines[i]; {S:123957 E:123971 D:2 BT: 0}
System.out.println("Loop5: " + i + ":" + lne); {S:123978 E:124023 D:2 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(lne.startsWith("//Post-test")){} {S:123890 E:124136 D:0 BT: 1}
do{} {S:123933 E:124131 D:1 BT: 0}
<sublist>
i ++; {S:123947 E:123950 D:2 BT: 0}
lne = lines[i]; {S:123957 E:123971 D:2 BT: 0}
System.out.println("Loop5: " + i + ":" + lne); {S:123978 E:124023 D:2 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#19(7) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#20(8) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:121506 E:121543 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:121506 E:121543 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#21(10) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:121811 E:122578 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:121811 E:122578 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#22(12) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:122775 E:122864 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:122775 E:122864 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#23(17) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:123584 E:123868 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:123584 E:123868 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#24(18) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:124029 E:124113 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:124029 E:124113 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#25(20) Type:1 Paths:1 CP:432
/***************************
Processing list:
if(lne.startsWith("//")) {S:121507 E:121543 D:2 BT: 1}
break; {S:121538 E:121543 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(lne.startsWith("//")){} {S:121507 E:121543 D:2 BT: 1}
QuicktestRunner.execPath += 432; {S:121538 E:0 D:3 BT: 0}
break; {S:121538 E:121543 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#26(20) Type:2 Paths:1 CP:216

/***************************
Processing list:
else {S:121543 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 216; {S:121544 E:0 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#27(21) Type:1 Paths:1 CP:108
/***************************
Processing list:
if(lne.startsWith("//"))else{} {S:121812 E:121859 D:2 BT: 1}
break; {S:121843 E:121848 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(lne.startsWith("//")){} {S:121812 E:121859 D:2 BT: 1}
QuicktestRunner.execPath += 108; {S:121843 E:0 D:3 BT: 0}
break; {S:121843 E:121848 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#28(21) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:121860 E:122578 D:2 BT: 2}
String[]x = lne.split("="); {S:121873 E:121900 D:2 BT: 0}
this.lineInputs[tempIndex]= varLookup(x[0].trim(), mi , cl , 1); {S:121908 E:121970 D:2 BT: 0}
String y = x[x.length - 1]; {S:122038 E:122064 D:2 BT: 0}
y = y.substring(0 , y.length()- 1); {S:122072 E:122106 D:2 BT: 0}
x[x.length - 1]= y; {S:122139 E:122158 D:2 BT: 0}
String z = x[1]; {S:122206 E:122221 D:2 BT: 0}
z = z.substring(1 , z.length()); {S:122229 E:122259 D:2 BT: 0}
x[1]= z; {S:122267 E:122275 D:2 BT: 0}
this.inputValues[tempIndex]= ""; {S:122290 E:122322 D:2 BT: 0}
for(int j = 1;j<x.length;j ++){} {S:122330 E:122490 D:2 BT: 0}
<sublist>
this.inputValues[tempIndex]+= x[j]; {S:122379 E:122414 D:3 BT: 0}
</sublist>
inputValues[tempIndex]= inputValues[tempIndex].trim(); {S:122498 E:122552 D:2 BT: 0}
tempIndex ++; {S:122560 E:122571 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:121860 E:122578 D:2 BT: 2}
String[]x = lne.split("="); {S:121873 E:121900 D:3 BT: 0}
this.lineInputs[tempIndex]= varLookup(x[0].trim(), mi , cl , 1); {S:121908 E:121970 D:3 BT: 0}
String y = x[x.length - 1]; {S:122038 E:122064 D:3 BT: 0}
y = y.substring(0 , y.length()- 1); {S:122072 E:122106 D:3 BT: 0}
x[x.length - 1]= y; {S:122139 E:122158 D:3 BT: 0}
String z = x[1]; {S:122206 E:122221 D:3 BT: 0}
z = z.substring(1 , z.length()); {S:122229 E:122259 D:3 BT: 0}
x[1]= z; {S:122267 E:122275 D:3 BT: 0}
this.inputValues[tempIndex]= ""; {S:122290 E:122322 D:3 BT: 0}
for(int j = 1;j<x.length;j ++){} {S:122330 E:122490 D:3 BT: 0}
<sublist>
this.inputValues[tempIndex]+= x[j]; {S:122379 E:122414 D:4 BT: 0}
</sublist>
inputValues[tempIndex]= inputValues[tempIndex].trim(); {S:122498 E:122552 D:3 BT: 0}
tempIndex ++; {S:122560 E:122571 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#29(22) Type:1 Paths:1 CP:36
/***************************
Processing list:
if(lne.indexOf("//Test Code")>- 1)else addlSetup += lne + "\n"; {S:122776 E:122835 D:2 BT: 1}
break; {S:122818 E:122823 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(lne.indexOf("//Test Code")>- 1){} {S:122776 E:122835 D:2 BT: 1}
QuicktestRunner.execPath += 36; {S:122818 E:0 D:3 BT: 0}
break; {S:122818 E:122823 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#30(22) Type:2 Paths:1 CP:18
/***************************
Processing list:
 {S:122836 E:122864 D:2 BT: 2}
addlSetup += lne + "\n"; {S:122841 E:122864 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:122836 E:122864 D:2 BT: 2}
QuicktestRunner.execPath += 18; {S:122841 E:0 D:3 BT: 0}
addlSetup += lne + "\n"; {S:122841 E:122864 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#31(23) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(lne.startsWith("}"))else{} {S:123585 E:123628 D:3 BT: 1}
break; {S:123614 E:123619 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(lne.startsWith("}")){} {S:123585 E:123628 D:3 BT: 1}
QuicktestRunner.execPath += 3; {S:123614 E:0 D:4 BT: 0}
break; {S:123614 E:123619 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#32(23) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:123629 E:123868 D:3 BT: 2}
AssertionInfoTest ai = assertionFromTestLine(lne , mi , cl , lines); {S:123719 E:123779 D:3 BT: 0}
asserts.add(ai); {S:123786 E:123801 D:3 BT: 0}
System.out.println("AI.expValue:" + ai.expValue); {S:123808 E:123856 D:3 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:123629 E:123868 D:3 BT: 2}
AssertionInfoTest ai = assertionFromTestLine(lne , mi , cl , lines); {S:123719 E:123779 D:4 BT: 0}
asserts.add(ai); {S:123786 E:123801 D:4 BT: 0}
System.out.println("AI.expValue:" + ai.expValue); {S:123808 E:123856 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#33(24) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(lne.startsWith("}"))else this.postAsserts += lne + "\n"; {S:124030 E:124077 D:2 BT: 1}
break; {S:124060 E:124065 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(lne.startsWith("}")){} {S:124030 E:124077 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:124060 E:0 D:3 BT: 0}
break; {S:124060 E:124065 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#34(24) Type:2 Paths:1 CP:1
/***************************
Processing list:
 {S:124078 E:124113 D:2 BT: 2}
this.postAsserts += lne + "\n"; {S:124083 E:124113 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:124078 E:124113 D:2 BT: 2}
QuicktestRunner.execPath += 1; {S:124083 E:0 D:3 BT: 0}
this.postAsserts += lne + "\n"; {S:124083 E:124113 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#35(28) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:122422 E:122482 D:5 BT: 7}
****************************/
/***************************
Processing list:
 {S:122422 E:122482 D:5 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#36(35) Type:1 Paths:1 CP:108
/***************************
Processing list:
if(x.length>2) {S:122423 E:122482 D:5 BT: 1}
this.inputValues[tempIndex]+= "="; {S:122448 E:122482 D:6 BT: 0}
****************************/
/***************************
Processing list:
if(x.length>2){} {S:122423 E:122482 D:5 BT: 1}
QuicktestRunner.execPath += 108; {S:122448 E:0 D:6 BT: 0}
this.inputValues[tempIndex]+= "="; {S:122448 E:122482 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#37(35) Type:2 Paths:1 CP:54

/***************************
Processing list:
else {S:122482 E:0 D:5 BT: 0}
QuicktestRunner.execPath += 54; {S:122483 E:0 D:6 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
clear(); {S:120889 E:120896 D:0 BT: 0}
System.out.println(in); {S:120901 E:120923 D:0 BT: 0}
lineInputs = new VarInfoTest[nLineInputs]; {S:120928 E:120965 D:0 BT: 0}
params = new VarInfoTest[mi.params.size()]; {S:120970 E:121008 D:0 BT: 0}
inputValues = new String[nLineInputs + mi.params.size()]; {S:121013 E:121069 D:0 BT: 0}
int i = 2; {S:121074 E:121083 D:0 BT: 0}
int tempIndex = 0; {S:121088 E:121105 D:0 BT: 0}
String[]lines = in.split("\n"); {S:121110 E:121141 D:0 BT: 0}
System.out.println("NLIs:" + nLineInputs); {S:121279 E:121320 D:0 BT: 0}
String lne = lines[i].trim(); {S:121325 E:121353 D:0 BT: 0}
 {S:121357 E:121639 D:0 BT: 7}
if(lne.startsWith("//Class Setup")){} {S:121358 E:121639 D:0 BT: 1}
do{} {S:121403 E:121615 D:1 BT: 0}
<sublist>
i ++; {S:121417 E:121420 D:2 BT: 0}
lne = lines[i].trim(); {S:121427 E:121448 D:2 BT: 0}
System.out.println("Loop1: " + i + ":" + lne); {S:121455 E:121500 D:2 BT: 0}
</sublist>
i ++; {S:121417 E:121420 D:2 BT: 0}
lne = lines[i].trim(); {S:121427 E:121448 D:2 BT: 0}
System.out.println("Loop1: " + i + ":" + lne); {S:121455 E:121500 D:2 BT: 0}
 {S:121506 E:121543 D:2 BT: 7}
if(lne.startsWith("//")){} {S:121507 E:121543 D:2 BT: 1}
QuicktestRunner.execPath += 432; {S:121538 E:0 D:3 BT: 0}
break; {S:121538 E:121543 D:3 BT: 0}
else {S:121543 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 216; {S:121544 E:0 D:3 BT: 0}
 {S:121643 E:122601 D:0 BT: 7}
if(lne.startsWith("//Line Inputs")){} {S:121644 E:122601 D:0 BT: 1}
tempIndex = 0; {S:121689 E:121702 D:1 BT: 0}
do{} {S:121708 E:122596 D:1 BT: 0}
<sublist>
i ++; {S:121722 E:121725 D:2 BT: 0}
lne = lines[i].trim(); {S:121732 E:121753 D:2 BT: 0}
System.out.println("Loop2: " + i + ":" + lne); {S:121760 E:121805 D:2 BT: 0}
</sublist>
i ++; {S:121722 E:121725 D:2 BT: 0}
lne = lines[i].trim(); {S:121732 E:121753 D:2 BT: 0}
System.out.println("Loop2: " + i + ":" + lne); {S:121760 E:121805 D:2 BT: 0}
 {S:121811 E:122578 D:2 BT: 7}
if(lne.startsWith("//")){} {S:121812 E:121859 D:2 BT: 1}
QuicktestRunner.execPath += 108; {S:121843 E:0 D:3 BT: 0}
break; {S:121843 E:121848 D:3 BT: 0}
else{} {S:121860 E:122578 D:2 BT: 2}
String[]x = lne.split("="); {S:121873 E:121900 D:3 BT: 0}
this.lineInputs[tempIndex]= varLookup(x[0].trim(), mi , cl , 1); {S:121908 E:121970 D:3 BT: 0}
String y = x[x.length - 1]; {S:122038 E:122064 D:3 BT: 0}
y = y.substring(0 , y.length()- 1); {S:122072 E:122106 D:3 BT: 0}
x[x.length - 1]= y; {S:122139 E:122158 D:3 BT: 0}
String z = x[1]; {S:122206 E:122221 D:3 BT: 0}
z = z.substring(1 , z.length()); {S:122229 E:122259 D:3 BT: 0}
x[1]= z; {S:122267 E:122275 D:3 BT: 0}
this.inputValues[tempIndex]= ""; {S:122290 E:122322 D:3 BT: 0}
for(int j = 1;j<x.length;j ++){} {S:122330 E:122490 D:3 BT: 0}
<sublist>
this.inputValues[tempIndex]+= x[j]; {S:122379 E:122414 D:4 BT: 0}
</sublist>
this.inputValues[tempIndex]+= x[j]; {S:122379 E:122414 D:4 BT: 0}
 {S:122422 E:122482 D:4 BT: 7}
if(x.length>2){} {S:122423 E:122482 D:4 BT: 1}
QuicktestRunner.execPath += 108; {S:122448 E:0 D:5 BT: 0}
this.inputValues[tempIndex]+= "="; {S:122448 E:122482 D:5 BT: 0}
else {S:122482 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 54; {S:122483 E:0 D:5 BT: 0}
inputValues[tempIndex]= inputValues[tempIndex].trim(); {S:122498 E:122552 D:3 BT: 0}
tempIndex ++; {S:122560 E:122571 D:3 BT: 0}
System.out.println(lne); {S:122606 E:122629 D:0 BT: 0}
 {S:122633 E:122887 D:0 BT: 7}
if(lne.startsWith("//Add'l Setup")){} {S:122634 E:122887 D:0 BT: 1}
do{} {S:122679 E:122882 D:1 BT: 0}
<sublist>
i ++; {S:122693 E:122696 D:2 BT: 0}
lne = lines[i]; {S:122703 E:122717 D:2 BT: 0}
System.out.println("Loop3: " + i + ":" + lne); {S:122724 E:122769 D:2 BT: 0}
</sublist>
i ++; {S:122693 E:122696 D:2 BT: 0}
lne = lines[i]; {S:122703 E:122717 D:2 BT: 0}
System.out.println("Loop3: " + i + ":" + lne); {S:122724 E:122769 D:2 BT: 0}
 {S:122775 E:122864 D:2 BT: 7}
if(lne.indexOf("//Test Code")>- 1){} {S:122776 E:122835 D:2 BT: 1}
QuicktestRunner.execPath += 36; {S:122818 E:0 D:3 BT: 0}
break; {S:122818 E:122823 D:3 BT: 0}
else{} {S:122836 E:122864 D:2 BT: 2}
QuicktestRunner.execPath += 18; {S:122841 E:0 D:3 BT: 0}
addlSetup += lne + "\n"; {S:122841 E:122864 D:3 BT: 0}
addlSetup = addlSetup.substring(0 , addlSetup.length()- 1); {S:122892 E:122950 D:0 BT: 0}
i ++; {S:122955 E:122958 D:0 BT: 0}
lne = lines[i]; {S:122963 E:122977 D:0 BT: 0}
for(int j = 0;j<mi.params.size();j ++)this.params[j]= mi.params.getVar(j); {S:122982 E:123064 D:0 BT: 0}
System.out.println(lne); {S:123069 E:123092 D:0 BT: 0}
String pList = lne.substring(lne.indexOf("(")+ 1 , lne.lastIndexOf(");")); {S:123097 E:123170 D:0 BT: 0}
System.out.println("|" + pList + "|"); {S:123175 E:123212 D:0 BT: 0}
 {S:123265 E:123411 D:0 BT: 7}
if(pList.length()>0){} {S:123266 E:123411 D:0 BT: 1}
String[]x = pList.split(","); {S:123298 E:123327 D:1 BT: 0}
QuicktestRunner.execPath += 9; {S:123298 E:0 D:1 BT: 0}
for(int j = 0;j<x.length;j ++)inputValues[tempIndex + j]= x[j]; {S:123334 E:123406 D:1 BT: 0}
do{} {S:123440 E:123885 D:0 BT: 0}
<sublist>
i ++; {S:123452 E:123455 D:1 BT: 0}
lne = lines[i].trim(); {S:123461 E:123482 D:1 BT: 0}
System.out.println("Loop4: " + i + ":" + lne); {S:123488 E:123533 D:1 BT: 0}
</sublist>
i ++; {S:123452 E:123455 D:1 BT: 0}
lne = lines[i].trim(); {S:123461 E:123482 D:1 BT: 0}
System.out.println("Loop4: " + i + ":" + lne); {S:123488 E:123533 D:1 BT: 0}
 {S:123538 E:123868 D:1 BT: 7}
if(lne.startsWith("//")){} {S:123539 E:123579 D:1 BT: 1}
break; {S:123569 E:123574 D:2 BT: 0}
QuicktestRunner.execPath += 6; {S:123569 E:0 D:2 BT: 0}
else{} {S:123580 E:123868 D:1 BT: 2}
 {S:123584 E:123868 D:2 BT: 7}
if(lne.startsWith("}")){} {S:123585 E:123628 D:2 BT: 1}
QuicktestRunner.execPath += 3; {S:123614 E:0 D:3 BT: 0}
break; {S:123614 E:123619 D:3 BT: 0}
else{} {S:123629 E:123868 D:2 BT: 2}
AssertionInfoTest ai = assertionFromTestLine(lne , mi , cl , lines); {S:123719 E:123779 D:3 BT: 0}
asserts.add(ai); {S:123786 E:123801 D:3 BT: 0}
System.out.println("AI.expValue:" + ai.expValue); {S:123808 E:123856 D:3 BT: 0}
 {S:123889 E:124136 D:0 BT: 7}
if(lne.startsWith("//Post-test")){} {S:123890 E:124136 D:0 BT: 1}
do{} {S:123933 E:124131 D:1 BT: 0}
<sublist>
i ++; {S:123947 E:123950 D:2 BT: 0}
lne = lines[i]; {S:123957 E:123971 D:2 BT: 0}
System.out.println("Loop5: " + i + ":" + lne); {S:123978 E:124023 D:2 BT: 0}
</sublist>
i ++; {S:123947 E:123950 D:2 BT: 0}
lne = lines[i]; {S:123957 E:123971 D:2 BT: 0}
System.out.println("Loop5: " + i + ":" + lne); {S:123978 E:124023 D:2 BT: 0}
 {S:124029 E:124113 D:2 BT: 7}
if(lne.startsWith("}")){} {S:124030 E:124077 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:124060 E:0 D:3 BT: 0}
break; {S:124060 E:124065 D:3 BT: 0}
else{} {S:124078 E:124113 D:2 BT: 2}
QuicktestRunner.execPath += 1; {S:124083 E:0 D:3 BT: 0}
this.postAsserts += lne + "\n"; {S:124083 E:124113 D:3 BT: 0}
postAsserts = postAsserts.substring(0 , postAsserts.length()- 1); {S:124141 E:124205 D:0 BT: 0}
asserts.setupReqClasses(); {S:124210 E:124235 D:0 BT: 0}
for(int k = 0;k<asserts.size();k ++){} {S:124240 E:124358 D:0 BT: 0}
<sublist>
System.out.println("|" + asserts.getAssertion(k).expValue + "|"); {S:124289 E:124353 D:1 BT: 0}
</sublist>
System.out.println("|" + asserts.getAssertion(k).expValue + "|"); {S:124289 E:124353 D:1 BT: 0}
****************************/
   clear(); //S:120889   E:120896 D: 0BT: 0
   System.out.println(in); //S:120901   E:120923 D: 0BT: 0
   lineInputs = new VarInfoTest[nLineInputs]; //S:120928   E:120965 D: 0BT: 0
   params = new VarInfoTest[mi.params.size()]; //S:120970   E:121008 D: 0BT: 0
   inputValues = new String[nLineInputs + mi.params.size()]; //S:121013   E:121069 D: 0BT: 0
   int i = 2; //S:121074   E:121083 D: 0BT: 0
   int tempIndex = 0; //S:121088   E:121105 D: 0BT: 0
   String[]lines = in.split("\n"); //S:121110   E:121141 D: 0BT: 0
   System.out.println("NLIs:" + nLineInputs); //S:121279   E:121320 D: 0BT: 0
   String lne = lines[i].trim(); //S:121325   E:121353 D: 0BT: 0
    //S:121357   E:121639 D: 0BT: 7
   if(lne.startsWith("//Class Setup")) //S:121358   E:121639 D: 0BT: 1
   {
      do //S:121403   E:121615 D: 1BT: 0
      {
         i ++; //S:121417   E:121420 D: 2BT: 0
         lne = lines[i].trim(); //S:121427   E:121448 D: 2BT: 0
         System.out.println("Loop1: " + i + ":" + lne); //S:121455   E:121500 D: 2BT: 0
          //S:121506   E:121543 D: 2BT: 7
         if(lne.startsWith("//")) //S:121507   E:121543 D: 2BT: 1
         {
            QuicktestRunner.execPath += 432; //S:121538   E:0 D: 3BT: 0
            break; //S:121538   E:121543 D: 3BT: 0
         }
         else //S:121543   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 216; //S:121544   E:0 D: 3BT: 0
         }
      }while(true );
   }
    //S:121643   E:122601 D: 0BT: 7
   if(lne.startsWith("//Line Inputs")) //S:121644   E:122601 D: 0BT: 1
   {
      tempIndex = 0; //S:121689   E:121702 D: 1BT: 0
      do //S:121708   E:122596 D: 1BT: 0
      {
         i ++; //S:121722   E:121725 D: 2BT: 0
         lne = lines[i].trim(); //S:121732   E:121753 D: 2BT: 0
         System.out.println("Loop2: " + i + ":" + lne); //S:121760   E:121805 D: 2BT: 0
          //S:121811   E:122578 D: 2BT: 7
         if(lne.startsWith("//")) //S:121812   E:121859 D: 2BT: 1
         {
            QuicktestRunner.execPath += 108; //S:121843   E:0 D: 3BT: 0
            break; //S:121843   E:121848 D: 3BT: 0
         }
         else //S:121860   E:122578 D: 2BT: 2
         {
            String[]x = lne.split("="); //S:121873   E:121900 D: 3BT: 0
            this.lineInputs[tempIndex]= varLookup(x[0].trim(), mi , cl , 1); //S:121908   E:121970 D: 3BT: 0
            String y = x[x.length - 1]; //S:122038   E:122064 D: 3BT: 0
            y = y.substring(0 , y.length()- 1); //S:122072   E:122106 D: 3BT: 0
            x[x.length - 1]= y; //S:122139   E:122158 D: 3BT: 0
            String z = x[1]; //S:122206   E:122221 D: 3BT: 0
            z = z.substring(1 , z.length()); //S:122229   E:122259 D: 3BT: 0
            x[1]= z; //S:122267   E:122275 D: 3BT: 0
            this.inputValues[tempIndex]= ""; //S:122290   E:122322 D: 3BT: 0
            for(int j = 1;j<x.length;j ++) //S:122330   E:122490 D: 3BT: 0
            {
               this.inputValues[tempIndex]+= x[j]; //S:122379   E:122414 D: 4BT: 0
                //S:122422   E:122482 D: 4BT: 7
               if(x.length>2) //S:122423   E:122482 D: 4BT: 1
               {
                  QuicktestRunner.execPath += 108; //S:122448   E:0 D: 5BT: 0
                  this.inputValues[tempIndex]+= "="; //S:122448   E:122482 D: 5BT: 0
               }
               else //S:122482   E:0 D: 4BT: 0
               {
                  QuicktestRunner.execPath += 54; //S:122483   E:0 D: 5BT: 0
               }
            }
            inputValues[tempIndex]= inputValues[tempIndex].trim(); //S:122498   E:122552 D: 3BT: 0
            tempIndex ++; //S:122560   E:122571 D: 3BT: 0
         }
      }while(true );
   }
   System.out.println(lne); //S:122606   E:122629 D: 0BT: 0
    //S:122633   E:122887 D: 0BT: 7
   if(lne.startsWith("//Add'l Setup")) //S:122634   E:122887 D: 0BT: 1
   {
      do //S:122679   E:122882 D: 1BT: 0
      {
         i ++; //S:122693   E:122696 D: 2BT: 0
         lne = lines[i]; //S:122703   E:122717 D: 2BT: 0
         System.out.println("Loop3: " + i + ":" + lne); //S:122724   E:122769 D: 2BT: 0
          //S:122775   E:122864 D: 2BT: 7
         if(lne.indexOf("//Test Code")>- 1) //S:122776   E:122835 D: 2BT: 1
         {
            QuicktestRunner.execPath += 36; //S:122818   E:0 D: 3BT: 0
            break; //S:122818   E:122823 D: 3BT: 0
         }
         else //S:122836   E:122864 D: 2BT: 2
         {
            QuicktestRunner.execPath += 18; //S:122841   E:0 D: 3BT: 0
            addlSetup += lne + "\n"; //S:122841   E:122864 D: 3BT: 0
         }
      }while(true );
   }
   addlSetup = addlSetup.substring(0 , addlSetup.length()- 1); //S:122892   E:122950 D: 0BT: 0
   i ++; //S:122955   E:122958 D: 0BT: 0
   lne = lines[i]; //S:122963   E:122977 D: 0BT: 0
   for(int j = 0;j<mi.params.size();j ++)this.params[j]= mi.params.getVar(j); //S:122982   E:123064 D: 0BT: 0
   System.out.println(lne); //S:123069   E:123092 D: 0BT: 0
   String pList = lne.substring(lne.indexOf("(")+ 1 , lne.lastIndexOf(");")); //S:123097   E:123170 D: 0BT: 0
   System.out.println("|" + pList + "|"); //S:123175   E:123212 D: 0BT: 0
    //S:123265   E:123411 D: 0BT: 7
   if(pList.length()>0) //S:123266   E:123411 D: 0BT: 1
   {
      String[]x = pList.split(","); //S:123298   E:123327 D: 1BT: 0
      QuicktestRunner.execPath += 9; //S:123298   E:0 D: 1BT: 0
      for(int j = 0;j<x.length;j ++)inputValues[tempIndex + j]= x[j]; //S:123334   E:123406 D: 1BT: 0
   }
   do //S:123440   E:123885 D: 0BT: 0
   {
      i ++; //S:123452   E:123455 D: 1BT: 0
      lne = lines[i].trim(); //S:123461   E:123482 D: 1BT: 0
      System.out.println("Loop4: " + i + ":" + lne); //S:123488   E:123533 D: 1BT: 0
       //S:123538   E:123868 D: 1BT: 7
      if(lne.startsWith("//")) //S:123539   E:123579 D: 1BT: 1
      {
         break; //S:123569   E:123574 D: 2BT: 0
         QuicktestRunner.execPath += 6; //S:123569   E:0 D: 2BT: 0
      }
      else //S:123580   E:123868 D: 1BT: 2
      {
          //S:123584   E:123868 D: 2BT: 7
         if(lne.startsWith("}")) //S:123585   E:123628 D: 2BT: 1
         {
            QuicktestRunner.execPath += 3; //S:123614   E:0 D: 3BT: 0
            break; //S:123614   E:123619 D: 3BT: 0
         }
         else //S:123629   E:123868 D: 2BT: 2
         {
            AssertionInfoTest ai = assertionFromTestLine(lne , mi , cl , lines); //S:123719   E:123779 D: 3BT: 0
            asserts.add(ai); //S:123786   E:123801 D: 3BT: 0
            System.out.println("AI.expValue:" + ai.expValue); //S:123808   E:123856 D: 3BT: 0
         }
      }
   }while(true );
    //S:123889   E:124136 D: 0BT: 7
   if(lne.startsWith("//Post-test")) //S:123890   E:124136 D: 0BT: 1
   {
      do //S:123933   E:124131 D: 1BT: 0
      {
         i ++; //S:123947   E:123950 D: 2BT: 0
         lne = lines[i]; //S:123957   E:123971 D: 2BT: 0
         System.out.println("Loop5: " + i + ":" + lne); //S:123978   E:124023 D: 2BT: 0
          //S:124029   E:124113 D: 2BT: 7
         if(lne.startsWith("}")) //S:124030   E:124077 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:124060   E:0 D: 3BT: 0
            break; //S:124060   E:124065 D: 3BT: 0
         }
         else //S:124078   E:124113 D: 2BT: 2
         {
            QuicktestRunner.execPath += 1; //S:124083   E:0 D: 3BT: 0
            this.postAsserts += lne + "\n"; //S:124083   E:124113 D: 3BT: 0
         }
      }while(true );
   }
   postAsserts = postAsserts.substring(0 , postAsserts.length()- 1); //S:124141   E:124205 D: 0BT: 0
   asserts.setupReqClasses(); //S:124210   E:124235 D: 0BT: 0
   for(int k = 0;k<asserts.size();k ++) //S:124240   E:124358 D: 0BT: 0
   {
      System.out.println("|" + asserts.getAssertion(k).expValue + "|"); //S:124289   E:124353 D: 1BT: 0
   }
   }

   private String findClassName(String instanceName, String[] allLines)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:3 CP:0
/***************************
Processing list:
for(int i = 0;i<allLines.length;i ++){} {S:124445 E:124717 D:0 BT: 0}
return null; {S:124722 E:124733 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<allLines.length;i ++){} {S:124445 E:124717 D:0 BT: 0}
return null; {S:124722 E:124733 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:124494 E:124712 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:124494 E:124712 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(allLines[i].contains(instanceName)){} {S:124495 E:124712 D:1 BT: 1}
String x = allLines[i].trim(); {S:124545 E:124574 D:2 BT: 0}
String[]y = x.split(" "); {S:124581 E:124606 D:2 BT: 0}
return y[0]; {S:124695 E:124706 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(allLines[i].contains(instanceName)){} {S:124495 E:124712 D:1 BT: 1}
String x = allLines[i].trim(); {S:124545 E:124574 D:2 BT: 0}
String[]y = x.split(" "); {S:124581 E:124606 D:2 BT: 0}
return y[0]; {S:124695 E:124706 D:2 BT: 0}
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
//#5(3) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:124612 E:124688 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:124612 E:124688 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(y[0].endsWith("Test")) {S:124613 E:124688 D:2 BT: 1}
y[0]= y[0].substring(0 , y[0].length()- 4); {S:124645 E:124688 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(y[0].endsWith("Test")){} {S:124613 E:124688 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:124645 E:0 D:3 BT: 0}
y[0]= y[0].substring(0 , y[0].length()- 4); {S:124645 E:124688 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:124688 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:124689 E:0 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<allLines.length;i ++){} {S:124445 E:124717 D:0 BT: 0}
 {S:124494 E:124712 D:1 BT: 7}
if(allLines[i].contains(instanceName)){} {S:124495 E:124712 D:1 BT: 1}
String x = allLines[i].trim(); {S:124545 E:124574 D:2 BT: 0}
String[]y = x.split(" "); {S:124581 E:124606 D:2 BT: 0}
 {S:124612 E:124688 D:2 BT: 7}
if(y[0].endsWith("Test")){} {S:124613 E:124688 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:124645 E:0 D:3 BT: 0}
y[0]= y[0].substring(0 , y[0].length()- 4); {S:124645 E:124688 D:3 BT: 0}
else {S:124688 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:124689 E:0 D:3 BT: 0}
return y[0]; {S:124695 E:124706 D:2 BT: 0}
return null; {S:124722 E:124733 D:0 BT: 0}
****************************/
   for(int i = 0;i<allLines.length;i ++) //S:124445   E:124717 D: 0BT: 0
   {
       //S:124494   E:124712 D: 1BT: 7
      if(allLines[i].contains(instanceName)) //S:124495   E:124712 D: 1BT: 1
      {
         String x = allLines[i].trim(); //S:124545   E:124574 D: 2BT: 0
         String[]y = x.split(" "); //S:124581   E:124606 D: 2BT: 0
          //S:124612   E:124688 D: 2BT: 7
         if(y[0].endsWith("Test")) //S:124613   E:124688 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:124645   E:0 D: 3BT: 0
            y[0]= y[0].substring(0 , y[0].length()- 4); //S:124645   E:124688 D: 3BT: 0
         }
         else //S:124688   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 1; //S:124689   E:0 D: 3BT: 0
         }
         return y[0]; //S:124695   E:124706 D: 2BT: 0
      }
   }
   return null; //S:124722   E:124733 D: 0BT: 0
   }

   private VarInfoTest varLookup(String in, MethodInfoTest mi, ClassListTest cl, int mode)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
ClassInfoTest ci = cl.findClassWithMethod(mi); {S:124827 E:124868 D:0 BT: 0}
VarInfoTest rtnVal = null; {S:124873 E:124894 D:0 BT: 0}
return rtnVal; {S:125047 E:125060 D:0 BT: 0}
****************************/
/***************************
Processing list:
ClassInfoTest ci = cl.findClassWithMethod(mi); {S:124827 E:124868 D:0 BT: 0}
VarInfoTest rtnVal = null; {S:124873 E:124894 D:0 BT: 0}
return rtnVal; {S:125047 E:125060 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:124898 E:124959 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:124898 E:124959 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:124963 E:125042 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:124963 E:125042 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if((mode & 2)>0) {S:124899 E:124959 D:0 BT: 1}
rtnVal = mi.params.getVarWithName(in); {S:124922 E:124959 D:1 BT: 0}
****************************/
/***************************
Processing list:
if((mode & 2)>0){} {S:124899 E:124959 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:124922 E:0 D:1 BT: 0}
rtnVal = mi.params.getVarWithName(in); {S:124922 E:124959 D:1 BT: 0}
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
if(rtnVal == null &&((mode & 1)>0)) {S:124964 E:125042 D:0 BT: 1}
rtnVal = ci.vars.getVarWithName(in); {S:125007 E:125042 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(rtnVal == null &&((mode & 1)>0)){} {S:124964 E:125042 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:125007 E:0 D:1 BT: 0}
rtnVal = ci.vars.getVarWithName(in); {S:125007 E:125042 D:1 BT: 0}
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
ClassInfoTest ci = cl.findClassWithMethod(mi); {S:124827 E:124868 D:0 BT: 0}
VarInfoTest rtnVal = null; {S:124873 E:124894 D:0 BT: 0}
 {S:124898 E:124959 D:0 BT: 7}
if((mode & 2)>0){} {S:124899 E:124959 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:124922 E:0 D:1 BT: 0}
rtnVal = mi.params.getVarWithName(in); {S:124922 E:124959 D:1 BT: 0}
 {S:124963 E:125042 D:0 BT: 7}
if(rtnVal == null &&((mode & 1)>0)){} {S:124964 E:125042 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:125007 E:0 D:1 BT: 0}
rtnVal = ci.vars.getVarWithName(in); {S:125007 E:125042 D:1 BT: 0}
return rtnVal; {S:125047 E:125060 D:0 BT: 0}
****************************/
   ClassInfoTest ci = cl.findClassWithMethod(mi); //S:124827   E:124868 D: 0BT: 0
   VarInfoTest rtnVal = null; //S:124873   E:124894 D: 0BT: 0
    //S:124898   E:124959 D: 0BT: 7
   if((mode & 2)>0) //S:124899   E:124959 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:124922   E:0 D: 1BT: 0
      rtnVal = mi.params.getVarWithName(in); //S:124922   E:124959 D: 1BT: 0
   }
    //S:124963   E:125042 D: 0BT: 7
   if(rtnVal == null &&((mode & 1)>0)) //S:124964   E:125042 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:125007   E:0 D: 1BT: 0
      rtnVal = ci.vars.getVarWithName(in); //S:125007   E:125042 D: 1BT: 0
   }
   return rtnVal; //S:125047   E:125060 D: 0BT: 0
   }

   private AssertionInfoTest assertionFromTestLine(String in, MethodInfoTest mi, ClassListTest cl, String[] lines)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:15 CP:0
/***************************
Processing list:
AssertionInfoTest rtnVal = new AssertionInfoTest(); {S:125214 E:125256 D:0 BT: 0}
String sub = in.substring(in.indexOf("(")+ 1 , in.length()- 1); {S:125289 E:125352 D:0 BT: 0}
sub = sub.substring(0 , sub.lastIndexOf(")")); {S:125357 E:125401 D:0 BT: 0}
String[]vals = sub.split(","); {S:125473 E:125503 D:0 BT: 0}
for(int i = 0;i<vals.length;i ++){} {S:125508 E:125583 D:0 BT: 0}
<sublist>
vals[i]= vals[i].trim(); {S:125554 E:125578 D:1 BT: 0}
</sublist>
return rtnVal; {S:127575 E:127588 D:0 BT: 0}
****************************/
/***************************
Processing list:
AssertionInfoTest rtnVal = new AssertionInfoTest(); {S:125214 E:125256 D:0 BT: 0}
String sub = in.substring(in.indexOf("(")+ 1 , in.length()- 1); {S:125289 E:125352 D:0 BT: 0}
sub = sub.substring(0 , sub.lastIndexOf(")")); {S:125357 E:125401 D:0 BT: 0}
String[]vals = sub.split(","); {S:125473 E:125503 D:0 BT: 0}
for(int i = 0;i<vals.length;i ++){} {S:125508 E:125583 D:0 BT: 0}
<sublist>
vals[i]= vals[i].trim(); {S:125554 E:125578 D:1 BT: 0}
</sublist>
return rtnVal; {S:127575 E:127588 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:5 CP:0
/***************************
Processing list:
 {S:125591 E:126972 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:125591 E:126972 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:127016 E:127570 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:127016 E:127570 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:12
/***************************
Processing list:
if(vals[0].equals("rtnVal")){ {S:125592 E:125739 D:0 BT: 1}
rtnVal.fromClass = ""; {S:125630 E:125651 D:1 BT: 0}
rtnVal.dataType = mi.returnType.copy(); {S:125657 E:125695 D:1 BT: 0}
rtnVal.isReturn = true; {S:125701 E:125723 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(vals[0].equals("rtnVal")){} {S:125592 E:125739 D:0 BT: 1}
QuicktestRunner.execPath += 12; {S:125630 E:0 D:1 BT: 0}
rtnVal.fromClass = ""; {S:125630 E:125651 D:1 BT: 0}
rtnVal.dataType = mi.returnType.copy(); {S:125657 E:125695 D:1 BT: 0}
rtnVal.isReturn = true; {S:125701 E:125723 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:4 CP:0
/***************************
Processing list:
 {S:125740 E:126972 D:0 BT: 2}
String[]dots = vals[0].split("\\."); {S:125751 E:125787 D:0 BT: 0}
String fromClass = ""; {S:125839 E:125860 D:0 BT: 0}
for(int i = 0;i<dots.length - 1;i ++)fromClass += dots[i]+ "."; {S:125866 E:125938 D:0 BT: 0}
String initClassInstanceType = findClassName(dots[0], lines); {S:126302 E:126362 D:0 BT: 0}
System.out.println("Looking at " + initClassInstanceType + "; looking for " + dots[1]); {S:126368 E:126454 D:0 BT: 0}
ClassInfoTest ci = cl.findClassWithName(initClassInstanceType); {S:126460 E:126518 D:0 BT: 0}
VarInfoTest vi; {S:126524 E:126534 D:0 BT: 0}
for(int i = 1;i<dots.length - 1;i ++){} {S:126540 E:126774 D:0 BT: 0}
<sublist>
vi = ci.vars.getVarWithName(dots[i]); {S:126598 E:126634 D:1 BT: 0}
ci = cl.findClassWithName(vi.getType()); {S:126641 E:126680 D:1 BT: 0}
System.out.println("Looking at " + ci.className + "; looking for " + dots[i + 1]); {S:126687 E:126768 D:1 BT: 0}
</sublist>
vi = ci.vars.getVarWithName(dots[dots.length - 1]); {S:126884 E:126934 D:0 BT: 0}
rtnVal.dataType = vi.copy(); {S:126940 E:126967 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:125740 E:126972 D:0 BT: 2}
String[]dots = vals[0].split("\\."); {S:125751 E:125787 D:1 BT: 0}
String fromClass = ""; {S:125839 E:125860 D:1 BT: 0}
for(int i = 0;i<dots.length - 1;i ++)fromClass += dots[i]+ "."; {S:125866 E:125938 D:1 BT: 0}
String initClassInstanceType = findClassName(dots[0], lines); {S:126302 E:126362 D:1 BT: 0}
System.out.println("Looking at " + initClassInstanceType + "; looking for " + dots[1]); {S:126368 E:126454 D:1 BT: 0}
ClassInfoTest ci = cl.findClassWithName(initClassInstanceType); {S:126460 E:126518 D:1 BT: 0}
VarInfoTest vi; {S:126524 E:126534 D:1 BT: 0}
for(int i = 1;i<dots.length - 1;i ++){} {S:126540 E:126774 D:1 BT: 0}
<sublist>
vi = ci.vars.getVarWithName(dots[i]); {S:126598 E:126634 D:2 BT: 0}
ci = cl.findClassWithName(vi.getType()); {S:126641 E:126680 D:2 BT: 0}
System.out.println("Looking at " + ci.className + "; looking for " + dots[i + 1]); {S:126687 E:126768 D:2 BT: 0}
</sublist>
vi = ci.vars.getVarWithName(dots[dots.length - 1]); {S:126884 E:126934 D:1 BT: 0}
rtnVal.dataType = vi.copy(); {S:126940 E:126967 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(cl.lang.isPrimitive(rtnVal.dataType.getType()))else{} {S:127017 E:127104 D:0 BT: 1}
rtnVal.expValue = vals[1]; {S:127072 E:127097 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(cl.lang.isPrimitive(rtnVal.dataType.getType())){} {S:127017 E:127104 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:127072 E:0 D:1 BT: 0}
rtnVal.expValue = vals[1]; {S:127072 E:127097 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:127105 E:127570 D:0 BT: 2}
String notinParens = vals[1].substring(vals[1].indexOf(") ")+ 1 , vals[1].length()); {S:127116 E:127199 D:0 BT: 0}
rtnVal.expValue = notinParens; {S:127205 E:127234 D:0 BT: 0}
System.out.println("Before Trim:" + rtnVal.expValue); {S:127240 E:127292 D:0 BT: 0}
rtnVal.expValue = rtnVal.expValue.trim(); {S:127298 E:127338 D:0 BT: 0}
System.out.println("After Trim:" + rtnVal.expValue); {S:127344 E:127395 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:127105 E:127570 D:0 BT: 2}
String notinParens = vals[1].substring(vals[1].indexOf(") ")+ 1 , vals[1].length()); {S:127116 E:127199 D:1 BT: 0}
rtnVal.expValue = notinParens; {S:127205 E:127234 D:1 BT: 0}
System.out.println("Before Trim:" + rtnVal.expValue); {S:127240 E:127292 D:1 BT: 0}
rtnVal.expValue = rtnVal.expValue.trim(); {S:127298 E:127338 D:1 BT: 0}
System.out.println("After Trim:" + rtnVal.expValue); {S:127344 E:127395 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(5) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:125943 E:126034 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:125943 E:126034 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#9(5) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:126039 E:126170 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:126039 E:126170 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#10(7) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:127400 E:127565 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:127400 E:127565 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(8) Type:1 Paths:1 CP:6
/***************************
Processing list:
if(fromClass.length()>0) {S:125944 E:126034 D:2 BT: 1}
fromClass = fromClass.substring(0 , fromClass.length()- 1); {S:125976 E:126034 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(fromClass.length()>0){} {S:125944 E:126034 D:2 BT: 1}
QuicktestRunner.execPath += 6; {S:125976 E:0 D:3 BT: 0}
fromClass = fromClass.substring(0 , fromClass.length()- 1); {S:125976 E:126034 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#12(8) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#13(9) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(fromClass.equals("rtnVal"))else rtnVal.fromClass = findClassName(fromClass , lines); {S:126040 E:126114 D:2 BT: 1}
rtnVal.fromClass = fromClass; {S:126076 E:126104 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(fromClass.equals("rtnVal")){} {S:126040 E:126114 D:2 BT: 1}
QuicktestRunner.execPath += 3; {S:126076 E:0 D:3 BT: 0}
rtnVal.fromClass = fromClass; {S:126076 E:126104 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#14(9) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:126115 E:126170 D:2 BT: 2}
rtnVal.fromClass = findClassName(fromClass , lines); {S:126120 E:126170 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:126115 E:126170 D:2 BT: 2}
rtnVal.fromClass = findClassName(fromClass , lines); {S:126120 E:126170 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#15(10) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(rtnVal.expValue.indexOf(")")>- 1){} {S:127401 E:127565 D:2 BT: 1}
System.out.println("Error in expVal:"); {S:127450 E:127488 D:3 BT: 0}
System.out.println("vals[1]:" + vals[1]+ " nip:" + notinParens); {S:127495 E:127559 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(rtnVal.expValue.indexOf(")")>- 1){} {S:127401 E:127565 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:127450 E:0 D:3 BT: 0}
System.out.println("Error in expVal:"); {S:127450 E:127488 D:3 BT: 0}
System.out.println("vals[1]:" + vals[1]+ " nip:" + notinParens); {S:127495 E:127559 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#16(10) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
AssertionInfoTest rtnVal = new AssertionInfoTest(); {S:125214 E:125256 D:0 BT: 0}
String sub = in.substring(in.indexOf("(")+ 1 , in.length()- 1); {S:125289 E:125352 D:0 BT: 0}
sub = sub.substring(0 , sub.lastIndexOf(")")); {S:125357 E:125401 D:0 BT: 0}
String[]vals = sub.split(","); {S:125473 E:125503 D:0 BT: 0}
for(int i = 0;i<vals.length;i ++){} {S:125508 E:125583 D:0 BT: 0}
<sublist>
vals[i]= vals[i].trim(); {S:125554 E:125578 D:1 BT: 0}
</sublist>
vals[i]= vals[i].trim(); {S:125554 E:125578 D:1 BT: 0}
 {S:125591 E:126972 D:0 BT: 7}
if(vals[0].equals("rtnVal")){} {S:125592 E:125739 D:0 BT: 1}
QuicktestRunner.execPath += 12; {S:125630 E:0 D:1 BT: 0}
rtnVal.fromClass = ""; {S:125630 E:125651 D:1 BT: 0}
rtnVal.dataType = mi.returnType.copy(); {S:125657 E:125695 D:1 BT: 0}
rtnVal.isReturn = true; {S:125701 E:125723 D:1 BT: 0}
else{} {S:125740 E:126972 D:0 BT: 2}
String[]dots = vals[0].split("\\."); {S:125751 E:125787 D:1 BT: 0}
String fromClass = ""; {S:125839 E:125860 D:1 BT: 0}
for(int i = 0;i<dots.length - 1;i ++)fromClass += dots[i]+ "."; {S:125866 E:125938 D:1 BT: 0}
 {S:125943 E:126034 D:1 BT: 7}
if(fromClass.length()>0){} {S:125944 E:126034 D:1 BT: 1}
QuicktestRunner.execPath += 6; {S:125976 E:0 D:2 BT: 0}
fromClass = fromClass.substring(0 , fromClass.length()- 1); {S:125976 E:126034 D:2 BT: 0}
 {S:126039 E:126170 D:1 BT: 7}
if(fromClass.equals("rtnVal")){} {S:126040 E:126114 D:1 BT: 1}
QuicktestRunner.execPath += 3; {S:126076 E:0 D:2 BT: 0}
rtnVal.fromClass = fromClass; {S:126076 E:126104 D:2 BT: 0}
else{} {S:126115 E:126170 D:1 BT: 2}
rtnVal.fromClass = findClassName(fromClass , lines); {S:126120 E:126170 D:2 BT: 0}
String initClassInstanceType = findClassName(dots[0], lines); {S:126302 E:126362 D:1 BT: 0}
System.out.println("Looking at " + initClassInstanceType + "; looking for " + dots[1]); {S:126368 E:126454 D:1 BT: 0}
ClassInfoTest ci = cl.findClassWithName(initClassInstanceType); {S:126460 E:126518 D:1 BT: 0}
VarInfoTest vi; {S:126524 E:126534 D:1 BT: 0}
for(int i = 1;i<dots.length - 1;i ++){} {S:126540 E:126774 D:1 BT: 0}
<sublist>
vi = ci.vars.getVarWithName(dots[i]); {S:126598 E:126634 D:2 BT: 0}
ci = cl.findClassWithName(vi.getType()); {S:126641 E:126680 D:2 BT: 0}
System.out.println("Looking at " + ci.className + "; looking for " + dots[i + 1]); {S:126687 E:126768 D:2 BT: 0}
</sublist>
vi = ci.vars.getVarWithName(dots[i]); {S:126598 E:126634 D:2 BT: 0}
ci = cl.findClassWithName(vi.getType()); {S:126641 E:126680 D:2 BT: 0}
System.out.println("Looking at " + ci.className + "; looking for " + dots[i + 1]); {S:126687 E:126768 D:2 BT: 0}
vi = ci.vars.getVarWithName(dots[dots.length - 1]); {S:126884 E:126934 D:1 BT: 0}
rtnVal.dataType = vi.copy(); {S:126940 E:126967 D:1 BT: 0}
 {S:127016 E:127570 D:0 BT: 7}
if(cl.lang.isPrimitive(rtnVal.dataType.getType())){} {S:127017 E:127104 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:127072 E:0 D:1 BT: 0}
rtnVal.expValue = vals[1]; {S:127072 E:127097 D:1 BT: 0}
else{} {S:127105 E:127570 D:0 BT: 2}
String notinParens = vals[1].substring(vals[1].indexOf(") ")+ 1 , vals[1].length()); {S:127116 E:127199 D:1 BT: 0}
rtnVal.expValue = notinParens; {S:127205 E:127234 D:1 BT: 0}
System.out.println("Before Trim:" + rtnVal.expValue); {S:127240 E:127292 D:1 BT: 0}
rtnVal.expValue = rtnVal.expValue.trim(); {S:127298 E:127338 D:1 BT: 0}
System.out.println("After Trim:" + rtnVal.expValue); {S:127344 E:127395 D:1 BT: 0}
 {S:127400 E:127565 D:1 BT: 7}
if(rtnVal.expValue.indexOf(")")>- 1){} {S:127401 E:127565 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:127450 E:0 D:2 BT: 0}
System.out.println("Error in expVal:"); {S:127450 E:127488 D:2 BT: 0}
System.out.println("vals[1]:" + vals[1]+ " nip:" + notinParens); {S:127495 E:127559 D:2 BT: 0}
return rtnVal; {S:127575 E:127588 D:0 BT: 0}
****************************/
   AssertionInfoTest rtnVal = new AssertionInfoTest(); //S:125214   E:125256 D: 0BT: 0
   String sub = in.substring(in.indexOf("(")+ 1 , in.length()- 1); //S:125289   E:125352 D: 0BT: 0
   sub = sub.substring(0 , sub.lastIndexOf(")")); //S:125357   E:125401 D: 0BT: 0
   String[]vals = sub.split(","); //S:125473   E:125503 D: 0BT: 0
   for(int i = 0;i<vals.length;i ++) //S:125508   E:125583 D: 0BT: 0
   {
      vals[i]= vals[i].trim(); //S:125554   E:125578 D: 1BT: 0
   }
    //S:125591   E:126972 D: 0BT: 7
   if(vals[0].equals("rtnVal")) //S:125592   E:125739 D: 0BT: 1
   {
      QuicktestRunner.execPath += 12; //S:125630   E:0 D: 1BT: 0
      rtnVal.fromClass = ""; //S:125630   E:125651 D: 1BT: 0
      rtnVal.dataType = mi.returnType.copy(); //S:125657   E:125695 D: 1BT: 0
      rtnVal.isReturn = true; //S:125701   E:125723 D: 1BT: 0
   }
   else //S:125740   E:126972 D: 0BT: 2
   {
      String[]dots = vals[0].split("\\."); //S:125751   E:125787 D: 1BT: 0
      String fromClass = ""; //S:125839   E:125860 D: 1BT: 0
      for(int i = 0;i<dots.length - 1;i ++)fromClass += dots[i]+ "."; //S:125866   E:125938 D: 1BT: 0
       //S:125943   E:126034 D: 1BT: 7
      if(fromClass.length()>0) //S:125944   E:126034 D: 1BT: 1
      {
         QuicktestRunner.execPath += 6; //S:125976   E:0 D: 2BT: 0
         fromClass = fromClass.substring(0 , fromClass.length()- 1); //S:125976   E:126034 D: 2BT: 0
      }
       //S:126039   E:126170 D: 1BT: 7
      if(fromClass.equals("rtnVal")) //S:126040   E:126114 D: 1BT: 1
      {
         QuicktestRunner.execPath += 3; //S:126076   E:0 D: 2BT: 0
         rtnVal.fromClass = fromClass; //S:126076   E:126104 D: 2BT: 0
      }
      else //S:126115   E:126170 D: 1BT: 2
      {
         rtnVal.fromClass = findClassName(fromClass , lines); //S:126120   E:126170 D: 2BT: 0
      }
      String initClassInstanceType = findClassName(dots[0], lines); //S:126302   E:126362 D: 1BT: 0
      System.out.println("Looking at " + initClassInstanceType + "; looking for " + dots[1]); //S:126368   E:126454 D: 1BT: 0
      ClassInfoTest ci = cl.findClassWithName(initClassInstanceType); //S:126460   E:126518 D: 1BT: 0
      VarInfoTest vi; //S:126524   E:126534 D: 1BT: 0
      for(int i = 1;i<dots.length - 1;i ++) //S:126540   E:126774 D: 1BT: 0
      {
         vi = ci.vars.getVarWithName(dots[i]); //S:126598   E:126634 D: 2BT: 0
         ci = cl.findClassWithName(vi.getType()); //S:126641   E:126680 D: 2BT: 0
         System.out.println("Looking at " + ci.className + "; looking for " + dots[i + 1]); //S:126687   E:126768 D: 2BT: 0
      }
      vi = ci.vars.getVarWithName(dots[dots.length - 1]); //S:126884   E:126934 D: 1BT: 0
      rtnVal.dataType = vi.copy(); //S:126940   E:126967 D: 1BT: 0
   }
    //S:127016   E:127570 D: 0BT: 7
   if(cl.lang.isPrimitive(rtnVal.dataType.getType())) //S:127017   E:127104 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:127072   E:0 D: 1BT: 0
      rtnVal.expValue = vals[1]; //S:127072   E:127097 D: 1BT: 0
   }
   else //S:127105   E:127570 D: 0BT: 2
   {
      String notinParens = vals[1].substring(vals[1].indexOf(") ")+ 1 , vals[1].length()); //S:127116   E:127199 D: 1BT: 0
      rtnVal.expValue = notinParens; //S:127205   E:127234 D: 1BT: 0
      System.out.println("Before Trim:" + rtnVal.expValue); //S:127240   E:127292 D: 1BT: 0
      rtnVal.expValue = rtnVal.expValue.trim(); //S:127298   E:127338 D: 1BT: 0
      System.out.println("After Trim:" + rtnVal.expValue); //S:127344   E:127395 D: 1BT: 0
       //S:127400   E:127565 D: 1BT: 7
      if(rtnVal.expValue.indexOf(")")>- 1) //S:127401   E:127565 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:127450   E:0 D: 2BT: 0
         System.out.println("Error in expVal:"); //S:127450   E:127488 D: 2BT: 0
         System.out.println("vals[1]:" + vals[1]+ " nip:" + notinParens); //S:127495   E:127559 D: 2BT: 0
      }
   }
   return rtnVal; //S:127575   E:127588 D: 0BT: 0
   }

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

