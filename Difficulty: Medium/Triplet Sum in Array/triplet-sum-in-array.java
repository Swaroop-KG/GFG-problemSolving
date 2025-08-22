class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n= arr.length;
       Arrays.sort(arr);
       int sum =0;
       for(int i =0;i<n-2;i++){
           int j=i+1;
           int k=n-1;
            if(i > 0 && arr[i] == arr[i - 1]) continue;  
           while(j<k){
               sum=arr[i]+arr[j]+arr[k];
               if(sum==target){
                   return true;
               }
               else if(sum<target){
                   j++;
               }
               else{
                   k--;
               }
           }
       }
       return false;
    }
}
