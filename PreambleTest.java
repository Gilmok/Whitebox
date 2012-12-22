import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class PreambleTest extends CodeMemberTest
{
   public String val;

   PreambleTest(ParseTree in, ParseTree xx, String fromFile, Integer classIndex)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:3 CP:0
/***************************
Processing list:
val = ""; {S:159480 E:159488 D:0 BT: 0}
int sChar = - 1; {S:159493 E:159507 D:0 BT: 0}
int eChar = 0; {S:159512 E:159525 D:0 BT: 0}
for(int i = 0;i<in.getChildCount();i ++){} {S:159530 E:159803 D:0 BT: 0}
<sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:159583 E:159623 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
val = ""; {S:159480 E:159488 D:0 BT: 0}
int sChar = - 1; {S:159493 E:159507 D:0 BT: 0}
int eChar = 0; {S:159512 E:159525 D:0 BT: 0}
for(int i = 0;i<in.getChildCount();i ++){} {S:159530 E:159803 D:0 BT: 0}
<sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:159583 E:159623 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:159628 E:159798 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:159628 E:159798 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(x != null){} {S:159629 E:159798 D:1 BT: 1}
CommonToken xo =(CommonToken)x.payload; {S:159692 E:159732 D:2 BT: 0}
val += xo.getText(); {S:159739 E:159758 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(x != null){} {S:159629 E:159798 D:1 BT: 1}
CommonToken xo =(CommonToken)x.payload; {S:159692 E:159732 D:2 BT: 0}
val += xo.getText(); {S:159739 E:159758 D:2 BT: 0}
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
 {S:159764 E:159792 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:159764 E:159792 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(i == 0) {S:159765 E:159792 D:2 BT: 1}
val += " "; {S:159782 E:159792 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(i == 0){} {S:159765 E:159792 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:159782 E:0 D:3 BT: 0}
val += " "; {S:159782 E:159792 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:159792 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:159793 E:0 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
val = ""; {S:159480 E:159488 D:0 BT: 0}
int sChar = - 1; {S:159493 E:159507 D:0 BT: 0}
int eChar = 0; {S:159512 E:159525 D:0 BT: 0}
for(int i = 0;i<in.getChildCount();i ++){} {S:159530 E:159803 D:0 BT: 0}
<sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:159583 E:159623 D:1 BT: 0}
</sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:159583 E:159623 D:1 BT: 0}
 {S:159628 E:159798 D:1 BT: 7}
if(x != null){} {S:159629 E:159798 D:1 BT: 1}
CommonToken xo =(CommonToken)x.payload; {S:159692 E:159732 D:2 BT: 0}
val += xo.getText(); {S:159739 E:159758 D:2 BT: 0}
 {S:159764 E:159792 D:2 BT: 7}
if(i == 0){} {S:159765 E:159792 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:159782 E:0 D:3 BT: 0}
val += " "; {S:159782 E:159792 D:3 BT: 0}
else {S:159792 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:159793 E:0 D:3 BT: 0}
****************************/
   val = ""; //S:159480   E:159488 D: 0BT: 0
   int sChar = - 1; //S:159493   E:159507 D: 0BT: 0
   int eChar = 0; //S:159512   E:159525 D: 0BT: 0
   for(int i = 0;i<in.getChildCount();i ++) //S:159530   E:159803 D: 0BT: 0
   {
      ParseTree x =(ParseTree)in.getChild(i); //S:159583   E:159623 D: 1BT: 0
       //S:159628   E:159798 D: 1BT: 7
      if(x != null) //S:159629   E:159798 D: 1BT: 1
      {
         CommonToken xo =(CommonToken)x.payload; //S:159692   E:159732 D: 2BT: 0
         val += xo.getText(); //S:159739   E:159758 D: 2BT: 0
          //S:159764   E:159792 D: 2BT: 7
         if(i == 0) //S:159765   E:159792 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:159782   E:0 D: 3BT: 0
            val += " "; //S:159782   E:159792 D: 3BT: 0
         }
         else //S:159792   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 1; //S:159793   E:0 D: 3BT: 0
         }
      }
   }
   }

   public void addToTree(ClassListTest list, TreeStatusTest info, LinkedList nodeList) 
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
info.getPreambleTests().add(this); {S:159897 E:159926 D:0 BT: 0}
****************************/
/***************************
Processing list:
info.getPreambleTests().add(this); {S:159897 E:159926 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
info.getPreambleTests().add(this); {S:159897 E:159926 D:0 BT: 0}
****************************/
   info.getPreambleTests().add(this); //S:159897   E:159926 D: 0BT: 0
   }

   public PreambleTest(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

