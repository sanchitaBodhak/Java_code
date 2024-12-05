package Tree;

public class ConstructBSTfromSortedArray_LT108 {
    public treeNode helper(int[] arr, int low, int high) {
        // Base case: If high equals low, the range is empty, so return null
        if (high == low) return null;

        // Find the middle element in the current range to be the root of this subtree
        int mid = (low + high) / 2;

        // Create a new TreeNode with the middle element
        treeNode root = new treeNode(arr[mid]);

        // Recursively build the left subtree with the left half of the current range
        root.left = helper(arr, low, mid);

        // Recursively build the right subtree with the right half of the current range
        root.right = helper(arr, mid + 1, high);

        // Return the root node of the subtree
        return root;
    }

    public treeNode sortedArrayToBST(int[] nums) {
        // Get the size of the input array
        int n = nums.length;

        // Call helper function to convert the sorted array to a balanced BST
        return helper(nums, 0, n);
    }

    public static void main(String[] args) {
        System.out.println("hjdjf");
    }

}
