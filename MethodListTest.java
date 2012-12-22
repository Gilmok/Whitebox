import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class MethodListTest extends LinkedList
{
   public int classIndex;

   MethodListTest(int index)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
super(); {S:86781 E:86788 D:0 BT: 0}
classIndex = index; {S:86797 E:86815 D:0 BT: 0}
****************************/
/***************************
Processing list:
super(); {S:86781 E:86788 D:0 BT: 0}
classIndex = index; {S:86797 E:86815 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
super(); {S:86781 E:86788 D:0 BT: 0}
classIndex = index; {S:86797 E:86815 D:0 BT: 0}
****************************/
   super(); //S:86781   E:86788 D: 0BT: 0
   classIndex = index; //S:86797   E:86815 D: 0BT: 0
   }

   public MethodInfoTest getMethod(int index)
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
 {S:86880 E:86999 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:86880 E:86999 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(index<size()){ {S:86881 E:86982 D:0 BT: 1}
return(MethodInfoTest)super.get(index); {S:86919 E:86955 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(index<size()){} {S:86881 E:86982 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:86919 E:0 D:1 BT: 0}
return(MethodInfoTest)super.get(index); {S:86919 E:86955 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:86983 E:86999 D:0 BT: 2}
return null; {S:86988 E:86999 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:86983 E:86999 D:0 BT: 2}
return null; {S:86988 E:86999 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:86880 E:86999 D:0 BT: 7}
if(index<size()){} {S:86881 E:86982 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:86919 E:0 D:1 BT: 0}
return(MethodInfoTest)super.get(index); {S:86919 E:86955 D:1 BT: 0}
else{} {S:86983 E:86999 D:0 BT: 2}
return null; {S:86988 E:86999 D:1 BT: 0}
****************************/
    //S:86880   E:86999 D: 0BT: 7
   if(index<size()) //S:86881   E:86982 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:86919   E:0 D: 1BT: 0
      return(MethodInfoTest)super.get(index); //S:86919   E:86955 D: 1BT: 0
   }
   else //S:86983   E:86999 D: 0BT: 2
   {
      return null; //S:86988   E:86999 D: 1BT: 0
   }
   }

   public MethodInfoTest getFirstMethod()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(MethodInfoTest)super.getFirst(); {S:87061 E:87097 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(MethodInfoTest)super.getFirst(); {S:87061 E:87097 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(MethodInfoTest)super.getFirst(); {S:87061 E:87097 D:0 BT: 0}
****************************/
   return(MethodInfoTest)super.getFirst(); //S:87061   E:87097 D: 0BT: 0
   }

   public MethodInfoTest getLastMethod()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(MethodInfoTest)super.getLast(); {S:87158 E:87193 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(MethodInfoTest)super.getLast(); {S:87158 E:87193 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(MethodInfoTest)super.getLast(); {S:87158 E:87193 D:0 BT: 0}
****************************/
   return(MethodInfoTest)super.getLast(); //S:87158   E:87193 D: 0BT: 0
   }

   public void replace(int index, MethodInfoTest mi)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
set(index , mi); {S:87266 E:87280 D:0 BT: 0}
****************************/
/***************************
Processing list:
set(index , mi); {S:87266 E:87280 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
set(index , mi); {S:87266 E:87280 D:0 BT: 0}
****************************/
   set(index , mi); //S:87266   E:87280 D: 0BT: 0
   }

   public boolean isTest(MethodInfoTest mi)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:3 CP:0
/***************************
Processing list:
String str = stripTestName(mi.name); {S:87344 E:87379 D:0 BT: 0}
****************************/
/***************************
Processing list:
String str = stripTestName(mi.name); {S:87344 E:87379 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:87387 E:87622 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:87387 E:87622 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(str != null){ {S:87388 E:87604 D:0 BT: 1}
for(int i = 0;i<size();i ++){} {S:87423 E:87553 D:1 BT: 0}
return false; {S:87565 E:87577 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(str != null){} {S:87388 E:87604 D:0 BT: 1}
for(int i = 0;i<size();i ++){} {S:87423 E:87553 D:1 BT: 0}
return false; {S:87565 E:87577 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:87605 E:87622 D:0 BT: 2}
return false; {S:87610 E:87622 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:87605 E:87622 D:0 BT: 2}
return false; {S:87610 E:87622 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(3) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:87479 E:87541 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:87479 E:87541 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(getMethod(i).name.equals(str)) {S:87480 E:87541 D:2 BT: 1}
return true; {S:87530 E:87541 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(getMethod(i).name.equals(str)){} {S:87480 E:87541 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:87530 E:0 D:3 BT: 0}
return true; {S:87530 E:87541 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:87541 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:87542 E:0 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String str = stripTestName(mi.name); {S:87344 E:87379 D:0 BT: 0}
 {S:87387 E:87622 D:0 BT: 7}
if(str != null){} {S:87388 E:87604 D:0 BT: 1}
for(int i = 0;i<size();i ++){} {S:87423 E:87553 D:1 BT: 0}
 {S:87479 E:87541 D:2 BT: 7}
if(getMethod(i).name.equals(str)){} {S:87480 E:87541 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:87530 E:0 D:3 BT: 0}
return true; {S:87530 E:87541 D:3 BT: 0}
else {S:87541 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:87542 E:0 D:3 BT: 0}
return false; {S:87565 E:87577 D:1 BT: 0}
else{} {S:87605 E:87622 D:0 BT: 2}
return false; {S:87610 E:87622 D:1 BT: 0}
****************************/
   String str = stripTestName(mi.name); //S:87344   E:87379 D: 0BT: 0
    //S:87387   E:87622 D: 0BT: 7
   if(str != null) //S:87388   E:87604 D: 0BT: 1
   {
      for(int i = 0;i<size();i ++) //S:87423   E:87553 D: 1BT: 0
      {
          //S:87479   E:87541 D: 2BT: 7
         if(getMethod(i).name.equals(str)) //S:87480   E:87541 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:87530   E:0 D: 3BT: 0
            return true; //S:87530   E:87541 D: 3BT: 0
         }
         else //S:87541   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 1; //S:87542   E:0 D: 3BT: 0
         }
      }
      return false; //S:87565   E:87577 D: 1BT: 0
   }
   else //S:87605   E:87622 D: 0BT: 2
   {
      return false; //S:87610   E:87622 D: 1BT: 0
   }
   }

   public void removeAllNonTestMethods()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
