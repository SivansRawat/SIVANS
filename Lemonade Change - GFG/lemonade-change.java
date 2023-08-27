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
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        
        int count[] = {0,0,0}; 
       if(bills[0]  == 5){
           count[0] += 1;
           int total = 5;
           int n = bills.length; 
           for(int i = 1 ; i<n; i++){
               int pre = bills[i];
               if(pre == 5){
                   count[0] += 1;
                   total += 5; 
               }else{
                   if(pre==10){
                       count[1] += 1;
                       total += pre;
                       pre -= 5;
                       if(count[0] > 0){
                           total -= pre;
                           count[0] -= 1;
                       }else{
                          return false;
                       }

                   }else{
                       count[2] += 1;
                       pre -= 5;
                       if(count[0] > 0 && count[1]>0){
                           total -= pre;
                           count[0] -= 1;
                           count[1] -= 1;
                       }else if(count[0] > 2){
                           total -= pre;
                           count[0] -= 3;
                       }else{
                           return false;
                       }
                   } 
               }
           }
       }else{
           return false;
       }

       return true; 
    }
}
