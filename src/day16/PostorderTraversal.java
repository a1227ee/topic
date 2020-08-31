package day16;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PostorderTraversal
 * @Deacription:  二叉树的后序遍历
 * @Author zzx
 * @Date 2020/8/30 17:37
 **/

public class PostorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root==null) return list;
        postorder(root);
        return list;
    }

    public void postorder(TreeNode root){
        if (root==null) return;
        postorder(root.left);
        postorder(root.right);
        list.add(root.val);
    }

}
