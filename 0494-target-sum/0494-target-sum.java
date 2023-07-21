class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int N = nums.length;
        int sum = 0;
        for (int i : nums) sum += i;
        if ((target + sum) % 2 != 0) return 0;
        int t = (target + sum) / 2;
        
        if(t<0) return 0;
        // REDUCED: find count of subset with sum equal to t
        int[][] dp = new int[N + 1][t + 1];
        dp[0][0] = 1;

        for (int i = 1; i < N + 1; i++) {
            for (int j = 0; j < t + 1; j++) {
                if (nums[i - 1] <= j)
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - nums[i - 1]]) % 1000000007;
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[N][t];
        
    }
}