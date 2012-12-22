import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.File;
import java.io.FilenameFilter;
//import java.io.OutputStreamReader;

class WhiteboxUtils 
{
   public static final char REPLACEMENT = '#';
   public static int getAccessLevel(String line)
   {
      String[] access = {"private", "protected", "public"};
      for(int i = 0; i < access.length; i++)
      {
         if(line.indexOf(access[i]) > -1)
            return i;
      }
      return 2;  
   }
   
   public static String[] tokenizeLine(String line)
   {
      return null;
   }
   
   public static String removeAccessModifiers(String line)
   {
      String newLine = line.trim();
      
      String[] mods = {"public","protected","private","static","final","synchronized","transient"};
      for(int i = 0; i < mods.length; i++)
      {
         newLine = newLine.replaceAll(mods[i], "");
      }
      
      return newLine.trim();
   }
   
   public static String removeNonCode(String line, boolean replaceChar)
   {
	   line = WhiteboxUtils.removeStrings(line, replaceChar);
	   line = WhiteboxUtils.removeComments(line, replaceChar);
	   return line;
   }
   
   public static void pause(int millis)
   {
   	try{Thread.sleep(millis);}catch(Exception ex){}
   }
   
   public static String removeStrings(String line, boolean replaceChar)
   {
      String newLine = line;//.trim();
      String rtnVal = "";
      boolean inString = false;
      boolean isEscaped = false;
      for(int i = 0; i < newLine.length(); i++)
      {
         char c = newLine.charAt(i);
         switch(c)
         {
            case '\'':
            case '\"':
               if(isEscaped == false)
                  inString = !inString;
               isEscaped = false;
               if(replaceChar)
            	   rtnVal += REPLACEMENT;
               break;
            case '\\':
               isEscaped = !isEscaped;
               if(replaceChar)
            	   rtnVal += REPLACEMENT;
               break;
            default:
               if(!inString)
                  rtnVal += c;
               else if(replaceChar)
            	  rtnVal += REPLACEMENT;
               isEscaped = false;
               break;
         }
      }
      return rtnVal;
   }
   
   public static String removeComments(String line, boolean replaceChar)
   {
      String newLine = line;//.trim();
      String rtnVal = "";
      boolean inString = false;
      boolean isEscaped = false;
      boolean inComment = false;
      boolean commentStarted = false;
      boolean commentEnded = false;
      boolean writeChar = true;
      for(int i = 0; i < newLine.length(); i++)
      {
         char c = newLine.charAt(i);
         if(c == '\\')
         {
            isEscaped = !isEscaped;
            continue;
         }
         else
            isEscaped = false;
         switch(c)
         {
            case '\'':
            case '\"':
               if(isEscaped == false)
                  inString = !inString;
               
               break;
            case '/':
               if(inString)
                  break;
               if(commentStarted)
               {
                  return(rtnVal.substring(0, rtnVal.length() - 1));
               }
               else if(commentEnded)
               {
                  inComment = false;
                  commentEnded = false;
                  commentStarted = false;
                  writeChar = false;
               }
               else
               {
                  commentStarted = true;
                  
               }
               break;
            case '*':
               if(inString)
                  break;
               if(commentStarted)
               {
            	  if(replaceChar == false)
            		  rtnVal = rtnVal.substring(0, rtnVal.length() - 1);
                  inComment = true;
                  commentStarted = false;
               }
               else
                  commentEnded = true;
               break;
            default:
               commentStarted = false;
               commentEnded = false;
         }
         if(!inComment && writeChar)
            rtnVal += c;
         else
        	rtnVal += REPLACEMENT;
         writeChar = true;      
         
      }
      String test1 = "/* */";
      String test2 = "//";
      //String test3;
      String test4 = /*""*/ "a";
      String test5 = "x"; //gfggfgj
      return rtnVal;
   }
   
   public static String endTailComment(String in)
   {
	   return in.substring(in.indexOf("*/") + 2);
   }
   
   public static String getWbtPattern(String filename)
   {
      String rtnVal = "";
      BufferedReader br;
      try
      {
         FileReader fr = new FileReader(filename);
         br = new BufferedReader(fr);
         rtnVal = br.readLine();
         br.close();
         
         //eliminate the //tests-from:
         rtnVal = rtnVal.substring(13, rtnVal.length());
      }
      catch(IOException ex)
      {
         ex.printStackTrace();
      }
      return rtnVal;
   }
   
   public static String[] loadFile(String fileName)
   {
      String[] rtnVal = null;
      BufferedReader br;
      try
      {
         FileReader fr = new FileReader(fileName);
         br = new BufferedReader(fr);
         LinkedList strList = new LinkedList();
         String s;
         while(true)
         {
            s = br.readLine();
            if(s != null)
            {
               strList.add(s);
            }
            else
               break;
         }
         rtnVal = new String[strList.size()];
         for(int i = 0; i < strList.size(); i++)
            rtnVal[i] = (String) strList.get(i);
         br.close();
      }
      catch(IOException ex)
      {
         rtnVal = new String[0];
      }
      return rtnVal;
   }
   
   public static String currDir()
   {
   	return System.getProperty("user.dir");
   }
   
