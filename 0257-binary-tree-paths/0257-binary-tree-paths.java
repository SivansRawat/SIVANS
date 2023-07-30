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
    
    
    
    public List<String> binaryTreePaths(TreeNode root) {
    List<String> arr = new ArrayList<>();
    tree(root, "", arr);
    return arr;
}

public void tree(TreeNode root, String st, List<String> arr) {
    if (root == null) return;

    st += root.val;

    if (root.left == null && root.right == null) {
        arr.add(st);
        return;
    }

    st += "->";
    if (root.left != null) tree(root.left, st, arr);
    if (root.right != null) tree(root.right, st, arr);
}

}