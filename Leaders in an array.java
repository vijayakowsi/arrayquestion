Given an array of positive integers. Your task is to find the leaders in the array.

Example:
Input:
3
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
Output:
17 5 2
4 0
7 7 3

Explanation:
Testcase 3: All elements on the right of 7 (at index 0) are smaller than or equal to 7. Also, all the elements of right side of 7 (at index 3) are smaller than 7. 
And, the last element 3 is itself a leader since no elements are on its right.

import java.io.*;
import java.util.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    int maxEle = arr[n-1];
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    for(int i=n-1; i>=0; i--) {
		        if(arr[i] >= maxEle){
		            maxEle = arr[i];
		            res.add(maxEle);
		        }
		    }
		    for(int i=res.size()-1; i>=0; i--){
		        str.append(res.get(i)+" ");
		    }
		    System.out.println(str);
		}
	}
}
