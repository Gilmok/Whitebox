import java.util.*;
import java.io.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.*;

class BasicTerminalTest extends CodeMemberTest
{

   BasicTerminalTest(ParseTree in)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0
/***************************
Processing list:
CommonToken tok =(CommonToken)in.payload; {S:162820 E:162862 D:0 BT: 0}
startChar = tok.getStartIndex(); {S:162867 E:162898 D:0 BT: 0}
endChar = tok.getStopIndex(); {S:162903 E:162931 D:0 BT: 0}
****************************/
/***************************
Processing list:
CommonToken tok =(CommonToken)in.payload; {S:162820 E:162862 D:0 BT: 0}
startChar = tok.getStartIndex(); {S:162867 E:162898 D:0 BT: 0}
endChar = tok.getStopIndex(); {S:162903 E:162931 D:0 BT: 0}
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
CommonToken tok =(CommonToken)in.payload; {S:162820 E:162862 D:0 BT: 0}
startChar = tok.getStartIndex(); {S:162867 E:162898 D:0 BT: 0}
endChar = tok.getStopIndex(); {S:162903 E:162931 D:0 BT: 0}
****************************/
   CommonToken tok =(CommonToken)in.payload; //S:162820   E:162862 D: 0BT: 0
   startChar = tok.getStartIndex(); //S:162867   E:162898 D: 0BT: 0
   endChar = tok.getStopIndex(); //S:162903   E:162931 D: 0BT: 0
   }

   public void addToTree(ClassListTest list, TreeStatusTest info, LinkedList nodeList)
   {
//The Function Tree:
//=======================================
//#1 Type:0 Paths:1 CP:0

/***************************
Processing list:
****************************/
//=======================================
//############ End of level ####################
//(((((((((( End of Tree )))))))))))))
/***************************
Processing list:
****************************/
   }

   public BasicTerminalTest(){}

   public void mockSetup()
   {


   }

   public void quickTest(){}

}

