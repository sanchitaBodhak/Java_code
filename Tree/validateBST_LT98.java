package Tree;

import java.util.ArrayList;
import java.util.List;

public class validateBST_LT98 {
    public static void helper( treeNode root , List<Integer> ans){
        if (root==null){
            return;
        }
        helper(root.left , ans);
        ans.add(root.val);
        helper(root.right, ans);
    }

    public static List<Integer> inorderTraversal(treeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    public static boolean isValidBST(treeNode root) {
        List<Integer> arr = inorderTraversal(root);
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) >= arr.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        treeNode a = new treeNode(10);
        treeNode b = new treeNode(5);
        treeNode c = new treeNode(15);
        treeNode d = new treeNode(3);
        treeNode e = new treeNode(8);
        treeNode f = new treeNode(12);
        treeNode g = new treeNode(17);
        a.left = b; a.right = c ;
        b.left = d; b.right = e ;
        c.left = f; c.right = g ;
        System.out.println(isValidBST(a));
    }
}
