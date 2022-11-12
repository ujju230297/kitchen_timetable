/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int count=0;
	
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int b[] = new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		if(b[0]<=a[0])
		{
			count++;
		}
		
		for(int i=1;i<n;i++)
		{
			if(b[i]<=(a[i]-a[i-1]))
			{
				count++;
			}
		}
		System.out.println(count);
		
		
    }
}
