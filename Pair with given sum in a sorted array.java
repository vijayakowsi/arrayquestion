You are given an array A of size N. 
You need to find all pairs in the array that sum to a number K. If no such pair exists then output will be -1.
The elements of the array are distinct and are in sorted order.

Examples:
Input:
2
7
1 2 3 4 5 6 7
98
7
1 2 3 4 5 6 7
8
Output:
-1
1 7 8
2 6 8
3 5 8

Explanation:
Testcase1: We cannot find any pair that sums to 98
Testcase2: We find 3 such pairs that sum to 8 (1,7) (2,6) (3,5)

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
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
	        int k=sc.nextInt();
	        int low=0;
	        int high=n-1;
	        int count=0;
	        while(high>low)
	        {
	            if(a[low]+a[high]==k)
	            {
	                System.out.println(a[low]+" "+a[high]+" "+k);
	                count++;
	                low++;
	                high--;
	            }
	            else if(a[low]+a[high]>k)
	            {
	                high--;
	            }
	            else
	            {
	                low++;
	            }
	        }
	        if(count==0)
	        {
	            System.out.println("-1");
	        }
	    }
		//code
	}
}
