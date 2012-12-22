import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class ClassInfoTest extends CodeMemberTest
{
   public String className;
   public String mods;
   public String fromFile;
   public String extendsClass;
   public VarListTest vars;
   public MethodListTest methods;
   public int startLine;
   public int endLine;
   public int classIndex;
   public PreambleTestList imports;
   public String mockSetup;
   public String impl;
   public  int qtInsertionPoint;
   public  int qtLen;

   private void otherSetup()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
mockSetup = "   public void mockSetup()\n   {\n\n\n   }\n"; {S:494 E:552 D:0 BT: 0}
****************************/
/***************************
Processing list:
mockSetup = "   public void mockSetup()\n   {\n\n\n   }\n"; {S:494 E:552 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
mockSetup = "   public void mockSetup()\n   {\n\n\n   }\n"; {S:494 E:552 D:0 BT: 0}
****************************/
   mockSetup = "   public void mockSetup()\n   {\n\n\n   }\n"; //S:494   E:552 D: 0BT: 0
   }

   ClassInfoTest(String in, int lineNo, String fromFile, int ci)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
startLine = lineNo; {S:637 E:655 D:0 BT: 0}
this.fromFile = fromFile; {S:664 E:688 D:0 BT: 0}
endLine = - 1; {S:697 E:709 D:0 BT: 0}
classIndex = ci; {S:718 E:733 D:0 BT: 0}
in = WhiteboxUtils.removeAccessModifiers(in); {S:802 E:846 D:0 BT: 0}
className = in.substring(in.indexOf("class ")+ 6); {S:855 E:905 D:0 BT: 0}
vars = new VarListTest(); {S:1054 E:1074 D:0 BT: 0}
methods = new MethodListTest(classIndex); {S:1083 E:1119 D:0 BT: 0}
otherSetup(); {S:1128 E:1140 D:0 BT: 0}
****************************/
/***************************
Processing list:
startLine = lineNo; {S:637 E:655 D:0 BT: 0}
this.fromFile = fromFile; {S:664 E:688 D:0 BT: 0}
endLine = - 1; {S:697 E:709 D:0 BT: 0}
classIndex = ci; {S:718 E:733 D:0 BT: 0}
in = WhiteboxUtils.removeAccessModifiers(in); {S:802 E:846 D:0 BT: 0}
className = in.substring(in.indexOf("class ")+ 6); {S:855 E:905 D:0 BT: 0}
vars = new VarListTest(); {S:1054 E:1074 D:0 BT: 0}
methods = new MethodListTest(classIndex); {S:1083 E:1119 D:0 BT: 0}
otherSetup(); {S:1128 E:1140 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:944 E:1044 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:944 E:1044 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(className.indexOf(" ")>0) {S:945 E:1044 D:0 BT: 1}
className = className.substring(0 , className.indexOf(" ")); {S:986 E:1044 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(className.indexOf(" ")>0){} {S:945 E:1044 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:986 E:0 D:1 BT: 0}
className = className.substring(0 , className.indexOf(" ")); {S:986 E:1044 D:1 BT: 0}
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
startLine = lineNo; {S:637 E:655 D:0 BT: 0}
this.fromFile = fromFile; {S:664 E:688 D:0 BT: 0}
endLine = - 1; {S:697 E:709 D:0 BT: 0}
classIndex = ci; {S:718 E:733 D:0 BT: 0}
in = WhiteboxUtils.removeAccessModifiers(in); {S:802 E:846 D:0 BT: 0}
className = in.substring(in.indexOf("class ")+ 6); {S:855 E:905 D:0 BT: 0}
 {S:944 E:1044 D:0 BT: 7}
if(className.indexOf(" ")>0){} {S:945 E:1044 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:986 E:0 D:1 BT: 0}
className = className.substring(0 , className.indexOf(" ")); {S:986 E:1044 D:1 BT: 0}
vars = new VarListTest(); {S:1054 E:1074 D:0 BT: 0}
methods = new MethodListTest(classIndex); {S:1083 E:1119 D:0 BT: 0}
otherSetup(); {S:1128 E:1140 D:0 BT: 0}
****************************/
   startLine = lineNo; //S:637   E:655 D: 0BT: 0
   this.fromFile = fromFile; //S:664   E:688 D: 0BT: 0
   endLine = - 1; //S:697   E:709 D: 0BT: 0
   classIndex = ci; //S:718   E:733 D: 0BT: 0
   in = WhiteboxUtils.removeAccessModifiers(in); //S:802   E:846 D: 0BT: 0
   className = in.substring(in.indexOf("class ")+ 6); //S:855   E:905 D: 0BT: 0
    //S:944   E:1044 D: 0BT: 7
   if(className.indexOf(" ")>0) //S:945   E:1044 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:986   E:0 D: 1BT: 0
      className = className.substring(0 , className.indexOf(" ")); //S:986   E:1044 D: 1BT: 0
   }
   vars = new VarListTest(); //S:1054   E:1074 D: 0BT: 0
   methods = new MethodListTest(classIndex); //S:1083   E:1119 D: 0BT: 0
   otherSetup(); //S:1128   E:1140 D: 0BT: 0
   }

   public void end(int lineNo)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
endLine = lineNo; {S:1195 E:1211 D:0 BT: 0}
****************************/
/***************************
Processing list:
endLine = lineNo; {S:1195 E:1211 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
endLine = lineNo; {S:1195 E:1211 D:0 BT: 0}
****************************/
   endLine = lineNo; //S:1195   E:1211 D: 0BT: 0
   }

   ClassInfoTest copyClass()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
