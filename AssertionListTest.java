import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class AssertionListTest extends LinkedList
{

   public AssertionInfoTest getAssertion(int index)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(AssertionInfoTest)super.get(index); {S:102556 E:102595 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(AssertionInfoTest)super.get(index); {S:102556 E:102595 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(AssertionInfoTest)super.get(index); {S:102556 E:102595 D:0 BT: 0}
****************************/
   return(AssertionInfoTest)super.get(index); //S:102556   E:102595 D: 0BT: 0
   }

   public AssertionInfoTest getFirstAssertion()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(AssertionInfoTest)super.getFirst(); {S:102663 E:102702 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(AssertionInfoTest)super.getFirst(); {S:102663 E:102702 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(AssertionInfoTest)super.getFirst(); {S:102663 E:102702 D:0 BT: 0}
****************************/
   return(AssertionInfoTest)super.getFirst(); //S:102663   E:102702 D: 0BT: 0
   }

   public AssertionInfoTest getLastAssertion()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(AssertionInfoTest)super.getLast(); {S:102769 E:102807 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(AssertionInfoTest)super.getLast(); {S:102769 E:102807 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(AssertionInfoTest)super.getLast(); {S:102769 E:102807 D:0 BT: 0}
****************************/
   return(AssertionInfoTest)super.getLast(); //S:102769   E:102807 D: 0BT: 0
   }

   public boolean hasReturnAssertion()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:102873 E:103019 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:102924 E:102958 D:1 BT: 0}
</sublist>
return false; {S:103028 E:103040 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:102873 E:103019 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:102924 E:102958 D:1 BT: 0}
</sublist>
return false; {S:103028 E:103040 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:102969 E:103010 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:102969 E:103010 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(ai.isReturn) {S:102970 E:103010 D:1 BT: 1}
return true; {S:102999 E:103010 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ai.isReturn){} {S:102970 E:103010 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:102999 E:0 D:2 BT: 0}
return true; {S:102999 E:103010 D:2 BT: 0}
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
for(int i = 0;i<size();i ++){} {S:102873 E:103019 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:102924 E:102958 D:1 BT: 0}
</sublist>
AssertionInfoTest ai = getAssertion(i); {S:102924 E:102958 D:1 BT: 0}
 {S:102969 E:103010 D:1 BT: 7}
if(ai.isReturn){} {S:102970 E:103010 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:102999 E:0 D:2 BT: 0}
return true; {S:102999 E:103010 D:2 BT: 0}
return false; {S:103028 E:103040 D:0 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:102873   E:103019 D: 0BT: 0
   {
      AssertionInfoTest ai = getAssertion(i); //S:102924   E:102958 D: 1BT: 0
       //S:102969   E:103010 D: 1BT: 7
      if(ai.isReturn) //S:102970   E:103010 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:102999   E:0 D: 2BT: 0
         return true; //S:102999   E:103010 D: 2BT: 0
      }
   }
   return false; //S:103028   E:103040 D: 0BT: 0
   }

   public void addAssertion(AssertionInfoTest newAssertion)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
for(int i = 0;i<this.size();i ++){} {S:103120 E:103278 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:103176 E:103210 D:1 BT: 0}
</sublist>
super.add(newAssertion); {S:103287 E:103310 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<this.size();i ++){} {S:103120 E:103278 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:103176 E:103210 D:1 BT: 0}
</sublist>
super.add(newAssertion); {S:103287 E:103310 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:103221 E:103269 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:103221 E:103269 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(ai.equals(newAssertion)) {S:103222 E:103269 D:1 BT: 1}
return; {S:103263 E:103269 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ai.equals(newAssertion)){} {S:103222 E:103269 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:103263 E:0 D:2 BT: 0}
return; {S:103263 E:103269 D:2 BT: 0}
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
for(int i = 0;i<this.size();i ++){} {S:103120 E:103278 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:103176 E:103210 D:1 BT: 0}
</sublist>
AssertionInfoTest ai = getAssertion(i); {S:103176 E:103210 D:1 BT: 0}
 {S:103221 E:103269 D:1 BT: 7}
if(ai.equals(newAssertion)){} {S:103222 E:103269 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:103263 E:0 D:2 BT: 0}
return; {S:103263 E:103269 D:2 BT: 0}
super.add(newAssertion); {S:103287 E:103310 D:0 BT: 0}
****************************/
   for(int i = 0;i<this.size();i ++) //S:103120   E:103278 D: 0BT: 0
   {
      AssertionInfoTest ai = getAssertion(i); //S:103176   E:103210 D: 1BT: 0
       //S:103221   E:103269 D: 1BT: 7
      if(ai.equals(newAssertion)) //S:103222   E:103269 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:103263   E:0 D: 2BT: 0
         return; //S:103263   E:103269 D: 2BT: 0
      }
   }
   super.add(newAssertion); //S:103287   E:103310 D: 0BT: 0
   }

   public String getListString()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:103367 E:103385 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:103394 E:103567 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:103445 E:103479 D:1 BT: 0}
rtnVal += "line " + ai.line + ": " + ai.dataType.getName()+ "\n"; {S:103491 E:103556 D:1 BT: 0}
</sublist>
return rtnVal; {S:103576 E:103589 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:103367 E:103385 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:103394 E:103567 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:103445 E:103479 D:1 BT: 0}
rtnVal += "line " + ai.line + ": " + ai.dataType.getName()+ "\n"; {S:103491 E:103556 D:1 BT: 0}
</sublist>
return rtnVal; {S:103576 E:103589 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:103367 E:103385 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:103394 E:103567 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:103445 E:103479 D:1 BT: 0}
rtnVal += "line " + ai.line + ": " + ai.dataType.getName()+ "\n"; {S:103491 E:103556 D:1 BT: 0}
</sublist>
AssertionInfoTest ai = getAssertion(i); {S:103445 E:103479 D:1 BT: 0}
rtnVal += "line " + ai.line + ": " + ai.dataType.getName()+ "\n"; {S:103491 E:103556 D:1 BT: 0}
return rtnVal; {S:103576 E:103589 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:103367   E:103385 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:103394   E:103567 D: 0BT: 0
   {
      AssertionInfoTest ai = getAssertion(i); //S:103445   E:103479 D: 1BT: 0
      rtnVal += "line " + ai.line + ": " + ai.dataType.getName()+ "\n"; //S:103491   E:103556 D: 1BT: 0
   }
   return rtnVal; //S:103576   E:103589 D: 0BT: 0
   }

   public void elimDuplicates()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:5 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:103646 E:104240 D:0 BT: 0}
