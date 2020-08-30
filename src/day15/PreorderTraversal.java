package day15;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PreorderTraversal
 * @Deacription: 144. 二叉树的前序遍历
 * @Author zzx
 * @Date 2020/8/29 23:50
 **/

public class PreorderTraversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return arr;
    }
    List<Integer> arr=new ArrayList<Integer>();
    public void preorder(TreeNode root){
        if (root==null) return;
        arr.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
