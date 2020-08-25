package day07;

public class Symmetric {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public boolean isSymmetric(TreeNode root) {
        if (root==null)return true;
        return recur(root.left,root.left);
    }
    public boolean recur(TreeNode left,TreeNode right){
        if (left==null && right==null )return true;
        if (left==null || right==null ) return  false;
        return left.val==right.val?recur(left.left,right.right) && recur(right.left,left.right) :false;

    }
}
