package Tree;

public class pathSum_I_LT112 {
    public boolean helper(treeNode root, int target, int sum) {
        // Base case: If the current node is null, return false (no path found)
        if (root == null) return false;

        // Add the current node's value to the sum
        sum += root.val;

        // Check if we are at a leaf node (no children)
        if (root.left == null && root.right == null) {
            // If the sum equals the target at the leaf, return true (path found)
            if (sum == target) return true;
            else return false;  // Otherwise, return false
        }

        // Recursively check both left and right subtrees for a valid path
        return (helper(root.left, target, sum) || helper(root.right, target, sum));
    }

    public boolean hasPathSum(treeNode root, int targetSum) {
        // Start the helper function with an initial sum of 0
        return helper(root, targetSum, 0);
    }


    public static void main(String[] args) {
        System.out.println("mummy" );
    }
}
