/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int temp;
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        for(int j=i;j<n;j++)
		        {
		            if(a[i]>a[j])
		            {
		                temp=a[i];
		                a[i]=a[j];
		                a[j]=temp;
		            }
		        }
		    }
		    System.out.println(a[0]+" "+a[n-1]);
		}
	}
}
