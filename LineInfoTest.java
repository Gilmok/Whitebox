import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class LineInfoTest extends CodeMemberTest
{
   public ParseTree tree;
   public int branchType;
   public int tabDepth;
   public String lineText;
   public String condition;
   public LinkedList textTokens;
   public LineListTest subLines;
   public int assertionLine;
   public static final int IF = 1;
   public static final int ELSE = 2;
   public static final int SWITCH = 3;
   public static final int CASE = 4;
   public static final int DEFAULT = 5;
   public static final int TRY = 6;
   public static final int TERNARY = 7;
   public static final String NOWSCHARS = ".[]();:{}<>";
   public static final String BLOCKSTART = "{";
   public static final String BLOCKEND = "}";
   public static final String[] ASSIGNS = {"+=","++","-=","--","*=","/=","="};
   public  static final String STATIC_APPEND = ":STATIC";

   private void makeStatic(ParseTree in)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:3 CP:0
/***************************
Processing list:
for(int i = 0;i<in.getChildCount();i ++){} {S:131522 E:132152 D:0 BT: 0}
<sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:131575 E:131615 D:1 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
for(int i = 0;i<in.getChildCount();i ++){} {S:131522 E:132152 D:0 BT: 0}
<sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:131575 E:131615 D:1 BT: 0}
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:131763 E:132147 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:131763 E:132147 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(x.payload instanceof String){} {S:131764 E:132147 D:1 BT: 1}
String str = new String((String)x.payload); {S:131898 E:131941 D:2 BT: 0}
makeStatic(x); {S:132128 E:132141 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(x.payload instanceof String){} {S:131764 E:132147 D:1 BT: 1}
String str = new String((String)x.payload); {S:131898 E:131941 D:2 BT: 0}
makeStatic(x); {S:132128 E:132141 D:2 BT: 0}
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
 {S:131947 E:132083 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:131947 E:132083 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(str.equals("blockStatement")){} {S:131948 E:132083 D:2 BT: 1}
str += STATIC_APPEND; {S:131994 E:132014 D:3 BT: 0}
x.payload = str; {S:132022 E:132037 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(str.equals("blockStatement")){} {S:131948 E:132083 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:131994 E:0 D:3 BT: 0}
str += STATIC_APPEND; {S:131994 E:132014 D:3 BT: 0}
x.payload = str; {S:132022 E:132037 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:132083 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:132084 E:0 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
for(int i = 0;i<in.getChildCount();i ++){} {S:131522 E:132152 D:0 BT: 0}
<sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:131575 E:131615 D:1 BT: 0}
</sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:131575 E:131615 D:1 BT: 0}
 {S:131763 E:132147 D:1 BT: 7}
if(x.payload instanceof String){} {S:131764 E:132147 D:1 BT: 1}
String str = new String((String)x.payload); {S:131898 E:131941 D:2 BT: 0}
 {S:131947 E:132083 D:2 BT: 7}
if(str.equals("blockStatement")){} {S:131948 E:132083 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:131994 E:0 D:3 BT: 0}
str += STATIC_APPEND; {S:131994 E:132014 D:3 BT: 0}
x.payload = str; {S:132022 E:132037 D:3 BT: 0}
else {S:132083 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:132084 E:0 D:3 BT: 0}
makeStatic(x); {S:132128 E:132141 D:2 BT: 0}
****************************/
   for(int i = 0;i<in.getChildCount();i ++) //S:131522   E:132152 D: 0BT: 0
   {
      ParseTree x =(ParseTree)in.getChild(i); //S:131575   E:131615 D: 1BT: 0
       //S:131763   E:132147 D: 1BT: 7
      if(x.payload instanceof String) //S:131764   E:132147 D: 1BT: 1
      {
         String str = new String((String)x.payload); //S:131898   E:131941 D: 2BT: 0
          //S:131947   E:132083 D: 2BT: 7
         if(str.equals("blockStatement")) //S:131948   E:132083 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:131994   E:0 D: 3BT: 0
            str += STATIC_APPEND; //S:131994   E:132014 D: 3BT: 0
            x.payload = str; //S:132022   E:132037 D: 3BT: 0
         }
         else //S:132083   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 1; //S:132084   E:0 D: 3BT: 0
         }
         makeStatic(x); //S:132128   E:132141 D: 2BT: 0
      }
   }
   }

   public LineInfoTest(ParseTree in, ParseTree info, String fromFile, Integer xx)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:16 CP:0
/***************************
Processing list:
isStatic = false; {S:132425 E:132441 D:0 BT: 0}
tree = in; {S:132920 E:132929 D:0 BT: 0}
lineText = ""; {S:132936 E:132949 D:0 BT: 0}
for(int i = 0;i<in.getChildCount();i ++){} {S:132956 E:133208 D:0 BT: 0}
<sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:133013 E:133053 D:1 BT: 0}
</sublist>
textTokens = new LinkedList(); {S:133215 E:133244 D:0 BT: 0}
lineText = getLineText(in , true , NOWSCHARS); {S:133251 E:133294 D:0 BT: 0}
subLines = new LineListTest(); {S:133420 E:133445 D:0 BT: 0}
condition = ""; {S:133452 E:133466 D:0 BT: 0}
branchType = 0; {S:133473 E:133487 D:0 BT: 0}
****************************/
/***************************
Processing list:
isStatic = false; {S:132425 E:132441 D:0 BT: 0}
tree = in; {S:132920 E:132929 D:0 BT: 0}
lineText = ""; {S:132936 E:132949 D:0 BT: 0}
for(int i = 0;i<in.getChildCount();i ++){} {S:132956 E:133208 D:0 BT: 0}
<sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:133013 E:133053 D:1 BT: 0}
</sublist>
textTokens = new LinkedList(); {S:133215 E:133244 D:0 BT: 0}
lineText = getLineText(in , true , NOWSCHARS); {S:133251 E:133294 D:0 BT: 0}
subLines = new LineListTest(); {S:133420 E:133445 D:0 BT: 0}
condition = ""; {S:133452 E:133466 D:0 BT: 0}
branchType = 0; {S:133473 E:133487 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:4 CP:0
/***************************
Processing list:
 {S:132449 E:132839 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:132449 E:132839 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:132843 E:132913 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:132843 E:132913 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:133101 E:133201 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:133101 E:133201 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:3 CP:0
/***************************
Processing list:
if(info != null){} {S:132450 E:132839 D:0 BT: 1}
****************************/
/***************************
Processing list:
if(info != null){} {S:132450 E:132839 D:0 BT: 1}
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
if(in.payload.toString().endsWith(STATIC_APPEND)) {S:132844 E:132913 D:0 BT: 1}
isStatic = true; {S:132898 E:132913 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(in.payload.toString().endsWith(STATIC_APPEND)){} {S:132844 E:132913 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:132898 E:0 D:1 BT: 0}
isStatic = true; {S:132898 E:132913 D:1 BT: 0}
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
if(x.getText().equals("ClassOrInterfaceDecl")){} {S:133102 E:133201 D:1 BT: 1}
in.deleteChild(i); {S:133164 E:133181 D:2 BT: 0}
i --; {S:133190 E:133193 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(x.getText().equals("ClassOrInterfaceDecl")){} {S:133102 E:133201 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:133164 E:0 D:2 BT: 0}
in.deleteChild(i); {S:133164 E:133181 D:2 BT: 0}
i --; {S:133190 E:133193 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(5) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:132517 E:132834 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:132517 E:132834 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#12(11) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(info.getText().equals("classBodyDeclaration")){} {S:132518 E:132834 D:1 BT: 1}
ParseTree ch1 =(ParseTree)info.getChild(0); {S:132585 E:132629 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(info.getText().equals("classBodyDeclaration")){} {S:132518 E:132834 D:1 BT: 1}
ParseTree ch1 =(ParseTree)info.getChild(0); {S:132585 E:132629 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#13(11) Type:2 Paths:1 CP:4

/***************************
Processing list:
else {S:132834 E:0 D:1 BT: 0}
QuicktestRunner.execPath += 4; {S:132835 E:0 D:2 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#14(12) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:132677 E:132828 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:132677 E:132828 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#15(14) Type:1 Paths:1 CP:12
/***************************
Processing list:
if(ch1.getText().equals("static")){} {S:132678 E:132828 D:2 BT: 1}
makeStatic(info); {S:132780 E:132796 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(ch1.getText().equals("static")){} {S:132678 E:132828 D:2 BT: 1}
QuicktestRunner.execPath += 12; {S:132780 E:0 D:3 BT: 0}
makeStatic(info); {S:132780 E:132796 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#16(14) Type:2 Paths:1 CP:8

/***************************
Processing list:
else {S:132828 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 8; {S:132829 E:0 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
isStatic = false; {S:132425 E:132441 D:0 BT: 0}
 {S:132449 E:132839 D:0 BT: 7}
if(info != null){} {S:132450 E:132839 D:0 BT: 1}
 {S:132517 E:132834 D:1 BT: 7}
if(info.getText().equals("classBodyDeclaration")){} {S:132518 E:132834 D:1 BT: 1}
ParseTree ch1 =(ParseTree)info.getChild(0); {S:132585 E:132629 D:2 BT: 0}
 {S:132677 E:132828 D:2 BT: 7}
if(ch1.getText().equals("static")){} {S:132678 E:132828 D:2 BT: 1}
QuicktestRunner.execPath += 12; {S:132780 E:0 D:3 BT: 0}
makeStatic(info); {S:132780 E:132796 D:3 BT: 0}
else {S:132828 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 8; {S:132829 E:0 D:3 BT: 0}
else {S:132834 E:0 D:1 BT: 0}
QuicktestRunner.execPath += 4; {S:132835 E:0 D:2 BT: 0}
 {S:132843 E:132913 D:0 BT: 7}
if(in.payload.toString().endsWith(STATIC_APPEND)){} {S:132844 E:132913 D:0 BT: 1}
isStatic = true; {S:132898 E:132913 D:1 BT: 0}
QuicktestRunner.execPath += 2; {S:132898 E:0 D:1 BT: 0}
tree = in; {S:132920 E:132929 D:0 BT: 0}
lineText = ""; {S:132936 E:132949 D:0 BT: 0}
for(int i = 0;i<in.getChildCount();i ++){} {S:132956 E:133208 D:0 BT: 0}
<sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:133013 E:133053 D:1 BT: 0}
</sublist>
ParseTree x =(ParseTree)in.getChild(i); {S:133013 E:133053 D:1 BT: 0}
 {S:133101 E:133201 D:1 BT: 7}
if(x.getText().equals("ClassOrInterfaceDecl")){} {S:133102 E:133201 D:1 BT: 1}
in.deleteChild(i); {S:133164 E:133181 D:2 BT: 0}
QuicktestRunner.execPath += 1; {S:133164 E:0 D:2 BT: 0}
i --; {S:133190 E:133193 D:2 BT: 0}
textTokens = new LinkedList(); {S:133215 E:133244 D:0 BT: 0}
lineText = getLineText(in , true , NOWSCHARS); {S:133251 E:133294 D:0 BT: 0}
subLines = new LineListTest(); {S:133420 E:133445 D:0 BT: 0}
condition = ""; {S:133452 E:133466 D:0 BT: 0}
branchType = 0; {S:133473 E:133487 D:0 BT: 0}
****************************/
   isStatic = false; //S:132425   E:132441 D: 0BT: 0
    //S:132449   E:132839 D: 0BT: 7
   if(info != null) //S:132450   E:132839 D: 0BT: 1
   {
       //S:132517   E:132834 D: 1BT: 7
      if(info.getText().equals("classBodyDeclaration")) //S:132518   E:132834 D: 1BT: 1
      {
         ParseTree ch1 =(ParseTree)info.getChild(0); //S:132585   E:132629 D: 2BT: 0
          //S:132677   E:132828 D: 2BT: 7
         if(ch1.getText().equals("static")) //S:132678   E:132828 D: 2BT: 1
         {
            QuicktestRunner.execPath += 12; //S:132780   E:0 D: 3BT: 0
            makeStatic(info); //S:132780   E:132796 D: 3BT: 0
         }
         else //S:132828   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 8; //S:132829   E:0 D: 3BT: 0
         }
      }
      else //S:132834   E:0 D: 1BT: 0
      {
         QuicktestRunner.execPath += 4; //S:132835   E:0 D: 2BT: 0
      }
   }
    //S:132843   E:132913 D: 0BT: 7
   if(in.payload.toString().endsWith(STATIC_APPEND)) //S:132844   E:132913 D: 0BT: 1
   {
      isStatic = true; //S:132898   E:132913 D: 1BT: 0
      QuicktestRunner.execPath += 2; //S:132898   E:0 D: 1BT: 0
   }
   tree = in; //S:132920   E:132929 D: 0BT: 0
   lineText = ""; //S:132936   E:132949 D: 0BT: 0
   for(int i = 0;i<in.getChildCount();i ++) //S:132956   E:133208 D: 0BT: 0
   {
      ParseTree x =(ParseTree)in.getChild(i); //S:133013   E:133053 D: 1BT: 0
       //S:133101   E:133201 D: 1BT: 7
      if(x.getText().equals("ClassOrInterfaceDecl")) //S:133102   E:133201 D: 1BT: 1
      {
         in.deleteChild(i); //S:133164   E:133181 D: 2BT: 0
         QuicktestRunner.execPath += 1; //S:133164   E:0 D: 2BT: 0
         i --; //S:133190   E:133193 D: 2BT: 0
      }
   }
   textTokens = new LinkedList(); //S:133215   E:133244 D: 0BT: 0
   lineText = getLineText(in , true , NOWSCHARS); //S:133251   E:133294 D: 0BT: 0
   subLines = new LineListTest(); //S:133420   E:133445 D: 0BT: 0
   condition = ""; //S:133452   E:133466 D: 0BT: 0
   branchType = 0; //S:133473   E:133487 D: 0BT: 0
   }

   public LineInfoTest(String in, int tabWidth)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:7 CP:0
/***************************
Processing list:
int i = 0; {S:133603 E:133612 D:0 BT: 0}
int spc = 0; {S:133617 E:133628 D:0 BT: 0}
tabDepth = 0; {S:133633 E:133645 D:0 BT: 0}
int l = in.length(); {S:133650 E:133669 D:0 BT: 0}
****************************/
/***************************
Processing list:
int i = 0; {S:133603 E:133612 D:0 BT: 0}
int spc = 0; {S:133617 E:133628 D:0 BT: 0}
tabDepth = 0; {S:133633 E:133645 D:0 BT: 0}
int l = in.length(); {S:133650 E:133669 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:7 CP:0
/***************************
Processing list:
 {S:133673 E:134168 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:133673 E:134168 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:6
/***************************
Processing list:
if(l == 0){ {S:133674 E:133737 D:0 BT: 1}
tabDepth = 0; {S:133694 E:133706 D:1 BT: 0}
lineText = ""; {S:133712 E:133725 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(l == 0){} {S:133674 E:133737 D:0 BT: 1}
QuicktestRunner.execPath += 6; {S:133694 E:0 D:1 BT: 0}
tabDepth = 0; {S:133694 E:133706 D:1 BT: 0}
lineText = ""; {S:133712 E:133725 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:6 CP:0
/***************************
Processing list:
 {S:133738 E:134168 D:0 BT: 2}
while(in.charAt(i)== '\t'){} {S:133815 E:133943 D:0 BT: 0}
<sublist>
tabDepth ++; {S:133854 E:133864 D:1 BT: 0}
i ++; {S:133871 E:133874 D:1 BT: 0}
</sublist>
tabDepth += spc / tabWidth; {S:134111 E:134137 D:0 BT: 0}
lineText = in.trim(); {S:134143 E:134163 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:133738 E:134168 D:0 BT: 2}
while(in.charAt(i)== '\t'){} {S:133815 E:133943 D:1 BT: 0}
<sublist>
tabDepth ++; {S:133854 E:133864 D:2 BT: 0}
i ++; {S:133871 E:133874 D:2 BT: 0}
</sublist>
tabDepth += spc / tabWidth; {S:134111 E:134137 D:1 BT: 0}
lineText = in.trim(); {S:134143 E:134163 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(4) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:133880 E:133903 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:133880 E:133903 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#6(4) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:133948 E:134105 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:133948 E:134105 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#7(5) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(i == l) {S:133881 E:133903 D:3 BT: 1}
break; {S:133898 E:133903 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(i == l){} {S:133881 E:133903 D:3 BT: 1}
QuicktestRunner.execPath += 3; {S:133898 E:0 D:4 BT: 0}
break; {S:133898 E:133903 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#8(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#9(6) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(i<l){} {S:133949 E:134105 D:2 BT: 1}
while(in.charAt(i)== ' '){} {S:133970 E:134099 D:3 BT: 0}
<sublist>
spc ++; {S:134010 E:134015 D:4 BT: 0}
i ++; {S:134023 E:134026 D:4 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(i<l){} {S:133949 E:134105 D:2 BT: 1}
while(in.charAt(i)== ' '){} {S:133970 E:134099 D:3 BT: 0}
<sublist>
spc ++; {S:134010 E:134015 D:4 BT: 0}
i ++; {S:134023 E:134026 D:4 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#10(6) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(9) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:134033 E:134057 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:134033 E:134057 D:4 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#12(11) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(i == l) {S:134034 E:134057 D:4 BT: 1}
break; {S:134052 E:134057 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(i == l){} {S:134034 E:134057 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:134052 E:0 D:5 BT: 0}
break; {S:134052 E:134057 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#13(11) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:134057 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 1; {S:134058 E:0 D:5 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
int i = 0; {S:133603 E:133612 D:0 BT: 0}
int spc = 0; {S:133617 E:133628 D:0 BT: 0}
tabDepth = 0; {S:133633 E:133645 D:0 BT: 0}
int l = in.length(); {S:133650 E:133669 D:0 BT: 0}
 {S:133673 E:134168 D:0 BT: 7}
if(l == 0){} {S:133674 E:133737 D:0 BT: 1}
QuicktestRunner.execPath += 6; {S:133694 E:0 D:1 BT: 0}
tabDepth = 0; {S:133694 E:133706 D:1 BT: 0}
lineText = ""; {S:133712 E:133725 D:1 BT: 0}
else{} {S:133738 E:134168 D:0 BT: 2}
while(in.charAt(i)== '\t'){} {S:133815 E:133943 D:1 BT: 0}
<sublist>
tabDepth ++; {S:133854 E:133864 D:2 BT: 0}
i ++; {S:133871 E:133874 D:2 BT: 0}
</sublist>
tabDepth ++; {S:133854 E:133864 D:2 BT: 0}
i ++; {S:133871 E:133874 D:2 BT: 0}
 {S:133880 E:133903 D:2 BT: 7}
if(i == l){} {S:133881 E:133903 D:2 BT: 1}
QuicktestRunner.execPath += 3; {S:133898 E:0 D:3 BT: 0}
break; {S:133898 E:133903 D:3 BT: 0}
 {S:133948 E:134105 D:1 BT: 7}
if(i<l){} {S:133949 E:134105 D:1 BT: 1}
while(in.charAt(i)== ' '){} {S:133970 E:134099 D:2 BT: 0}
<sublist>
spc ++; {S:134010 E:134015 D:3 BT: 0}
i ++; {S:134023 E:134026 D:3 BT: 0}
</sublist>
spc ++; {S:134010 E:134015 D:3 BT: 0}
i ++; {S:134023 E:134026 D:3 BT: 0}
 {S:134033 E:134057 D:3 BT: 7}
if(i == l){} {S:134034 E:134057 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:134052 E:0 D:4 BT: 0}
break; {S:134052 E:134057 D:4 BT: 0}
else {S:134057 E:0 D:3 BT: 0}
QuicktestRunner.execPath += 1; {S:134058 E:0 D:4 BT: 0}
tabDepth += spc / tabWidth; {S:134111 E:134137 D:1 BT: 0}
lineText = in.trim(); {S:134143 E:134163 D:1 BT: 0}
****************************/
   int i = 0; //S:133603   E:133612 D: 0BT: 0
   int spc = 0; //S:133617   E:133628 D: 0BT: 0
   tabDepth = 0; //S:133633   E:133645 D: 0BT: 0
   int l = in.length(); //S:133650   E:133669 D: 0BT: 0
    //S:133673   E:134168 D: 0BT: 7
   if(l == 0) //S:133674   E:133737 D: 0BT: 1
   {
      QuicktestRunner.execPath += 6; //S:133694   E:0 D: 1BT: 0
      tabDepth = 0; //S:133694   E:133706 D: 1BT: 0
      lineText = ""; //S:133712   E:133725 D: 1BT: 0
   }
   else //S:133738   E:134168 D: 0BT: 2
   {
      while(in.charAt(i)== '\t') //S:133815   E:133943 D: 1BT: 0
      {
         tabDepth ++; //S:133854   E:133864 D: 2BT: 0
         i ++; //S:133871   E:133874 D: 2BT: 0
          //S:133880   E:133903 D: 2BT: 7
         if(i == l) //S:133881   E:133903 D: 2BT: 1
         {
            QuicktestRunner.execPath += 3; //S:133898   E:0 D: 3BT: 0
            break; //S:133898   E:133903 D: 3BT: 0
         }
      }
       //S:133948   E:134105 D: 1BT: 7
      if(i<l) //S:133949   E:134105 D: 1BT: 1
      {
         while(in.charAt(i)== ' ') //S:133970   E:134099 D: 2BT: 0
         {
            spc ++; //S:134010   E:134015 D: 3BT: 0
            i ++; //S:134023   E:134026 D: 3BT: 0
             //S:134033   E:134057 D: 3BT: 7
            if(i == l) //S:134034   E:134057 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:134052   E:0 D: 4BT: 0
               break; //S:134052   E:134057 D: 4BT: 0
            }
            else //S:134057   E:0 D: 3BT: 0
            {
               QuicktestRunner.execPath += 1; //S:134058   E:0 D: 4BT: 0
            }
         }
      }
      tabDepth += spc / tabWidth; //S:134111   E:134137 D: 1BT: 0
      lineText = in.trim(); //S:134143   E:134163 D: 1BT: 0
   }
   }

   public LineInfoTest(String in, int startC, int tabDepth)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
lineText = in; {S:134239 E:134252 D:0 BT: 0}
startChar = startC; {S:134257 E:134275 D:0 BT: 0}
this.tabDepth = tabDepth; {S:134280 E:134304 D:0 BT: 0}
****************************/
/***************************
Processing list:
lineText = in; {S:134239 E:134252 D:0 BT: 0}
startChar = startC; {S:134257 E:134275 D:0 BT: 0}
this.tabDepth = tabDepth; {S:134280 E:134304 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
lineText = in; {S:134239 E:134252 D:0 BT: 0}
startChar = startC; {S:134257 E:134275 D:0 BT: 0}
this.tabDepth = tabDepth; {S:134280 E:134304 D:0 BT: 0}
****************************/
   lineText = in; //S:134239   E:134252 D: 0BT: 0
   startChar = startC; //S:134257   E:134275 D: 0BT: 0
   this.tabDepth = tabDepth; //S:134280   E:134304 D: 0BT: 0
   }

   private void processDo(ClassListTest list, TreeStatusTest info)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
