package day15;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName InorderTraversal
 * @Deacription: 给定一个二叉树，返回它的中序 遍历
 * @Author zzx
 * @Date 2020/8/29 16:21
 **/

public class InorderTraversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root!=null){
            inorder(res,root);
        }
        return res;
    }
    public void inorder(List<Integer> list,TreeNode root){
        if (root==null){
            return;
        }
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);

    }
}
