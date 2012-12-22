
public class QuicktestTesting
{
   public static void main(String args[])
   {
      QuicktestRunner qtr = new QuicktestRunner();
      QuicktestRunner.execPath = 0;
      MethodInfoTest c0 = new MethodInfoTest();
      int out = c0.quicktestTesting(5, 7);
      String data = "Exec Path:" + QuicktestRunner.execPath + "\n----------\n";
      data += qtr.inspectObject(c0) + "\n----------\n";
      data += String.valueOf(out);
      WhiteboxUtils.writeFile("qtOut.wbq", data);
      QuicktestRunner.execPath = 0;
   }

}
