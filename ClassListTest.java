import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class ClassListTest extends LinkedList
{
   public LineListTest staticContext;
   public LangConfig lang;

   ClassListTest()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
super(); {S:7458 E:7465 D:0 BT: 0}
staticContext = new LineListTest(); {S:7470 E:7500 D:0 BT: 0}
lang = new LangConfig(); {S:7505 E:7528 D:0 BT: 0}
****************************/
/***************************
Processing list:
super(); {S:7458 E:7465 D:0 BT: 0}
staticContext = new LineListTest(); {S:7470 E:7500 D:0 BT: 0}
lang = new LangConfig(); {S:7505 E:7528 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
super(); {S:7458 E:7465 D:0 BT: 0}
staticContext = new LineListTest(); {S:7470 E:7500 D:0 BT: 0}
lang = new LangConfig(); {S:7505 E:7528 D:0 BT: 0}
****************************/
   super(); //S:7458   E:7465 D: 0BT: 0
   staticContext = new LineListTest(); //S:7470   E:7500 D: 0BT: 0
   lang = new LangConfig(); //S:7505   E:7528 D: 0BT: 0
   }

   public ClassInfoTest getClass(int index)
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
 {S:7590 E:7726 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:7590 E:7726 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(index<size()){ {S:7591 E:7688 D:0 BT: 1}
return(ClassInfoTest)super.get(index); {S:7629 E:7664 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(index<size()){} {S:7591 E:7688 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:7629 E:0 D:1 BT: 0}
return(ClassInfoTest)super.get(index); {S:7629 E:7664 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:7689 E:7726 D:0 BT: 2}
return null; {S:7706 E:7717 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:7689 E:7726 D:0 BT: 2}
return null; {S:7706 E:7717 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:7590 E:7726 D:0 BT: 7}
if(index<size()){} {S:7591 E:7688 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:7629 E:0 D:1 BT: 0}
return(ClassInfoTest)super.get(index); {S:7629 E:7664 D:1 BT: 0}
else{} {S:7689 E:7726 D:0 BT: 2}
return null; {S:7706 E:7717 D:1 BT: 0}
****************************/
    //S:7590   E:7726 D: 0BT: 7
   if(index<size()) //S:7591   E:7688 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:7629   E:0 D: 1BT: 0
      return(ClassInfoTest)super.get(index); //S:7629   E:7664 D: 1BT: 0
   }
   else //S:7689   E:7726 D: 0BT: 2
   {
      return null; //S:7706   E:7717 D: 1BT: 0
   }
   }

   public ClassInfoTest getFirstClass()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(ClassInfoTest)super.getFirst(); {S:7786 E:7821 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(ClassInfoTest)super.getFirst(); {S:7786 E:7821 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(ClassInfoTest)super.getFirst(); {S:7786 E:7821 D:0 BT: 0}
****************************/
   return(ClassInfoTest)super.getFirst(); //S:7786   E:7821 D: 0BT: 0
   }

   public ClassInfoTest getLastClass()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(ClassInfoTest)super.getLast(); {S:7880 E:7914 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(ClassInfoTest)super.getLast(); {S:7880 E:7914 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(ClassInfoTest)super.getLast(); {S:7880 E:7914 D:0 BT: 0}
****************************/
   return(ClassInfoTest)super.getLast(); //S:7880   E:7914 D: 0BT: 0
   }

   public ClassInfoTest findLastOpenClass()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
ClassInfoTest last = null; {S:7978 E:7999 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:8008 E:8149 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:8059 E:8085 D:1 BT: 0}
</sublist>
return(last); {S:8158 E:8170 D:0 BT: 0}
****************************/
/***************************
Processing list:
ClassInfoTest last = null; {S:7978 E:7999 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:8008 E:8149 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:8059 E:8085 D:1 BT: 0}
</sublist>
return(last); {S:8158 E:8170 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:8096 E:8140 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:8096 E:8140 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(ci.endLine == - 1) {S:8097 E:8140 D:1 BT: 1}
last = ci; {S:8131 E:8140 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ci.endLine == - 1){} {S:8097 E:8140 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:8131 E:0 D:2 BT: 0}
last = ci; {S:8131 E:8140 D:2 BT: 0}
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
ClassInfoTest last = null; {S:7978 E:7999 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:8008 E:8149 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:8059 E:8085 D:1 BT: 0}
</sublist>
ClassInfoTest ci = getClass(i); {S:8059 E:8085 D:1 BT: 0}
 {S:8096 E:8140 D:1 BT: 7}
if(ci.endLine == - 1){} {S:8097 E:8140 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:8131 E:0 D:2 BT: 0}
last = ci; {S:8131 E:8140 D:2 BT: 0}
return(last); {S:8158 E:8170 D:0 BT: 0}
****************************/
   ClassInfoTest last = null; //S:7978   E:7999 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:8008   E:8149 D: 0BT: 0
   {
      ClassInfoTest ci = getClass(i); //S:8059   E:8085 D: 1BT: 0
       //S:8096   E:8140 D: 1BT: 7
      if(ci.endLine == - 1) //S:8097   E:8140 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:8131   E:0 D: 2BT: 0
         last = ci; //S:8131   E:8140 D: 2BT: 0
      }
   }
   return(last); //S:8158   E:8170 D: 0BT: 0
   }

   public ClassInfoTest findClassWithLine(int line)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:8242 E:8431 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:8293 E:8319 D:1 BT: 0}
</sublist>
return null; {S:8440 E:8451 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:8242 E:8431 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:8293 E:8319 D:1 BT: 0}
</sublist>
return null; {S:8440 E:8451 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:8330 E:8422 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:8330 E:8422 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(ci.startLine<line && ci.endLine>line){} {S:8331 E:8422 D:1 BT: 1}
return ci; {S:8401 E:8410 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ci.startLine<line && ci.endLine>line){} {S:8331 E:8422 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:8401 E:0 D:2 BT: 0}
return ci; {S:8401 E:8410 D:2 BT: 0}
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
for(int i = 0;i<size();i ++){} {S:8242 E:8431 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:8293 E:8319 D:1 BT: 0}
</sublist>
ClassInfoTest ci = getClass(i); {S:8293 E:8319 D:1 BT: 0}
 {S:8330 E:8422 D:1 BT: 7}
if(ci.startLine<line && ci.endLine>line){} {S:8331 E:8422 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:8401 E:0 D:2 BT: 0}
return ci; {S:8401 E:8410 D:2 BT: 0}
return null; {S:8440 E:8451 D:0 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:8242   E:8431 D: 0BT: 0
   {
      ClassInfoTest ci = getClass(i); //S:8293   E:8319 D: 1BT: 0
       //S:8330   E:8422 D: 1BT: 7
      if(ci.startLine<line && ci.endLine>line) //S:8331   E:8422 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:8401   E:0 D: 2BT: 0
         return ci; //S:8401   E:8410 D: 2BT: 0
      }
   }
   return null; //S:8440   E:8451 D: 0BT: 0
   }

   public MethodInfoTest findMethodWithLine(int line)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:3 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:8525 E:8950 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:8576 E:8602 D:1 BT: 0}
