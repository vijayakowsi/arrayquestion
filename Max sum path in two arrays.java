Given two sorted arrays A and B.
The task is to complete the function max_path_sum that takes 4 argument,
the first two arguments represent the 2 arrays A[] and B[] and the last two arguments l1, l2 denote the size of array A and B respectively.
The function returns the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays .

Example:
2
5 4
2 3 7 10 12
1 5 7 8 
3 3
1 2 4
1 2 7

Output
35 
10

Explanation:
Testcase 1: For first test case the path will be 1+5+7+10+12 = 35.
Testcase 2: For second test case the path will be 1+2 +7=10.

class GfG
{
    /*You are required to complete this method
    * ar1 : 1st array
    * ar2 : 2nd array
    */
    int maxPathSum(int ar1[], int ar2[])
    {
         int firstsum = 0;
            // int secsum = 0;
            // int res = 0;
            //int i=0,j=0;
            int m = ar1.length;
            int n = ar2.length;
            int i = 0, j = 0; 
  
        // Initialize result and current sum through ar1[] and ar2[]. 
        int result = 0, sum1 = 0, sum2 = 0; 
  
        // Below 3 loops are similar to merge in merge sort 
        while (i < m && j < n)  
        { 
            // Add elements of ar1[] to sum1 
            if (ar1[i] < ar2[j]) 
                sum1 += ar1[i++]; 
              
            // Add elements of ar2[] to sum2 
            else if (ar1[i] > ar2[j]) 
                sum2 += ar2[j++]; 
  
            // we reached a common point 
            else
            { 
                // Take the maximum of two sums and add to result 
                result += Math.max(sum1, sum2); 
  
                // Update sum1 and sum2 for elements after this 
                // intersection point 
                sum1 = 0; 
                sum2 = 0; 
  
                // Keep updating result while there are more common 
                // elements 
                while (i < m && j < n && ar1[i] == ar2[j])  
                { 
                    result = result + ar1[i++]; 
                    j++; 
                } 
            } 
        } 
  
        // Add remaining elements of ar1[] 
        while (i < m) 
            sum1 += ar1[i++]; 
          
        // Add remaining elements of ar2[] 
        while (j < n)  
            sum2 += ar2[j++]; 
  
        // Add maximum of two sums of remaining elements 
        result += Math.max(sum1, sum2); 
  
        return result; 

    }
}
