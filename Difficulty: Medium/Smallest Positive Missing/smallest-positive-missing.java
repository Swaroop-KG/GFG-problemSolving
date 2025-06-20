
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        for(int i =0;i<arr2.length;i++){
            if(arr2[i]>0)
            set.add(arr2[i]);
        }
        
        for(int i=1;i<=arr.length+1;i++){
            if(!set.contains(i)){
                return i;
            
            }
        }
        return -1;
    }
}
