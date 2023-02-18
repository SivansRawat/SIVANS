//{ Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().minOperations(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java





class Solution {
    int minOperations(int[] arr, int n, int k) {
        
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            pq.add(arr[i]);
        }
        int cnt=0;
        while(pq.peek()<k && pq.size()>1){
            cnt++;
            int first=pq.poll();
            int second=pq.poll();
            pq.add(first+second);
        }
        if(pq.peek()<k) return -1;
        return cnt;
        
        
        
    }
}
       
        