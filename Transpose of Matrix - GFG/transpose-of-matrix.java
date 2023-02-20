//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
import java.lang.*;

class GFG
{
    public static void main (String[] args)throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int a[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    a[i][j] = Integer.parseInt(st[k++]);

            Solution ob = new Solution();
            ob.transpose(a, n);
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n;j++)
                    System.out.print(a[i][j] + " ");
            
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find transpose of a matrix.
    static void transpose(int matrix[][], int n)
    {
        // code here
          int rows = matrix.length;
        int cols = matrix[0].length;
        int m = n-1;
        // HashSet<Integer> set= new HashSet<>();
        
        
        // for(int i=0;i<rows;i++) {
        //     for(int j=0;j<cols;j++) {
        //         if(!set.contains(i+j)){
        //             set.add(i+j);
                    
        //         }
        //     }
        // }
                
                
               
        
        
        
         for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                // set.add(i+j);
                if(i<=j){
                    int a = matrix[i][j];
                    // System.out.print(a);
                    int b = matrix[j][i];
                    matrix[i][j]= b;
                    matrix[j][i]= a;
                    // set.remove(i+j);
                    
                }
               
                
                // matrix[i][j] = matrix[j][i];
            }
        }
        
        
    }
}