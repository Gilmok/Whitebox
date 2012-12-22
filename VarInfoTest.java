import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class VarInfoTest extends CodeMemberTest
{
   public  String name;
   public  String type;
   public String initValue;
   public  String modifiers;
   public  int nDimensions;
   public int startLine;
   public int endLine;
   public int classIndex;
   public VarListTest internalList;

   VarInfoTest(String type, String name, int lineNo)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
this.setType(type); {S:90955 E:90973 D:0 BT: 0}
this.setName(name); {S:90982 E:91000 D:0 BT: 0}
processDimensions(); {S:91009 E:91028 D:0 BT: 0}
startLine = endLine = lineNo; {S:91037 E:91065 D:0 BT: 0}
****************************/
/***************************
Processing list:
this.setType(type); {S:90955 E:90973 D:0 BT: 0}
this.setName(name); {S:90982 E:91000 D:0 BT: 0}
processDimensions(); {S:91009 E:91028 D:0 BT: 0}
startLine = endLine = lineNo; {S:91037 E:91065 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
this.setType(type); {S:90955 E:90973 D:0 BT: 0}
this.setName(name); {S:90982 E:91000 D:0 BT: 0}
processDimensions(); {S:91009 E:91028 D:0 BT: 0}
startLine = endLine = lineNo; {S:91037 E:91065 D:0 BT: 0}
****************************/
   this.setType(type); //S:90955   E:90973 D: 0BT: 0
   this.setName(name); //S:90982   E:91000 D: 0BT: 0
   processDimensions(); //S:91009   E:91028 D: 0BT: 0
   startLine = endLine = lineNo; //S:91037   E:91065 D: 0BT: 0
   }

   VarInfoTest(String type, String name, ParseTree rest, int ci, String mods)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
modifiers = mods; {S:91164 E:91180 D:0 BT: 0}
initValue = null; {S:91187 E:91203 D:0 BT: 0}
this.setType(type.trim()); {S:91210 E:91235 D:0 BT: 0}
this.setName(name.trim()); {S:91242 E:91267 D:0 BT: 0}
processRest(rest); {S:91274 E:91291 D:0 BT: 0}
classIndex = ci; {S:91298 E:91313 D:0 BT: 0}
internalList = null; {S:91326 E:91345 D:0 BT: 0}
****************************/
/***************************
Processing list:
modifiers = mods; {S:91164 E:91180 D:0 BT: 0}
initValue = null; {S:91187 E:91203 D:0 BT: 0}
this.setType(type.trim()); {S:91210 E:91235 D:0 BT: 0}
this.setName(name.trim()); {S:91242 E:91267 D:0 BT: 0}
processRest(rest); {S:91274 E:91291 D:0 BT: 0}
classIndex = ci; {S:91298 E:91313 D:0 BT: 0}
internalList = null; {S:91326 E:91345 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
modifiers = mods; {S:91164 E:91180 D:0 BT: 0}
initValue = null; {S:91187 E:91203 D:0 BT: 0}
this.setType(type.trim()); {S:91210 E:91235 D:0 BT: 0}
this.setName(name.trim()); {S:91242 E:91267 D:0 BT: 0}
processRest(rest); {S:91274 E:91291 D:0 BT: 0}
classIndex = ci; {S:91298 E:91313 D:0 BT: 0}
internalList = null; {S:91326 E:91345 D:0 BT: 0}
****************************/
   modifiers = mods; //S:91164   E:91180 D: 0BT: 0
   initValue = null; //S:91187   E:91203 D: 0BT: 0
   this.setType(type.trim()); //S:91210   E:91235 D: 0BT: 0
   this.setName(name.trim()); //S:91242   E:91267 D: 0BT: 0
   processRest(rest); //S:91274   E:91291 D: 0BT: 0
   classIndex = ci; //S:91298   E:91313 D: 0BT: 0
   internalList = null; //S:91326   E:91345 D: 0BT: 0
   }

   public VarInfoTest copy()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return new VarInfoTest(getTypeWithDims(), getName(), startLine); {S:91401 E:91460 D:0 BT: 0}
****************************/
/***************************
Processing list:
return new VarInfoTest(getTypeWithDims(), getName(), startLine); {S:91401 E:91460 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return new VarInfoTest(getTypeWithDims(), getName(), startLine); {S:91401 E:91460 D:0 BT: 0}
****************************/
   return new VarInfoTest(getTypeWithDims(), getName(), startLine); //S:91401   E:91460 D: 0BT: 0
   }

   private int countDimensions()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
