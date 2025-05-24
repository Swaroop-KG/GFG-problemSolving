// User function Template for Java


class Solution {
    
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        int[] freq = new int[n + 1];
        
        for (int num : arr) {
            freq[num]++;
        }
        
        int repeating = -1, missing = -1;
        
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) repeating = i;
            if (freq[i] == 0) missing = i;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }
}

