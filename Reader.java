import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reader
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
String a=br.readLine();
Pattern p=Pattern.compile("[0-9]*[^a-zA-Z]");
Matcher m=p.matcher(a);
while(m.find())
		{
			System.out.print(m.group());
		}
System.out.println();
}
}
