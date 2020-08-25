package day09;

public class VerifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        recur(postorder,0,postorder.length-1);
        return true;
    }
    public boolean recur(int[] postorder,int i,int j){
        if (i>j) return true;
        int p=i;
        while (postorder[p]<postorder[j]) p++;
        int m=p;
        while (postorder[p]>postorder[j])p++;
        return p==j && recur(postorder,i,m-1) && recur(postorder,m,j-1);
    }
}
