package Tree;

import java.util.ArrayList;
import java.util.List;

public class rightSideView_LT199 {
    public static int level(treeNode root) {
        if (root == null) {
            return 0;
        }
        int level = 1 + Math.max(level(root.right), level(root.left));
        return level;
    }

    public static void preorder(treeNode root, int level, List<Integer> ans) {
        if (root == null)
            return;
        ans.set(level, root.val);
        preorder(root.left, level + 1, ans);
        preorder(root.right, level + 1, ans);
    }

    public static List<Integer> rightSideView(treeNode root) {
        List<Integer> ans = new ArrayList<>();
        int n = level(root);
        for (int i = 0; i < n; i++) {
            ans.add(0);
        }
        preorder(root, 0, ans);
        return ans;
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
        List<Integer> arr = rightSideView(a);
        System.out.println(arr);
    }
}
