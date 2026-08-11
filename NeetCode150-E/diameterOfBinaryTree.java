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
    private int sol = 0;

    public int diameterOfBinaryTree(TreeNode root){
        if(root == null){
            return 0;
        }
       maxDepth(root);
        return sol;   
        
    }

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    sol = Math.max(sol, left+right);

    return Math.max(left, right)+1;

    }

    

    
}
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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        int currentDiameter = height(root.left) + height(root.right);

        return Math.max(currentDiameter, Math.max(rightDiameter, leftDiameter));
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