String glob = getType()+ getName(); {S:91517 E:91552 D:0 BT: 0}
int bracketLevel = 0; {S:91561 E:91581 D:0 BT: 0}
int nDims = 0; {S:91590 E:91603 D:0 BT: 0}
for(int i = 0;i<glob.length();i ++){} {S:91612 E:91886 D:0 BT: 0}
return nDims; {S:91895 E:91907 D:0 BT: 0}
****************************/
/***************************
Processing list:
String glob = getType()+ getName(); {S:91517 E:91552 D:0 BT: 0}
int bracketLevel = 0; {S:91561 E:91581 D:0 BT: 0}
int nDims = 0; {S:91590 E:91603 D:0 BT: 0}
for(int i = 0;i<glob.length();i ++){} {S:91612 E:91886 D:0 BT: 0}
return nDims; {S:91895 E:91907 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:91669 E:91877 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:91669 E:91877 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(glob.charAt(i)== '[')else if(glob.charAt(i)== ']'){} {S:91670 E:91734 D:1 BT: 1}
bracketLevel ++; {S:91709 E:91723 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(glob.charAt(i)== '['){} {S:91670 E:91734 D:1 BT: 1}
QuicktestRunner.execPath += 3; {S:91709 E:0 D:2 BT: 0}
bracketLevel ++; {S:91709 E:91723 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:3 CP:0
/***************************
Processing list:
 {S:91735 E:91877 D:1 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:91735 E:91877 D:1 BT: 2}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(4) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:91739 E:91877 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:91739 E:91877 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(glob.charAt(i)== ']'){} {S:91740 E:91877 D:3 BT: 1}
bracketLevel --; {S:91791 E:91805 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(glob.charAt(i)== ']'){} {S:91740 E:91877 D:3 BT: 1}
bracketLevel --; {S:91791 E:91805 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(6) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:91819 E:91865 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:91819 E:91865 D:4 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#9(8) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(bracketLevel == 0) {S:91820 E:91865 D:4 BT: 1}
nDims ++; {S:91858 E:91865 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(bracketLevel == 0){} {S:91820 E:91865 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:91858 E:0 D:5 BT: 0}
nDims ++; {S:91858 E:91865 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#10(8) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:91865 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 1; {S:91866 E:0 D:5 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String glob = getType()+ getName(); {S:91517 E:91552 D:0 BT: 0}
int bracketLevel = 0; {S:91561 E:91581 D:0 BT: 0}
int nDims = 0; {S:91590 E:91603 D:0 BT: 0}
for(int i = 0;i<glob.length();i ++){} {S:91612 E:91886 D:0 BT: 0}
 {S:91669 E:91877 D:1 BT: 7}
if(glob.charAt(i)== '['){} {S:91670 E:91734 D:1 BT: 1}
QuicktestRunner.execPath += 3; {S:91709 E:0 D:2 BT: 0}
bracketLevel ++; {S:91709 E:91723 D:2 BT: 0}
else{} {S:91735 E:91877 D:1 BT: 2}
 {S:91739 E:91877 D:2 BT: 7}
if(glob.charAt(i)== ']'){} {S:91740 E:91877 D:2 BT: 1}
bracketLevel --; {S:91791 E:91805 D:3 BT: 0}
 {S:91819 E:91865 D:3 BT: 7}
if(bracketLevel == 0){} {S:91820 E:91865 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:91858 E:0 D:4 BT: 0}
nDims ++; {S:91858 E:91865 D:4 BT: 0}
else {S:91865 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 1; {S:91866 E:0 D:4 BT: 0}
return nDims; {S:91895 E:91907 D:0 BT: 0}
****************************/
   String glob = getType()+ getName(); //S:91517   E:91552 D: 0BT: 0
   int bracketLevel = 0; //S:91561   E:91581 D: 0BT: 0
   int nDims = 0; //S:91590   E:91603 D: 0BT: 0
   for(int i = 0;i<glob.length();i ++) //S:91612   E:91886 D: 0BT: 0
   {
       //S:91669   E:91877 D: 1BT: 7
      if(glob.charAt(i)== '[') //S:91670   E:91734 D: 1BT: 1
      {
         QuicktestRunner.execPath += 3; //S:91709   E:0 D: 2BT: 0
         bracketLevel ++; //S:91709   E:91723 D: 2BT: 0
      }
      else //S:91735   E:91877 D: 1BT: 2
      {
          //S:91739   E:91877 D: 2BT: 7
         if(glob.charAt(i)== ']') //S:91740   E:91877 D: 2BT: 1
         {
            bracketLevel --; //S:91791   E:91805 D: 3BT: 0
             //S:91819   E:91865 D: 3BT: 7
            if(bracketLevel == 0) //S:91820   E:91865 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:91858   E:0 D: 4BT: 0
               nDims ++; //S:91858   E:91865 D: 4BT: 0
            }
            else //S:91865   E:0 D: 3BT: 0
            {
               QuicktestRunner.execPath += 1; //S:91866   E:0 D: 4BT: 0
            }
         }
      }
   }
   return nDims; //S:91895   E:91907 D: 0BT: 0
   }

   private void processDimensions()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
