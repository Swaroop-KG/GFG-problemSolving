class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int totalSum=0;
        for(int a:arr)
        totalSum+=a;
        
        int sumHere=0;
        totalSum-=arr[0];
        for(int i=1;i<arr.length;i++){
            sumHere+=arr[i-1];
            totalSum-=arr[i];
            if(sumHere == totalSum)
            return i;
        }
        return -1;
    }
}
