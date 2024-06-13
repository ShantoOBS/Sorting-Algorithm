class Main{
    
   static void merge(int arr[],int s,int e){
        
        int mid=(s+e)/2;
        
        int len1=mid-s+1;
        int len2=e-mid;
        
        int arr1[]=new int[len1];
        int arr2[]=new int[len2];
        int k=s;
        
        for(int i=0;i<len1;i++){
            arr1[i]=arr[k++];
        }
        k=mid +1;
        for(int i=0;i<len2;i++){
            arr2[i]=arr[k++];
        }
        
        k=s;
        int i=0;
        int j=0;
        while(i<len1 && j<len2){
            
            if(arr1[i]<arr2[j]){
                arr[k++]=arr1[i++];
            }
            else{
                arr[k++]=arr2[j++];
            }
            
        }
        
        while(i<len1){
            arr[k++]=arr1[i++];
        }
        
        while(j<len2){
              arr[k++]=arr2[j++];
        }
        
        
    }
    static void mergesort(int arr[],int s,int e){
        
        if(s<e)
        {
      
        
        int mid=(s+e)/2;
        
        mergesort(arr,s,mid);
        mergesort(arr,mid+1,e);
        merge(arr,s,e);
        }
    }
    
    
    public static void main(String[] agrs){
        int arr[]={9,33,3,23,2};
        
        int n=arr.length;
        System.out.println(n);
        
        mergesort(arr,0,n-1);
        
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
