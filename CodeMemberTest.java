import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

abstract class CodeMemberTest
{
   public int startChar;
   public int endChar;
   public boolean isStatic;

   public int getStartChar()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return startChar; {S:161487 E:161503 D:0 BT: 0}
****************************/
/***************************
Processing list:
return startChar; {S:161487 E:161503 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return startChar; {S:161487 E:161503 D:0 BT: 0}
****************************/
   return startChar; //S:161487   E:161503 D: 0BT: 0
   }

   public int getEndChar()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return endChar; {S:161545 E:161559 D:0 BT: 0}
****************************/
/***************************
Processing list:
return endChar; {S:161545 E:161559 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return endChar; {S:161545 E:161559 D:0 BT: 0}
****************************/
   return endChar; //S:161545   E:161559 D: 0BT: 0
   }

   abstract public void addToTree(ClassListTest list, TreeStatusTest info, LinkedList nodeList);   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
****************************/
   }

   public void setStartChar(int startChar) 
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
this.startChar = startChar; {S:161708 E:161734 D:0 BT: 0}
****************************/
/***************************
Processing list:
this.startChar = startChar; {S:161708 E:161734 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
this.startChar = startChar; {S:161708 E:161734 D:0 BT: 0}
****************************/
   this.startChar = startChar; //S:161708   E:161734 D: 0BT: 0
   }

   public void findFit(ParseTree in)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:5 CP:0
/***************************
Processing list:
for(int i = 0;i<in.getChildCount();i ++){} {S:161807 E:161921 D:0 BT: 0}
<sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:161860 E:161900 D:1 BT: 0}
findFit(x); {S:161906 E:161916 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
for(int i = 0;i<in.getChildCount();i ++){} {S:161807 E:161921 D:0 BT: 0}
<sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:161860 E:161900 D:1 BT: 0}
findFit(x); {S:161906 E:161916 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:5 CP:0
/***************************
Processing list:
 {S:161925 E:162234 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:161925 E:162234 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:4 CP:0
/***************************
Processing list:
if(in.payload instanceof CommonToken){} {S:161926 E:162234 D:0 BT: 1}
CommonToken tok =(CommonToken)in.payload; {S:161973 E:162015 D:1 BT: 0}
int s = tok.getStartIndex(); {S:162021 E:162048 D:1 BT: 0}
int e = tok.getStopIndex(); {S:162054 E:162080 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(in.payload instanceof CommonToken){} {S:161926 E:162234 D:0 BT: 1}
CommonToken tok =(CommonToken)in.payload; {S:161973 E:162015 D:1 BT: 0}
int s = tok.getStartIndex(); {S:162021 E:162048 D:1 BT: 0}
int e = tok.getStopIndex(); {S:162054 E:162080 D:1 BT: 0}
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
 {S:162136 E:162191 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:162136 E:162191 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#6(3) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:162196 E:162229 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:162196 E:162229 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#7(5) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(s<startChar || startChar == 0) {S:162137 E:162191 D:1 BT: 1}
startChar = s; {S:162178 E:162191 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(s<startChar || startChar == 0){} {S:162137 E:162191 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:162178 E:0 D:2 BT: 0}
startChar = s; {S:162178 E:162191 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#8(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#9(6) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(e>endChar) {S:162197 E:162229 D:1 BT: 1}
endChar = e; {S:162218 E:162229 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(e>endChar){} {S:162197 E:162229 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:162218 E:0 D:2 BT: 0}
endChar = e; {S:162218 E:162229 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#10(6) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:162229 E:0 D:1 BT: 0}
QuicktestRunner.execPath += 1; {S:162230 E:0 D:2 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<in.getChildCount();i ++){} {S:161807 E:161921 D:0 BT: 0}
<sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:161860 E:161900 D:1 BT: 0}
findFit(x); {S:161906 E:161916 D:1 BT: 0}
</sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:161860 E:161900 D:1 BT: 0}
findFit(x); {S:161906 E:161916 D:1 BT: 0}
 {S:161925 E:162234 D:0 BT: 7}
if(in.payload instanceof CommonToken){} {S:161926 E:162234 D:0 BT: 1}
CommonToken tok =(CommonToken)in.payload; {S:161973 E:162015 D:1 BT: 0}
int s = tok.getStartIndex(); {S:162021 E:162048 D:1 BT: 0}
int e = tok.getStopIndex(); {S:162054 E:162080 D:1 BT: 0}
 {S:162136 E:162191 D:1 BT: 7}
if(s<startChar || startChar == 0){} {S:162137 E:162191 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:162178 E:0 D:2 BT: 0}
startChar = s; {S:162178 E:162191 D:2 BT: 0}
 {S:162196 E:162229 D:1 BT: 7}
if(e>endChar){} {S:162197 E:162229 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:162218 E:0 D:2 BT: 0}
endChar = e; {S:162218 E:162229 D:2 BT: 0}
else {S:162229 E:0 D:1 BT: 0}
QuicktestRunner.execPath += 1; {S:162230 E:0 D:2 BT: 0}
****************************/
   for(int i = 0;i<in.getChildCount();i ++) //S:161807   E:161921 D: 0BT: 0
   {
      ParseTree x =(ParseTree)in.getChild(i); //S:161860   E:161900 D: 1BT: 0
      findFit(x); //S:161906   E:161916 D: 1BT: 0
   }
    //S:161925   E:162234 D: 0BT: 7
   if(in.payload instanceof CommonToken) //S:161926   E:162234 D: 0BT: 1
   {
      CommonToken tok =(CommonToken)in.payload; //S:161973   E:162015 D: 1BT: 0
      int s = tok.getStartIndex(); //S:162021   E:162048 D: 1BT: 0
      int e = tok.getStopIndex(); //S:162054   E:162080 D: 1BT: 0
       //S:162136   E:162191 D: 1BT: 7
      if(s<startChar || startChar == 0) //S:162137   E:162191 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:162178   E:0 D: 2BT: 0
         startChar = s; //S:162178   E:162191 D: 2BT: 0
      }
       //S:162196   E:162229 D: 1BT: 7
      if(e>endChar) //S:162197   E:162229 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:162218   E:0 D: 2BT: 0
         endChar = e; //S:162218   E:162229 D: 2BT: 0
      }
      else //S:162229   E:0 D: 1BT: 0
      {
         QuicktestRunner.execPath += 1; //S:162230   E:0 D: 2BT: 0
      }
   }
   }

   public void setEndChar(int endChar) 
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
this.endChar = endChar; {S:162288 E:162310 D:0 BT: 0}
****************************/
/***************************
Processing list:
this.endChar = endChar; {S:162288 E:162310 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
this.endChar = endChar; {S:162288 E:162310 D:0 BT: 0}
****************************/
   this.endChar = endChar; //S:162288   E:162310 D: 0BT: 0
   }

   public String toString()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return super.toString()+ " S:" + startChar + " E:" + endChar; {S:162353 E:162414 D:0 BT: 0}
****************************/
/***************************
Processing list:
return super.toString()+ " S:" + startChar + " E:" + endChar; {S:162353 E:162414 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return super.toString()+ " S:" + startChar + " E:" + endChar; {S:162353 E:162414 D:0 BT: 0}
****************************/
   return super.toString()+ " S:" + startChar + " E:" + endChar; //S:162353   E:162414 D: 0BT: 0
   }

   public CodeMemberTest(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

