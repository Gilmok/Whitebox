import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class TestListTest extends LinkedList
{

   public TestInfoTest getTest(int index)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(TestInfoTest)super.get(index); {S:128909 E:128943 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(TestInfoTest)super.get(index); {S:128909 E:128943 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(TestInfoTest)super.get(index); {S:128909 E:128943 D:0 BT: 0}
****************************/
   return(TestInfoTest)super.get(index); //S:128909   E:128943 D: 0BT: 0
   }

   public String[] getNames()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String[]rtnVal = new String[size()]; {S:128998 E:129034 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:129041 E:129144 D:0 BT: 0}
<sublist>
TestInfoTest ti = getTest(i); {S:129086 E:129110 D:1 BT: 0}
rtnVal[i]= ti.name; {S:129118 E:129137 D:1 BT: 0}
</sublist>
return rtnVal; {S:129151 E:129164 D:0 BT: 0}
****************************/
/***************************
Processing list:
String[]rtnVal = new String[size()]; {S:128998 E:129034 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:129041 E:129144 D:0 BT: 0}
<sublist>
TestInfoTest ti = getTest(i); {S:129086 E:129110 D:1 BT: 0}
rtnVal[i]= ti.name; {S:129118 E:129137 D:1 BT: 0}
</sublist>
return rtnVal; {S:129151 E:129164 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String[]rtnVal = new String[size()]; {S:128998 E:129034 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:129041 E:129144 D:0 BT: 0}
<sublist>
TestInfoTest ti = getTest(i); {S:129086 E:129110 D:1 BT: 0}
rtnVal[i]= ti.name; {S:129118 E:129137 D:1 BT: 0}
</sublist>
TestInfoTest ti = getTest(i); {S:129086 E:129110 D:1 BT: 0}
rtnVal[i]= ti.name; {S:129118 E:129137 D:1 BT: 0}
return rtnVal; {S:129151 E:129164 D:0 BT: 0}
****************************/
   String[]rtnVal = new String[size()]; //S:128998   E:129034 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:129041   E:129144 D: 0BT: 0
   {
      TestInfoTest ti = getTest(i); //S:129086   E:129110 D: 1BT: 0
      rtnVal[i]= ti.name; //S:129118   E:129137 D: 1BT: 0
   }
   return rtnVal; //S:129151   E:129164 D: 0BT: 0
   }

   public TestInfoTest getFirstTest()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(TestInfoTest)super.getFirst(); {S:129222 E:129256 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(TestInfoTest)super.getFirst(); {S:129222 E:129256 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(TestInfoTest)super.getFirst(); {S:129222 E:129256 D:0 BT: 0}
****************************/
   return(TestInfoTest)super.getFirst(); //S:129222   E:129256 D: 0BT: 0
   }

   public TestInfoTest getLastTest()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(TestInfoTest)super.getLast(); {S:129313 E:129346 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(TestInfoTest)super.getLast(); {S:129313 E:129346 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(TestInfoTest)super.getLast(); {S:129313 E:129346 D:0 BT: 0}
****************************/
   return(TestInfoTest)super.getLast(); //S:129313   E:129346 D: 0BT: 0
   }

   public void output()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:129396 E:129541 D:0 BT: 0}
<sublist>
TestInfoTest ti = getTest(i); {S:129441 E:129465 D:1 BT: 0}
ti.output(); {S:129473 E:129484 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:129396 E:129541 D:0 BT: 0}
<sublist>
TestInfoTest ti = getTest(i); {S:129441 E:129465 D:1 BT: 0}
ti.output(); {S:129473 E:129484 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:129396 E:129541 D:0 BT: 0}
<sublist>
TestInfoTest ti = getTest(i); {S:129441 E:129465 D:1 BT: 0}
ti.output(); {S:129473 E:129484 D:1 BT: 0}
</sublist>
TestInfoTest ti = getTest(i); {S:129441 E:129465 D:1 BT: 0}
ti.output(); {S:129473 E:129484 D:1 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:129396   E:129541 D: 0BT: 0
   {
      TestInfoTest ti = getTest(i); //S:129441   E:129465 D: 1BT: 0
      ti.output(); //S:129473   E:129484 D: 1BT: 0
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

   public TestListTest copy()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
TestListTest rtnVal = new TestListTest(); {S:129592 E:129624 D:0 BT: 0}
for(int i = 0;i<size();i ++)rtnVal.add(get(i)); {S:129631 E:129687 D:0 BT: 0}
return rtnVal; {S:129694 E:129707 D:0 BT: 0}
****************************/
/***************************
Processing list:
TestListTest rtnVal = new TestListTest(); {S:129592 E:129624 D:0 BT: 0}
for(int i = 0;i<size();i ++)rtnVal.add(get(i)); {S:129631 E:129687 D:0 BT: 0}
return rtnVal; {S:129694 E:129707 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
TestListTest rtnVal = new TestListTest(); {S:129592 E:129624 D:0 BT: 0}
for(int i = 0;i<size();i ++)rtnVal.add(get(i)); {S:129631 E:129687 D:0 BT: 0}
return rtnVal; {S:129694 E:129707 D:0 BT: 0}
****************************/
   TestListTest rtnVal = new TestListTest(); //S:129592   E:129624 D: 0BT: 0
   for(int i = 0;i<size();i ++)rtnVal.add(get(i)); //S:129631   E:129687 D: 0BT: 0
   return rtnVal; //S:129694   E:129707 D: 0BT: 0
   }

   public void compare(TestListTest in, boolean preserveOld)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:8 CP:0
/***************************
Processing list:
int listSize = 0; {S:129789 E:129805 D:0 BT: 0}
System.out.println("Comparing a size " + size()+ " size list with a " + in.size()+ " list; listSize is " + listSize); {S:129903 E:130021 D:0 BT: 0}
for(int i = 0;i<listSize;i ++){} {S:130028 E:130236 D:0 BT: 0}
<sublist>
String t1 = getTest(i).getTestCode("   "); {S:130075 E:130116 D:1 BT: 0}
String t2 = in.getTest(i).getTestCode("   "); {S:130124 E:130168 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
int listSize = 0; {S:129789 E:129805 D:0 BT: 0}
System.out.println("Comparing a size " + size()+ " size list with a " + in.size()+ " list; listSize is " + listSize); {S:129903 E:130021 D:0 BT: 0}
for(int i = 0;i<listSize;i ++){} {S:130028 E:130236 D:0 BT: 0}
<sublist>
String t1 = getTest(i).getTestCode("   "); {S:130075 E:130116 D:1 BT: 0}
String t2 = in.getTest(i).getTestCode("   "); {S:130124 E:130168 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:129811 E:129896 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:129811 E:129896 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:130175 E:130229 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:130175 E:130229 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:130242 E:130355 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:130242 E:130355 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(size()>in.size())else listSize = size(); {S:129812 E:129873 D:0 BT: 1}
listSize = in.size(); {S:129841 E:129861 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(size()>in.size()){} {S:129812 E:129873 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:129841 E:0 D:1 BT: 0}
listSize = in.size(); {S:129841 E:129861 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:129874 E:129896 D:0 BT: 2}
listSize = size(); {S:129879 E:129896 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:129874 E:129896 D:0 BT: 2}
listSize = size(); {S:129879 E:129896 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(! t1.equals(t2)) {S:130176 E:130229 D:1 BT: 1}
getTest(i).compileState = 0; {S:130202 E:130229 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(! t1.equals(t2)){} {S:130176 E:130229 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:130202 E:0 D:2 BT: 0}
getTest(i).compileState = 0; {S:130202 E:130229 D:2 BT: 0}
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
if(preserveOld){} {S:130243 E:130355 D:0 BT: 1}
for(int i = 0;i<in.size();i ++){} {S:130272 E:130348 D:1 BT: 0}
<sublist>
add(in.getTest(i)); {S:130322 E:130340 D:2 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(preserveOld){} {S:130243 E:130355 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:130272 E:0 D:1 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:130272 E:130348 D:1 BT: 0}
<sublist>
add(in.getTest(i)); {S:130322 E:130340 D:2 BT: 0}
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
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int listSize = 0; {S:129789 E:129805 D:0 BT: 0}
 {S:129811 E:129896 D:0 BT: 7}
if(size()>in.size()){} {S:129812 E:129873 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:129841 E:0 D:1 BT: 0}
listSize = in.size(); {S:129841 E:129861 D:1 BT: 0}
else{} {S:129874 E:129896 D:0 BT: 2}
listSize = size(); {S:129879 E:129896 D:1 BT: 0}
System.out.println("Comparing a size " + size()+ " size list with a " + in.size()+ " list; listSize is " + listSize); {S:129903 E:130021 D:0 BT: 0}
for(int i = 0;i<listSize;i ++){} {S:130028 E:130236 D:0 BT: 0}
<sublist>
String t1 = getTest(i).getTestCode("   "); {S:130075 E:130116 D:1 BT: 0}
String t2 = in.getTest(i).getTestCode("   "); {S:130124 E:130168 D:1 BT: 0}
</sublist>
String t1 = getTest(i).getTestCode("   "); {S:130075 E:130116 D:1 BT: 0}
String t2 = in.getTest(i).getTestCode("   "); {S:130124 E:130168 D:1 BT: 0}
 {S:130175 E:130229 D:1 BT: 7}
if(! t1.equals(t2)){} {S:130176 E:130229 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:130202 E:0 D:2 BT: 0}
getTest(i).compileState = 0; {S:130202 E:130229 D:2 BT: 0}
 {S:130242 E:130355 D:0 BT: 7}
if(preserveOld){} {S:130243 E:130355 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:130272 E:0 D:1 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:130272 E:130348 D:1 BT: 0}
<sublist>
add(in.getTest(i)); {S:130322 E:130340 D:2 BT: 0}
</sublist>
add(in.getTest(i)); {S:130322 E:130340 D:2 BT: 0}
****************************/
   int listSize = 0; //S:129789   E:129805 D: 0BT: 0
    //S:129811   E:129896 D: 0BT: 7
   if(size()>in.size()) //S:129812   E:129873 D: 0BT: 1
   {
      QuicktestRunner.execPath += 4; //S:129841   E:0 D: 1BT: 0
      listSize = in.size(); //S:129841   E:129861 D: 1BT: 0
   }
   else //S:129874   E:129896 D: 0BT: 2
   {
      listSize = size(); //S:129879   E:129896 D: 1BT: 0
   }
   System.out.println("Comparing a size " + size()+ " size list with a " + in.size()+ " list; listSize is " + listSize); //S:129903   E:130021 D: 0BT: 0
   for(int i = 0;i<listSize;i ++) //S:130028   E:130236 D: 0BT: 0
   {
      String t1 = getTest(i).getTestCode("   "); //S:130075   E:130116 D: 1BT: 0
      String t2 = in.getTest(i).getTestCode("   "); //S:130124   E:130168 D: 1BT: 0
       //S:130175   E:130229 D: 1BT: 7
      if(! t1.equals(t2)) //S:130176   E:130229 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:130202   E:0 D: 2BT: 0
         getTest(i).compileState = 0; //S:130202   E:130229 D: 2BT: 0
      }
   }
    //S:130242   E:130355 D: 0BT: 7
   if(preserveOld) //S:130243   E:130355 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:130272   E:0 D: 1BT: 0
      for(int i = 0;i<in.size();i ++) //S:130272   E:130348 D: 1BT: 0
      {
         add(in.getTest(i)); //S:130322   E:130340 D: 2BT: 0
      }
   }
   }

   public TestInfoTest findTestWithName(String in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:130427 E:130550 D:0 BT: 0}
