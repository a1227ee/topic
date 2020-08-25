package day09;

import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    List<Integer> path=new ArrayList<Integer>();
    public List<List<Integer>> pathSum (TreeNode root, int sum) {
        recur(root,sum);
        return res;
    }
    void recur(TreeNode root, int sum){
        if (root==null) return;
        path.add(root.val);
        sum-=root.val;
        if (sum==0 && root.left==null &&root.right==null){
            res.add(new ArrayList<>(path));
        }
        if (sum<0){
            path.remove(root.val);
            return;
        }
        recur(root.left,sum);
        recur(root.right,sum);
        path.remove(root.val);
    }
}
