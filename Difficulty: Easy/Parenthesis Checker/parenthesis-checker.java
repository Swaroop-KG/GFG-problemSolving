//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.* ;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        int t = sc.nextInt();

        while (t-- > 0) {
            // reading the string
            String st = sc.next();

            // calling ispar method of Paranthesis class
            // and printing "balanced" if it returns true
            // else printing "not balanced"
            if (new Solution().isBalanced(st) == true)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack <Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c =='(')
            stack.push(')');
           else if(c=='[')
            stack.push(']');
           else if(c=='{')
            stack.push('}');
            else {
                if(stack.isEmpty() || stack.peek()!=c){
                return false;
                }
                stack.pop();
            }
        
        }
        return stack.isEmpty();
    }
}
