import java.io.*;
class NewFile
{ 
public static void main(String args[])throws Exception
{
 PrintWriter pw = new PrintWriter("siri4.txt"); 
BufferedReader br1 = new BufferedReader(new FileReader("siri1.txt"));
BufferedReader br2 = new BufferedReader(new FileReader("siri2.txt"));
String l1 = br1.readLine();
String l2 = br2.readLine();
while (l1!= null||l2!=null)
        {
            if(l1!=null)
            {
                pw.println(l1);
                l1=br1.readLine();
            }
             
            else
            {
                pw.println(l2);
                l2=br2.readLine();
            }
        }
pw.flush();
br1.close();
br2.close();
pw.close();
System.out.println("Merged siri1.txt and siri2.txt into siri4.txt");
}
}