ClassInfoTest newClassInfoTest = new ClassInfoTest("class " + className , 0 , fromFile , classIndex); {S:1260 E:1345 D:0 BT: 0}
for(int i = 0;i<vars.size();i ++){} {S:1354 E:1453 D:0 BT: 0}
<sublist>
newClassInfoTest.vars.add(vars.get(i)); {S:1410 E:1444 D:1 BT: 0}
</sublist>
for(int i = 0;i<methods.size();i ++){} {S:1462 E:1570 D:0 BT: 0}
<sublist>
newClassInfoTest.methods.add(methods.get(i)); {S:1521 E:1561 D:1 BT: 0}
</sublist>
return newClassInfoTest; {S:1579 E:1598 D:0 BT: 0}
****************************/
/***************************
Processing list:
ClassInfoTest newClassInfoTest = new ClassInfoTest("class " + className , 0 , fromFile , classIndex); {S:1260 E:1345 D:0 BT: 0}
for(int i = 0;i<vars.size();i ++){} {S:1354 E:1453 D:0 BT: 0}
<sublist>
newClassInfoTest.vars.add(vars.get(i)); {S:1410 E:1444 D:1 BT: 0}
</sublist>
for(int i = 0;i<methods.size();i ++){} {S:1462 E:1570 D:0 BT: 0}
<sublist>
newClassInfoTest.methods.add(methods.get(i)); {S:1521 E:1561 D:1 BT: 0}
</sublist>
return newClassInfoTest; {S:1579 E:1598 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
ClassInfoTest newClassInfoTest = new ClassInfoTest("class " + className , 0 , fromFile , classIndex); {S:1260 E:1345 D:0 BT: 0}
for(int i = 0;i<vars.size();i ++){} {S:1354 E:1453 D:0 BT: 0}
<sublist>
newClassInfoTest.vars.add(vars.get(i)); {S:1410 E:1444 D:1 BT: 0}
</sublist>
newClassInfoTest.vars.add(vars.get(i)); {S:1410 E:1444 D:1 BT: 0}
for(int i = 0;i<methods.size();i ++){} {S:1462 E:1570 D:0 BT: 0}
<sublist>
newClassInfoTest.methods.add(methods.get(i)); {S:1521 E:1561 D:1 BT: 0}
</sublist>
newClassInfoTest.methods.add(methods.get(i)); {S:1521 E:1561 D:1 BT: 0}
return newClassInfoTest; {S:1579 E:1598 D:0 BT: 0}
****************************/
   ClassInfoTest newClassInfoTest = new ClassInfoTest("class " + className , 0 , fromFile , classIndex); //S:1260   E:1345 D: 0BT: 0
   for(int i = 0;i<vars.size();i ++) //S:1354   E:1453 D: 0BT: 0
   {
      newClassInfoTest.vars.add(vars.get(i)); //S:1410   E:1444 D: 1BT: 0
   }
   for(int i = 0;i<methods.size();i ++) //S:1462   E:1570 D: 0BT: 0
   {
      newClassInfoTest.methods.add(methods.get(i)); //S:1521   E:1561 D: 1BT: 0
   }
   return newClassInfoTest; //S:1579   E:1598 D: 0BT: 0
   }

   public void addToTree(ClassListTest list, TreeStatusTest info, LinkedList nodeList) 
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
info.setCurrentClass(this); {S:1700 E:1726 D:0 BT: 0}
list.add(this); {S:1733 E:1747 D:0 BT: 0}
imports = info.getPreambleTests(); {S:1754 E:1783 D:0 BT: 0}
****************************/
/***************************
Processing list:
info.setCurrentClass(this); {S:1700 E:1726 D:0 BT: 0}
list.add(this); {S:1733 E:1747 D:0 BT: 0}
imports = info.getPreambleTests(); {S:1754 E:1783 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
info.setCurrentClass(this); {S:1700 E:1726 D:0 BT: 0}
list.add(this); {S:1733 E:1747 D:0 BT: 0}
imports = info.getPreambleTests(); {S:1754 E:1783 D:0 BT: 0}
****************************/
   info.setCurrentClass(this); //S:1700   E:1726 D: 0BT: 0
   list.add(this); //S:1733   E:1747 D: 0BT: 0
   imports = info.getPreambleTests(); //S:1754   E:1783 D: 0BT: 0
   }

   public ClassInfoTest()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
methods = new MethodListTest(- 1); {S:1874 E:1902 D:0 BT: 0}
vars = new VarListTest(); {S:1909 E:1929 D:0 BT: 0}
otherSetup(); {S:1936 E:1948 D:0 BT: 0}
****************************/
/***************************
Processing list:
methods = new MethodListTest(- 1); {S:1874 E:1902 D:0 BT: 0}
vars = new VarListTest(); {S:1909 E:1929 D:0 BT: 0}
otherSetup(); {S:1936 E:1948 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
methods = new MethodListTest(- 1); {S:1874 E:1902 D:0 BT: 0}
vars = new VarListTest(); {S:1909 E:1929 D:0 BT: 0}
otherSetup(); {S:1936 E:1948 D:0 BT: 0}
****************************/
   methods = new MethodListTest(- 1); //S:1874   E:1902 D: 0BT: 0
   vars = new VarListTest(); //S:1909   E:1929 D: 0BT: 0
   otherSetup(); //S:1936   E:1948 D: 0BT: 0
   }

   public ClassInfoTest(ParseTree in, ParseTree xx, String fromFile, Integer ci)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
