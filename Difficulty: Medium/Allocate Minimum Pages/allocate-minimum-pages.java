class Solution {
     boolean isValid(int[] arr, int n,int k ,int maxAllowed){
            int student=1;
            int pages=0;
            for(int i=0;i<n;i++){
                if(arr[i]>maxAllowed){
                    return false;
                }
                if(pages+arr[i]<=maxAllowed){
                    pages+=arr[i];
                }else{
                    student++;
                    pages=arr[i];
                }
            }
            return student > k ? false : true ;
        }
    public int findPages(int[] arr, int k) {
        
        int n= arr.length;
        if(k>n){
            return -1;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int st=0,end=sum;
        int ans=-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(isValid(arr, n ,k,mid)){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
            
        }
        return ans;
    }
}