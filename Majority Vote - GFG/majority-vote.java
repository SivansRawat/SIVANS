//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] nums = IntArray.input(br, n);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.Solve(n, nums);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> Solve(int n, int[] nums) {
        // code here
        
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i =0 ;i <n;i++){
            
            if(map.containsKey(nums[i]) == false){
                map.put(nums[i] , 0);
            }
            
            
            if(map.containsKey(nums[i]) == true){
                map.put(nums[i] , map.get(nums[i]) + 1);
            }
            
            
            if((map.get(nums[i])) > (n/3)  && map.get(nums[i]) <= (n/3)+1){
                arrList.add(nums[i]);
        
            }
        }
        
        
        
        if(arrList.size() == 0){
            arrList.add(-1);
            return arrList;
            
        }
        
        else{
            
            return arrList;
        }
        
    }
}
        
