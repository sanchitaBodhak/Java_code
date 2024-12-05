package Tree;

import java.util.Stack;

public class Iterative_inorder {
    public static void inorder( treeNode root){
        Stack<treeNode> st = new Stack<>();
        treeNode temp = root;
        while (true){
            if (temp != null){
                st.push(temp);
                temp = temp.left;
            }
            else {
                if (st.isEmpty()) break;
                treeNode top = st.pop();
                System.out.print(top.val +"\t");
                temp = top.right;
            }
        }
    }
    public static void main(String[] args) {
        treeNode a = new treeNode(1); // root node
        treeNode b = new treeNode(2);
        treeNode c = new treeNode(3);
        treeNode d = new treeNode(4);
        treeNode e = new treeNode(5);
        treeNode f = new treeNode(6);
        treeNode g = new treeNode(7);
        treeNode x = new treeNode(8);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        g.right = x;
        inorder(a);
    }
}
