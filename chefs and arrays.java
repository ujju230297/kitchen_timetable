/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		for(int k=0;k<=tc;k++)
		{
			int n=sc.nextInt();
			int a[]= new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int m=sc.nextInt();
			int b[]= new int[m];
			for(int i=0;i<n;i++)
			{
				b[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++)
			{
				if(a[i] == 0 && b[i] ==0)
				{
					System.out.print("0 ");
				}
				else if(a[i]>=b[i])
				{
					System.out.println(a[i]+""+b[i]+"");
				}
				else if(b[i]>=a[i])
				{
					System.out.println(b[i]+""+a[i]+"");
				}
				
			}
			System.out.println();
			
		}
    }
}