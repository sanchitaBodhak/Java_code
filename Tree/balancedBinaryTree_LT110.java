package Tree;

public class balancedBinaryTree_LT110 {
    static boolean ans;
    public static int level(treeNode root) {
        if (root == null) {
            return 0;
        }
        int left = level( root.left);
        int right = level(root.right);
        int level = 1 + Math.max(left, right);
        return level;
    }
    public boolean isBalanced(treeNode root) {
        int difference = Math.abs(level(root.left)-level(root.right));
        if( difference > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        System.out.println("bobaaaa");
    }
}
