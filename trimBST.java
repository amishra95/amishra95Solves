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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        return remove(root, low, high);
        
        
        
     }
    
     public TreeNode remove(TreeNode root, int low, int high){
        
         if(root == null){
            return null; 
        }
         
         if(root.val < low){
           return remove(root.right, low, high);
         }
         
         if(root.val > high){
           return remove(root.left, low, high);
         }
         
         root.left = remove(root.left, low, high);
         root.right = remove(root.right, low, high);
         
    
            return root;
     }
    
   
}
