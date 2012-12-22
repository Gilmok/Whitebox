import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class AssertionInfoTest
{
   public int line;
   public VarInfoTest dataType;
   public String expValue;
   public String fromClass;
   public boolean isReturn;

   AssertionInfoTest()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
dataType = new VarInfoTest("" , "" , 0); {S:98842 E:98875 D:0 BT: 0}
expValue = ""; {S:98882 E:98895 D:0 BT: 0}
****************************/
/***************************
Processing list:
dataType = new VarInfoTest("" , "" , 0); {S:98842 E:98875 D:0 BT: 0}
expValue = ""; {S:98882 E:98895 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
dataType = new VarInfoTest("" , "" , 0); {S:98842 E:98875 D:0 BT: 0}
expValue = ""; {S:98882 E:98895 D:0 BT: 0}
****************************/
   dataType = new VarInfoTest("" , "" , 0); //S:98842   E:98875 D: 0BT: 0
   expValue = ""; //S:98882   E:98895 D: 0BT: 0
   }

   AssertionInfoTest(String line, int lineNo, ClassListTest progTree)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:65 CP:0
/***************************
Processing list:
this(); {S:98979 E:98985 D:0 BT: 0}
String dataName = ""; {S:98992 E:99012 D:0 BT: 0}
this.line = lineNo; {S:99117 E:99135 D:0 BT: 0}
line = line.trim(); {S:99144 E:99162 D:0 BT: 0}
fromClass = ""; {S:99171 E:99185 D:0 BT: 0}
****************************/
/***************************
Processing list:
this(); {S:98979 E:98985 D:0 BT: 0}
String dataName = ""; {S:98992 E:99012 D:0 BT: 0}
this.line = lineNo; {S:99117 E:99135 D:0 BT: 0}
line = line.trim(); {S:99144 E:99162 D:0 BT: 0}
fromClass = ""; {S:99171 E:99185 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:65 CP:0
/***************************
Processing list:
 {S:99193 E:101111 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:99193 E:101111 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:64
/***************************
Processing list:
if(line.startsWith("return")){ {S:99194 E:99510 D:0 BT: 1}
VarInfoTest rtnT = progTree.findMethodWithChar(lineNo).returnType; {S:99274 E:99335 D:1 BT: 0}
dataType = new VarInfoTest(rtnT.getTypeWithDims(), "rtnVal" , rtnT.startChar); {S:99347 E:99419 D:1 BT: 0}
isReturn = true; {S:99471 E:99486 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(line.startsWith("return")){} {S:99194 E:99510 D:0 BT: 1}
QuicktestRunner.execPath += 64; {S:99274 E:0 D:1 BT: 0}
VarInfoTest rtnT = progTree.findMethodWithChar(lineNo).returnType; {S:99274 E:99335 D:1 BT: 0}
dataType = new VarInfoTest(rtnT.getTypeWithDims(), "rtnVal" , rtnT.startChar); {S:99347 E:99419 D:1 BT: 0}
isReturn = true; {S:99471 E:99486 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:64 CP:0
/***************************
Processing list:
 {S:99511 E:101111 D:0 BT: 2}
String oper = ""; {S:99559 E:99575 D:0 BT: 0}
for(int i = 0;i<LineInfoTest.ASSIGNS.length;i ++){} {S:99585 E:99742 D:0 BT: 0}
String[]equ = line.split(oper); {S:99763 E:99794 D:0 BT: 0}
dataName = equ[0].trim(); {S:99806 E:99830 D:0 BT: 0}
String[]dots = dataName.split("\\."); {S:99896 E:99933 D:0 BT: 0}
String lastSection; {S:99945 E:99963 D:0 BT: 0}
lastSection = lastSection.trim(); {S:100106 E:100138 D:0 BT: 0}
String firstSection; {S:100150 E:100169 D:0 BT: 0}
firstSection = firstSection.trim(); {S:100300 E:100334 D:0 BT: 0}
for(int i = 0;i<progTree.size();i ++){} {S:100541 E:101102 D:0 BT: 0}
<sublist>
ClassInfoTest ci = progTree.getClass(i); {S:100607 E:100642 D:1 BT: 0}
VarListTest vl = ci.vars; {S:100657 E:100677 D:1 BT: 0}
for(int j = 0;j<vl.size();j ++){} {S:100692 E:101090 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
else{} {S:99511 E:101111 D:0 BT: 2}
String oper = ""; {S:99559 E:99575 D:1 BT: 0}
for(int i = 0;i<LineInfoTest.ASSIGNS.length;i ++){} {S:99585 E:99742 D:1 BT: 0}
String[]equ = line.split(oper); {S:99763 E:99794 D:1 BT: 0}
dataName = equ[0].trim(); {S:99806 E:99830 D:1 BT: 0}
String[]dots = dataName.split("\\."); {S:99896 E:99933 D:1 BT: 0}
String lastSection; {S:99945 E:99963 D:1 BT: 0}
lastSection = lastSection.trim(); {S:100106 E:100138 D:1 BT: 0}
String firstSection; {S:100150 E:100169 D:1 BT: 0}
firstSection = firstSection.trim(); {S:100300 E:100334 D:1 BT: 0}
for(int i = 0;i<progTree.size();i ++){} {S:100541 E:101102 D:1 BT: 0}
<sublist>
ClassInfoTest ci = progTree.getClass(i); {S:100607 E:100642 D:2 BT: 0}
VarListTest vl = ci.vars; {S:100657 E:100677 D:2 BT: 0}
for(int j = 0;j<vl.size();j ++){} {S:100692 E:101090 D:2 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(4) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:99652 E:99732 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:99652 E:99732 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#6(4) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:99974 E:100094 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:99974 E:100094 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#7(4) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:100180 E:100288 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:100180 E:100288 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#8(4) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:100356 E:100518 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:100356 E:100518 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#9(4) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:100757 E:100932 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:100757 E:100932 D:4 BT: 7}
****************************/
//=======================================
//=======================================
//#10(4) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:100949 E:101075 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:100949 E:101075 D:4 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(5) Type:1 Paths:1 CP:32
/***************************
Processing list:
if(line.indexOf(LineInfoTest.ASSIGNS[i])>- 1) {S:99653 E:99732 D:3 BT: 1}
oper = LineInfoTest.ASSIGNS[i]; {S:99706 E:99732 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(line.indexOf(LineInfoTest.ASSIGNS[i])>- 1){} {S:99653 E:99732 D:3 BT: 1}
QuicktestRunner.execPath += 32; {S:99706 E:0 D:4 BT: 0}
oper = LineInfoTest.ASSIGNS[i]; {S:99706 E:99732 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#12(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#13(6) Type:1 Paths:1 CP:16
/***************************
Processing list:
if(dots.length == 0)else lastSection = dots[dots.length - 1]; {S:99975 E:100053 D:2 BT: 1}
lastSection = equ[0]; {S:100009 E:100029 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(dots.length == 0){} {S:99975 E:100053 D:2 BT: 1}
QuicktestRunner.execPath += 16; {S:100009 E:0 D:3 BT: 0}
lastSection = equ[0]; {S:100009 E:100029 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#14(6) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:100054 E:100094 D:2 BT: 2}
lastSection = dots[dots.length - 1]; {S:100059 E:100094 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:100054 E:100094 D:2 BT: 2}
lastSection = dots[dots.length - 1]; {S:100059 E:100094 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#15(7) Type:1 Paths:1 CP:8
/***************************
Processing list:
if(dots.length == 0)else firstSection = dots[0]; {S:100181 E:100260 D:2 BT: 1}
firstSection = equ[0]; {S:100215 E:100236 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(dots.length == 0){} {S:100181 E:100260 D:2 BT: 1}
QuicktestRunner.execPath += 8; {S:100215 E:0 D:3 BT: 0}
firstSection = equ[0]; {S:100215 E:100236 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#16(7) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:100261 E:100288 D:2 BT: 2}
firstSection = dots[0]; {S:100266 E:100288 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:100261 E:100288 D:2 BT: 2}
firstSection = dots[0]; {S:100266 E:100288 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#17(8) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(firstSection.equals(lastSection)|| firstSection.equals("this")){} {S:100357 E:100518 D:2 BT: 1}
fromClass = progTree.findClassWithChar(lineNo).className; {S:100450 E:100506 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(firstSection.equals(lastSection)|| firstSection.equals("this")){} {S:100357 E:100518 D:2 BT: 1}
QuicktestRunner.execPath += 4; {S:100450 E:0 D:3 BT: 0}
fromClass = progTree.findClassWithChar(lineNo).className; {S:100450 E:100506 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#18(8) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#19(9) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(vl.getVar(j).getName().equals(firstSection)&& ! firstSection.equals(lastSection)){} {S:100758 E:100932 D:4 BT: 1}
fromClass = vl.getVar(j).getType(); {S:100880 E:100914 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(vl.getVar(j).getName().equals(firstSection)&& ! firstSection.equals(lastSection)){} {S:100758 E:100932 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:100880 E:0 D:5 BT: 0}
fromClass = vl.getVar(j).getType(); {S:100880 E:100914 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#20(9) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#21(10) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(vl.getVar(j).getName().equals(lastSection)){} {S:100950 E:101075 D:4 BT: 1}
dataType = vl.getVar(j); {S:101034 E:101057 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(vl.getVar(j).getName().equals(lastSection)){} {S:100950 E:101075 D:4 BT: 1}
QuicktestRunner.execPath += 1; {S:101034 E:0 D:5 BT: 0}
dataType = vl.getVar(j); {S:101034 E:101057 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#22(10) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
this(); {S:98979 E:98985 D:0 BT: 0}
String dataName = ""; {S:98992 E:99012 D:0 BT: 0}
this.line = lineNo; {S:99117 E:99135 D:0 BT: 0}
line = line.trim(); {S:99144 E:99162 D:0 BT: 0}
fromClass = ""; {S:99171 E:99185 D:0 BT: 0}
 {S:99193 E:101111 D:0 BT: 7}
if(line.startsWith("return")){} {S:99194 E:99510 D:0 BT: 1}
QuicktestRunner.execPath += 64; {S:99274 E:0 D:1 BT: 0}
VarInfoTest rtnT = progTree.findMethodWithChar(lineNo).returnType; {S:99274 E:99335 D:1 BT: 0}
dataType = new VarInfoTest(rtnT.getTypeWithDims(), "rtnVal" , rtnT.startChar); {S:99347 E:99419 D:1 BT: 0}
isReturn = true; {S:99471 E:99486 D:1 BT: 0}
else{} {S:99511 E:101111 D:0 BT: 2}
String oper = ""; {S:99559 E:99575 D:1 BT: 0}
for(int i = 0;i<LineInfoTest.ASSIGNS.length;i ++){} {S:99585 E:99742 D:1 BT: 0}
 {S:99652 E:99732 D:2 BT: 7}
if(line.indexOf(LineInfoTest.ASSIGNS[i])>- 1){} {S:99653 E:99732 D:2 BT: 1}
QuicktestRunner.execPath += 32; {S:99706 E:0 D:3 BT: 0}
oper = LineInfoTest.ASSIGNS[i]; {S:99706 E:99732 D:3 BT: 0}
String[]equ = line.split(oper); {S:99763 E:99794 D:1 BT: 0}
dataName = equ[0].trim(); {S:99806 E:99830 D:1 BT: 0}
String[]dots = dataName.split("\\."); {S:99896 E:99933 D:1 BT: 0}
String lastSection; {S:99945 E:99963 D:1 BT: 0}
 {S:99974 E:100094 D:1 BT: 7}
if(dots.length == 0){} {S:99975 E:100053 D:1 BT: 1}
QuicktestRunner.execPath += 16; {S:100009 E:0 D:2 BT: 0}
lastSection = equ[0]; {S:100009 E:100029 D:2 BT: 0}
else{} {S:100054 E:100094 D:1 BT: 2}
lastSection = dots[dots.length - 1]; {S:100059 E:100094 D:2 BT: 0}
lastSection = lastSection.trim(); {S:100106 E:100138 D:1 BT: 0}
String firstSection; {S:100150 E:100169 D:1 BT: 0}
 {S:100180 E:100288 D:1 BT: 7}
if(dots.length == 0){} {S:100181 E:100260 D:1 BT: 1}
QuicktestRunner.execPath += 8; {S:100215 E:0 D:2 BT: 0}
firstSection = equ[0]; {S:100215 E:100236 D:2 BT: 0}
else{} {S:100261 E:100288 D:1 BT: 2}
firstSection = dots[0]; {S:100266 E:100288 D:2 BT: 0}
firstSection = firstSection.trim(); {S:100300 E:100334 D:1 BT: 0}
 {S:100356 E:100518 D:1 BT: 7}
if(firstSection.equals(lastSection)|| firstSection.equals("this")){} {S:100357 E:100518 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:100450 E:0 D:2 BT: 0}
fromClass = progTree.findClassWithChar(lineNo).className; {S:100450 E:100506 D:2 BT: 0}
for(int i = 0;i<progTree.size();i ++){} {S:100541 E:101102 D:1 BT: 0}
<sublist>
ClassInfoTest ci = progTree.getClass(i); {S:100607 E:100642 D:2 BT: 0}
VarListTest vl = ci.vars; {S:100657 E:100677 D:2 BT: 0}
for(int j = 0;j<vl.size();j ++){} {S:100692 E:101090 D:2 BT: 0}
</sublist>
ClassInfoTest ci = progTree.getClass(i); {S:100607 E:100642 D:2 BT: 0}
VarListTest vl = ci.vars; {S:100657 E:100677 D:2 BT: 0}
for(int j = 0;j<vl.size();j ++){} {S:100692 E:101090 D:2 BT: 0}
 {S:100757 E:100932 D:3 BT: 7}
if(vl.getVar(j).getName().equals(firstSection)&& ! firstSection.equals(lastSection)){} {S:100758 E:100932 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:100880 E:0 D:4 BT: 0}
fromClass = vl.getVar(j).getType(); {S:100880 E:100914 D:4 BT: 0}
 {S:100949 E:101075 D:3 BT: 7}
if(vl.getVar(j).getName().equals(lastSection)){} {S:100950 E:101075 D:3 BT: 1}
QuicktestRunner.execPath += 1; {S:101034 E:0 D:4 BT: 0}
dataType = vl.getVar(j); {S:101034 E:101057 D:4 BT: 0}
****************************/
   this(); //S:98979   E:98985 D: 0BT: 0
   String dataName = ""; //S:98992   E:99012 D: 0BT: 0
   this.line = lineNo; //S:99117   E:99135 D: 0BT: 0
   line = line.trim(); //S:99144   E:99162 D: 0BT: 0
   fromClass = ""; //S:99171   E:99185 D: 0BT: 0
    //S:99193   E:101111 D: 0BT: 7
   if(line.startsWith("return")) //S:99194   E:99510 D: 0BT: 1
   {
      QuicktestRunner.execPath += 64; //S:99274   E:0 D: 1BT: 0
      VarInfoTest rtnT = progTree.findMethodWithChar(lineNo).returnType; //S:99274   E:99335 D: 1BT: 0
      dataType = new VarInfoTest(rtnT.getTypeWithDims(), "rtnVal" , rtnT.startChar); //S:99347   E:99419 D: 1BT: 0
      isReturn = true; //S:99471   E:99486 D: 1BT: 0
   }
   else //S:99511   E:101111 D: 0BT: 2
   {
      String oper = ""; //S:99559   E:99575 D: 1BT: 0
      for(int i = 0;i<LineInfoTest.ASSIGNS.length;i ++) //S:99585   E:99742 D: 1BT: 0
      {
          //S:99652   E:99732 D: 2BT: 7
         if(line.indexOf(LineInfoTest.ASSIGNS[i])>- 1) //S:99653   E:99732 D: 2BT: 1
         {
            QuicktestRunner.execPath += 32; //S:99706   E:0 D: 3BT: 0
            oper = LineInfoTest.ASSIGNS[i]; //S:99706   E:99732 D: 3BT: 0
         }
      }
      String[]equ = line.split(oper); //S:99763   E:99794 D: 1BT: 0
      dataName = equ[0].trim(); //S:99806   E:99830 D: 1BT: 0
      String[]dots = dataName.split("\\."); //S:99896   E:99933 D: 1BT: 0
      String lastSection; //S:99945   E:99963 D: 1BT: 0
       //S:99974   E:100094 D: 1BT: 7
      if(dots.length == 0) //S:99975   E:100053 D: 1BT: 1
      {
         QuicktestRunner.execPath += 16; //S:100009   E:0 D: 2BT: 0
         lastSection = equ[0]; //S:100009   E:100029 D: 2BT: 0
      }
      else //S:100054   E:100094 D: 1BT: 2
      {
         lastSection = dots[dots.length - 1]; //S:100059   E:100094 D: 2BT: 0
      }
      lastSection = lastSection.trim(); //S:100106   E:100138 D: 1BT: 0
      String firstSection; //S:100150   E:100169 D: 1BT: 0
       //S:100180   E:100288 D: 1BT: 7
      if(dots.length == 0) //S:100181   E:100260 D: 1BT: 1
      {
         QuicktestRunner.execPath += 8; //S:100215   E:0 D: 2BT: 0
         firstSection = equ[0]; //S:100215   E:100236 D: 2BT: 0
      }
      else //S:100261   E:100288 D: 1BT: 2
      {
         firstSection = dots[0]; //S:100266   E:100288 D: 2BT: 0
      }
      firstSection = firstSection.trim(); //S:100300   E:100334 D: 1BT: 0
       //S:100356   E:100518 D: 1BT: 7
      if(firstSection.equals(lastSection)|| firstSection.equals("this")) //S:100357   E:100518 D: 1BT: 1
      {
         QuicktestRunner.execPath += 4; //S:100450   E:0 D: 2BT: 0
         fromClass = progTree.findClassWithChar(lineNo).className; //S:100450   E:100506 D: 2BT: 0
      }
      for(int i = 0;i<progTree.size();i ++) //S:100541   E:101102 D: 1BT: 0
      {
         ClassInfoTest ci = progTree.getClass(i); //S:100607   E:100642 D: 2BT: 0
         VarListTest vl = ci.vars; //S:100657   E:100677 D: 2BT: 0
         for(int j = 0;j<vl.size();j ++) //S:100692   E:101090 D: 2BT: 0
         {
             //S:100757   E:100932 D: 3BT: 7
            if(vl.getVar(j).getName().equals(firstSection)&& ! firstSection.equals(lastSection)) //S:100758   E:100932 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:100880   E:0 D: 4BT: 0
               fromClass = vl.getVar(j).getType(); //S:100880   E:100914 D: 4BT: 0
            }
             //S:100949   E:101075 D: 3BT: 7
            if(vl.getVar(j).getName().equals(lastSection)) //S:100950   E:101075 D: 3BT: 1
            {
               QuicktestRunner.execPath += 1; //S:101034   E:0 D: 4BT: 0
               dataType = vl.getVar(j); //S:101034   E:101057 D: 4BT: 0
            }
         }
      }
   }
   }

   public boolean equals(AssertionInfoTest ai)
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
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:101558 E:101615 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:101558 E:101615 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:101623 E:101768 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:101623 E:101768 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(ai.dataType.getName()== null) {S:101559 E:101615 D:0 BT: 1}
return false; {S:101603 E:101615 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(ai.dataType.getName()== null){} {S:101559 E:101615 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:101603 E:0 D:1 BT: 0}
return false; {S:101603 E:101615 D:1 BT: 0}
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
if(dataType.getName().equals(ai.dataType.getName())&& fromClass.equals(ai.fromClass))else return false; {S:101624 E:101750 D:0 BT: 1}
return true; {S:101721 E:101732 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(dataType.getName().equals(ai.dataType.getName())&& fromClass.equals(ai.fromClass)){} {S:101624 E:101750 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:101721 E:0 D:1 BT: 0}
return true; {S:101721 E:101732 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#7(3) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:101751 E:101768 D:0 BT: 2}
return false; {S:101756 E:101768 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:101751 E:101768 D:0 BT: 2}
return false; {S:101756 E:101768 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:101558 E:101615 D:0 BT: 7}
if(ai.dataType.getName()== null){} {S:101559 E:101615 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:101603 E:0 D:1 BT: 0}
return false; {S:101603 E:101615 D:1 BT: 0}
 {S:101623 E:101768 D:0 BT: 7}
if(dataType.getName().equals(ai.dataType.getName())&& fromClass.equals(ai.fromClass)){} {S:101624 E:101750 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:101721 E:0 D:1 BT: 0}
return true; {S:101721 E:101732 D:1 BT: 0}
else{} {S:101751 E:101768 D:0 BT: 2}
return false; {S:101756 E:101768 D:1 BT: 0}
****************************/
    //S:101558   E:101615 D: 0BT: 7
   if(ai.dataType.getName()== null) //S:101559   E:101615 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:101603   E:0 D: 1BT: 0
      return false; //S:101603   E:101615 D: 1BT: 0
   }
    //S:101623   E:101768 D: 0BT: 7
   if(dataType.getName().equals(ai.dataType.getName())&& fromClass.equals(ai.fromClass)) //S:101624   E:101750 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:101721   E:0 D: 1BT: 0
      return true; //S:101721   E:101732 D: 1BT: 0
   }
   else //S:101751   E:101768 D: 0BT: 2
   {
      return false; //S:101756   E:101768 D: 1BT: 0
   }
   }

   public String outputLine(String tab)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