nDimensions = countDimensions(); {S:91968 E:91999 D:0 BT: 0}
****************************/
/***************************
Processing list:
nDimensions = countDimensions(); {S:91968 E:91999 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:92005 E:92082 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:92005 E:92082 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:92088 E:92165 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:92088 E:92165 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(name.indexOf("[")>- 1) {S:92006 E:92082 D:0 BT: 1}
name = name.substring(0 , name.indexOf("[")); {S:92039 E:92082 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(name.indexOf("[")>- 1){} {S:92006 E:92082 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:92039 E:0 D:1 BT: 0}
name = name.substring(0 , name.indexOf("[")); {S:92039 E:92082 D:1 BT: 0}
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
if(type.indexOf("[")>- 1) {S:92089 E:92165 D:0 BT: 1}
type = type.substring(0 , type.indexOf("[")); {S:92122 E:92165 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(type.indexOf("[")>- 1){} {S:92089 E:92165 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:92122 E:0 D:1 BT: 0}
type = type.substring(0 , type.indexOf("[")); {S:92122 E:92165 D:1 BT: 0}
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
nDimensions = countDimensions(); {S:91968 E:91999 D:0 BT: 0}
 {S:92005 E:92082 D:0 BT: 7}
if(name.indexOf("[")>- 1){} {S:92006 E:92082 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:92039 E:0 D:1 BT: 0}
name = name.substring(0 , name.indexOf("[")); {S:92039 E:92082 D:1 BT: 0}
 {S:92088 E:92165 D:0 BT: 7}
if(type.indexOf("[")>- 1){} {S:92089 E:92165 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:92122 E:0 D:1 BT: 0}
type = type.substring(0 , type.indexOf("[")); {S:92122 E:92165 D:1 BT: 0}
****************************/
   nDimensions = countDimensions(); //S:91968   E:91999 D: 0BT: 0
    //S:92005   E:92082 D: 0BT: 7
   if(name.indexOf("[")>- 1) //S:92006   E:92082 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:92039   E:0 D: 1BT: 0
      name = name.substring(0 , name.indexOf("[")); //S:92039   E:92082 D: 1BT: 0
   }
    //S:92088   E:92165 D: 0BT: 7
   if(type.indexOf("[")>- 1) //S:92089   E:92165 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:92122   E:0 D: 1BT: 0
      type = type.substring(0 , type.indexOf("[")); //S:92122   E:92165 D: 1BT: 0
   }
   }

   public void addToTree(ClassListTest list, TreeStatusTest info, LinkedList nodeList) 
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
info.getCurrentClass().vars.addAll(internalList); {S:92564 E:92612 D:0 BT: 0}
****************************/
/***************************
Processing list:
info.getCurrentClass().vars.addAll(internalList); {S:92564 E:92612 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:92368 E:92510 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:92368 E:92510 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(info.getCurrentClass().getEndChar()<this.getStartChar()){} {S:92369 E:92510 D:0 BT: 1}
info.setCurrentClass(list.findClassWithChar(this.getStartChar())); {S:92440 E:92505 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(info.getCurrentClass().getEndChar()<this.getStartChar()){} {S:92369 E:92510 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:92440 E:0 D:1 BT: 0}
info.setCurrentClass(list.findClassWithChar(this.getStartChar())); {S:92440 E:92505 D:1 BT: 0}
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
 {S:92368 E:92510 D:0 BT: 7}
if(info.getCurrentClass().getEndChar()<this.getStartChar()){} {S:92369 E:92510 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:92440 E:0 D:1 BT: 0}
info.setCurrentClass(list.findClassWithChar(this.getStartChar())); {S:92440 E:92505 D:1 BT: 0}
info.getCurrentClass().vars.addAll(internalList); {S:92564 E:92612 D:0 BT: 0}
****************************/
    //S:92368   E:92510 D: 0BT: 7
   if(info.getCurrentClass().getEndChar()<this.getStartChar()) //S:92369   E:92510 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:92440   E:0 D: 1BT: 0
      info.setCurrentClass(list.findClassWithChar(this.getStartChar())); //S:92440   E:92505 D: 1BT: 0
   }
   info.getCurrentClass().vars.addAll(internalList); //S:92564   E:92612 D: 0BT: 0
   }

   public static String processModifiers(ParseTree in)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:92937 E:92955 D:0 BT: 0}
