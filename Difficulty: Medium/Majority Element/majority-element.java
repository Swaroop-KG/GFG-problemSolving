//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {  
                ele = nums[i];
                count = 1;
            } else if (nums[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele) {
                count1++;
            }
        }

        if (count1 > nums.length / 2) { 
            return ele;
        }
        return -1; 
    }
}

