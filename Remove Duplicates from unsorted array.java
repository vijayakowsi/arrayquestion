Given an array of integers which may or may not contain duplicate elements. Your task is to print the array after removing duplicate elements, if present.

Example:
Input:
1
6
1 2 3 1 4 2
Output: 
1 2 3 4

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-- >0){
		    
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    
		   LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		   for(int i=0;i<n;i++)
		   {
		       hs.add(arr[i]);
		   }
		   Iterator it=hs.iterator();
		   while(it.hasNext())
		   {
		       System.out.print(it.next()+" ");
		   }
            System.out.println();
		    
		}
		
	}
}
