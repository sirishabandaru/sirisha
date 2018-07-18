import java.io.*;
import java.util.*;
class pattern
{
   public static void main(String args[])
{
 int N, i, j;
Scanner s=new Scanner(System.in);
System.out.println("Enter N: ");
   N=s.nextInt();
// First upper half of the pattern
    for(i=N; i>=1; i--)
    {
        // First inner part of upper half
        for(j=N; j>i; j--)
        {
            System.out.print(j);
        }

        // Second inner part of upper half

        for(j=1; j<=(i*2-1); j++)
        {
          System.out.print(i);
        }

        // Third inner part of upper half
        for(j=i+1; j<=N; j++)
        {
            System.out.print(j);
        }

       System.out.println();
    }

    // Second lower half of the pattern
    for(i=1; i<N; i++)
    {
        // First inner part of lower half
        for(j=N; j>i; j--)
        {
            System.out.print(j);
        }

        // Second inner part of lower half
        for(j=1; j<=(i*2-1); j++)
        {
           System.out.print(i+1);
        }

        // Third inner part of lower half
        for(j=i+1; j<=N; j++)
        {
           System.out.print(j);
        }

        System.out.println();
    }

    }
}
