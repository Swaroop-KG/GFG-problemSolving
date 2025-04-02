//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int largest=0;
        int secondlargest=0;
        for(int i=0;i<arr.length;i++){
         if(arr[i]>largest){
             secondlargest= largest;
             largest=arr[i];
             
         }
         else if(arr[i]>secondlargest && arr[i]!=largest){
             secondlargest=arr[i];
         }
        }
        if(secondlargest==0){
            return -1;
        }
        return secondlargest;
    }
}