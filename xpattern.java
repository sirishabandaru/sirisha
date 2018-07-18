import java.io.*;
public class xpattern
{
public static void main(String args[])
{
 int a[]={1,2,3,2,1};
 int l=a.length;
 for(int i=0;i<l;i++)
  {
    for(int j=0;j<l;j++)
     {
	if(j==i||j==(l-1-i))
 	 {
		System.out.print(a[j]);
         }
        else 
         {
                System.out.print("  ");
         }
     }
   System.out.println();
  }
}
}
