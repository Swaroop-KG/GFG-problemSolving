class Solution {
    public int peakElement(int[] arr) {
        // code here
        int n = arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            boolean leftOK = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOK = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            if (leftOK && rightOK) {
                return mid;
            } else if (mid < n - 1 && arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            // Otherwise, move left
            else {
                high = mid - 1;
            }
        }
        return 0 ;
    }
}