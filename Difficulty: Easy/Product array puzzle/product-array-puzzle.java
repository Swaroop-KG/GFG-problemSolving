// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int[] result = new int[arr.length];
        Arrays.fill(result,1);
        int pre=1,post=1;
        for(int i=0;i<arr.length;i++){
            result[i]*=pre;
            pre=arr[i]*pre;
        }
        for(int i=arr.length-1;i>=0;i--){
            result[i]= result[i]*post;
            post=post*arr[i];
        }
        return result;
    }
}
