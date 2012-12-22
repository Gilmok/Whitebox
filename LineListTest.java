import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class LineListTest extends LinkedList
{
   public  static final int TESTPATH = 1;
   public  static final int CODE = 0;

   public LineInfoTest getLine(int index)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(LineInfoTest)super.get(index); {S:152996 E:153030 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(LineInfoTest)super.get(index); {S:152996 E:153030 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(LineInfoTest)super.get(index); {S:152996 E:153030 D:0 BT: 0}
****************************/
   return(LineInfoTest)super.get(index); //S:152996   E:153030 D: 0BT: 0
   }

   public String[] toStrArray(String initTab, boolean usePathCode)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String str = outputWTDepth(initTab , usePathCode); {S:153112 E:153160 D:0 BT: 0}
String[]rtnVal = str.split("\n"); {S:153165 E:153198 D:0 BT: 0}
return rtnVal; {S:153203 E:153216 D:0 BT: 0}
****************************/
/***************************
Processing list:
String str = outputWTDepth(initTab , usePathCode); {S:153112 E:153160 D:0 BT: 0}
String[]rtnVal = str.split("\n"); {S:153165 E:153198 D:0 BT: 0}
return rtnVal; {S:153203 E:153216 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String str = outputWTDepth(initTab , usePathCode); {S:153112 E:153160 D:0 BT: 0}
String[]rtnVal = str.split("\n"); {S:153165 E:153198 D:0 BT: 0}
return rtnVal; {S:153203 E:153216 D:0 BT: 0}
****************************/
   String str = outputWTDepth(initTab , usePathCode); //S:153112   E:153160 D: 0BT: 0
   String[]rtnVal = str.split("\n"); //S:153165   E:153198 D: 0BT: 0
   return rtnVal; //S:153203   E:153216 D: 0BT: 0
   }

   public String outputWTDepth(String initTab, boolean usePathCode)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return outputWTDepth(initTab , new RefInt(0), usePathCode); {S:153299 E:153356 D:0 BT: 0}
****************************/
/***************************
Processing list:
return outputWTDepth(initTab , new RefInt(0), usePathCode); {S:153299 E:153356 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return outputWTDepth(initTab , new RefInt(0), usePathCode); {S:153299 E:153356 D:0 BT: 0}
****************************/
   return outputWTDepth(initTab , new RefInt(0), usePathCode); //S:153299   E:153356 D: 0BT: 0
   }

   public String getCommentList()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:153405 E:153423 D:0 BT: 0}
rtnVal += "/***************************\n"; {S:153428 E:153470 D:0 BT: 0}
rtnVal += "Processing list:\n"; {S:153475 E:153505 D:0 BT: 0}
String x = commentSub(this); {S:153510 E:153537 D:0 BT: 0}
x = x.replaceAll("\\!!" , "!!"); {S:153542 E:153572 D:0 BT: 0}
rtnVal += x; {S:153577 E:153588 D:0 BT: 0}
rtnVal += "***************************!!\n"; {S:153593 E:153636 D:0 BT: 0}
return rtnVal; {S:153641 E:153654 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:153405 E:153423 D:0 BT: 0}
rtnVal += "/***************************\n"; {S:153428 E:153470 D:0 BT: 0}
rtnVal += "Processing list:\n"; {S:153475 E:153505 D:0 BT: 0}
String x = commentSub(this); {S:153510 E:153537 D:0 BT: 0}
x = x.replaceAll("\\!!" , "!!"); {S:153542 E:153572 D:0 BT: 0}
rtnVal += x; {S:153577 E:153588 D:0 BT: 0}
rtnVal += "***************************!!\n"; {S:153593 E:153636 D:0 BT: 0}
return rtnVal; {S:153641 E:153654 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:153405 E:153423 D:0 BT: 0}
rtnVal += "/***************************\n"; {S:153428 E:153470 D:0 BT: 0}
rtnVal += "Processing list:\n"; {S:153475 E:153505 D:0 BT: 0}
String x = commentSub(this); {S:153510 E:153537 D:0 BT: 0}
x = x.replaceAll("\\!!" , "!!"); {S:153542 E:153572 D:0 BT: 0}
rtnVal += x; {S:153577 E:153588 D:0 BT: 0}
rtnVal += "***************************!!\n"; {S:153593 E:153636 D:0 BT: 0}
return rtnVal; {S:153641 E:153654 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:153405   E:153423 D: 0BT: 0
   rtnVal += "/***************************\n"; //S:153428   E:153470 D: 0BT: 0
   rtnVal += "Processing list:\n"; //S:153475   E:153505 D: 0BT: 0
   String x = commentSub(this); //S:153510   E:153537 D: 0BT: 0
   x = x.replaceAll("\\*/" , "!!"); //S:153542   E:153572 D: 0BT: 0
   rtnVal += x; //S:153577   E:153588 D: 0BT: 0
   rtnVal += "****************************/\n"; //S:153593   E:153636 D: 0BT: 0
   return rtnVal; //S:153641   E:153654 D: 0BT: 0
   }

   private String commentSub(LineListTest in)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:153711 E:153729 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:153734 E:154105 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:153778 E:153805 D:1 BT: 0}
