package day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LevelOrder
 * @Deacription:
 * @Author zzx
 * @Date 2020/8/29 17:25
 **/

public class LevelOrder {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    List<List<Integer>> lists=new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null) return lists;
        sort(root);
        return lists;
    }
    public void sort(TreeNode root){
        LinkedList<TreeNode> link=new LinkedList<TreeNode>();
        link.add(root);
        while (link.size()!=0){
            int size = link.size();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i=0;i<size;i++){
                TreeNode pop = link.poll();
                if (pop.left!=null)link.add(pop.left);
                if (pop.right!=null)link.add(pop.right);
                list.add(root.val);
            }
            lists.add(list);
        }
    }
}