ParseTree cond =(ParseTree)tree.getChild(0).getChild(3); {S:134413 E:134470 D:0 BT: 0}
ParseTree condExp =(ParseTree)cond.getChild(1); {S:134479 E:134527 D:0 BT: 0}
String c = getLineText(condExp , false , NOWSCHARS); {S:134532 E:134581 D:0 BT: 0}
condition = c; {S:134586 E:134599 D:0 BT: 0}
lineText = "do{}"; {S:134604 E:134621 D:0 BT: 0}
while(textTokens.size()>3)textTokens.removeLast(); {S:134626 E:134682 D:0 BT: 0}
****************************/
/***************************
Processing list:
ParseTree cond =(ParseTree)tree.getChild(0).getChild(3); {S:134413 E:134470 D:0 BT: 0}
ParseTree condExp =(ParseTree)cond.getChild(1); {S:134479 E:134527 D:0 BT: 0}
String c = getLineText(condExp , false , NOWSCHARS); {S:134532 E:134581 D:0 BT: 0}
condition = c; {S:134586 E:134599 D:0 BT: 0}
lineText = "do{}"; {S:134604 E:134621 D:0 BT: 0}
while(textTokens.size()>3)textTokens.removeLast(); {S:134626 E:134682 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
ParseTree cond =(ParseTree)tree.getChild(0).getChild(3); {S:134413 E:134470 D:0 BT: 0}
ParseTree condExp =(ParseTree)cond.getChild(1); {S:134479 E:134527 D:0 BT: 0}
String c = getLineText(condExp , false , NOWSCHARS); {S:134532 E:134581 D:0 BT: 0}
condition = c; {S:134586 E:134599 D:0 BT: 0}
lineText = "do{}"; {S:134604 E:134621 D:0 BT: 0}
while(textTokens.size()>3)textTokens.removeLast(); {S:134626 E:134682 D:0 BT: 0}
****************************/
   ParseTree cond =(ParseTree)tree.getChild(0).getChild(3); //S:134413   E:134470 D: 0BT: 0
   ParseTree condExp =(ParseTree)cond.getChild(1); //S:134479   E:134527 D: 0BT: 0
   String c = getLineText(condExp , false , NOWSCHARS); //S:134532   E:134581 D: 0BT: 0
   condition = c; //S:134586   E:134599 D: 0BT: 0
   lineText = "do{}"; //S:134604   E:134621 D: 0BT: 0
   while(textTokens.size()>3)textTokens.removeLast(); //S:134626   E:134682 D: 0BT: 0
   }

   private void processBranchType(ClassListTest list, TreeStatusTest info)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:132 CP:0
/***************************
Processing list:
ParseTree subTree =(ParseTree)tree.getChild(0); {S:134785 E:134833 D:0 BT: 0}
String initText =(String)textTokens.get(0); {S:134946 E:134990 D:0 BT: 0}
ternaryTest(list , info); {S:139072 E:139095 D:0 BT: 0}
****************************/
/***************************
Processing list:
ParseTree subTree =(ParseTree)tree.getChild(0); {S:134785 E:134833 D:0 BT: 0}
String initText =(String)textTokens.get(0); {S:134946 E:134990 D:0 BT: 0}
ternaryTest(list , info); {S:139072 E:139095 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:134903 E:134941 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:134903 E:134941 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:134994 E:135102 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:134994 E:135102 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:33 CP:0
/***************************
Processing list:
 {S:135149 E:139067 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:135149 E:139067 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:66
/***************************
Processing list:
if(textTokens.size()== 0) {S:134904 E:134941 D:0 BT: 1}
return; {S:134935 E:134941 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(textTokens.size()== 0){} {S:134904 E:134941 D:0 BT: 1}
QuicktestRunner.execPath += 66; {S:134935 E:0 D:1 BT: 0}
return; {S:134935 E:134941 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:1 CP:33
/***************************
Processing list:
if(initText.equals("do")){} {S:134995 E:135102 D:0 BT: 1}
System.out.println(lineText); {S:135030 E:135058 D:1 BT: 0}
processDo(list , info); {S:135064 E:135085 D:1 BT: 0}
return; {S:135091 E:135097 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(initText.equals("do")){} {S:134995 E:135102 D:0 BT: 1}
QuicktestRunner.execPath += 33; {S:135030 E:0 D:1 BT: 0}
System.out.println(lineText); {S:135030 E:135058 D:1 BT: 0}
processDo(list , info); {S:135064 E:135085 D:1 BT: 0}
return; {S:135091 E:135097 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#8(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#9(4) Type:1 Paths:27 CP:0
/***************************
Processing list:
if(initText.equals("if")){ {S:135150 E:137446 D:0 BT: 1}
int s = startChar; {S:135185 E:135202 D:1 BT: 0}
int e = endChar; {S:135208 E:135223 D:1 BT: 0}
branchType = IF; {S:135229 E:135244 D:1 BT: 0}
condition = getLineText((ParseTree)subTree.getChild(1), false , NOWSCHARS); {S:135250 E:135324 D:1 BT: 0}
{} {S:136893 E:137152 D:1 BT: 0}
<sublist>
ParseTree newIf = new ParseTree("ifElseStmt"); {S:136900 E:136945 D:2 BT: 0}
LineInfoTest ifLine = new LineInfoTest(newIf , null , "" , new Integer(0)); {S:136952 E:137015 D:2 BT: 0}
ifLine.branchType = TERNARY; {S:137022 E:137049 D:2 BT: 0}
ifLine.startChar = s - 1; {S:137056 E:137080 D:2 BT: 0}
ifLine.endChar = e; {S:137087 E:137105 D:2 BT: 0}
ifLine.addToTree(list , info , null); {S:137112 E:137146 D:2 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(initText.equals("if")){} {S:135150 E:137446 D:0 BT: 1}
int s = startChar; {S:135185 E:135202 D:1 BT: 0}
int e = endChar; {S:135208 E:135223 D:1 BT: 0}
branchType = IF; {S:135229 E:135244 D:1 BT: 0}
condition = getLineText((ParseTree)subTree.getChild(1), false , NOWSCHARS); {S:135250 E:135324 D:1 BT: 0}
{} {S:136893 E:137152 D:1 BT: 0}
<sublist>
ParseTree newIf = new ParseTree("ifElseStmt"); {S:136900 E:136945 D:2 BT: 0}
LineInfoTest ifLine = new LineInfoTest(newIf , null , "" , new Integer(0)); {S:136952 E:137015 D:2 BT: 0}
ifLine.branchType = TERNARY; {S:137022 E:137049 D:2 BT: 0}
ifLine.startChar = s - 1; {S:137056 E:137080 D:2 BT: 0}
ifLine.endChar = e; {S:137087 E:137105 D:2 BT: 0}
ifLine.addToTree(list , info , null); {S:137112 E:137146 D:2 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:6 CP:0
/***************************
Processing list:
 {S:137447 E:139067 D:0 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:137447 E:139067 D:0 BT: 2}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(9) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:135438 E:136110 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:135438 E:136110 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#12(9) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:136115 E:136887 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:136115 E:136887 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#13(9) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:137157 E:137366 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:137157 E:137366 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#14(10) Type:-1 Paths:6 CP:0
/***************************
Processing list:
 {S:137451 E:139067 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:137451 E:139067 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#15(11) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(subTree.getChild(2)!= null){} {S:135439 E:136110 D:1 BT: 1}
****************************/
/***************************
Processing list:
if(subTree.getChild(2)!= null){} {S:135439 E:136110 D:1 BT: 1}
****************************/
//=======================================
//=======================================
//#16(11) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#17(12) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(subTree.getChild(3)!= null){} {S:136116 E:136887 D:1 BT: 1}
ParseTree newElse = new ParseTree("elseStmt"); {S:136175 E:136220 D:2 BT: 0}
LineInfoTest elseLine = new LineInfoTest(newElse , null , "" , new Integer(0)); {S:136227 E:136294 D:2 BT: 0}
elseLine.branchType = ELSE; {S:136301 E:136327 D:2 BT: 0}
elseLine.condition = condition; {S:136334 E:136364 D:2 BT: 0}
elseLine.findFit((ParseTree)subTree.getChild(4)); {S:136371 E:136420 D:2 BT: 0}
elseLine.startChar -= 5; {S:136427 E:136450 D:2 BT: 0}
endChar = elseLine.startChar - 1; {S:136498 E:136530 D:2 BT: 0}
elseLine.addToTree(list , info , null); {S:136845 E:136881 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(subTree.getChild(3)!= null){} {S:136116 E:136887 D:1 BT: 1}
ParseTree newElse = new ParseTree("elseStmt"); {S:136175 E:136220 D:2 BT: 0}
LineInfoTest elseLine = new LineInfoTest(newElse , null , "" , new Integer(0)); {S:136227 E:136294 D:2 BT: 0}
elseLine.branchType = ELSE; {S:136301 E:136327 D:2 BT: 0}
elseLine.condition = condition; {S:136334 E:136364 D:2 BT: 0}
elseLine.findFit((ParseTree)subTree.getChild(4)); {S:136371 E:136420 D:2 BT: 0}
elseLine.startChar -= 5; {S:136427 E:136450 D:2 BT: 0}
endChar = elseLine.startChar - 1; {S:136498 E:136530 D:2 BT: 0}
elseLine.addToTree(list , info , null); {S:136845 E:136881 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#18(12) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#19(13) Type:1 Paths:1 CP:12
/***************************
Processing list:
if(lineText.indexOf(" {S:137158 E:137262 D:1 BT: 1}
lineText = lineText.substring(0 , lineText.indexOf(";else")); {S:137198 E:137257 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(lineText.indexOf(";else")>0){} {S:137158 E:137262 D:1 BT: 1}
QuicktestRunner.execPath += 12; {S:137198 E:0 D:2 BT: 0}
lineText = lineText.substring(0 , lineText.indexOf(";else")); {S:137198 E:137257 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#20(13) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:137263 E:137366 D:1 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:137263 E:137366 D:1 BT: 2}
****************************/
//=======================================
//=======================================
//#21(14) Type:1 Paths:4 CP:0
/***************************
Processing list:
if(initText.equals("switch")){ {S:137452 E:138604 D:2 BT: 1}
branchType = SWITCH; {S:137491 E:137510 D:3 BT: 0}
String cond2; {S:137516 E:137528 D:3 BT: 0}
condition = getLineText((ParseTree)subTree.getChild(1), false , NOWSCHARS); {S:137534 E:137608 D:3 BT: 0}
ParseTree cases =(ParseTree)subTree.getChild(3); {S:137614 E:137663 D:3 BT: 0}
for(int i = 0;i<cases.getChildCount();i ++){} {S:137730 E:138595 D:3 BT: 0}
<sublist>
ParseTree caseTree =(ParseTree)cases.getChild(i); {S:137788 E:137838 D:4 BT: 0}
LineInfoTest li = new LineInfoTest(caseTree , null , "" , new Integer(0)); {S:138163 E:138225 D:4 BT: 0}
li.branchType = CASE; {S:138232 E:138252 D:4 BT: 0}
li.condition = cond2; {S:138259 E:138279 D:4 BT: 0}
li.findFit(caseTree); {S:138397 E:138417 D:4 BT: 0}
li.addToTree(list , info , null); {S:138559 E:138589 D:4 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(initText.equals("switch")){} {S:137452 E:138604 D:2 BT: 1}
branchType = SWITCH; {S:137491 E:137510 D:3 BT: 0}
String cond2; {S:137516 E:137528 D:3 BT: 0}
condition = getLineText((ParseTree)subTree.getChild(1), false , NOWSCHARS); {S:137534 E:137608 D:3 BT: 0}
ParseTree cases =(ParseTree)subTree.getChild(3); {S:137614 E:137663 D:3 BT: 0}
for(int i = 0;i<cases.getChildCount();i ++){} {S:137730 E:138595 D:3 BT: 0}
<sublist>
ParseTree caseTree =(ParseTree)cases.getChild(i); {S:137788 E:137838 D:4 BT: 0}
LineInfoTest li = new LineInfoTest(caseTree , null , "" , new Integer(0)); {S:138163 E:138225 D:4 BT: 0}
li.branchType = CASE; {S:138232 E:138252 D:4 BT: 0}
li.condition = cond2; {S:138259 E:138279 D:4 BT: 0}
li.findFit(caseTree); {S:138397 E:138417 D:4 BT: 0}
li.addToTree(list , info , null); {S:138559 E:138589 D:4 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#22(14) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:138605 E:139067 D:2 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:138605 E:139067 D:2 BT: 2}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#23(15) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:135518 E:136104 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:135518 E:136104 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#24(17) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:136536 E:136838 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:136536 E:136838 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#25(20) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:137267 E:137366 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:137267 E:137366 D:3 BT: 7}
****************************/
//=======================================
//=======================================
//#26(21) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:137903 E:138156 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:137903 E:138156 D:4 BT: 7}
****************************/
//=======================================
//=======================================
//#27(21) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:138285 E:138390 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:138285 E:138390 D:4 BT: 7}
****************************/
//=======================================
//=======================================
//#28(22) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:138609 E:139067 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:138609 E:139067 D:4 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#29(23) Type:1 Paths:1 CP:108
/***************************
Processing list:
if(subTree.getChild(2).getChild(0).getText()!= "block"){} {S:135519 E:136104 D:2 BT: 1}
ParseTree n = new ParseTree("blockStmt"); {S:135636 E:135676 D:3 BT: 0}
n.addChild(subTree.getChild(2)); {S:135684 E:135715 D:3 BT: 0}
LineInfoTest li = new LineInfoTest(n , null , "" , new Integer(0)); {S:135723 E:135778 D:3 BT: 0}
li.findFit(n); {S:135786 E:135799 D:3 BT: 0}
li.addToTree(list , info , null); {S:135807 E:135837 D:3 BT: 0}
String rep = li.lineText; {S:135907 E:135931 D:3 BT: 0}
String bef = lineText.substring(0 , lineText.indexOf(rep)); {S:135939 E:135996 D:3 BT: 0}
String aft = lineText.substring(bef.length()+ rep.length()); {S:136004 E:136064 D:3 BT: 0}
this.lineText = bef + aft; {S:136072 E:136097 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(subTree.getChild(2).getChild(0).getText()!= "block"){} {S:135519 E:136104 D:2 BT: 1}
QuicktestRunner.execPath += 108; {S:135636 E:0 D:3 BT: 0}
ParseTree n = new ParseTree("blockStmt"); {S:135636 E:135676 D:3 BT: 0}
n.addChild(subTree.getChild(2)); {S:135684 E:135715 D:3 BT: 0}
LineInfoTest li = new LineInfoTest(n , null , "" , new Integer(0)); {S:135723 E:135778 D:3 BT: 0}
li.findFit(n); {S:135786 E:135799 D:3 BT: 0}
li.addToTree(list , info , null); {S:135807 E:135837 D:3 BT: 0}
String rep = li.lineText; {S:135907 E:135931 D:3 BT: 0}
String bef = lineText.substring(0 , lineText.indexOf(rep)); {S:135939 E:135996 D:3 BT: 0}
String aft = lineText.substring(bef.length()+ rep.length()); {S:136004 E:136064 D:3 BT: 0}
this.lineText = bef + aft; {S:136072 E:136097 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#30(23) Type:2 Paths:1 CP:54

/***************************
Processing list:
else {S:136104 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 54; {S:136105 E:0 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#31(24) Type:1 Paths:1 CP:36
/***************************
Processing list:
if(subTree.getChild(4).getChild(0).getText()!= "block"){} {S:136537 E:136838 D:2 BT: 1}
ParseTree n = new ParseTree("blockStmt"); {S:136607 E:136647 D:3 BT: 0}
n.addChild(subTree.getChild(4)); {S:136655 E:136686 D:3 BT: 0}
LineInfoTest li = new LineInfoTest(n , null , "" , new Integer(0)); {S:136694 E:136749 D:3 BT: 0}
li.findFit(n); {S:136757 E:136770 D:3 BT: 0}
e = li.endChar; {S:136778 E:136792 D:3 BT: 0}
li.addToTree(list , info , null); {S:136801 E:136831 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(subTree.getChild(4).getChild(0).getText()!= "block"){} {S:136537 E:136838 D:2 BT: 1}
QuicktestRunner.execPath += 36; {S:136607 E:0 D:3 BT: 0}
ParseTree n = new ParseTree("blockStmt"); {S:136607 E:136647 D:3 BT: 0}
n.addChild(subTree.getChild(4)); {S:136655 E:136686 D:3 BT: 0}
LineInfoTest li = new LineInfoTest(n , null , "" , new Integer(0)); {S:136694 E:136749 D:3 BT: 0}
li.findFit(n); {S:136757 E:136770 D:3 BT: 0}
e = li.endChar; {S:136778 E:136792 D:3 BT: 0}
li.addToTree(list , info , null); {S:136801 E:136831 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#32(24) Type:2 Paths:1 CP:18

/***************************
Processing list:
else {S:136838 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 18; {S:136839 E:0 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#33(25) Type:1 Paths:1 CP:6
/***************************
Processing list:
if(lineText.indexOf(" {S:137268 E:137366 D:3 BT: 1}
lineText = lineText.substring(0 , lineText.indexOf("}else")); {S:137307 E:137366 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(lineText.indexOf("}else")>0){} {S:137268 E:137366 D:3 BT: 1}
QuicktestRunner.execPath += 6; {S:137307 E:0 D:4 BT: 0}
lineText = lineText.substring(0 , lineText.indexOf("}else")); {S:137307 E:137366 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#34(25) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#35(26) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(caseTree.getChild(0).getChild(0).getText().equals("default")){ {S:137904 E:138050 D:4 BT: 1}
cond2 = "default"; {S:137982 E:137999 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(caseTree.getChild(0).getChild(0).getText().equals("default")){} {S:137904 E:138050 D:4 BT: 1}
QuicktestRunner.execPath += 4; {S:137982 E:0 D:5 BT: 0}
cond2 = "default"; {S:137982 E:137999 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#36(26) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:138051 E:138156 D:4 BT: 2}
cond2 = getLineText((ParseTree)caseTree.getChild(0).getChild(1), false , NOWSCHARS); {S:138064 E:138147 D:4 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:138051 E:138156 D:4 BT: 2}
cond2 = getLineText((ParseTree)caseTree.getChild(0).getChild(1), false , NOWSCHARS); {S:138064 E:138147 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#37(27) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(cond2.equals("default")){} {S:138286 E:138390 D:4 BT: 1}
li.branchType = DEFAULT; {S:138360 E:138383 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(cond2.equals("default")){} {S:138286 E:138390 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:138360 E:0 D:5 BT: 0}
li.branchType = DEFAULT; {S:138360 E:138383 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#38(27) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#39(28) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(initText.equals("try")){} {S:138610 E:139067 D:4 BT: 1}
processTryBlock(list , info); {S:138647 E:138674 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(initText.equals("try")){} {S:138610 E:139067 D:4 BT: 1}
QuicktestRunner.execPath += 1; {S:138647 E:0 D:5 BT: 0}
processTryBlock(list , info); {S:138647 E:138674 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#40(28) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
ParseTree subTree =(ParseTree)tree.getChild(0); {S:134785 E:134833 D:0 BT: 0}
 {S:134903 E:134941 D:0 BT: 7}
if(textTokens.size()== 0){} {S:134904 E:134941 D:0 BT: 1}
QuicktestRunner.execPath += 66; {S:134935 E:0 D:1 BT: 0}
return; {S:134935 E:134941 D:1 BT: 0}
String initText =(String)textTokens.get(0); {S:134946 E:134990 D:0 BT: 0}
 {S:134994 E:135102 D:0 BT: 7}
if(initText.equals("do")){} {S:134995 E:135102 D:0 BT: 1}
QuicktestRunner.execPath += 33; {S:135030 E:0 D:1 BT: 0}
System.out.println(lineText); {S:135030 E:135058 D:1 BT: 0}
processDo(list , info); {S:135064 E:135085 D:1 BT: 0}
return; {S:135091 E:135097 D:1 BT: 0}
 {S:135149 E:139067 D:0 BT: 7}
if(initText.equals("if")){} {S:135150 E:137446 D:0 BT: 1}
int s = startChar; {S:135185 E:135202 D:1 BT: 0}
int e = endChar; {S:135208 E:135223 D:1 BT: 0}
branchType = IF; {S:135229 E:135244 D:1 BT: 0}
condition = getLineText((ParseTree)subTree.getChild(1), false , NOWSCHARS); {S:135250 E:135324 D:1 BT: 0}
 {S:135438 E:136110 D:1 BT: 7}
if(subTree.getChild(2)!= null){} {S:135439 E:136110 D:1 BT: 1}
 {S:135518 E:136104 D:2 BT: 7}
if(subTree.getChild(2).getChild(0).getText()!= "block"){} {S:135519 E:136104 D:2 BT: 1}
QuicktestRunner.execPath += 108; {S:135636 E:0 D:3 BT: 0}
ParseTree n = new ParseTree("blockStmt"); {S:135636 E:135676 D:3 BT: 0}
n.addChild(subTree.getChild(2)); {S:135684 E:135715 D:3 BT: 0}
LineInfoTest li = new LineInfoTest(n , null , "" , new Integer(0)); {S:135723 E:135778 D:3 BT: 0}
li.findFit(n); {S:135786 E:135799 D:3 BT: 0}
li.addToTree(list , info , null); {S:135807 E:135837 D:3 BT: 0}
String rep = li.lineText; {S:135907 E:135931 D:3 BT: 0}
String bef = lineText.substring(0 , lineText.indexOf(rep)); {S:135939 E:135996 D:3 BT: 0}
String aft = lineText.substring(bef.length()+ rep.length()); {S:136004 E:136064 D:3 BT: 0}
this.lineText = bef + aft; {S:136072 E:136097 D:3 BT: 0}
else {S:136104 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 54; {S:136105 E:0 D:3 BT: 0}
 {S:136115 E:136887 D:1 BT: 7}
if(subTree.getChild(3)!= null){} {S:136116 E:136887 D:1 BT: 1}
ParseTree newElse = new ParseTree("elseStmt"); {S:136175 E:136220 D:2 BT: 0}
LineInfoTest elseLine = new LineInfoTest(newElse , null , "" , new Integer(0)); {S:136227 E:136294 D:2 BT: 0}
elseLine.branchType = ELSE; {S:136301 E:136327 D:2 BT: 0}
elseLine.condition = condition; {S:136334 E:136364 D:2 BT: 0}
elseLine.findFit((ParseTree)subTree.getChild(4)); {S:136371 E:136420 D:2 BT: 0}
elseLine.startChar -= 5; {S:136427 E:136450 D:2 BT: 0}
endChar = elseLine.startChar - 1; {S:136498 E:136530 D:2 BT: 0}
 {S:136536 E:136838 D:2 BT: 7}
if(subTree.getChild(4).getChild(0).getText()!= "block"){} {S:136537 E:136838 D:2 BT: 1}
QuicktestRunner.execPath += 36; {S:136607 E:0 D:3 BT: 0}
ParseTree n = new ParseTree("blockStmt"); {S:136607 E:136647 D:3 BT: 0}
n.addChild(subTree.getChild(4)); {S:136655 E:136686 D:3 BT: 0}
LineInfoTest li = new LineInfoTest(n , null , "" , new Integer(0)); {S:136694 E:136749 D:3 BT: 0}
li.findFit(n); {S:136757 E:136770 D:3 BT: 0}
e = li.endChar; {S:136778 E:136792 D:3 BT: 0}
li.addToTree(list , info , null); {S:136801 E:136831 D:3 BT: 0}
else {S:136838 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 18; {S:136839 E:0 D:3 BT: 0}
elseLine.addToTree(list , info , null); {S:136845 E:136881 D:2 BT: 0}
{} {S:136893 E:137152 D:1 BT: 0}
<sublist>
ParseTree newIf = new ParseTree("ifElseStmt"); {S:136900 E:136945 D:2 BT: 0}
LineInfoTest ifLine = new LineInfoTest(newIf , null , "" , new Integer(0)); {S:136952 E:137015 D:2 BT: 0}
ifLine.branchType = TERNARY; {S:137022 E:137049 D:2 BT: 0}
ifLine.startChar = s - 1; {S:137056 E:137080 D:2 BT: 0}
ifLine.endChar = e; {S:137087 E:137105 D:2 BT: 0}
ifLine.addToTree(list , info , null); {S:137112 E:137146 D:2 BT: 0}
</sublist>
ParseTree newIf = new ParseTree("ifElseStmt"); {S:136900 E:136945 D:2 BT: 0}
LineInfoTest ifLine = new LineInfoTest(newIf , null , "" , new Integer(0)); {S:136952 E:137015 D:2 BT: 0}
ifLine.branchType = TERNARY; {S:137022 E:137049 D:2 BT: 0}
ifLine.startChar = s - 1; {S:137056 E:137080 D:2 BT: 0}
ifLine.endChar = e; {S:137087 E:137105 D:2 BT: 0}
ifLine.addToTree(list , info , null); {S:137112 E:137146 D:2 BT: 0}
 {S:137157 E:137366 D:1 BT: 7}
if(lineText.indexOf(";else")>0){} {S:137158 E:137262 D:1 BT: 1}
lineText = lineText.substring(0 , lineText.indexOf(";else")); {S:137198 E:137257 D:2 BT: 0}
QuicktestRunner.execPath += 12; {S:137198 E:0 D:2 BT: 0}
else{} {S:137263 E:137366 D:1 BT: 2}
 {S:137267 E:137366 D:2 BT: 7}
if(lineText.indexOf("}else")>0){} {S:137268 E:137366 D:2 BT: 1}
QuicktestRunner.execPath += 6; {S:137307 E:0 D:3 BT: 0}
lineText = lineText.substring(0 , lineText.indexOf("}else")); {S:137307 E:137366 D:3 BT: 0}
else{} {S:137447 E:139067 D:0 BT: 2}
 {S:137451 E:139067 D:1 BT: 7}
if(initText.equals("switch")){} {S:137452 E:138604 D:1 BT: 1}
branchType = SWITCH; {S:137491 E:137510 D:2 BT: 0}
String cond2; {S:137516 E:137528 D:2 BT: 0}
condition = getLineText((ParseTree)subTree.getChild(1), false , NOWSCHARS); {S:137534 E:137608 D:2 BT: 0}
ParseTree cases =(ParseTree)subTree.getChild(3); {S:137614 E:137663 D:2 BT: 0}
for(int i = 0;i<cases.getChildCount();i ++){} {S:137730 E:138595 D:2 BT: 0}
<sublist>
ParseTree caseTree =(ParseTree)cases.getChild(i); {S:137788 E:137838 D:3 BT: 0}
LineInfoTest li = new LineInfoTest(caseTree , null , "" , new Integer(0)); {S:138163 E:138225 D:3 BT: 0}
li.branchType = CASE; {S:138232 E:138252 D:3 BT: 0}
li.condition = cond2; {S:138259 E:138279 D:3 BT: 0}
li.findFit(caseTree); {S:138397 E:138417 D:3 BT: 0}
li.addToTree(list , info , null); {S:138559 E:138589 D:3 BT: 0}
</sublist>
ParseTree caseTree =(ParseTree)cases.getChild(i); {S:137788 E:137838 D:3 BT: 0}
 {S:137903 E:138156 D:3 BT: 7}
if(caseTree.getChild(0).getChild(0).getText().equals("default")){} {S:137904 E:138050 D:3 BT: 1}
QuicktestRunner.execPath += 4; {S:137982 E:0 D:4 BT: 0}
cond2 = "default"; {S:137982 E:137999 D:4 BT: 0}
else{} {S:138051 E:138156 D:3 BT: 2}
cond2 = getLineText((ParseTree)caseTree.getChild(0).getChild(1), false , NOWSCHARS); {S:138064 E:138147 D:4 BT: 0}
LineInfoTest li = new LineInfoTest(caseTree , null , "" , new Integer(0)); {S:138163 E:138225 D:3 BT: 0}
li.branchType = CASE; {S:138232 E:138252 D:3 BT: 0}
li.condition = cond2; {S:138259 E:138279 D:3 BT: 0}
 {S:138285 E:138390 D:3 BT: 7}
if(cond2.equals("default")){} {S:138286 E:138390 D:3 BT: 1}
QuicktestRunner.execPath += 2; {S:138360 E:0 D:4 BT: 0}
li.branchType = DEFAULT; {S:138360 E:138383 D:4 BT: 0}
li.findFit(caseTree); {S:138397 E:138417 D:3 BT: 0}
li.addToTree(list , info , null); {S:138559 E:138589 D:3 BT: 0}
else{} {S:138605 E:139067 D:1 BT: 2}
 {S:138609 E:139067 D:2 BT: 7}
if(initText.equals("try")){} {S:138610 E:139067 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:138647 E:0 D:3 BT: 0}
processTryBlock(list , info); {S:138647 E:138674 D:3 BT: 0}
ternaryTest(list , info); {S:139072 E:139095 D:0 BT: 0}
****************************/
   ParseTree subTree =(ParseTree)tree.getChild(0); //S:134785   E:134833 D: 0BT: 0
    //S:134903   E:134941 D: 0BT: 7
   if(textTokens.size()== 0) //S:134904   E:134941 D: 0BT: 1
   {
      QuicktestRunner.execPath += 66; //S:134935   E:0 D: 1BT: 0
      return; //S:134935   E:134941 D: 1BT: 0
   }
   String initText =(String)textTokens.get(0); //S:134946   E:134990 D: 0BT: 0
    //S:134994   E:135102 D: 0BT: 7
   if(initText.equals("do")) //S:134995   E:135102 D: 0BT: 1
   {
      QuicktestRunner.execPath += 33; //S:135030   E:0 D: 1BT: 0
      System.out.println(lineText); //S:135030   E:135058 D: 1BT: 0
      processDo(list , info); //S:135064   E:135085 D: 1BT: 0
      return; //S:135091   E:135097 D: 1BT: 0
   }
    //S:135149   E:139067 D: 0BT: 7
   if(initText.equals("if")) //S:135150   E:137446 D: 0BT: 1
   {
      int s = startChar; //S:135185   E:135202 D: 1BT: 0
      int e = endChar; //S:135208   E:135223 D: 1BT: 0
      branchType = IF; //S:135229   E:135244 D: 1BT: 0
      condition = getLineText((ParseTree)subTree.getChild(1), false , NOWSCHARS); //S:135250   E:135324 D: 1BT: 0
       //S:135438   E:136110 D: 1BT: 7
      if(subTree.getChild(2)!= null) //S:135439   E:136110 D: 1BT: 1
      {
          //S:135518   E:136104 D: 2BT: 7
         if(subTree.getChild(2).getChild(0).getText()!= "block") //S:135519   E:136104 D: 2BT: 1
         {
            QuicktestRunner.execPath += 108; //S:135636   E:0 D: 3BT: 0
            ParseTree n = new ParseTree("blockStmt"); //S:135636   E:135676 D: 3BT: 0
            n.addChild(subTree.getChild(2)); //S:135684   E:135715 D: 3BT: 0
            LineInfoTest li = new LineInfoTest(n , null , "" , new Integer(0)); //S:135723   E:135778 D: 3BT: 0
            li.findFit(n); //S:135786   E:135799 D: 3BT: 0
            li.addToTree(list , info , null); //S:135807   E:135837 D: 3BT: 0
            String rep = li.lineText; //S:135907   E:135931 D: 3BT: 0
            String bef = lineText.substring(0 , lineText.indexOf(rep)); //S:135939   E:135996 D: 3BT: 0
            String aft = lineText.substring(bef.length()+ rep.length()); //S:136004   E:136064 D: 3BT: 0
            this.lineText = bef + aft; //S:136072   E:136097 D: 3BT: 0
         }
         else //S:136104   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 54; //S:136105   E:0 D: 3BT: 0
         }
      }
       //S:136115   E:136887 D: 1BT: 7
      if(subTree.getChild(3)!= null) //S:136116   E:136887 D: 1BT: 1
      {
         ParseTree newElse = new ParseTree("elseStmt"); //S:136175   E:136220 D: 2BT: 0
         LineInfoTest elseLine = new LineInfoTest(newElse , null , "" , new Integer(0)); //S:136227   E:136294 D: 2BT: 0
         elseLine.branchType = ELSE; //S:136301   E:136327 D: 2BT: 0
         elseLine.condition = condition; //S:136334   E:136364 D: 2BT: 0
         elseLine.findFit((ParseTree)subTree.getChild(4)); //S:136371   E:136420 D: 2BT: 0
         elseLine.startChar -= 5; //S:136427   E:136450 D: 2BT: 0
         endChar = elseLine.startChar - 1; //S:136498   E:136530 D: 2BT: 0
          //S:136536   E:136838 D: 2BT: 7
         if(subTree.getChild(4).getChild(0).getText()!= "block") //S:136537   E:136838 D: 2BT: 1
         {
            QuicktestRunner.execPath += 36; //S:136607   E:0 D: 3BT: 0
            ParseTree n = new ParseTree("blockStmt"); //S:136607   E:136647 D: 3BT: 0
            n.addChild(subTree.getChild(4)); //S:136655   E:136686 D: 3BT: 0
            LineInfoTest li = new LineInfoTest(n , null , "" , new Integer(0)); //S:136694   E:136749 D: 3BT: 0
            li.findFit(n); //S:136757   E:136770 D: 3BT: 0
            e = li.endChar; //S:136778   E:136792 D: 3BT: 0
            li.addToTree(list , info , null); //S:136801   E:136831 D: 3BT: 0
         }
         else //S:136838   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 18; //S:136839   E:0 D: 3BT: 0
         }
         elseLine.addToTree(list , info , null); //S:136845   E:136881 D: 2BT: 0
      }
       //S:136893   E:137152 D: 1BT: 0
      {
         ParseTree newIf = new ParseTree("ifElseStmt"); //S:136900   E:136945 D: 2BT: 0
         LineInfoTest ifLine = new LineInfoTest(newIf , null , "" , new Integer(0)); //S:136952   E:137015 D: 2BT: 0
         ifLine.branchType = TERNARY; //S:137022   E:137049 D: 2BT: 0
         ifLine.startChar = s - 1; //S:137056   E:137080 D: 2BT: 0
         ifLine.endChar = e; //S:137087   E:137105 D: 2BT: 0
         ifLine.addToTree(list , info , null); //S:137112   E:137146 D: 2BT: 0
      }
       //S:137157   E:137366 D: 1BT: 7
      if(lineText.indexOf(";else")>0) //S:137158   E:137262 D: 1BT: 1
      {
         lineText = lineText.substring(0 , lineText.indexOf(";else")); //S:137198   E:137257 D: 2BT: 0
         QuicktestRunner.execPath += 12; //S:137198   E:0 D: 2BT: 0
      }
      else //S:137263   E:137366 D: 1BT: 2
      {
          //S:137267   E:137366 D: 2BT: 7
         if(lineText.indexOf("}else")>0) //S:137268   E:137366 D: 2BT: 1
         {
            QuicktestRunner.execPath += 6; //S:137307   E:0 D: 3BT: 0
            lineText = lineText.substring(0 , lineText.indexOf("}else")); //S:137307   E:137366 D: 3BT: 0
         }
      }
   }
   else //S:137447   E:139067 D: 0BT: 2
   {
       //S:137451   E:139067 D: 1BT: 7
      if(initText.equals("switch")) //S:137452   E:138604 D: 1BT: 1
      {
         branchType = SWITCH; //S:137491   E:137510 D: 2BT: 0
         String cond2; //S:137516   E:137528 D: 2BT: 0
         condition = getLineText((ParseTree)subTree.getChild(1), false , NOWSCHARS); //S:137534   E:137608 D: 2BT: 0
         ParseTree cases =(ParseTree)subTree.getChild(3); //S:137614   E:137663 D: 2BT: 0
         for(int i = 0;i<cases.getChildCount();i ++) //S:137730   E:138595 D: 2BT: 0
         {
            ParseTree caseTree =(ParseTree)cases.getChild(i); //S:137788   E:137838 D: 3BT: 0
             //S:137903   E:138156 D: 3BT: 7
            if(caseTree.getChild(0).getChild(0).getText().equals("default")) //S:137904   E:138050 D: 3BT: 1
            {
               QuicktestRunner.execPath += 4; //S:137982   E:0 D: 4BT: 0
               cond2 = "default"; //S:137982   E:137999 D: 4BT: 0
            }
            else //S:138051   E:138156 D: 3BT: 2
            {
               cond2 = getLineText((ParseTree)caseTree.getChild(0).getChild(1), false , NOWSCHARS); //S:138064   E:138147 D: 4BT: 0
            }
            LineInfoTest li = new LineInfoTest(caseTree , null , "" , new Integer(0)); //S:138163   E:138225 D: 3BT: 0
            li.branchType = CASE; //S:138232   E:138252 D: 3BT: 0
            li.condition = cond2; //S:138259   E:138279 D: 3BT: 0
             //S:138285   E:138390 D: 3BT: 7
            if(cond2.equals("default")) //S:138286   E:138390 D: 3BT: 1
            {
               QuicktestRunner.execPath += 2; //S:138360   E:0 D: 4BT: 0
               li.branchType = DEFAULT; //S:138360   E:138383 D: 4BT: 0
            }
            li.findFit(caseTree); //S:138397   E:138417 D: 3BT: 0
            li.addToTree(list , info , null); //S:138559   E:138589 D: 3BT: 0
         }
      }
      else //S:138605   E:139067 D: 1BT: 2
      {
          //S:138609   E:139067 D: 2BT: 7
         if(initText.equals("try")) //S:138610   E:139067 D: 2BT: 1
         {
            QuicktestRunner.execPath += 1; //S:138647   E:0 D: 3BT: 0
            processTryBlock(list , info); //S:138647   E:138674 D: 3BT: 0
         }
      }
   }
   ternaryTest(list , info); //S:139072   E:139095 D: 0BT: 0
   }

   private void processTryBlock(ClassListTest list, TreeStatusTest info)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:18 CP:0
