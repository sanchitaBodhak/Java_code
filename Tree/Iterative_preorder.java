package Tree;

import java.util.Stack;

public class Iterative_preorder {
    public static void preorder( treeNode root){
        Stack< treeNode> st = new Stack<>();
        if( root != null){
            st.push( root);
        }
        while (st.isEmpty() == false){
            treeNode top = st.pop();
            System.out.print(top.val +"\t");
            if (top.right != null) st.push(top.right);
            if (top.left != null) st.push(top.left);
        }
    }
    public static void main(String[] args) {

        treeNode a = new treeNode(1); // root node
        treeNode b = new treeNode(4);
        treeNode c = new treeNode(0);
        treeNode d = new treeNode(0);
        treeNode e = new treeNode(6);
        treeNode f = new treeNode(2);
        treeNode g = new treeNode(5);
        treeNode x = new treeNode(69);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        g.right = x;
        preorder(a);
    }
}