   public static void chDir(String newDir)
   {
   	System.setProperty("user.dir", newDir);
   }
   
   public static String[] listFiles(String dir, String filter)
   {
   	File f = new File(dir);
   	WildcardFilter wcf = new WildcardFilter(filter);
   	return f.list(wcf);
   	
   }
   	
   	
   
   public static String[] runCmd(String cmd)
   {
   	String[] out = new String[2];
   	out[0] = new String(); 
   	out[1] = new String(); 
   	try
   	{
   		System.out.println("Running " + cmd);
   		Process p = Runtime.getRuntime().exec(cmd);
   		//p.waitFor();
   		
   		
   		StreamConsumer stdOut = new StreamConsumer(p.getInputStream());
   		StreamConsumer stdErr = new StreamConsumer(p.getErrorStream());
   		stdOut.start();
   		stdErr.start();
   		
   		p.waitFor();
   		System.out.println("Finished running " + cmd);
   		out[0] = stdOut.getString();
   		out[1] = stdErr.getString();
   	}
   	catch(Exception ex)
   	{
   		out[1] += "failure";
   		System.err.println("Failed to caputre output of " + cmd);
   	}
   	finally
   	{
   		return out;
   	}
   }
   
   public static boolean isInString(int pos, String block)
   {
      boolean rtnVal = false;
      boolean ignore;
      for(int i = 0; i < pos; i++)
      {
         char c = block.charAt(i);
         if(c == '\\')
         {
            ignore = true;
            continue;
         }
         else
            ignore = false;
         if((c == '\"' || c == '\'') && ignore == false)
            rtnVal = !rtnVal;
      }
      return rtnVal;
   }
   
   public static int findClosingParen(String in, int startPos)
   {
	   char c;
	   int depth = 1;
	   for(int i = startPos; i < in.length(); i++)
	   {
		   c = in.charAt(i);
		   if(c == '(')
			   depth++;
		   else if(c == ')')
		   {
			   depth--;
			   if(depth == 0)
				   return i;
		   }
	   }
	   return -1;
   }
   
   public static String writeFile(String fName, String data)
   {
   	try
   	{
   		FileWriter fstream = new FileWriter(fName);
   		BufferedWriter bw = new BufferedWriter(fstream);
   		bw.write(data);
   		bw.close();
   		System.out.println("Saved file:" + fName);
   		return "";
   	}
   	catch(Exception ex)
   	{
   		return ex.getMessage();
   	}
   }
   
   public static String writeFile(String fName, String[] data)
   {
   	String s = new String();
   	for(int i = 0; i < data.length; i++)
   		s += data[i] + "\n";
   	return writeFile(fName, s);
   }
   
   public static int countLines(String in)
   {
   	String[] x = in.split("\n");
   	return x.length;
   }
}

class AssertionFailureException extends Exception
{
   public AssertionFailureException(Object a, Object e)
   {
      
   }
}

class StreamConsumer extends Thread
{
	String accum;
	BufferedReader br;
	
	StreamConsumer(InputStream in)
	{
		br = new BufferedReader(new InputStreamReader(in));
		accum = new String();
	}
	
	
	public void run()
	{
		String s = new String();
		try
		{
   		while((s = br.readLine()) != null)
   		{
   			//System.out.println(s);
   			accum += s + "\n";
   		}
		} 
		catch(Exception ex)
		{
			
		}
		
	}
	
	public String getString()
	{
		return accum;
	}
}

class WildcardFilter implements FilenameFilter
{
	String filter;
	String[] x;
	boolean fullFilter;
	
	WildcardFilter(String in)
	{
		filter = in;
		x = in.split("\\*");
		fullFilter = false;
		if(x[0].equals(in))
			fullFilter = true;
	}
	
	public boolean accept(File dir, String name)
	{
		if(fullFilter)
		{
			return name.equals(x[0]);
		}
		else
		{
		
			if(!filter.startsWith("*"))
			{
				if(!name.startsWith(x[0]))
					return false;
			}
			
			if(!filter.endsWith("*"))
			{
				if(!name.endsWith(x[x.length - 1]))
					return false;
			}
			String temp = name;
			int pos;
			for(int i = 0; i < x.length; i++)
			{
				if(x[i].equals(""))
					continue;
				pos = temp.indexOf(x[i]);
				if(pos == -1)
					return false;
				else
					pos += x[i].length();
				temp = temp.substring(pos);
			}
			return true;
		}
	}
}

class Assert
{
   public static void areEqual(String actual, String expected) throws AssertionFailureException
   {
      if(!actual.equals(expected))
         throw new AssertionFailureException(actual, expected);
   }
   
   public static void areEqual(int actual, int expected) throws AssertionFailureException
   {
      if(actual != expected)
         throw new AssertionFailureException(new Integer(actual), new Integer(expected));
   }
   
   public static void areEqual(double actual, double expected) throws AssertionFailureException
   {
      if(actual != expected)
         throw new AssertionFailureException(new Double(actual), new Double(expected));
   }
   
   /*public static void areEqual(Object[] actual, Object[] expected)
   {
      
   }*/
}
