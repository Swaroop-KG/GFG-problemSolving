import java.util.HashMap;

class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> freqA = new HashMap<>();
        HashMap<Integer, Integer> freqB = new HashMap<>();

        // Count frequencies in array a
        for (int num : a) {
            freqA.put(num, freqA.getOrDefault(num, 0) + 1);
        }

        // Count frequencies in array b
        for (int num : b) {
            freqB.put(num, freqB.getOrDefault(num, 0) + 1);
        }

        // Check if b is a subset of a (with frequency)
        for (int key : freqB.keySet()) {
            if (freqA.getOrDefault(key, 0) < freqB.get(key)) {
                return false;
            }
        }

        return true;
    }
}
