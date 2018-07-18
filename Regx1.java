import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regx1
{
public static void main(String args[])
	{
		Pattern p=Pattern.compile("[0-9]{2}[A-Z]{2}[0-9][A-Z][0-9]{4}");
		Matcher m=p.matcher("16EM1A0510");
	while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
