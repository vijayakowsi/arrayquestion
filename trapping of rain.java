Given an array arr[] of N non-negative integers representing height of blocks at index i as Ai where the width of each block is 1. 
Compute how much water can be trapped in between blocks after raining.

Example:
Input:
2
4
7 4 0 9
3
6 9 9

Output:
10
0

Explanation:
Testcase 1: Water trapped by block of height 4 is 3 units, block of height 0 is 7 units. So, total unit of water trapped is 10 units.


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    int lo = 0;int hi = n-1;int res = 0;
		    int left_max = 0;int right_max=0;
		    while(lo<hi){
		        if(arr[lo]<arr[hi]){
		            if(arr[lo]>left_max)
		                left_max = arr[lo];
		            else
		                res+=left_max-arr[lo];
		            lo++;
		        }else{
		            if(arr[hi]>right_max)
		                right_max = arr[hi];
		            else
		                res+=right_max-arr[hi];
		            hi--;
		        }
		    }
		    System.out.println(res);
		}
	}
}
