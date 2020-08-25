package day02;

import java.util.HashMap;
import java.util.Map;

public class BuildTree {

     // Definition for a binary tree node.
     public class TreeNode {
         public int val;
         public TreeNode left;
         public TreeNode right;
         public TreeNode(int x) { val = x; }
      }
      //前序遍历 preorder = [3,9,20,15,7]
      //中序遍历 inorder  = [9,3,15,20,7]
    int[] pre ;
    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        if (length==0){
            return null;
        }
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        pre=preorder;

        TreeNode treeNode = get(0, 0, length - 1);
        return treeNode;

    }
    public TreeNode get(int pre_start, int in_left,int in_right) {
        if (in_left>in_right){
            return null;
        }
        TreeNode treeNode = new TreeNode(pre[pre_start]);
        Integer i = map.get(pre[pre_start]);
        treeNode.left=get(pre_start+1,in_left,i-1);
        treeNode.right=get(pre_start+i-in_left+1,i+1,in_right);
        return treeNode;
    }
}
