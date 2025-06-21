

// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int largest=0;
        int secondlargest=0;
        for(int i=0;i<arr.length;i++){
         if(arr[i]>largest){
             secondlargest= largest;
             largest=arr[i];
             
         }
         else if(arr[i]>secondlargest && arr[i]!=largest){
             secondlargest=arr[i];
         }
        }
        if(secondlargest==0){
            return -1;
        }
        return secondlargest;
    }
}