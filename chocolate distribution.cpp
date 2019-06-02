#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	
	while(t--!=0){
	    int n;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	       cin>>arr[i];
	    
	    int m;
	    cin>>m;
	    sort(arr,arr+n);
	    int max=arr[m-1]-arr[0];
	    for(int i=m;i<n;i++){
	        if(max>arr[i]-arr[i-m+1])
	          max=arr[i]-arr[i-m+1];
	    }
	    cout<<max<<endl;
	}
	return 0;
}
