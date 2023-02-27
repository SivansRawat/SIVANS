//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        
        int low = 0 , high = n-2;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if( mid %2 ==0  ) // If at Even index
            {
                // checking for right half
                if(arr[mid] != arr[mid+1]){
                    high = mid-1;
                    
                }
                
                else{
                    low = mid +1;
                    
                }
            }
            
            
            else  // If at odd index
            {
                
                // Checking for Right Half
                if(arr[mid] == arr[mid+1]){
                    high = mid-1;
                }
                
                else{
                    // Checking for Left half 
                    low = mid+1;
                }
            }
        }
        
        
        
        return arr[low];
        
    }
}