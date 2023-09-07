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

//Iterative DFS_Inorder
class Solution {
    public int kthSmallest(TreeNode root, int k) {
    Stack<TreeNode> stack = new Stack<>();
    
    while (root != null || !stack.isEmpty()) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        root = stack.pop();
        // Decrease k since we've visited one element
        k--;

        if (k == 0) {
            break; // Break the loop as we've found the kth smallest element
        }
        root = root.right;
    }
    
    return root.val; // Return the value of the kth smallest element
    }
    
    
    
    
    
    
}