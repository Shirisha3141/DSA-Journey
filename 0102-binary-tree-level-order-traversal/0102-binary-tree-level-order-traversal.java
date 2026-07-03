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
        List<List<Integer>> l=new ArrayList<>();
        if(root==null) return l;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> li=new ArrayList<>();
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode f=q.remove();
                li.add(f.val);
                if(f.left!=null) q.add(f.left);
                if(f.right!=null) q.add(f.right);
            }
            l.add(li);
        }
        return l;
    }
}