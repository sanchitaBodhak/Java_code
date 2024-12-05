package Tree;

import java.util.ArrayList;

public class GreaterSumTreeByBST_LT1038 {
    // method-1.......
    public void helper(treeNode root, ArrayList<treeNode> ans) {
        // Base case: if the current node is null, return from this call
        if (root == null) {
            return;
        }

        // Recursive call on the left subtree to process it in order
        helper(root.left, ans);

        // Add the current node to the ans list (in in-order sequence)
        ans.add(root);

        // Recursive call on the right subtree to process it in order
        helper(root.right, ans);
    }

    public treeNode bstToGst(treeNode root) {
        // Initialize an ArrayList to store nodes in in-order sequence
        ArrayList<treeNode> ans = new ArrayList<>();

        // Populate the ans list with in-order traversal nodes
        helper(root, ans);

        // Traverse the list from right to left, updating each node's value
        for (int i = ans.size() - 2; i >= 0; i--) {
            // Update the current node's value by adding the next node's value
            ans.get(i).val += ans.get(i + 1).val;
        }

        // Return the root node, now representing the BST transformed into GST
        return root;
    }
    // end of method 1 ...................................
    //method - 2 ....-------------------------------------------------------
    // Static variable to hold the cumulative sum during the reverse inorder traversal
    static int sum;

    public void reverseinorder(treeNode root) {
        // Base case: if the current node is null, return from this call
        if (root == null) {
            return;
        }

        // Recursively traverse the right subtree (reverse inorder traversal)
        reverseinorder(root.right);

        // Update the current node's value by adding the cumulative sum
        root.val += sum;

        // Update the cumulative sum to the current node's value
        sum = root.val;

        // Recursively traverse the left subtree
        reverseinorder(root.left);
    }

    public  treeNode bstToGst_2(treeNode root) {
        // Initialize the sum to 0 before starting the transformation
        sum = 0;

        // Perform reverse inorder traversal to transform the BST to GST
        reverseinorder(root);

        // Return the root of the transformed tree
        return root;
    }


    public static void main(String[] args) {
        System.out.println("maooo");
    }

}
