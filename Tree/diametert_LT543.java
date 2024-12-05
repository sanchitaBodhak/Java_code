package Tree;

public class diametert_LT543 {
    // Static variable to store the maximum diameter found so far.
    static int maxdia;

    public int levels(treeNode root) {
        // Base case: if the current node is null, the height is 0.
        if (root == null) {
            return 0;
        }
        // Recursively calculate the height of the left subtree.
        int left = levels(root.left);

        // Recursively calculate the height of the right subtree.
        int right = levels(root.right);

        // Calculate the diameter at the current node (left height + right height).
        int dia = left + right;

        // Update the maximum diameter if the current one is larger.
        maxdia = Math.max(dia, maxdia);

        // Return the height of the current node (1 + maximum of left or right subtree height).
        int level = 1 + Math.max(left, right);

        return level;
    }

    public int diameterOfBinaryTree(treeNode root) {
        // Initialize the maximum diameter to 0.
        maxdia = 0;

        // Calculate the levels (height) and update the diameter during the traversal.
        levels(root);

        // Return the maximum diameter found.
        return maxdia;
    }

    public static void main(String[] args) {
        System.out.println("hii");
    }

}
