import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class PreambleTestList extends LinkedList
{

   public PreambleTest getPreambleTest(int index)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
return(PreambleTest)super.get(index); {S:160029 E:160063 D:0 BT: 0}
****************************/
/***************************
Processing list:
return(PreambleTest)super.get(index); {S:160029 E:160063 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
return(PreambleTest)super.get(index); {S:160029 E:160063 D:0 BT: 0}
****************************/
   return(PreambleTest)super.get(index); //S:160029   E:160063 D: 0BT: 0
   }

   public String listAll(String pre)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:160115 E:160133 D:0 BT: 0}
for(int i = 0;i<this.size();i ++){} {S:160138 E:160294 D:0 BT: 0}
<sublist>
rtnVal += pre + getPreambleTest(i).val + " " + getPreambleTest(i).startChar + " " + getPreambleTest(i).endChar + "\n"; {S:160184 E:160289 D:1 BT: 0}
</sublist>
return rtnVal; {S:160299 E:160312 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:160115 E:160133 D:0 BT: 0}
for(int i = 0;i<this.size();i ++){} {S:160138 E:160294 D:0 BT: 0}
<sublist>
rtnVal += pre + getPreambleTest(i).val + " " + getPreambleTest(i).startChar + " " + getPreambleTest(i).endChar + "\n"; {S:160184 E:160289 D:1 BT: 0}
</sublist>
return rtnVal; {S:160299 E:160312 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:160115 E:160133 D:0 BT: 0}
for(int i = 0;i<this.size();i ++){} {S:160138 E:160294 D:0 BT: 0}
<sublist>
rtnVal += pre + getPreambleTest(i).val + " " + getPreambleTest(i).startChar + " " + getPreambleTest(i).endChar + "\n"; {S:160184 E:160289 D:1 BT: 0}
</sublist>
rtnVal += pre + getPreambleTest(i).val + " " + getPreambleTest(i).startChar + " " + getPreambleTest(i).endChar + "\n"; {S:160184 E:160289 D:1 BT: 0}
return rtnVal; {S:160299 E:160312 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:160115   E:160133 D: 0BT: 0
   for(int i = 0;i<this.size();i ++) //S:160138   E:160294 D: 0BT: 0
   {
      rtnVal += pre + getPreambleTest(i).val + " " + getPreambleTest(i).startChar + " " + getPreambleTest(i).endChar + "\n"; //S:160184   E:160289 D: 1BT: 0
   }
   return rtnVal; //S:160299   E:160312 D: 0BT: 0
   }

   public void output()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
System.out.println(" Imports:"); {S:160351 E:160382 D:0 BT: 0}
System.out.print(listAll("  ")); {S:160387 E:160418 D:0 BT: 0}
****************************/
/***************************
Processing list:
System.out.println(" Imports:"); {S:160351 E:160382 D:0 BT: 0}
System.out.print(listAll("  ")); {S:160387 E:160418 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
System.out.println(" Imports:"); {S:160351 E:160382 D:0 BT: 0}
System.out.print(listAll("  ")); {S:160387 E:160418 D:0 BT: 0}
****************************/
   System.out.println(" Imports:"); //S:160351   E:160382 D: 0BT: 0
   System.out.print(listAll("  ")); //S:160387   E:160418 D: 0BT: 0
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

   public String dumpList()
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
String rtnVal = ""; {S:160461 E:160479 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:160484 E:160565 D:0 BT: 0}
<sublist>
rtnVal += getPreambleTest(i).val + "\n"; {S:160525 E:160560 D:1 BT: 0}
</sublist>
return rtnVal + "\n"; {S:160570 E:160591 D:0 BT: 0}
****************************/
/***************************
Processing list:
String rtnVal = ""; {S:160461 E:160479 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:160484 E:160565 D:0 BT: 0}
<sublist>
rtnVal += getPreambleTest(i).val + "\n"; {S:160525 E:160560 D:1 BT: 0}
</sublist>
return rtnVal + "\n"; {S:160570 E:160591 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
String rtnVal = ""; {S:160461 E:160479 D:0 BT: 0}
for(int i = 0;i<size();i ++){} {S:160484 E:160565 D:0 BT: 0}
<sublist>
rtnVal += getPreambleTest(i).val + "\n"; {S:160525 E:160560 D:1 BT: 0}
</sublist>
rtnVal += getPreambleTest(i).val + "\n"; {S:160525 E:160560 D:1 BT: 0}
return rtnVal + "\n"; {S:160570 E:160591 D:0 BT: 0}
****************************/
   String rtnVal = ""; //S:160461   E:160479 D: 0BT: 0
   for(int i = 0;i<size();i ++) //S:160484   E:160565 D: 0BT: 0
   {
      rtnVal += getPreambleTest(i).val + "\n"; //S:160525   E:160560 D: 1BT: 0
   }
   return rtnVal + "\n"; //S:160570   E:160591 D: 0BT: 0
   }

   public PreambleTestList(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

