package day08;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LevelOrder {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public int[] levelOrder1(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<TreeNode>(){{add(root);}};
        ArrayList<Integer> integers = new ArrayList<>();

        while (!list.isEmpty()){
            TreeNode poll = list.poll();
            integers.add(poll.val);
            if (poll.left!=null) list.add(poll.left);
            if (poll.right!=null) list.add(poll.right);

        }

        int[] ints = new int[integers.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i]=integers.get(i);
        }
        return ints;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);l.add(2);l.add(3);l.add(4);

        System.out.println(l.getLast());


    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        LinkedList<TreeNode> l = new LinkedList<TreeNode>(){{add(root);}};
        List<List<Integer>>  list = new ArrayList<>();
        while (!l.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = l.poll();
                if (node==null) break;
                temp.add(node.val);
                if (node.left!=null) l.add(node.left);
                if (node.right!=null) l.add(node.right);
            }
            list.add(temp);
        }
        return list;


    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null) return new ArrayList<>();
        LinkedList<TreeNode> l = new LinkedList<TreeNode>(){{add(root);}};
        List<List<Integer>>  list = new ArrayList<>();
        int flag=1;
        while (!l.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = l.poll();
                if (flag %2 == 0)temp.add(0,node.val);
                else temp.add(node.val);
                if (node.left!=null) l.add(node.left);
                if (node.right!=null) l.add(node.right);
            }
            flag++;
            list.add(temp);
        }
        return list;
    }
}