<sublist>
AssertionInfoTest ai1 = getAssertion(i); {S:103691 E:103726 D:1 BT: 0}
for(int j = i + 1;j<size();j ++){} {S:103734 E:104233 D:1 BT: 0}
<sublist>
AssertionInfoTest ai2 = getAssertion(j); {S:103785 E:103820 D:2 BT: 0}
</sublist>
</sublist>
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:103646 E:104240 D:0 BT: 0}
<sublist>
AssertionInfoTest ai1 = getAssertion(i); {S:103691 E:103726 D:1 BT: 0}
for(int j = i + 1;j<size();j ++){} {S:103734 E:104233 D:1 BT: 0}
<sublist>
AssertionInfoTest ai2 = getAssertion(j); {S:103785 E:103820 D:2 BT: 0}
</sublist>
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:5 CP:0
/***************************
Processing list:
 {S:103828 E:104225 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:103828 E:104225 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:4 CP:0
/***************************
Processing list:
if(ai1.equals(ai2)){} {S:103829 E:104225 D:2 BT: 1}
****************************/
/***************************
Processing list:
if(ai1.equals(ai2)){} {S:103829 E:104225 D:2 BT: 1}
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
//#5(3) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:103865 E:104216 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:103865 E:104216 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(ai1.isReturn){ {S:103866 E:104058 D:3 BT: 1}
****************************/
/***************************
Processing list:
if(ai1.isReturn){} {S:103866 E:104058 D:3 BT: 1}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:104059 E:104216 D:3 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:104059 E:104216 D:3 BT: 2}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(6) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:103947 E:104030 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:103947 E:104030 D:4 BT: 7}
****************************/
//=======================================
//=======================================
//#9(7) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:104074 E:104206 D:5 BT: 7}
****************************/
/***************************
Processing list:
 {S:104074 E:104206 D:5 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#10(8) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(ai1.line<ai2.line)else remove(ai1); {S:103948 E:104013 D:4 BT: 1}
remove(ai2); {S:103982 E:103993 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(ai1.line<ai2.line){} {S:103948 E:104013 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:103982 E:0 D:5 BT: 0}
remove(ai2); {S:103982 E:103993 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#11(8) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:104014 E:104030 D:4 BT: 2}
remove(ai1); {S:104019 E:104030 D:4 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:104014 E:104030 D:4 BT: 2}
remove(ai1); {S:104019 E:104030 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#12(9) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(ai1.line<ai2.line)else remove(ai2); {S:104075 E:104189 D:5 BT: 1}
remove(ai1); {S:104158 E:104169 D:6 BT: 0}
****************************/
/***************************
Processing list:
if(ai1.line<ai2.line){} {S:104075 E:104189 D:5 BT: 1}
QuicktestRunner.execPath += 2; {S:104158 E:0 D:6 BT: 0}
remove(ai1); {S:104158 E:104169 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#13(9) Type:2 Paths:1 CP:1
/***************************
Processing list:
 {S:104190 E:104206 D:5 BT: 2}
remove(ai2); {S:104195 E:104206 D:5 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:104190 E:104206 D:5 BT: 2}
QuicktestRunner.execPath += 1; {S:104195 E:0 D:6 BT: 0}
remove(ai2); {S:104195 E:104206 D:6 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:103646 E:104240 D:0 BT: 0}
<sublist>
AssertionInfoTest ai1 = getAssertion(i); {S:103691 E:103726 D:1 BT: 0}
for(int j = i + 1;j<size();j ++){} {S:103734 E:104233 D:1 BT: 0}
<sublist>
AssertionInfoTest ai2 = getAssertion(j); {S:103785 E:103820 D:2 BT: 0}
</sublist>
</sublist>
AssertionInfoTest ai1 = getAssertion(i); {S:103691 E:103726 D:1 BT: 0}
for(int j = i + 1;j<size();j ++){} {S:103734 E:104233 D:1 BT: 0}
<sublist>
AssertionInfoTest ai2 = getAssertion(j); {S:103785 E:103820 D:2 BT: 0}
</sublist>
AssertionInfoTest ai2 = getAssertion(j); {S:103785 E:103820 D:2 BT: 0}
 {S:103828 E:104225 D:2 BT: 7}
if(ai1.equals(ai2)){} {S:103829 E:104225 D:2 BT: 1}
 {S:103865 E:104216 D:3 BT: 7}
if(ai1.isReturn){} {S:103866 E:104058 D:3 BT: 1}
 {S:103947 E:104030 D:4 BT: 7}
if(ai1.line<ai2.line){} {S:103948 E:104013 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:103982 E:0 D:5 BT: 0}
remove(ai2); {S:103982 E:103993 D:5 BT: 0}
else{} {S:104014 E:104030 D:4 BT: 2}
remove(ai1); {S:104019 E:104030 D:5 BT: 0}
else{} {S:104059 E:104216 D:3 BT: 2}
 {S:104074 E:104206 D:4 BT: 7}
if(ai1.line<ai2.line){} {S:104075 E:104189 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:104158 E:0 D:5 BT: 0}
remove(ai1); {S:104158 E:104169 D:5 BT: 0}
else{} {S:104190 E:104206 D:4 BT: 2}
QuicktestRunner.execPath += 1; {S:104195 E:0 D:5 BT: 0}
remove(ai2); {S:104195 E:104206 D:5 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:103646   E:104240 D: 0BT: 0
   {
      AssertionInfoTest ai1 = getAssertion(i); //S:103691   E:103726 D: 1BT: 0
      for(int j = i + 1;j<size();j ++) //S:103734   E:104233 D: 1BT: 0
      {
         AssertionInfoTest ai2 = getAssertion(j); //S:103785   E:103820 D: 2BT: 0
          //S:103828   E:104225 D: 2BT: 7
         if(ai1.equals(ai2)) //S:103829   E:104225 D: 2BT: 1
         {
             //S:103865   E:104216 D: 3BT: 7
            if(ai1.isReturn) //S:103866   E:104058 D: 3BT: 1
            {
                //S:103947   E:104030 D: 4BT: 7
               if(ai1.line<ai2.line) //S:103948   E:104013 D: 4BT: 1
               {
                  QuicktestRunner.execPath += 2; //S:103982   E:0 D: 5BT: 0
                  remove(ai2); //S:103982   E:103993 D: 5BT: 0
               }
               else //S:104014   E:104030 D: 4BT: 2
               {
                  remove(ai1); //S:104019   E:104030 D: 5BT: 0
               }
            }
            else //S:104059   E:104216 D: 3BT: 2
            {
                //S:104074   E:104206 D: 4BT: 7
               if(ai1.line<ai2.line) //S:104075   E:104189 D: 4BT: 1
               {
                  QuicktestRunner.execPath += 2; //S:104158   E:0 D: 5BT: 0
                  remove(ai1); //S:104158   E:104169 D: 5BT: 0
               }
               else //S:104190   E:104206 D: 4BT: 2
               {
                  QuicktestRunner.execPath += 1; //S:104195   E:0 D: 5BT: 0
                  remove(ai2); //S:104195   E:104206 D: 5BT: 0
               }
            }
         }
      }
   }
   }

public void elimDuplicatesTest_3()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   elimDuplicates();
   //Post-test

}

public void elimDuplicatesTest_2()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   elimDuplicates();
   //Post-test

}

public void elimDuplicatesTest_4()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   elimDuplicates();
   //Post-test

}

public void elimDuplicatesTest_0()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   elimDuplicates();
   //Post-test

}

public void elimDuplicatesTest_1()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   elimDuplicates();
   //Post-test

}

   public String getReqClasses(String tab)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:5 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:104308 E:104326 D:0 BT: 0}
int rcIndex = 0; {S:104333 E:104348 D:0 BT: 0}
LinkedList classes = new LinkedList(); {S:104355 E:104392 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:104399 E:105097 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:104444 E:104478 D:1 BT: 0}
</sublist>
return rtnVal; {S:105104 E:105117 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:104308 E:104326 D:0 BT: 0}
int rcIndex = 0; {S:104333 E:104348 D:0 BT: 0}
LinkedList classes = new LinkedList(); {S:104355 E:104392 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:104399 E:105097 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:104444 E:104478 D:1 BT: 0}
</sublist>
return rtnVal; {S:105104 E:105117 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:5 CP:0
/***************************
Processing list:
 {S:104485 E:105090 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:104485 E:105090 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:4 CP:0
/***************************
Processing list:
if(ai.fromClass != "" && ! ai.fromClass.equals("rtnVal")){} {S:104486 E:105090 D:1 BT: 1}
rcIndex = - 1; {S:104600 E:104612 D:2 BT: 0}
for(int j = 0;j<classes.size();j ++){} {S:104621 E:104814 D:2 BT: 0}
<sublist>
String a =(String)classes.get(j); {S:104678 E:104712 D:3 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(ai.fromClass != "" && ! ai.fromClass.equals("rtnVal")){} {S:104486 E:105090 D:1 BT: 1}
rcIndex = - 1; {S:104600 E:104612 D:2 BT: 0}
for(int j = 0;j<classes.size();j ++){} {S:104621 E:104814 D:2 BT: 0}
<sublist>
String a =(String)classes.get(j); {S:104678 E:104712 D:3 BT: 0}
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
//#5(3) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:104721 E:104805 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:104721 E:104805 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#6(3) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:104822 E:105082 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:104822 E:105082 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#7(5) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(a.equals(ai.fromClass)){} {S:104722 E:104805 D:3 BT: 1}
rcIndex = j; {S:104768 E:104779 D:4 BT: 0}
break; {S:104790 E:104795 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(a.equals(ai.fromClass)){} {S:104722 E:104805 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:104768 E:0 D:4 BT: 0}
rcIndex = j; {S:104768 E:104779 D:4 BT: 0}
break; {S:104790 E:104795 D:4 BT: 0}
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
if(rcIndex == - 1){} {S:104823 E:105082 D:2 BT: 1}
classes.add(ai.fromClass); {S:104854 E:104879 D:3 BT: 0}
rcIndex = classes.size()- 1; {S:104887 E:104915 D:3 BT: 0}
rtnVal += tab + ai.fromClass + "Test cls" + rcIndex + " = new " + ai.fromClass + "Test();\n"; {S:104923 E:105015 D:3 BT: 0}
rtnVal += tab + " cls" + rcIndex + ".mockSetup();\n"; {S:105023 E:105075 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(rcIndex == - 1){} {S:104823 E:105082 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:104854 E:0 D:3 BT: 0}
classes.add(ai.fromClass); {S:104854 E:104879 D:3 BT: 0}
rcIndex = classes.size()- 1; {S:104887 E:104915 D:3 BT: 0}
rtnVal += tab + ai.fromClass + "Test cls" + rcIndex + " = new " + ai.fromClass + "Test();\n"; {S:104923 E:105015 D:3 BT: 0}
rtnVal += tab + " cls" + rcIndex + ".mockSetup();\n"; {S:105023 E:105075 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#10(6) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:105082 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:105083 E:0 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:104308 E:104326 D:0 BT: 0}
int rcIndex = 0; {S:104333 E:104348 D:0 BT: 0}
LinkedList classes = new LinkedList(); {S:104355 E:104392 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:104399 E:105097 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:104444 E:104478 D:1 BT: 0}
</sublist>
AssertionInfoTest ai = getAssertion(i); {S:104444 E:104478 D:1 BT: 0}
 {S:104485 E:105090 D:1 BT: 7}
if(ai.fromClass != "" && ! ai.fromClass.equals("rtnVal")){} {S:104486 E:105090 D:1 BT: 1}
rcIndex = - 1; {S:104600 E:104612 D:2 BT: 0}
for(int j = 0;j<classes.size();j ++){} {S:104621 E:104814 D:2 BT: 0}
<sublist>
String a =(String)classes.get(j); {S:104678 E:104712 D:3 BT: 0}
</sublist>
String a =(String)classes.get(j); {S:104678 E:104712 D:3 BT: 0}
 {S:104721 E:104805 D:3 BT: 7}
if(a.equals(ai.fromClass)){} {S:104722 E:104805 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:104768 E:0 D:4 BT: 0}
rcIndex = j; {S:104768 E:104779 D:4 BT: 0}
break; {S:104790 E:104795 D:4 BT: 0}
 {S:104822 E:105082 D:2 BT: 7}
if(rcIndex == - 1){} {S:104823 E:105082 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:104854 E:0 D:3 BT: 0}
classes.add(ai.fromClass); {S:104854 E:104879 D:3 BT: 0}
rcIndex = classes.size()- 1; {S:104887 E:104915 D:3 BT: 0}
rtnVal += tab + ai.fromClass + "Test cls" + rcIndex + " = new " + ai.fromClass + "Test();\n"; {S:104923 E:105015 D:3 BT: 0}
rtnVal += tab + " cls" + rcIndex + ".mockSetup();\n"; {S:105023 E:105075 D:3 BT: 0}
else {S:105082 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:105083 E:0 D:3 BT: 0}
return rtnVal; {S:105104 E:105117 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:104308   E:104326 D: 0BT: 0
   int rcIndex = 0; //S:104333   E:104348 D: 0BT: 0
   LinkedList classes = new LinkedList(); //S:104355   E:104392 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:104399   E:105097 D: 0BT: 0
   {
      AssertionInfoTest ai = getAssertion(i); //S:104444   E:104478 D: 1BT: 0
       //S:104485   E:105090 D: 1BT: 7
      if(ai.fromClass != "" && ! ai.fromClass.equals("rtnVal")) //S:104486   E:105090 D: 1BT: 1
      {
         rcIndex = - 1; //S:104600   E:104612 D: 2BT: 0
         for(int j = 0;j<classes.size();j ++) //S:104621   E:104814 D: 2BT: 0
         {
            String a =(String)classes.get(j); //S:104678   E:104712 D: 3BT: 0
             //S:104721   E:104805 D: 3BT: 7
            if(a.equals(ai.fromClass)) //S:104722   E:104805 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:104768   E:0 D: 4BT: 0
               rcIndex = j; //S:104768   E:104779 D: 4BT: 0
               break; //S:104790   E:104795 D: 4BT: 0
            }
         }
          //S:104822   E:105082 D: 2BT: 7
         if(rcIndex == - 1) //S:104823   E:105082 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:104854   E:0 D: 3BT: 0
            classes.add(ai.fromClass); //S:104854   E:104879 D: 3BT: 0
            rcIndex = classes.size()- 1; //S:104887   E:104915 D: 3BT: 0
            rtnVal += tab + ai.fromClass + "Test cls" + rcIndex + " = new " + ai.fromClass + "Test();\n"; //S:104923   E:105015 D: 3BT: 0
            rtnVal += tab + " cls" + rcIndex + ".mockSetup();\n"; //S:105023   E:105075 D: 3BT: 0
         }
         else //S:105082   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 1; //S:105083   E:0 D: 3BT: 0
         }
      }
   }
   return rtnVal; //S:105104   E:105117 D: 0BT: 0
   }

   public void setupReqClasses()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:13 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:105175 E:105193 D:0 BT: 0}
int rcIndex = 0; {S:105200 E:105215 D:0 BT: 0}
LinkedList classes = new LinkedList(); {S:105222 E:105259 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:105266 E:106433 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:105311 E:105345 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:105175 E:105193 D:0 BT: 0}
int rcIndex = 0; {S:105200 E:105215 D:0 BT: 0}
LinkedList classes = new LinkedList(); {S:105222 E:105259 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:105266 E:106433 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:105311 E:105345 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:13 CP:0
/***************************
Processing list:
 {S:105352 E:106426 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:105352 E:106426 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:12 CP:0
/***************************
Processing list:
if(ai.fromClass != ""){} {S:105353 E:106426 D:1 BT: 1}
rcIndex = - 1; {S:105477 E:105489 D:2 BT: 0}
for(int j = 0;j<classes.size();j ++){} {S:105498 E:105691 D:2 BT: 0}
<sublist>
String a =(String)classes.get(j); {S:105555 E:105589 D:3 BT: 0}
</sublist>
VarInfoTest dt = ai.dataType; {S:105887 E:105911 D:2 BT: 0}
String str = dt.getName(); {S:105920 E:105945 D:2 BT: 0}
ai.dataType = new VarInfoTest(dt.getTypeWithDims(), str , dt.startChar); {S:106352 E:106418 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ai.fromClass != ""){} {S:105353 E:106426 D:1 BT: 1}
rcIndex = - 1; {S:105477 E:105489 D:2 BT: 0}
for(int j = 0;j<classes.size();j ++){} {S:105498 E:105691 D:2 BT: 0}
<sublist>
String a =(String)classes.get(j); {S:105555 E:105589 D:3 BT: 0}
</sublist>
VarInfoTest dt = ai.dataType; {S:105887 E:105911 D:2 BT: 0}
String str = dt.getName(); {S:105920 E:105945 D:2 BT: 0}
ai.dataType = new VarInfoTest(dt.getTypeWithDims(), str , dt.startChar); {S:106352 E:106418 D:2 BT: 0}
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
 {S:105598 E:105682 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:105598 E:105682 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#6(3) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:105699 E:105805 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:105699 E:105805 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#7(3) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:105953 E:106343 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:105953 E:106343 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(5) Type:1 Paths:1 CP:6
/***************************
Processing list:
if(a.equals(ai.fromClass)){} {S:105599 E:105682 D:3 BT: 1}
rcIndex = j; {S:105645 E:105656 D:4 BT: 0}
break; {S:105667 E:105672 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(a.equals(ai.fromClass)){} {S:105599 E:105682 D:3 BT: 1}
QuicktestRunner.execPath += 6; {S:105645 E:0 D:4 BT: 0}
rcIndex = j; {S:105645 E:105656 D:4 BT: 0}
break; {S:105667 E:105672 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#9(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#10(6) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(rcIndex == - 1){} {S:105700 E:105805 D:2 BT: 1}
classes.add(ai.fromClass); {S:105735 E:105760 D:3 BT: 0}
rcIndex = classes.size()- 1; {S:105768 E:105796 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(rcIndex == - 1){} {S:105700 E:105805 D:2 BT: 1}
QuicktestRunner.execPath += 3; {S:105735 E:0 D:3 BT: 0}
classes.add(ai.fromClass); {S:105735 E:105760 D:3 BT: 0}
rcIndex = classes.size()- 1; {S:105768 E:105796 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#11(6) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#12(7) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(ai.fromClass.equals("rtnVal")){ {S:105954 E:106050 D:2 BT: 1}
str = "rtnVal." + str; {S:106005 E:106026 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(ai.fromClass.equals("rtnVal")){} {S:105954 E:106050 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:106005 E:0 D:3 BT: 0}
str = "rtnVal." + str; {S:106005 E:106026 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#13(7) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:106051 E:106343 D:2 BT: 2}
String dots[]= ai.dataType.getName().split("\\."); {S:106066 E:106116 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:106051 E:106343 D:2 BT: 2}
String dots[]= ai.dataType.getName().split("\\."); {S:106066 E:106116 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#14(13) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:106125 E:106334 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:106125 E:106334 D:4 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#15(14) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(dots.length == 1)else{} {S:106126 E:106206 D:4 BT: 1}
str = "cls" + rcIndex + "." + str; {S:106156 E:106189 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(dots.length == 1){} {S:106126 E:106206 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:106156 E:0 D:5 BT: 0}
str = "cls" + rcIndex + "." + str; {S:106156 E:106189 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#16(14) Type:2 Paths:1 CP:1
/***************************
Processing list:
 {S:106207 E:106334 D:4 BT: 2}
str = "cls" + rcIndex; {S:106223 E:106244 D:4 BT: 0}
for(int j = 1;j<dots.length;j ++)str +=("." + dots[j]); {S:106255 E:106324 D:4 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:106207 E:106334 D:4 BT: 2}
QuicktestRunner.execPath += 1; {S:106223 E:0 D:5 BT: 0}
str = "cls" + rcIndex; {S:106223 E:106244 D:5 BT: 0}
for(int j = 1;j<dots.length;j ++)str +=("." + dots[j]); {S:106255 E:106324 D:5 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:105175 E:105193 D:0 BT: 0}
int rcIndex = 0; {S:105200 E:105215 D:0 BT: 0}
LinkedList classes = new LinkedList(); {S:105222 E:105259 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:105266 E:106433 D:0 BT: 0}
<sublist>
AssertionInfoTest ai = getAssertion(i); {S:105311 E:105345 D:1 BT: 0}
</sublist>
AssertionInfoTest ai = getAssertion(i); {S:105311 E:105345 D:1 BT: 0}
 {S:105352 E:106426 D:1 BT: 7}
if(ai.fromClass != ""){} {S:105353 E:106426 D:1 BT: 1}
rcIndex = - 1; {S:105477 E:105489 D:2 BT: 0}
for(int j = 0;j<classes.size();j ++){} {S:105498 E:105691 D:2 BT: 0}
<sublist>
String a =(String)classes.get(j); {S:105555 E:105589 D:3 BT: 0}
</sublist>
String a =(String)classes.get(j); {S:105555 E:105589 D:3 BT: 0}
 {S:105598 E:105682 D:3 BT: 7}
if(a.equals(ai.fromClass)){} {S:105599 E:105682 D:3 BT: 1}
QuicktestRunner.execPath += 6; {S:105645 E:0 D:4 BT: 0}
rcIndex = j; {S:105645 E:105656 D:4 BT: 0}
break; {S:105667 E:105672 D:4 BT: 0}
 {S:105699 E:105805 D:2 BT: 7}
if(rcIndex == - 1){} {S:105700 E:105805 D:2 BT: 1}
QuicktestRunner.execPath += 3; {S:105735 E:0 D:3 BT: 0}
classes.add(ai.fromClass); {S:105735 E:105760 D:3 BT: 0}
rcIndex = classes.size()- 1; {S:105768 E:105796 D:3 BT: 0}
VarInfoTest dt = ai.dataType; {S:105887 E:105911 D:2 BT: 0}
String str = dt.getName(); {S:105920 E:105945 D:2 BT: 0}
 {S:105953 E:106343 D:2 BT: 7}
if(ai.fromClass.equals("rtnVal")){} {S:105954 E:106050 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:106005 E:0 D:3 BT: 0}
str = "rtnVal." + str; {S:106005 E:106026 D:3 BT: 0}
else{} {S:106051 E:106343 D:2 BT: 2}
String dots[]= ai.dataType.getName().split("\\."); {S:106066 E:106116 D:3 BT: 0}
 {S:106125 E:106334 D:3 BT: 7}
if(dots.length == 1){} {S:106126 E:106206 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:106156 E:0 D:4 BT: 0}
str = "cls" + rcIndex + "." + str; {S:106156 E:106189 D:4 BT: 0}
else{} {S:106207 E:106334 D:3 BT: 2}
QuicktestRunner.execPath += 1; {S:106223 E:0 D:4 BT: 0}
str = "cls" + rcIndex; {S:106223 E:106244 D:4 BT: 0}
for(int j = 1;j<dots.length;j ++)str +=("." + dots[j]); {S:106255 E:106324 D:4 BT: 0}
ai.dataType = new VarInfoTest(dt.getTypeWithDims(), str , dt.startChar); {S:106352 E:106418 D:2 BT: 0}
****************************/
   String rtnVal = ""; //S:105175   E:105193 D: 0BT: 0
   int rcIndex = 0; //S:105200   E:105215 D: 0BT: 0
   LinkedList classes = new LinkedList(); //S:105222   E:105259 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:105266   E:106433 D: 0BT: 0
   {
      AssertionInfoTest ai = getAssertion(i); //S:105311   E:105345 D: 1BT: 0
       //S:105352   E:106426 D: 1BT: 7
      if(ai.fromClass != "") //S:105353   E:106426 D: 1BT: 1
      {
         rcIndex = - 1; //S:105477   E:105489 D: 2BT: 0
         for(int j = 0;j<classes.size();j ++) //S:105498   E:105691 D: 2BT: 0
         {
            String a =(String)classes.get(j); //S:105555   E:105589 D: 3BT: 0
             //S:105598   E:105682 D: 3BT: 7
            if(a.equals(ai.fromClass)) //S:105599   E:105682 D: 3BT: 1
            {
               QuicktestRunner.execPath += 6; //S:105645   E:0 D: 4BT: 0
               rcIndex = j; //S:105645   E:105656 D: 4BT: 0
               break; //S:105667   E:105672 D: 4BT: 0
            }
         }
          //S:105699   E:105805 D: 2BT: 7
         if(rcIndex == - 1) //S:105700   E:105805 D: 2BT: 1
         {
            QuicktestRunner.execPath += 3; //S:105735   E:0 D: 3BT: 0
            classes.add(ai.fromClass); //S:105735   E:105760 D: 3BT: 0
            rcIndex = classes.size()- 1; //S:105768   E:105796 D: 3BT: 0
         }
         VarInfoTest dt = ai.dataType; //S:105887   E:105911 D: 2BT: 0
         String str = dt.getName(); //S:105920   E:105945 D: 2BT: 0
          //S:105953   E:106343 D: 2BT: 7
         if(ai.fromClass.equals("rtnVal")) //S:105954   E:106050 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:106005   E:0 D: 3BT: 0
            str = "rtnVal." + str; //S:106005   E:106026 D: 3BT: 0
         }
         else //S:106051   E:106343 D: 2BT: 2
         {
            String dots[]= ai.dataType.getName().split("\\."); //S:106066   E:106116 D: 3BT: 0
             //S:106125   E:106334 D: 3BT: 7
            if(dots.length == 1) //S:106126   E:106206 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:106156   E:0 D: 4BT: 0
               str = "cls" + rcIndex + "." + str; //S:106156   E:106189 D: 4BT: 0
            }
            else //S:106207   E:106334 D: 3BT: 2
            {
               QuicktestRunner.execPath += 1; //S:106223   E:0 D: 4BT: 0
               str = "cls" + rcIndex; //S:106223   E:106244 D: 4BT: 0
               for(int j = 1;j<dots.length;j ++)str +=("." + dots[j]); //S:106255   E:106324 D: 4BT: 0
            }
         }
         ai.dataType = new VarInfoTest(dt.getTypeWithDims(), str , dt.startChar); //S:106352   E:106418 D: 2BT: 0
      }
   }
   }

public void setupReqClassesTest_3()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   setupReqClasses();
   //Post-test

}

public void setupReqClassesTest_7()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   setupReqClasses();
   //Post-test

}

public void setupReqClassesTest_11()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   setupReqClasses();
   //Post-test

}

public void setupReqClassesTest_2()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   setupReqClasses();
   //Post-test

}

public void setupReqClassesTest_4()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   setupReqClasses();
   //Post-test

}

public void setupReqClassesTest_10()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   setupReqClasses();
   //Post-test

}

public void setupReqClassesTest_12()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   setupReqClasses();
   //Post-test

}

public void setupReqClassesTest_0()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   setupReqClasses();
   //Post-test

}

public void setupReqClassesTest_1()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   setupReqClasses();
   //Post-test

}

public void setupReqClassesTest_5()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   setupReqClasses();
   //Post-test

}

public void setupReqClassesTest_6()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   setupReqClasses();
   //Post-test

}

public void setupReqClassesTest_8()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   setupReqClasses();
   //Post-test

}

public void setupReqClassesTest_9()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   setupReqClasses();
   //Post-test

}

   public AssertionListTest(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