String[]primitives ={"int" , "float" , "double" , "boolean" , "long"}; {S:101833 E:101900 D:0 BT: 0}
String typeString = "(" + dataType.getType()+ ")"; {S:101907 E:101957 D:0 BT: 0}
String valueString = expValue; {S:101964 E:101993 D:0 BT: 0}
boolean isPrimitive = false; {S:102000 E:102027 D:0 BT: 0}
for(int i = 0;i<primitives.length;i ++){} {S:102034 E:102207 D:0 BT: 0}
String rtnVal = tab + "Assert.areEqual(" + dataType.getName()+ ", " + typeString + " " + expValue + ");  // line:" + line + " fromClass:" + fromClass; {S:102266 E:102416 D:0 BT: 0}
return rtnVal; {S:102423 E:102436 D:0 BT: 0}
****************************/
/***************************
Processing list:
String[]primitives ={"int" , "float" , "double" , "boolean" , "long"}; {S:101833 E:101900 D:0 BT: 0}
String typeString = "(" + dataType.getType()+ ")"; {S:101907 E:101957 D:0 BT: 0}
String valueString = expValue; {S:101964 E:101993 D:0 BT: 0}
boolean isPrimitive = false; {S:102000 E:102027 D:0 BT: 0}
for(int i = 0;i<primitives.length;i ++){} {S:102034 E:102207 D:0 BT: 0}
String rtnVal = tab + "Assert.areEqual(" + dataType.getName()+ ", " + typeString + " " + expValue + ");  // line:" + line + " fromClass:" + fromClass; {S:102266 E:102416 D:0 BT: 0}
return rtnVal; {S:102423 E:102436 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:102089 E:102200 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:102089 E:102200 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(dataType.getType().equals(primitives[i])){} {S:102090 E:102200 D:1 BT: 1}
typeString = ""; {S:102150 E:102165 D:2 BT: 0}
isPrimitive = true; {S:102174 E:102192 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(dataType.getType().equals(primitives[i])){} {S:102090 E:102200 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:102150 E:0 D:2 BT: 0}
typeString = ""; {S:102150 E:102165 D:2 BT: 0}
isPrimitive = true; {S:102174 E:102192 D:2 BT: 0}
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
String[]primitives ={"int" , "float" , "double" , "boolean" , "long"}; {S:101833 E:101900 D:0 BT: 0}
String typeString = "(" + dataType.getType()+ ")"; {S:101907 E:101957 D:0 BT: 0}
String valueString = expValue; {S:101964 E:101993 D:0 BT: 0}
boolean isPrimitive = false; {S:102000 E:102027 D:0 BT: 0}
for(int i = 0;i<primitives.length;i ++){} {S:102034 E:102207 D:0 BT: 0}
 {S:102089 E:102200 D:1 BT: 7}
if(dataType.getType().equals(primitives[i])){} {S:102090 E:102200 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:102150 E:0 D:2 BT: 0}
typeString = ""; {S:102150 E:102165 D:2 BT: 0}
isPrimitive = true; {S:102174 E:102192 D:2 BT: 0}
String rtnVal = tab + "Assert.areEqual(" + dataType.getName()+ ", " + typeString + " " + expValue + ");  // line:" + line + " fromClass:" + fromClass; {S:102266 E:102416 D:0 BT: 0}
return rtnVal; {S:102423 E:102436 D:0 BT: 0}
****************************/
   String[]primitives ={"int" , "float" , "double" , "boolean" , "long"}; //S:101833   E:101900 D: 0BT: 0
   String typeString = "(" + dataType.getType()+ ")"; //S:101907   E:101957 D: 0BT: 0
   String valueString = expValue; //S:101964   E:101993 D: 0BT: 0
   boolean isPrimitive = false; //S:102000   E:102027 D: 0BT: 0
   for(int i = 0;i<primitives.length;i ++) //S:102034   E:102207 D: 0BT: 0
   {
       //S:102089   E:102200 D: 1BT: 7
      if(dataType.getType().equals(primitives[i])) //S:102090   E:102200 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:102150   E:0 D: 2BT: 0
         typeString = ""; //S:102150   E:102165 D: 2BT: 0
         isPrimitive = true; //S:102174   E:102192 D: 2BT: 0
      }
   }
   String rtnVal = tab + "Assert.areEqual(" + dataType.getName()+ ", " + typeString + " " + expValue + ");  // line:" + line + " fromClass:" + fromClass; //S:102266   E:102416 D: 0BT: 0
   return rtnVal; //S:102423   E:102436 D: 0BT: 0
   }

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