for(int i = 0;i<in.getChildCount()- 1;i ++){} {S:92960 E:93301 D:0 BT: 0}
<sublist>
ParseTree xx =(ParseTree)in.getChild(i); {S:93017 E:93058 D:1 BT: 0}
ParseTree xy =(ParseTree)xx.getChild(0); {S:93064 E:93105 D:1 BT: 0}
</sublist>
return rtnVal; {S:93306 E:93319 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:92937 E:92955 D:0 BT: 0}
for(int i = 0;i<in.getChildCount()- 1;i ++){} {S:92960 E:93301 D:0 BT: 0}
<sublist>
ParseTree xx =(ParseTree)in.getChild(i); {S:93017 E:93058 D:1 BT: 0}
ParseTree xy =(ParseTree)xx.getChild(0); {S:93064 E:93105 D:1 BT: 0}
</sublist>
return rtnVal; {S:93306 E:93319 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:93223 E:93296 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:93223 E:93296 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(! xy.getText().equals("annotation")) {S:93224 E:93296 D:1 BT: 1}
rtnVal += xy.getText()+ " "; {S:93268 E:93296 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(! xy.getText().equals("annotation")){} {S:93224 E:93296 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:93268 E:0 D:2 BT: 0}
rtnVal += xy.getText()+ " "; {S:93268 E:93296 D:2 BT: 0}
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
String rtnVal = ""; {S:92937 E:92955 D:0 BT: 0}
for(int i = 0;i<in.getChildCount()- 1;i ++){} {S:92960 E:93301 D:0 BT: 0}
<sublist>
ParseTree xx =(ParseTree)in.getChild(i); {S:93017 E:93058 D:1 BT: 0}
ParseTree xy =(ParseTree)xx.getChild(0); {S:93064 E:93105 D:1 BT: 0}
</sublist>
ParseTree xx =(ParseTree)in.getChild(i); {S:93017 E:93058 D:1 BT: 0}
ParseTree xy =(ParseTree)xx.getChild(0); {S:93064 E:93105 D:1 BT: 0}
 {S:93223 E:93296 D:1 BT: 7}
if(! xy.getText().equals("annotation")){} {S:93224 E:93296 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:93268 E:0 D:2 BT: 0}
rtnVal += xy.getText()+ " "; {S:93268 E:93296 D:2 BT: 0}
return rtnVal; {S:93306 E:93319 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:92937   E:92955 D: 0BT: 0
   for(int i = 0;i<in.getChildCount()- 1;i ++) //S:92960   E:93301 D: 0BT: 0
   {
      ParseTree xx =(ParseTree)in.getChild(i); //S:93017   E:93058 D: 1BT: 0
      ParseTree xy =(ParseTree)xx.getChild(0); //S:93064   E:93105 D: 1BT: 0
       //S:93223   E:93296 D: 1BT: 7
      if(! xy.getText().equals("annotation")) //S:93224   E:93296 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:93268   E:0 D: 2BT: 0
         rtnVal += xy.getText()+ " "; //S:93268   E:93296 D: 2BT: 0
      }
   }
   return rtnVal; //S:93306   E:93319 D: 0BT: 0
   }

   private void processInitValue(ParseTree in)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
initValue = new String(); {S:93381 E:93405 D:0 BT: 0}
LinkedList ll = new LinkedList(); {S:93410 E:93442 D:0 BT: 0}
LineInfoTest.getTextTokens(in , ll); {S:93505 E:93535 D:0 BT: 0}
for(int i = 0;i<ll.size();i ++)initValue +=(String)ll.get(i); {S:93540 E:93610 D:0 BT: 0}
****************************/
/***************************
Processing list:
initValue = new String(); {S:93381 E:93405 D:0 BT: 0}
LinkedList ll = new LinkedList(); {S:93410 E:93442 D:0 BT: 0}
LineInfoTest.getTextTokens(in , ll); {S:93505 E:93535 D:0 BT: 0}
for(int i = 0;i<ll.size();i ++)initValue +=(String)ll.get(i); {S:93540 E:93610 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
initValue = new String(); {S:93381 E:93405 D:0 BT: 0}
LinkedList ll = new LinkedList(); {S:93410 E:93442 D:0 BT: 0}
LineInfoTest.getTextTokens(in , ll); {S:93505 E:93535 D:0 BT: 0}
for(int i = 0;i<ll.size();i ++)initValue +=(String)ll.get(i); {S:93540 E:93610 D:0 BT: 0}
****************************/
   initValue = new String(); //S:93381   E:93405 D: 0BT: 0
   LinkedList ll = new LinkedList(); //S:93410   E:93442 D: 0BT: 0
   LineInfoTest.getTextTokens(in , ll); //S:93505   E:93535 D: 0BT: 0
   for(int i = 0;i<ll.size();i ++)initValue +=(String)ll.get(i); //S:93540   E:93610 D: 0BT: 0
   }

   public VarInfoTest(ParseTree in, ParseTree xx, String fromfile, Integer classIndex)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