int i = 0; {S:87687 E:87696 D:0 BT: 0}
while(i<size()){} {S:87705 E:87831 D:0 BT: 0}
****************************/
/***************************
Processing list:
int i = 0; {S:87687 E:87696 D:0 BT: 0}
while(i<size()){} {S:87705 E:87831 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:87741 E:87822 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:87741 E:87822 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(isTest(getMethod(i)))else i ++; {S:87742 E:87813 D:1 BT: 1}
remove(i); {S:87780 E:87789 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(isTest(getMethod(i))){} {S:87742 E:87813 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:87780 E:0 D:2 BT: 0}
remove(i); {S:87780 E:87789 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:87814 E:87822 D:1 BT: 2}
i ++; {S:87819 E:87822 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:87814 E:87822 D:1 BT: 2}
i ++; {S:87819 E:87822 D:2 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int i = 0; {S:87687 E:87696 D:0 BT: 0}
while(i<size()){} {S:87705 E:87831 D:0 BT: 0}
 {S:87741 E:87822 D:1 BT: 7}
if(isTest(getMethod(i))){} {S:87742 E:87813 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:87780 E:0 D:2 BT: 0}
remove(i); {S:87780 E:87789 D:2 BT: 0}
else{} {S:87814 E:87822 D:1 BT: 2}
i ++; {S:87819 E:87822 D:2 BT: 0}
****************************/
   int i = 0; //S:87687   E:87696 D: 0BT: 0
   while(i<size()) //S:87705   E:87831 D: 0BT: 0
   {
       //S:87741   E:87822 D: 1BT: 7
      if(isTest(getMethod(i))) //S:87742   E:87813 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:87780   E:0 D: 2BT: 0
         remove(i); //S:87780   E:87789 D: 2BT: 0
      }
      else //S:87814   E:87822 D: 1BT: 2
      {
         i ++; //S:87819   E:87822 D: 2BT: 0
      }
   }
   }

