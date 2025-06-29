class Solution {
    public ArrayList<Integer> divFloorCeil(int a, int b) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int floor;
        if ((a ^ b) < 0 && a % b != 0) { 
            floor = a / b - 1;
        } else {
            floor = a / b;
        }
        ans.add(floor);
        
        int ceil;
        if ((a ^ b) >= 0 && a % b != 0) { 
            ceil = a / b + 1;
        } else {
            ceil = a / b;
        }
        ans.add(ceil);
        
        return ans;
    }
}
