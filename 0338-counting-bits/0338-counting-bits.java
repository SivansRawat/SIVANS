class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        // int count=0;
          // int sum =0;
        ans[0] = 0;
        for(int i=1;i<=n;i++){
            ans[i] = Integer.bitCount(i);
            // count++;
        }
        
        return ans;
    }
}