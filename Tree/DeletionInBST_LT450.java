package Tree;

public class DeletionInBST_LT450 {
    public treeNode iop(treeNode root) {
        // Find the in-order predecessor (rightmost node in the left subtree)
        treeNode temp = root.left;
        while (temp.right != null) temp = temp.right;
        return temp;
    }

    public treeNode parent(treeNode root, treeNode pred) {
        // Check if the root is the parent of the predecessor (pred)
        if (root.left == pred || root.right == pred) return root;

        // Move through the left subtree to find the parent of pred
        treeNode temp = root.left;
        while (temp.right != pred) temp = temp.right;
        return temp;
    }

    public treeNode deleteNode(treeNode root, int key) {
        // If root is null, there's no node to delete, so return null
        if (root == null)
            return null;

        // If the current node matches the key, handle deletion cases
        if (root.val == key) {
            // Case 1: Node is a leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: Node has only one child
            else if (root.left == null || root.right == null) {
                // If there is no left child, return the right child
                if (root.left == null) return root.right;
                else return root.left; // If there is no right child, return the left child
            }
            // Case 3: Node has two children
            else {
                // Find the in-order predecessor and its parent
                treeNode pred = iop(root);
                treeNode predParent = parent(root, pred);

                // If root is the parent of pred
                if (root == predParent) {
                    pred.right = root.right;
                    return pred;
                }

                // Reattach pred's left subtree to its parent
                predParent.right = pred.left;

                // Set pred's left and right pointers to root's left and right
                pred.left = root.left;
                pred.right = root.right;

                // Return pred as the new root
                return pred;
            }

            // If the key is smaller, search in the left subtree
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
            // If the key is larger, search in the right subtree
        } else {
            root.right = deleteNode(root.right, key);
        }

        // Return the root after deletion adjustments
        return root;
    }

    public static void main(String[] args) {
        System.out.println("jkfhjfvhj");
    }

}