/***************************
Processing list:
ParseTree stmt =(ParseTree)tree.getChild(0); {S:139223 E:139268 D:0 BT: 0}
ParseTree catches =(ParseTree)stmt.getChild(2); {S:139273 E:139321 D:0 BT: 0}
ParseTree fin = null; {S:139326 E:139346 D:0 BT: 0}
int newEnd = 0; {S:139351 E:139365 D:0 BT: 0}
while(textTokens.size()>3)textTokens.remove(3); {S:140191 E:140279 D:0 BT: 0}
lineText = lineText.substring(0 , 5); {S:140284 E:140319 D:0 BT: 0}
endChar = newEnd; {S:140324 E:140340 D:0 BT: 0}
****************************/
/***************************
Processing list:
ParseTree stmt =(ParseTree)tree.getChild(0); {S:139223 E:139268 D:0 BT: 0}
ParseTree catches =(ParseTree)stmt.getChild(2); {S:139273 E:139321 D:0 BT: 0}
ParseTree fin = null; {S:139326 E:139346 D:0 BT: 0}
int newEnd = 0; {S:139351 E:139365 D:0 BT: 0}
while(textTokens.size()>3)textTokens.remove(3); {S:140191 E:140279 D:0 BT: 0}
lineText = lineText.substring(0 , 5); {S:140284 E:140319 D:0 BT: 0}
endChar = newEnd; {S:140324 E:140340 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:139400 E:139816 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:139400 E:139816 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:139820 E:139903 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:139820 E:139903 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:139907 E:140186 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:139907 E:140186 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(catches.getText().equals("catches")){ {S:139401 E:139776 D:0 BT: 1}
for(int i = 0;i<catches.getChildCount();i ++){} {S:139450 E:139734 D:1 BT: 0}
<sublist>
ParseTree c =(ParseTree)catches.getChild(i); {S:139510 E:139555 D:2 BT: 0}
LineInfoTest li = new LineInfoTest(c , null , "" , new Integer(0)); {S:139562 E:139617 D:2 BT: 0}
li.findFit(c); {S:139624 E:139637 D:2 BT: 0}
li.addToTree(list , info , null); {S:139644 E:139674 D:2 BT: 0}
</sublist>
****************************/
/***************************
Processing list:
if(catches.getText().equals("catches")){} {S:139401 E:139776 D:0 BT: 1}
for(int i = 0;i<catches.getChildCount();i ++){} {S:139450 E:139734 D:1 BT: 0}
<sublist>
ParseTree c =(ParseTree)catches.getChild(i); {S:139510 E:139555 D:2 BT: 0}
LineInfoTest li = new LineInfoTest(c , null , "" , new Integer(0)); {S:139562 E:139617 D:2 BT: 0}
li.findFit(c); {S:139624 E:139637 D:2 BT: 0}
li.addToTree(list , info , null); {S:139644 E:139674 D:2 BT: 0}
</sublist>
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:139777 E:139816 D:0 BT: 2}
fin =(ParseTree)stmt.getChild(3); {S:139782 E:139816 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:139777 E:139816 D:0 BT: 2}
fin =(ParseTree)stmt.getChild(3); {S:139782 E:139816 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(fin == null && stmt.getChildCount()>4) {S:139821 E:139903 D:0 BT: 1}
fin =(ParseTree)stmt.getChild(4); {S:139869 E:139903 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(fin == null && stmt.getChildCount()>4){} {S:139821 E:139903 D:0 BT: 1}
QuicktestRunner.execPath += 3; {S:139869 E:0 D:1 BT: 0}
fin =(ParseTree)stmt.getChild(4); {S:139869 E:139903 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#8(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#9(4) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(fin != null){} {S:139908 E:140186 D:0 BT: 1}
LineInfoTest li = new LineInfoTest(fin , null , "" , new Integer(0)); {S:139933 E:139990 D:1 BT: 0}
li.findFit(fin); {S:139996 E:140011 D:1 BT: 0}
li.textTokens.addFirst(new String("finally")); {S:140017 E:140062 D:1 BT: 0}
li.lineText = "finally{}"; {S:140068 E:140093 D:1 BT: 0}
li.addToTree(list , info , null); {S:140099 E:140129 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(fin != null){} {S:139908 E:140186 D:0 BT: 1}
LineInfoTest li = new LineInfoTest(fin , null , "" , new Integer(0)); {S:139933 E:139990 D:1 BT: 0}
li.findFit(fin); {S:139996 E:140011 D:1 BT: 0}
li.textTokens.addFirst(new String("finally")); {S:140017 E:140062 D:1 BT: 0}
li.lineText = "finally{}"; {S:140068 E:140093 D:1 BT: 0}
li.addToTree(list , info , null); {S:140099 E:140129 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(5) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:139680 E:139728 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:139680 E:139728 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#12(9) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:140134 E:140181 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:140134 E:140181 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#13(11) Type:1 Paths:1 CP:12
/***************************
Processing list:
if(newEnd == 0) {S:139681 E:139728 D:2 BT: 1}
newEnd = li.startChar - 1; {S:139703 E:139728 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(newEnd == 0){} {S:139681 E:139728 D:2 BT: 1}
QuicktestRunner.execPath += 12; {S:139703 E:0 D:3 BT: 0}
newEnd = li.startChar - 1; {S:139703 E:139728 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#14(11) Type:2 Paths:1 CP:6

/***************************
Processing list:
else {S:139728 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 6; {S:139729 E:0 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#15(12) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(newEnd == 0) {S:140135 E:140181 D:1 BT: 1}
newEnd = li.startChar - 1; {S:140156 E:140181 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(newEnd == 0){} {S:140135 E:140181 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:140156 E:0 D:2 BT: 0}
newEnd = li.startChar - 1; {S:140156 E:140181 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#16(12) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:140181 E:0 D:1 BT: 0}
QuicktestRunner.execPath += 1; {S:140182 E:0 D:2 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
ParseTree stmt =(ParseTree)tree.getChild(0); {S:139223 E:139268 D:0 BT: 0}
ParseTree catches =(ParseTree)stmt.getChild(2); {S:139273 E:139321 D:0 BT: 0}
ParseTree fin = null; {S:139326 E:139346 D:0 BT: 0}
int newEnd = 0; {S:139351 E:139365 D:0 BT: 0}
 {S:139400 E:139816 D:0 BT: 7}
if(catches.getText().equals("catches")){} {S:139401 E:139776 D:0 BT: 1}
for(int i = 0;i<catches.getChildCount();i ++){} {S:139450 E:139734 D:1 BT: 0}
<sublist>
ParseTree c =(ParseTree)catches.getChild(i); {S:139510 E:139555 D:2 BT: 0}
LineInfoTest li = new LineInfoTest(c , null , "" , new Integer(0)); {S:139562 E:139617 D:2 BT: 0}
li.findFit(c); {S:139624 E:139637 D:2 BT: 0}
li.addToTree(list , info , null); {S:139644 E:139674 D:2 BT: 0}
</sublist>
ParseTree c =(ParseTree)catches.getChild(i); {S:139510 E:139555 D:2 BT: 0}
LineInfoTest li = new LineInfoTest(c , null , "" , new Integer(0)); {S:139562 E:139617 D:2 BT: 0}
li.findFit(c); {S:139624 E:139637 D:2 BT: 0}
li.addToTree(list , info , null); {S:139644 E:139674 D:2 BT: 0}
 {S:139680 E:139728 D:2 BT: 7}
if(newEnd == 0){} {S:139681 E:139728 D:2 BT: 1}
QuicktestRunner.execPath += 12; {S:139703 E:0 D:3 BT: 0}
newEnd = li.startChar - 1; {S:139703 E:139728 D:3 BT: 0}
else {S:139728 E:0 D:2 BT: 0}
QuicktestRunner.execPath += 6; {S:139729 E:0 D:3 BT: 0}
else{} {S:139777 E:139816 D:0 BT: 2}
fin =(ParseTree)stmt.getChild(3); {S:139782 E:139816 D:1 BT: 0}
 {S:139820 E:139903 D:0 BT: 7}
if(fin == null && stmt.getChildCount()>4){} {S:139821 E:139903 D:0 BT: 1}
QuicktestRunner.execPath += 3; {S:139869 E:0 D:1 BT: 0}
fin =(ParseTree)stmt.getChild(4); {S:139869 E:139903 D:1 BT: 0}
 {S:139907 E:140186 D:0 BT: 7}
if(fin != null){} {S:139908 E:140186 D:0 BT: 1}
LineInfoTest li = new LineInfoTest(fin , null , "" , new Integer(0)); {S:139933 E:139990 D:1 BT: 0}
li.findFit(fin); {S:139996 E:140011 D:1 BT: 0}
li.textTokens.addFirst(new String("finally")); {S:140017 E:140062 D:1 BT: 0}
li.lineText = "finally{}"; {S:140068 E:140093 D:1 BT: 0}
li.addToTree(list , info , null); {S:140099 E:140129 D:1 BT: 0}
 {S:140134 E:140181 D:1 BT: 7}
if(newEnd == 0){} {S:140135 E:140181 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:140156 E:0 D:2 BT: 0}
newEnd = li.startChar - 1; {S:140156 E:140181 D:2 BT: 0}
else {S:140181 E:0 D:1 BT: 0}
QuicktestRunner.execPath += 1; {S:140182 E:0 D:2 BT: 0}
while(textTokens.size()>3)textTokens.remove(3); {S:140191 E:140279 D:0 BT: 0}
lineText = lineText.substring(0 , 5); {S:140284 E:140319 D:0 BT: 0}
endChar = newEnd; {S:140324 E:140340 D:0 BT: 0}
****************************/
   ParseTree stmt =(ParseTree)tree.getChild(0); //S:139223   E:139268 D: 0BT: 0
   ParseTree catches =(ParseTree)stmt.getChild(2); //S:139273   E:139321 D: 0BT: 0
   ParseTree fin = null; //S:139326   E:139346 D: 0BT: 0
   int newEnd = 0; //S:139351   E:139365 D: 0BT: 0
    //S:139400   E:139816 D: 0BT: 7
   if(catches.getText().equals("catches")) //S:139401   E:139776 D: 0BT: 1
   {
      for(int i = 0;i<catches.getChildCount();i ++) //S:139450   E:139734 D: 1BT: 0
      {
         ParseTree c =(ParseTree)catches.getChild(i); //S:139510   E:139555 D: 2BT: 0
         LineInfoTest li = new LineInfoTest(c , null , "" , new Integer(0)); //S:139562   E:139617 D: 2BT: 0
         li.findFit(c); //S:139624   E:139637 D: 2BT: 0
         li.addToTree(list , info , null); //S:139644   E:139674 D: 2BT: 0
          //S:139680   E:139728 D: 2BT: 7
         if(newEnd == 0) //S:139681   E:139728 D: 2BT: 1
         {
            QuicktestRunner.execPath += 12; //S:139703   E:0 D: 3BT: 0
            newEnd = li.startChar - 1; //S:139703   E:139728 D: 3BT: 0
         }
         else //S:139728   E:0 D: 2BT: 0
         {
            QuicktestRunner.execPath += 6; //S:139729   E:0 D: 3BT: 0
         }
      }
   }
   else //S:139777   E:139816 D: 0BT: 2
   {
      fin =(ParseTree)stmt.getChild(3); //S:139782   E:139816 D: 1BT: 0
   }
    //S:139820   E:139903 D: 0BT: 7
   if(fin == null && stmt.getChildCount()>4) //S:139821   E:139903 D: 0BT: 1
   {
      QuicktestRunner.execPath += 3; //S:139869   E:0 D: 1BT: 0
      fin =(ParseTree)stmt.getChild(4); //S:139869   E:139903 D: 1BT: 0
   }
    //S:139907   E:140186 D: 0BT: 7
   if(fin != null) //S:139908   E:140186 D: 0BT: 1
   {
      LineInfoTest li = new LineInfoTest(fin , null , "" , new Integer(0)); //S:139933   E:139990 D: 1BT: 0
      li.findFit(fin); //S:139996   E:140011 D: 1BT: 0
      li.textTokens.addFirst(new String("finally")); //S:140017   E:140062 D: 1BT: 0
      li.lineText = "finally{}"; //S:140068   E:140093 D: 1BT: 0
      li.addToTree(list , info , null); //S:140099   E:140129 D: 1BT: 0
       //S:140134   E:140181 D: 1BT: 7
      if(newEnd == 0) //S:140135   E:140181 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:140156   E:0 D: 2BT: 0
         newEnd = li.startChar - 1; //S:140156   E:140181 D: 2BT: 0
      }
      else //S:140181   E:0 D: 1BT: 0
      {
         QuicktestRunner.execPath += 1; //S:140182   E:0 D: 2BT: 0
      }
   }
   while(textTokens.size()>3)textTokens.remove(3); //S:140191   E:140279 D: 0BT: 0
   lineText = lineText.substring(0 , 5); //S:140284   E:140319 D: 0BT: 0
   endChar = newEnd; //S:140324   E:140340 D: 0BT: 0
   }

   private boolean ternaryTest(ClassListTest list, TreeStatusTest info)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:16 CP:0
