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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ls = new ArrayList<>();
        if(root==null)
            return ls;
        st.push(root);
        
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            if(curr!=null){
                ls.add(0,curr.val);
            }
            if(curr.left!=null)
                st.push(curr.left);
            if(curr.right!=null)
                st.push(curr.right);
    
            }
        return ls;
        }
        
    }         
        