mods = VarInfoTest.processModifiers(xx); {S:2604 E:2639 D:0 BT: 0}
ParseTree info = null; {S:2646 E:2667 D:0 BT: 0}
extendsClass = ""; {S:2674 E:2691 D:0 BT: 0}
impl = ""; {S:2698 E:2707 D:0 BT: 0}
info =(ParseTree)in.getChild(1); {S:2714 E:2747 D:0 BT: 0}
className = info.getText(); {S:2752 E:2778 D:0 BT: 0}
int i = 2; {S:2783 E:2792 D:0 BT: 0}
this.fromFile = fromFile; {S:2797 E:2821 D:0 BT: 0}
while(i<in.getChildCount()){} {S:2826 E:3566 D:0 BT: 0}
<sublist>
info =(ParseTree)in.getChild(i); {S:2865 E:2898 D:1 BT: 0}
String txt = info.getText(); {S:2904 E:2931 D:1 BT: 0}
</sublist>
classIndex = ci.intValue(); {S:3573 E:3599 D:0 BT: 0}
vars = new VarListTest(); {S:3606 E:3626 D:0 BT: 0}
methods = new MethodListTest(classIndex); {S:3633 E:3669 D:0 BT: 0}
imports = new PreambleTestList(); {S:3676 E:3704 D:0 BT: 0}
otherSetup(); {S:3711 E:3723 D:0 BT: 0}
****************************/
/***************************
Processing list:
mods = VarInfoTest.processModifiers(xx); {S:2604 E:2639 D:0 BT: 0}
ParseTree info = null; {S:2646 E:2667 D:0 BT: 0}
extendsClass = ""; {S:2674 E:2691 D:0 BT: 0}
impl = ""; {S:2698 E:2707 D:0 BT: 0}
info =(ParseTree)in.getChild(1); {S:2714 E:2747 D:0 BT: 0}
className = info.getText(); {S:2752 E:2778 D:0 BT: 0}
int i = 2; {S:2783 E:2792 D:0 BT: 0}
this.fromFile = fromFile; {S:2797 E:2821 D:0 BT: 0}
while(i<in.getChildCount()){} {S:2826 E:3566 D:0 BT: 0}
<sublist>
info =(ParseTree)in.getChild(i); {S:2865 E:2898 D:1 BT: 0}
String txt = info.getText(); {S:2904 E:2931 D:1 BT: 0}
</sublist>
classIndex = ci.intValue(); {S:3573 E:3599 D:0 BT: 0}
vars = new VarListTest(); {S:3606 E:3626 D:0 BT: 0}
methods = new MethodListTest(classIndex); {S:3633 E:3669 D:0 BT: 0}
imports = new PreambleTestList(); {S:3676 E:3704 D:0 BT: 0}
otherSetup(); {S:3711 E:3723 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:2936 E:3561 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:2936 E:3561 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(txt.equals("extends")){ {S:2937 E:3074 D:1 BT: 1}
info =(ParseTree)in.getChild(i + 1); {S:2974 E:3011 D:2 BT: 0}
extendsClass = getTypeName(info); {S:3018 E:3050 D:2 BT: 0}
i += 2; {S:3057 E:3063 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(txt.equals("extends")){} {S:2937 E:3074 D:1 BT: 1}
QuicktestRunner.execPath += 3; {S:2974 E:0 D:2 BT: 0}
info =(ParseTree)in.getChild(i + 1); {S:2974 E:3011 D:2 BT: 0}
extendsClass = getTypeName(info); {S:3018 E:3050 D:2 BT: 0}
i += 2; {S:3057 E:3063 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:3 CP:0
/***************************
Processing list:
 {S:3075 E:3561 D:1 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:3075 E:3561 D:1 BT: 2}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(4) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:3079 E:3561 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:3079 E:3561 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(txt.equals("implements")){ {S:3080 E:3552 D:3 BT: 1}
info =(ParseTree)in.getChild(i + 1); {S:3120 E:3157 D:4 BT: 0}
ParseTree info2 = null; {S:3229 E:3251 D:4 BT: 0}
int j = 0; {S:3258 E:3267 D:4 BT: 0}
while(j<info.getChildCount()){} {S:3274 E:3523 D:4 BT: 0}
<sublist>
info2 =(ParseTree)info.getChild(j); {S:3319 E:3355 D:5 BT: 0}
j ++; {S:3513 E:3516 D:5 BT: 0}
</sublist>
i += 2; {S:3530 E:3536 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(txt.equals("implements")){} {S:3080 E:3552 D:3 BT: 1}
info =(ParseTree)in.getChild(i + 1); {S:3120 E:3157 D:4 BT: 0}
ParseTree info2 = null; {S:3229 E:3251 D:4 BT: 0}
int j = 0; {S:3258 E:3267 D:4 BT: 0}
while(j<info.getChildCount()){} {S:3274 E:3523 D:4 BT: 0}
<sublist>
info2 =(ParseTree)info.getChild(j); {S:3319 E:3355 D:5 BT: 0}
j ++; {S:3513 E:3516 D:5 BT: 0}
</sublist>
i += 2; {S:3530 E:3536 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:3553 E:3561 D:3 BT: 2}
i ++; {S:3558 E:3561 D:3 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:3553 E:3561 D:3 BT: 2}
i ++; {S:3558 E:3561 D:4 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(6) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:3407 E:3505 D:5 BT: 7}
****************************/
/***************************
Processing list:
 {S:3407 E:3505 D:5 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#9(8) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(info2.getText().equals(","))else impl += getTypeName(info2); {S:3408 E:3473 D:5 BT: 1}
impl += ", "; {S:3447 E:3459 D:6 BT: 0}
****************************/
/***************************
Processing list:
if(info2.getText().equals(",")){} {S:3408 E:3473 D:5 BT: 1}
QuicktestRunner.execPath += 2; {S:3447 E:0 D:6 BT: 0}
impl += ", "; {S:3447 E:3459 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#10(8) Type:2 Paths:1 CP:1
/***************************
Processing list:
 {S:3474 E:3505 D:5 BT: 2}
impl += getTypeName(info2); {S:3479 E:3505 D:5 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:3474 E:3505 D:5 BT: 2}
QuicktestRunner.execPath += 1; {S:3479 E:0 D:6 BT: 0}
impl += getTypeName(info2); {S:3479 E:3505 D:6 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
mods = VarInfoTest.processModifiers(xx); {S:2604 E:2639 D:0 BT: 0}
ParseTree info = null; {S:2646 E:2667 D:0 BT: 0}
extendsClass = ""; {S:2674 E:2691 D:0 BT: 0}
impl = ""; {S:2698 E:2707 D:0 BT: 0}
info =(ParseTree)in.getChild(1); {S:2714 E:2747 D:0 BT: 0}
className = info.getText(); {S:2752 E:2778 D:0 BT: 0}
int i = 2; {S:2783 E:2792 D:0 BT: 0}
this.fromFile = fromFile; {S:2797 E:2821 D:0 BT: 0}
while(i<in.getChildCount()){} {S:2826 E:3566 D:0 BT: 0}
<sublist>
info =(ParseTree)in.getChild(i); {S:2865 E:2898 D:1 BT: 0}
String txt = info.getText(); {S:2904 E:2931 D:1 BT: 0}
</sublist>
info =(ParseTree)in.getChild(i); {S:2865 E:2898 D:1 BT: 0}
String txt = info.getText(); {S:2904 E:2931 D:1 BT: 0}
 {S:2936 E:3561 D:1 BT: 7}
if(txt.equals("extends")){} {S:2937 E:3074 D:1 BT: 1}
QuicktestRunner.execPath += 3; {S:2974 E:0 D:2 BT: 0}
info =(ParseTree)in.getChild(i + 1); {S:2974 E:3011 D:2 BT: 0}
extendsClass = getTypeName(info); {S:3018 E:3050 D:2 BT: 0}
i += 2; {S:3057 E:3063 D:2 BT: 0}
else{} {S:3075 E:3561 D:1 BT: 2}
 {S:3079 E:3561 D:2 BT: 7}
if(txt.equals("implements")){} {S:3080 E:3552 D:2 BT: 1}
info =(ParseTree)in.getChild(i + 1); {S:3120 E:3157 D:3 BT: 0}
ParseTree info2 = null; {S:3229 E:3251 D:3 BT: 0}
int j = 0; {S:3258 E:3267 D:3 BT: 0}
while(j<info.getChildCount()){} {S:3274 E:3523 D:3 BT: 0}
<sublist>
info2 =(ParseTree)info.getChild(j); {S:3319 E:3355 D:4 BT: 0}
j ++; {S:3513 E:3516 D:4 BT: 0}
</sublist>
info2 =(ParseTree)info.getChild(j); {S:3319 E:3355 D:4 BT: 0}
 {S:3407 E:3505 D:4 BT: 7}
if(info2.getText().equals(",")){} {S:3408 E:3473 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:3447 E:0 D:5 BT: 0}
impl += ", "; {S:3447 E:3459 D:5 BT: 0}
else{} {S:3474 E:3505 D:4 BT: 2}
QuicktestRunner.execPath += 1; {S:3479 E:0 D:5 BT: 0}
impl += getTypeName(info2); {S:3479 E:3505 D:5 BT: 0}
j ++; {S:3513 E:3516 D:4 BT: 0}
i += 2; {S:3530 E:3536 D:3 BT: 0}
else{} {S:3553 E:3561 D:2 BT: 2}
i ++; {S:3558 E:3561 D:3 BT: 0}
classIndex = ci.intValue(); {S:3573 E:3599 D:0 BT: 0}
vars = new VarListTest(); {S:3606 E:3626 D:0 BT: 0}
methods = new MethodListTest(classIndex); {S:3633 E:3669 D:0 BT: 0}
imports = new PreambleTestList(); {S:3676 E:3704 D:0 BT: 0}
otherSetup(); {S:3711 E:3723 D:0 BT: 0}
****************************/
   mods = VarInfoTest.processModifiers(xx); //S:2604   E:2639 D: 0BT: 0
   ParseTree info = null; //S:2646   E:2667 D: 0BT: 0
   extendsClass = ""; //S:2674   E:2691 D: 0BT: 0
   impl = ""; //S:2698   E:2707 D: 0BT: 0
   info =(ParseTree)in.getChild(1); //S:2714   E:2747 D: 0BT: 0
   className = info.getText(); //S:2752   E:2778 D: 0BT: 0
   int i = 2; //S:2783   E:2792 D: 0BT: 0
   this.fromFile = fromFile; //S:2797   E:2821 D: 0BT: 0
   while(i<in.getChildCount()) //S:2826   E:3566 D: 0BT: 0
   {
      info =(ParseTree)in.getChild(i); //S:2865   E:2898 D: 1BT: 0
      String txt = info.getText(); //S:2904   E:2931 D: 1BT: 0
       //S:2936   E:3561 D: 1BT: 7
      if(txt.equals("extends")) //S:2937   E:3074 D: 1BT: 1
      {
         QuicktestRunner.execPath += 3; //S:2974   E:0 D: 2BT: 0
         info =(ParseTree)in.getChild(i + 1); //S:2974   E:3011 D: 2BT: 0
         extendsClass = getTypeName(info); //S:3018   E:3050 D: 2BT: 0
         i += 2; //S:3057   E:3063 D: 2BT: 0
      }
      else //S:3075   E:3561 D: 1BT: 2
      {
          //S:3079   E:3561 D: 2BT: 7
         if(txt.equals("implements")) //S:3080   E:3552 D: 2BT: 1
         {
            info =(ParseTree)in.getChild(i + 1); //S:3120   E:3157 D: 3BT: 0
            ParseTree info2 = null; //S:3229   E:3251 D: 3BT: 0
            int j = 0; //S:3258   E:3267 D: 3BT: 0
            while(j<info.getChildCount()) //S:3274   E:3523 D: 3BT: 0
            {
               info2 =(ParseTree)info.getChild(j); //S:3319   E:3355 D: 4BT: 0
                //S:3407   E:3505 D: 4BT: 7
               if(info2.getText().equals(",")) //S:3408   E:3473 D: 4BT: 1
               {
                  QuicktestRunner.execPath += 2; //S:3447   E:0 D: 5BT: 0
                  impl += ", "; //S:3447   E:3459 D: 5BT: 0
               }
               else //S:3474   E:3505 D: 4BT: 2
               {
                  QuicktestRunner.execPath += 1; //S:3479   E:0 D: 5BT: 0
                  impl += getTypeName(info2); //S:3479   E:3505 D: 5BT: 0
               }
               j ++; //S:3513   E:3516 D: 4BT: 0
            }
            i += 2; //S:3530   E:3536 D: 3BT: 0
         }
         else //S:3553   E:3561 D: 2BT: 2
         {
            i ++; //S:3558   E:3561 D: 3BT: 0
         }
      }
   }
   classIndex = ci.intValue(); //S:3573   E:3599 D: 0BT: 0
   vars = new VarListTest(); //S:3606   E:3626 D: 0BT: 0
   methods = new MethodListTest(classIndex); //S:3633   E:3669 D: 0BT: 0
   imports = new PreambleTestList(); //S:3676   E:3704 D: 0BT: 0
   otherSetup(); //S:3711   E:3723 D: 0BT: 0
   }

   public static String getTypeName(ParseTree in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:8 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:3798 E:3816 D:0 BT: 0}
