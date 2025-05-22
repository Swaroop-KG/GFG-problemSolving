// User function Template for Java

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // Your code here
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        int sum1=0;
        for(int j=0;j<b.length;j++){
            sum1+=b[j];
        }
        if(sum==sum1){
            return true;
        }
        
        return false;
    }
}