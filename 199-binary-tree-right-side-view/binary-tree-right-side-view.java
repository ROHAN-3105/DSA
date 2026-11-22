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
    class Pair{
        TreeNode node;
        int hd;
        Pair(TreeNode node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        if(root==null) return arr;
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Pair p=q.poll();
                TreeNode node=p.node;
                int hd=p.hd;

                if(i==n-1){
                    arr.add(node.val);
                }
                if(node.left!=null){
                    q.offer(new Pair(node.left,hd-1));
                }
                if(node.right!=null){
                    q.offer(new Pair(node.right,hd+1));
                }


            }

        }
        return arr;
        
    }
}