ParseTree info = null; {S:3823 E:3844 D:0 BT: 0}
int i = 0; {S:3851 E:3860 D:0 BT: 0}
while(i<in.getChildCount()){} {S:3867 E:4533 D:0 BT: 0}
<sublist>
info =(ParseTree)in.getChild(i); {S:3910 E:3943 D:1 BT: 0}
i ++; {S:4123 E:4126 D:1 BT: 0}
info =(ParseTree)in.getChild(i); {S:4134 E:4167 D:1 BT: 0}
</sublist>
while(i<in.getChildCount()){} {S:4540 E:4679 D:0 BT: 0}
<sublist>
info =(ParseTree)in.getChild(i); {S:4583 E:4616 D:1 BT: 0}
rtnVal += info.getText(); {S:4637 E:4661 D:1 BT: 0}
i ++; {S:4669 E:4672 D:1 BT: 0}
</sublist>
return rtnVal; {S:4692 E:4705 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:3798 E:3816 D:0 BT: 0}
ParseTree info = null; {S:3823 E:3844 D:0 BT: 0}
int i = 0; {S:3851 E:3860 D:0 BT: 0}
while(i<in.getChildCount()){} {S:3867 E:4533 D:0 BT: 0}
<sublist>
info =(ParseTree)in.getChild(i); {S:3910 E:3943 D:1 BT: 0}
i ++; {S:4123 E:4126 D:1 BT: 0}
info =(ParseTree)in.getChild(i); {S:4134 E:4167 D:1 BT: 0}
</sublist>
while(i<in.getChildCount()){} {S:4540 E:4679 D:0 BT: 0}
<sublist>
info =(ParseTree)in.getChild(i); {S:4583 E:4616 D:1 BT: 0}
rtnVal += info.getText(); {S:4637 E:4661 D:1 BT: 0}
i ++; {S:4669 E:4672 D:1 BT: 0}
</sublist>
return rtnVal; {S:4692 E:4705 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:3968 E:4115 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:3968 E:4115 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:4176 E:4526 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:4176 E:4526 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(info.getText().equals("primitiveType"))else rtnVal += info.getText(); {S:3969 E:4085 D:1 BT: 1}
rtnVal +=((ParseTree)info.getChild(0)).getText(); {S:4019 E:4069 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(info.getText().equals("primitiveType")){} {S:3969 E:4085 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:4019 E:0 D:2 BT: 0}
rtnVal +=((ParseTree)info.getChild(0)).getText(); {S:4019 E:4069 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:4086 E:4115 D:1 BT: 2}
rtnVal += info.getText(); {S:4091 E:4115 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:4086 E:4115 D:1 BT: 2}
rtnVal += info.getText(); {S:4091 E:4115 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(info == null)else if(info.getText().equals("TypeArguments")){}else if(info.getText().startsWith("["))break {S:4177 E:4217 D:1 BT: 1}
break; {S:4203 E:4208 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(info == null){} {S:4177 E:4217 D:1 BT: 1}
QuicktestRunner.execPath += 3; {S:4203 E:0 D:2 BT: 0}
break; {S:4203 E:4208 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:3 CP:0
/***************************
Processing list:
 {S:4218 E:4526 D:1 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:4218 E:4526 D:1 BT: 2}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(7) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:4222 E:4526 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:4222 E:4526 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#9(8) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(info.getText().equals("TypeArguments")){}else if(info.getText().startsWith("["))break {S:4223 E:4394 D:3 BT: 1}
rtnVal += "<" + getTypeName((ParseTree)info.getChild(1))+ ">"; {S:4285 E:4348 D:4 BT: 0}
i ++; {S:4374 E:4377 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(info.getText().equals("TypeArguments")){} {S:4223 E:4394 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:4285 E:0 D:4 BT: 0}
rtnVal += "<" + getTypeName((ParseTree)info.getChild(1))+ ">"; {S:4285 E:4348 D:4 BT: 0}
i ++; {S:4374 E:4377 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#10(8) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:4395 E:4526 D:3 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:4395 E:4526 D:3 BT: 2}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(10) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:4399 E:4526 D:5 BT: 7}
****************************/
/***************************
Processing list:
 {S:4399 E:4526 D:5 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#12(11) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(info.getText().startsWith("["))else{} {S:4400 E:4467 D:5 BT: 1}
break; {S:4442 E:4447 D:6 BT: 0}
****************************/
/***************************
Processing list:
if(info.getText().startsWith("[")){} {S:4400 E:4467 D:5 BT: 1}
QuicktestRunner.execPath += 1; {S:4442 E:0 D:6 BT: 0}
break; {S:4442 E:4447 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#13(11) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:4468 E:4526 D:5 BT: 2}
rtnVal += info.getText(); {S:4482 E:4506 D:5 BT: 0}
i ++; {S:4515 E:4518 D:5 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:4468 E:4526 D:5 BT: 2}
rtnVal += info.getText(); {S:4482 E:4506 D:6 BT: 0}
i ++; {S:4515 E:4518 D:6 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:3798 E:3816 D:0 BT: 0}
ParseTree info = null; {S:3823 E:3844 D:0 BT: 0}
int i = 0; {S:3851 E:3860 D:0 BT: 0}
while(i<in.getChildCount()){} {S:3867 E:4533 D:0 BT: 0}
<sublist>
info =(ParseTree)in.getChild(i); {S:3910 E:3943 D:1 BT: 0}
i ++; {S:4123 E:4126 D:1 BT: 0}
info =(ParseTree)in.getChild(i); {S:4134 E:4167 D:1 BT: 0}
</sublist>
info =(ParseTree)in.getChild(i); {S:3910 E:3943 D:1 BT: 0}
 {S:3968 E:4115 D:1 BT: 7}
if(info.getText().equals("primitiveType")){} {S:3969 E:4085 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:4019 E:0 D:2 BT: 0}
rtnVal +=((ParseTree)info.getChild(0)).getText(); {S:4019 E:4069 D:2 BT: 0}
else{} {S:4086 E:4115 D:1 BT: 2}
rtnVal += info.getText(); {S:4091 E:4115 D:2 BT: 0}
i ++; {S:4123 E:4126 D:1 BT: 0}
info =(ParseTree)in.getChild(i); {S:4134 E:4167 D:1 BT: 0}
 {S:4176 E:4526 D:1 BT: 7}
if(info == null){} {S:4177 E:4217 D:1 BT: 1}
QuicktestRunner.execPath += 3; {S:4203 E:0 D:2 BT: 0}
break; {S:4203 E:4208 D:2 BT: 0}
else{} {S:4218 E:4526 D:1 BT: 2}
 {S:4222 E:4526 D:2 BT: 7}
if(info.getText().equals("TypeArguments")){} {S:4223 E:4394 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:4285 E:0 D:3 BT: 0}
rtnVal += "<" + getTypeName((ParseTree)info.getChild(1))+ ">"; {S:4285 E:4348 D:3 BT: 0}
i ++; {S:4374 E:4377 D:3 BT: 0}
else{} {S:4395 E:4526 D:2 BT: 2}
 {S:4399 E:4526 D:3 BT: 7}
if(info.getText().startsWith("[")){} {S:4400 E:4467 D:3 BT: 1}
QuicktestRunner.execPath += 1; {S:4442 E:0 D:4 BT: 0}
break; {S:4442 E:4447 D:4 BT: 0}
else{} {S:4468 E:4526 D:3 BT: 2}
rtnVal += info.getText(); {S:4482 E:4506 D:4 BT: 0}
i ++; {S:4515 E:4518 D:4 BT: 0}
while(i<in.getChildCount()){} {S:4540 E:4679 D:0 BT: 0}
<sublist>
info =(ParseTree)in.getChild(i); {S:4583 E:4616 D:1 BT: 0}
rtnVal += info.getText(); {S:4637 E:4661 D:1 BT: 0}
i ++; {S:4669 E:4672 D:1 BT: 0}
</sublist>
info =(ParseTree)in.getChild(i); {S:4583 E:4616 D:1 BT: 0}
rtnVal += info.getText(); {S:4637 E:4661 D:1 BT: 0}
i ++; {S:4669 E:4672 D:1 BT: 0}
return rtnVal; {S:4692 E:4705 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:3798   E:3816 D: 0BT: 0
   ParseTree info = null; //S:3823   E:3844 D: 0BT: 0
   int i = 0; //S:3851   E:3860 D: 0BT: 0
   while(i<in.getChildCount()) //S:3867   E:4533 D: 0BT: 0
   {
      info =(ParseTree)in.getChild(i); //S:3910   E:3943 D: 1BT: 0
       //S:3968   E:4115 D: 1BT: 7
      if(info.getText().equals("primitiveType")) //S:3969   E:4085 D: 1BT: 1
      {
         QuicktestRunner.execPath += 4; //S:4019   E:0 D: 2BT: 0
         rtnVal +=((ParseTree)info.getChild(0)).getText(); //S:4019   E:4069 D: 2BT: 0
      }
      else //S:4086   E:4115 D: 1BT: 2
      {
         rtnVal += info.getText(); //S:4091   E:4115 D: 2BT: 0
      }
      i ++; //S:4123   E:4126 D: 1BT: 0
      info =(ParseTree)in.getChild(i); //S:4134   E:4167 D: 1BT: 0
       //S:4176   E:4526 D: 1BT: 7
      if(info == null) //S:4177   E:4217 D: 1BT: 1
      {
         QuicktestRunner.execPath += 3; //S:4203   E:0 D: 2BT: 0
         break; //S:4203   E:4208 D: 2BT: 0
      }
      else //S:4218   E:4526 D: 1BT: 2
      {
          //S:4222   E:4526 D: 2BT: 7
         if(info.getText().equals("TypeArguments")) //S:4223   E:4394 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:4285   E:0 D: 3BT: 0
            rtnVal += "<" + getTypeName((ParseTree)info.getChild(1))+ ">"; //S:4285   E:4348 D: 3BT: 0
            i ++; //S:4374   E:4377 D: 3BT: 0
         }
         else //S:4395   E:4526 D: 2BT: 2
         {
             //S:4399   E:4526 D: 3BT: 7
            if(info.getText().startsWith("[")) //S:4400   E:4467 D: 3BT: 1
            {
               QuicktestRunner.execPath += 1; //S:4442   E:0 D: 4BT: 0
               break; //S:4442   E:4447 D: 4BT: 0
            }
            else //S:4468   E:4526 D: 3BT: 2
            {
               rtnVal += info.getText(); //S:4482   E:4506 D: 4BT: 0
               i ++; //S:4515   E:4518 D: 4BT: 0
            }
         }
      }
   }
   while(i<in.getChildCount()) //S:4540   E:4679 D: 0BT: 0
   {
      info =(ParseTree)in.getChild(i); //S:4583   E:4616 D: 1BT: 0
      rtnVal += info.getText(); //S:4637   E:4661 D: 1BT: 0
      i ++; //S:4669   E:4672 D: 1BT: 0
   }
   return rtnVal; //S:4692   E:4705 D: 0BT: 0
   }

   public void loadMethodText() throws IOException
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
FileReader fr = new FileReader(fromFile); {S:4863 E:4903 D:0 BT: 0}
BufferedReader br = new BufferedReader(fr); {S:4910 E:4952 D:0 BT: 0}
int pos = 0; {S:4959 E:4970 D:0 BT: 0}
for(int i = 0;i<methods.size();i ++){} {S:4977 E:5831 D:0 BT: 0}
<sublist>
MethodInfoTest mi = methods.getMethod(i); {S:5030 E:5066 D:1 BT: 0}
mi.methodText = ""; {S:5074 E:5092 D:1 BT: 0}
int s = mi.mti.startChar; {S:5100 E:5125 D:1 BT: 0}
int e = mi.mti.endChar; {S:5133 E:5156 D:1 BT: 0}
int len = e - s; {S:5279 E:5294 D:1 BT: 0}
br.skip(s - pos); {S:5302 E:5318 D:1 BT: 0}
pos = s; {S:5326 E:5333 D:1 BT: 0}
for(int j = 0;j<= len;j ++){} {S:5341 E:5441 D:1 BT: 0}
<sublist>
mi.methodText +=(char)br.read(); {S:5386 E:5419 D:2 BT: 0}
pos ++; {S:5428 E:5433 D:2 BT: 0}
</sublist>
mi.methodText = "   " + mi.methodText; {S:5724 E:5761 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
FileReader fr = new FileReader(fromFile); {S:4863 E:4903 D:0 BT: 0}
BufferedReader br = new BufferedReader(fr); {S:4910 E:4952 D:0 BT: 0}
int pos = 0; {S:4959 E:4970 D:0 BT: 0}
for(int i = 0;i<methods.size();i ++){} {S:4977 E:5831 D:0 BT: 0}
<sublist>
MethodInfoTest mi = methods.getMethod(i); {S:5030 E:5066 D:1 BT: 0}
mi.methodText = ""; {S:5074 E:5092 D:1 BT: 0}
int s = mi.mti.startChar; {S:5100 E:5125 D:1 BT: 0}
int e = mi.mti.endChar; {S:5133 E:5156 D:1 BT: 0}
int len = e - s; {S:5279 E:5294 D:1 BT: 0}
br.skip(s - pos); {S:5302 E:5318 D:1 BT: 0}
pos = s; {S:5326 E:5333 D:1 BT: 0}
for(int j = 0;j<= len;j ++){} {S:5341 E:5441 D:1 BT: 0}
<sublist>
mi.methodText +=(char)br.read(); {S:5386 E:5419 D:2 BT: 0}
pos ++; {S:5428 E:5433 D:2 BT: 0}
</sublist>
mi.methodText = "   " + mi.methodText; {S:5724 E:5761 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
FileReader fr = new FileReader(fromFile); {S:4863 E:4903 D:0 BT: 0}
BufferedReader br = new BufferedReader(fr); {S:4910 E:4952 D:0 BT: 0}
int pos = 0; {S:4959 E:4970 D:0 BT: 0}
for(int i = 0;i<methods.size();i ++){} {S:4977 E:5831 D:0 BT: 0}
<sublist>
MethodInfoTest mi = methods.getMethod(i); {S:5030 E:5066 D:1 BT: 0}
mi.methodText = ""; {S:5074 E:5092 D:1 BT: 0}
int s = mi.mti.startChar; {S:5100 E:5125 D:1 BT: 0}
int e = mi.mti.endChar; {S:5133 E:5156 D:1 BT: 0}
int len = e - s; {S:5279 E:5294 D:1 BT: 0}
br.skip(s - pos); {S:5302 E:5318 D:1 BT: 0}
pos = s; {S:5326 E:5333 D:1 BT: 0}
for(int j = 0;j<= len;j ++){} {S:5341 E:5441 D:1 BT: 0}
<sublist>
mi.methodText +=(char)br.read(); {S:5386 E:5419 D:2 BT: 0}
pos ++; {S:5428 E:5433 D:2 BT: 0}
</sublist>
mi.methodText = "   " + mi.methodText; {S:5724 E:5761 D:1 BT: 0}
</sublist>
MethodInfoTest mi = methods.getMethod(i); {S:5030 E:5066 D:1 BT: 0}
mi.methodText = ""; {S:5074 E:5092 D:1 BT: 0}
int s = mi.mti.startChar; {S:5100 E:5125 D:1 BT: 0}
int e = mi.mti.endChar; {S:5133 E:5156 D:1 BT: 0}
int len = e - s; {S:5279 E:5294 D:1 BT: 0}
br.skip(s - pos); {S:5302 E:5318 D:1 BT: 0}
pos = s; {S:5326 E:5333 D:1 BT: 0}
for(int j = 0;j<= len;j ++){} {S:5341 E:5441 D:1 BT: 0}
<sublist>
mi.methodText +=(char)br.read(); {S:5386 E:5419 D:2 BT: 0}
pos ++; {S:5428 E:5433 D:2 BT: 0}
</sublist>
mi.methodText +=(char)br.read(); {S:5386 E:5419 D:2 BT: 0}
pos ++; {S:5428 E:5433 D:2 BT: 0}
mi.methodText = "   " + mi.methodText; {S:5724 E:5761 D:1 BT: 0}
****************************/
   FileReader fr = new FileReader(fromFile); //S:4863   E:4903 D: 0BT: 0
   BufferedReader br = new BufferedReader(fr); //S:4910   E:4952 D: 0BT: 0
   int pos = 0; //S:4959   E:4970 D: 0BT: 0
   for(int i = 0;i<methods.size();i ++) //S:4977   E:5831 D: 0BT: 0
   {
      MethodInfoTest mi = methods.getMethod(i); //S:5030   E:5066 D: 1BT: 0
      mi.methodText = ""; //S:5074   E:5092 D: 1BT: 0
      int s = mi.mti.startChar; //S:5100   E:5125 D: 1BT: 0
      int e = mi.mti.endChar; //S:5133   E:5156 D: 1BT: 0
      int len = e - s; //S:5279   E:5294 D: 1BT: 0
      br.skip(s - pos); //S:5302   E:5318 D: 1BT: 0
      pos = s; //S:5326   E:5333 D: 1BT: 0
      for(int j = 0;j<= len;j ++) //S:5341   E:5441 D: 1BT: 0
      {
         mi.methodText +=(char)br.read(); //S:5386   E:5419 D: 2BT: 0
         pos ++; //S:5428   E:5433 D: 2BT: 0
      }
      mi.methodText = "   " + mi.methodText; //S:5724   E:5761 D: 1BT: 0
   }
   }

   public String getClassOpen(String tab, boolean asQT)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
String rtnVal = mods; {S:5912 E:5932 D:0 BT: 0}
rtnVal += "class " + className; {S:5939 E:5969 D:0 BT: 0}
rtnVal += "\n"; {S:6158 E:6172 D:0 BT: 0}
rtnVal += "{\n"; {S:6179 E:6194 D:0 BT: 0}
rtnVal += vars.publicList(tab)+ "\n"; {S:6201 E:6238 D:0 BT: 0}
return rtnVal; {S:6246 E:6259 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = mods; {S:5912 E:5932 D:0 BT: 0}
rtnVal += "class " + className; {S:5939 E:5969 D:0 BT: 0}
rtnVal += "\n"; {S:6158 E:6172 D:0 BT: 0}
rtnVal += "{\n"; {S:6179 E:6194 D:0 BT: 0}
rtnVal += vars.publicList(tab)+ "\n"; {S:6201 E:6238 D:0 BT: 0}
return rtnVal; {S:6246 E:6259 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:6016 E:6087 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:6016 E:6087 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:6093 E:6151 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:6093 E:6151 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(! extendsClass.isEmpty()) {S:6017 E:6087 D:0 BT: 1}
rtnVal += " extends " + extendsClass; {S:6051 E:6087 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(! extendsClass.isEmpty()){} {S:6017 E:6087 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:6051 E:0 D:1 BT: 0}
rtnVal += " extends " + extendsClass; {S:6051 E:6087 D:1 BT: 0}
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
if(! impl.isEmpty()) {S:6094 E:6151 D:0 BT: 1}
rtnVal += " implements " + impl; {S:6120 E:6151 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(! impl.isEmpty()){} {S:6094 E:6151 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:6120 E:0 D:1 BT: 0}
rtnVal += " implements " + impl; {S:6120 E:6151 D:1 BT: 0}
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
String rtnVal = mods; {S:5912 E:5932 D:0 BT: 0}
rtnVal += "class " + className; {S:5939 E:5969 D:0 BT: 0}
 {S:6016 E:6087 D:0 BT: 7}
if(! extendsClass.isEmpty()){} {S:6017 E:6087 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:6051 E:0 D:1 BT: 0}
rtnVal += " extends " + extendsClass; {S:6051 E:6087 D:1 BT: 0}
 {S:6093 E:6151 D:0 BT: 7}
if(! impl.isEmpty()){} {S:6094 E:6151 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:6120 E:0 D:1 BT: 0}
rtnVal += " implements " + impl; {S:6120 E:6151 D:1 BT: 0}
rtnVal += "\n"; {S:6158 E:6172 D:0 BT: 0}
rtnVal += "{\n"; {S:6179 E:6194 D:0 BT: 0}
rtnVal += vars.publicList(tab)+ "\n"; {S:6201 E:6238 D:0 BT: 0}
return rtnVal; {S:6246 E:6259 D:0 BT: 0}
****************************/
   String rtnVal = mods; //S:5912   E:5932 D: 0BT: 0
   rtnVal += "class " + className; //S:5939   E:5969 D: 0BT: 0
    //S:6016   E:6087 D: 0BT: 7
   if(! extendsClass.isEmpty()) //S:6017   E:6087 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:6051   E:0 D: 1BT: 0
      rtnVal += " extends " + extendsClass; //S:6051   E:6087 D: 1BT: 0
   }
    //S:6093   E:6151 D: 0BT: 7
   if(! impl.isEmpty()) //S:6094   E:6151 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:6120   E:0 D: 1BT: 0
      rtnVal += " implements " + impl; //S:6120   E:6151 D: 1BT: 0
   }
   rtnVal += "\n"; //S:6158   E:6172 D: 0BT: 0
   rtnVal += "{\n"; //S:6179   E:6194 D: 0BT: 0
   rtnVal += vars.publicList(tab)+ "\n"; //S:6201   E:6238 D: 0BT: 0
   return rtnVal; //S:6246   E:6259 D: 0BT: 0
   }

   public String getClassTestName()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return className + "Test"; {S:6320 E:6345 D:0 BT: 0}
****************************/
/***************************
Processing list:
return className + "Test"; {S:6320 E:6345 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return className + "Test"; {S:6320 E:6345 D:0 BT: 0}
****************************/
   return className + "Test"; //S:6320   E:6345 D: 0BT: 0
   }

   public String getQTClassName()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return className + "_WBQT"; {S:6404 E:6430 D:0 BT: 0}
****************************/
/***************************
Processing list:
return className + "_WBQT"; {S:6404 E:6430 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return className + "_WBQT"; {S:6404 E:6430 D:0 BT: 0}
****************************/
   return className + "_WBQT"; //S:6404   E:6430 D: 0BT: 0
   }

   public void replaceQt(String fx, String testDir)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
WhiteboxUtils.chDir(testDir); {S:6507 E:6535 D:0 BT: 0}
String testFile = getClassTestName()+ ".java"; {S:6542 E:6588 D:0 BT: 0}
String[]tst = WhiteboxUtils.loadFile(testFile); {S:6595 E:6642 D:0 BT: 0}
String[]newFX = fx.split("\n"); {S:6649 E:6680 D:0 BT: 0}
String[]newTF = new String[tst.length - qtLen + newFX.length]; {S:6687 E:6750 D:0 BT: 0}
int len = 0; {S:6757 E:6768 D:0 BT: 0}
for(int i = 0;i<qtInsertionPoint;i ++){} {S:6775 E:6869 D:0 BT: 0}
<sublist>
newTF[len]= tst[i]; {S:6830 E:6849 D:1 BT: 0}
len ++; {S:6857 E:6862 D:1 BT: 0}
</sublist>
for(int i = 0;i<newFX.length;i ++){} {S:6876 E:6968 D:0 BT: 0}
<sublist>
newTF[len]= newFX[i]; {S:6927 E:6948 D:1 BT: 0}
len ++; {S:6956 E:6961 D:1 BT: 0}
</sublist>
for(int i = qtInsertionPoint + qtLen;i<tst.length;i ++){} {S:6975 E:7086 D:0 BT: 0}
<sublist>
newTF[len]= tst[i]; {S:7047 E:7066 D:1 BT: 0}
len ++; {S:7074 E:7079 D:1 BT: 0}
</sublist>
WhiteboxUtils.writeFile(testFile , newTF); {S:7093 E:7133 D:0 BT: 0}
qtLen = newFX.length; {S:7140 E:7160 D:0 BT: 0}
****************************/
/***************************
Processing list:
WhiteboxUtils.chDir(testDir); {S:6507 E:6535 D:0 BT: 0}
String testFile = getClassTestName()+ ".java"; {S:6542 E:6588 D:0 BT: 0}
String[]tst = WhiteboxUtils.loadFile(testFile); {S:6595 E:6642 D:0 BT: 0}
String[]newFX = fx.split("\n"); {S:6649 E:6680 D:0 BT: 0}
String[]newTF = new String[tst.length - qtLen + newFX.length]; {S:6687 E:6750 D:0 BT: 0}
int len = 0; {S:6757 E:6768 D:0 BT: 0}
for(int i = 0;i<qtInsertionPoint;i ++){} {S:6775 E:6869 D:0 BT: 0}
<sublist>
newTF[len]= tst[i]; {S:6830 E:6849 D:1 BT: 0}
len ++; {S:6857 E:6862 D:1 BT: 0}
</sublist>
for(int i = 0;i<newFX.length;i ++){} {S:6876 E:6968 D:0 BT: 0}
<sublist>
newTF[len]= newFX[i]; {S:6927 E:6948 D:1 BT: 0}
len ++; {S:6956 E:6961 D:1 BT: 0}
</sublist>
for(int i = qtInsertionPoint + qtLen;i<tst.length;i ++){} {S:6975 E:7086 D:0 BT: 0}
<sublist>
newTF[len]= tst[i]; {S:7047 E:7066 D:1 BT: 0}
len ++; {S:7074 E:7079 D:1 BT: 0}
</sublist>
WhiteboxUtils.writeFile(testFile , newTF); {S:7093 E:7133 D:0 BT: 0}
qtLen = newFX.length; {S:7140 E:7160 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
WhiteboxUtils.chDir(testDir); {S:6507 E:6535 D:0 BT: 0}
String testFile = getClassTestName()+ ".java"; {S:6542 E:6588 D:0 BT: 0}
String[]tst = WhiteboxUtils.loadFile(testFile); {S:6595 E:6642 D:0 BT: 0}
String[]newFX = fx.split("\n"); {S:6649 E:6680 D:0 BT: 0}
String[]newTF = new String[tst.length - qtLen + newFX.length]; {S:6687 E:6750 D:0 BT: 0}
int len = 0; {S:6757 E:6768 D:0 BT: 0}
for(int i = 0;i<qtInsertionPoint;i ++){} {S:6775 E:6869 D:0 BT: 0}
<sublist>
newTF[len]= tst[i]; {S:6830 E:6849 D:1 BT: 0}
len ++; {S:6857 E:6862 D:1 BT: 0}
</sublist>
newTF[len]= tst[i]; {S:6830 E:6849 D:1 BT: 0}
len ++; {S:6857 E:6862 D:1 BT: 0}
for(int i = 0;i<newFX.length;i ++){} {S:6876 E:6968 D:0 BT: 0}
<sublist>
newTF[len]= newFX[i]; {S:6927 E:6948 D:1 BT: 0}
len ++; {S:6956 E:6961 D:1 BT: 0}
</sublist>
newTF[len]= newFX[i]; {S:6927 E:6948 D:1 BT: 0}
len ++; {S:6956 E:6961 D:1 BT: 0}
for(int i = qtInsertionPoint + qtLen;i<tst.length;i ++){} {S:6975 E:7086 D:0 BT: 0}
<sublist>
newTF[len]= tst[i]; {S:7047 E:7066 D:1 BT: 0}
len ++; {S:7074 E:7079 D:1 BT: 0}
</sublist>
newTF[len]= tst[i]; {S:7047 E:7066 D:1 BT: 0}
len ++; {S:7074 E:7079 D:1 BT: 0}
WhiteboxUtils.writeFile(testFile , newTF); {S:7093 E:7133 D:0 BT: 0}
qtLen = newFX.length; {S:7140 E:7160 D:0 BT: 0}
****************************/
   WhiteboxUtils.chDir(testDir); //S:6507   E:6535 D: 0BT: 0
   String testFile = getClassTestName()+ ".java"; //S:6542   E:6588 D: 0BT: 0
   String[]tst = WhiteboxUtils.loadFile(testFile); //S:6595   E:6642 D: 0BT: 0
   String[]newFX = fx.split("\n"); //S:6649   E:6680 D: 0BT: 0
   String[]newTF = new String[tst.length - qtLen + newFX.length]; //S:6687   E:6750 D: 0BT: 0
   int len = 0; //S:6757   E:6768 D: 0BT: 0
   for(int i = 0;i<qtInsertionPoint;i ++) //S:6775   E:6869 D: 0BT: 0
   {
      newTF[len]= tst[i]; //S:6830   E:6849 D: 1BT: 0
      len ++; //S:6857   E:6862 D: 1BT: 0
   }
   for(int i = 0;i<newFX.length;i ++) //S:6876   E:6968 D: 0BT: 0
   {
      newTF[len]= newFX[i]; //S:6927   E:6948 D: 1BT: 0
      len ++; //S:6956   E:6961 D: 1BT: 0
   }
   for(int i = qtInsertionPoint + qtLen;i<tst.length;i ++) //S:6975   E:7086 D: 0BT: 0
   {
      newTF[len]= tst[i]; //S:7047   E:7066 D: 1BT: 0
      len ++; //S:7074   E:7079 D: 1BT: 0
   }
   WhiteboxUtils.writeFile(testFile , newTF); //S:7093   E:7133 D: 0BT: 0
   qtLen = newFX.length; //S:7140   E:7160 D: 0BT: 0
   }

   public void resetQt(int lineNo, boolean softReset)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
qtInsertionPoint = lineNo; {S:7296 E:7321 D:0 BT: 0}
qtLen = 1; {S:7328 E:7337 D:0 BT: 0}
****************************/
/***************************
Processing list:
qtInsertionPoint = lineNo; {S:7296 E:7321 D:0 BT: 0}
qtLen = 1; {S:7328 E:7337 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:7238 E:7289 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:7238 E:7289 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(softReset && qtInsertionPoint>0) {S:7239 E:7289 D:0 BT: 1}
return; {S:7283 E:7289 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(softReset && qtInsertionPoint>0){} {S:7239 E:7289 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:7283 E:0 D:1 BT: 0}
return; {S:7283 E:7289 D:1 BT: 0}
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
 {S:7238 E:7289 D:0 BT: 7}
if(softReset && qtInsertionPoint>0){} {S:7239 E:7289 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:7283 E:0 D:1 BT: 0}
return; {S:7283 E:7289 D:1 BT: 0}
qtInsertionPoint = lineNo; {S:7296 E:7321 D:0 BT: 0}
qtLen = 1; {S:7328 E:7337 D:0 BT: 0}
****************************/
    //S:7238   E:7289 D: 0BT: 7
   if(softReset && qtInsertionPoint>0) //S:7239   E:7289 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:7283   E:0 D: 1BT: 0
      return; //S:7283   E:7289 D: 1BT: 0
   }
   qtInsertionPoint = lineNo; //S:7296   E:7321 D: 0BT: 0
   qtLen = 1; //S:7328   E:7337 D: 0BT: 0
   }

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