/***************************
Processing list:
String[]path ={"statement" , "statementExpression" , "expression" , "conditionalExpression"}; {S:140419 E:140510 D:0 BT: 0}
ParseTree current = tree; {S:140515 E:140539 D:0 BT: 0}
for(int i = 0;i<4;i ++){} {S:140544 E:140822 D:0 BT: 0}
<sublist>
current =(ParseTree)current.getChild(0); {S:140580 E:140621 D:1 BT: 0}
String x =(String)current.payload; {S:140734 E:140769 D:1 BT: 0}
</sublist>
ParseTree qMark =(ParseTree)current.getChild(1); {S:140827 E:140876 D:0 BT: 0}
ParseTree colon =(ParseTree)current.getChild(3); {S:140881 E:140930 D:0 BT: 0}
****************************/
/***************************
Processing list:
String[]path ={"statement" , "statementExpression" , "expression" , "conditionalExpression"}; {S:140419 E:140510 D:0 BT: 0}
ParseTree current = tree; {S:140515 E:140539 D:0 BT: 0}
for(int i = 0;i<4;i ++){} {S:140544 E:140822 D:0 BT: 0}
<sublist>
current =(ParseTree)current.getChild(0); {S:140580 E:140621 D:1 BT: 0}
String x =(String)current.payload; {S:140734 E:140769 D:1 BT: 0}
</sublist>
ParseTree qMark =(ParseTree)current.getChild(1); {S:140827 E:140876 D:0 BT: 0}
ParseTree colon =(ParseTree)current.getChild(3); {S:140881 E:140930 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:140626 E:140664 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:140626 E:140664 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:140669 E:140728 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:140669 E:140728 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:140774 E:140817 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:140774 E:140817 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#5(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:140934 E:142319 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:140934 E:142319 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(2) Type:1 Paths:1 CP:8
/***************************
Processing list:
if(current == null) {S:140627 E:140664 D:1 BT: 1}
return false; {S:140652 E:140664 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(current == null){} {S:140627 E:140664 D:1 BT: 1}
QuicktestRunner.execPath += 8; {S:140652 E:0 D:2 BT: 0}
return false; {S:140652 E:140664 D:2 BT: 0}
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
if(!(current.payload instanceof String)) {S:140670 E:140728 D:1 BT: 1}
return false; {S:140716 E:140728 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(!(current.payload instanceof String)){} {S:140670 E:140728 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:140716 E:0 D:2 BT: 0}
return false; {S:140716 E:140728 D:2 BT: 0}
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
if(!(x.equals(path[i]))) {S:140775 E:140817 D:1 BT: 1}
return false; {S:140805 E:140817 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(!(x.equals(path[i]))){} {S:140775 E:140817 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:140805 E:0 D:2 BT: 0}
return false; {S:140805 E:140817 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#11(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#12(5) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(qMark == null || colon == null)else{} {S:140935 E:140993 D:0 BT: 1}
return false; {S:140974 E:140986 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(qMark == null || colon == null){} {S:140935 E:140993 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:140974 E:0 D:1 BT: 0}
return false; {S:140974 E:140986 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#13(5) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:140994 E:142319 D:0 BT: 2}
condition = getLineText((ParseTree)current.getChild(0), false , NOWSCHARS); {S:141047 E:141121 D:0 BT: 0}
branchType = TERNARY; {S:141127 E:141147 D:0 BT: 0}
{} {S:141153 E:141704 D:0 BT: 0}
<sublist>
ParseTree newIf = new ParseTree("ifStmt"); {S:141202 E:141243 D:1 BT: 0}
LineInfoTest ifLine = new LineInfoTest(newIf , null , "" , new Integer(0)); {S:141250 E:141313 D:1 BT: 0}
ifLine.branchType = IF; {S:141320 E:141342 D:1 BT: 0}
ifLine.condition = condition; {S:141349 E:141377 D:1 BT: 0}
ParseTree n = new ParseTree("blockStmt"); {S:141384 E:141424 D:1 BT: 0}
n.addChild(current.getChild(2)); {S:141431 E:141462 D:1 BT: 0}
LineInfoTest li = new LineInfoTest(n , null , "" , new Integer(0)); {S:141469 E:141524 D:1 BT: 0}
li.findFit(n); {S:141531 E:141544 D:1 BT: 0}
li.addToTree(list , info , null); {S:141551 E:141581 D:1 BT: 0}
ifLine.startChar = li.startChar - 1; {S:141588 E:141623 D:1 BT: 0}
ifLine.endChar = li.endChar; {S:141630 E:141657 D:1 BT: 0}
ifLine.addToTree(list , info , null); {S:141664 E:141698 D:1 BT: 0}
</sublist>
{} {S:141710 E:142297 D:0 BT: 0}
<sublist>
ParseTree newElse = new ParseTree("elseStmt"); {S:141766 E:141811 D:1 BT: 0}
LineInfoTest elseLine = new LineInfoTest(newElse , null , "" , new Integer(0)); {S:141818 E:141885 D:1 BT: 0}
elseLine.branchType = ELSE; {S:141892 E:141918 D:1 BT: 0}
elseLine.condition = condition; {S:141925 E:141955 D:1 BT: 0}
ParseTree n2 = new ParseTree("blockStmt"); {S:141962 E:142003 D:1 BT: 0}
n2.addChild(current.getChild(4)); {S:142010 E:142042 D:1 BT: 0}
LineInfoTest li2 = new LineInfoTest(n2 , null , "" , new Integer(0)); {S:142049 E:142106 D:1 BT: 0}
li2.findFit(n2); {S:142113 E:142128 D:1 BT: 0}
li2.addToTree(list , info , null); {S:142135 E:142166 D:1 BT: 0}
elseLine.startChar = li2.startChar - 1; {S:142173 E:142211 D:1 BT: 0}
elseLine.endChar = li2.endChar; {S:142218 E:142248 D:1 BT: 0}
elseLine.addToTree(list , info , null); {S:142255 E:142291 D:1 BT: 0}
</sublist>
return true; {S:142303 E:142314 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:140994 E:142319 D:0 BT: 2}
condition = getLineText((ParseTree)current.getChild(0), false , NOWSCHARS); {S:141047 E:141121 D:1 BT: 0}
branchType = TERNARY; {S:141127 E:141147 D:1 BT: 0}
{} {S:141153 E:141704 D:1 BT: 0}
<sublist>
ParseTree newIf = new ParseTree("ifStmt"); {S:141202 E:141243 D:2 BT: 0}
LineInfoTest ifLine = new LineInfoTest(newIf , null , "" , new Integer(0)); {S:141250 E:141313 D:2 BT: 0}
ifLine.branchType = IF; {S:141320 E:141342 D:2 BT: 0}
ifLine.condition = condition; {S:141349 E:141377 D:2 BT: 0}
ParseTree n = new ParseTree("blockStmt"); {S:141384 E:141424 D:2 BT: 0}
n.addChild(current.getChild(2)); {S:141431 E:141462 D:2 BT: 0}
LineInfoTest li = new LineInfoTest(n , null , "" , new Integer(0)); {S:141469 E:141524 D:2 BT: 0}
li.findFit(n); {S:141531 E:141544 D:2 BT: 0}
li.addToTree(list , info , null); {S:141551 E:141581 D:2 BT: 0}
ifLine.startChar = li.startChar - 1; {S:141588 E:141623 D:2 BT: 0}
ifLine.endChar = li.endChar; {S:141630 E:141657 D:2 BT: 0}
ifLine.addToTree(list , info , null); {S:141664 E:141698 D:2 BT: 0}
</sublist>
{} {S:141710 E:142297 D:1 BT: 0}
<sublist>
ParseTree newElse = new ParseTree("elseStmt"); {S:141766 E:141811 D:2 BT: 0}
LineInfoTest elseLine = new LineInfoTest(newElse , null , "" , new Integer(0)); {S:141818 E:141885 D:2 BT: 0}
elseLine.branchType = ELSE; {S:141892 E:141918 D:2 BT: 0}
elseLine.condition = condition; {S:141925 E:141955 D:2 BT: 0}
ParseTree n2 = new ParseTree("blockStmt"); {S:141962 E:142003 D:2 BT: 0}
n2.addChild(current.getChild(4)); {S:142010 E:142042 D:2 BT: 0}
LineInfoTest li2 = new LineInfoTest(n2 , null , "" , new Integer(0)); {S:142049 E:142106 D:2 BT: 0}
li2.findFit(n2); {S:142113 E:142128 D:2 BT: 0}
li2.addToTree(list , info , null); {S:142135 E:142166 D:2 BT: 0}
elseLine.startChar = li2.startChar - 1; {S:142173 E:142211 D:2 BT: 0}
elseLine.endChar = li2.endChar; {S:142218 E:142248 D:2 BT: 0}
elseLine.addToTree(list , info , null); {S:142255 E:142291 D:2 BT: 0}
</sublist>
return true; {S:142303 E:142314 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String[]path ={"statement" , "statementExpression" , "expression" , "conditionalExpression"}; {S:140419 E:140510 D:0 BT: 0}
ParseTree current = tree; {S:140515 E:140539 D:0 BT: 0}
for(int i = 0;i<4;i ++){} {S:140544 E:140822 D:0 BT: 0}
<sublist>
current =(ParseTree)current.getChild(0); {S:140580 E:140621 D:1 BT: 0}
String x =(String)current.payload; {S:140734 E:140769 D:1 BT: 0}
</sublist>
current =(ParseTree)current.getChild(0); {S:140580 E:140621 D:1 BT: 0}
 {S:140626 E:140664 D:1 BT: 7}
if(current == null){} {S:140627 E:140664 D:1 BT: 1}
QuicktestRunner.execPath += 8; {S:140652 E:0 D:2 BT: 0}
return false; {S:140652 E:140664 D:2 BT: 0}
 {S:140669 E:140728 D:1 BT: 7}
if(!(current.payload instanceof String)){} {S:140670 E:140728 D:1 BT: 1}
QuicktestRunner.execPath += 4; {S:140716 E:0 D:2 BT: 0}
return false; {S:140716 E:140728 D:2 BT: 0}
String x =(String)current.payload; {S:140734 E:140769 D:1 BT: 0}
 {S:140774 E:140817 D:1 BT: 7}
if(!(x.equals(path[i]))){} {S:140775 E:140817 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:140805 E:0 D:2 BT: 0}
return false; {S:140805 E:140817 D:2 BT: 0}
ParseTree qMark =(ParseTree)current.getChild(1); {S:140827 E:140876 D:0 BT: 0}
ParseTree colon =(ParseTree)current.getChild(3); {S:140881 E:140930 D:0 BT: 0}
 {S:140934 E:142319 D:0 BT: 7}
if(qMark == null || colon == null){} {S:140935 E:140993 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:140974 E:0 D:1 BT: 0}
return false; {S:140974 E:140986 D:1 BT: 0}
else{} {S:140994 E:142319 D:0 BT: 2}
condition = getLineText((ParseTree)current.getChild(0), false , NOWSCHARS); {S:141047 E:141121 D:1 BT: 0}
branchType = TERNARY; {S:141127 E:141147 D:1 BT: 0}
{} {S:141153 E:141704 D:1 BT: 0}
<sublist>
ParseTree newIf = new ParseTree("ifStmt"); {S:141202 E:141243 D:2 BT: 0}
LineInfoTest ifLine = new LineInfoTest(newIf , null , "" , new Integer(0)); {S:141250 E:141313 D:2 BT: 0}
ifLine.branchType = IF; {S:141320 E:141342 D:2 BT: 0}
ifLine.condition = condition; {S:141349 E:141377 D:2 BT: 0}
ParseTree n = new ParseTree("blockStmt"); {S:141384 E:141424 D:2 BT: 0}
n.addChild(current.getChild(2)); {S:141431 E:141462 D:2 BT: 0}
LineInfoTest li = new LineInfoTest(n , null , "" , new Integer(0)); {S:141469 E:141524 D:2 BT: 0}
li.findFit(n); {S:141531 E:141544 D:2 BT: 0}
li.addToTree(list , info , null); {S:141551 E:141581 D:2 BT: 0}
ifLine.startChar = li.startChar - 1; {S:141588 E:141623 D:2 BT: 0}
ifLine.endChar = li.endChar; {S:141630 E:141657 D:2 BT: 0}
ifLine.addToTree(list , info , null); {S:141664 E:141698 D:2 BT: 0}
</sublist>
ParseTree newIf = new ParseTree("ifStmt"); {S:141202 E:141243 D:2 BT: 0}
LineInfoTest ifLine = new LineInfoTest(newIf , null , "" , new Integer(0)); {S:141250 E:141313 D:2 BT: 0}
ifLine.branchType = IF; {S:141320 E:141342 D:2 BT: 0}
ifLine.condition = condition; {S:141349 E:141377 D:2 BT: 0}
ParseTree n = new ParseTree("blockStmt"); {S:141384 E:141424 D:2 BT: 0}
n.addChild(current.getChild(2)); {S:141431 E:141462 D:2 BT: 0}
LineInfoTest li = new LineInfoTest(n , null , "" , new Integer(0)); {S:141469 E:141524 D:2 BT: 0}
li.findFit(n); {S:141531 E:141544 D:2 BT: 0}
li.addToTree(list , info , null); {S:141551 E:141581 D:2 BT: 0}
ifLine.startChar = li.startChar - 1; {S:141588 E:141623 D:2 BT: 0}
ifLine.endChar = li.endChar; {S:141630 E:141657 D:2 BT: 0}
ifLine.addToTree(list , info , null); {S:141664 E:141698 D:2 BT: 0}
{} {S:141710 E:142297 D:1 BT: 0}
<sublist>
ParseTree newElse = new ParseTree("elseStmt"); {S:141766 E:141811 D:2 BT: 0}
LineInfoTest elseLine = new LineInfoTest(newElse , null , "" , new Integer(0)); {S:141818 E:141885 D:2 BT: 0}
elseLine.branchType = ELSE; {S:141892 E:141918 D:2 BT: 0}
elseLine.condition = condition; {S:141925 E:141955 D:2 BT: 0}
ParseTree n2 = new ParseTree("blockStmt"); {S:141962 E:142003 D:2 BT: 0}
n2.addChild(current.getChild(4)); {S:142010 E:142042 D:2 BT: 0}
LineInfoTest li2 = new LineInfoTest(n2 , null , "" , new Integer(0)); {S:142049 E:142106 D:2 BT: 0}
li2.findFit(n2); {S:142113 E:142128 D:2 BT: 0}
li2.addToTree(list , info , null); {S:142135 E:142166 D:2 BT: 0}
elseLine.startChar = li2.startChar - 1; {S:142173 E:142211 D:2 BT: 0}
elseLine.endChar = li2.endChar; {S:142218 E:142248 D:2 BT: 0}
elseLine.addToTree(list , info , null); {S:142255 E:142291 D:2 BT: 0}
</sublist>
ParseTree newElse = new ParseTree("elseStmt"); {S:141766 E:141811 D:2 BT: 0}
LineInfoTest elseLine = new LineInfoTest(newElse , null , "" , new Integer(0)); {S:141818 E:141885 D:2 BT: 0}
elseLine.branchType = ELSE; {S:141892 E:141918 D:2 BT: 0}
elseLine.condition = condition; {S:141925 E:141955 D:2 BT: 0}
ParseTree n2 = new ParseTree("blockStmt"); {S:141962 E:142003 D:2 BT: 0}
n2.addChild(current.getChild(4)); {S:142010 E:142042 D:2 BT: 0}
LineInfoTest li2 = new LineInfoTest(n2 , null , "" , new Integer(0)); {S:142049 E:142106 D:2 BT: 0}
li2.findFit(n2); {S:142113 E:142128 D:2 BT: 0}
li2.addToTree(list , info , null); {S:142135 E:142166 D:2 BT: 0}
elseLine.startChar = li2.startChar - 1; {S:142173 E:142211 D:2 BT: 0}
elseLine.endChar = li2.endChar; {S:142218 E:142248 D:2 BT: 0}
elseLine.addToTree(list , info , null); {S:142255 E:142291 D:2 BT: 0}
return true; {S:142303 E:142314 D:1 BT: 0}
****************************/
   String[]path ={"statement" , "statementExpression" , "expression" , "conditionalExpression"}; //S:140419   E:140510 D: 0BT: 0
   ParseTree current = tree; //S:140515   E:140539 D: 0BT: 0
   for(int i = 0;i<4;i ++) //S:140544   E:140822 D: 0BT: 0
   {
      current =(ParseTree)current.getChild(0); //S:140580   E:140621 D: 1BT: 0
       //S:140626   E:140664 D: 1BT: 7
      if(current == null) //S:140627   E:140664 D: 1BT: 1
      {
         QuicktestRunner.execPath += 8; //S:140652   E:0 D: 2BT: 0
         return false; //S:140652   E:140664 D: 2BT: 0
      }
       //S:140669   E:140728 D: 1BT: 7
      if(!(current.payload instanceof String)) //S:140670   E:140728 D: 1BT: 1
      {
         QuicktestRunner.execPath += 4; //S:140716   E:0 D: 2BT: 0
         return false; //S:140716   E:140728 D: 2BT: 0
      }
      String x =(String)current.payload; //S:140734   E:140769 D: 1BT: 0
       //S:140774   E:140817 D: 1BT: 7
      if(!(x.equals(path[i]))) //S:140775   E:140817 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:140805   E:0 D: 2BT: 0
         return false; //S:140805   E:140817 D: 2BT: 0
      }
   }
   ParseTree qMark =(ParseTree)current.getChild(1); //S:140827   E:140876 D: 0BT: 0
   ParseTree colon =(ParseTree)current.getChild(3); //S:140881   E:140930 D: 0BT: 0
    //S:140934   E:142319 D: 0BT: 7
   if(qMark == null || colon == null) //S:140935   E:140993 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:140974   E:0 D: 1BT: 0
      return false; //S:140974   E:140986 D: 1BT: 0
   }
   else //S:140994   E:142319 D: 0BT: 2
   {
      condition = getLineText((ParseTree)current.getChild(0), false , NOWSCHARS); //S:141047   E:141121 D: 1BT: 0
      branchType = TERNARY; //S:141127   E:141147 D: 1BT: 0
       //S:141153   E:141704 D: 1BT: 0
      {
         ParseTree newIf = new ParseTree("ifStmt"); //S:141202   E:141243 D: 2BT: 0
         LineInfoTest ifLine = new LineInfoTest(newIf , null , "" , new Integer(0)); //S:141250   E:141313 D: 2BT: 0
         ifLine.branchType = IF; //S:141320   E:141342 D: 2BT: 0
         ifLine.condition = condition; //S:141349   E:141377 D: 2BT: 0
         ParseTree n = new ParseTree("blockStmt"); //S:141384   E:141424 D: 2BT: 0
         n.addChild(current.getChild(2)); //S:141431   E:141462 D: 2BT: 0
         LineInfoTest li = new LineInfoTest(n , null , "" , new Integer(0)); //S:141469   E:141524 D: 2BT: 0
         li.findFit(n); //S:141531   E:141544 D: 2BT: 0
         li.addToTree(list , info , null); //S:141551   E:141581 D: 2BT: 0
         ifLine.startChar = li.startChar - 1; //S:141588   E:141623 D: 2BT: 0
         ifLine.endChar = li.endChar; //S:141630   E:141657 D: 2BT: 0
         ifLine.addToTree(list , info , null); //S:141664   E:141698 D: 2BT: 0
      }
       //S:141710   E:142297 D: 1BT: 0
      {
         ParseTree newElse = new ParseTree("elseStmt"); //S:141766   E:141811 D: 2BT: 0
         LineInfoTest elseLine = new LineInfoTest(newElse , null , "" , new Integer(0)); //S:141818   E:141885 D: 2BT: 0
         elseLine.branchType = ELSE; //S:141892   E:141918 D: 2BT: 0
         elseLine.condition = condition; //S:141925   E:141955 D: 2BT: 0
         ParseTree n2 = new ParseTree("blockStmt"); //S:141962   E:142003 D: 2BT: 0
         n2.addChild(current.getChild(4)); //S:142010   E:142042 D: 2BT: 0
         LineInfoTest li2 = new LineInfoTest(n2 , null , "" , new Integer(0)); //S:142049   E:142106 D: 2BT: 0
         li2.findFit(n2); //S:142113   E:142128 D: 2BT: 0
         li2.addToTree(list , info , null); //S:142135   E:142166 D: 2BT: 0
         elseLine.startChar = li2.startChar - 1; //S:142173   E:142211 D: 2BT: 0
         elseLine.endChar = li2.endChar; //S:142218   E:142248 D: 2BT: 0
         elseLine.addToTree(list , info , null); //S:142255   E:142291 D: 2BT: 0
      }
      return true; //S:142303   E:142314 D: 1BT: 0
   }
   }

   public static void getTextTokens(ParseTree in, LinkedList tt)
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
 {S:142398 E:142950 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:142398 E:142950 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(in.getChildCount()== 0){}else if(in.getText().equals("blockStatement")&& tt.size()>0)return {S:142399 E:142757 D:0 BT: 1}
****************************/
/***************************
Processing list:
if(in.getChildCount()== 0){} {S:142399 E:142757 D:0 BT: 1}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:142758 E:142950 D:0 BT: 2}
****************************/
/***************************
Processing list:
else{} {S:142758 E:142950 D:0 BT: 2}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(3) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:142435 E:142571 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:142435 E:142571 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#6(4) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:142762 E:142950 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:142762 E:142950 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#7(5) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(in.payload instanceof CommonToken){} {S:142436 E:142571 D:1 BT: 1}
CommonToken ct =(CommonToken)in.payload; {S:142485 E:142526 D:2 BT: 0}
tt.add(new String(ct.getText())); {S:142533 E:142565 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(in.payload instanceof CommonToken){} {S:142436 E:142571 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:142485 E:0 D:2 BT: 0}
CommonToken ct =(CommonToken)in.payload; {S:142485 E:142526 D:2 BT: 0}
tt.add(new String(ct.getText())); {S:142533 E:142565 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#8(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#9(6) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(in.getText().equals("blockStatement")&& tt.size()>0)else{} {S:142763 E:142839 D:2 BT: 1}
return; {S:142826 E:142832 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(in.getText().equals("blockStatement")&& tt.size()>0){} {S:142763 E:142839 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:142826 E:0 D:3 BT: 0}
return; {S:142826 E:142832 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#10(6) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:142840 E:142950 D:2 BT: 2}
for(int i = 0;i<in.getChildCount();i ++)getTextTokens((ParseTree)in.getChild(i), tt); {S:142851 E:142945 D:2 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:142840 E:142950 D:2 BT: 2}
for(int i = 0;i<in.getChildCount();i ++)getTextTokens((ParseTree)in.getChild(i), tt); {S:142851 E:142945 D:3 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:142398 E:142950 D:0 BT: 7}
if(in.getChildCount()== 0){} {S:142399 E:142757 D:0 BT: 1}
 {S:142435 E:142571 D:1 BT: 7}
if(in.payload instanceof CommonToken){} {S:142436 E:142571 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:142485 E:0 D:2 BT: 0}
CommonToken ct =(CommonToken)in.payload; {S:142485 E:142526 D:2 BT: 0}
tt.add(new String(ct.getText())); {S:142533 E:142565 D:2 BT: 0}
else{} {S:142758 E:142950 D:0 BT: 2}
 {S:142762 E:142950 D:1 BT: 7}
if(in.getText().equals("blockStatement")&& tt.size()>0){} {S:142763 E:142839 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:142826 E:0 D:2 BT: 0}
return; {S:142826 E:142832 D:2 BT: 0}
else{} {S:142840 E:142950 D:1 BT: 2}
for(int i = 0;i<in.getChildCount();i ++)getTextTokens((ParseTree)in.getChild(i), tt); {S:142851 E:142945 D:2 BT: 0}
****************************/
    //S:142398   E:142950 D: 0BT: 7
   if(in.getChildCount()== 0) //S:142399   E:142757 D: 0BT: 1
   {
       //S:142435   E:142571 D: 1BT: 7
      if(in.payload instanceof CommonToken) //S:142436   E:142571 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:142485   E:0 D: 2BT: 0
         CommonToken ct =(CommonToken)in.payload; //S:142485   E:142526 D: 2BT: 0
         tt.add(new String(ct.getText())); //S:142533   E:142565 D: 2BT: 0
      }
   }
   else //S:142758   E:142950 D: 0BT: 2
   {
       //S:142762   E:142950 D: 1BT: 7
      if(in.getText().equals("blockStatement")&& tt.size()>0) //S:142763   E:142839 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:142826   E:0 D: 2BT: 0
         return; //S:142826   E:142832 D: 2BT: 0
      }
      else //S:142840   E:142950 D: 1BT: 2
      {
         for(int i = 0;i<in.getChildCount();i ++)getTextTokens((ParseTree)in.getChild(i), tt); //S:142851   E:142945 D: 2BT: 0
      }
   }
   }

   private String getLineText(ParseTree in, boolean setTokens, String noWS)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:8 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:143041 E:143059 D:0 BT: 0}