initValue = null; {S:93891 E:93907 D:0 BT: 0}
modifiers = processModifiers(xx); {S:93912 E:93944 D:0 BT: 0}
setType(ClassInfoTest.getTypeName((ParseTree)in.getChild(0))); {S:94139 E:94197 D:0 BT: 0}
ParseTree info =(ParseTree)in.getChild(1); {S:94202 E:94245 D:0 BT: 0}
int i = 0; {S:94250 E:94259 D:0 BT: 0}
internalList = new VarListTest(); {S:94264 E:94292 D:0 BT: 0}
while(i<info.getChildCount()){} {S:94297 E:94565 D:0 BT: 0}
<sublist>
ParseTree info2 =(ParseTree)info.getChild(i); {S:94338 E:94384 D:1 BT: 0}
String name = info2.getChild(0).getText(); {S:94390 E:94431 D:1 BT: 0}
internalList.add(new VarInfoTest(getType(), name ,(ParseTree)info2.getChild(1), classIndex.intValue(), modifiers)); {S:94437 E:94548 D:1 BT: 0}
i += 2; {S:94554 E:94560 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
initValue = null; {S:93891 E:93907 D:0 BT: 0}
modifiers = processModifiers(xx); {S:93912 E:93944 D:0 BT: 0}
setType(ClassInfoTest.getTypeName((ParseTree)in.getChild(0))); {S:94139 E:94197 D:0 BT: 0}
ParseTree info =(ParseTree)in.getChild(1); {S:94202 E:94245 D:0 BT: 0}
int i = 0; {S:94250 E:94259 D:0 BT: 0}
internalList = new VarListTest(); {S:94264 E:94292 D:0 BT: 0}
while(i<info.getChildCount()){} {S:94297 E:94565 D:0 BT: 0}
<sublist>
ParseTree info2 =(ParseTree)info.getChild(i); {S:94338 E:94384 D:1 BT: 0}
String name = info2.getChild(0).getText(); {S:94390 E:94431 D:1 BT: 0}
internalList.add(new VarInfoTest(getType(), name ,(ParseTree)info2.getChild(1), classIndex.intValue(), modifiers)); {S:94437 E:94548 D:1 BT: 0}
i += 2; {S:94554 E:94560 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
initValue = null; {S:93891 E:93907 D:0 BT: 0}
modifiers = processModifiers(xx); {S:93912 E:93944 D:0 BT: 0}
setType(ClassInfoTest.getTypeName((ParseTree)in.getChild(0))); {S:94139 E:94197 D:0 BT: 0}
ParseTree info =(ParseTree)in.getChild(1); {S:94202 E:94245 D:0 BT: 0}
int i = 0; {S:94250 E:94259 D:0 BT: 0}
internalList = new VarListTest(); {S:94264 E:94292 D:0 BT: 0}
while(i<info.getChildCount()){} {S:94297 E:94565 D:0 BT: 0}
<sublist>
ParseTree info2 =(ParseTree)info.getChild(i); {S:94338 E:94384 D:1 BT: 0}
String name = info2.getChild(0).getText(); {S:94390 E:94431 D:1 BT: 0}
internalList.add(new VarInfoTest(getType(), name ,(ParseTree)info2.getChild(1), classIndex.intValue(), modifiers)); {S:94437 E:94548 D:1 BT: 0}
i += 2; {S:94554 E:94560 D:1 BT: 0}
</sublist>
ParseTree info2 =(ParseTree)info.getChild(i); {S:94338 E:94384 D:1 BT: 0}
String name = info2.getChild(0).getText(); {S:94390 E:94431 D:1 BT: 0}
internalList.add(new VarInfoTest(getType(), name ,(ParseTree)info2.getChild(1), classIndex.intValue(), modifiers)); {S:94437 E:94548 D:1 BT: 0}
i += 2; {S:94554 E:94560 D:1 BT: 0}
****************************/
   initValue = null; //S:93891   E:93907 D: 0BT: 0
   modifiers = processModifiers(xx); //S:93912   E:93944 D: 0BT: 0
   setType(ClassInfoTest.getTypeName((ParseTree)in.getChild(0))); //S:94139   E:94197 D: 0BT: 0
   ParseTree info =(ParseTree)in.getChild(1); //S:94202   E:94245 D: 0BT: 0
   int i = 0; //S:94250   E:94259 D: 0BT: 0
   internalList = new VarListTest(); //S:94264   E:94292 D: 0BT: 0
   while(i<info.getChildCount()) //S:94297   E:94565 D: 0BT: 0
   {
      ParseTree info2 =(ParseTree)info.getChild(i); //S:94338   E:94384 D: 1BT: 0
      String name = info2.getChild(0).getText(); //S:94390   E:94431 D: 1BT: 0
      internalList.add(new VarInfoTest(getType(), name ,(ParseTree)info2.getChild(1), classIndex.intValue(), modifiers)); //S:94437   E:94548 D: 1BT: 0
      i += 2; //S:94554   E:94560 D: 1BT: 0
   }
   }

   private void processRest(ParseTree in)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:3 CP:0
/***************************
Processing list:
int i = 0; {S:94626 E:94635 D:0 BT: 0}
while(i<in.getChildCount()){} {S:94640 E:95087 D:0 BT: 0}
<sublist>
ParseTree info =(ParseTree)in.getChild(i); {S:94679 E:94722 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
int i = 0; {S:94626 E:94635 D:0 BT: 0}
while(i<in.getChildCount()){} {S:94640 E:95087 D:0 BT: 0}
<sublist>
ParseTree info =(ParseTree)in.getChild(i); {S:94679 E:94722 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:94727 E:95081 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:94727 E:95081 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(info.getText().equals("[")){ {S:94728 E:94807 D:1 BT: 1}
nDimensions ++; {S:94770 E:94783 D:2 BT: 0}
i += 2; {S:94790 E:94796 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(info.getText().equals("[")){} {S:94728 E:94807 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:94770 E:0 D:2 BT: 0}
nDimensions ++; {S:94770 E:94783 D:2 BT: 0}
i += 2; {S:94790 E:94796 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:94808 E:95081 D:1 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:94808 E:95081 D:1 BT: 2}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(4) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:94812 E:95081 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:94812 E:95081 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(info.getText().equals("=")){} {S:94813 E:95081 D:3 BT: 1}
i += 1; {S:94855 E:94861 D:4 BT: 0}
info =(ParseTree)in.getChild(i); {S:94868 E:94901 D:4 BT: 0}
processInitValue(info); {S:94908 E:94930 D:4 BT: 0}
System.out.println(modifiers + " " + getType()+ " " + getName()+ " = " + initValue); {S:94937 E:95022 D:4 BT: 0}
i ++; {S:95029 E:95032 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(info.getText().equals("=")){} {S:94813 E:95081 D:3 BT: 1}
QuicktestRunner.execPath += 1; {S:94855 E:0 D:4 BT: 0}
i += 1; {S:94855 E:94861 D:4 BT: 0}
info =(ParseTree)in.getChild(i); {S:94868 E:94901 D:4 BT: 0}
processInitValue(info); {S:94908 E:94930 D:4 BT: 0}
System.out.println(modifiers + " " + getType()+ " " + getName()+ " = " + initValue); {S:94937 E:95022 D:4 BT: 0}
i ++; {S:95029 E:95032 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int i = 0; {S:94626 E:94635 D:0 BT: 0}
while(i<in.getChildCount()){} {S:94640 E:95087 D:0 BT: 0}
<sublist>
ParseTree info =(ParseTree)in.getChild(i); {S:94679 E:94722 D:1 BT: 0}
</sublist>
ParseTree info =(ParseTree)in.getChild(i); {S:94679 E:94722 D:1 BT: 0}
 {S:94727 E:95081 D:1 BT: 7}
if(info.getText().equals("[")){} {S:94728 E:94807 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:94770 E:0 D:2 BT: 0}
nDimensions ++; {S:94770 E:94783 D:2 BT: 0}
i += 2; {S:94790 E:94796 D:2 BT: 0}
else{} {S:94808 E:95081 D:1 BT: 2}
 {S:94812 E:95081 D:2 BT: 7}
if(info.getText().equals("=")){} {S:94813 E:95081 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:94855 E:0 D:3 BT: 0}
i += 1; {S:94855 E:94861 D:3 BT: 0}
info =(ParseTree)in.getChild(i); {S:94868 E:94901 D:3 BT: 0}
processInitValue(info); {S:94908 E:94930 D:3 BT: 0}
System.out.println(modifiers + " " + getType()+ " " + getName()+ " = " + initValue); {S:94937 E:95022 D:3 BT: 0}
i ++; {S:95029 E:95032 D:3 BT: 0}
****************************/
   int i = 0; //S:94626   E:94635 D: 0BT: 0
   while(i<in.getChildCount()) //S:94640   E:95087 D: 0BT: 0
   {
      ParseTree info =(ParseTree)in.getChild(i); //S:94679   E:94722 D: 1BT: 0
       //S:94727   E:95081 D: 1BT: 7
      if(info.getText().equals("[")) //S:94728   E:94807 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:94770   E:0 D: 2BT: 0
         nDimensions ++; //S:94770   E:94783 D: 2BT: 0
         i += 2; //S:94790   E:94796 D: 2BT: 0
      }
      else //S:94808   E:95081 D: 1BT: 2
      {
          //S:94812   E:95081 D: 2BT: 7
         if(info.getText().equals("=")) //S:94813   E:95081 D: 2BT: 1
         {
            QuicktestRunner.execPath += 1; //S:94855   E:0 D: 3BT: 0
            i += 1; //S:94855   E:94861 D: 3BT: 0
            info =(ParseTree)in.getChild(i); //S:94868   E:94901 D: 3BT: 0
            processInitValue(info); //S:94908   E:94930 D: 3BT: 0
            System.out.println(modifiers + " " + getType()+ " " + getName()+ " = " + initValue); //S:94937   E:95022 D: 3BT: 0
            i ++; //S:95029   E:95032 D: 3BT: 0
         }
      }
   }
   }

   public void setStartChar(int in)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
