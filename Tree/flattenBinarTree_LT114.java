package Tree;

import java.util.List;
import java.util.ArrayList;

public class flattenBinarTree_LT114 {
    // Helper function to perform preorder traversal and collect nodes in a list
    public void helper(treeNode root, List<treeNode> ans) {
        // Base case: if the node is null, return
        if (root == null) {
            return;
        }
        // Add the current node to the list
        ans.add(root);
        // Recursively traverse the left subtree
        helper(root.left, ans);
        // Recursively traverse the right subtree
        helper(root.right, ans);
    }

    // Main function to flatten the binary tree
    public void flatten(treeNode root) {
        // Initialize a list to store nodes in preorder
        ArrayList<treeNode> ans = new ArrayList<>();
        // Fill the list with nodes in preorder by calling helper
        helper(root, ans);

        // Loop through the list to rearrange nodes to form a linked list
        for (int i = 0; i < ans.size() - 1; i++) {
            // Set the left pointer of the current node to null
            ans.get(i).left = null;
            // Set the right pointer of the current node to the next node in the list
            ans.get(i).right = ans.get(i + 1);
        }
        // The last node in the list will have right as null (end of linked list)
    }

    public static void main(String[] args) {
        System.out.println("hiii");
    }

}