public void removeAllNonTestMethodsTest_0()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   removeAllNonTestMethods();
   //Post-test

}

public void removeAllNonTestMethodsTest_1()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   removeAllNonTestMethods();
   //Post-test

}

   private String stripTestName(String in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
int testIndex = in.lastIndexOf("Test"); {S:87898 E:87936 D:0 BT: 0}
****************************/
/***************************
Processing list:
int testIndex = in.lastIndexOf("Test"); {S:87898 E:87936 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:87944 E:88041 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:87944 E:88041 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(testIndex>0)else return null; {S:87945 E:88024 D:0 BT: 1}
return in.substring(0 , testIndex); {S:87973 E:88006 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(testIndex>0){} {S:87945 E:88024 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:87973 E:0 D:1 BT: 0}
return in.substring(0 , testIndex); {S:87973 E:88006 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:88025 E:88041 D:0 BT: 2}
return null; {S:88030 E:88041 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:88025 E:88041 D:0 BT: 2}
return null; {S:88030 E:88041 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int testIndex = in.lastIndexOf("Test"); {S:87898 E:87936 D:0 BT: 0}
 {S:87944 E:88041 D:0 BT: 7}
if(testIndex>0){} {S:87945 E:88024 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:87973 E:0 D:1 BT: 0}
return in.substring(0 , testIndex); {S:87973 E:88006 D:1 BT: 0}
else{} {S:88025 E:88041 D:0 BT: 2}
return null; {S:88030 E:88041 D:1 BT: 0}
****************************/
   int testIndex = in.lastIndexOf("Test"); //S:87898   E:87936 D: 0BT: 0
    //S:87944   E:88041 D: 0BT: 7
   if(testIndex>0) //S:87945   E:88024 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:87973   E:0 D: 1BT: 0
      return in.substring(0 , testIndex); //S:87973   E:88006 D: 1BT: 0
   }
   else //S:88025   E:88041 D: 0BT: 2
   {
      return null; //S:88030   E:88041 D: 1BT: 0
   }
   }

   private int getMethodNameIndex(String in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:3 CP:0
/***************************
Processing list:
int testIndex = in.lastIndexOf("Test"); {S:88108 E:88146 D:0 BT: 0}
return - 1; {S:88407 E:88416 D:0 BT: 0}
****************************/
/***************************
Processing list:
int testIndex = in.lastIndexOf("Test"); {S:88108 E:88146 D:0 BT: 0}
return - 1; {S:88407 E:88416 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:88152 E:88400 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:88152 E:88400 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(testIndex>0){} {S:88153 E:88400 D:0 BT: 1}
int in2 = in.lastIndexOf("_"); {S:88183 E:88212 D:1 BT: 0}
in = in.substring(testIndex + 8 , in2); {S:88275 E:88312 D:1 BT: 0}
Integer rtnVal = Integer.parseInt(in); {S:88322 E:88359 D:1 BT: 0}
return rtnVal.intValue(); {S:88369 E:88393 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(testIndex>0){} {S:88153 E:88400 D:0 BT: 1}
int in2 = in.lastIndexOf("_"); {S:88183 E:88212 D:1 BT: 0}
in = in.substring(testIndex + 8 , in2); {S:88275 E:88312 D:1 BT: 0}
Integer rtnVal = Integer.parseInt(in); {S:88322 E:88359 D:1 BT: 0}
return rtnVal.intValue(); {S:88369 E:88393 D:1 BT: 0}
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
 {S:88221 E:88268 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:88221 E:88268 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(in2<testIndex) {S:88222 E:88268 D:1 BT: 1}
in2 = in.length(); {S:88251 E:88268 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(in2<testIndex){} {S:88222 E:88268 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:88251 E:0 D:2 BT: 0}
in2 = in.length(); {S:88251 E:88268 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:88268 E:0 D:1 BT: 0}
QuicktestRunner.execPath += 1; {S:88269 E:0 D:2 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int testIndex = in.lastIndexOf("Test"); {S:88108 E:88146 D:0 BT: 0}
 {S:88152 E:88400 D:0 BT: 7}
if(testIndex>0){} {S:88153 E:88400 D:0 BT: 1}
int in2 = in.lastIndexOf("_"); {S:88183 E:88212 D:1 BT: 0}
 {S:88221 E:88268 D:1 BT: 7}
if(in2<testIndex){} {S:88222 E:88268 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:88251 E:0 D:2 BT: 0}
in2 = in.length(); {S:88251 E:88268 D:2 BT: 0}
else {S:88268 E:0 D:1 BT: 0}
QuicktestRunner.execPath += 1; {S:88269 E:0 D:2 BT: 0}
in = in.substring(testIndex + 8 , in2); {S:88275 E:88312 D:1 BT: 0}
Integer rtnVal = Integer.parseInt(in); {S:88322 E:88359 D:1 BT: 0}
return rtnVal.intValue(); {S:88369 E:88393 D:1 BT: 0}
return - 1; {S:88407 E:88416 D:0 BT: 0}
****************************/
   int testIndex = in.lastIndexOf("Test"); //S:88108   E:88146 D: 0BT: 0
    //S:88152   E:88400 D: 0BT: 7
   if(testIndex>0) //S:88153   E:88400 D: 0BT: 1
   {
      int in2 = in.lastIndexOf("_"); //S:88183   E:88212 D: 1BT: 0
       //S:88221   E:88268 D: 1BT: 7
      if(in2<testIndex) //S:88222   E:88268 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:88251   E:0 D: 2BT: 0
         in2 = in.length(); //S:88251   E:88268 D: 2BT: 0
      }
      else //S:88268   E:0 D: 1BT: 0
      {
         QuicktestRunner.execPath += 1; //S:88269   E:0 D: 2BT: 0
      }
      in = in.substring(testIndex + 8 , in2); //S:88275   E:88312 D: 1BT: 0
      Integer rtnVal = Integer.parseInt(in); //S:88322   E:88359 D: 1BT: 0
      return rtnVal.intValue(); //S:88369   E:88393 D: 1BT: 0
   }
   return - 1; //S:88407   E:88416 D: 0BT: 0
   }

   public MethodInfoTest getMethodForTest(String in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:6 CP:0
/***************************
Processing list:
int mNumber = getMethodNameIndex(in); {S:88486 E:88522 D:0 BT: 0}
String str = stripTestName(in); {S:88531 E:88561 D:0 BT: 0}
int num = 1; {S:88570 E:88581 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:88653 E:88903 D:0 BT: 0}
return null; {S:88912 E:88923 D:0 BT: 0}
****************************/
/***************************
Processing list:
int mNumber = getMethodNameIndex(in); {S:88486 E:88522 D:0 BT: 0}
String str = stripTestName(in); {S:88531 E:88561 D:0 BT: 0}
int num = 1; {S:88570 E:88581 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:88653 E:88903 D:0 BT: 0}
return null; {S:88912 E:88923 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:88589 E:88644 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:88589 E:88644 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:88703 E:88894 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:88703 E:88894 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(str == null || mNumber == - 1) {S:88590 E:88644 D:0 BT: 1}
return null; {S:88633 E:88644 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(str == null || mNumber == - 1){} {S:88590 E:88644 D:0 BT: 1}
QuicktestRunner.execPath += 3; {S:88633 E:0 D:1 BT: 0}
return null; {S:88633 E:88644 D:1 BT: 0}
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
if(getMethod(i).name.equals(str)){ {S:88704 E:88881 D:1 BT: 1}
****************************/
/***************************
Processing list:
if(getMethod(i).name.equals(str)){} {S:88704 E:88881 D:1 BT: 1}
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:88882 E:88894 D:1 BT: 2}
num = 1; {S:88887 E:88894 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:88882 E:88894 D:1 BT: 2}
num = 1; {S:88887 E:88894 D:2 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#8(6) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:88759 E:88847 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:88759 E:88847 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#9(8) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(mNumber == num)else num ++; {S:88760 E:88836 D:2 BT: 1}
return getMethod(i); {S:88795 E:88814 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(mNumber == num){} {S:88760 E:88836 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:88795 E:0 D:3 BT: 0}
return getMethod(i); {S:88795 E:88814 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#10(8) Type:2 Paths:1 CP:1
/***************************
Processing list:
 {S:88837 E:88847 D:2 BT: 2}
num ++; {S:88842 E:88847 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:88837 E:88847 D:2 BT: 2}
QuicktestRunner.execPath += 1; {S:88842 E:0 D:3 BT: 0}
num ++; {S:88842 E:88847 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int mNumber = getMethodNameIndex(in); {S:88486 E:88522 D:0 BT: 0}
String str = stripTestName(in); {S:88531 E:88561 D:0 BT: 0}
int num = 1; {S:88570 E:88581 D:0 BT: 0}
 {S:88589 E:88644 D:0 BT: 7}
if(str == null || mNumber == - 1){} {S:88590 E:88644 D:0 BT: 1}
QuicktestRunner.execPath += 3; {S:88633 E:0 D:1 BT: 0}
return null; {S:88633 E:88644 D:1 BT: 0}
for(int i = 0;i<size();i ++){} {S:88653 E:88903 D:0 BT: 0}
 {S:88703 E:88894 D:1 BT: 7}
if(getMethod(i).name.equals(str)){} {S:88704 E:88881 D:1 BT: 1}
 {S:88759 E:88847 D:2 BT: 7}
if(mNumber == num){} {S:88760 E:88836 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:88795 E:0 D:3 BT: 0}
return getMethod(i); {S:88795 E:88814 D:3 BT: 0}
else{} {S:88837 E:88847 D:2 BT: 2}
QuicktestRunner.execPath += 1; {S:88842 E:0 D:3 BT: 0}
num ++; {S:88842 E:88847 D:3 BT: 0}
else{} {S:88882 E:88894 D:1 BT: 2}
num = 1; {S:88887 E:88894 D:2 BT: 0}
return null; {S:88912 E:88923 D:0 BT: 0}
****************************/
   int mNumber = getMethodNameIndex(in); //S:88486   E:88522 D: 0BT: 0
   String str = stripTestName(in); //S:88531   E:88561 D: 0BT: 0
   int num = 1; //S:88570   E:88581 D: 0BT: 0
    //S:88589   E:88644 D: 0BT: 7
   if(str == null || mNumber == - 1) //S:88590   E:88644 D: 0BT: 1
   {
      QuicktestRunner.execPath += 3; //S:88633   E:0 D: 1BT: 0
      return null; //S:88633   E:88644 D: 1BT: 0
   }
   for(int i = 0;i<size();i ++) //S:88653   E:88903 D: 0BT: 0
   {
       //S:88703   E:88894 D: 1BT: 7
      if(getMethod(i).name.equals(str)) //S:88704   E:88881 D: 1BT: 1
      {
          //S:88759   E:88847 D: 2BT: 7
         if(mNumber == num) //S:88760   E:88836 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:88795   E:0 D: 3BT: 0
            return getMethod(i); //S:88795   E:88814 D: 3BT: 0
         }
         else //S:88837   E:88847 D: 2BT: 2
         {
            QuicktestRunner.execPath += 1; //S:88842   E:0 D: 3BT: 0
            num ++; //S:88842   E:88847 D: 3BT: 0
         }
      }
      else //S:88882   E:88894 D: 1BT: 2
      {
         num = 1; //S:88887   E:88894 D: 2BT: 0
      }
   }
   return null; //S:88912   E:88923 D: 0BT: 0
   }

   public MethodInfoTest getMethodWithName(String in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:88997 E:89122 D:0 BT: 0}
