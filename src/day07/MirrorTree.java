package day07;

public class MirrorTree {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public TreeNode mirrorTree(TreeNode root) {
        if (root==null) return null;
        TreeNode right = root.right;
        root.right=mirrorTree(root.left);
        root.left=mirrorTree(right);
        return root;
    }
}
