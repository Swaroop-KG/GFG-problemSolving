class Solution {
    // Function to remove duplicates from the given array in-place
    public int removeDuplicates(int[] arr) {
      Set<Integer> seen = new HashSet<>();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!seen.contains(arr[i])) {
                seen.add(arr[i]);
                arr[index++] = arr[i];
            }
        }

        return index; 
    }
}
