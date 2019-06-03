You are given an array A, of N elements. You need to find minimum distance between given two integers x and y.
Example:
Input:
2
2
1 2
1 2
7
86 39 90 67 84 66 62 
42 12

Output:
1
-1

Explanation:
Testcase1: x = 1 and y = 2. minDistance between x and y is 1.
Testcase2: x = 42 and y = 12. We return -1 as the x and y don't exist in the array.

class GfG
{
    long minDist(Long arr[], long n, long x, long y) 
    {
       // add code here.
       
       int idx=-1;
       int idy=-1;
       long minlen=n;
       long min=0;
       
       for(int i=0;i<n;i++)
       {
           if(arr[i]==x)
           {
               idx=i;
           }
           if(arr[i]==y)
           {
               idy=i;
           }
           if(idx!=-1 &&idy!=-1)
           {
               min=Math.abs(idx-idy);
               if(min<minlen)
               {
                   minlen=min;
               }
           }
       }
           if(idx==-1 || idy==-1)
           {
               return -1;
           }
           else
           {
               return minlen;
           }
    }
}