return null; {S:89131 E:89142 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:88997 E:89122 D:0 BT: 0}
return null; {S:89131 E:89142 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:89047 E:89113 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:89047 E:89113 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(getMethod(i).name.equals(in)) {S:89048 E:89113 D:1 BT: 1}
return getMethod(i); {S:89094 E:89113 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(getMethod(i).name.equals(in)){} {S:89048 E:89113 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:89094 E:0 D:2 BT: 0}
return getMethod(i); {S:89094 E:89113 D:2 BT: 0}
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
for(int i = 0;i<size();i ++){} {S:88997 E:89122 D:0 BT: 0}
 {S:89047 E:89113 D:1 BT: 7}
if(getMethod(i).name.equals(in)){} {S:89048 E:89113 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:89094 E:0 D:2 BT: 0}
return getMethod(i); {S:89094 E:89113 D:2 BT: 0}
return null; {S:89131 E:89142 D:0 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:88997   E:89122 D: 0BT: 0
   {
       //S:89047   E:89113 D: 1BT: 7
      if(getMethod(i).name.equals(in)) //S:89048   E:89113 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:89094   E:0 D: 2BT: 0
         return getMethod(i); //S:89094   E:89113 D: 2BT: 0
      }
   }
   return null; //S:89131   E:89142 D: 0BT: 0
   }

   public MethodInfoTest getMethodWithSignature(String in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:89222 E:89365 D:0 BT: 0}
<sublist>
MethodInfoTest mi = getMethod(i); {S:89267 E:89295 D:1 BT: 0}
</sublist>
return null; {S:89372 E:89383 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:89222 E:89365 D:0 BT: 0}
<sublist>
MethodInfoTest mi = getMethod(i); {S:89267 E:89295 D:1 BT: 0}
</sublist>
return null; {S:89372 E:89383 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:89302 E:89358 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:89302 E:89358 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(mi.getMethodSignature().equals(in)) {S:89303 E:89358 D:1 BT: 1}
return mi; {S:89349 E:89358 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(mi.getMethodSignature().equals(in)){} {S:89303 E:89358 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:89349 E:0 D:2 BT: 0}
return mi; {S:89349 E:89358 D:2 BT: 0}
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
for(int i = 0;i<size();i ++){} {S:89222 E:89365 D:0 BT: 0}
<sublist>
MethodInfoTest mi = getMethod(i); {S:89267 E:89295 D:1 BT: 0}
</sublist>
MethodInfoTest mi = getMethod(i); {S:89267 E:89295 D:1 BT: 0}
 {S:89302 E:89358 D:1 BT: 7}
if(mi.getMethodSignature().equals(in)){} {S:89303 E:89358 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:89349 E:0 D:2 BT: 0}
return mi; {S:89349 E:89358 D:2 BT: 0}
return null; {S:89372 E:89383 D:0 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:89222   E:89365 D: 0BT: 0
   {
      MethodInfoTest mi = getMethod(i); //S:89267   E:89295 D: 1BT: 0
       //S:89302   E:89358 D: 1BT: 7
      if(mi.getMethodSignature().equals(in)) //S:89303   E:89358 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:89349   E:0 D: 2BT: 0
         return mi; //S:89349   E:89358 D: 2BT: 0
      }
   }
   return null; //S:89372   E:89383 D: 0BT: 0
   }

   public int countMethodsWithName(MethodInfoTest in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
int rtnVal = 1; {S:89455 E:89469 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:89476 E:89636 D:0 BT: 0}
return rtnVal; {S:89643 E:89656 D:0 BT: 0}
****************************/
/***************************
Processing list:
int rtnVal = 1; {S:89455 E:89469 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:89476 E:89636 D:0 BT: 0}
return rtnVal; {S:89643 E:89656 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:89522 E:89568 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:89522 E:89568 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:89575 E:89629 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:89575 E:89629 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(getMethod(i)== in) {S:89523 E:89568 D:1 BT: 1}
return rtnVal; {S:89555 E:89568 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(getMethod(i)== in){} {S:89523 E:89568 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:89555 E:0 D:2 BT: 0}
return rtnVal; {S:89555 E:89568 D:2 BT: 0}
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
if(getMethod(i).name.equals(in.name)) {S:89576 E:89629 D:1 BT: 1}
rtnVal ++; {S:89621 E:89629 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(getMethod(i).name.equals(in.name)){} {S:89576 E:89629 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:89621 E:0 D:2 BT: 0}
rtnVal ++; {S:89621 E:89629 D:2 BT: 0}
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
int rtnVal = 1; {S:89455 E:89469 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:89476 E:89636 D:0 BT: 0}
 {S:89522 E:89568 D:1 BT: 7}
if(getMethod(i)== in){} {S:89523 E:89568 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:89555 E:0 D:2 BT: 0}
return rtnVal; {S:89555 E:89568 D:2 BT: 0}
 {S:89575 E:89629 D:1 BT: 7}
if(getMethod(i).name.equals(in.name)){} {S:89576 E:89629 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:89621 E:0 D:2 BT: 0}
rtnVal ++; {S:89621 E:89629 D:2 BT: 0}
return rtnVal; {S:89643 E:89656 D:0 BT: 0}
****************************/
   int rtnVal = 1; //S:89455   E:89469 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:89476   E:89636 D: 0BT: 0
   {
       //S:89522   E:89568 D: 1BT: 7
      if(getMethod(i)== in) //S:89523   E:89568 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:89555   E:0 D: 2BT: 0
         return rtnVal; //S:89555   E:89568 D: 2BT: 0
      }
       //S:89575   E:89629 D: 1BT: 7
      if(getMethod(i).name.equals(in.name)) //S:89576   E:89629 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:89621   E:0 D: 2BT: 0
         rtnVal ++; //S:89621   E:89629 D: 2BT: 0
      }
   }
   return rtnVal; //S:89643   E:89656 D: 0BT: 0
   }

   public void output()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