LinkedList temp = new LinkedList(); {S:143075 E:143109 D:0 BT: 0}
getTextTokens(in , temp); {S:143114 E:143137 D:0 BT: 0}
for(int i = 0;i<temp.size();i ++){} {S:143192 E:143608 D:0 BT: 0}
<sublist>
String str =(String)temp.get(i); {S:143284 E:143317 D:1 BT: 0}
String tok = str; {S:143376 E:143392 D:1 BT: 0}
boolean sp = false; {S:143414 E:143432 D:1 BT: 0}
</sublist>
return rtnVal; {S:143613 E:143626 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:143041 E:143059 D:0 BT: 0}
LinkedList temp = new LinkedList(); {S:143075 E:143109 D:0 BT: 0}
getTextTokens(in , temp); {S:143114 E:143137 D:0 BT: 0}
for(int i = 0;i<temp.size();i ++){} {S:143192 E:143608 D:0 BT: 0}
<sublist>
String str =(String)temp.get(i); {S:143284 E:143317 D:1 BT: 0}
String tok = str; {S:143376 E:143392 D:1 BT: 0}
boolean sp = false; {S:143414 E:143432 D:1 BT: 0}
</sublist>
return rtnVal; {S:143613 E:143626 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:143141 E:143187 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:143141 E:143187 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:143438 E:143481 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:143438 E:143481 D:1 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:143487 E:143595 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:143487 E:143595 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(setTokens){} {S:143142 E:143187 D:0 BT: 1}
textTokens = temp; {S:143165 E:143182 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(setTokens){} {S:143142 E:143187 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:143165 E:0 D:1 BT: 0}
textTokens = temp; {S:143165 E:143182 D:1 BT: 0}
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
if(noWS.indexOf(tok)>- 1) {S:143439 E:143481 D:1 BT: 1}
sp = true; {S:143472 E:143481 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(noWS.indexOf(tok)>- 1){} {S:143439 E:143481 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:143472 E:0 D:2 BT: 0}
sp = true; {S:143472 E:143481 D:2 BT: 0}
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
if(sp){ {S:143488 E:143570 D:1 BT: 1}
rtnVal = rtnVal.trim(); {S:143508 E:143530 D:2 BT: 0}
rtnVal += tok; {S:143538 E:143551 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(sp){} {S:143488 E:143570 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:143508 E:0 D:2 BT: 0}
rtnVal = rtnVal.trim(); {S:143508 E:143530 D:2 BT: 0}
rtnVal += tok; {S:143538 E:143551 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:143571 E:143595 D:1 BT: 2}
rtnVal += tok + " "; {S:143576 E:143595 D:1 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:143571 E:143595 D:1 BT: 2}
rtnVal += tok + " "; {S:143576 E:143595 D:2 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:143041 E:143059 D:0 BT: 0}
LinkedList temp = new LinkedList(); {S:143075 E:143109 D:0 BT: 0}
getTextTokens(in , temp); {S:143114 E:143137 D:0 BT: 0}
 {S:143141 E:143187 D:0 BT: 7}
if(setTokens){} {S:143142 E:143187 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:143165 E:0 D:1 BT: 0}
textTokens = temp; {S:143165 E:143182 D:1 BT: 0}
for(int i = 0;i<temp.size();i ++){} {S:143192 E:143608 D:0 BT: 0}
<sublist>
String str =(String)temp.get(i); {S:143284 E:143317 D:1 BT: 0}
String tok = str; {S:143376 E:143392 D:1 BT: 0}
boolean sp = false; {S:143414 E:143432 D:1 BT: 0}
</sublist>
String str =(String)temp.get(i); {S:143284 E:143317 D:1 BT: 0}
String tok = str; {S:143376 E:143392 D:1 BT: 0}
boolean sp = false; {S:143414 E:143432 D:1 BT: 0}
 {S:143438 E:143481 D:1 BT: 7}
if(noWS.indexOf(tok)>- 1){} {S:143439 E:143481 D:1 BT: 1}
QuicktestRunner.execPath += 2; {S:143472 E:0 D:2 BT: 0}
sp = true; {S:143472 E:143481 D:2 BT: 0}
 {S:143487 E:143595 D:1 BT: 7}
if(sp){} {S:143488 E:143570 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:143508 E:0 D:2 BT: 0}
rtnVal = rtnVal.trim(); {S:143508 E:143530 D:2 BT: 0}
rtnVal += tok; {S:143538 E:143551 D:2 BT: 0}
else{} {S:143571 E:143595 D:1 BT: 2}
rtnVal += tok + " "; {S:143576 E:143595 D:2 BT: 0}
return rtnVal; {S:143613 E:143626 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:143041   E:143059 D: 0BT: 0
   LinkedList temp = new LinkedList(); //S:143075   E:143109 D: 0BT: 0
   getTextTokens(in , temp); //S:143114   E:143137 D: 0BT: 0
    //S:143141   E:143187 D: 0BT: 7
   if(setTokens) //S:143142   E:143187 D: 0BT: 1
   {
      QuicktestRunner.execPath += 4; //S:143165   E:0 D: 1BT: 0
      textTokens = temp; //S:143165   E:143182 D: 1BT: 0
   }
   for(int i = 0;i<temp.size();i ++) //S:143192   E:143608 D: 0BT: 0
   {
      String str =(String)temp.get(i); //S:143284   E:143317 D: 1BT: 0
      String tok = str; //S:143376   E:143392 D: 1BT: 0
      boolean sp = false; //S:143414   E:143432 D: 1BT: 0
       //S:143438   E:143481 D: 1BT: 7
      if(noWS.indexOf(tok)>- 1) //S:143439   E:143481 D: 1BT: 1
      {
         QuicktestRunner.execPath += 2; //S:143472   E:0 D: 2BT: 0
         sp = true; //S:143472   E:143481 D: 2BT: 0
      }
       //S:143487   E:143595 D: 1BT: 7
      if(sp) //S:143488   E:143570 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:143508   E:0 D: 2BT: 0
         rtnVal = rtnVal.trim(); //S:143508   E:143530 D: 2BT: 0
         rtnVal += tok; //S:143538   E:143551 D: 2BT: 0
      }
      else //S:143571   E:143595 D: 1BT: 2
      {
         rtnVal += tok + " "; //S:143576   E:143595 D: 2BT: 0
      }
   }
   return rtnVal; //S:143613   E:143626 D: 0BT: 0
   }

   @Override
	public void addToTree(ClassListTest list, TreeStatusTest info, LinkedList nodeList) 
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:3 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:143843 E:144579 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:143843 E:144579 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(this.isStatic){ {S:143844 E:143911 D:0 BT: 1}
list.staticContext.add(this); {S:143871 E:143899 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(this.isStatic){} {S:143844 E:143911 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:143871 E:0 D:1 BT: 0}
list.staticContext.add(this); {S:143871 E:143899 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:2 CP:0
/***************************
Processing list:
 {S:143912 E:144579 D:0 BT: 2}
processBranchType(list , info); {S:144224 E:144253 D:0 BT: 0}
tree = null; {S:144515 E:144526 D:0 BT: 0}
info.getCurrentMethod().allLines.add(this); {S:144532 E:144574 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:143912 E:144579 D:0 BT: 2}
processBranchType(list , info); {S:144224 E:144253 D:1 BT: 0}
tree = null; {S:144515 E:144526 D:1 BT: 0}
info.getCurrentMethod().allLines.add(this); {S:144532 E:144574 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(4) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:144070 E:144218 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:144070 E:144218 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#6(5) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(info.getCurrentMethod().getEndChar()<this.getStartChar()){} {S:144071 E:144218 D:2 BT: 1}
info.setCurrentMethod(list.findMethodWithChar(this.getStartChar())); {S:144145 E:144212 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(info.getCurrentMethod().getEndChar()<this.getStartChar()){} {S:144071 E:144218 D:2 BT: 1}
QuicktestRunner.execPath += 1; {S:144145 E:0 D:3 BT: 0}
info.setCurrentMethod(list.findMethodWithChar(this.getStartChar())); {S:144145 E:144212 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#7(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:143843 E:144579 D:0 BT: 7}
if(this.isStatic){} {S:143844 E:143911 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:143871 E:0 D:1 BT: 0}
list.staticContext.add(this); {S:143871 E:143899 D:1 BT: 0}
else{} {S:143912 E:144579 D:0 BT: 2}
 {S:144070 E:144218 D:1 BT: 7}
if(info.getCurrentMethod().getEndChar()<this.getStartChar()){} {S:144071 E:144218 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:144145 E:0 D:2 BT: 0}
info.setCurrentMethod(list.findMethodWithChar(this.getStartChar())); {S:144145 E:144212 D:2 BT: 0}
processBranchType(list , info); {S:144224 E:144253 D:1 BT: 0}
tree = null; {S:144515 E:144526 D:1 BT: 0}
info.getCurrentMethod().allLines.add(this); {S:144532 E:144574 D:1 BT: 0}
****************************/
    //S:143843   E:144579 D: 0BT: 7
   if(this.isStatic) //S:143844   E:143911 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:143871   E:0 D: 1BT: 0
      list.staticContext.add(this); //S:143871   E:143899 D: 1BT: 0
   }
   else //S:143912   E:144579 D: 0BT: 2
   {
       //S:144070   E:144218 D: 1BT: 7
      if(info.getCurrentMethod().getEndChar()<this.getStartChar()) //S:144071   E:144218 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:144145   E:0 D: 2BT: 0
         info.setCurrentMethod(list.findMethodWithChar(this.getStartChar())); //S:144145   E:144212 D: 2BT: 0
      }
      processBranchType(list , info); //S:144224   E:144253 D: 1BT: 0
      tree = null; //S:144515   E:144526 D: 1BT: 0
      info.getCurrentMethod().allLines.add(this); //S:144532   E:144574 D: 1BT: 0
   }
   }

   public String toString()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return super.toString()+ " B:" + branchType + " :" + lineText; {S:144622 E:144684 D:0 BT: 0}
****************************/
/***************************
Processing list:
return super.toString()+ " B:" + branchType + " :" + lineText; {S:144622 E:144684 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return super.toString()+ " B:" + branchType + " :" + lineText; {S:144622 E:144684 D:0 BT: 0}
****************************/
   return super.toString()+ " B:" + branchType + " :" + lineText; //S:144622   E:144684 D: 0BT: 0
   }

   public String getLIInformation()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return lineText + " {S:" + startChar + " E:" + endChar + " D:" + tabDepth + " BT: " + branchType + "}\n"; {S:144735 E:144839 D:0 BT: 0}
****************************/
/***************************
Processing list:
return lineText + " {S:" + startChar + " E:" + endChar + " D:" + tabDepth + " BT: " + branchType + "}\n"; {S:144735 E:144839 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return lineText + " {S:" + startChar + " E:" + endChar + " D:" + tabDepth + " BT: " + branchType + "}\n"; {S:144735 E:144839 D:0 BT: 0}
****************************/
   return lineText + " {S:" + startChar + " E:" + endChar + " D:" + tabDepth + " BT: " + branchType + "}\n"; //S:144735   E:144839 D: 0BT: 0
   }

   public String outputPathCode(String noWS)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:9 CP:0
/***************************
Processing list:
String rtnVal = new String(); {S:144899 E:144927 D:0 BT: 0}
return rtnVal; {S:145424 E:145437 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = new String(); {S:144899 E:144927 D:0 BT: 0}
return rtnVal; {S:145424 E:145437 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:9 CP:0
/***************************
Processing list:
switch(branchType){case 0:case TRY:case TERNARY:case IF:case ELSE:case SWITCH:case CASE:case DEFAULT:} {S:144984 E:145419 D:0 BT: 3}
****************************/
/***************************
Processing list:
switch(branchType){} {S:144984 E:145419 D:0 BT: 3}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:4 Paths:1 CP:8
/***************************
Processing list:
case 0: {S:145011 E:145017 D:1 BT: 4}
case TRY: {S:145019 E:145027 D:1 BT: 4}
case TERNARY: {S:145029 E:145081 D:1 BT: 4}
rtnVal += this.lineText; {S:145047 E:145070 D:2 BT: 0}
break; {S:145076 E:145081 D:2 BT: 0}
****************************/
/***************************
Processing list:
case 0: {S:145011 E:145017 D:1 BT: 4}
QuicktestRunner.execPath += 8; {S:145019 E:0 D:1 BT: 0}
QuicktestRunner.execPath -= 7; {S:145019 E:0 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:4 Paths:1 CP:7
/***************************
Processing list:
case TRY: {S:145019 E:145027 D:1 BT: 4}
case TERNARY: {S:145029 E:145081 D:1 BT: 4}
rtnVal += this.lineText; {S:145047 E:145070 D:2 BT: 0}
break; {S:145076 E:145081 D:2 BT: 0}
****************************/
/***************************
Processing list:
case TRY: {S:145019 E:145027 D:1 BT: 4}
QuicktestRunner.execPath += 7; {S:145029 E:0 D:1 BT: 0}
QuicktestRunner.execPath -= 6; {S:145029 E:0 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#5(2) Type:4 Paths:1 CP:6
/***************************
Processing list:
case TERNARY: {S:145029 E:145081 D:1 BT: 4}
rtnVal += this.lineText; {S:145047 E:145070 D:2 BT: 0}
break; {S:145076 E:145081 D:2 BT: 0}
****************************/
/***************************
Processing list:
case TERNARY: {S:145029 E:145081 D:1 BT: 4}
QuicktestRunner.execPath += 6; {S:145047 E:0 D:2 BT: 0}
rtnVal += this.lineText; {S:145047 E:145070 D:2 BT: 0}
break; {S:145076 E:145081 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:4 Paths:1 CP:5
/***************************
Processing list:
case IF: {S:145086 E:145145 D:1 BT: 4}
rtnVal += "// because " + condition; {S:145099 E:145134 D:2 BT: 0}
break; {S:145140 E:145145 D:2 BT: 0}
****************************/
/***************************
Processing list:
case IF: {S:145086 E:145145 D:1 BT: 4}
QuicktestRunner.execPath += 5; {S:145099 E:0 D:2 BT: 0}
rtnVal += "// because " + condition; {S:145099 E:145134 D:2 BT: 0}
break; {S:145140 E:145145 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#7(2) Type:4 Paths:1 CP:4
/***************************
Processing list:
case ELSE: {S:145150 E:145212 D:1 BT: 4}
rtnVal += "// because !" + condition; {S:145165 E:145201 D:2 BT: 0}
break; {S:145207 E:145212 D:2 BT: 0}
****************************/
/***************************
Processing list:
case ELSE: {S:145150 E:145212 D:1 BT: 4}
QuicktestRunner.execPath += 4; {S:145165 E:0 D:2 BT: 0}
rtnVal += "// because !" + condition; {S:145165 E:145201 D:2 BT: 0}
break; {S:145207 E:145212 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#8(2) Type:4 Paths:1 CP:3
/***************************
Processing list:
case SWITCH: {S:145217 E:145282 D:1 BT: 4}
rtnVal += "// switch on " + condition; {S:145234 E:145271 D:2 BT: 0}
break; {S:145277 E:145282 D:2 BT: 0}
****************************/
/***************************
Processing list:
case SWITCH: {S:145217 E:145282 D:1 BT: 4}
QuicktestRunner.execPath += 3; {S:145234 E:0 D:2 BT: 0}
rtnVal += "// switch on " + condition; {S:145234 E:145271 D:2 BT: 0}
break; {S:145277 E:145282 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#9(2) Type:4 Paths:1 CP:2
/***************************
Processing list:
case CASE: {S:145287 E:145349 D:1 BT: 4}
rtnVal += "// value is " + condition; {S:145302 E:145338 D:2 BT: 0}
break; {S:145344 E:145349 D:2 BT: 0}
****************************/
/***************************
Processing list:
case CASE: {S:145287 E:145349 D:1 BT: 4}
QuicktestRunner.execPath += 2; {S:145302 E:0 D:2 BT: 0}
rtnVal += "// value is " + condition; {S:145302 E:145338 D:2 BT: 0}
break; {S:145344 E:145349 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#10(2) Type:4 Paths:1 CP:1
/***************************
Processing list:
case DEFAULT: {S:145354 E:145414 D:1 BT: 4}
rtnVal += "// all other values"; {S:145372 E:145403 D:2 BT: 0}
break; {S:145409 E:145414 D:2 BT: 0}
****************************/
/***************************
Processing list:
case DEFAULT: {S:145354 E:145414 D:1 BT: 4}
QuicktestRunner.execPath += 1; {S:145372 E:0 D:2 BT: 0}
rtnVal += "// all other values"; {S:145372 E:145403 D:2 BT: 0}
break; {S:145409 E:145414 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#11(2) Type:5 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = new String(); {S:144899 E:144927 D:0 BT: 0}
switch(branchType){} {S:144984 E:145419 D:0 BT: 3}
case 0: {S:145011 E:145017 D:1 BT: 4}
QuicktestRunner.execPath += 8; {S:145019 E:0 D:1 BT: 0}
QuicktestRunner.execPath -= 7; {S:145019 E:0 D:1 BT: 0}
case TRY: {S:145019 E:145027 D:1 BT: 4}
QuicktestRunner.execPath += 7; {S:145029 E:0 D:1 BT: 0}
QuicktestRunner.execPath -= 6; {S:145029 E:0 D:1 BT: 0}
case TERNARY: {S:145029 E:145081 D:1 BT: 4}
QuicktestRunner.execPath += 6; {S:145047 E:0 D:2 BT: 0}
rtnVal += this.lineText; {S:145047 E:145070 D:2 BT: 0}
break; {S:145076 E:145081 D:2 BT: 0}
case IF: {S:145086 E:145145 D:1 BT: 4}
QuicktestRunner.execPath += 5; {S:145099 E:0 D:2 BT: 0}
rtnVal += "// because " + condition; {S:145099 E:145134 D:2 BT: 0}
break; {S:145140 E:145145 D:2 BT: 0}
case ELSE: {S:145150 E:145212 D:1 BT: 4}
QuicktestRunner.execPath += 4; {S:145165 E:0 D:2 BT: 0}
rtnVal += "// because !" + condition; {S:145165 E:145201 D:2 BT: 0}
break; {S:145207 E:145212 D:2 BT: 0}
case SWITCH: {S:145217 E:145282 D:1 BT: 4}
QuicktestRunner.execPath += 3; {S:145234 E:0 D:2 BT: 0}
rtnVal += "// switch on " + condition; {S:145234 E:145271 D:2 BT: 0}
break; {S:145277 E:145282 D:2 BT: 0}
case CASE: {S:145287 E:145349 D:1 BT: 4}
QuicktestRunner.execPath += 2; {S:145302 E:0 D:2 BT: 0}
rtnVal += "// value is " + condition; {S:145302 E:145338 D:2 BT: 0}
break; {S:145344 E:145349 D:2 BT: 0}
case DEFAULT: {S:145354 E:145414 D:1 BT: 4}
QuicktestRunner.execPath += 1; {S:145372 E:0 D:2 BT: 0}
rtnVal += "// all other values"; {S:145372 E:145403 D:2 BT: 0}
break; {S:145409 E:145414 D:2 BT: 0}
return rtnVal; {S:145424 E:145437 D:0 BT: 0}
****************************/
   String rtnVal = new String(); //S:144899   E:144927 D: 0BT: 0
   switch(branchType) //S:144984   E:145419 D: 0BT: 3
   {
      case 0: //S:145011   E:145017 D: 1BT: 4
      QuicktestRunner.execPath += 8; //S:145019   E:0 D: 1BT: 0
      QuicktestRunner.execPath -= 7; //S:145019   E:0 D: 1BT: 0
      case TRY: //S:145019   E:145027 D: 1BT: 4
      QuicktestRunner.execPath += 7; //S:145029   E:0 D: 1BT: 0
      QuicktestRunner.execPath -= 6; //S:145029   E:0 D: 1BT: 0
      case TERNARY: //S:145029   E:145081 D: 1BT: 4
      {
         QuicktestRunner.execPath += 6; //S:145047   E:0 D: 2BT: 0
         rtnVal += this.lineText; //S:145047   E:145070 D: 2BT: 0
         break; //S:145076   E:145081 D: 2BT: 0
      }
      case IF: //S:145086   E:145145 D: 1BT: 4
      {
         QuicktestRunner.execPath += 5; //S:145099   E:0 D: 2BT: 0
         rtnVal += "// because " + condition; //S:145099   E:145134 D: 2BT: 0
         break; //S:145140   E:145145 D: 2BT: 0
      }
      case ELSE: //S:145150   E:145212 D: 1BT: 4
      {
         QuicktestRunner.execPath += 4; //S:145165   E:0 D: 2BT: 0
         rtnVal += "// because !" + condition; //S:145165   E:145201 D: 2BT: 0
         break; //S:145207   E:145212 D: 2BT: 0
      }
      case SWITCH: //S:145217   E:145282 D: 1BT: 4
      {
         QuicktestRunner.execPath += 3; //S:145234   E:0 D: 2BT: 0
         rtnVal += "// switch on " + condition; //S:145234   E:145271 D: 2BT: 0
         break; //S:145277   E:145282 D: 2BT: 0
      }
      case CASE: //S:145287   E:145349 D: 1BT: 4
      {
         QuicktestRunner.execPath += 2; //S:145302   E:0 D: 2BT: 0
         rtnVal += "// value is " + condition; //S:145302   E:145338 D: 2BT: 0
         break; //S:145344   E:145349 D: 2BT: 0
      }
      case DEFAULT: //S:145354   E:145414 D: 1BT: 4
      {
         QuicktestRunner.execPath += 1; //S:145372   E:0 D: 2BT: 0
         rtnVal += "// all other values"; //S:145372   E:145403 D: 2BT: 0
         break; //S:145409   E:145414 D: 2BT: 0
      }
   }
   return rtnVal; //S:145424   E:145437 D: 0BT: 0
   }

   String[] getLValue()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:4 CP:0
/***************************
Processing list:
int lvalLen = 0; {S:145482 E:145497 D:0 BT: 0}
for(int i = 0;i<textTokens.size();i ++){} {S:145502 E:145764 D:0 BT: 0}
<sublist>
String tok =(String)textTokens.get(i); {S:145554 E:145593 D:1 BT: 0}
for(int j = 0;j<ASSIGNS.length;j ++){} {S:145599 E:145727 D:1 BT: 0}
</sublist>
String[]rtnVal = new String[lvalLen]; {S:145769 E:145806 D:0 BT: 0}
for(int i = 0;i<lvalLen;i ++){} {S:145811 E:145896 D:0 BT: 0}
<sublist>
rtnVal[i]=(String)textTokens.get(i); {S:145853 E:145891 D:1 BT: 0}
</sublist>
return rtnVal; {S:145901 E:145914 D:0 BT: 0}
****************************/
/***************************
Processing list:
int lvalLen = 0; {S:145482 E:145497 D:0 BT: 0}
for(int i = 0;i<textTokens.size();i ++){} {S:145502 E:145764 D:0 BT: 0}
<sublist>
String tok =(String)textTokens.get(i); {S:145554 E:145593 D:1 BT: 0}
for(int j = 0;j<ASSIGNS.length;j ++){} {S:145599 E:145727 D:1 BT: 0}
</sublist>
String[]rtnVal = new String[lvalLen]; {S:145769 E:145806 D:0 BT: 0}
for(int i = 0;i<lvalLen;i ++){} {S:145811 E:145896 D:0 BT: 0}
<sublist>
rtnVal[i]=(String)textTokens.get(i); {S:145853 E:145891 D:1 BT: 0}
</sublist>
return rtnVal; {S:145901 E:145914 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:145649 E:145721 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:145649 E:145721 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:145732 E:145759 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:145732 E:145759 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#4(2) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(tok.equals(ASSIGNS[j])){} {S:145650 E:145721 D:2 BT: 1}
lvalLen = i; {S:145690 E:145701 D:3 BT: 0}
break; {S:145709 E:145714 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(tok.equals(ASSIGNS[j])){} {S:145650 E:145721 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:145690 E:0 D:3 BT: 0}
lvalLen = i; {S:145690 E:145701 D:3 BT: 0}
break; {S:145709 E:145714 D:3 BT: 0}
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
if(lvalLen>0) {S:145733 E:145759 D:1 BT: 1}
break; {S:145754 E:145759 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(lvalLen>0){} {S:145733 E:145759 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:145754 E:0 D:2 BT: 0}
break; {S:145754 E:145759 D:2 BT: 0}
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
int lvalLen = 0; {S:145482 E:145497 D:0 BT: 0}
for(int i = 0;i<textTokens.size();i ++){} {S:145502 E:145764 D:0 BT: 0}
<sublist>
String tok =(String)textTokens.get(i); {S:145554 E:145593 D:1 BT: 0}
for(int j = 0;j<ASSIGNS.length;j ++){} {S:145599 E:145727 D:1 BT: 0}
</sublist>
String tok =(String)textTokens.get(i); {S:145554 E:145593 D:1 BT: 0}
for(int j = 0;j<ASSIGNS.length;j ++){} {S:145599 E:145727 D:1 BT: 0}
 {S:145649 E:145721 D:2 BT: 7}
if(tok.equals(ASSIGNS[j])){} {S:145650 E:145721 D:2 BT: 1}
QuicktestRunner.execPath += 2; {S:145690 E:0 D:3 BT: 0}
lvalLen = i; {S:145690 E:145701 D:3 BT: 0}
break; {S:145709 E:145714 D:3 BT: 0}
 {S:145732 E:145759 D:1 BT: 7}
if(lvalLen>0){} {S:145733 E:145759 D:1 BT: 1}
QuicktestRunner.execPath += 1; {S:145754 E:0 D:2 BT: 0}
break; {S:145754 E:145759 D:2 BT: 0}
String[]rtnVal = new String[lvalLen]; {S:145769 E:145806 D:0 BT: 0}
for(int i = 0;i<lvalLen;i ++){} {S:145811 E:145896 D:0 BT: 0}
<sublist>
rtnVal[i]=(String)textTokens.get(i); {S:145853 E:145891 D:1 BT: 0}
</sublist>
rtnVal[i]=(String)textTokens.get(i); {S:145853 E:145891 D:1 BT: 0}
return rtnVal; {S:145901 E:145914 D:0 BT: 0}
****************************/
   int lvalLen = 0; //S:145482   E:145497 D: 0BT: 0
   for(int i = 0;i<textTokens.size();i ++) //S:145502   E:145764 D: 0BT: 0
   {
      String tok =(String)textTokens.get(i); //S:145554   E:145593 D: 1BT: 0
      for(int j = 0;j<ASSIGNS.length;j ++) //S:145599   E:145727 D: 1BT: 0
      {
          //S:145649   E:145721 D: 2BT: 7
         if(tok.equals(ASSIGNS[j])) //S:145650   E:145721 D: 2BT: 1
         {
            QuicktestRunner.execPath += 2; //S:145690   E:0 D: 3BT: 0
            lvalLen = i; //S:145690   E:145701 D: 3BT: 0
            break; //S:145709   E:145714 D: 3BT: 0
         }
      }
       //S:145732   E:145759 D: 1BT: 7
      if(lvalLen>0) //S:145733   E:145759 D: 1BT: 1
      {
         QuicktestRunner.execPath += 1; //S:145754   E:0 D: 2BT: 0
         break; //S:145754   E:145759 D: 2BT: 0
      }
   }
   String[]rtnVal = new String[lvalLen]; //S:145769   E:145806 D: 0BT: 0
   for(int i = 0;i<lvalLen;i ++) //S:145811   E:145896 D: 0BT: 0
   {
      rtnVal[i]=(String)textTokens.get(i); //S:145853   E:145891 D: 1BT: 0
   }
   return rtnVal; //S:145901   E:145914 D: 0BT: 0
   }

   String[] getRValue()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String[]lval = getLValue(); {S:145953 E:145980 D:0 BT: 0}