rtnVal += li.lineText + " {S:" + li.startChar + " E:" + li.endChar + " D:" + li.tabDepth + " BT: " + li.branchType + "}\n"; {S:153811 E:153933 D:1 BT: 0}
</sublist>
return rtnVal; {S:154110 E:154123 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:153711 E:153729 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:153734 E:154105 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:153778 E:153805 D:1 BT: 0}
rtnVal += li.lineText + " {S:" + li.startChar + " E:" + li.endChar + " D:" + li.tabDepth + " BT: " + li.branchType + "}\n"; {S:153811 E:153933 D:1 BT: 0}
</sublist>
return rtnVal; {S:154110 E:154123 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:153938 E:154100 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:153938 E:154100 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(li.subLines != null && li.subLines.size()>0){} {S:153939 E:154100 D:1 BT: 1}
rtnVal += "<sublist>\n"; {S:154000 E:154023 D:2 BT: 0}
rtnVal += commentSub(li.subLines); {S:154030 E:154063 D:2 BT: 0}
rtnVal += "</sublist>\n"; {S:154070 E:154094 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(li.subLines != null && li.subLines.size()>0){} {S:153939 E:154100 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:154000 E:0 D:2 BT: 0}
rtnVal += "<sublist>\n"; {S:154000 E:154023 D:2 BT: 0}
rtnVal += commentSub(li.subLines); {S:154030 E:154063 D:2 BT: 0}
rtnVal += "</sublist>\n"; {S:154070 E:154094 D:2 BT: 0}
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
String rtnVal = ""; {S:153711 E:153729 D:0 BT: 0}
for(int i = 0;i<in.size();i ++){} {S:153734 E:154105 D:0 BT: 0}
<sublist>
LineInfoTest li = in.getLine(i); {S:153778 E:153805 D:1 BT: 0}
rtnVal += li.lineText + " {S:" + li.startChar + " E:" + li.endChar + " D:" + li.tabDepth + " BT: " + li.branchType + "}\n"; {S:153811 E:153933 D:1 BT: 0}
</sublist>
LineInfoTest li = in.getLine(i); {S:153778 E:153805 D:1 BT: 0}
rtnVal += li.lineText + " {S:" + li.startChar + " E:" + li.endChar + " D:" + li.tabDepth + " BT: " + li.branchType + "}\n"; {S:153811 E:153933 D:1 BT: 0}
 {S:153938 E:154100 D:1 BT: 7}
if(li.subLines != null && li.subLines.size()>0){} {S:153939 E:154100 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:154000 E:0 D:2 BT: 0}
rtnVal += "<sublist>\n"; {S:154000 E:154023 D:2 BT: 0}
rtnVal += commentSub(li.subLines); {S:154030 E:154063 D:2 BT: 0}
rtnVal += "</sublist>\n"; {S:154070 E:154094 D:2 BT: 0}
return rtnVal; {S:154110 E:154123 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:153711   E:153729 D: 0BT: 0
   for(int i = 0;i<in.size();i ++) //S:153734   E:154105 D: 0BT: 0
   {
      LineInfoTest li = in.getLine(i); //S:153778   E:153805 D: 1BT: 0
      rtnVal += li.lineText + " {S:" + li.startChar + " E:" + li.endChar + " D:" + li.tabDepth + " BT: " + li.branchType + "}\n"; //S:153811   E:153933 D: 1BT: 0
       //S:153938   E:154100 D: 1BT: 7
      if(li.subLines != null && li.subLines.size()>0) //S:153939   E:154100 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:154000   E:0 D: 2BT: 0
         rtnVal += "<sublist>\n"; //S:154000   E:154023 D: 2BT: 0
         rtnVal += commentSub(li.subLines); //S:154030   E:154063 D: 2BT: 0
         rtnVal += "</sublist>\n"; //S:154070   E:154094 D: 2BT: 0
      }
   }
   return rtnVal; //S:154110   E:154123 D: 0BT: 0
   }

   private String[] setupPostgroup()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
int max = 0; {S:154175 E:154186 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:154191 E:154297 D:0 BT: 0}
String[]rtnVal = new String[max]; {S:154302 E:154335 D:0 BT: 0}
for(int i = 0;i<max;i ++)rtnVal[i]= new String(); {S:154340 E:154397 D:0 BT: 0}
return rtnVal; {S:154402 E:154415 D:0 BT: 0}
****************************/
/***************************
Processing list:
int max = 0; {S:154175 E:154186 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:154191 E:154297 D:0 BT: 0}
String[]rtnVal = new String[max]; {S:154302 E:154335 D:0 BT: 0}
for(int i = 0;i<max;i ++)rtnVal[i]= new String(); {S:154340 E:154397 D:0 BT: 0}
return rtnVal; {S:154402 E:154415 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:154231 E:154292 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:154231 E:154292 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(getLine(i).tabDepth>max) {S:154232 E:154292 D:1 BT: 1}
max = getLine(i).tabDepth; {S:154267 E:154292 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(getLine(i).tabDepth>max){} {S:154232 E:154292 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:154267 E:0 D:2 BT: 0}
max = getLine(i).tabDepth; {S:154267 E:154292 D:2 BT: 0}
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
int max = 0; {S:154175 E:154186 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:154191 E:154297 D:0 BT: 0}
 {S:154231 E:154292 D:1 BT: 7}
if(getLine(i).tabDepth>max){} {S:154232 E:154292 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:154267 E:0 D:2 BT: 0}
max = getLine(i).tabDepth; {S:154267 E:154292 D:2 BT: 0}
String[]rtnVal = new String[max]; {S:154302 E:154335 D:0 BT: 0}
for(int i = 0;i<max;i ++)rtnVal[i]= new String(); {S:154340 E:154397 D:0 BT: 0}
return rtnVal; {S:154402 E:154415 D:0 BT: 0}
****************************/
   int max = 0; //S:154175   E:154186 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:154191   E:154297 D: 0BT: 0
   {
       //S:154231   E:154292 D: 1BT: 7
      if(getLine(i).tabDepth>max) //S:154232   E:154292 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:154267   E:0 D: 2BT: 0
         max = getLine(i).tabDepth; //S:154267   E:154292 D: 2BT: 0
      }
   }
   String[]rtnVal = new String[max]; //S:154302   E:154335 D: 0BT: 0
   for(int i = 0;i<max;i ++)rtnVal[i]= new String(); //S:154340   E:154397 D: 0BT: 0
   return rtnVal; //S:154402   E:154415 D: 0BT: 0
   }

   private String outputWTDepth(String initTab, RefInt depth, boolean usePathCode)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:32 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:154542 E:154560 D:0 BT: 0}
