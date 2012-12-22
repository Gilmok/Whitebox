import java.lang.reflect.*;
import java.util.*;

class ObserverTesting
{
	int a;
	float f;
	int[][] b;
	String c;
	String[] d;
	ObserverTesting e;
	
	ObserverTesting()
	{
		a = 5;
		f = 2.675f;
		b = new int[2][2];
		c = "Happy";
		d = new String[2];
		for(int i = 0; i < 2; i++)
		{	
			b[0][i] = i;
			b[1][i] = i + 2;
		}
		d[0] = "Hello";
		d[1] = "World";
		e = this;
	}
}

public class QuicktestRunner 
{
	public static int execPath;
	
	LinkedList inspected;
	
	QuicktestRunner()
	{
		inspected = new LinkedList();
	}
	/*public String inspectAll(Class in)
	{
		
		LinkedList ll = gatherClasses(in);
		
	}*/
	
	private LinkedList gatherClasses(Class in)
	{
		LinkedList l = new LinkedList();
		l.add(in);
		Class su = in.getSuperclass();
		while(su != null)
		{
			l.add(su);
			su = su.getSuperclass();
		}
		su = in.getDeclaringClass();
		while(su != null)
		{
			l.add(su);
			su = su.getDeclaringClass();
		}
		return l;
	}
	
	private String outTab(int depth)
	{
		String rtnVal = "";
		for(int j = 0; j < depth; j++)
			rtnVal += " ";
		return rtnVal;
	}
	
	private String dumpPrimitive(Field f, int depth, Object in) throws IllegalAccessException
	{
		String rtnVal = outTab(depth);
		rtnVal += "-" + f.getName() + ":" + f.get(in).toString() + "\n";
		return rtnVal;
	}
	
	private String dumpPrimitive(Object obj, int depth, String prefix)
	{
		String rtnVal = outTab(depth);
		rtnVal += "-" + prefix + ":" + obj.toString() + "\n";
		return rtnVal;
	}
	
	private String processArray(Object arr, int depth, Object src, String prefix) throws IllegalAccessException
	{
		//Array arr = (Array) f;
		//Class fc = f.getClass();
		//String s = fc.getName();
		String rtnVal = outTab(depth) + "+[]\n";
		//int array = 0;
		//while(s.charAt(array) == '[')
		//{
			//array++;
			//Object arr = f.get(src);
			
			//this would be so much easier if Java's Object arrays just used fields; but no,
			//leave it to the Java API to make life difficult for us
			try
			{
				Object[] all = (Object[]) arr; //class cast exception on primitive types
				for(int i = 0; i < all.length; i++)
				{
					Object obj = all[i];
					Class cls = obj.getClass();
					System.out.println("Looking at:" + cls.getName());
					if(cls.isArray())
						rtnVal += processArray(obj, depth + 1, src, prefix + "[" + i + "]");
					else
						rtnVal += inspectObject(obj, depth + 1, prefix + "[" + i + "]");
				}
			} catch(ClassCastException ex)
			{
				int length = Array.getLength(arr);
				for(int i = 0; i < length; i++)
					rtnVal += dumpPrimitive(Array.get(arr, i), depth + 1, prefix + "[" + i + "]");
			}
			//Integer x = new Integer(3);
			//System.out.println("Class Integer isPrimitive():" + x.getClass().isPrimitive());
			
				
				//rtnVal += inspectObject(all[i], depth + 1);
			/*System.out.println(arr.toString());
			Class a = arr.getClass();
			System.out.println(a.toString());*/
		//}
		return rtnVal;
	}
	
	public String inspectObject(Object o)
	{
		return inspectObject(o, 0, "");
	}
		
	private String inspectObject(Object o, int depth, String prefix)
	{
		String rtnVal = outTab(depth);//"+" + o.toString() + "\n";
		inspected.add(o);
		Class cls = o.getClass();
		LinkedList allClasses = gatherClasses(cls);
		//LinkedList allFields =  new LinkedList();
		for(int i = 0; i < allClasses.size(); i++)
		{
			Class cl = (Class) allClasses.get(i);
			//rtnVal += outTab(depth) + "+";
			if(!cl.isArray())
				rtnVal += outTab(depth) + "+" + cl.getName() + "\n";  
			System.out.println(rtnVal);
			Field[] fl2 = cl.getDeclaredFields();
			for(int j = 0; j < fl2.length; j++)
			{
				Field f = fl2[j];
				f.setAccessible(true);
				//rtnVal += outTab(depth + 1) + f.getName();
				Class fc = f.getType();
				System.out.println("Looking at " + fc.getName());
				try
				{
					Object fo = f.get(o);
					if(fc.isPrimitive())
					{
						System.out.println("primitive");
						rtnVal += dumpPrimitive(f, depth + 1, o);
						System.out.println(rtnVal);
					}
					else
					{
						System.out.println("not primitive");
						if(fc.isArray())
							rtnVal += processArray(fo, depth + 1, o, f.getName());
						else if(!inspected.contains(fo))
							rtnVal += inspectObject(fo, depth + 1, prefix);
					}
				}
				catch(Exception ex){}
			}
		}
		return rtnVal;
	}
	
	public static void main(String args[])
	{
		ObserverTesting ob = new ObserverTesting();
		QuicktestRunner qt = new QuicktestRunner();
		System.out.println(qt.inspectObject(ob));
	}
}
