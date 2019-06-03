Given an array A of positive integers of size N, where each value represents number of chocolates in a packet.
Each packet can have variable number of chocolates. There are M students, the task is to distribute chocolate packets such that :
1. Each student gets one packet.
2. The difference between the number of chocolates given to the students having packet with
maximum chocolates and student having packet with minimum chocolates is minimum.

Example:
Input:
2
8
3 4 1 9 56 7 9 12
5
7
7 3 2 4 9 12 56
3

Output:
6
2

Explanation:
Testcase 1: The minimum difference between maximum chocolates and minimum chocolates is 9-3=6


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
		    int i;
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		     int diff=Integer.MAX_VALUE;
		   Arrays.sort(a);
	        for(i=0;i<n-m+1;i++){
	            if(a[i+m-1]-a[i]<diff)
	                diff=a[i+m-1]-a[i];
	        }
		   
	
		   System.out.println(diff);
		    
		   
		}
	}
}
