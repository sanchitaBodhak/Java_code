package Tree;

public class InsertBST {
    // Helper method to recursively insert a new value into the BST
    public void helper(treeNode root, int val) {
        // If the current node is null, return (base case)
        if (root == null) return;

        // If the value to be inserted is less than the current node's value
        if (root.val > val) {
            // Check if the left child is null; if so, insert the new value here
            if (root.left == null) {
                root.left = new treeNode(val);
                return;
            }
            // Otherwise, recurse on the left child
            helper(root.left, val);
        } else {
            // If the value to be inserted is greater than or equal to the current node's value
            // Check if the right child is null; if so, insert the new value here
            if (root.right == null) {
                root.right = new treeNode(val);
                return;
            }
            // Otherwise, recurse on the right child
            helper(root.right, val);
        }
    }

    // Main method to insert a value into the BST
    public treeNode insertIntoBST(treeNode root, int val) {
        // Handle the case where the tree is initially empty
        if (root == null) {
            return new treeNode(val); // Create a new node as the root and return it
        }
        // Otherwise, use the helper function to insert the value
        helper(root, val);
        return root; // Return the root of the modified tree
    }

    public static void main(String[] args) {
        System.out.println("heheeh");
    }
}
