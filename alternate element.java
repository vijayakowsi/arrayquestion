Example:
Input:
2
4
1 2 3 4
5
1 2 3 4 5
Output:
1 3
1 3 5

class GfG
{
    public static void print(int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
            i=i+1;
        }
        
        
    }
}

//User function Template for Java
// arr[] is the array 
// n is the number of elements in array.
class GfG
{
    public static void print(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }// your code here
    }
}
