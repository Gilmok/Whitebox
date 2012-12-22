public class MethodInfoQuickTest extends MethodInfoTest
{
   MethodInfoQuickTest(){}

   public int quickTest(int a, int b)
   {
   int quicktestExecPath = 0;
   int rtnVal;
   if(a == 0)
   {
      quicktestExecPath += 6;
      a = 1;
   }
   else
   {
      a ++;
   }
   if(a < b)
   {
      quicktestExecPath += 5;
      WhiteboxUtils.writeFile(String.valueOf(quicktestExecPath), "qtOut.wbq");
      return b;
   }
   else if(b == 0)
   {
      quicktestExecPath += 4;
      WhiteboxUtils.writeFile(String.valueOf(quicktestExecPath), "qtOut.wbq");
      return 0;
   }
   else
   {
      int m = a % b;
      switch(m)
      {
         case 0:
         {
            quicktestExecPath += 3;
            rtnVal = a;
            break;
         }
         case 1:
         {
            quicktestExecPath += 2;
            rtnVal = a + 1;
            break;
         }
         case 2:
         {
            quicktestExecPath += 1;
            rtnVal = a + 4;
            break;
         }
         default:
         {
            rtnVal = a * b;
         }
      }
   }
   WhiteboxUtils.writeFile(String.valueOf(quicktestExecPath), "qtOut.wbq");
   return rtnVal;
   }

   public static void main(String args[])
   {
      QuicktestRunner qtr = new QuicktestRunner();
      MethodInfoQuickTest qt = new MethodInfoQuickTest();
      int out = qt.quickTest(5, 7);
      String data = "ExecPath = " + WhiteboxUtils.loadFile("qtOut.wbq")[0] + "\n";
      data += qtr.inspectObject(qt) + "----------\n";
      data += String.valueOf(out);
      WhiteboxUtils.writeFile("qtOut.wbq", data);
   }

}