<sublist>
TestInfoTest ti = getTest(i); {S:130472 E:130496 D:1 BT: 0}
</sublist>
return null; {S:130557 E:130568 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:130427 E:130550 D:0 BT: 0}
<sublist>
TestInfoTest ti = getTest(i); {S:130472 E:130496 D:1 BT: 0}
</sublist>
return null; {S:130557 E:130568 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:130503 E:130543 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:130503 E:130543 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(ti.name.equals(in)) {S:130504 E:130543 D:1 BT: 1}
return ti; {S:130534 E:130543 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ti.name.equals(in)){} {S:130504 E:130543 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:130534 E:0 D:2 BT: 0}
return ti; {S:130534 E:130543 D:2 BT: 0}
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
for(int i = 0;i<size();i ++){} {S:130427 E:130550 D:0 BT: 0}
<sublist>
TestInfoTest ti = getTest(i); {S:130472 E:130496 D:1 BT: 0}
</sublist>
TestInfoTest ti = getTest(i); {S:130472 E:130496 D:1 BT: 0}
 {S:130503 E:130543 D:1 BT: 7}
if(ti.name.equals(in)){} {S:130504 E:130543 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:130534 E:0 D:2 BT: 0}
return ti; {S:130534 E:130543 D:2 BT: 0}
return null; {S:130557 E:130568 D:0 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:130427   E:130550 D: 0BT: 0
   {
      TestInfoTest ti = getTest(i); //S:130472   E:130496 D: 1BT: 0
       //S:130503   E:130543 D: 1BT: 7
      if(ti.name.equals(in)) //S:130504   E:130543 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:130534   E:0 D: 2BT: 0
         return ti; //S:130534   E:130543 D: 2BT: 0
      }
   }
   return null; //S:130557   E:130568 D: 0BT: 0
   }

   public TestInfoTest[] toArray()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
