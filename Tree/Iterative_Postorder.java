package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Iterative_Postorder {
    public static void postOrder( treeNode root) {
        Stack<treeNode> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        if (root != null) {
            st.push(root);
        }
        while (st.isEmpty() == false) {
            treeNode top = st.pop();
            arr.add(top.val);
            if (top.left != null) st.push(top.left);
            if (top.right != null) st.push(top.right);
        }
            Collections.reverse(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+"\t");
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
         postOrder(a);

    }
}