for(int i = 0;i<internalList.size();i ++){} {S:95566 E:95686 D:0 BT: 0}
<sublist>
CodeMemberTest cm = internalList.getVar(i); {S:95620 E:95658 D:1 BT: 0}
cm.startChar = in; {S:95664 E:95681 D:1 BT: 0}
</sublist>
startChar = in; {S:95691 E:95705 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<internalList.size();i ++){} {S:95566 E:95686 D:0 BT: 0}
<sublist>
CodeMemberTest cm = internalList.getVar(i); {S:95620 E:95658 D:1 BT: 0}
cm.startChar = in; {S:95664 E:95681 D:1 BT: 0}
</sublist>
startChar = in; {S:95691 E:95705 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<internalList.size();i ++){} {S:95566 E:95686 D:0 BT: 0}
<sublist>
CodeMemberTest cm = internalList.getVar(i); {S:95620 E:95658 D:1 BT: 0}
cm.startChar = in; {S:95664 E:95681 D:1 BT: 0}
</sublist>
CodeMemberTest cm = internalList.getVar(i); {S:95620 E:95658 D:1 BT: 0}
cm.startChar = in; {S:95664 E:95681 D:1 BT: 0}
startChar = in; {S:95691 E:95705 D:0 BT: 0}
****************************/
   for(int i = 0;i<internalList.size();i ++) //S:95566   E:95686 D: 0BT: 0
   {
      CodeMemberTest cm = internalList.getVar(i); //S:95620   E:95658 D: 1BT: 0
      cm.startChar = in; //S:95664   E:95681 D: 1BT: 0
   }
   startChar = in; //S:95691   E:95705 D: 0BT: 0
   }

   public void setEndChar(int in)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
