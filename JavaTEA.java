import java.lang.reflect.*;


public class JavaTEA 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try
		{
			String cls1 = args[1];
			String testName = args[2];
			Class cls = Class.forName(cls1);
	   	Constructor con = cls.getDeclaredConstructor(null);
	   	Object obj = con.newInstance();
	   	Method man = cls.getMethod(testName, null);
	   	man.invoke(obj, null);
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}

}