</sublist>
return(null); {S:8959 E:8971 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:8525 E:8950 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:8576 E:8602 D:1 BT: 0}
</sublist>
return(null); {S:8959 E:8971 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:8613 E:8941 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:8613 E:8941 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(ci.startLine<line && ci.endLine>line){} {S:8614 E:8941 D:1 BT: 1}
MethodListTest ml = ci.methods; {S:8684 E:8710 D:2 BT: 0}
for(int j = 0;j<ml.size();j ++){} {S:8725 E:8929 D:2 BT: 0}
<sublist>
MethodInfoTest mi = ml.getMethod(j); {S:8791 E:8822 D:3 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(ci.startLine<line && ci.endLine>line){} {S:8614 E:8941 D:1 BT: 1}
MethodListTest ml = ci.methods; {S:8684 E:8710 D:2 BT: 0}
for(int j = 0;j<ml.size();j ++){} {S:8725 E:8929 D:2 BT: 0}
<sublist>
MethodInfoTest mi = ml.getMethod(j); {S:8791 E:8822 D:3 BT: 0}
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
 {S:8839 E:8914 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:8839 E:8914 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(mi.startLine<line && mi.endLine>line) {S:8840 E:8914 D:3 BT: 1}
return(mi); {S:8904 E:8914 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(mi.startLine<line && mi.endLine>line){} {S:8840 E:8914 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:8904 E:0 D:4 BT: 0}
return(mi); {S:8904 E:8914 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:8914 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 1; {S:8915 E:0 D:4 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:8525 E:8950 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:8576 E:8602 D:1 BT: 0}
</sublist>
ClassInfoTest ci = getClass(i); {S:8576 E:8602 D:1 BT: 0}
 {S:8613 E:8941 D:1 BT: 7}
if(ci.startLine<line && ci.endLine>line){} {S:8614 E:8941 D:1 BT: 1}
MethodListTest ml = ci.methods; {S:8684 E:8710 D:2 BT: 0}
for(int j = 0;j<ml.size();j ++){} {S:8725 E:8929 D:2 BT: 0}
<sublist>
MethodInfoTest mi = ml.getMethod(j); {S:8791 E:8822 D:3 BT: 0}
</sublist>
MethodInfoTest mi = ml.getMethod(j); {S:8791 E:8822 D:3 BT: 0}
 {S:8839 E:8914 D:3 BT: 7}
if(mi.startLine<line && mi.endLine>line){} {S:8840 E:8914 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:8904 E:0 D:4 BT: 0}
return(mi); {S:8904 E:8914 D:4 BT: 0}
else {S:8914 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 1; {S:8915 E:0 D:4 BT: 0}
return(null); {S:8959 E:8971 D:0 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:8525   E:8950 D: 0BT: 0
   {
      ClassInfoTest ci = getClass(i); //S:8576   E:8602 D: 1BT: 0
       //S:8613   E:8941 D: 1BT: 7
      if(ci.startLine<line && ci.endLine>line) //S:8614   E:8941 D: 1BT: 1
      {
         MethodListTest ml = ci.methods; //S:8684   E:8710 D: 2BT: 0
         for(int j = 0;j<ml.size();j ++) //S:8725   E:8929 D: 2BT: 0
         {
            MethodInfoTest mi = ml.getMethod(j); //S:8791   E:8822 D: 3BT: 0
             //S:8839   E:8914 D: 3BT: 7
            if(mi.startLine<line && mi.endLine>line) //S:8840   E:8914 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:8904   E:0 D: 4BT: 0
               return(mi); //S:8904   E:8914 D: 4BT: 0
            }
            else //S:8914   E:0 D: 3BT: 0
            {
               QuicktestRunner.execPath += 1; //S:8915   E:0 D: 4BT: 0
            }
         }
      }
   }
   return(null); //S:8959   E:8971 D: 0BT: 0
   }

   public void save(String filename)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String outString = ""; {S:9032 E:9053 D:0 BT: 0}
try{} {S:9062 E:10060 D:0 BT: 0}
<sublist>
BufferedWriter out = new BufferedWriter(new FileWriter(filename)); {S:9086 E:9151 D:1 BT: 0}
for(int i = 0;i<size();i ++){} {S:9163 E:9987 D:1 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:9220 E:9246 D:2 BT: 0}
outString += "class " + ci.className + "\n{"; {S:9261 E:9305 D:2 BT: 0}
for(int j = 0;j<ci.vars.size();j ++){} {S:9320 E:9516 D:2 BT: 0}
<sublist>
VarInfoTest vi = ci.vars.getVar(j); {S:9391 E:9421 D:3 BT: 0}
outString += "   " + vi.getType()+ " " + vi.getName()+ ";\n"; {S:9439 E:9501 D:3 BT: 0}
</sublist>
outString += "\n"; {S:9531 E:9548 D:2 BT: 0}
for(int j = 0;j<ci.methods.size();j ++){} {S:9563 E:9943 D:2 BT: 0}
<sublist>
MethodInfoTest mi = ci.methods.getMethod(j); {S:9637 E:9676 D:3 BT: 0}
for(int k = 0;k<mi.allLines.size();k ++)outString += mi.allLines.outputWTDepth("   " , false); {S:9694 E:9807 D:3 BT: 0}
</sublist>
outString += "\n"; {S:9958 E:9975 D:2 BT: 0}
</sublist>
out.write(outString); {S:9999 E:10019 D:1 BT: 0}
out.close(); {S:10031 E:10042 D:1 BT: 0}
</sublist>
catch(IOException e){} {S:10061 E:10195 D:0 BT: 0}
<sublist>
System.err.println(e.getMessage()); {S:10103 E:10137 D:1 BT: 0}
System.err.println(e.getStackTrace()); {S:10149 E:10186 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
String outString = ""; {S:9032 E:9053 D:0 BT: 0}
try{} {S:9062 E:10060 D:0 BT: 0}
<sublist>
BufferedWriter out = new BufferedWriter(new FileWriter(filename)); {S:9086 E:9151 D:1 BT: 0}
for(int i = 0;i<size();i ++){} {S:9163 E:9987 D:1 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:9220 E:9246 D:2 BT: 0}
outString += "class " + ci.className + "\n{"; {S:9261 E:9305 D:2 BT: 0}
for(int j = 0;j<ci.vars.size();j ++){} {S:9320 E:9516 D:2 BT: 0}
<sublist>
VarInfoTest vi = ci.vars.getVar(j); {S:9391 E:9421 D:3 BT: 0}
outString += "   " + vi.getType()+ " " + vi.getName()+ ";\n"; {S:9439 E:9501 D:3 BT: 0}
</sublist>
outString += "\n"; {S:9531 E:9548 D:2 BT: 0}
for(int j = 0;j<ci.methods.size();j ++){} {S:9563 E:9943 D:2 BT: 0}
<sublist>
MethodInfoTest mi = ci.methods.getMethod(j); {S:9637 E:9676 D:3 BT: 0}
for(int k = 0;k<mi.allLines.size();k ++)outString += mi.allLines.outputWTDepth("   " , false); {S:9694 E:9807 D:3 BT: 0}
</sublist>
outString += "\n"; {S:9958 E:9975 D:2 BT: 0}
</sublist>
out.write(outString); {S:9999 E:10019 D:1 BT: 0}
out.close(); {S:10031 E:10042 D:1 BT: 0}
</sublist>
catch(IOException e){} {S:10061 E:10195 D:0 BT: 0}
<sublist>
System.err.println(e.getMessage()); {S:10103 E:10137 D:1 BT: 0}
System.err.println(e.getStackTrace()); {S:10149 E:10186 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String outString = ""; {S:9032 E:9053 D:0 BT: 0}
try{} {S:9062 E:10060 D:0 BT: 0}
<sublist>
BufferedWriter out = new BufferedWriter(new FileWriter(filename)); {S:9086 E:9151 D:1 BT: 0}
for(int i = 0;i<size();i ++){} {S:9163 E:9987 D:1 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:9220 E:9246 D:2 BT: 0}
outString += "class " + ci.className + "\n{"; {S:9261 E:9305 D:2 BT: 0}
for(int j = 0;j<ci.vars.size();j ++){} {S:9320 E:9516 D:2 BT: 0}
<sublist>
VarInfoTest vi = ci.vars.getVar(j); {S:9391 E:9421 D:3 BT: 0}
outString += "   " + vi.getType()+ " " + vi.getName()+ ";\n"; {S:9439 E:9501 D:3 BT: 0}
</sublist>
outString += "\n"; {S:9531 E:9548 D:2 BT: 0}
for(int j = 0;j<ci.methods.size();j ++){} {S:9563 E:9943 D:2 BT: 0}
<sublist>
MethodInfoTest mi = ci.methods.getMethod(j); {S:9637 E:9676 D:3 BT: 0}
for(int k = 0;k<mi.allLines.size();k ++)outString += mi.allLines.outputWTDepth("   " , false); {S:9694 E:9807 D:3 BT: 0}
</sublist>
outString += "\n"; {S:9958 E:9975 D:2 BT: 0}
</sublist>
out.write(outString); {S:9999 E:10019 D:1 BT: 0}
out.close(); {S:10031 E:10042 D:1 BT: 0}
</sublist>
BufferedWriter out = new BufferedWriter(new FileWriter(filename)); {S:9086 E:9151 D:1 BT: 0}
for(int i = 0;i<size();i ++){} {S:9163 E:9987 D:1 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:9220 E:9246 D:2 BT: 0}
outString += "class " + ci.className + "\n{"; {S:9261 E:9305 D:2 BT: 0}
for(int j = 0;j<ci.vars.size();j ++){} {S:9320 E:9516 D:2 BT: 0}
<sublist>
VarInfoTest vi = ci.vars.getVar(j); {S:9391 E:9421 D:3 BT: 0}
outString += "   " + vi.getType()+ " " + vi.getName()+ ";\n"; {S:9439 E:9501 D:3 BT: 0}
</sublist>
outString += "\n"; {S:9531 E:9548 D:2 BT: 0}
for(int j = 0;j<ci.methods.size();j ++){} {S:9563 E:9943 D:2 BT: 0}
<sublist>
MethodInfoTest mi = ci.methods.getMethod(j); {S:9637 E:9676 D:3 BT: 0}
for(int k = 0;k<mi.allLines.size();k ++)outString += mi.allLines.outputWTDepth("   " , false); {S:9694 E:9807 D:3 BT: 0}
</sublist>
outString += "\n"; {S:9958 E:9975 D:2 BT: 0}
</sublist>
ClassInfoTest ci = getClass(i); {S:9220 E:9246 D:2 BT: 0}
outString += "class " + ci.className + "\n{"; {S:9261 E:9305 D:2 BT: 0}
for(int j = 0;j<ci.vars.size();j ++){} {S:9320 E:9516 D:2 BT: 0}
<sublist>
VarInfoTest vi = ci.vars.getVar(j); {S:9391 E:9421 D:3 BT: 0}
outString += "   " + vi.getType()+ " " + vi.getName()+ ";\n"; {S:9439 E:9501 D:3 BT: 0}
</sublist>
VarInfoTest vi = ci.vars.getVar(j); {S:9391 E:9421 D:3 BT: 0}
outString += "   " + vi.getType()+ " " + vi.getName()+ ";\n"; {S:9439 E:9501 D:3 BT: 0}
outString += "\n"; {S:9531 E:9548 D:2 BT: 0}
for(int j = 0;j<ci.methods.size();j ++){} {S:9563 E:9943 D:2 BT: 0}
<sublist>
MethodInfoTest mi = ci.methods.getMethod(j); {S:9637 E:9676 D:3 BT: 0}
for(int k = 0;k<mi.allLines.size();k ++)outString += mi.allLines.outputWTDepth("   " , false); {S:9694 E:9807 D:3 BT: 0}
</sublist>
MethodInfoTest mi = ci.methods.getMethod(j); {S:9637 E:9676 D:3 BT: 0}
for(int k = 0;k<mi.allLines.size();k ++)outString += mi.allLines.outputWTDepth("   " , false); {S:9694 E:9807 D:3 BT: 0}
outString += "\n"; {S:9958 E:9975 D:2 BT: 0}
out.write(outString); {S:9999 E:10019 D:1 BT: 0}
out.close(); {S:10031 E:10042 D:1 BT: 0}
catch(IOException e){} {S:10061 E:10195 D:0 BT: 0}
<sublist>
System.err.println(e.getMessage()); {S:10103 E:10137 D:1 BT: 0}
System.err.println(e.getStackTrace()); {S:10149 E:10186 D:1 BT: 0}
</sublist>
System.err.println(e.getMessage()); {S:10103 E:10137 D:1 BT: 0}
System.err.println(e.getStackTrace()); {S:10149 E:10186 D:1 BT: 0}
****************************/
   String outString = ""; //S:9032   E:9053 D: 0BT: 0
   try //S:9062   E:10060 D: 0BT: 0
   {
      BufferedWriter out = new BufferedWriter(new FileWriter(filename)); //S:9086   E:9151 D: 1BT: 0
      for(int i = 0;i<size();i ++) //S:9163   E:9987 D: 1BT: 0
      {
         ClassInfoTest ci = getClass(i); //S:9220   E:9246 D: 2BT: 0
         outString += "class " + ci.className + "\n{"; //S:9261   E:9305 D: 2BT: 0
         for(int j = 0;j<ci.vars.size();j ++) //S:9320   E:9516 D: 2BT: 0
         {
            VarInfoTest vi = ci.vars.getVar(j); //S:9391   E:9421 D: 3BT: 0
            outString += "   " + vi.getType()+ " " + vi.getName()+ ";\n"; //S:9439   E:9501 D: 3BT: 0
         }
         outString += "\n"; //S:9531   E:9548 D: 2BT: 0
         for(int j = 0;j<ci.methods.size();j ++) //S:9563   E:9943 D: 2BT: 0
         {
            MethodInfoTest mi = ci.methods.getMethod(j); //S:9637   E:9676 D: 3BT: 0
            for(int k = 0;k<mi.allLines.size();k ++)outString += mi.allLines.outputWTDepth("   " , false); //S:9694   E:9807 D: 3BT: 0
         }
         outString += "\n"; //S:9958   E:9975 D: 2BT: 0
      }
      out.write(outString); //S:9999   E:10019 D: 1BT: 0
      out.close(); //S:10031   E:10042 D: 1BT: 0
   }
   catch(IOException e) //S:10061   E:10195 D: 0BT: 0
   {
      System.err.println(e.getMessage()); //S:10103   E:10137 D: 1BT: 0
      System.err.println(e.getStackTrace()); //S:10149   E:10186 D: 1BT: 0
   }
   }

   public MethodInfoTest findMethodForTest(TestInfoTest ti)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return ti.getAssocMethod(); {S:10371 E:10397 D:0 BT: 0}
****************************/
/***************************
Processing list:
return ti.getAssocMethod(); {S:10371 E:10397 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return ti.getAssocMethod(); {S:10371 E:10397 D:0 BT: 0}
****************************/
   return ti.getAssocMethod(); //S:10371   E:10397 D: 0BT: 0
   }

   public ClassInfoTest findClassWithMethod(MethodInfoTest mi)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:10476 E:10772 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:10527 E:10553 D:1 BT: 0}
MethodListTest ml = ci.methods; {S:10565 E:10591 D:1 BT: 0}
for(int j = 0;j<ml.size();j ++){} {S:10603 E:10763 D:1 BT: 0}
<sublist>
MethodInfoTest miIn = ml.getMethod(j); {S:10663 E:10696 D:2 BT: 0}
</sublist>
</sublist>
return(null); {S:10781 E:10793 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:10476 E:10772 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:10527 E:10553 D:1 BT: 0}
MethodListTest ml = ci.methods; {S:10565 E:10591 D:1 BT: 0}
for(int j = 0;j<ml.size();j ++){} {S:10603 E:10763 D:1 BT: 0}
<sublist>
MethodInfoTest miIn = ml.getMethod(j); {S:10663 E:10696 D:2 BT: 0}
</sublist>
</sublist>
return(null); {S:10781 E:10793 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:10710 E:10751 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:10710 E:10751 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(mi == miIn) {S:10711 E:10751 D:2 BT: 1}
return ci; {S:10742 E:10751 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(mi == miIn){} {S:10711 E:10751 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:10742 E:0 D:3 BT: 0}
return ci; {S:10742 E:10751 D:3 BT: 0}
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
for(int i = 0;i<size();i ++){} {S:10476 E:10772 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:10527 E:10553 D:1 BT: 0}
MethodListTest ml = ci.methods; {S:10565 E:10591 D:1 BT: 0}
for(int j = 0;j<ml.size();j ++){} {S:10603 E:10763 D:1 BT: 0}
<sublist>
MethodInfoTest miIn = ml.getMethod(j); {S:10663 E:10696 D:2 BT: 0}
</sublist>
</sublist>
ClassInfoTest ci = getClass(i); {S:10527 E:10553 D:1 BT: 0}
MethodListTest ml = ci.methods; {S:10565 E:10591 D:1 BT: 0}
for(int j = 0;j<ml.size();j ++){} {S:10603 E:10763 D:1 BT: 0}
<sublist>
MethodInfoTest miIn = ml.getMethod(j); {S:10663 E:10696 D:2 BT: 0}
</sublist>
MethodInfoTest miIn = ml.getMethod(j); {S:10663 E:10696 D:2 BT: 0}
 {S:10710 E:10751 D:2 BT: 7}
if(mi == miIn){} {S:10711 E:10751 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:10742 E:0 D:3 BT: 0}
return ci; {S:10742 E:10751 D:3 BT: 0}
return(null); {S:10781 E:10793 D:0 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:10476   E:10772 D: 0BT: 0
   {
      ClassInfoTest ci = getClass(i); //S:10527   E:10553 D: 1BT: 0
      MethodListTest ml = ci.methods; //S:10565   E:10591 D: 1BT: 0
      for(int j = 0;j<ml.size();j ++) //S:10603   E:10763 D: 1BT: 0
      {
         MethodInfoTest miIn = ml.getMethod(j); //S:10663   E:10696 D: 2BT: 0
          //S:10710   E:10751 D: 2BT: 7
         if(mi == miIn) //S:10711   E:10751 D: 2BT: 1
         {
            QuicktestRunner.execPath += 1; //S:10742   E:0 D: 3BT: 0
            return ci; //S:10742   E:10751 D: 3BT: 0
         }
      }
   }
   return(null); //S:10781   E:10793 D: 0BT: 0
   }

   public ClassInfoTest findClassWithName(String in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:10866 E:11014 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:10917 E:10943 D:1 BT: 0}
</sublist>
return null; {S:11023 E:11034 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:10866 E:11014 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:10917 E:10943 D:1 BT: 0}
</sublist>
return null; {S:11023 E:11034 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:10954 E:11005 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:10954 E:11005 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(ci.className.equals(in)) {S:10955 E:11005 D:1 BT: 1}
return ci; {S:10996 E:11005 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ci.className.equals(in)){} {S:10955 E:11005 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:10996 E:0 D:2 BT: 0}
return ci; {S:10996 E:11005 D:2 BT: 0}
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
for(int i = 0;i<size();i ++){} {S:10866 E:11014 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:10917 E:10943 D:1 BT: 0}
</sublist>
ClassInfoTest ci = getClass(i); {S:10917 E:10943 D:1 BT: 0}
 {S:10954 E:11005 D:1 BT: 7}
if(ci.className.equals(in)){} {S:10955 E:11005 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:10996 E:0 D:2 BT: 0}
return ci; {S:10996 E:11005 D:2 BT: 0}
return null; {S:11023 E:11034 D:0 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:10866   E:11014 D: 0BT: 0
   {
      ClassInfoTest ci = getClass(i); //S:10917   E:10943 D: 1BT: 0
       //S:10954   E:11005 D: 1BT: 7
      if(ci.className.equals(in)) //S:10955   E:11005 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:10996   E:0 D: 2BT: 0
         return ci; //S:10996   E:11005 D: 2BT: 0
      }
   }
   return null; //S:11023   E:11034 D: 0BT: 0
   }

   public ClassInfoTest findClassWithChar(int in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:11105 E:11249 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:11150 E:11176 D:1 BT: 0}
</sublist>
return null; {S:11256 E:11267 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:11105 E:11249 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:11150 E:11176 D:1 BT: 0}
</sublist>
return null; {S:11256 E:11267 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:11183 E:11242 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:11183 E:11242 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(ci.startChar<= in && ci.endChar>in) {S:11184 E:11242 D:1 BT: 1}
return ci; {S:11233 E:11242 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ci.startChar<= in && ci.endChar>in){} {S:11184 E:11242 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:11233 E:0 D:2 BT: 0}
return ci; {S:11233 E:11242 D:2 BT: 0}
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
for(int i = 0;i<size();i ++){} {S:11105 E:11249 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:11150 E:11176 D:1 BT: 0}
</sublist>
ClassInfoTest ci = getClass(i); {S:11150 E:11176 D:1 BT: 0}
 {S:11183 E:11242 D:1 BT: 7}
if(ci.startChar<= in && ci.endChar>in){} {S:11184 E:11242 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:11233 E:0 D:2 BT: 0}
return ci; {S:11233 E:11242 D:2 BT: 0}
return null; {S:11256 E:11267 D:0 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:11105   E:11249 D: 0BT: 0
   {
      ClassInfoTest ci = getClass(i); //S:11150   E:11176 D: 1BT: 0
       //S:11183   E:11242 D: 1BT: 7
      if(ci.startChar<= in && ci.endChar>in) //S:11184   E:11242 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:11233   E:0 D: 2BT: 0
         return ci; //S:11233   E:11242 D: 2BT: 0
      }
   }
   return null; //S:11256   E:11267 D: 0BT: 0
   }

   public MethodInfoTest findMethodWithChar(int in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:3 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:11340 E:11794 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:11385 E:11411 D:1 BT: 0}
</sublist>
return null; {S:11807 E:11818 D:0 BT: 0}
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:11340 E:11794 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:11385 E:11411 D:1 BT: 0}
</sublist>
return null; {S:11807 E:11818 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:11418 E:11787 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:11418 E:11787 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(ci.startChar<= in && ci.endChar>in){} {S:11419 E:11787 D:1 BT: 1}
for(int j = 0;j<ci.methods.size();j ++){} {S:11601 E:11779 D:2 BT: 0}
<sublist>
MethodInfoTest mi = ci.methods.getMethod(j); {S:11661 E:11700 D:3 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(ci.startChar<= in && ci.endChar>in){} {S:11419 E:11787 D:1 BT: 1}
for(int j = 0;j<ci.methods.size();j ++){} {S:11601 E:11779 D:2 BT: 0}
<sublist>
MethodInfoTest mi = ci.methods.getMethod(j); {S:11661 E:11700 D:3 BT: 0}
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
 {S:11709 E:11770 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:11709 E:11770 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(mi.startChar<= in && mi.endChar>in) {S:11710 E:11770 D:3 BT: 1}
return mi; {S:11761 E:11770 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(mi.startChar<= in && mi.endChar>in){} {S:11710 E:11770 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:11761 E:0 D:4 BT: 0}
return mi; {S:11761 E:11770 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:11770 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 1; {S:11771 E:0 D:4 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:11340 E:11794 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:11385 E:11411 D:1 BT: 0}
</sublist>
ClassInfoTest ci = getClass(i); {S:11385 E:11411 D:1 BT: 0}
 {S:11418 E:11787 D:1 BT: 7}
if(ci.startChar<= in && ci.endChar>in){} {S:11419 E:11787 D:1 BT: 1}
for(int j = 0;j<ci.methods.size();j ++){} {S:11601 E:11779 D:2 BT: 0}
<sublist>
MethodInfoTest mi = ci.methods.getMethod(j); {S:11661 E:11700 D:3 BT: 0}
</sublist>
MethodInfoTest mi = ci.methods.getMethod(j); {S:11661 E:11700 D:3 BT: 0}
 {S:11709 E:11770 D:3 BT: 7}
if(mi.startChar<= in && mi.endChar>in){} {S:11710 E:11770 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:11761 E:0 D:4 BT: 0}
return mi; {S:11761 E:11770 D:4 BT: 0}
else {S:11770 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 1; {S:11771 E:0 D:4 BT: 0}
return null; {S:11807 E:11818 D:0 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:11340   E:11794 D: 0BT: 0
   {
      ClassInfoTest ci = getClass(i); //S:11385   E:11411 D: 1BT: 0
       //S:11418   E:11787 D: 1BT: 7
      if(ci.startChar<= in && ci.endChar>in) //S:11419   E:11787 D: 1BT: 1
      {
         for(int j = 0;j<ci.methods.size();j ++) //S:11601   E:11779 D: 2BT: 0
         {
            MethodInfoTest mi = ci.methods.getMethod(j); //S:11661   E:11700 D: 3BT: 0
             //S:11709   E:11770 D: 3BT: 7
            if(mi.startChar<= in && mi.endChar>in) //S:11710   E:11770 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:11761   E:0 D: 4BT: 0
               return mi; //S:11761   E:11770 D: 4BT: 0
            }
            else //S:11770   E:0 D: 3BT: 0
            {
               QuicktestRunner.execPath += 1; //S:11771   E:0 D: 4BT: 0
            }
         }
      }
   }
   return null; //S:11807   E:11818 D: 0BT: 0
   }

   public void output()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:11867 E:12181 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:11912 E:11938 D:1 BT: 0}
System.out.println("CLASS:" + ci.className + " " + "(extends " + ci.extendsClass + ") (implements " + ci.impl + ")" + ci.startChar + " " + ci.endChar); {S:11946 E:12096 D:1 BT: 0}
ci.imports.output(); {S:12104 E:12123 D:1 BT: 0}
ci.vars.output(); {S:12131 E:12147 D:1 BT: 0}
ci.methods.output(); {S:12155 E:12174 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:11867 E:12181 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:11912 E:11938 D:1 BT: 0}
System.out.println("CLASS:" + ci.className + " " + "(extends " + ci.extendsClass + ") (implements " + ci.impl + ")" + ci.startChar + " " + ci.endChar); {S:11946 E:12096 D:1 BT: 0}
ci.imports.output(); {S:12104 E:12123 D:1 BT: 0}
ci.vars.output(); {S:12131 E:12147 D:1 BT: 0}
ci.methods.output(); {S:12155 E:12174 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:11867 E:12181 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:11912 E:11938 D:1 BT: 0}
System.out.println("CLASS:" + ci.className + " " + "(extends " + ci.extendsClass + ") (implements " + ci.impl + ")" + ci.startChar + " " + ci.endChar); {S:11946 E:12096 D:1 BT: 0}
ci.imports.output(); {S:12104 E:12123 D:1 BT: 0}
ci.vars.output(); {S:12131 E:12147 D:1 BT: 0}
ci.methods.output(); {S:12155 E:12174 D:1 BT: 0}
</sublist>
ClassInfoTest ci = getClass(i); {S:11912 E:11938 D:1 BT: 0}
System.out.println("CLASS:" + ci.className + " " + "(extends " + ci.extendsClass + ") (implements " + ci.impl + ")" + ci.startChar + " " + ci.endChar); {S:11946 E:12096 D:1 BT: 0}
ci.imports.output(); {S:12104 E:12123 D:1 BT: 0}
ci.vars.output(); {S:12131 E:12147 D:1 BT: 0}
ci.methods.output(); {S:12155 E:12174 D:1 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:11867   E:12181 D: 0BT: 0
   {
      ClassInfoTest ci = getClass(i); //S:11912   E:11938 D: 1BT: 0
      System.out.println("CLASS:" + ci.className + " " + "(extends " + ci.extendsClass + ") (implements " + ci.impl + ")" + ci.startChar + " " + ci.endChar); //S:11946   E:12096 D: 1BT: 0
      ci.imports.output(); //S:12104   E:12123 D: 1BT: 0
      ci.vars.output(); //S:12131   E:12147 D: 1BT: 0
      ci.methods.output(); //S:12155   E:12174 D: 1BT: 0
   }
   }

   public ClassInfoTest findQtClass(ClassInfoTest in)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:8 CP:0
/***************************
Processing list:
int sc = - 1; {S:12252 E:12263 D:0 BT: 0}
int ec = 0; {S:12270 E:12280 D:0 BT: 0}
ClassInfoTest rtnVal = in; {S:12287 E:12308 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:12315 E:12682 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:12360 E:12386 D:1 BT: 0}
</sublist>
return rtnVal; {S:12689 E:12702 D:0 BT: 0}
****************************/
/***************************
Processing list:
int sc = - 1; {S:12252 E:12263 D:0 BT: 0}
int ec = 0; {S:12270 E:12280 D:0 BT: 0}
ClassInfoTest rtnVal = in; {S:12287 E:12308 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:12315 E:12682 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:12360 E:12386 D:1 BT: 0}
</sublist>
return rtnVal; {S:12689 E:12702 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:12393 E:12446 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:12393 E:12446 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:12453 E:12528 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:12453 E:12528 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:12535 E:12675 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:12535 E:12675 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(! in.fromFile.equals(ci.fromFile)) {S:12394 E:12446 D:1 BT: 1}
continue; {S:12438 E:12446 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(! in.fromFile.equals(ci.fromFile)){} {S:12394 E:12446 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:12438 E:0 D:2 BT: 0}
continue; {S:12438 E:12446 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(ci.endChar<in.startChar || ci.startChar>in.endChar) {S:12454 E:12528 D:1 BT: 1}
continue; {S:12520 E:12528 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ci.endChar<in.startChar || ci.startChar>in.endChar){} {S:12454 E:12528 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:12520 E:0 D:2 BT: 0}
continue; {S:12520 E:12528 D:2 BT: 0}
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
if((ci.startChar<sc || sc == - 1)&& ci.endChar>ec){} {S:12536 E:12675 D:1 BT: 1}
rtnVal = ci; {S:12606 E:12617 D:2 BT: 0}
sc = ci.startChar; {S:12626 E:12643 D:2 BT: 0}
ec = ci.endChar; {S:12652 E:12667 D:2 BT: 0}
****************************/
/***************************
Processing list:
if((ci.startChar<sc || sc == - 1)&& ci.endChar>ec){} {S:12536 E:12675 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:12606 E:0 D:2 BT: 0}
rtnVal = ci; {S:12606 E:12617 D:2 BT: 0}
sc = ci.startChar; {S:12626 E:12643 D:2 BT: 0}
ec = ci.endChar; {S:12652 E:12667 D:2 BT: 0}
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
int sc = - 1; {S:12252 E:12263 D:0 BT: 0}
int ec = 0; {S:12270 E:12280 D:0 BT: 0}
ClassInfoTest rtnVal = in; {S:12287 E:12308 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:12315 E:12682 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:12360 E:12386 D:1 BT: 0}
</sublist>
ClassInfoTest ci = getClass(i); {S:12360 E:12386 D:1 BT: 0}
 {S:12393 E:12446 D:1 BT: 7}
if(! in.fromFile.equals(ci.fromFile)){} {S:12394 E:12446 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:12438 E:0 D:2 BT: 0}
continue; {S:12438 E:12446 D:2 BT: 0}
 {S:12453 E:12528 D:1 BT: 7}
if(ci.endChar<in.startChar || ci.startChar>in.endChar){} {S:12454 E:12528 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:12520 E:0 D:2 BT: 0}
continue; {S:12520 E:12528 D:2 BT: 0}
 {S:12535 E:12675 D:1 BT: 7}
if((ci.startChar<sc || sc == - 1)&& ci.endChar>ec){} {S:12536 E:12675 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:12606 E:0 D:2 BT: 0}
rtnVal = ci; {S:12606 E:12617 D:2 BT: 0}
sc = ci.startChar; {S:12626 E:12643 D:2 BT: 0}
ec = ci.endChar; {S:12652 E:12667 D:2 BT: 0}
return rtnVal; {S:12689 E:12702 D:0 BT: 0}
****************************/
   int sc = - 1; //S:12252   E:12263 D: 0BT: 0
   int ec = 0; //S:12270   E:12280 D: 0BT: 0
   ClassInfoTest rtnVal = in; //S:12287   E:12308 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:12315   E:12682 D: 0BT: 0
   {
      ClassInfoTest ci = getClass(i); //S:12360   E:12386 D: 1BT: 0
       //S:12393   E:12446 D: 1BT: 7
      if(! in.fromFile.equals(ci.fromFile)) //S:12394   E:12446 D: 1BT: 1
      {
         QuicktestRunner.execPath += 4; //S:12438   E:0 D: 2BT: 0
         continue; //S:12438   E:12446 D: 2BT: 0
      }
       //S:12453   E:12528 D: 1BT: 7
      if(ci.endChar<in.startChar || ci.startChar>in.endChar) //S:12454   E:12528 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:12520   E:0 D: 2BT: 0
         continue; //S:12520   E:12528 D: 2BT: 0
      }
       //S:12535   E:12675 D: 1BT: 7
      if((ci.startChar<sc || sc == - 1)&& ci.endChar>ec) //S:12536   E:12675 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:12606   E:0 D: 2BT: 0
         rtnVal = ci; //S:12606   E:12617 D: 2BT: 0
         sc = ci.startChar; //S:12626   E:12643 D: 2BT: 0
         ec = ci.endChar; //S:12652   E:12667 D: 2BT: 0
      }
   }
   return rtnVal; //S:12689   E:12702 D: 0BT: 0
   }

   public String[] getQTInstanceChain(ClassInfoTest origCI)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
ClassListTest temp = getQTInstances(origCI , true); {S:12783 E:12828 D:0 BT: 0}
String[]rtnVal = new String[2]; {S:12835 E:12866 D:0 BT: 0}
rtnVal[0]= ""; {S:12873 E:12887 D:0 BT: 0}
ClassInfoTest c0 = temp.getClass(0); {S:12894 E:12925 D:0 BT: 0}
ClassInfoTest ci = null; {S:12932 E:12951 D:0 BT: 0}
ClassInfoTest cj = null; {S:12958 E:12977 D:0 BT: 0}
for(int i = 0;i<temp.size();i ++){} {S:12984 E:13554 D:0 BT: 0}
<sublist>
ci = temp.getClass(i); {S:13034 E:13055 D:1 BT: 0}
rtnVal[0]+= "      " + c0.getClassTestName(); {S:13063 E:13108 D:1 BT: 0}
for(int j = 1;j<= i;j ++){} {S:13116 E:13237 D:1 BT: 0}
<sublist>
cj = temp.getClass(j); {S:13159 E:13180 D:2 BT: 0}
rtnVal[0]+= "." + cj.getClassTestName(); {S:13189 E:13229 D:2 BT: 0}
</sublist>
rtnVal[0]+= " c" + i + " = "; {S:13245 E:13274 D:1 BT: 0}
rtnVal[0]+= "("; {S:13470 E:13486 D:1 BT: 0}
</sublist>
rtnVal[1]= "c" +(temp.size()- 1); {S:13561 E:13596 D:0 BT: 0}
return rtnVal; {S:13603 E:13616 D:0 BT: 0}
****************************/
/***************************
Processing list:
ClassListTest temp = getQTInstances(origCI , true); {S:12783 E:12828 D:0 BT: 0}
String[]rtnVal = new String[2]; {S:12835 E:12866 D:0 BT: 0}
rtnVal[0]= ""; {S:12873 E:12887 D:0 BT: 0}
ClassInfoTest c0 = temp.getClass(0); {S:12894 E:12925 D:0 BT: 0}
ClassInfoTest ci = null; {S:12932 E:12951 D:0 BT: 0}
ClassInfoTest cj = null; {S:12958 E:12977 D:0 BT: 0}
for(int i = 0;i<temp.size();i ++){} {S:12984 E:13554 D:0 BT: 0}
<sublist>
ci = temp.getClass(i); {S:13034 E:13055 D:1 BT: 0}
rtnVal[0]+= "      " + c0.getClassTestName(); {S:13063 E:13108 D:1 BT: 0}
for(int j = 1;j<= i;j ++){} {S:13116 E:13237 D:1 BT: 0}
<sublist>
cj = temp.getClass(j); {S:13159 E:13180 D:2 BT: 0}
rtnVal[0]+= "." + cj.getClassTestName(); {S:13189 E:13229 D:2 BT: 0}
</sublist>
rtnVal[0]+= " c" + i + " = "; {S:13245 E:13274 D:1 BT: 0}
rtnVal[0]+= "("; {S:13470 E:13486 D:1 BT: 0}
</sublist>
rtnVal[1]= "c" +(temp.size()- 1); {S:13561 E:13596 D:0 BT: 0}
return rtnVal; {S:13603 E:13616 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:13281 E:13462 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:13281 E:13462 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:13493 E:13546 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:13493 E:13546 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(i>0){ {S:13282 E:13413 D:1 BT: 1}
rtnVal[0]+= "c" +(i - 1)+ "."; {S:13307 E:13339 D:2 BT: 0}
rtnVal[0]+= "new " + cj.getClassTestName(); {S:13348 E:13391 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(i>0){} {S:13282 E:13413 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:13307 E:0 D:2 BT: 0}
rtnVal[0]+= "c" +(i - 1)+ "."; {S:13307 E:13339 D:2 BT: 0}
rtnVal[0]+= "new " + cj.getClassTestName(); {S:13348 E:13391 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:13414 E:13462 D:1 BT: 2}
rtnVal[0]+= "new " + c0.getClassTestName(); {S:13419 E:13462 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:13414 E:13462 D:1 BT: 2}
rtnVal[0]+= "new " + c0.getClassTestName(); {S:13419 E:13462 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#6(3) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(i<(temp.size()- 1)) {S:13494 E:13546 D:1 BT: 1}
rtnVal[0]+= ");\n"; {S:13527 E:13546 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(i<(temp.size()- 1)){} {S:13494 E:13546 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:13527 E:0 D:2 BT: 0}
rtnVal[0]+= ");\n"; {S:13527 E:13546 D:2 BT: 0}
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
ClassListTest temp = getQTInstances(origCI , true); {S:12783 E:12828 D:0 BT: 0}
String[]rtnVal = new String[2]; {S:12835 E:12866 D:0 BT: 0}
rtnVal[0]= ""; {S:12873 E:12887 D:0 BT: 0}
ClassInfoTest c0 = temp.getClass(0); {S:12894 E:12925 D:0 BT: 0}
ClassInfoTest ci = null; {S:12932 E:12951 D:0 BT: 0}
ClassInfoTest cj = null; {S:12958 E:12977 D:0 BT: 0}
for(int i = 0;i<temp.size();i ++){} {S:12984 E:13554 D:0 BT: 0}
<sublist>
ci = temp.getClass(i); {S:13034 E:13055 D:1 BT: 0}
rtnVal[0]+= "      " + c0.getClassTestName(); {S:13063 E:13108 D:1 BT: 0}
for(int j = 1;j<= i;j ++){} {S:13116 E:13237 D:1 BT: 0}
<sublist>
cj = temp.getClass(j); {S:13159 E:13180 D:2 BT: 0}
rtnVal[0]+= "." + cj.getClassTestName(); {S:13189 E:13229 D:2 BT: 0}
</sublist>
rtnVal[0]+= " c" + i + " = "; {S:13245 E:13274 D:1 BT: 0}
rtnVal[0]+= "("; {S:13470 E:13486 D:1 BT: 0}
</sublist>
ci = temp.getClass(i); {S:13034 E:13055 D:1 BT: 0}
rtnVal[0]+= "      " + c0.getClassTestName(); {S:13063 E:13108 D:1 BT: 0}
for(int j = 1;j<= i;j ++){} {S:13116 E:13237 D:1 BT: 0}
<sublist>
cj = temp.getClass(j); {S:13159 E:13180 D:2 BT: 0}
rtnVal[0]+= "." + cj.getClassTestName(); {S:13189 E:13229 D:2 BT: 0}
</sublist>
cj = temp.getClass(j); {S:13159 E:13180 D:2 BT: 0}
rtnVal[0]+= "." + cj.getClassTestName(); {S:13189 E:13229 D:2 BT: 0}
rtnVal[0]+= " c" + i + " = "; {S:13245 E:13274 D:1 BT: 0}
 {S:13281 E:13462 D:1 BT: 7}
if(i>0){} {S:13282 E:13413 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:13307 E:0 D:2 BT: 0}
rtnVal[0]+= "c" +(i - 1)+ "."; {S:13307 E:13339 D:2 BT: 0}
rtnVal[0]+= "new " + cj.getClassTestName(); {S:13348 E:13391 D:2 BT: 0}
else{} {S:13414 E:13462 D:1 BT: 2}
rtnVal[0]+= "new " + c0.getClassTestName(); {S:13419 E:13462 D:2 BT: 0}
rtnVal[0]+= "("; {S:13470 E:13486 D:1 BT: 0}
 {S:13493 E:13546 D:1 BT: 7}
if(i<(temp.size()- 1)){} {S:13494 E:13546 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:13527 E:0 D:2 BT: 0}
rtnVal[0]+= ");\n"; {S:13527 E:13546 D:2 BT: 0}
rtnVal[1]= "c" +(temp.size()- 1); {S:13561 E:13596 D:0 BT: 0}
return rtnVal; {S:13603 E:13616 D:0 BT: 0}
****************************/
   ClassListTest temp = getQTInstances(origCI , true); //S:12783   E:12828 D: 0BT: 0
   String[]rtnVal = new String[2]; //S:12835   E:12866 D: 0BT: 0
   rtnVal[0]= ""; //S:12873   E:12887 D: 0BT: 0
   ClassInfoTest c0 = temp.getClass(0); //S:12894   E:12925 D: 0BT: 0
   ClassInfoTest ci = null; //S:12932   E:12951 D: 0BT: 0
   ClassInfoTest cj = null; //S:12958   E:12977 D: 0BT: 0
   for(int i = 0;i<temp.size();i ++) //S:12984   E:13554 D: 0BT: 0
   {
      ci = temp.getClass(i); //S:13034   E:13055 D: 1BT: 0
      rtnVal[0]+= "      " + c0.getClassTestName(); //S:13063   E:13108 D: 1BT: 0
      for(int j = 1;j<= i;j ++) //S:13116   E:13237 D: 1BT: 0
      {
         cj = temp.getClass(j); //S:13159   E:13180 D: 2BT: 0
         rtnVal[0]+= "." + cj.getClassTestName(); //S:13189   E:13229 D: 2BT: 0
      }
      rtnVal[0]+= " c" + i + " = "; //S:13245   E:13274 D: 1BT: 0
       //S:13281   E:13462 D: 1BT: 7
      if(i>0) //S:13282   E:13413 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:13307   E:0 D: 2BT: 0
         rtnVal[0]+= "c" +(i - 1)+ "."; //S:13307   E:13339 D: 2BT: 0
         rtnVal[0]+= "new " + cj.getClassTestName(); //S:13348   E:13391 D: 2BT: 0
      }
      else //S:13414   E:13462 D: 1BT: 2
      {
         rtnVal[0]+= "new " + c0.getClassTestName(); //S:13419   E:13462 D: 2BT: 0
      }
      rtnVal[0]+= "("; //S:13470   E:13486 D: 1BT: 0
       //S:13493   E:13546 D: 1BT: 7
      if(i<(temp.size()- 1)) //S:13494   E:13546 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:13527   E:0 D: 2BT: 0
         rtnVal[0]+= ");\n"; //S:13527   E:13546 D: 2BT: 0
      }
   }
   rtnVal[1]= "c" +(temp.size()- 1); //S:13561   E:13596 D: 0BT: 0
   return rtnVal; //S:13603   E:13616 D: 0BT: 0
   }

   public ClassListTest getQTInstances(ClassInfoTest origCI, boolean excludeInners)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:8 CP:0
/***************************
Processing list:
ClassListTest temp = new ClassListTest(); {S:13717 E:13749 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:13800 E:14159 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:13845 E:13871 D:1 BT: 0}
temp.add(ci); {S:14140 E:14152 D:1 BT: 0}
</sublist>
temp.sort(); {S:14167 E:14178 D:0 BT: 0}
return temp; {S:14185 E:14196 D:0 BT: 0}
****************************/
/***************************
Processing list:
ClassListTest temp = new ClassListTest(); {S:13717 E:13749 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:13800 E:14159 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:13845 E:13871 D:1 BT: 0}
temp.add(ci); {S:14140 E:14152 D:1 BT: 0}
</sublist>
temp.sort(); {S:14167 E:14178 D:0 BT: 0}
return temp; {S:14185 E:14196 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:13878 E:13935 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:13878 E:13935 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:13942 E:14025 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:13942 E:14025 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:14032 E:14132 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:14032 E:14132 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(! origCI.fromFile.equals(ci.fromFile)) {S:13879 E:13935 D:1 BT: 1}
continue; {S:13927 E:13935 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(! origCI.fromFile.equals(ci.fromFile)){} {S:13879 E:13935 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:13927 E:0 D:2 BT: 0}
continue; {S:13927 E:13935 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(ci.endChar<origCI.startChar || ci.startChar>origCI.endChar) {S:13943 E:14025 D:1 BT: 1}
continue; {S:14017 E:14025 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ci.endChar<origCI.startChar || ci.startChar>origCI.endChar){} {S:13943 E:14025 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:14017 E:0 D:2 BT: 0}
continue; {S:14017 E:14025 D:2 BT: 0}
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
if(excludeInners && ci.startChar>origCI.startChar && ci.endChar<origCI.endChar) {S:14033 E:14132 D:1 BT: 1}
continue; {S:14124 E:14132 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(excludeInners && ci.startChar>origCI.startChar && ci.endChar<origCI.endChar){} {S:14033 E:14132 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:14124 E:0 D:2 BT: 0}
continue; {S:14124 E:14132 D:2 BT: 0}
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
ClassListTest temp = new ClassListTest(); {S:13717 E:13749 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:13800 E:14159 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:13845 E:13871 D:1 BT: 0}
temp.add(ci); {S:14140 E:14152 D:1 BT: 0}
</sublist>
ClassInfoTest ci = getClass(i); {S:13845 E:13871 D:1 BT: 0}
 {S:13878 E:13935 D:1 BT: 7}
if(! origCI.fromFile.equals(ci.fromFile)){} {S:13879 E:13935 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:13927 E:0 D:2 BT: 0}
continue; {S:13927 E:13935 D:2 BT: 0}
 {S:13942 E:14025 D:1 BT: 7}
if(ci.endChar<origCI.startChar || ci.startChar>origCI.endChar){} {S:13943 E:14025 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:14017 E:0 D:2 BT: 0}
continue; {S:14017 E:14025 D:2 BT: 0}
 {S:14032 E:14132 D:1 BT: 7}
if(excludeInners && ci.startChar>origCI.startChar && ci.endChar<origCI.endChar){} {S:14033 E:14132 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:14124 E:0 D:2 BT: 0}
continue; {S:14124 E:14132 D:2 BT: 0}
temp.add(ci); {S:14140 E:14152 D:1 BT: 0}
temp.sort(); {S:14167 E:14178 D:0 BT: 0}
return temp; {S:14185 E:14196 D:0 BT: 0}
****************************/
   ClassListTest temp = new ClassListTest(); //S:13717   E:13749 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:13800   E:14159 D: 0BT: 0
   {
      ClassInfoTest ci = getClass(i); //S:13845   E:13871 D: 1BT: 0
       //S:13878   E:13935 D: 1BT: 7
      if(! origCI.fromFile.equals(ci.fromFile)) //S:13879   E:13935 D: 1BT: 1
      {
         QuicktestRunner.execPath += 4; //S:13927   E:0 D: 2BT: 0
         continue; //S:13927   E:13935 D: 2BT: 0
      }
       //S:13942   E:14025 D: 1BT: 7
      if(ci.endChar<origCI.startChar || ci.startChar>origCI.endChar) //S:13943   E:14025 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:14017   E:0 D: 2BT: 0
         continue; //S:14017   E:14025 D: 2BT: 0
      }
       //S:14032   E:14132 D: 1BT: 7
      if(excludeInners && ci.startChar>origCI.startChar && ci.endChar<origCI.endChar) //S:14033   E:14132 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:14124   E:0 D: 2BT: 0
         continue; //S:14124   E:14132 D: 2BT: 0
      }
      temp.add(ci); //S:14140   E:14152 D: 1BT: 0
   }
   temp.sort(); //S:14167   E:14178 D: 0BT: 0
   return temp; //S:14185   E:14196 D: 0BT: 0
   }

   public String outputQTClass(ClassInfoTest in, String qtFx, ClassInfoTest origCI)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String rtnVal = in.imports.dumpList(); {S:14297 E:14334 D:0 BT: 0}
