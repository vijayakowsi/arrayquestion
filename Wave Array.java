Given a sorted array arr[] of non-repeating integers without duplicates. 
Sort the array into a wave-like array and return it.
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... 
(considering the increasing lexicographical order).
Example:
Input:
1
5
1 2 3 4 5
Output:
2 1 4 3 5

Explanation:
Testcase 1: Array elements after sorting it in wave form are 2 1 4 3 5.


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        
		        
		    }
		    for(int i=0;i<=n-2;i++){
		        int temp=a[i+1];
		        a[i+1]=a[i];
		        a[i]=temp;
		        i++;
		        
		    }
		     for(int i=0;i<n;i++){
		     System.out.print(a[i]+" ");
		         
		     }
		     System.out.println("");
		    t--;
		}
	}
}
