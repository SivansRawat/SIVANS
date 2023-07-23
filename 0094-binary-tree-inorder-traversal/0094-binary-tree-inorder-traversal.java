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
     private List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        // Inorder means left root right 
       if(root==null) {
            return ans;
        }
        inorderTraversal(root.left); // left    recursion
        ans.add(root.val);   // root 
        inorderTraversal(root.right);  // right   recursion 
        return ans;
        
    }
}