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
    
    public TreeNode tree( int [] ar,int left,int right)
    {
        int mid=left+(right-left)/2;
      if(left>right)
          return null;
        TreeNode root= new  TreeNode(ar[mid]); 
        root.left=tree(ar,left,mid-1);
        root.right=tree(ar,mid+1,right);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        return tree(nums,0,nums.length-1);
        
    }
}