#include<bits/stdc++.h>
using namespace std;

int main(){
    
    int n;
    cin>>n;
    
    vector<int>arr(n);
    
    for(auto &k:arr)cin>> k;
        for(int i = 1; i<n; i++) {
        int temp = arr[i];
        int j = i-1;
        for(; j>=0; j--) {
            
            if(arr[j] > temp) {
                //shift
                arr[j+1] = arr[j];
            }
            else { // ruk 
                break;
            }
            
        }
        //copy temp value
        arr[j+1] = temp;  
    } 
    for(auto i:arr)cout<<i<<" ";
    
    
   
    
    
}