for(int i = 0;i<internalList.size();i ++){} {S:95754 E:95872 D:0 BT: 0}
<sublist>
CodeMemberTest cm = internalList.getVar(i); {S:95808 E:95846 D:1 BT: 0}
cm.endChar = in; {S:95852 E:95867 D:1 BT: 0}
</sublist>
endChar = in; {S:95877 E:95889 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<internalList.size();i ++){} {S:95754 E:95872 D:0 BT: 0}
<sublist>
CodeMemberTest cm = internalList.getVar(i); {S:95808 E:95846 D:1 BT: 0}
cm.endChar = in; {S:95852 E:95867 D:1 BT: 0}
</sublist>
endChar = in; {S:95877 E:95889 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<internalList.size();i ++){} {S:95754 E:95872 D:0 BT: 0}
<sublist>
CodeMemberTest cm = internalList.getVar(i); {S:95808 E:95846 D:1 BT: 0}
cm.endChar = in; {S:95852 E:95867 D:1 BT: 0}
</sublist>
CodeMemberTest cm = internalList.getVar(i); {S:95808 E:95846 D:1 BT: 0}
cm.endChar = in; {S:95852 E:95867 D:1 BT: 0}
endChar = in; {S:95877 E:95889 D:0 BT: 0}
****************************/
   for(int i = 0;i<internalList.size();i ++) //S:95754   E:95872 D: 0BT: 0
   {
      CodeMemberTest cm = internalList.getVar(i); //S:95808   E:95846 D: 1BT: 0
      cm.endChar = in; //S:95852   E:95867 D: 1BT: 0
   }
   endChar = in; //S:95877   E:95889 D: 0BT: 0
   }

   private void setName(String name) 
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
name = name.trim(); {S:95941 E:95959 D:0 BT: 0}
this.name = name; {S:96041 E:96057 D:0 BT: 0}
****************************/
/***************************
Processing list:
name = name.trim(); {S:95941 E:95959 D:0 BT: 0}
this.name = name; {S:96041 E:96057 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:95963 E:96036 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:95963 E:96036 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(name.startsWith("this.")) {S:95964 E:96036 D:0 BT: 1}
name = name.substring(5 , name.length()); {S:95997 E:96036 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(name.startsWith("this.")){} {S:95964 E:96036 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:95997 E:0 D:1 BT: 0}
name = name.substring(5 , name.length()); {S:95997 E:96036 D:1 BT: 0}
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
name = name.trim(); {S:95941 E:95959 D:0 BT: 0}
 {S:95963 E:96036 D:0 BT: 7}
if(name.startsWith("this.")){} {S:95964 E:96036 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:95997 E:0 D:1 BT: 0}
name = name.substring(5 , name.length()); {S:95997 E:96036 D:1 BT: 0}
this.name = name; {S:96041 E:96057 D:0 BT: 0}
****************************/
   name = name.trim(); //S:95941   E:95959 D: 0BT: 0
    //S:95963   E:96036 D: 0BT: 7
   if(name.startsWith("this.")) //S:95964   E:96036 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:95997   E:0 D: 1BT: 0
      name = name.substring(5 , name.length()); //S:95997   E:96036 D: 1BT: 0
   }
   this.name = name; //S:96041   E:96057 D: 0BT: 0
   }

   String getName() 
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return name; {S:96096 E:96107 D:0 BT: 0}
****************************/
/***************************
Processing list:
return name; {S:96096 E:96107 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return name; {S:96096 E:96107 D:0 BT: 0}
****************************/
   return name; //S:96096   E:96107 D: 0BT: 0
   }

   private void setType(String type) 
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
this.type = type.trim(); {S:96159 E:96182 D:0 BT: 0}
****************************/
/***************************
Processing list:
this.type = type.trim(); {S:96159 E:96182 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
this.type = type.trim(); {S:96159 E:96182 D:0 BT: 0}
****************************/
   this.type = type.trim(); //S:96159   E:96182 D: 0BT: 0
   }

   String getType() 
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return type; {S:96217 E:96228 D:0 BT: 0}
****************************/
/***************************
Processing list:
return type; {S:96217 E:96228 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return type; {S:96217 E:96228 D:0 BT: 0}
****************************/
   return type; //S:96217   E:96228 D: 0BT: 0
   }

   String getTypeWithDims()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String rtnVal = type; {S:96271 E:96291 D:0 BT: 0}
