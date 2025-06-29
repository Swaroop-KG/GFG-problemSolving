class Solution {
    public ArrayList<Integer> printDivisors(int n) {
        // code here
        ArrayList<Integer>  ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans.add(i);
            }
        }
        return ans;
    }
}