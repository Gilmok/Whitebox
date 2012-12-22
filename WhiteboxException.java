
class WhiteboxException extends Exception
{
	WhiteboxException(String msg)
	{
		super(msg);
	}
}

class WbAssert
{
	public static void areEqual(Object a, Object b) throws WhiteboxException
	{
		if(a.equals(b))
			return;
		throw new WhiteboxException("   Assertion failed:" + a.toString() + " does not equal expected value " + b.toString());
	}
	
	public static void refsEqual(Object a, Object b) throws WhiteboxException
	{
		if(a == b)
			return;
		throw new WhiteboxException("   Assertion failed: Reference mismatch.");
	}
	
	public static void areEqual(int a, int b) throws WhiteboxException
	{
		if(a == b)
			return;
		throw new WhiteboxException("   Assertion failed:" + a + " does not equal expected value " + b);
	}
	
	public static void areEqual(long a, long b) throws WhiteboxException
	{
		if(a == b)
			return;
		throw new WhiteboxException("   Assertion failed:" + a + " does not equal expected value " + b);
	}
	
	public static void areEqual(float a, float b) throws WhiteboxException
	{
		if(a == b)
			return;
		throw new WhiteboxException("   Assertion failed:" + a + " does not equal expected value " + b);
	}
	
	public static void areEqual(double a, double b) throws WhiteboxException
	{
		if(a == b)
			return;
		throw new WhiteboxException("   Assertion failed:" + a + " does not equal expected value " + b);
	}
	
	public static void areEqual(char a, char b) throws WhiteboxException
	{
		if(a == b)
			return;
		throw new WhiteboxException("   Assertion failed:" + a + " does not equal expected value " + b);
	}
}