int rvalLen = textTokens.size()- lval.length; {S:145985 E:146030 D:0 BT: 0}
String[]rtnVal = new String[rvalLen]; {S:146035 E:146072 D:0 BT: 0}
for(int i = lval.length;i<textTokens.size();i ++)rtnVal[i - lval.length]=(String)textTokens.get(i); {S:146077 E:146186 D:0 BT: 0}
return rtnVal; {S:146191 E:146204 D:0 BT: 0}
****************************/
/***************************
Processing list:
String[]lval = getLValue(); {S:145953 E:145980 D:0 BT: 0}
int rvalLen = textTokens.size()- lval.length; {S:145985 E:146030 D:0 BT: 0}
String[]rtnVal = new String[rvalLen]; {S:146035 E:146072 D:0 BT: 0}
for(int i = lval.length;i<textTokens.size();i ++)rtnVal[i - lval.length]=(String)textTokens.get(i); {S:146077 E:146186 D:0 BT: 0}
return rtnVal; {S:146191 E:146204 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String[]lval = getLValue(); {S:145953 E:145980 D:0 BT: 0}
int rvalLen = textTokens.size()- lval.length; {S:145985 E:146030 D:0 BT: 0}
String[]rtnVal = new String[rvalLen]; {S:146035 E:146072 D:0 BT: 0}
for(int i = lval.length;i<textTokens.size();i ++)rtnVal[i - lval.length]=(String)textTokens.get(i); {S:146077 E:146186 D:0 BT: 0}
return rtnVal; {S:146191 E:146204 D:0 BT: 0}
****************************/
   String[]lval = getLValue(); //S:145953   E:145980 D: 0BT: 0
   int rvalLen = textTokens.size()- lval.length; //S:145985   E:146030 D: 0BT: 0
   String[]rtnVal = new String[rvalLen]; //S:146035   E:146072 D: 0BT: 0
   for(int i = lval.length;i<textTokens.size();i ++)rtnVal[i - lval.length]=(String)textTokens.get(i); //S:146077   E:146186 D: 0BT: 0
   return rtnVal; //S:146191   E:146204 D: 0BT: 0
   }

   public AssertionInfoTest yieldsAssertion(ClassListTest cl, MethodInfoTest mi, VarListTest scope)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:584 CP:0
/***************************
Processing list:
String line = this.lineText; {S:146306 E:146333 D:0 BT: 0}
line = WhiteboxUtils.removeComments(line , false); {S:146378 E:146426 D:0 BT: 0}
line = line.trim(); {S:146431 E:146449 D:0 BT: 0}
for(int k = 0;k<ASSIGNS.length;k ++){} {S:146646 E:150273 D:0 BT: 0}
<sublist>
int assgSplit = line.indexOf(ASSIGNS[k]); {S:146703 E:146743 D:1 BT: 0}
</sublist>
return null; {S:150282 E:150293 D:0 BT: 0}
****************************/
/***************************
Processing list:
String line = this.lineText; {S:146306 E:146333 D:0 BT: 0}
line = WhiteboxUtils.removeComments(line , false); {S:146378 E:146426 D:0 BT: 0}
line = line.trim(); {S:146431 E:146449 D:0 BT: 0}
for(int k = 0;k<ASSIGNS.length;k ++){} {S:146646 E:150273 D:0 BT: 0}
<sublist>
int assgSplit = line.indexOf(ASSIGNS[k]); {S:146703 E:146743 D:1 BT: 0}
</sublist>
return null; {S:150282 E:150293 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:146457 E:146499 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:146457 E:146499 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:146507 E:146598 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:146507 E:146598 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:146 CP:0
/***************************
Processing list:
 {S:146752 E:150264 D:1 BT: 7}
****************************/
/***************************
Processing list:
 {S:146752 E:150264 D:1 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:292
/***************************
Processing list:
if(line.equals("")) {S:146458 E:146499 D:0 BT: 1}
return null; {S:146488 E:146499 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(line.equals("")){} {S:146458 E:146499 D:0 BT: 1}
QuicktestRunner.execPath += 292; {S:146488 E:0 D:1 BT: 0}
return null; {S:146488 E:146499 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#6(2) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#7(3) Type:1 Paths:1 CP:146
/***************************
Processing list:
if(line.startsWith("return")) {S:146508 E:146598 D:0 BT: 1}
return new AssertionInfoTest(line , this.startChar , cl); {S:146548 E:146598 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(line.startsWith("return")){} {S:146508 E:146598 D:0 BT: 1}
QuicktestRunner.execPath += 146; {S:146548 E:0 D:1 BT: 0}
return new AssertionInfoTest(line , this.startChar , cl); {S:146548 E:146598 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#8(3) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#9(4) Type:1 Paths:145 CP:0
/***************************
Processing list:
if(assgSplit>- 1){} {S:146753 E:150264 D:1 BT: 1}
String[]equ = new String[2]; {S:146791 E:146819 D:2 BT: 0}
equ[0]= line.substring(0 , assgSplit); {S:146858 E:146895 D:2 BT: 0}
equ[1]= line.substring(assgSplit , line.length()- 1); {S:146906 E:146959 D:2 BT: 0}
****************************/
/***************************
Processing list:
if(assgSplit>- 1){} {S:146753 E:150264 D:1 BT: 1}
String[]equ = new String[2]; {S:146791 E:146819 D:2 BT: 0}
equ[0]= line.substring(0 , assgSplit); {S:146858 E:146895 D:2 BT: 0}
equ[1]= line.substring(assgSplit , line.length()- 1); {S:146906 E:146959 D:2 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(9) Type:-1 Paths:145 CP:0
/***************************
Processing list:
 {S:147061 E:150254 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:147061 E:150254 D:2 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#12(11) Type:1 Paths:1 CP:144
/***************************
Processing list:
if(equ[0].split(" ").length>1)else{} {S:147062 E:147149 D:2 BT: 1}
return null; {S:147111 E:147122 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(equ[0].split(" ").length>1){} {S:147062 E:147149 D:2 BT: 1}
QuicktestRunner.execPath += 144; {S:147111 E:0 D:3 BT: 0}
return null; {S:147111 E:147122 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#13(11) Type:2 Paths:144 CP:0
/***************************
Processing list:
 {S:147150 E:150254 D:2 BT: 2}
String[]dots = equ[0].split("\\."); {S:147173 E:147208 D:2 BT: 0}
String lastSection; {S:147226 E:147244 D:2 BT: 0}
String firstSection; {S:147262 E:147281 D:2 BT: 0}
lastSection = lastSection.trim(); {S:147611 E:147643 D:2 BT: 0}
firstSection = firstSection.trim(); {S:147661 E:147695 D:2 BT: 0}
System.out.println("finding: |" + lastSection + "|"); {S:147965 E:148017 D:2 BT: 0}
for(int i = 0;i<cl.size();i ++){} {S:148035 E:150239 D:2 BT: 0}
<sublist>
ClassInfoTest ci = cl.getClass(i); {S:148107 E:148136 D:3 BT: 0}
VarListTest vl = ci.vars; {S:148157 E:148177 D:3 BT: 0}
String assertionType = ""; {S:148198 E:148223 D:3 BT: 0}
String fromClassType = ""; {S:148242 E:148267 D:3 BT: 0}
for(int j = 0;j<vl.size();j ++){} {S:148288 E:148768 D:3 BT: 0}
<sublist>
VarInfoTest vi = vl.getVar(j); {S:148364 E:148389 D:4 BT: 0}
</sublist>
</sublist>
****************************/
/***************************
Processing list:
else{} {S:147150 E:150254 D:2 BT: 2}
String[]dots = equ[0].split("\\."); {S:147173 E:147208 D:3 BT: 0}
String lastSection; {S:147226 E:147244 D:3 BT: 0}
String firstSection; {S:147262 E:147281 D:3 BT: 0}
lastSection = lastSection.trim(); {S:147611 E:147643 D:3 BT: 0}
firstSection = firstSection.trim(); {S:147661 E:147695 D:3 BT: 0}
System.out.println("finding: |" + lastSection + "|"); {S:147965 E:148017 D:3 BT: 0}
for(int i = 0;i<cl.size();i ++){} {S:148035 E:150239 D:3 BT: 0}
<sublist>
ClassInfoTest ci = cl.getClass(i); {S:148107 E:148136 D:4 BT: 0}
VarListTest vl = ci.vars; {S:148157 E:148177 D:4 BT: 0}
String assertionType = ""; {S:148198 E:148223 D:4 BT: 0}
String fromClassType = ""; {S:148242 E:148267 D:4 BT: 0}
for(int j = 0;j<vl.size();j ++){} {S:148288 E:148768 D:4 BT: 0}
<sublist>
VarInfoTest vi = vl.getVar(j); {S:148364 E:148389 D:5 BT: 0}
</sublist>
</sublist>
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#14(13) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:147298 E:147593 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:147298 E:147593 D:4 BT: 7}
****************************/
//=======================================
//=======================================
//#15(13) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:147811 E:147876 D:4 BT: 7}
****************************/
/***************************
Processing list:
 {S:147811 E:147876 D:4 BT: 7}
****************************/
//=======================================
//=======================================
//#16(13) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:148412 E:148634 D:6 BT: 7}
****************************/
/***************************
Processing list:
 {S:148412 E:148634 D:6 BT: 7}
****************************/
//=======================================
//=======================================
//#17(13) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:148657 E:148747 D:6 BT: 7}
****************************/
/***************************
Processing list:
 {S:148657 E:148747 D:6 BT: 7}
****************************/
//=======================================
//=======================================
//#18(13) Type:-1 Paths:9 CP:0
/***************************
Processing list:
 {S:148788 E:150221 D:5 BT: 7}
****************************/
/***************************
Processing list:
 {S:148788 E:150221 D:5 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#19(14) Type:1 Paths:1 CP:72
/***************************
Processing list:
if(dots.length == 0){ {S:147299 E:147470 D:4 BT: 1}
lastSection = equ[0]; {S:147357 E:147377 D:5 BT: 0}
firstSection = equ[0]; {S:147398 E:147419 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(dots.length == 0){} {S:147299 E:147470 D:4 BT: 1}
QuicktestRunner.execPath += 72; {S:147357 E:0 D:5 BT: 0}
lastSection = equ[0]; {S:147357 E:147377 D:5 BT: 0}
firstSection = equ[0]; {S:147398 E:147419 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#20(14) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:147471 E:147593 D:4 BT: 2}
lastSection = dots[dots.length - 1]; {S:147497 E:147532 D:4 BT: 0}
firstSection = dots[0]; {S:147553 E:147575 D:4 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:147471 E:147593 D:4 BT: 2}
lastSection = dots[dots.length - 1]; {S:147497 E:147532 D:5 BT: 0}
firstSection = dots[0]; {S:147553 E:147575 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#21(15) Type:1 Paths:1 CP:36
/***************************
Processing list:
if(lastSection.indexOf('(')>- 1) {S:147812 E:147876 D:4 BT: 1}
return null; {S:147865 E:147876 D:5 BT: 0}
****************************/
/***************************
Processing list:
if(lastSection.indexOf('(')>- 1){} {S:147812 E:147876 D:4 BT: 1}
QuicktestRunner.execPath += 36; {S:147865 E:0 D:5 BT: 0}
return null; {S:147865 E:147876 D:5 BT: 0}
****************************/
//=======================================
//=======================================
//#22(15) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#23(16) Type:1 Paths:1 CP:18
/***************************
Processing list:
if(vi.getName().equals(lastSection)){} {S:148413 E:148634 D:6 BT: 1}
System.out.println("Class " + i + " Var " + j + " matches."); {S:148497 E:148557 D:7 BT: 0}
assertionType = vi.getType(); {S:148582 E:148610 D:7 BT: 0}
****************************/
/***************************
Processing list:
if(vi.getName().equals(lastSection)){} {S:148413 E:148634 D:6 BT: 1}
QuicktestRunner.execPath += 18; {S:148497 E:0 D:7 BT: 0}
System.out.println("Class " + i + " Var " + j + " matches."); {S:148497 E:148557 D:7 BT: 0}
assertionType = vi.getType(); {S:148582 E:148610 D:7 BT: 0}
****************************/
//=======================================
//=======================================
//#24(16) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#25(17) Type:1 Paths:1 CP:9
/***************************
Processing list:
if(vi.getName().equals(firstSection)) {S:148658 E:148747 D:6 BT: 1}
fromClassType = vi.getType(); {S:148719 E:148747 D:7 BT: 0}
****************************/
/***************************
Processing list:
if(vi.getName().equals(firstSection)){} {S:148658 E:148747 D:6 BT: 1}
QuicktestRunner.execPath += 9; {S:148719 E:0 D:7 BT: 0}
fromClassType = vi.getType(); {S:148719 E:148747 D:7 BT: 0}
****************************/
//=======================================
//=======================================
//#26(17) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#27(18) Type:1 Paths:8 CP:0
/***************************
Processing list:
if(!(assertionType.equals(""))){} {S:148789 E:150221 D:5 BT: 1}
AssertionInfoTest ai = new AssertionInfoTest(); {S:148864 E:148902 D:6 BT: 0}
ai.dataType = new VarInfoTest(assertionType , equ[0], 0); {S:149007 E:149058 D:6 BT: 0}
System.out.println(ai.dataType.getName()); {S:149142 E:149183 D:6 BT: 0}
System.out.println(ai.dataType.getType()); {S:149207 E:149248 D:6 BT: 0}
return ai; {S:150191 E:150200 D:6 BT: 0}
****************************/
/***************************
Processing list:
if(!(assertionType.equals(""))){} {S:148789 E:150221 D:5 BT: 1}
AssertionInfoTest ai = new AssertionInfoTest(); {S:148864 E:148902 D:6 BT: 0}
ai.dataType = new VarInfoTest(assertionType , equ[0], 0); {S:149007 E:149058 D:6 BT: 0}
System.out.println(ai.dataType.getName()); {S:149142 E:149183 D:6 BT: 0}
System.out.println(ai.dataType.getType()); {S:149207 E:149248 D:6 BT: 0}
return ai; {S:150191 E:150200 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#28(18) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:150221 E:0 D:5 BT: 0}
QuicktestRunner.execPath += 1; {S:150222 E:0 D:6 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#29(27) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:149464 E:149660 D:6 BT: 7}
****************************/
/***************************
Processing list:
 {S:149464 E:149660 D:6 BT: 7}
****************************/
//=======================================
//=======================================
//#30(27) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:149683 E:149773 D:6 BT: 7}
****************************/
/***************************
Processing list:
 {S:149683 E:149773 D:6 BT: 7}
****************************/
//=======================================
//=======================================
//#31(27) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:149950 E:150088 D:6 BT: 7}
****************************/
/***************************
Processing list:
 {S:149950 E:150088 D:6 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#32(29) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(dots[0].equals("this")||(firstSection.equals(lastSection)))else ai.fromClass = fromClassType; {S:149465 E:149626 D:6 BT: 1}
ai.fromClass = ci.className; {S:149553 E:149580 D:7 BT: 0}
****************************/
/***************************
Processing list:
if(dots[0].equals("this")||(firstSection.equals(lastSection))){} {S:149465 E:149626 D:6 BT: 1}
QuicktestRunner.execPath += 4; {S:149553 E:0 D:7 BT: 0}
ai.fromClass = ci.className; {S:149553 E:149580 D:7 BT: 0}
****************************/
//=======================================
//=======================================
//#33(29) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:149627 E:149660 D:6 BT: 2}
ai.fromClass = fromClassType; {S:149632 E:149660 D:6 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:149627 E:149660 D:6 BT: 2}
ai.fromClass = fromClassType; {S:149632 E:149660 D:7 BT: 0}
****************************/
//=======================================
//=======================================
//#34(30) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(! inScope(scope , ai.dataType , ai.fromClass , cl , ci)) {S:149684 E:149773 D:6 BT: 1}
return null; {S:149762 E:149773 D:7 BT: 0}
****************************/
/***************************
Processing list:
if(! inScope(scope , ai.dataType , ai.fromClass , cl , ci)){} {S:149684 E:149773 D:6 BT: 1}
QuicktestRunner.execPath += 2; {S:149762 E:0 D:7 BT: 0}
return null; {S:149762 E:149773 D:7 BT: 0}
****************************/
//=======================================
//=======================================
//#35(30) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#36(31) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(mi.returnType.getType().equals("ctor")&& ai.fromClass.equals(mi.returnType.getName())) {S:149951 E:150088 D:6 BT: 1}
ai.fromClass = "rtnVal"; {S:150065 E:150088 D:7 BT: 0}
****************************/
/***************************
Processing list:
if(mi.returnType.getType().equals("ctor")&& ai.fromClass.equals(mi.returnType.getName())){} {S:149951 E:150088 D:6 BT: 1}
QuicktestRunner.execPath += 3; {S:150065 E:0 D:7 BT: 0}
ai.fromClass = "rtnVal"; {S:150065 E:150088 D:7 BT: 0}
****************************/
//=======================================
//=======================================
//#37(31) Type:2 Paths:1 CP:2

