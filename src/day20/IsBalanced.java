package day20;

/**
 * @ClassName IsBalanced
 * @Deacription:
 * @Author zzx
 * @Date 2020/9/4 17:01
 **/

public class IsBalanced {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public boolean isBalanced(TreeNode root) {
        return recur(root)!=-1;
    }
    public int  recur(TreeNode root){
        if (root == null ){
            return 0;
        }
        int recur1 = recur(root.left);
        int recur2 = recur(root.right);

        if (recur1 ==-1 || recur2==-2 || Math.abs(recur1-recur2)>1){
            return -1;
        }else {
            return Math.max(recur1,recur2)+1;
        }

    }
}
