
class Solution {
    public static int firstRepeated(int[] arr) {
        int ans = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (map.containsKey(val)) {
                ans = Math.min(ans, map.get(val));
            } else {
                map.put(val, i + 1);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

