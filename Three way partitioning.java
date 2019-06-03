Given an array A[] and a range [a, b]. The task is to partition the array around the range such that array is divided in three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified arranged array.
Example:
Input:
2
5
1 2 3 3 4
1 2
3
1 2 3
1 3

Output:
1
1

/*Complete the function below*/
class GfG
{
	public ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int a, int b)
	{
        int start = 0;
        int end = A.size()-1;
        for(int i =0;  i<=end; ){
            if(A.get(i) <a){
                int temp = A.get(i);
                A.set(i, A.get(start));
                A.set(start, temp);
                start++;
                i++;
            }else if(A.get(i) > b){
                int temp = A.get(i);
                A.set(i, A.get(end));
                A.set(end, temp);
                end--;
            }else
                i++;
        }
        return A;
    }
}
