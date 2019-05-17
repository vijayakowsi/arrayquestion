Given an sorted array A of size N. Find number of elements which are less than or equal to given element X

Example:
Input:
2
6
1 2 4 5 8 10
9
7
1 2 2 2 5 7 9
2
Output:
5
4

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
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int count=0;
		    int ele=sc.nextInt();
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]<=ele)
		        {
		           count++; 
		        }
		    }
		    System.out.println(count);
		}
	}
}
