/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    
    
    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        return dfs(root, 0);
    }

    public boolean dfs(TreeNode node, int currSum){
        if(node == null){
            return false;
        }
        if(node.left == null && node.right == null){
            return target == currSum + node.val;
        }
        boolean left = dfs(node.left, currSum + node.val);
        boolean right = dfs(node.right, currSum + node.val);
        return left || right;
    }
}