/***************************
Processing list:
else {S:150088 E:0 D:6 BT: 0}
QuicktestRunner.execPath += 2; {S:150089 E:0 D:7 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String line = this.lineText; {S:146306 E:146333 D:0 BT: 0}
line = WhiteboxUtils.removeComments(line , false); {S:146378 E:146426 D:0 BT: 0}
line = line.trim(); {S:146431 E:146449 D:0 BT: 0}
 {S:146457 E:146499 D:0 BT: 7}
if(line.equals("")){} {S:146458 E:146499 D:0 BT: 1}
QuicktestRunner.execPath += 292; {S:146488 E:0 D:1 BT: 0}
return null; {S:146488 E:146499 D:1 BT: 0}
 {S:146507 E:146598 D:0 BT: 7}
if(line.startsWith("return")){} {S:146508 E:146598 D:0 BT: 1}
QuicktestRunner.execPath += 146; {S:146548 E:0 D:1 BT: 0}
return new AssertionInfoTest(line , this.startChar , cl); {S:146548 E:146598 D:1 BT: 0}
for(int k = 0;k<ASSIGNS.length;k ++){} {S:146646 E:150273 D:0 BT: 0}
<sublist>
int assgSplit = line.indexOf(ASSIGNS[k]); {S:146703 E:146743 D:1 BT: 0}
</sublist>
int assgSplit = line.indexOf(ASSIGNS[k]); {S:146703 E:146743 D:1 BT: 0}
 {S:146752 E:150264 D:1 BT: 7}
if(assgSplit>- 1){} {S:146753 E:150264 D:1 BT: 1}
String[]equ = new String[2]; {S:146791 E:146819 D:2 BT: 0}
equ[0]= line.substring(0 , assgSplit); {S:146858 E:146895 D:2 BT: 0}
equ[1]= line.substring(assgSplit , line.length()- 1); {S:146906 E:146959 D:2 BT: 0}
 {S:147061 E:150254 D:2 BT: 7}
if(equ[0].split(" ").length>1){} {S:147062 E:147149 D:2 BT: 1}
QuicktestRunner.execPath += 144; {S:147111 E:0 D:3 BT: 0}
return null; {S:147111 E:147122 D:3 BT: 0}
else{} {S:147150 E:150254 D:2 BT: 2}
String[]dots = equ[0].split("\\."); {S:147173 E:147208 D:3 BT: 0}
String lastSection; {S:147226 E:147244 D:3 BT: 0}
String firstSection; {S:147262 E:147281 D:3 BT: 0}
 {S:147298 E:147593 D:3 BT: 7}
if(dots.length == 0){} {S:147299 E:147470 D:3 BT: 1}
QuicktestRunner.execPath += 72; {S:147357 E:0 D:4 BT: 0}
lastSection = equ[0]; {S:147357 E:147377 D:4 BT: 0}
firstSection = equ[0]; {S:147398 E:147419 D:4 BT: 0}
else{} {S:147471 E:147593 D:3 BT: 2}
lastSection = dots[dots.length - 1]; {S:147497 E:147532 D:4 BT: 0}
firstSection = dots[0]; {S:147553 E:147575 D:4 BT: 0}
lastSection = lastSection.trim(); {S:147611 E:147643 D:3 BT: 0}
firstSection = firstSection.trim(); {S:147661 E:147695 D:3 BT: 0}
 {S:147811 E:147876 D:3 BT: 7}
if(lastSection.indexOf('(')>- 1){} {S:147812 E:147876 D:3 BT: 1}
QuicktestRunner.execPath += 36; {S:147865 E:0 D:4 BT: 0}
return null; {S:147865 E:147876 D:4 BT: 0}
System.out.println("finding: |" + lastSection + "|"); {S:147965 E:148017 D:3 BT: 0}
for(int i = 0;i<cl.size();i ++){} {S:148035 E:150239 D:3 BT: 0}
<sublist>
ClassInfoTest ci = cl.getClass(i); {S:148107 E:148136 D:4 BT: 0}
VarListTest vl = ci.vars; {S:148157 E:148177 D:4 BT: 0}
String assertionType = ""; {S:148198 E:148223 D:4 BT: 0}
String fromClassType = ""; {S:148242 E:148267 D:4 BT: 0}
for(int j = 0;j<vl.size();j ++){} {S:148288 E:148768 D:4 BT: 0}
<sublist>
VarInfoTest vi = vl.getVar(j); {S:148364 E:148389 D:5 BT: 0}
</sublist>
</sublist>
ClassInfoTest ci = cl.getClass(i); {S:148107 E:148136 D:4 BT: 0}
VarListTest vl = ci.vars; {S:148157 E:148177 D:4 BT: 0}
String assertionType = ""; {S:148198 E:148223 D:4 BT: 0}
String fromClassType = ""; {S:148242 E:148267 D:4 BT: 0}
for(int j = 0;j<vl.size();j ++){} {S:148288 E:148768 D:4 BT: 0}
<sublist>
VarInfoTest vi = vl.getVar(j); {S:148364 E:148389 D:5 BT: 0}
</sublist>
VarInfoTest vi = vl.getVar(j); {S:148364 E:148389 D:5 BT: 0}
 {S:148412 E:148634 D:5 BT: 7}
if(vi.getName().equals(lastSection)){} {S:148413 E:148634 D:5 BT: 1}
QuicktestRunner.execPath += 18; {S:148497 E:0 D:6 BT: 0}
System.out.println("Class " + i + " Var " + j + " matches."); {S:148497 E:148557 D:6 BT: 0}
assertionType = vi.getType(); {S:148582 E:148610 D:6 BT: 0}
 {S:148657 E:148747 D:5 BT: 7}
if(vi.getName().equals(firstSection)){} {S:148658 E:148747 D:5 BT: 1}
QuicktestRunner.execPath += 9; {S:148719 E:0 D:6 BT: 0}
fromClassType = vi.getType(); {S:148719 E:148747 D:6 BT: 0}
 {S:148788 E:150221 D:4 BT: 7}
if(!(assertionType.equals(""))){} {S:148789 E:150221 D:4 BT: 1}
AssertionInfoTest ai = new AssertionInfoTest(); {S:148864 E:148902 D:5 BT: 0}
ai.dataType = new VarInfoTest(assertionType , equ[0], 0); {S:149007 E:149058 D:5 BT: 0}
System.out.println(ai.dataType.getName()); {S:149142 E:149183 D:5 BT: 0}
System.out.println(ai.dataType.getType()); {S:149207 E:149248 D:5 BT: 0}
 {S:149464 E:149660 D:5 BT: 7}
if(dots[0].equals("this")||(firstSection.equals(lastSection))){} {S:149465 E:149626 D:5 BT: 1}
QuicktestRunner.execPath += 4; {S:149553 E:0 D:6 BT: 0}
ai.fromClass = ci.className; {S:149553 E:149580 D:6 BT: 0}
else{} {S:149627 E:149660 D:5 BT: 2}
ai.fromClass = fromClassType; {S:149632 E:149660 D:6 BT: 0}
 {S:149683 E:149773 D:5 BT: 7}
if(! inScope(scope , ai.dataType , ai.fromClass , cl , ci)){} {S:149684 E:149773 D:5 BT: 1}
QuicktestRunner.execPath += 2; {S:149762 E:0 D:6 BT: 0}
return null; {S:149762 E:149773 D:6 BT: 0}
 {S:149950 E:150088 D:5 BT: 7}
if(mi.returnType.getType().equals("ctor")&& ai.fromClass.equals(mi.returnType.getName())){} {S:149951 E:150088 D:5 BT: 1}
QuicktestRunner.execPath += 3; {S:150065 E:0 D:6 BT: 0}
ai.fromClass = "rtnVal"; {S:150065 E:150088 D:6 BT: 0}
else {S:150088 E:0 D:5 BT: 0}
QuicktestRunner.execPath += 2; {S:150089 E:0 D:6 BT: 0}
return ai; {S:150191 E:150200 D:5 BT: 0}
else {S:150221 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 1; {S:150222 E:0 D:5 BT: 0}
return null; {S:150282 E:150293 D:0 BT: 0}
****************************/
   String line = this.lineText; //S:146306   E:146333 D: 0BT: 0
   line = WhiteboxUtils.removeComments(line , false); //S:146378   E:146426 D: 0BT: 0
   line = line.trim(); //S:146431   E:146449 D: 0BT: 0
    //S:146457   E:146499 D: 0BT: 7
   if(line.equals("")) //S:146458   E:146499 D: 0BT: 1
   {
      QuicktestRunner.execPath += 292; //S:146488   E:0 D: 1BT: 0
      return null; //S:146488   E:146499 D: 1BT: 0
   }
    //S:146507   E:146598 D: 0BT: 7
   if(line.startsWith("return")) //S:146508   E:146598 D: 0BT: 1
   {
      QuicktestRunner.execPath += 146; //S:146548   E:0 D: 1BT: 0
      return new AssertionInfoTest(line , this.startChar , cl); //S:146548   E:146598 D: 1BT: 0
   }
   for(int k = 0;k<ASSIGNS.length;k ++) //S:146646   E:150273 D: 0BT: 0
   {
      int assgSplit = line.indexOf(ASSIGNS[k]); //S:146703   E:146743 D: 1BT: 0
       //S:146752   E:150264 D: 1BT: 7
      if(assgSplit>- 1) //S:146753   E:150264 D: 1BT: 1
      {
         String[]equ = new String[2]; //S:146791   E:146819 D: 2BT: 0
         equ[0]= line.substring(0 , assgSplit); //S:146858   E:146895 D: 2BT: 0
         equ[1]= line.substring(assgSplit , line.length()- 1); //S:146906   E:146959 D: 2BT: 0
          //S:147061   E:150254 D: 2BT: 7
         if(equ[0].split(" ").length>1) //S:147062   E:147149 D: 2BT: 1
         {
            QuicktestRunner.execPath += 144; //S:147111   E:0 D: 3BT: 0
            return null; //S:147111   E:147122 D: 3BT: 0
         }
         else //S:147150   E:150254 D: 2BT: 2
         {
            String[]dots = equ[0].split("\\."); //S:147173   E:147208 D: 3BT: 0
            String lastSection; //S:147226   E:147244 D: 3BT: 0
            String firstSection; //S:147262   E:147281 D: 3BT: 0
             //S:147298   E:147593 D: 3BT: 7
            if(dots.length == 0) //S:147299   E:147470 D: 3BT: 1
            {
               QuicktestRunner.execPath += 72; //S:147357   E:0 D: 4BT: 0
               lastSection = equ[0]; //S:147357   E:147377 D: 4BT: 0
               firstSection = equ[0]; //S:147398   E:147419 D: 4BT: 0
            }
            else //S:147471   E:147593 D: 3BT: 2
            {
               lastSection = dots[dots.length - 1]; //S:147497   E:147532 D: 4BT: 0
               firstSection = dots[0]; //S:147553   E:147575 D: 4BT: 0
            }
            lastSection = lastSection.trim(); //S:147611   E:147643 D: 3BT: 0
            firstSection = firstSection.trim(); //S:147661   E:147695 D: 3BT: 0
             //S:147811   E:147876 D: 3BT: 7
            if(lastSection.indexOf('(')>- 1) //S:147812   E:147876 D: 3BT: 1
            {
               QuicktestRunner.execPath += 36; //S:147865   E:0 D: 4BT: 0
               return null; //S:147865   E:147876 D: 4BT: 0
            }
            System.out.println("finding: |" + lastSection + "|"); //S:147965   E:148017 D: 3BT: 0
            for(int i = 0;i<cl.size();i ++) //S:148035   E:150239 D: 3BT: 0
            {
               ClassInfoTest ci = cl.getClass(i); //S:148107   E:148136 D: 4BT: 0
               VarListTest vl = ci.vars; //S:148157   E:148177 D: 4BT: 0
               String assertionType = ""; //S:148198   E:148223 D: 4BT: 0
               String fromClassType = ""; //S:148242   E:148267 D: 4BT: 0
               for(int j = 0;j<vl.size();j ++) //S:148288   E:148768 D: 4BT: 0
               {
                  VarInfoTest vi = vl.getVar(j); //S:148364   E:148389 D: 5BT: 0
                   //S:148412   E:148634 D: 5BT: 7
                  if(vi.getName().equals(lastSection)) //S:148413   E:148634 D: 5BT: 1
                  {
                     QuicktestRunner.execPath += 18; //S:148497   E:0 D: 6BT: 0
                     System.out.println("Class " + i + " Var " + j + " matches."); //S:148497   E:148557 D: 6BT: 0
                     assertionType = vi.getType(); //S:148582   E:148610 D: 6BT: 0
                  }
                   //S:148657   E:148747 D: 5BT: 7
                  if(vi.getName().equals(firstSection)) //S:148658   E:148747 D: 5BT: 1
                  {
                     QuicktestRunner.execPath += 9; //S:148719   E:0 D: 6BT: 0
                     fromClassType = vi.getType(); //S:148719   E:148747 D: 6BT: 0
                  }
               }
                //S:148788   E:150221 D: 4BT: 7
               if(!(assertionType.equals(""))) //S:148789   E:150221 D: 4BT: 1
               {
                  AssertionInfoTest ai = new AssertionInfoTest(); //S:148864   E:148902 D: 5BT: 0
                  ai.dataType = new VarInfoTest(assertionType , equ[0], 0); //S:149007   E:149058 D: 5BT: 0
                  System.out.println(ai.dataType.getName()); //S:149142   E:149183 D: 5BT: 0
                  System.out.println(ai.dataType.getType()); //S:149207   E:149248 D: 5BT: 0
                   //S:149464   E:149660 D: 5BT: 7
                  if(dots[0].equals("this")||(firstSection.equals(lastSection))) //S:149465   E:149626 D: 5BT: 1
                  {
                     QuicktestRunner.execPath += 4; //S:149553   E:0 D: 6BT: 0
                     ai.fromClass = ci.className; //S:149553   E:149580 D: 6BT: 0
                  }
                  else //S:149627   E:149660 D: 5BT: 2
                  {
                     ai.fromClass = fromClassType; //S:149632   E:149660 D: 6BT: 0
                  }
                   //S:149683   E:149773 D: 5BT: 7
                  if(! inScope(scope , ai.dataType , ai.fromClass , cl , ci)) //S:149684   E:149773 D: 5BT: 1
                  {
                     QuicktestRunner.execPath += 2; //S:149762   E:0 D: 6BT: 0
                     return null; //S:149762   E:149773 D: 6BT: 0
                  }
                   //S:149950   E:150088 D: 5BT: 7
                  if(mi.returnType.getType().equals("ctor")&& ai.fromClass.equals(mi.returnType.getName())) //S:149951   E:150088 D: 5BT: 1
                  {
                     QuicktestRunner.execPath += 3; //S:150065   E:0 D: 6BT: 0
                     ai.fromClass = "rtnVal"; //S:150065   E:150088 D: 6BT: 0
                  }
                  else //S:150088   E:0 D: 5BT: 0
                  {
                     QuicktestRunner.execPath += 2; //S:150089   E:0 D: 6BT: 0
                  }
                  return ai; //S:150191   E:150200 D: 5BT: 0
               }
               else //S:150221   E:0 D: 4BT: 0
               {
                  QuicktestRunner.execPath += 1; //S:150222   E:0 D: 5BT: 0
               }
            }
         }
      }
   }
   return null; //S:150282   E:150293 D: 0BT: 0
   }

   private boolean inScope(VarListTest scope, VarInfoTest vi, String fromClass, ClassListTest cl, ClassInfoTest ci)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:5 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:5 CP:0
/***************************
Processing list:
 {S:150407 E:151233 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:150407 E:151233 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(fromClass.isEmpty()|| fromClass.equals(ci.className)){ {S:150408 E:150690 D:0 BT: 1}
for(int i = 0;i<scope.size();i ++){} {S:150475 E:150660 D:1 BT: 0}
<sublist>
VarInfoTest vi2 = scope.getVar(i); {S:150524 E:150553 D:2 BT: 0}
</sublist>
return false; {S:150666 E:150678 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(fromClass.isEmpty()|| fromClass.equals(ci.className)){} {S:150408 E:150690 D:0 BT: 1}
for(int i = 0;i<scope.size();i ++){} {S:150475 E:150660 D:1 BT: 0}
<sublist>
VarInfoTest vi2 = scope.getVar(i); {S:150524 E:150553 D:2 BT: 0}
</sublist>
return false; {S:150666 E:150678 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:3 CP:0
/***************************
Processing list:
 {S:150691 E:151233 D:0 BT: 2}
String classChain[]= vi.getName().split("\\."); {S:150702 E:150749 D:0 BT: 0}
for(int i = 0;i<scope.size();i ++){} {S:150755 E:151210 D:0 BT: 0}
<sublist>
VarInfoTest vi2 = scope.getVar(i); {S:150804 E:150833 D:1 BT: 0}
</sublist>
return false; {S:151216 E:151228 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:150691 E:151233 D:0 BT: 2}
String classChain[]= vi.getName().split("\\."); {S:150702 E:150749 D:1 BT: 0}
for(int i = 0;i<scope.size();i ++){} {S:150755 E:151210 D:1 BT: 0}
<sublist>
VarInfoTest vi2 = scope.getVar(i); {S:150804 E:150833 D:2 BT: 0}
</sublist>
return false; {S:151216 E:151228 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(3) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:150559 E:150654 D:2 BT: 7}
****************************/
/***************************
Processing list:
 {S:150559 E:150654 D:2 BT: 7}
****************************/
//=======================================
//=======================================
//#6(4) Type:-1 Paths:3 CP:0
/***************************
Processing list:
 {S:150839 E:151204 D:3 BT: 7}
****************************/
/***************************
Processing list:
 {S:150839 E:151204 D:3 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#7(5) Type:1 Paths:1 CP:3
/***************************
Processing list:
if(vi2.getName().equals(vi.getName())&& vi2.getType().equals(vi.getType())) {S:150560 E:150654 D:2 BT: 1}
return true; {S:150643 E:150654 D:3 BT: 0}
****************************/
/***************************
Processing list:
if(vi2.getName().equals(vi.getName())&& vi2.getType().equals(vi.getType())){} {S:150560 E:150654 D:2 BT: 1}
QuicktestRunner.execPath += 3; {S:150643 E:0 D:3 BT: 0}
return true; {S:150643 E:150654 D:3 BT: 0}
****************************/
//=======================================
//=======================================
//#8(5) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//=======================================
//#9(6) Type:1 Paths:2 CP:0
/***************************
Processing list:
if(vi2.getName().equals(classChain[0])){} {S:150840 E:151204 D:3 BT: 1}
ClassInfoTest currClass; {S:150893 E:150912 D:4 BT: 0}
VarInfoTest currVar = vi2; {S:150920 E:150941 D:4 BT: 0}
for(int j = 1;j<classChain.length;j ++){} {S:150949 E:151178 D:4 BT: 0}
<sublist>
currClass = cl.findClassWithName(currVar.getType()); {S:151007 E:151058 D:5 BT: 0}
currVar = currClass.vars.getVarWithName(classChain[j]); {S:151067 E:151121 D:5 BT: 0}
</sublist>
return true; {S:151186 E:151197 D:4 BT: 0}
****************************/
/***************************
Processing list:
if(vi2.getName().equals(classChain[0])){} {S:150840 E:151204 D:3 BT: 1}
ClassInfoTest currClass; {S:150893 E:150912 D:4 BT: 0}
VarInfoTest currVar = vi2; {S:150920 E:150941 D:4 BT: 0}
for(int j = 1;j<classChain.length;j ++){} {S:150949 E:151178 D:4 BT: 0}
<sublist>
currClass = cl.findClassWithName(currVar.getType()); {S:151007 E:151058 D:5 BT: 0}
currVar = currClass.vars.getVarWithName(classChain[j]); {S:151067 E:151121 D:5 BT: 0}
</sublist>
return true; {S:151186 E:151197 D:4 BT: 0}
****************************/
//=======================================
//=======================================
//#10(6) Type:2 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#11(9) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:151129 E:151170 D:5 BT: 7}
****************************/
/***************************
Processing list:
 {S:151129 E:151170 D:5 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#12(11) Type:1 Paths:1 CP:2
/***************************
Processing list:
if(currVar == null) {S:151130 E:151170 D:5 BT: 1}
return false; {S:151158 E:151170 D:6 BT: 0}
****************************/
/***************************
Processing list:
if(currVar == null){} {S:151130 E:151170 D:5 BT: 1}
QuicktestRunner.execPath += 2; {S:151158 E:0 D:6 BT: 0}
return false; {S:151158 E:151170 D:6 BT: 0}
****************************/
//=======================================
//=======================================
//#13(11) Type:2 Paths:1 CP:1

/***************************
Processing list:
else {S:151170 E:0 D:5 BT: 0}
QuicktestRunner.execPath += 1; {S:151171 E:0 D:6 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:150407 E:151233 D:0 BT: 7}
if(fromClass.isEmpty()|| fromClass.equals(ci.className)){} {S:150408 E:150690 D:0 BT: 1}
for(int i = 0;i<scope.size();i ++){} {S:150475 E:150660 D:1 BT: 0}
<sublist>
VarInfoTest vi2 = scope.getVar(i); {S:150524 E:150553 D:2 BT: 0}
</sublist>
VarInfoTest vi2 = scope.getVar(i); {S:150524 E:150553 D:2 BT: 0}
 {S:150559 E:150654 D:2 BT: 7}
if(vi2.getName().equals(vi.getName())&& vi2.getType().equals(vi.getType())){} {S:150560 E:150654 D:2 BT: 1}
QuicktestRunner.execPath += 3; {S:150643 E:0 D:3 BT: 0}
return true; {S:150643 E:150654 D:3 BT: 0}
return false; {S:150666 E:150678 D:1 BT: 0}
else{} {S:150691 E:151233 D:0 BT: 2}
String classChain[]= vi.getName().split("\\."); {S:150702 E:150749 D:1 BT: 0}
for(int i = 0;i<scope.size();i ++){} {S:150755 E:151210 D:1 BT: 0}
<sublist>
VarInfoTest vi2 = scope.getVar(i); {S:150804 E:150833 D:2 BT: 0}
</sublist>
VarInfoTest vi2 = scope.getVar(i); {S:150804 E:150833 D:2 BT: 0}
 {S:150839 E:151204 D:2 BT: 7}
if(vi2.getName().equals(classChain[0])){} {S:150840 E:151204 D:2 BT: 1}
ClassInfoTest currClass; {S:150893 E:150912 D:3 BT: 0}
VarInfoTest currVar = vi2; {S:150920 E:150941 D:3 BT: 0}
for(int j = 1;j<classChain.length;j ++){} {S:150949 E:151178 D:3 BT: 0}
<sublist>
currClass = cl.findClassWithName(currVar.getType()); {S:151007 E:151058 D:4 BT: 0}
currVar = currClass.vars.getVarWithName(classChain[j]); {S:151067 E:151121 D:4 BT: 0}
</sublist>
currClass = cl.findClassWithName(currVar.getType()); {S:151007 E:151058 D:4 BT: 0}
currVar = currClass.vars.getVarWithName(classChain[j]); {S:151067 E:151121 D:4 BT: 0}
 {S:151129 E:151170 D:4 BT: 7}
if(currVar == null){} {S:151130 E:151170 D:4 BT: 1}
QuicktestRunner.execPath += 2; {S:151158 E:0 D:5 BT: 0}
return false; {S:151158 E:151170 D:5 BT: 0}
else {S:151170 E:0 D:4 BT: 0}
QuicktestRunner.execPath += 1; {S:151171 E:0 D:5 BT: 0}
return true; {S:151186 E:151197 D:3 BT: 0}
return false; {S:151216 E:151228 D:1 BT: 0}
****************************/
    //S:150407   E:151233 D: 0BT: 7
   if(fromClass.isEmpty()|| fromClass.equals(ci.className)) //S:150408   E:150690 D: 0BT: 1
   {
      for(int i = 0;i<scope.size();i ++) //S:150475   E:150660 D: 1BT: 0
      {
         VarInfoTest vi2 = scope.getVar(i); //S:150524   E:150553 D: 2BT: 0
          //S:150559   E:150654 D: 2BT: 7
         if(vi2.getName().equals(vi.getName())&& vi2.getType().equals(vi.getType())) //S:150560   E:150654 D: 2BT: 1
         {
            QuicktestRunner.execPath += 3; //S:150643   E:0 D: 3BT: 0
            return true; //S:150643   E:150654 D: 3BT: 0
         }
      }
      return false; //S:150666   E:150678 D: 1BT: 0
   }
   else //S:150691   E:151233 D: 0BT: 2
   {
      String classChain[]= vi.getName().split("\\."); //S:150702   E:150749 D: 1BT: 0
      for(int i = 0;i<scope.size();i ++) //S:150755   E:151210 D: 1BT: 0
      {
         VarInfoTest vi2 = scope.getVar(i); //S:150804   E:150833 D: 2BT: 0
          //S:150839   E:151204 D: 2BT: 7
         if(vi2.getName().equals(classChain[0])) //S:150840   E:151204 D: 2BT: 1
         {
            ClassInfoTest currClass; //S:150893   E:150912 D: 3BT: 0
            VarInfoTest currVar = vi2; //S:150920   E:150941 D: 3BT: 0
            for(int j = 1;j<classChain.length;j ++) //S:150949   E:151178 D: 3BT: 0
            {
               currClass = cl.findClassWithName(currVar.getType()); //S:151007   E:151058 D: 4BT: 0
               currVar = currClass.vars.getVarWithName(classChain[j]); //S:151067   E:151121 D: 4BT: 0
                //S:151129   E:151170 D: 4BT: 7
               if(currVar == null) //S:151130   E:151170 D: 4BT: 1
               {
                  QuicktestRunner.execPath += 2; //S:151158   E:0 D: 5BT: 0
                  return false; //S:151158   E:151170 D: 5BT: 0
               }
               else //S:151170   E:0 D: 4BT: 0
               {
                  QuicktestRunner.execPath += 1; //S:151171   E:0 D: 5BT: 0
               }
            }
            return true; //S:151186   E:151197 D: 3BT: 0
         }
      }
      return false; //S:151216   E:151228 D: 1BT: 0
   }
   }

   public boolean isReturn()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:8 CP:0
/***************************
Processing list:
String s =(String)textTokens.get(0); {S:151369 E:151406 D:0 BT: 0}
****************************/
/***************************
Processing list:
String s =(String)textTokens.get(0); {S:151369 E:151406 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:151276 E:151316 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:151276 E:151316 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:151320 E:151364 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:151320 E:151364 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:151410 E:151475 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:151410 E:151475 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(textTokens == null) {S:151277 E:151316 D:0 BT: 1}
return false; {S:151304 E:151316 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(textTokens == null){} {S:151277 E:151316 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:151304 E:0 D:1 BT: 0}
return false; {S:151304 E:151316 D:1 BT: 0}
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
if(textTokens.size()== 0) {S:151321 E:151364 D:0 BT: 1}
return false; {S:151352 E:151364 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(textTokens.size()== 0){} {S:151321 E:151364 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:151352 E:0 D:1 BT: 0}
return false; {S:151352 E:151364 D:1 BT: 0}
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
if(s.equals("return"))else return false; {S:151411 E:151457 D:0 BT: 1}
return true; {S:151438 E:151449 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(s.equals("return")){} {S:151411 E:151457 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:151438 E:0 D:1 BT: 0}
return true; {S:151438 E:151449 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:151458 E:151475 D:0 BT: 2}
return false; {S:151463 E:151475 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:151458 E:151475 D:0 BT: 2}
return false; {S:151463 E:151475 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:151276 E:151316 D:0 BT: 7}
if(textTokens == null){} {S:151277 E:151316 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:151304 E:0 D:1 BT: 0}
return false; {S:151304 E:151316 D:1 BT: 0}
 {S:151320 E:151364 D:0 BT: 7}
if(textTokens.size()== 0){} {S:151321 E:151364 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:151352 E:0 D:1 BT: 0}
return false; {S:151352 E:151364 D:1 BT: 0}
String s =(String)textTokens.get(0); {S:151369 E:151406 D:0 BT: 0}
 {S:151410 E:151475 D:0 BT: 7}
if(s.equals("return")){} {S:151411 E:151457 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:151438 E:0 D:1 BT: 0}
return true; {S:151438 E:151449 D:1 BT: 0}
else{} {S:151458 E:151475 D:0 BT: 2}
return false; {S:151463 E:151475 D:1 BT: 0}
****************************/
    //S:151276   E:151316 D: 0BT: 7
   if(textTokens == null) //S:151277   E:151316 D: 0BT: 1
   {
      QuicktestRunner.execPath += 4; //S:151304   E:0 D: 1BT: 0
      return false; //S:151304   E:151316 D: 1BT: 0
   }
    //S:151320   E:151364 D: 0BT: 7
   if(textTokens.size()== 0) //S:151321   E:151364 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:151352   E:0 D: 1BT: 0
      return false; //S:151352   E:151364 D: 1BT: 0
   }
   String s =(String)textTokens.get(0); //S:151369   E:151406 D: 0BT: 0
    //S:151410   E:151475 D: 0BT: 7
   if(s.equals("return")) //S:151411   E:151457 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:151438   E:0 D: 1BT: 0
      return true; //S:151438   E:151449 D: 1BT: 0
   }
   else //S:151458   E:151475 D: 0BT: 2
   {
      return false; //S:151463   E:151475 D: 1BT: 0
   }
   }

   public boolean isDo()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:8 CP:0
/***************************
Processing list:
String s =(String)textTokens.get(0); {S:151607 E:151644 D:0 BT: 0}
****************************/
/***************************
Processing list:
String s =(String)textTokens.get(0); {S:151607 E:151644 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:151514 E:151554 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:151514 E:151554 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:151558 E:151602 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:151558 E:151602 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:151648 E:151709 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:151648 E:151709 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(textTokens == null) {S:151515 E:151554 D:0 BT: 1}
return false; {S:151542 E:151554 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(textTokens == null){} {S:151515 E:151554 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:151542 E:0 D:1 BT: 0}
return false; {S:151542 E:151554 D:1 BT: 0}
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
if(textTokens.size()== 0) {S:151559 E:151602 D:0 BT: 1}
return false; {S:151590 E:151602 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(textTokens.size()== 0){} {S:151559 E:151602 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:151590 E:0 D:1 BT: 0}
return false; {S:151590 E:151602 D:1 BT: 0}
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
if(s.equals("do"))else return false; {S:151649 E:151691 D:0 BT: 1}
return true; {S:151672 E:151683 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(s.equals("do")){} {S:151649 E:151691 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:151672 E:0 D:1 BT: 0}
return true; {S:151672 E:151683 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:151692 E:151709 D:0 BT: 2}
return false; {S:151697 E:151709 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:151692 E:151709 D:0 BT: 2}
return false; {S:151697 E:151709 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:151514 E:151554 D:0 BT: 7}
if(textTokens == null){} {S:151515 E:151554 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:151542 E:0 D:1 BT: 0}
return false; {S:151542 E:151554 D:1 BT: 0}
 {S:151558 E:151602 D:0 BT: 7}
if(textTokens.size()== 0){} {S:151559 E:151602 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:151590 E:0 D:1 BT: 0}
return false; {S:151590 E:151602 D:1 BT: 0}
String s =(String)textTokens.get(0); {S:151607 E:151644 D:0 BT: 0}
 {S:151648 E:151709 D:0 BT: 7}
if(s.equals("do")){} {S:151649 E:151691 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:151672 E:0 D:1 BT: 0}
return true; {S:151672 E:151683 D:1 BT: 0}
else{} {S:151692 E:151709 D:0 BT: 2}
return false; {S:151697 E:151709 D:1 BT: 0}
****************************/
    //S:151514   E:151554 D: 0BT: 7
   if(textTokens == null) //S:151515   E:151554 D: 0BT: 1
   {
      QuicktestRunner.execPath += 4; //S:151542   E:0 D: 1BT: 0
      return false; //S:151542   E:151554 D: 1BT: 0
   }
    //S:151558   E:151602 D: 0BT: 7
   if(textTokens.size()== 0) //S:151559   E:151602 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:151590   E:0 D: 1BT: 0
      return false; //S:151590   E:151602 D: 1BT: 0
   }
   String s =(String)textTokens.get(0); //S:151607   E:151644 D: 0BT: 0
    //S:151648   E:151709 D: 0BT: 7
   if(s.equals("do")) //S:151649   E:151691 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:151672   E:0 D: 1BT: 0
      return true; //S:151672   E:151683 D: 1BT: 0
   }
   else //S:151692   E:151709 D: 0BT: 2
   {
      return false; //S:151697   E:151709 D: 1BT: 0
   }
   }

   public boolean isBreak()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:8 CP:0
/***************************
Processing list:
String s =(String)textTokens.get(0); {S:151844 E:151881 D:0 BT: 0}
****************************/
/***************************
Processing list:
String s =(String)textTokens.get(0); {S:151844 E:151881 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:151751 E:151791 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:151751 E:151791 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:151795 E:151839 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:151795 E:151839 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:151885 E:151949 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:151885 E:151949 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(textTokens == null) {S:151752 E:151791 D:0 BT: 1}
return false; {S:151779 E:151791 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(textTokens == null){} {S:151752 E:151791 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:151779 E:0 D:1 BT: 0}
return false; {S:151779 E:151791 D:1 BT: 0}
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
if(textTokens.size()== 0) {S:151796 E:151839 D:0 BT: 1}
return false; {S:151827 E:151839 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(textTokens.size()== 0){} {S:151796 E:151839 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:151827 E:0 D:1 BT: 0}
return false; {S:151827 E:151839 D:1 BT: 0}
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
if(s.equals("break"))else return false; {S:151886 E:151931 D:0 BT: 1}
return true; {S:151912 E:151923 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(s.equals("break")){} {S:151886 E:151931 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:151912 E:0 D:1 BT: 0}
return true; {S:151912 E:151923 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:151932 E:151949 D:0 BT: 2}
return false; {S:151937 E:151949 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:151932 E:151949 D:0 BT: 2}
return false; {S:151937 E:151949 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:151751 E:151791 D:0 BT: 7}
if(textTokens == null){} {S:151752 E:151791 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:151779 E:0 D:1 BT: 0}
return false; {S:151779 E:151791 D:1 BT: 0}
 {S:151795 E:151839 D:0 BT: 7}
if(textTokens.size()== 0){} {S:151796 E:151839 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:151827 E:0 D:1 BT: 0}
return false; {S:151827 E:151839 D:1 BT: 0}
String s =(String)textTokens.get(0); {S:151844 E:151881 D:0 BT: 0}
 {S:151885 E:151949 D:0 BT: 7}
if(s.equals("break")){} {S:151886 E:151931 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:151912 E:0 D:1 BT: 0}
return true; {S:151912 E:151923 D:1 BT: 0}
else{} {S:151932 E:151949 D:0 BT: 2}
return false; {S:151937 E:151949 D:1 BT: 0}
****************************/
    //S:151751   E:151791 D: 0BT: 7
   if(textTokens == null) //S:151752   E:151791 D: 0BT: 1
   {
      QuicktestRunner.execPath += 4; //S:151779   E:0 D: 1BT: 0
      return false; //S:151779   E:151791 D: 1BT: 0
   }
    //S:151795   E:151839 D: 0BT: 7
   if(textTokens.size()== 0) //S:151796   E:151839 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:151827   E:0 D: 1BT: 0
      return false; //S:151827   E:151839 D: 1BT: 0
   }
   String s =(String)textTokens.get(0); //S:151844   E:151881 D: 0BT: 0
    //S:151885   E:151949 D: 0BT: 7
   if(s.equals("break")) //S:151886   E:151931 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:151912   E:0 D: 1BT: 0
      return true; //S:151912   E:151923 D: 1BT: 0
   }
   else //S:151932   E:151949 D: 0BT: 2
   {
      return false; //S:151937   E:151949 D: 1BT: 0
   }
   }

   public boolean isCase()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:8 CP:0
/***************************
Processing list:
String s =(String)textTokens.get(0); {S:152083 E:152120 D:0 BT: 0}
String s2 =(String)textTokens.getLast(); {S:152125 E:152166 D:0 BT: 0}
****************************/
/***************************
Processing list:
String s =(String)textTokens.get(0); {S:152083 E:152120 D:0 BT: 0}
String s2 =(String)textTokens.getLast(); {S:152125 E:152166 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#2(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:151990 E:152030 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:151990 E:152030 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#3(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:152034 E:152078 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:152034 E:152078 D:0 BT: 7}
****************************/
//=======================================
//=======================================
//#4(1) Type:-1 Paths:2 CP:0
/***************************
Processing list:
 {S:152170 E:152276 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:152170 E:152276 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#5(2) Type:1 Paths:1 CP:4
/***************************
Processing list:
if(textTokens == null) {S:151991 E:152030 D:0 BT: 1}
return false; {S:152018 E:152030 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(textTokens == null){} {S:151991 E:152030 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:152018 E:0 D:1 BT: 0}
return false; {S:152018 E:152030 D:1 BT: 0}
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
if(textTokens.size()== 0) {S:152035 E:152078 D:0 BT: 1}
return false; {S:152066 E:152078 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(textTokens.size()== 0){} {S:152035 E:152078 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:152066 E:0 D:1 BT: 0}
return false; {S:152066 E:152078 D:1 BT: 0}
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
if((s.equals("case")|| s.equals("default"))&& s2.equals(":"))else return false; {S:152171 E:152258 D:0 BT: 1}
return true; {S:152239 E:152250 D:1 BT: 0}
****************************/
/***************************
Processing list:
if((s.equals("case")|| s.equals("default"))&& s2.equals(":")){} {S:152171 E:152258 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:152239 E:0 D:1 BT: 0}
return true; {S:152239 E:152250 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#10(4) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:152259 E:152276 D:0 BT: 2}
return false; {S:152264 E:152276 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:152259 E:152276 D:0 BT: 2}
return false; {S:152264 E:152276 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:151990 E:152030 D:0 BT: 7}
if(textTokens == null){} {S:151991 E:152030 D:0 BT: 1}
QuicktestRunner.execPath += 4; {S:152018 E:0 D:1 BT: 0}
return false; {S:152018 E:152030 D:1 BT: 0}
 {S:152034 E:152078 D:0 BT: 7}
if(textTokens.size()== 0){} {S:152035 E:152078 D:0 BT: 1}
QuicktestRunner.execPath += 2; {S:152066 E:0 D:1 BT: 0}
return false; {S:152066 E:152078 D:1 BT: 0}
String s =(String)textTokens.get(0); {S:152083 E:152120 D:0 BT: 0}
String s2 =(String)textTokens.getLast(); {S:152125 E:152166 D:0 BT: 0}
 {S:152170 E:152276 D:0 BT: 7}
if((s.equals("case")|| s.equals("default"))&& s2.equals(":")){} {S:152171 E:152258 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:152239 E:0 D:1 BT: 0}
return true; {S:152239 E:152250 D:1 BT: 0}
else{} {S:152259 E:152276 D:0 BT: 2}
return false; {S:152264 E:152276 D:1 BT: 0}
****************************/
    //S:151990   E:152030 D: 0BT: 7
   if(textTokens == null) //S:151991   E:152030 D: 0BT: 1
   {
      QuicktestRunner.execPath += 4; //S:152018   E:0 D: 1BT: 0
      return false; //S:152018   E:152030 D: 1BT: 0
   }
    //S:152034   E:152078 D: 0BT: 7
   if(textTokens.size()== 0) //S:152035   E:152078 D: 0BT: 1
   {
      QuicktestRunner.execPath += 2; //S:152066   E:0 D: 1BT: 0
      return false; //S:152066   E:152078 D: 1BT: 0
   }
   String s =(String)textTokens.get(0); //S:152083   E:152120 D: 0BT: 0
   String s2 =(String)textTokens.getLast(); //S:152125   E:152166 D: 0BT: 0
    //S:152170   E:152276 D: 0BT: 7
   if((s.equals("case")|| s.equals("default"))&& s2.equals(":")) //S:152171   E:152258 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:152239   E:0 D: 1BT: 0
      return true; //S:152239   E:152250 D: 1BT: 0
   }
   else //S:152259   E:152276 D: 0BT: 2
   {
      return false; //S:152264   E:152276 D: 1BT: 0
   }
   }

   public LineInfoTest(LineInfoTest in)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
this.branchType = in.branchType; {S:152323 E:152354 D:0 BT: 0}
this.condition = in.condition; {S:152359 E:152388 D:0 BT: 0}
this.endChar = in.endChar; {S:152393 E:152418 D:0 BT: 0}
this.isStatic = in.isStatic; {S:152423 E:152450 D:0 BT: 0}
this.lineText = in.lineText; {S:152455 E:152482 D:0 BT: 0}
this.startChar = in.startChar; {S:152487 E:152516 D:0 BT: 0}
this.subLines = new LineListTest(); {S:152521 E:152551 D:0 BT: 0}
this.tabDepth = in.tabDepth; {S:152556 E:152583 D:0 BT: 0}
this.textTokens = in.textTokens; {S:152662 E:152693 D:0 BT: 0}
****************************/
/***************************
Processing list:
this.branchType = in.branchType; {S:152323 E:152354 D:0 BT: 0}
this.condition = in.condition; {S:152359 E:152388 D:0 BT: 0}
this.endChar = in.endChar; {S:152393 E:152418 D:0 BT: 0}
this.isStatic = in.isStatic; {S:152423 E:152450 D:0 BT: 0}
this.lineText = in.lineText; {S:152455 E:152482 D:0 BT: 0}
this.startChar = in.startChar; {S:152487 E:152516 D:0 BT: 0}
this.subLines = new LineListTest(); {S:152521 E:152551 D:0 BT: 0}
this.tabDepth = in.tabDepth; {S:152556 E:152583 D:0 BT: 0}
this.textTokens = in.textTokens; {S:152662 E:152693 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
this.branchType = in.branchType; {S:152323 E:152354 D:0 BT: 0}
this.condition = in.condition; {S:152359 E:152388 D:0 BT: 0}
this.endChar = in.endChar; {S:152393 E:152418 D:0 BT: 0}
this.isStatic = in.isStatic; {S:152423 E:152450 D:0 BT: 0}
this.lineText = in.lineText; {S:152455 E:152482 D:0 BT: 0}
this.startChar = in.startChar; {S:152487 E:152516 D:0 BT: 0}
this.subLines = new LineListTest(); {S:152521 E:152551 D:0 BT: 0}
this.tabDepth = in.tabDepth; {S:152556 E:152583 D:0 BT: 0}
this.textTokens = in.textTokens; {S:152662 E:152693 D:0 BT: 0}
****************************/
   this.branchType = in.branchType; //S:152323   E:152354 D: 0BT: 0
   this.condition = in.condition; //S:152359   E:152388 D: 0BT: 0
   this.endChar = in.endChar; //S:152393   E:152418 D: 0BT: 0
   this.isStatic = in.isStatic; //S:152423   E:152450 D: 0BT: 0
   this.lineText = in.lineText; //S:152455   E:152482 D: 0BT: 0
   this.startChar = in.startChar; //S:152487   E:152516 D: 0BT: 0
   this.subLines = new LineListTest(); //S:152521   E:152551 D: 0BT: 0
   this.tabDepth = in.tabDepth; //S:152556   E:152583 D: 0BT: 0
   this.textTokens = in.textTokens; //S:152662   E:152693 D: 0BT: 0
   }

   public String getPostgroup()
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
 {S:152739 E:152822 D:0 BT: 7}
****************************/
/***************************
Processing list:
 {S:152739 E:152822 D:0 BT: 7}
****************************/
//=======================================
//############ End of level ####################
//=======================================
//#3(2) Type:1 Paths:1 CP:1
/***************************
Processing list:
if(isDo()){ {S:152740 E:152807 D:0 BT: 1}
return "while(" + condition + ");"; {S:152760 E:152794 D:1 BT: 0}
****************************/
/***************************
Processing list:
if(isDo()){} {S:152740 E:152807 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:152760 E:0 D:1 BT: 0}
return "while(" + condition + ");"; {S:152760 E:152794 D:1 BT: 0}
****************************/
//=======================================
//=======================================
//#4(2) Type:2 Paths:1 CP:0
/***************************
Processing list:
 {S:152808 E:152822 D:0 BT: 2}
return ""; {S:152813 E:152822 D:0 BT: 0}
****************************/
/***************************
Processing list:
else{} {S:152808 E:152822 D:0 BT: 2}
return ""; {S:152813 E:152822 D:1 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
 {S:152739 E:152822 D:0 BT: 7}
if(isDo()){} {S:152740 E:152807 D:0 BT: 1}
QuicktestRunner.execPath += 1; {S:152760 E:0 D:1 BT: 0}
return "while(" + condition + ");"; {S:152760 E:152794 D:1 BT: 0}
else{} {S:152808 E:152822 D:0 BT: 2}
return ""; {S:152813 E:152822 D:1 BT: 0}
****************************/
    //S:152739   E:152822 D: 0BT: 7
   if(isDo()) //S:152740   E:152807 D: 0BT: 1
   {
      QuicktestRunner.execPath += 1; //S:152760   E:0 D: 1BT: 0
      return "while(" + condition + ");"; //S:152760   E:152794 D: 1BT: 0
   }
   else //S:152808   E:152822 D: 0BT: 2
   {
      return ""; //S:152813   E:152822 D: 1BT: 0
   }
   }

   public LineInfoTest(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