TestInfoTest[]rtnVal = new TestInfoTest[size()]; {S:130624 E:130664 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:130671 E:130769 D:0 BT: 0}
<sublist>
TestInfoTest ti = getTest(i); {S:130716 E:130740 D:1 BT: 0}
rtnVal[i]= ti; {S:130748 E:130762 D:1 BT: 0}
</sublist>
return rtnVal; {S:130776 E:130789 D:0 BT: 0}
****************************/
/***************************
Processing list:
TestInfoTest[]rtnVal = new TestInfoTest[size()]; {S:130624 E:130664 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:130671 E:130769 D:0 BT: 0}
<sublist>
TestInfoTest ti = getTest(i); {S:130716 E:130740 D:1 BT: 0}
rtnVal[i]= ti; {S:130748 E:130762 D:1 BT: 0}
</sublist>
return rtnVal; {S:130776 E:130789 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
TestInfoTest[]rtnVal = new TestInfoTest[size()]; {S:130624 E:130664 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:130671 E:130769 D:0 BT: 0}
<sublist>
TestInfoTest ti = getTest(i); {S:130716 E:130740 D:1 BT: 0}
rtnVal[i]= ti; {S:130748 E:130762 D:1 BT: 0}
</sublist>
TestInfoTest ti = getTest(i); {S:130716 E:130740 D:1 BT: 0}
rtnVal[i]= ti; {S:130748 E:130762 D:1 BT: 0}
return rtnVal; {S:130776 E:130789 D:0 BT: 0}
****************************/
   TestInfoTest[]rtnVal = new TestInfoTest[size()]; //S:130624   E:130664 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:130671   E:130769 D: 0BT: 0
   {
      TestInfoTest ti = getTest(i); //S:130716   E:130740 D: 1BT: 0
      rtnVal[i]= ti; //S:130748   E:130762 D: 1BT: 0
   }
   return rtnVal; //S:130776   E:130789 D: 0BT: 0
   }

   public TestListTest(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

