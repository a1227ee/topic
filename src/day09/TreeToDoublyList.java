package day09;

public class TreeToDoublyList {

    public Node treeToDoublyList(Node root) {
        if (root==null) return null;
        recur(root);
        head.left=pre;
        pre.right=head;
        return head;
    }
    Node pre;
    Node head;
    void recur(Node root){
        if (root==null)return;
        recur(root.left);
        if (pre==null)head=root;
        else pre.right=root;
        pre=root;
        recur(root.right);
    }

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }
    }
}