rtnVal += outputQTClass(in , this , qtFx , origCI , true); {S:14341 E:14394 D:0 BT: 0}
return rtnVal; {S:14433 E:14446 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = in.imports.dumpList(); {S:14297 E:14334 D:0 BT: 0}
rtnVal += outputQTClass(in , this , qtFx , origCI , true); {S:14341 E:14394 D:0 BT: 0}
return rtnVal; {S:14433 E:14446 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = in.imports.dumpList(); {S:14297 E:14334 D:0 BT: 0}
rtnVal += outputQTClass(in , this , qtFx , origCI , true); {S:14341 E:14394 D:0 BT: 0}
return rtnVal; {S:14433 E:14446 D:0 BT: 0}
****************************/
   String rtnVal = in.imports.dumpList(); //S:14297   E:14334 D: 0BT: 0
   rtnVal += outputQTClass(in , this , qtFx , origCI , true); //S:14341   E:14394 D: 0BT: 0
   return rtnVal; //S:14433   E:14446 D: 0BT: 0
   }

   private String outputQTClass(ClassInfoTest in, ClassListTest temp, String qtFx, ClassInfoTest origCI, boolean useQT)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:8 CP:0
/***************************
Processing list:
String rtnVal = in.getClassOpen("   " , useQT); {S:14609 E:14654 D:0 BT: 0}
for(int j = 0;j<in.methods.size();j ++){} {S:14661 E:14822 D:0 BT: 0}
<sublist>
MethodInfoTest mi = in.methods.getMethod(j); {S:14713 E:14752 D:1 BT: 0}
rtnVal += mi.getMethodText()+ "\n\n"; {S:14780 E:14817 D:1 BT: 0}
</sublist>
ClassListTest cl = new ClassListTest(); {S:14946 E:14976 D:0 BT: 0}
for(int i = 0;i<temp.size();i ++){} {S:15030 E:15257 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:15080 E:15106 D:1 BT: 0}
</sublist>
cl.sort(); {S:15270 E:15279 D:0 BT: 0}
for(int i = 0;i<cl.size();i ++){} {S:15336 E:15480 D:0 BT: 0}
<sublist>
rtnVal += outputQTClass(cl.getClass(i), cl , qtFx , origCI , false); {S:15384 E:15448 D:1 BT: 0}
</sublist>
return rtnVal + "}\n"; {S:15485 E:15506 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = in.getClassOpen("   " , useQT); {S:14609 E:14654 D:0 BT: 0}
for(int j = 0;j<in.methods.size();j ++){} {S:14661 E:14822 D:0 BT: 0}
<sublist>
MethodInfoTest mi = in.methods.getMethod(j); {S:14713 E:14752 D:1 BT: 0}
rtnVal += mi.getMethodText()+ "\n\n"; {S:14780 E:14817 D:1 BT: 0}
</sublist>
ClassListTest cl = new ClassListTest(); {S:14946 E:14976 D:0 BT: 0}
for(int i = 0;i<temp.size();i ++){} {S:15030 E:15257 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:15080 E:15106 D:1 BT: 0}
</sublist>
cl.sort(); {S:15270 E:15279 D:0 BT: 0}
for(int i = 0;i<cl.size();i ++){} {S:15336 E:15480 D:0 BT: 0}
<sublist>
rtnVal += outputQTClass(cl.getClass(i), cl , qtFx , origCI , false); {S:15384 E:15448 D:1 BT: 0}
</sublist>
return rtnVal + "}\n"; {S:15485 E:15506 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:14894 E:14939 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:14894 E:14939 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:15113 E:15166 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:15113 E:15166 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:15173 E:15250 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:15173 E:15250 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(in == origCI) {S:14895 E:14939 D:0 BT: 1}
rtnVal += qtFx + "\n"; {S:14918 E:14939 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(in == origCI){} {S:14895 E:14939 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:14918 E:0 D:1 BT: 0}
rtnVal += qtFx + "\n"; {S:14918 E:14939 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(! in.fromFile.equals(ci.fromFile)) {S:15114 E:15166 D:1 BT: 1}
continue; {S:15158 E:15166 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(! in.fromFile.equals(ci.fromFile)){} {S:15114 E:15166 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:15158 E:0 D:2 BT: 0}
continue; {S:15158 E:15166 D:2 BT: 0}
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
if(ci.startChar>in.startChar && ci.endChar<in.endChar) {S:15174 E:15250 D:1 BT: 1}
cl.add(ci); {S:15240 E:15250 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(ci.startChar>in.startChar && ci.endChar<in.endChar){} {S:15174 E:15250 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:15240 E:0 D:2 BT: 0}
cl.add(ci); {S:15240 E:15250 D:2 BT: 0}
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
String rtnVal = in.getClassOpen("   " , useQT); {S:14609 E:14654 D:0 BT: 0}
for(int j = 0;j<in.methods.size();j ++){} {S:14661 E:14822 D:0 BT: 0}
<sublist>
MethodInfoTest mi = in.methods.getMethod(j); {S:14713 E:14752 D:1 BT: 0}
rtnVal += mi.getMethodText()+ "\n\n"; {S:14780 E:14817 D:1 BT: 0}
</sublist>
MethodInfoTest mi = in.methods.getMethod(j); {S:14713 E:14752 D:1 BT: 0}
rtnVal += mi.getMethodText()+ "\n\n"; {S:14780 E:14817 D:1 BT: 0}
 {S:14894 E:14939 D:0 BT: 7}
if(in == origCI){} {S:14895 E:14939 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:14918 E:0 D:1 BT: 0}
rtnVal += qtFx + "\n"; {S:14918 E:14939 D:1 BT: 0}
ClassListTest cl = new ClassListTest(); {S:14946 E:14976 D:0 BT: 0}
for(int i = 0;i<temp.size();i ++){} {S:15030 E:15257 D:0 BT: 0}
<sublist>
ClassInfoTest ci = getClass(i); {S:15080 E:15106 D:1 BT: 0}
</sublist>
ClassInfoTest ci = getClass(i); {S:15080 E:15106 D:1 BT: 0}
 {S:15113 E:15166 D:1 BT: 7}
if(! in.fromFile.equals(ci.fromFile)){} {S:15114 E:15166 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:15158 E:0 D:2 BT: 0}
continue; {S:15158 E:15166 D:2 BT: 0}
 {S:15173 E:15250 D:1 BT: 7}
if(ci.startChar>in.startChar && ci.endChar<in.endChar){} {S:15174 E:15250 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:15240 E:0 D:2 BT: 0}
cl.add(ci); {S:15240 E:15250 D:2 BT: 0}
cl.sort(); {S:15270 E:15279 D:0 BT: 0}
for(int i = 0;i<cl.size();i ++){} {S:15336 E:15480 D:0 BT: 0}
<sublist>
rtnVal += outputQTClass(cl.getClass(i), cl , qtFx , origCI , false); {S:15384 E:15448 D:1 BT: 0}
</sublist>
rtnVal += outputQTClass(cl.getClass(i), cl , qtFx , origCI , false); {S:15384 E:15448 D:1 BT: 0}
return rtnVal + "}\n"; {S:15485 E:15506 D:0 BT: 0}
****************************/
   String rtnVal = in.getClassOpen("   " , useQT); //S:14609   E:14654 D: 0BT: 0
   for(int j = 0;j<in.methods.size();j ++) //S:14661   E:14822 D: 0BT: 0
   {
      MethodInfoTest mi = in.methods.getMethod(j); //S:14713   E:14752 D: 1BT: 0
      rtnVal += mi.getMethodText()+ "\n\n"; //S:14780   E:14817 D: 1BT: 0
   }
    //S:14894   E:14939 D: 0BT: 7
   if(in == origCI) //S:14895   E:14939 D: 0BT: 1
   {
      QuicktestRunner.execPath += 4; //S:14918   E:0 D: 1BT: 0
      rtnVal += qtFx + "\n"; //S:14918   E:14939 D: 1BT: 0
   }
   ClassListTest cl = new ClassListTest(); //S:14946   E:14976 D: 0BT: 0
   for(int i = 0;i<temp.size();i ++) //S:15030   E:15257 D: 0BT: 0
   {
      ClassInfoTest ci = getClass(i); //S:15080   E:15106 D: 1BT: 0
       //S:15113   E:15166 D: 1BT: 7
      if(! in.fromFile.equals(ci.fromFile)) //S:15114   E:15166 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:15158   E:0 D: 2BT: 0
         continue; //S:15158   E:15166 D: 2BT: 0
      }
       //S:15173   E:15250 D: 1BT: 7
      if(ci.startChar>in.startChar && ci.endChar<in.endChar) //S:15174   E:15250 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:15240   E:0 D: 2BT: 0
         cl.add(ci); //S:15240   E:15250 D: 2BT: 0
      }
   }
   cl.sort(); //S:15270   E:15279 D: 0BT: 0
   for(int i = 0;i<cl.size();i ++) //S:15336   E:15480 D: 0BT: 0
   {
      rtnVal += outputQTClass(cl.getClass(i), cl , qtFx , origCI , false); //S:15384   E:15448 D: 1BT: 0
   }
   return rtnVal + "}\n"; //S:15485   E:15506 D: 0BT: 0
   }

   private void sort()
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
ClassInfoTest ci1; {S:15595 E:15608 D:0 BT: 0}
ClassInfoTest ci2; {S:15615 E:15628 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:15635 E:15863 D:0 BT: 0}
<sublist>
ci1 = getClass(i); {S:15680 E:15697 D:1 BT: 0}
for(int j = i;j<size();j ++){} {S:15705 E:15856 D:1 BT: 0}
<sublist>
ci2 = getClass(j); {S:15752 E:15769 D:2 BT: 0}
</sublist>
</sublist>
****************************/
/***************************
Processing list:
ClassInfoTest ci1; {S:15595 E:15608 D:0 BT: 0}
ClassInfoTest ci2; {S:15615 E:15628 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:15635 E:15863 D:0 BT: 0}
<sublist>
ci1 = getClass(i); {S:15680 E:15697 D:1 BT: 0}
for(int j = i;j<size();j ++){} {S:15705 E:15856 D:1 BT: 0}
<sublist>
ci2 = getClass(j); {S:15752 E:15769 D:2 BT: 0}
</sublist>
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:15777 E:15848 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:15777 E:15848 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(ci2.startChar<ci1.startChar){} {S:15778 E:15848 D:2 BT: 1}
swap(i , j); {S:15829 E:15839 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(ci2.startChar<ci1.startChar){} {S:15778 E:15848 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:15829 E:0 D:3 BT: 0}
swap(i , j); {S:15829 E:15839 D:3 BT: 0}
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
ClassInfoTest ci1; {S:15595 E:15608 D:0 BT: 0}
ClassInfoTest ci2; {S:15615 E:15628 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:15635 E:15863 D:0 BT: 0}
<sublist>
ci1 = getClass(i); {S:15680 E:15697 D:1 BT: 0}
for(int j = i;j<size();j ++){} {S:15705 E:15856 D:1 BT: 0}
<sublist>
ci2 = getClass(j); {S:15752 E:15769 D:2 BT: 0}
</sublist>
</sublist>
ci1 = getClass(i); {S:15680 E:15697 D:1 BT: 0}
for(int j = i;j<size();j ++){} {S:15705 E:15856 D:1 BT: 0}
<sublist>
ci2 = getClass(j); {S:15752 E:15769 D:2 BT: 0}
</sublist>
ci2 = getClass(j); {S:15752 E:15769 D:2 BT: 0}
 {S:15777 E:15848 D:2 BT: 7}
if(ci2.startChar<ci1.startChar){} {S:15778 E:15848 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:15829 E:0 D:3 BT: 0}
swap(i , j); {S:15829 E:15839 D:3 BT: 0}
****************************/
   ClassInfoTest ci1; //S:15595   E:15608 D: 0BT: 0
   ClassInfoTest ci2; //S:15615   E:15628 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:15635   E:15863 D: 0BT: 0
   {
      ci1 = getClass(i); //S:15680   E:15697 D: 1BT: 0
      for(int j = i;j<size();j ++) //S:15705   E:15856 D: 1BT: 0
      {
         ci2 = getClass(j); //S:15752   E:15769 D: 2BT: 0
          //S:15777   E:15848 D: 2BT: 7
         if(ci2.startChar<ci1.startChar) //S:15778   E:15848 D: 2BT: 1
         {
            QuicktestRunner.execPath += 1; //S:15829   E:0 D: 3BT: 0
            swap(i , j); //S:15829   E:15839 D: 3BT: 0
         }
      }
   }
   }

public void sortTest_0()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   sort();
   //Post-test

}

public void sortTest_1()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   sort();
   //Post-test

}

   private void swap(int i, int j)
     {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
ClassInfoTest temp =(ClassInfoTest)set(i , getClass(j)); {S:15923 E:15971 D:0 BT: 0}
set(j , temp); {S:15978 E:15990 D:0 BT: 0}
****************************/
/***************************
Processing list:
ClassInfoTest temp =(ClassInfoTest)set(i , getClass(j)); {S:15923 E:15971 D:0 BT: 0}
set(j , temp); {S:15978 E:15990 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
ClassInfoTest temp =(ClassInfoTest)set(i , getClass(j)); {S:15923 E:15971 D:0 BT: 0}
set(j , temp); {S:15978 E:15990 D:0 BT: 0}
****************************/
   ClassInfoTest temp =(ClassInfoTest)set(i , getClass(j)); //S:15923   E:15971 D: 0BT: 0
   set(j , temp); //S:15978   E:15990 D: 0BT: 0
   }

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

