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
    public int minimumOperations(TreeNode root) {
        int c=0;
        List<List<Integer>> l=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int k=0;
        while(!q.isEmpty()){
            List<Integer> li=new ArrayList<>();
            int s=q.size();
            int[] a=new int[s];
            for(int i=0;i<s;i++){
                TreeNode f=q.poll();
                a[i]=f.val;
                if(f.left!=null) q.add(f.left);
                if(f.right!=null) q.add(f.right);
            }
           /* for(int i:a){
                System.out.print(i+" ");
            }
            */
            c+=sol(a);
        }
        return c;
    }
    int sol(int[] original){
        int swaps = 0;
        int[] target = original.clone();
        Arrays.sort(target);
        Map<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < original.length; i++) {
            pos.put(original[i], i);
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != target[i]) {
                swaps++;
                int curPos = pos.get(target[i]);
                pos.put(original[i], curPos);
                original[curPos] = original[i];
            }
        }
        return swaps;
    }
}