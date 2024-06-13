import java.util.*;
class Main{
    static int p(int arr[],int s,int e){
        int pivot=arr[s];
        int cnt=0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot){
                cnt++;
            }
        }
        int pivotindex=s+cnt;
        
        int temp=arr[s];
        arr[s]=arr[pivotindex];
        arr[pivotindex]=temp;
        
        int i=s,j=e;
        while(i<j){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
               int t=arr[i];
               arr[i]=arr[j];
               arr[j]=t;
               i++;
               j--;
            }
        }
        
        return pivotindex;
        
    }
    
    static void quicksort(int arr[],int s,int e){
        if(s>=e)
        return;
        
        int pi=p(arr,s,e);
        quicksort(arr,s,pi-1);
        quicksort(arr,pi+1,e);
    }
    
    public static void main(String[] args){
        
        int arr[]={2,54,5,21,0,3,1};
        int n=arr.length-1;
        
       quicksort(arr,0,n);
        
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}
