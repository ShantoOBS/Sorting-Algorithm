#include <bits/stdc++.h>
using namespace std;
const int N=1e6;
int arr[N];

void marge(int l,int r,int mid){
  
      int l_sz=mid-l+1;
    
      int L[l_sz+1];
      
      int r_sz=r-mid;
      
      int R[r_sz+1];
      
      for(int i=0;i<l_sz;i++){
           L[i]=arr[i+l];
      }
      
      for(int i=0;i<r_sz;i++){
           R[i]=arr[i+mid+1];
      }
      
      
      R[r_sz]=L[l_sz]=INT_MAX;
      
      int i_r=0,i_l=0;
      
      for(int i=l;i<=r;i++){
        
        if(R[i_r]<=L[i_l]){
          
            arr[i]=R[i_r];
            i_r++;
        }
        else{
           arr[i]=L[i_l];
           i_l++;
        }
           
      }
      
}


void marge_sort(int l,int r){
  
   if(l==r)return ;
   
   int mid=(l+r)/2;
   marge_sort(l,mid);
   marge_sort(mid+1,r);
   marge(l,r,mid);
}

int main() 
{
    int n; cin>>n;
    
    for(int i=0;i<n;i++){
      
       cin>>arr[i];
    }
    
    marge_sort(0,n-1);
    
    for(int i=0;i<n;i++)cout<<arr[i]<<" ";
    
    
}
