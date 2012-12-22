import javax.swing.Timer;
import java.awt.event.*;
import java.lang.reflect.*;

class TestRunThread extends Thread
{
   //Object obj;
   //Method man;
   //Exception expected;
	String cmd;
   String cName;
   String tName;
   String result;

   TestRunThread(String c, String cls1, String testName, String res)
   {
   	//create the test class
   	cName = cls1;
   	tName = testName;
   	cmd = c;
   	/*Class cls = Class.forName(cls1);
   	Constructor con = cls.getDeclaredConstructor(null);
   	obj = con.newInstance();
   	man = cls.getMethod(testName, null);*/
   	result = res;
   }

   public void run()
   {
   	//boolean result = false;
      //call the test method
   	String err;
   	System.out.println("Running JavaTEA with params:" + cName + "," + tName);
   	err = WhiteboxUtils.runCmd(cmd + " " + cName + " " + tName)[1];
   	
   	
      //record the results
   	if(err.isEmpty())
   		result += ":true";
   	else
   		result += ":false\n" + err;
   }


}

abstract class TestRunner
{
	Timer timeoutTimer;
   String runreport;
   TestRunThread trt;
   TestInfo[] tests;
   String TEAcmd;
	
	public void runAll(String runConfig){}
}

public class JavaTestRunner extends TestRunner implements ActionListener
{
   

   public void actionPerformed(ActionEvent e)
   {
      //record that the test timed out
   	trt.result += ":false\n";
   	trt.result += "   Test timed out after " + timeoutTimer.getDelay() + " ms.";
   	trt = null;
   }
   
   JavaTestRunner()
   {
   	timeoutTimer = null;
   }

   JavaTestRunner(int arg)
   {
      timeoutTimer = new Timer(arg, this);
   }
   
   JavaTestRunner(int arg, TestInfo[] tis, String tea)
   {
   	this(arg);
   	tests = tis;
   	TEAcmd = tea;
   }

   public void runTest(String className, String testName, String result, int index)
   {
   	try
   	{
	      trt = new TestRunThread(TEAcmd, className, testName, result);
	      if(timeoutTimer != null)
	      	timeoutTimer.start();
	      trt.run();
	      if(timeoutTimer != null)
	      	timeoutTimer.stop();
	      trt = null;
	      if(tests != null)
	      	tests[index].testState = 2;
	      
   	}
   	catch(Exception ex)
   	{
   		result += ":false\n";
   		result += ex.getMessage();
   		if(tests != null)
   			tests[index].testState = 1;
   	}
   }
   
   public void runAll(String runConfig, int timeout)
   {
   	timeoutTimer.setDelay(timeout);
   	runAll(runConfig);
   }
   
   public void runAll(String runConfig)
   {
   	String[] list = WhiteboxUtils.loadFile(runConfig);
   	
   	for(int i = 0; i < list.length; i++)
   	{
   		String[] sub = list[i].split(":");
   		runTest(sub[0], sub[1], list[i], i);
   	}
   	String outFile = new String();
   	for(int i = 0; i < list.length; i++)
   	{
   		outFile += list[i] + "\n";
   	}
   	WhiteboxUtils.writeFile(runConfig, outFile);
   }
   
   public static void main(String args[])
   {
   	JavaTestRunner jrt = null;
   	if(args.length == 2)
   		jrt = new JavaTestRunner(Integer.parseInt(args[1]));
   	else
   		jrt = new JavaTestRunner();
   	jrt.runAll(args[0]);
   }
   
}