System.out.println(" Methods:"); {S:89710 E:89741 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:89748 E:89965 D:0 BT: 0}
<sublist>
MethodInfoTest mi = this.getMethod(i); {S:89793 E:89826 D:1 BT: 0}
System.out.println("  " + mi.name + " " + mi.startChar + " " + mi.endChar); {S:89834 E:89908 D:1 BT: 0}
mi.allLines.output("     " , LineListTest.CODE); {S:89916 E:89958 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
System.out.println(" Methods:"); {S:89710 E:89741 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:89748 E:89965 D:0 BT: 0}
<sublist>
MethodInfoTest mi = this.getMethod(i); {S:89793 E:89826 D:1 BT: 0}
System.out.println("  " + mi.name + " " + mi.startChar + " " + mi.endChar); {S:89834 E:89908 D:1 BT: 0}
mi.allLines.output("     " , LineListTest.CODE); {S:89916 E:89958 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
System.out.println(" Methods:"); {S:89710 E:89741 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:89748 E:89965 D:0 BT: 0}
<sublist>
MethodInfoTest mi = this.getMethod(i); {S:89793 E:89826 D:1 BT: 0}
System.out.println("  " + mi.name + " " + mi.startChar + " " + mi.endChar); {S:89834 E:89908 D:1 BT: 0}
mi.allLines.output("     " , LineListTest.CODE); {S:89916 E:89958 D:1 BT: 0}
</sublist>
MethodInfoTest mi = this.getMethod(i); {S:89793 E:89826 D:1 BT: 0}
System.out.println("  " + mi.name + " " + mi.startChar + " " + mi.endChar); {S:89834 E:89908 D:1 BT: 0}
mi.allLines.output("     " , LineListTest.CODE); {S:89916 E:89958 D:1 BT: 0}
****************************/
   System.out.println(" Methods:"); //S:89710   E:89741 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:89748   E:89965 D: 0BT: 0
   {
      MethodInfoTest mi = this.getMethod(i); //S:89793   E:89826 D: 1BT: 0
      System.out.println("  " + mi.name + " " + mi.startChar + " " + mi.endChar); //S:89834   E:89908 D: 1BT: 0
      mi.allLines.output("     " , LineListTest.CODE); //S:89916   E:89958 D: 1BT: 0
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

   public MethodListTest(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

