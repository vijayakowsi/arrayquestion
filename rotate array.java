method 1:
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	         Scanner in = new Scanner(System.in);
	         int test = in.nextInt();
	         while(test-->0)
	         {
	             int N = in.nextInt();
	             int D = in.nextInt();
	             int a[]= new int[N];
	             for(int i=0; i<N; i++)
	             {
	                a[i] = in.nextInt();
	             }
	             StringBuffer s = new StringBuffer();
	             for(int i=D; i<N; i++ )
	             {
	                 s.append(a[i]+" ");
	             }
	             for(int i=0;i<D;i++)
	             {
	                 s.append(a[i]+" ");
	             }
	             System.out.println(s);
	         }
	 }
}

method 2:

// Java program to rotate an array by 
// d elements 

class RotateArray { 
	/*Function to left rotate arr[] of size n by d*/
	void leftRotate(int arr[], int d, int n) 
	{ 
		for (int i = 0; i < d; i++) 
			leftRotatebyOne(arr, n); 
	} 

	void leftRotatebyOne(int arr[], int n) 
	{ 
		int i, temp; 
		temp = arr[1]; 
		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1]; 
        }
		arr[i] = temp; 
	} 

	/* utility function to print an array */
	void printArray(int arr[], int n) 
	{ 
		for (int i = 0; i < n; i++) 
			System.out.print(arr[i] + " "); 
	} 

	// Driver program to test above functions 
	public static void main(String[] args) 
	{ 
		RotateArray rotate = new RotateArray(); 
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		rotate.leftRotate(arr, 2, 7); 
		rotate.printArray(arr, 7); 
	} 
} 

// This code has been contributed by Mayank Jaiswal 