String[]postGroup = setupPostgroup(); {S:154565 E:154602 D:0 BT: 0}
int aLine = 0; {S:154607 E:154620 D:0 BT: 0}
rtnVal += getCommentList(); {S:154625 E:154651 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:154656 E:156724 D:0 BT: 0}
<sublist>
LineInfoTest li = getLine(i); {S:154697 E:154721 D:1 BT: 0}
final String GROUPTOKEN = LineInfoTest.BLOCKSTART + LineInfoTest.BLOCKEND; {S:154727 E:154792 D:1 BT: 0}
boolean isGroup = false; {S:154798 E:154821 D:1 BT: 0}
while(depth.getValue()>li.tabDepth){} {S:155524 E:155922 D:1 BT: 0}
<sublist>
rtnVal += initTab; {S:155675 E:155692 D:2 BT: 0}
depth.decrement(); {S:155699 E:155716 D:2 BT: 0}
for(int j = 0;j<depth.getValue();j ++)rtnVal += initTab; {S:155723 E:155788 D:2 BT: 0}
rtnVal += LineInfoTest.BLOCKEND + postGroup[depth.getValue()]+ "\n"; {S:155795 E:155859 D:2 BT: 0}
aLine ++; {S:155909 E:155916 D:2 BT: 0}
</sublist>
rtnVal += initTab; {S:155928 E:155945 D:1 BT: 0}
for(int j = 0;j<li.tabDepth;j ++)rtnVal += initTab; {S:155951 E:156010 D:1 BT: 0}
rtnVal += " //S:" + li.startChar + "   E:" + li.endChar + " D: " + li.tabDepth + "BT: " + li.branchType + "\n"; {S:156155 E:156265 D:1 BT: 0}
depth.setValue(li.tabDepth); {S:156276 E:156303 D:1 BT: 0}
li.assertionLine = aLine; {S:156418 E:156442 D:1 BT: 0}
aLine ++; {S:156473 E:156480 D:1 BT: 0}
</sublist>
while(depth.getValue()>0){} {S:156789 E:157148 D:0 BT: 0}
<sublist>
rtnVal += initTab; {S:156826 E:156843 D:1 BT: 0}
depth.decrement(); {S:156849 E:156866 D:1 BT: 0}
for(int j = 0;j<depth.getValue();j ++)rtnVal += initTab; {S:156872 E:156936 D:1 BT: 0}
rtnVal += LineInfoTest.BLOCKEND; {S:156942 E:156969 D:1 BT: 0}
rtnVal += postGroup[depth.getValue()]+ "\n"; {S:157014 E:157058 D:1 BT: 0}
</sublist>
return rtnVal; {S:157153 E:157166 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:154542 E:154560 D:0 BT: 0}
String[]postGroup = setupPostgroup(); {S:154565 E:154602 D:0 BT: 0}
int aLine = 0; {S:154607 E:154620 D:0 BT: 0}
rtnVal += getCommentList(); {S:154625 E:154651 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:154656 E:156724 D:0 BT: 0}
<sublist>
LineInfoTest li = getLine(i); {S:154697 E:154721 D:1 BT: 0}
final String GROUPTOKEN = LineInfoTest.BLOCKSTART + LineInfoTest.BLOCKEND; {S:154727 E:154792 D:1 BT: 0}
boolean isGroup = false; {S:154798 E:154821 D:1 BT: 0}
while(depth.getValue()>li.tabDepth){} {S:155524 E:155922 D:1 BT: 0}
<sublist>
rtnVal += initTab; {S:155675 E:155692 D:2 BT: 0}
depth.decrement(); {S:155699 E:155716 D:2 BT: 0}
for(int j = 0;j<depth.getValue();j ++)rtnVal += initTab; {S:155723 E:155788 D:2 BT: 0}
rtnVal += LineInfoTest.BLOCKEND + postGroup[depth.getValue()]+ "\n"; {S:155795 E:155859 D:2 BT: 0}
aLine ++; {S:155909 E:155916 D:2 BT: 0}
</sublist>
rtnVal += initTab; {S:155928 E:155945 D:1 BT: 0}
for(int j = 0;j<li.tabDepth;j ++)rtnVal += initTab; {S:155951 E:156010 D:1 BT: 0}
rtnVal += " //S:" + li.startChar + "   E:" + li.endChar + " D: " + li.tabDepth + "BT: " + li.branchType + "\n"; {S:156155 E:156265 D:1 BT: 0}
depth.setValue(li.tabDepth); {S:156276 E:156303 D:1 BT: 0}
li.assertionLine = aLine; {S:156418 E:156442 D:1 BT: 0}
aLine ++; {S:156473 E:156480 D:1 BT: 0}
</sublist>
while(depth.getValue()>0){} {S:156789 E:157148 D:0 BT: 0}
<sublist>
rtnVal += initTab; {S:156826 E:156843 D:1 BT: 0}
depth.decrement(); {S:156849 E:156866 D:1 BT: 0}
for(int j = 0;j<depth.getValue();j ++)rtnVal += initTab; {S:156872 E:156936 D:1 BT: 0}
rtnVal += LineInfoTest.BLOCKEND; {S:156942 E:156969 D:1 BT: 0}
rtnVal += postGroup[depth.getValue()]+ "\n"; {S:157014 E:157058 D:1 BT: 0}
</sublist>
return rtnVal; {S:157153 E:157166 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:154854 E:155213 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:154854 E:155213 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:155218 E:155518 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:155218 E:155518 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:156015 E:156139 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:156015 E:156139 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#5(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:156308 E:156412 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:156308 E:156412 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(2) Type:1 Paths:3 CP:0
/***************************
Processing list:
if(li.lineText.endsWith(GROUPTOKEN)){} {S:154855 E:155213 D:1 BT: 1}
****************************/
/***************************
Processing list:
if(li.lineText.endsWith(GROUPTOKEN)){} {S:154855 E:155213 D:1 BT: 1}
****************************/
//=======================================
//=======================================
//#7(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#8(3) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(depth.getValue()<li.tabDepth){} {S:155219 E:155518 D:1 BT: 1}
rtnVal += initTab; {S:155367 E:155384 D:2 BT: 0}
for(int j = 0;j<li.tabDepth - 1;j ++)rtnVal += initTab; {S:155391 E:155455 D:2 BT: 0}
rtnVal += LineInfoTest.BLOCKSTART + "\n"; {S:155462 E:155498 D:2 BT: 0}
aLine ++; {S:155505 E:155512 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(depth.getValue()<li.tabDepth){} {S:155219 E:155518 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:155367 E:0 D:2 BT: 0}
rtnVal += initTab; {S:155367 E:155384 D:2 BT: 0}
for(int j = 0;j<li.tabDepth - 1;j ++)rtnVal += initTab; {S:155391 E:155455 D:2 BT: 0}
rtnVal += LineInfoTest.BLOCKSTART + "\n"; {S:155462 E:155498 D:2 BT: 0}
aLine ++; {S:155505 E:155512 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#9(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#10(4) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(usePathCode == true)else rtnVal += li.lineText; {S:156016 E:156112 D:1 BT: 1}
rtnVal += li.outputPathCode(LineInfoTest.NOWSCHARS); {S:156045 E:156092 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(usePathCode == true){} {S:156016 E:156112 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:156045 E:0 D:2 BT: 0}
rtnVal += li.outputPathCode(LineInfoTest.NOWSCHARS); {S:156045 E:156092 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#11(4) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:156113 E:156139 D:1 BT: 2}
rtnVal += li.lineText; {S:156118 E:156139 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:156113 E:156139 D:1 BT: 2}
rtnVal += li.lineText; {S:156118 E:156139 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#12(5) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(isGroup){} {S:156309 E:156412 D:1 BT: 1}
li.lineText += GROUPTOKEN; {S:156332 E:156357 D:2 BT: 0}
postGroup[li.tabDepth]= li.getPostgroup(); {S:156364 E:156406 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(isGroup){} {S:156309 E:156412 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:156332 E:0 D:2 BT: 0}
li.lineText += GROUPTOKEN; {S:156332 E:156357 D:2 BT: 0}
postGroup[li.tabDepth]= li.getPostgroup(); {S:156364 E:156406 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#13(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#14(6) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:154963 E:155207 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:154963 E:155207 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#15(14) Type:1 Paths:2 CP:0
/***************************
Processing list:
if((i + 1)<size()){} {S:154964 E:155207 D:2 BT: 1}
LineInfoTest lz = getLine(i + 1); {S:154998 E:155026 D:3 BT: 0}
****************************/
/***************************
Processing list:
if((i + 1)<size()){} {S:154964 E:155207 D:2 BT: 1}
LineInfoTest lz = getLine(i + 1); {S:154998 E:155026 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#16(14) Type:2 Paths:1 CP:8

/***************************
Processing list:
else {S:155207 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 8; {S:155208 E:0 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#17(15) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:155033 E:155200 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:155033 E:155200 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#18(17) Type:1 Paths:1 CP:24
/***************************
Processing list:
if(lz.tabDepth>li.tabDepth){} {S:155034 E:155200 D:3 BT: 1}
isGroup = true; {S:155079 E:155093 D:4 BT: 0}
li.lineText = li.lineText.substring(0 , li.lineText.length()- GROUPTOKEN.length()); {S:155102 E:155184 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(lz.tabDepth>li.tabDepth){} {S:155034 E:155200 D:3 BT: 1}
QuicktestRunner.execPath += 24; {S:155079 E:0 D:4 BT: 0}
isGroup = true; {S:155079 E:155093 D:4 BT: 0}
li.lineText = li.lineText.substring(0 , li.lineText.length()- GROUPTOKEN.length()); {S:155102 E:155184 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#19(17) Type:2 Paths:1 CP:16

/***************************
Processing list:
else {S:155200 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 16; {S:155201 E:0 D:4 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:154542 E:154560 D:0 BT: 0}
String[]postGroup = setupPostgroup(); {S:154565 E:154602 D:0 BT: 0}
int aLine = 0; {S:154607 E:154620 D:0 BT: 0}
rtnVal += getCommentList(); {S:154625 E:154651 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:154656 E:156724 D:0 BT: 0}
<sublist>
LineInfoTest li = getLine(i); {S:154697 E:154721 D:1 BT: 0}
final String GROUPTOKEN = LineInfoTest.BLOCKSTART + LineInfoTest.BLOCKEND; {S:154727 E:154792 D:1 BT: 0}
boolean isGroup = false; {S:154798 E:154821 D:1 BT: 0}
while(depth.getValue()>li.tabDepth){} {S:155524 E:155922 D:1 BT: 0}
<sublist>
rtnVal += initTab; {S:155675 E:155692 D:2 BT: 0}
depth.decrement(); {S:155699 E:155716 D:2 BT: 0}
for(int j = 0;j<depth.getValue();j ++)rtnVal += initTab; {S:155723 E:155788 D:2 BT: 0}
rtnVal += LineInfoTest.BLOCKEND + postGroup[depth.getValue()]+ "\n"; {S:155795 E:155859 D:2 BT: 0}
aLine ++; {S:155909 E:155916 D:2 BT: 0}
</sublist>
rtnVal += initTab; {S:155928 E:155945 D:1 BT: 0}
for(int j = 0;j<li.tabDepth;j ++)rtnVal += initTab; {S:155951 E:156010 D:1 BT: 0}
rtnVal += " //S:" + li.startChar + "   E:" + li.endChar + " D: " + li.tabDepth + "BT: " + li.branchType + "\n"; {S:156155 E:156265 D:1 BT: 0}
depth.setValue(li.tabDepth); {S:156276 E:156303 D:1 BT: 0}
li.assertionLine = aLine; {S:156418 E:156442 D:1 BT: 0}
aLine ++; {S:156473 E:156480 D:1 BT: 0}
</sublist>
LineInfoTest li = getLine(i); {S:154697 E:154721 D:1 BT: 0}
final String GROUPTOKEN = LineInfoTest.BLOCKSTART + LineInfoTest.BLOCKEND; {S:154727 E:154792 D:1 BT: 0}
boolean isGroup = false; {S:154798 E:154821 D:1 BT: 0}
 {S:154854 E:155213 D:1 BT: 7}
if(li.lineText.endsWith(GROUPTOKEN)){} {S:154855 E:155213 D:1 BT: 1}
 {S:154963 E:155207 D:2 BT: 7}
if((i + 1)<size()){} {S:154964 E:155207 D:2 BT: 1}
LineInfoTest lz = getLine(i + 1); {S:154998 E:155026 D:3 BT: 0}
 {S:155033 E:155200 D:3 BT: 7}
if(lz.tabDepth>li.tabDepth){} {S:155034 E:155200 D:3 BT: 1}
QuicktestRunner.execPath += 24; {S:155079 E:0 D:4 BT: 0}
isGroup = true; {S:155079 E:155093 D:4 BT: 0}
li.lineText = li.lineText.substring(0 , li.lineText.length()- GROUPTOKEN.length()); {S:155102 E:155184 D:4 BT: 0}
else {S:155200 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 16; {S:155201 E:0 D:4 BT: 0}
else {S:155207 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 8; {S:155208 E:0 D:3 BT: 0}
 {S:155218 E:155518 D:1 BT: 7}
if(depth.getValue()<li.tabDepth){} {S:155219 E:155518 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:155367 E:0 D:2 BT: 0}
rtnVal += initTab; {S:155367 E:155384 D:2 BT: 0}
for(int j = 0;j<li.tabDepth - 1;j ++)rtnVal += initTab; {S:155391 E:155455 D:2 BT: 0}
rtnVal += LineInfoTest.BLOCKSTART + "\n"; {S:155462 E:155498 D:2 BT: 0}
aLine ++; {S:155505 E:155512 D:2 BT: 0}
while(depth.getValue()>li.tabDepth){} {S:155524 E:155922 D:1 BT: 0}
<sublist>
rtnVal += initTab; {S:155675 E:155692 D:2 BT: 0}
depth.decrement(); {S:155699 E:155716 D:2 BT: 0}
for(int j = 0;j<depth.getValue();j ++)rtnVal += initTab; {S:155723 E:155788 D:2 BT: 0}
rtnVal += LineInfoTest.BLOCKEND + postGroup[depth.getValue()]+ "\n"; {S:155795 E:155859 D:2 BT: 0}
aLine ++; {S:155909 E:155916 D:2 BT: 0}
</sublist>
rtnVal += initTab; {S:155675 E:155692 D:2 BT: 0}
depth.decrement(); {S:155699 E:155716 D:2 BT: 0}
for(int j = 0;j<depth.getValue();j ++)rtnVal += initTab; {S:155723 E:155788 D:2 BT: 0}
rtnVal += LineInfoTest.BLOCKEND + postGroup[depth.getValue()]+ "\n"; {S:155795 E:155859 D:2 BT: 0}
aLine ++; {S:155909 E:155916 D:2 BT: 0}
rtnVal += initTab; {S:155928 E:155945 D:1 BT: 0}
for(int j = 0;j<li.tabDepth;j ++)rtnVal += initTab; {S:155951 E:156010 D:1 BT: 0}
 {S:156015 E:156139 D:1 BT: 7}
if(usePathCode == true){} {S:156016 E:156112 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:156045 E:0 D:2 BT: 0}
rtnVal += li.outputPathCode(LineInfoTest.NOWSCHARS); {S:156045 E:156092 D:2 BT: 0}
else{} {S:156113 E:156139 D:1 BT: 2}
rtnVal += li.lineText; {S:156118 E:156139 D:2 BT: 0}
rtnVal += " //S:" + li.startChar + "   E:" + li.endChar + " D: " + li.tabDepth + "BT: " + li.branchType + "\n"; {S:156155 E:156265 D:1 BT: 0}
depth.setValue(li.tabDepth); {S:156276 E:156303 D:1 BT: 0}
 {S:156308 E:156412 D:1 BT: 7}
if(isGroup){} {S:156309 E:156412 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:156332 E:0 D:2 BT: 0}
li.lineText += GROUPTOKEN; {S:156332 E:156357 D:2 BT: 0}
postGroup[li.tabDepth]= li.getPostgroup(); {S:156364 E:156406 D:2 BT: 0}
li.assertionLine = aLine; {S:156418 E:156442 D:1 BT: 0}
aLine ++; {S:156473 E:156480 D:1 BT: 0}
while(depth.getValue()>0){} {S:156789 E:157148 D:0 BT: 0}
<sublist>
rtnVal += initTab; {S:156826 E:156843 D:1 BT: 0}
depth.decrement(); {S:156849 E:156866 D:1 BT: 0}
for(int j = 0;j<depth.getValue();j ++)rtnVal += initTab; {S:156872 E:156936 D:1 BT: 0}
rtnVal += LineInfoTest.BLOCKEND; {S:156942 E:156969 D:1 BT: 0}
rtnVal += postGroup[depth.getValue()]+ "\n"; {S:157014 E:157058 D:1 BT: 0}
</sublist>
rtnVal += initTab; {S:156826 E:156843 D:1 BT: 0}
depth.decrement(); {S:156849 E:156866 D:1 BT: 0}
for(int j = 0;j<depth.getValue();j ++)rtnVal += initTab; {S:156872 E:156936 D:1 BT: 0}
rtnVal += LineInfoTest.BLOCKEND; {S:156942 E:156969 D:1 BT: 0}
rtnVal += postGroup[depth.getValue()]+ "\n"; {S:157014 E:157058 D:1 BT: 0}
return rtnVal; {S:157153 E:157166 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:154542   E:154560 D: 0BT: 0
   String[]postGroup = setupPostgroup(); //S:154565   E:154602 D: 0BT: 0
   int aLine = 0; //S:154607   E:154620 D: 0BT: 0
   rtnVal += getCommentList(); //S:154625   E:154651 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:154656   E:156724 D: 0BT: 0
   {
      LineInfoTest li = getLine(i); //S:154697   E:154721 D: 1BT: 0
      final String GROUPTOKEN = LineInfoTest.BLOCKSTART + LineInfoTest.BLOCKEND; //S:154727   E:154792 D: 1BT: 0
      boolean isGroup = false; //S:154798   E:154821 D: 1BT: 0
       //S:154854   E:155213 D: 1BT: 7
      if(li.lineText.endsWith(GROUPTOKEN)) //S:154855   E:155213 D: 1BT: 1
      {
          //S:154963   E:155207 D: 2BT: 7
         if((i + 1)<size()) //S:154964   E:155207 D: 2BT: 1
         {
            LineInfoTest lz = getLine(i + 1); //S:154998   E:155026 D: 3BT: 0
             //S:155033   E:155200 D: 3BT: 7
            if(lz.tabDepth>li.tabDepth) //S:155034   E:155200 D: 3BT: 1
            {
               QuicktestRunner.execPath += 24; //S:155079   E:0 D: 4BT: 0
               isGroup = true; //S:155079   E:155093 D: 4BT: 0
               li.lineText = li.lineText.substring(0 , li.lineText.length()- GROUPTOKEN.length()); //S:155102   E:155184 D: 4BT: 0
            }
            else //S:155200   E:0 D: 3BT: 0
            {
               QuicktestRunner.execPath += 16; //S:155201   E:0 D: 4BT: 0
            }
         }
         else //S:155207   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 8; //S:155208   E:0 D: 3BT: 0
         }
      }
       //S:155218   E:155518 D: 1BT: 7
      if(depth.getValue()<li.tabDepth) //S:155219   E:155518 D: 1BT: 1
      {
         QuicktestRunner.execPath += 4; //S:155367   E:0 D: 2BT: 0
         rtnVal += initTab; //S:155367   E:155384 D: 2BT: 0
         for(int j = 0;j<li.tabDepth - 1;j ++)rtnVal += initTab; //S:155391   E:155455 D: 2BT: 0
         rtnVal += LineInfoTest.BLOCKSTART + "\n"; //S:155462   E:155498 D: 2BT: 0
         aLine ++; //S:155505   E:155512 D: 2BT: 0
      }
      while(depth.getValue()>li.tabDepth) //S:155524   E:155922 D: 1BT: 0
      {
         rtnVal += initTab; //S:155675   E:155692 D: 2BT: 0
         depth.decrement(); //S:155699   E:155716 D: 2BT: 0
         for(int j = 0;j<depth.getValue();j ++)rtnVal += initTab; //S:155723   E:155788 D: 2BT: 0
         rtnVal += LineInfoTest.BLOCKEND + postGroup[depth.getValue()]+ "\n"; //S:155795   E:155859 D: 2BT: 0
         aLine ++; //S:155909   E:155916 D: 2BT: 0
      }
      rtnVal += initTab; //S:155928   E:155945 D: 1BT: 0
      for(int j = 0;j<li.tabDepth;j ++)rtnVal += initTab; //S:155951   E:156010 D: 1BT: 0
       //S:156015   E:156139 D: 1BT: 7
      if(usePathCode == true) //S:156016   E:156112 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:156045   E:0 D: 2BT: 0
         rtnVal += li.outputPathCode(LineInfoTest.NOWSCHARS); //S:156045   E:156092 D: 2BT: 0
      }
      else //S:156113   E:156139 D: 1BT: 2
      {
         rtnVal += li.lineText; //S:156118   E:156139 D: 2BT: 0
      }
      rtnVal += " //S:" + li.startChar + "   E:" + li.endChar + " D: " + li.tabDepth + "BT: " + li.branchType + "\n"; //S:156155   E:156265 D: 1BT: 0
      depth.setValue(li.tabDepth); //S:156276   E:156303 D: 1BT: 0
       //S:156308   E:156412 D: 1BT: 7
      if(isGroup) //S:156309   E:156412 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:156332   E:0 D: 2BT: 0
         li.lineText += GROUPTOKEN; //S:156332   E:156357 D: 2BT: 0
         postGroup[li.tabDepth]= li.getPostgroup(); //S:156364   E:156406 D: 2BT: 0
      }
      li.assertionLine = aLine; //S:156418   E:156442 D: 1BT: 0
      aLine ++; //S:156473   E:156480 D: 1BT: 0
   }
   while(depth.getValue()>0) //S:156789   E:157148 D: 0BT: 0
   {
      rtnVal += initTab; //S:156826   E:156843 D: 1BT: 0
      depth.decrement(); //S:156849   E:156866 D: 1BT: 0
      for(int j = 0;j<depth.getValue();j ++)rtnVal += initTab; //S:156872   E:156936 D: 1BT: 0
      rtnVal += LineInfoTest.BLOCKEND; //S:156942   E:156969 D: 1BT: 0
      rtnVal += postGroup[depth.getValue()]+ "\n"; //S:157014   E:157058 D: 1BT: 0
   }
   return rtnVal; //S:157153   E:157166 D: 0BT: 0
   }

   public void output(String tab, int outputType)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:24 CP:0
/***************************
Processing list:
final String GROUPTOKEN = LineInfoTest.BLOCKSTART + LineInfoTest.BLOCKEND; {S:157309 E:157374 D:0 BT: 0}
boolean isGroup = false; {S:157379 E:157402 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:157407 E:158229 D:0 BT: 0}
<sublist>
LineInfoTest li = getLine(i); {S:157448 E:157472 D:1 BT: 0}
li.subLines.output(tab + "   " , outputType); {S:158050 E:158093 D:1 BT: 0}
isGroup = false; {S:158209 E:158224 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
final String GROUPTOKEN = LineInfoTest.BLOCKSTART + LineInfoTest.BLOCKEND; {S:157309 E:157374 D:0 BT: 0}
boolean isGroup = false; {S:157379 E:157402 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:157407 E:158229 D:0 BT: 0}
<sublist>
LineInfoTest li = getLine(i); {S:157448 E:157472 D:1 BT: 0}
li.subLines.output(tab + "   " , outputType); {S:158050 E:158093 D:1 BT: 0}
isGroup = false; {S:158209 E:158224 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:157477 E:157692 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:157477 E:157692 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
switch(outputType){case CODE:case TESTPATH:} {S:157698 E:157976 D:1 BT: 3}
****************************/
/***************************
Processing list:
switch(outputType){} {S:157698 E:157976 D:1 BT: 3}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:157981 E:158044 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:157981 E:158044 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#5(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:158098 E:158203 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:158098 E:158203 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(2) Type:1 Paths:1 CP:12
/***************************
Processing list:
if(li.lineText.endsWith(GROUPTOKEN)){} {S:157478 E:157692 D:1 BT: 1}
isGroup = true; {S:157526 E:157540 D:2 BT: 0}
li.lineText = li.lineText.substring(0 , li.lineText.length()- GROUPTOKEN.length()); {S:157604 E:157686 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(li.lineText.endsWith(GROUPTOKEN)){} {S:157478 E:157692 D:1 BT: 1}
QuicktestRunner.execPath += 12; {S:157526 E:0 D:2 BT: 0}
isGroup = true; {S:157526 E:157540 D:2 BT: 0}
li.lineText = li.lineText.substring(0 , li.lineText.length()- GROUPTOKEN.length()); {S:157604 E:157686 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#7(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#8(3) Type:4 Paths:1 CP:8
/***************************
Processing list:
case CODE: {S:157727 E:157862 D:2 BT: 4}
System.out.println(tab + li.lineText + ":" + li.getStartChar()+ " " + li.getEndChar()+ " " + li.tabDepth); {S:157743 E:157850 D:3 BT: 0}
break; {S:157857 E:157862 D:3 BT: 0}
****************************/
/***************************
Processing list:
case CODE: {S:157727 E:157862 D:2 BT: 4}
QuicktestRunner.execPath += 8; {S:157743 E:0 D:3 BT: 0}
System.out.println(tab + li.lineText + ":" + li.getStartChar()+ " " + li.getEndChar()+ " " + li.tabDepth); {S:157743 E:157850 D:3 BT: 0}
break; {S:157857 E:157862 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#9(3) Type:4 Paths:1 CP:4
/***************************
Processing list:
case TESTPATH: {S:157868 E:157970 D:2 BT: 4}
System.out.println(tab + li.outputPathCode(".;[]():")); {S:157904 E:157958 D:3 BT: 0}
break; {S:157965 E:157970 D:3 BT: 0}
****************************/
/***************************
Processing list:
case TESTPATH: {S:157868 E:157970 D:2 BT: 4}
QuicktestRunner.execPath += 4; {S:157904 E:0 D:3 BT: 0}
System.out.println(tab + li.outputPathCode(".;[]():")); {S:157904 E:157958 D:3 BT: 0}
break; {S:157965 E:157970 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#10(3) Type:5 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#11(4) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(isGroup) {S:157982 E:158044 D:1 BT: 1}
System.out.println(tab + LineInfoTest.BLOCKSTART); {S:157999 E:158044 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(isGroup){} {S:157982 E:158044 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:157999 E:0 D:2 BT: 0}
System.out.println(tab + LineInfoTest.BLOCKSTART); {S:157999 E:158044 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#12(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#13(5) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(isGroup){} {S:158099 E:158203 D:1 BT: 1}
System.out.println(tab + LineInfoTest.BLOCKEND); {S:158122 E:158165 D:2 BT: 0}
li.lineText += GROUPTOKEN; {S:158172 E:158197 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(isGroup){} {S:158099 E:158203 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:158122 E:0 D:2 BT: 0}
System.out.println(tab + LineInfoTest.BLOCKEND); {S:158122 E:158165 D:2 BT: 0}
li.lineText += GROUPTOKEN; {S:158172 E:158197 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#14(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
final String GROUPTOKEN = LineInfoTest.BLOCKSTART + LineInfoTest.BLOCKEND; {S:157309 E:157374 D:0 BT: 0}
boolean isGroup = false; {S:157379 E:157402 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:157407 E:158229 D:0 BT: 0}
<sublist>
LineInfoTest li = getLine(i); {S:157448 E:157472 D:1 BT: 0}
li.subLines.output(tab + "   " , outputType); {S:158050 E:158093 D:1 BT: 0}
isGroup = false; {S:158209 E:158224 D:1 BT: 0}
</sublist>
LineInfoTest li = getLine(i); {S:157448 E:157472 D:1 BT: 0}
 {S:157477 E:157692 D:1 BT: 7}
if(li.lineText.endsWith(GROUPTOKEN)){} {S:157478 E:157692 D:1 BT: 1}
QuicktestRunner.execPath += 12; {S:157526 E:0 D:2 BT: 0}
isGroup = true; {S:157526 E:157540 D:2 BT: 0}
li.lineText = li.lineText.substring(0 , li.lineText.length()- GROUPTOKEN.length()); {S:157604 E:157686 D:2 BT: 0}
switch(outputType){} {S:157698 E:157976 D:1 BT: 3}
case CODE: {S:157727 E:157862 D:2 BT: 4}
QuicktestRunner.execPath += 8; {S:157743 E:0 D:3 BT: 0}
System.out.println(tab + li.lineText + ":" + li.getStartChar()+ " " + li.getEndChar()+ " " + li.tabDepth); {S:157743 E:157850 D:3 BT: 0}
break; {S:157857 E:157862 D:3 BT: 0}
case TESTPATH: {S:157868 E:157970 D:2 BT: 4}
QuicktestRunner.execPath += 4; {S:157904 E:0 D:3 BT: 0}
System.out.println(tab + li.outputPathCode(".;[]():")); {S:157904 E:157958 D:3 BT: 0}
break; {S:157965 E:157970 D:3 BT: 0}
 {S:157981 E:158044 D:1 BT: 7}
if(isGroup){} {S:157982 E:158044 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:157999 E:0 D:2 BT: 0}
System.out.println(tab + LineInfoTest.BLOCKSTART); {S:157999 E:158044 D:2 BT: 0}
li.subLines.output(tab + "   " , outputType); {S:158050 E:158093 D:1 BT: 0}
 {S:158098 E:158203 D:1 BT: 7}
if(isGroup){} {S:158099 E:158203 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:158122 E:0 D:2 BT: 0}
System.out.println(tab + LineInfoTest.BLOCKEND); {S:158122 E:158165 D:2 BT: 0}
li.lineText += GROUPTOKEN; {S:158172 E:158197 D:2 BT: 0}
isGroup = false; {S:158209 E:158224 D:1 BT: 0}
****************************/
   final String GROUPTOKEN = LineInfoTest.BLOCKSTART + LineInfoTest.BLOCKEND; //S:157309   E:157374 D: 0BT: 0
   boolean isGroup = false; //S:157379   E:157402 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:157407   E:158229 D: 0BT: 0
   {
      LineInfoTest li = getLine(i); //S:157448   E:157472 D: 1BT: 0
       //S:157477   E:157692 D: 1BT: 7
      if(li.lineText.endsWith(GROUPTOKEN)) //S:157478   E:157692 D: 1BT: 1
      {
         QuicktestRunner.execPath += 12; //S:157526   E:0 D: 2BT: 0
         isGroup = true; //S:157526   E:157540 D: 2BT: 0
         li.lineText = li.lineText.substring(0 , li.lineText.length()- GROUPTOKEN.length()); //S:157604   E:157686 D: 2BT: 0
      }
      switch(outputType) //S:157698   E:157976 D: 1BT: 3
      {
         case CODE: //S:157727   E:157862 D: 2BT: 4
         {
            QuicktestRunner.execPath += 8; //S:157743   E:0 D: 3BT: 0
            System.out.println(tab + li.lineText + ":" + li.getStartChar()+ " " + li.getEndChar()+ " " + li.tabDepth); //S:157743   E:157850 D: 3BT: 0
            break; //S:157857   E:157862 D: 3BT: 0
         }
         case TESTPATH: //S:157868   E:157970 D: 2BT: 4
         {
            QuicktestRunner.execPath += 4; //S:157904   E:0 D: 3BT: 0
            System.out.println(tab + li.outputPathCode(".;[]():")); //S:157904   E:157958 D: 3BT: 0
            break; //S:157965   E:157970 D: 3BT: 0
         }
      }
       //S:157981   E:158044 D: 1BT: 7
      if(isGroup) //S:157982   E:158044 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:157999   E:0 D: 2BT: 0
         System.out.println(tab + LineInfoTest.BLOCKSTART); //S:157999   E:158044 D: 2BT: 0
      }
      li.subLines.output(tab + "   " , outputType); //S:158050   E:158093 D: 1BT: 0
       //S:158098   E:158203 D: 1BT: 7
      if(isGroup) //S:158099   E:158203 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:158122   E:0 D: 2BT: 0
         System.out.println(tab + LineInfoTest.BLOCKEND); //S:158122   E:158165 D: 2BT: 0
         li.lineText += GROUPTOKEN; //S:158172   E:158197 D: 2BT: 0
      }
      isGroup = false; //S:158209   E:158224 D: 1BT: 0
   }
   }

   public void group()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:3 CP:0
/***************************
Processing list:
sort(); {S:158267 E:158273 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:158334 E:158966 D:0 BT: 0}
<sublist>
LineInfoTest li = getLine(i); {S:158375 E:158399 D:1 BT: 0}
int min = li.startChar; {S:158454 E:158476 D:1 BT: 0}
int max = li.endChar; {S:158482 E:158502 D:1 BT: 0}
int baseDepth = li.tabDepth; {S:158508 E:158535 D:1 BT: 0}
for(int j = i + 1;j<size();j ++){} {S:158541 E:158936 D:1 BT: 0}
<sublist>
LineInfoTest li2 = getLine(j); {S:158588 E:158613 D:2 BT: 0}
li2.tabDepth = baseDepth; {S:158620 E:158644 D:2 BT: 0}
</sublist>
li.subLines.group(); {S:158942 E:158961 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
sort(); {S:158267 E:158273 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:158334 E:158966 D:0 BT: 0}
<sublist>
LineInfoTest li = getLine(i); {S:158375 E:158399 D:1 BT: 0}
int min = li.startChar; {S:158454 E:158476 D:1 BT: 0}
int max = li.endChar; {S:158482 E:158502 D:1 BT: 0}
int baseDepth = li.tabDepth; {S:158508 E:158535 D:1 BT: 0}
for(int j = i + 1;j<size();j ++){} {S:158541 E:158936 D:1 BT: 0}
<sublist>
LineInfoTest li2 = getLine(j); {S:158588 E:158613 D:2 BT: 0}
li2.tabDepth = baseDepth; {S:158620 E:158644 D:2 BT: 0}
</sublist>
li.subLines.group(); {S:158942 E:158961 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:158650 E:158930 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:158650 E:158930 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(li2.startChar>min && li2.endChar<= max){} {S:158651 E:158930 D:2 BT: 1}
li.subLines.add(li2); {S:158875 E:158895 D:3 BT: 0}
remove(j); {S:158903 E:158912 D:3 BT: 0}
j --; {S:158920 E:158923 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(li2.startChar>min && li2.endChar<= max){} {S:158651 E:158930 D:2 BT: 1}
li.subLines.add(li2); {S:158875 E:158895 D:3 BT: 0}
remove(j); {S:158903 E:158912 D:3 BT: 0}
j --; {S:158920 E:158923 D:3 BT: 0}
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
 {S:158709 E:158811 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:158709 E:158811 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(li.lineText != ""){} {S:158710 E:158811 D:3 BT: 1}
li2.tabDepth ++; {S:158747 E:158761 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(li.lineText != ""){} {S:158710 E:158811 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:158747 E:0 D:4 BT: 0}
li2.tabDepth ++; {S:158747 E:158761 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:158811 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 1; {S:158812 E:0 D:4 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
sort(); {S:158267 E:158273 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:158334 E:158966 D:0 BT: 0}
<sublist>
LineInfoTest li = getLine(i); {S:158375 E:158399 D:1 BT: 0}
int min = li.startChar; {S:158454 E:158476 D:1 BT: 0}
int max = li.endChar; {S:158482 E:158502 D:1 BT: 0}
int baseDepth = li.tabDepth; {S:158508 E:158535 D:1 BT: 0}
for(int j = i + 1;j<size();j ++){} {S:158541 E:158936 D:1 BT: 0}
<sublist>
LineInfoTest li2 = getLine(j); {S:158588 E:158613 D:2 BT: 0}
li2.tabDepth = baseDepth; {S:158620 E:158644 D:2 BT: 0}
</sublist>
li.subLines.group(); {S:158942 E:158961 D:1 BT: 0}
</sublist>
LineInfoTest li = getLine(i); {S:158375 E:158399 D:1 BT: 0}
int min = li.startChar; {S:158454 E:158476 D:1 BT: 0}
int max = li.endChar; {S:158482 E:158502 D:1 BT: 0}
int baseDepth = li.tabDepth; {S:158508 E:158535 D:1 BT: 0}
for(int j = i + 1;j<size();j ++){} {S:158541 E:158936 D:1 BT: 0}
<sublist>
LineInfoTest li2 = getLine(j); {S:158588 E:158613 D:2 BT: 0}
li2.tabDepth = baseDepth; {S:158620 E:158644 D:2 BT: 0}
</sublist>
LineInfoTest li2 = getLine(j); {S:158588 E:158613 D:2 BT: 0}
li2.tabDepth = baseDepth; {S:158620 E:158644 D:2 BT: 0}
 {S:158650 E:158930 D:2 BT: 7}
if(li2.startChar>min && li2.endChar<= max){} {S:158651 E:158930 D:2 BT: 1}
 {S:158709 E:158811 D:3 BT: 7}
if(li.lineText != ""){} {S:158710 E:158811 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:158747 E:0 D:4 BT: 0}
li2.tabDepth ++; {S:158747 E:158761 D:4 BT: 0}
else {S:158811 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 1; {S:158812 E:0 D:4 BT: 0}
li.subLines.add(li2); {S:158875 E:158895 D:3 BT: 0}
remove(j); {S:158903 E:158912 D:3 BT: 0}
j --; {S:158920 E:158923 D:3 BT: 0}
li.subLines.group(); {S:158942 E:158961 D:1 BT: 0}
****************************/
   sort(); //S:158267   E:158273 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:158334   E:158966 D: 0BT: 0
   {
      LineInfoTest li = getLine(i); //S:158375   E:158399 D: 1BT: 0
      int min = li.startChar; //S:158454   E:158476 D: 1BT: 0
      int max = li.endChar; //S:158482   E:158502 D: 1BT: 0
      int baseDepth = li.tabDepth; //S:158508   E:158535 D: 1BT: 0
      for(int j = i + 1;j<size();j ++) //S:158541   E:158936 D: 1BT: 0
      {
         LineInfoTest li2 = getLine(j); //S:158588   E:158613 D: 2BT: 0
         li2.tabDepth = baseDepth; //S:158620   E:158644 D: 2BT: 0
          //S:158650   E:158930 D: 2BT: 7
         if(li2.startChar>min && li2.endChar<= max) //S:158651   E:158930 D: 2BT: 1
         {
             //S:158709   E:158811 D: 3BT: 7
            if(li.lineText != "") //S:158710   E:158811 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:158747   E:0 D: 4BT: 0
               li2.tabDepth ++; //S:158747   E:158761 D: 4BT: 0
            }
            else //S:158811   E:0 D: 3BT: 0
            {
               QuicktestRunner.execPath += 1; //S:158812   E:0 D: 4BT: 0
            }
            li.subLines.add(li2); //S:158875   E:158895 D: 3BT: 0
            remove(j); //S:158903   E:158912 D: 3BT: 0
            j --; //S:158920   E:158923 D: 3BT: 0
         }
      }
      li.subLines.group(); //S:158942   E:158961 D: 1BT: 0
   }
   }

public void groupTest_0()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   group();
   //Post-test

}

public void groupTest_1()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   group();
   //Post-test

}

public void groupTest_2()
{
   //Class Setup
   //Line Inputs
   //Add'l Setup

   //Test Code
   group();
   //Post-test

}

   public void sort()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:2 CP:0
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:159043 E:159287 D:0 BT: 0}
<sublist>
for(int j = i + 1;j<size();j ++){} {S:159084 E:159282 D:1 BT: 0}
<sublist>
LineInfoTest li = getLine(i); {S:159131 E:159155 D:2 BT: 0}
LineInfoTest li2 = getLine(j); {S:159162 E:159187 D:2 BT: 0}
</sublist>
</sublist>
****************************/
/***************************
Processing list:
for(int i = 0;i<size();i ++){} {S:159043 E:159287 D:0 BT: 0}
<sublist>
for(int j = i + 1;j<size();j ++){} {S:159084 E:159282 D:1 BT: 0}
<sublist>
LineInfoTest li = getLine(i); {S:159131 E:159155 D:2 BT: 0}
LineInfoTest li2 = getLine(j); {S:159162 E:159187 D:2 BT: 0}
</sublist>
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:159193 E:159276 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:159193 E:159276 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(li.startChar>li2.startChar){} {S:159194 E:159276 D:2 BT: 1}
set(i , li2); {S:159240 E:159251 D:3 BT: 0}
set(j , li); {S:159259 E:159269 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(li.startChar>li2.startChar){} {S:159194 E:159276 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:159240 E:0 D:3 BT: 0}
set(i , li2); {S:159240 E:159251 D:3 BT: 0}
set(j , li); {S:159259 E:159269 D:3 BT: 0}
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
for(int i = 0;i<size();i ++){} {S:159043 E:159287 D:0 BT: 0}
<sublist>
for(int j = i + 1;j<size();j ++){} {S:159084 E:159282 D:1 BT: 0}
<sublist>
LineInfoTest li = getLine(i); {S:159131 E:159155 D:2 BT: 0}
LineInfoTest li2 = getLine(j); {S:159162 E:159187 D:2 BT: 0}
</sublist>
</sublist>
for(int j = i + 1;j<size();j ++){} {S:159084 E:159282 D:1 BT: 0}
<sublist>
LineInfoTest li = getLine(i); {S:159131 E:159155 D:2 BT: 0}
LineInfoTest li2 = getLine(j); {S:159162 E:159187 D:2 BT: 0}
</sublist>
LineInfoTest li = getLine(i); {S:159131 E:159155 D:2 BT: 0}
LineInfoTest li2 = getLine(j); {S:159162 E:159187 D:2 BT: 0}
 {S:159193 E:159276 D:2 BT: 7}
if(li.startChar>li2.startChar){} {S:159194 E:159276 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:159240 E:0 D:3 BT: 0}
set(i , li2); {S:159240 E:159251 D:3 BT: 0}
set(j , li); {S:159259 E:159269 D:3 BT: 0}
****************************/
   for(int i = 0;i<size();i ++) //S:159043   E:159287 D: 0BT: 0
   {
      for(int j = i + 1;j<size();j ++) //S:159084   E:159282 D: 1BT: 0
      {
         LineInfoTest li = getLine(i); //S:159131   E:159155 D: 2BT: 0
         LineInfoTest li2 = getLine(j); //S:159162   E:159187 D: 2BT: 0
          //S:159193   E:159276 D: 2BT: 7
         if(li.startChar>li2.startChar) //S:159194   E:159276 D: 2BT: 1
         {
            QuicktestRunner.execPath += 1; //S:159240   E:0 D: 3BT: 0
            set(i , li2); //S:159240   E:159251 D: 3BT: 0
            set(j , li); //S:159259   E:159269 D: 3BT: 0
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

   public LineListTest(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

