Given an array A of positive integers. Count number of smaller elements on right side of each array.

Example:
Input:
2
7
12 1 2 3 0 11 4
5
1 2 3 4 5

Output:
6 1 1 1 0 1 0
0 0 0 0 0

Explanation:
Testcase 1: 6 elements are greater than 1 on its right side in original array. 
Similarly 1 element is greater than 4 on its right side in original array.


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int n =sc.nextInt();
		    int arr[]=new int[n], i;
		    int out[]=new int[n];
		    for(i=0; i<n; i++){
		        arr[i]=sc.nextInt();
		    }
		    for(i=0;i<n; i++){
		        int count=0;
		        for(int j=i+1; j<n; j++){
		            if(arr[i]>arr[j]){
		                count++;
		            }
		        }
		        System.out.print(count+" ");
		    }
		    System.out.print("\n");
		    t--;
		}
	}
}
