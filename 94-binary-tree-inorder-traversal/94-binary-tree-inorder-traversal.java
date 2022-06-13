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
    private List<Integer> ls = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return this.ls;
    }
    private void inOrder(TreeNode root){
        if(root==null)
            return;
        else{
            inOrder(root.left);
            this.ls.add(root.val);
            inOrder(root.right);
        }
    }
}