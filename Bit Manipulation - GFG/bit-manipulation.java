//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int i = sc.nextInt();

            Solution obj = new Solution();
            obj.bitManipulation(n, i);
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        
        
        // take reference from  Bit Masking
        
        int get = (num & (1<<(i-1)))>> (i-1); //  first find mask and then AND it with original number
        
        int set = num | (1<<(i-1)); // first find mask and then use OR operator with number
        
        int clear = num & ~(1<<(i-1)); // first find mask and the XOR it and then use AND operator with original number 
        
        System.out.print(get+" "+set+" " + clear);
        
    }
}
