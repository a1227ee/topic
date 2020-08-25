package day07;

import day02.BuildTree;

public class SubStructure {
    public boolean isSubStructure(BuildTree.TreeNode A, BuildTree.TreeNode B) {
        if (A==null || B==null) return false;
        return judge(A,B)||judge(A.left,B)||judge(A.right,B);
    }

    public boolean judge(BuildTree.TreeNode a, BuildTree.TreeNode b){
        return (a==null|| b==null)?(b==null) : (a.val==b.val) && judge(a.left,b.left) && judge(a.right, b.right);
    }
}
