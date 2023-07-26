class TreeAncestor {
    int[][] dp; // dp[i][k] represents the k-th ancestor of node i
    int maxK; // Maximum k value allowed

    public TreeAncestor(int n, int[] parent) {
        maxK = (int) (Math.log(n) / Math.log(2)) + 1;
        dp = new int[n][maxK];

        // Initialize the dp table
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        // Fill dp table for k=0 (immediate parent)
        for (int i = 0; i < n; i++) {
            dp[i][0] = parent[i];
        }

        // Fill dp table for k > 0 using dynamic programming
        for (int k = 1; k < maxK; k++) {
            for (int i = 0; i < n; i++) {
                if (dp[i][k - 1] != -1) {
                    dp[i][k] = dp[dp[i][k - 1]][k - 1];
                }
            }
        }
    }

    public int getKthAncestor(int node, int k) {
        for (int i = 0; i < maxK; i++) {
            if (((k >> i) & 1) == 1) {
                node = dp[node][i];
                if (node == -1) {
                    break; // If there is no k-th ancestor, return -1
                }
            }
        }

        return node;
    }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */