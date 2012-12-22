import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class VarListTest extends LinkedList
{

   public VarInfoTest getVar(int index)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(VarInfoTest)super.get(index); {S:96962 E:96995 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(VarInfoTest)super.get(index); {S:96962 E:96995 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(VarInfoTest)super.get(index); {S:96962 E:96995 D:0 BT: 0}
****************************/
   return(VarInfoTest)super.get(index); //S:96962   E:96995 D: 0BT: 0
   }

   public VarInfoTest getVarWithName(String in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
VarInfoTest rtnVal; {S:97064 E:97078 D:0 BT: 0}
for(int i = 0;i<this.size();i ++){} {S:97085 E:97220 D:0 BT: 0}
<sublist>
rtnVal = getVar(i); {S:97135 E:97153 D:1 BT: 0}
</sublist>
return null; {S:97227 E:97238 D:0 BT: 0}
****************************/
/***************************
Processing list:
VarInfoTest rtnVal; {S:97064 E:97078 D:0 BT: 0}
for(int i = 0;i<this.size();i ++){} {S:97085 E:97220 D:0 BT: 0}
<sublist>
rtnVal = getVar(i); {S:97135 E:97153 D:1 BT: 0}
</sublist>
return null; {S:97227 E:97238 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:97160 E:97213 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:97160 E:97213 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(rtnVal.getName().equals(in)) {S:97161 E:97213 D:1 BT: 1}
return rtnVal; {S:97200 E:97213 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(rtnVal.getName().equals(in)){} {S:97161 E:97213 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:97200 E:0 D:2 BT: 0}
return rtnVal; {S:97200 E:97213 D:2 BT: 0}
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
VarInfoTest rtnVal; {S:97064 E:97078 D:0 BT: 0}
for(int i = 0;i<this.size();i ++){} {S:97085 E:97220 D:0 BT: 0}
<sublist>
rtnVal = getVar(i); {S:97135 E:97153 D:1 BT: 0}
</sublist>
rtnVal = getVar(i); {S:97135 E:97153 D:1 BT: 0}
 {S:97160 E:97213 D:1 BT: 7}
if(rtnVal.getName().equals(in)){} {S:97161 E:97213 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:97200 E:0 D:2 BT: 0}
return rtnVal; {S:97200 E:97213 D:2 BT: 0}
return null; {S:97227 E:97238 D:0 BT: 0}
****************************/
   VarInfoTest rtnVal; //S:97064   E:97078 D: 0BT: 0
   for(int i = 0;i<this.size();i ++) //S:97085   E:97220 D: 0BT: 0
   {
      rtnVal = getVar(i); //S:97135   E:97153 D: 1BT: 0
       //S:97160   E:97213 D: 1BT: 7
      if(rtnVal.getName().equals(in)) //S:97161   E:97213 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:97200   E:0 D: 2BT: 0
         return rtnVal; //S:97200   E:97213 D: 2BT: 0
      }
   }
   return null; //S:97227   E:97238 D: 0BT: 0
   }

   public VarInfoTest getFirstVar()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(VarInfoTest)super.getFirst(); {S:97294 E:97327 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(VarInfoTest)super.getFirst(); {S:97294 E:97327 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(VarInfoTest)super.getFirst(); {S:97294 E:97327 D:0 BT: 0}
****************************/
   return(VarInfoTest)super.getFirst(); //S:97294   E:97327 D: 0BT: 0
   }

   public VarInfoTest getLastVar()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(VarInfoTest)super.getLast(); {S:97382 E:97414 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(VarInfoTest)super.getLast(); {S:97382 E:97414 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(VarInfoTest)super.getLast(); {S:97382 E:97414 D:0 BT: 0}
****************************/
   return(VarInfoTest)super.getLast(); //S:97382   E:97414 D: 0BT: 0
   }

   public void output()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
System.out.println(" Vars:"); {S:97463 E:97491 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:97498 E:97681 D:0 BT: 0}
<sublist>
VarInfoTest vi = getVar(i); {S:97543 E:97565 D:1 BT: 0}
System.out.println("  " + vi.getType()+ " " + vi.getName()+ ": " + vi.startChar + " " + vi.endChar); {S:97573 E:97674 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
System.out.println(" Vars:"); {S:97463 E:97491 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:97498 E:97681 D:0 BT: 0}
<sublist>
VarInfoTest vi = getVar(i); {S:97543 E:97565 D:1 BT: 0}
System.out.println("  " + vi.getType()+ " " + vi.getName()+ ": " + vi.startChar + " " + vi.endChar); {S:97573 E:97674 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
System.out.println(" Vars:"); {S:97463 E:97491 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:97498 E:97681 D:0 BT: 0}
<sublist>
VarInfoTest vi = getVar(i); {S:97543 E:97565 D:1 BT: 0}
System.out.println("  " + vi.getType()+ " " + vi.getName()+ ": " + vi.startChar + " " + vi.endChar); {S:97573 E:97674 D:1 BT: 0}
</sublist>
VarInfoTest vi = getVar(i); {S:97543 E:97565 D:1 BT: 0}
System.out.println("  " + vi.getType()+ " " + vi.getName()+ ": " + vi.startChar + " " + vi.endChar); {S:97573 E:97674 D:1 BT: 0}
****************************/
   System.out.println(" Vars:"); //S:97463   E:97491 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:97498   E:97681 D: 0BT: 0
   {
      VarInfoTest vi = getVar(i); //S:97543   E:97565 D: 1BT: 0
      System.out.println("  " + vi.getType()+ " " + vi.getName()+ ": " + vi.startChar + " " + vi.endChar); //S:97573   E:97674 D: 1BT: 0
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

   public String getAsParamList()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:97740 E:97758 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:97765 E:97990 D:0 BT: 0}
<sublist>
VarInfoTest vi = getVar(i); {S:97810 E:97832 D:1 BT: 0}
rtnVal += vi.getTypeSignature()+ ", "; {S:97945 E:97983 D:1 BT: 0}
</sublist>
return rtnVal; {S:98085 E:98098 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:97740 E:97758 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:97765 E:97990 D:0 BT: 0}
<sublist>
VarInfoTest vi = getVar(i); {S:97810 E:97832 D:1 BT: 0}
rtnVal += vi.getTypeSignature()+ ", "; {S:97945 E:97983 D:1 BT: 0}
</sublist>
return rtnVal; {S:98085 E:98098 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:97996 E:98078 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:97996 E:98078 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(rtnVal.endsWith(", ")) {S:97997 E:98078 D:0 BT: 1}
rtnVal = rtnVal.substring(0 , rtnVal.length()- 2); {S:98029 E:98078 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(rtnVal.endsWith(", ")){} {S:97997 E:98078 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:98029 E:0 D:1 BT: 0}
rtnVal = rtnVal.substring(0 , rtnVal.length()- 2); {S:98029 E:98078 D:1 BT: 0}
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
String rtnVal = ""; {S:97740 E:97758 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:97765 E:97990 D:0 BT: 0}
<sublist>
VarInfoTest vi = getVar(i); {S:97810 E:97832 D:1 BT: 0}
rtnVal += vi.getTypeSignature()+ ", "; {S:97945 E:97983 D:1 BT: 0}
</sublist>
VarInfoTest vi = getVar(i); {S:97810 E:97832 D:1 BT: 0}
rtnVal += vi.getTypeSignature()+ ", "; {S:97945 E:97983 D:1 BT: 0}
 {S:97996 E:98078 D:0 BT: 7}
if(rtnVal.endsWith(", ")){} {S:97997 E:98078 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:98029 E:0 D:1 BT: 0}
rtnVal = rtnVal.substring(0 , rtnVal.length()- 2); {S:98029 E:98078 D:1 BT: 0}
return rtnVal; {S:98085 E:98098 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:97740   E:97758 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:97765   E:97990 D: 0BT: 0
   {
      VarInfoTest vi = getVar(i); //S:97810   E:97832 D: 1BT: 0
      rtnVal += vi.getTypeSignature()+ ", "; //S:97945   E:97983 D: 1BT: 0
   }
    //S:97996   E:98078 D: 0BT: 7
   if(rtnVal.endsWith(", ")) //S:97997   E:98078 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:98029   E:0 D: 1BT: 0
      rtnVal = rtnVal.substring(0 , rtnVal.length()- 2); //S:98029   E:98078 D: 1BT: 0
   }
   return rtnVal; //S:98085   E:98098 D: 0BT: 0
   }

   public String publicList(String tab)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:98163 E:98181 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:98188 E:98548 D:0 BT: 0}
<sublist>
VarInfoTest vi = getVar(i); {S:98233 E:98255 D:1 BT: 0}
rtnVal += tab + "public " + vi.getModifiers(false)+ vi.getTypeSignature(); {S:98263 E:98337 D:1 BT: 0}
rtnVal += ";\n"; {S:98526 E:98541 D:1 BT: 0}
</sublist>
return rtnVal; {S:98555 E:98568 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:98163 E:98181 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:98188 E:98548 D:0 BT: 0}
<sublist>
VarInfoTest vi = getVar(i); {S:98233 E:98255 D:1 BT: 0}
rtnVal += tab + "public " + vi.getModifiers(false)+ vi.getTypeSignature(); {S:98263 E:98337 D:1 BT: 0}
rtnVal += ";\n"; {S:98526 E:98541 D:1 BT: 0}
</sublist>
return rtnVal; {S:98555 E:98568 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:98455 E:98518 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:98455 E:98518 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(vi.initValue != null) {S:98456 E:98518 D:1 BT: 1}
rtnVal += " = " + vi.initValue; {S:98488 E:98518 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(vi.initValue != null){} {S:98456 E:98518 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:98488 E:0 D:2 BT: 0}
rtnVal += " = " + vi.initValue; {S:98488 E:98518 D:2 BT: 0}
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
String rtnVal = ""; {S:98163 E:98181 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:98188 E:98548 D:0 BT: 0}
<sublist>
VarInfoTest vi = getVar(i); {S:98233 E:98255 D:1 BT: 0}
rtnVal += tab + "public " + vi.getModifiers(false)+ vi.getTypeSignature(); {S:98263 E:98337 D:1 BT: 0}
rtnVal += ";\n"; {S:98526 E:98541 D:1 BT: 0}
</sublist>
VarInfoTest vi = getVar(i); {S:98233 E:98255 D:1 BT: 0}
rtnVal += tab + "public " + vi.getModifiers(false)+ vi.getTypeSignature(); {S:98263 E:98337 D:1 BT: 0}
 {S:98455 E:98518 D:1 BT: 7}
if(vi.initValue != null){} {S:98456 E:98518 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:98488 E:0 D:2 BT: 0}
rtnVal += " = " + vi.initValue; {S:98488 E:98518 D:2 BT: 0}
rtnVal += ";\n"; {S:98526 E:98541 D:1 BT: 0}
return rtnVal; {S:98555 E:98568 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:98163   E:98181 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:98188   E:98548 D: 0BT: 0
   {
      VarInfoTest vi = getVar(i); //S:98233   E:98255 D: 1BT: 0
      rtnVal += tab + "public " + vi.getModifiers(false)+ vi.getTypeSignature(); //S:98263   E:98337 D: 1BT: 0
       //S:98455   E:98518 D: 1BT: 7
      if(vi.initValue != null) //S:98456   E:98518 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:98488   E:0 D: 2BT: 0
         rtnVal += " = " + vi.initValue; //S:98488   E:98518 D: 2BT: 0
      }
      rtnVal += ";\n"; //S:98526   E:98541 D: 1BT: 0
   }
   return rtnVal; //S:98555   E:98568 D: 0BT: 0
   }

   public VarListTest(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

