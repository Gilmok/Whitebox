import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class MethodTextInfoTest extends CodeMemberTest
{
   public boolean useMe;

   MethodTextInfoTest(ParseTree in, ParseTree info, String fromFile, Integer xx)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
useMe = true; {S:163933 E:163945 D:0 BT: 0}
ParseTree a =(ParseTree)in.getChild(0); {S:163950 E:163990 D:0 BT: 0}
ParseTree b =(ParseTree)a.getChild(a.getChildCount()- 1); {S:164072 E:164131 D:0 BT: 0}
String[]bad ={"fieldDeclaration" , "interfaceDeclaration" , "classDeclaration"}; {S:164136 E:164215 D:0 BT: 0}
for(int i = 0;i<bad.length;i ++){} {S:164220 E:164344 D:0 BT: 0}
****************************/
/***************************
Processing list:
useMe = true; {S:163933 E:163945 D:0 BT: 0}
ParseTree a =(ParseTree)in.getChild(0); {S:163950 E:163990 D:0 BT: 0}
ParseTree b =(ParseTree)a.getChild(a.getChildCount()- 1); {S:164072 E:164131 D:0 BT: 0}
String[]bad ={"fieldDeclaration" , "interfaceDeclaration" , "classDeclaration"}; {S:164136 E:164215 D:0 BT: 0}
for(int i = 0;i<bad.length;i ++){} {S:164220 E:164344 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:163994 E:164067 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:163994 E:164067 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:164264 E:164339 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:164264 E:164339 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(a.getText().equals("static")){} {S:163995 E:164067 D:0 BT: 1}
useMe = false; {S:164037 E:164050 D:1 BT: 0}
return; {S:164056 E:164062 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(a.getText().equals("static")){} {S:163995 E:164067 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:164037 E:0 D:1 BT: 0}
useMe = false; {S:164037 E:164050 D:1 BT: 0}
return; {S:164056 E:164062 D:1 BT: 0}
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
if(b.getText().equals(bad[i])){} {S:164265 E:164339 D:1 BT: 1}
useMe = false; {S:164307 E:164320 D:2 BT: 0}
return; {S:164327 E:164333 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(b.getText().equals(bad[i])){} {S:164265 E:164339 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:164307 E:0 D:2 BT: 0}
useMe = false; {S:164307 E:164320 D:2 BT: 0}
return; {S:164327 E:164333 D:2 BT: 0}
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
useMe = true; {S:163933 E:163945 D:0 BT: 0}
ParseTree a =(ParseTree)in.getChild(0); {S:163950 E:163990 D:0 BT: 0}
 {S:163994 E:164067 D:0 BT: 7}
if(a.getText().equals("static")){} {S:163995 E:164067 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:164037 E:0 D:1 BT: 0}
useMe = false; {S:164037 E:164050 D:1 BT: 0}
return; {S:164056 E:164062 D:1 BT: 0}
ParseTree b =(ParseTree)a.getChild(a.getChildCount()- 1); {S:164072 E:164131 D:0 BT: 0}
String[]bad ={"fieldDeclaration" , "interfaceDeclaration" , "classDeclaration"}; {S:164136 E:164215 D:0 BT: 0}
for(int i = 0;i<bad.length;i ++){} {S:164220 E:164344 D:0 BT: 0}
 {S:164264 E:164339 D:1 BT: 7}
if(b.getText().equals(bad[i])){} {S:164265 E:164339 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:164307 E:0 D:2 BT: 0}
useMe = false; {S:164307 E:164320 D:2 BT: 0}
return; {S:164327 E:164333 D:2 BT: 0}
****************************/
   useMe = true; //S:163933   E:163945 D: 0BT: 0
   ParseTree a =(ParseTree)in.getChild(0); //S:163950   E:163990 D: 0BT: 0
    //S:163994   E:164067 D: 0BT: 7
   if(a.getText().equals("static")) //S:163995   E:164067 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:164037   E:0 D: 1BT: 0
      useMe = false; //S:164037   E:164050 D: 1BT: 0
      return; //S:164056   E:164062 D: 1BT: 0
   }
   ParseTree b =(ParseTree)a.getChild(a.getChildCount()- 1); //S:164072   E:164131 D: 0BT: 0
   String[]bad ={"fieldDeclaration" , "interfaceDeclaration" , "classDeclaration"}; //S:164136   E:164215 D: 0BT: 0
   for(int i = 0;i<bad.length;i ++) //S:164220   E:164344 D: 0BT: 0
   {
       //S:164264   E:164339 D: 1BT: 7
      if(b.getText().equals(bad[i])) //S:164265   E:164339 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:164307   E:0 D: 2BT: 0
         useMe = false; //S:164307   E:164320 D: 2BT: 0
         return; //S:164327   E:164333 D: 2BT: 0
      }
   }
   }

   @Override
	public void addToTree(ClassListTest list, TreeStatusTest info, LinkedList nodeList) 
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:164449 E:165020 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:164449 E:165020 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:3 CP:0
/***************************
Processing list:
if(useMe){} {S:164450 E:165020 D:0 BT: 1}
for(int i = 0;i<nodeList.size();i ++){} {S:164700 E:165014 D:1 BT: 0}
<sublist>
Object obj = nodeList.get(i); {S:164752 E:164780 D:2 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(useMe){} {S:164450 E:165020 D:0 BT: 1}
for(int i = 0;i<nodeList.size();i ++){} {S:164700 E:165014 D:1 BT: 0}
<sublist>
Object obj = nodeList.get(i); {S:164752 E:164780 D:2 BT: 0}
</sublist>
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
 {S:164786 E:165008 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:164786 E:165008 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(obj instanceof MethodInfoTest){} {S:164787 E:165008 D:2 BT: 1}
MethodInfoTest mi =(MethodInfoTest)obj; {S:164830 E:164862 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(obj instanceof MethodInfoTest){} {S:164787 E:165008 D:2 BT: 1}
MethodInfoTest mi =(MethodInfoTest)obj; {S:164830 E:164862 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:165008 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:165009 E:0 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(6) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:164869 E:165001 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:164869 E:165001 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#9(8) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(mi.endChar == endChar){} {S:164870 E:165001 D:3 BT: 1}
mi.mti = this; {S:164911 E:164924 D:4 BT: 0}
System.out.println("MTI: I found my method!"); {S:164933 E:164978 D:4 BT: 0}
return; {S:164987 E:164993 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(mi.endChar == endChar){} {S:164870 E:165001 D:3 BT: 1}
QuicktestRunner.execPath += 3; {S:164911 E:0 D:4 BT: 0}
mi.mti = this; {S:164911 E:164924 D:4 BT: 0}
System.out.println("MTI: I found my method!"); {S:164933 E:164978 D:4 BT: 0}
return; {S:164987 E:164993 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#10(8) Type:2 Paths:1 CP:2

/***************************
Processing list:
else {S:165001 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 2; {S:165002 E:0 D:4 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:164449 E:165020 D:0 BT: 7}
if(useMe){} {S:164450 E:165020 D:0 BT: 1}
for(int i = 0;i<nodeList.size();i ++){} {S:164700 E:165014 D:1 BT: 0}
<sublist>
Object obj = nodeList.get(i); {S:164752 E:164780 D:2 BT: 0}
</sublist>
Object obj = nodeList.get(i); {S:164752 E:164780 D:2 BT: 0}
 {S:164786 E:165008 D:2 BT: 7}
if(obj instanceof MethodInfoTest){} {S:164787 E:165008 D:2 BT: 1}
MethodInfoTest mi =(MethodInfoTest)obj; {S:164830 E:164862 D:3 BT: 0}
 {S:164869 E:165001 D:3 BT: 7}
if(mi.endChar == endChar){} {S:164870 E:165001 D:3 BT: 1}
QuicktestRunner.execPath += 3; {S:164911 E:0 D:4 BT: 0}
mi.mti = this; {S:164911 E:164924 D:4 BT: 0}
System.out.println("MTI: I found my method!"); {S:164933 E:164978 D:4 BT: 0}
return; {S:164987 E:164993 D:4 BT: 0}
else {S:165001 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 2; {S:165002 E:0 D:4 BT: 0}
else {S:165008 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:165009 E:0 D:3 BT: 0}
****************************/
    //S:164449   E:165020 D: 0BT: 7
   if(useMe) //S:164450   E:165020 D: 0BT: 1
   {
      for(int i = 0;i<nodeList.size();i ++) //S:164700   E:165014 D: 1BT: 0
      {
         Object obj = nodeList.get(i); //S:164752   E:164780 D: 2BT: 0
          //S:164786   E:165008 D: 2BT: 7
         if(obj instanceof MethodInfoTest) //S:164787   E:165008 D: 2BT: 1
         {
            MethodInfoTest mi =(MethodInfoTest)obj; //S:164830   E:164862 D: 3BT: 0
             //S:164869   E:165001 D: 3BT: 7
            if(mi.endChar == endChar) //S:164870   E:165001 D: 3BT: 1
            {
               QuicktestRunner.execPath += 3; //S:164911   E:0 D: 4BT: 0
               mi.mti = this; //S:164911   E:164924 D: 4BT: 0
               System.out.println("MTI: I found my method!"); //S:164933   E:164978 D: 4BT: 0
               return; //S:164987   E:164993 D: 4BT: 0
            }
            else //S:165001   E:0 D: 3BT: 0
            {
               QuicktestRunner.execPath += 2; //S:165002   E:0 D: 4BT: 0
            }
         }
         else //S:165008   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 1; //S:165009   E:0 D: 3BT: 0
         }
      }
   }
   }

   public MethodTextInfoTest(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

