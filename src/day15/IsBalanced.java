package day15;

/**
 * @ClassName IsBalanced
 * @Deacription: 110. 平衡二叉树
 * @Author zzx
 * @Date 2020/8/29 21:01
 **/

public class IsBalanced {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public boolean isBalanced(TreeNode root) {
        return height(root)!=-1;

    }
    public int height(TreeNode root) {
         if (root==null){
             return 0;
         }
        int left = height(root.left);
        int right = height(root.right);

        if (left == -1 || right == -1 || Math.abs(left-right)>1){
            return -1;
        }else{
            return Math.max(left,right)+1;
        }

    }


}