for(int i = 0;i<nDimensions;i ++)rtnVal += "[]"; {S:96296 E:96351 D:0 BT: 0}
return rtnVal; {S:96356 E:96369 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = type; {S:96271 E:96291 D:0 BT: 0}
for(int i = 0;i<nDimensions;i ++)rtnVal += "[]"; {S:96296 E:96351 D:0 BT: 0}
return rtnVal; {S:96356 E:96369 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = type; {S:96271 E:96291 D:0 BT: 0}
for(int i = 0;i<nDimensions;i ++)rtnVal += "[]"; {S:96296 E:96351 D:0 BT: 0}
return rtnVal; {S:96356 E:96369 D:0 BT: 0}
****************************/
   String rtnVal = type; //S:96271   E:96291 D: 0BT: 0
   for(int i = 0;i<nDimensions;i ++)rtnVal += "[]"; //S:96296   E:96351 D: 0BT: 0
   return rtnVal; //S:96356   E:96369 D: 0BT: 0
   }

   String getTypeSignature()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String rtnVal = getType(); {S:96413 E:96438 D:0 BT: 0}
for(int i = 0;i<nDimensions;i ++)rtnVal += "[]"; {S:96443 E:96498 D:0 BT: 0}
rtnVal += " " + getName(); {S:96503 E:96528 D:0 BT: 0}
return rtnVal; {S:96533 E:96546 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = getType(); {S:96413 E:96438 D:0 BT: 0}
for(int i = 0;i<nDimensions;i ++)rtnVal += "[]"; {S:96443 E:96498 D:0 BT: 0}
rtnVal += " " + getName(); {S:96503 E:96528 D:0 BT: 0}
return rtnVal; {S:96533 E:96546 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = getType(); {S:96413 E:96438 D:0 BT: 0}
for(int i = 0;i<nDimensions;i ++)rtnVal += "[]"; {S:96443 E:96498 D:0 BT: 0}
rtnVal += " " + getName(); {S:96503 E:96528 D:0 BT: 0}
return rtnVal; {S:96533 E:96546 D:0 BT: 0}
****************************/
   String rtnVal = getType(); //S:96413   E:96438 D: 0BT: 0
   for(int i = 0;i<nDimensions;i ++)rtnVal += "[]"; //S:96443   E:96498 D: 0BT: 0
   rtnVal += " " + getName(); //S:96503   E:96528 D: 0BT: 0
   return rtnVal; //S:96533   E:96546 D: 0BT: 0
   }

   String getModifiers(boolean withAccessModifiers)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
String rtnVal = new String(modifiers); {S:96613 E:96650 D:0 BT: 0}
return rtnVal; {S:96849 E:96862 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = new String(modifiers); {S:96613 E:96650 D:0 BT: 0}
return rtnVal; {S:96849 E:96862 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:96654 E:96844 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:96654 E:96844 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(withAccessModifiers == false){} {S:96655 E:96844 D:0 BT: 1}
rtnVal = rtnVal.replaceFirst("public" , ""); {S:96697 E:96739 D:1 BT: 0}
rtnVal = rtnVal.replaceFirst("private" , ""); {S:96745 E:96788 D:1 BT: 0}
rtnVal = rtnVal.replaceFirst("protected" , ""); {S:96794 E:96839 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(withAccessModifiers == false){} {S:96655 E:96844 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:96697 E:0 D:1 BT: 0}
rtnVal = rtnVal.replaceFirst("public" , ""); {S:96697 E:96739 D:1 BT: 0}
rtnVal = rtnVal.replaceFirst("private" , ""); {S:96745 E:96788 D:1 BT: 0}
rtnVal = rtnVal.replaceFirst("protected" , ""); {S:96794 E:96839 D:1 BT: 0}
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
String rtnVal = new String(modifiers); {S:96613 E:96650 D:0 BT: 0}
 {S:96654 E:96844 D:0 BT: 7}
if(withAccessModifiers == false){} {S:96655 E:96844 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:96697 E:0 D:1 BT: 0}
rtnVal = rtnVal.replaceFirst("public" , ""); {S:96697 E:96739 D:1 BT: 0}
rtnVal = rtnVal.replaceFirst("private" , ""); {S:96745 E:96788 D:1 BT: 0}
rtnVal = rtnVal.replaceFirst("protected" , ""); {S:96794 E:96839 D:1 BT: 0}
return rtnVal; {S:96849 E:96862 D:0 BT: 0}
****************************/
   String rtnVal = new String(modifiers); //S:96613   E:96650 D: 0BT: 0
    //S:96654   E:96844 D: 0BT: 7
   if(withAccessModifiers == false) //S:96655   E:96844 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:96697   E:0 D: 1BT: 0
      rtnVal = rtnVal.replaceFirst("public" , ""); //S:96697   E:96739 D: 1BT: 0
      rtnVal = rtnVal.replaceFirst("private" , ""); //S:96745   E:96788 D: 1BT: 0
      rtnVal = rtnVal.replaceFirst("protected" , ""); //S:96794   E:96839 D: 1BT: 0
   }
   return rtnVal; //S:96849   E:96862 D: 0BT: 0
   }

   public VarInfoTest(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

