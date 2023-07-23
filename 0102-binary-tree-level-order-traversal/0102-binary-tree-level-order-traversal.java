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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> wrapList = new ArrayList<>(); // Use List interface for compatibility

        if (root == null)
            return wrapList;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> currentLevel = new ArrayList<>(); // Create a list for the current level's nodes

            for (int i = 0; i < levelNum; i++) {
                TreeNode current = queue.poll();
                currentLevel.add(current.val); // Add the node value to the current level's list

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            
            wrapList.add(currentLevel); // Add the current level's list to the result
        }

        return wrapList;
        
    }
}