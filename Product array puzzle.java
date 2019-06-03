Given an array A of size N, 
construct a Product Array P (of same size) such that P is equal to the product of all the elements of A except A[i].

Example:
Input
2
5
10 3 5 6 2
2
12 20
Output
180 600 360 300 900
20 12

Explanation:
Testcase1: For the product array P, at i=0 we have 3*5*6*2. At i=1 10*5*6*2. At i=2 we have 10*3*6*2. At i=3 we have 10*3*5*2. At i=4 we have 10*3*5*6
So P is 180 600 360 300 900
 
 implementation in c++:
 
 using namespace std;
int main()
 {
     int t,i,n,A[1001],P;
     cin>>t;
     while(t--){
         cin>>n;
         for(i=0;i<n;i++)
            cin>>A[i];
         P=1;
         for(i=0;i<n;i++)
            P=P*A[i];
         for(i=0;i<n;i++)
            cout<<P/A[i]<<" ";
         
         cout<<endl;
         
     }
	
	return 0;
}

implementation in java:


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		//code
		
	   Scanner sct =new Scanner(System.in);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int tc = Integer.parseInt(br.readLine());

while(tc>0){
int n = Integer.parseInt(br.readLine());
int[] arr = new int[n];
long pro =1;
String[] s = br.readLine().trim().split(" ");

for(int i = 0 ; i < n ; i++ ){
arr[i] =Integer.parseInt(s[i]);
pro *= arr[i];
}

StringBuffer sb= new StringBuffer();

for(int i = 0 ; i < n ; i++ ){
sb.append((int)pro/arr[i]+" ");
}
System.out.println(sb);

tc--;
}	    
	}
}
