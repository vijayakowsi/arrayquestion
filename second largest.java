/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		//code
		int t=sc.nextInt();
		while(t-->0)
		{
		    int temp;
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    for(int j=0;j<n;j++)
		    {
		        for(int i=j+1;i<n;i++)
		        {
		           if(arr[i]>arr[j])
		           {
		               temp=arr[j];
		               arr[j]=arr[i];
		               arr[i]=temp;
		           }
		        }
		    }
		     System.out.println(arr[1]);
		}
	}
}
