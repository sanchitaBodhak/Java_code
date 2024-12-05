package Tree;

public class pathSum_III_LT_437 {
    public int helper(treeNode root, long target) {
        // Base case: If the current node is null, return 0
        if (root == null) return 0;

        int count = 0;

        // Decrement the target by the current node's value
        target = target - root.val;

        // If the target reaches 0, increment count as this is a valid path
        if (target == 0) {
            count++;
        }
        // Recursively call helper for the left and right subtrees and add their results to count
        count += helper(root.left, target) + helper(root.right, target);

        // Return the total count of valid paths found
        return count;
    }

    public int pathSum(treeNode root, int targetSum) {
        // If the tree is empty, return 0 as there are no paths
        if (root == null) return 0;

        // Calculate the total paths by calling helper on the current node,
        // then move to left and right subtrees and repeat the process
        return helper(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }


    public static void main(String[] args) {
        System.out.println(" hiii");
    }
}
