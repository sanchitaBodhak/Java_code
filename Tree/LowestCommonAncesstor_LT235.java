package Tree;

public class LowestCommonAncesstor_LT235 {
    public treeNode helper(treeNode root, treeNode p, treeNode q) {
        // Base case: If the current node is null, return null
        if (root == null) return root;

            // Check if both p and q are on the left side of the current root
        else if (p.val < root.val && q.val < root.val) {
            // If true, move left to find the common ancestor
            return helper(root.left, p, q);
        }

        // Check if both p and q are on the right side of the current root
        else if (p.val > root.val && q.val > root.val) {
            // If true, move right to find the common ancestor
            return helper(root.right, p, q);
        }

        // If p and q are on different sides or one of them is the root, root is the lowest common ancestor
        // else if( (p.val > root.val && q.val < root.val) || (p.val < root.val && q.val > root.val)){
        //     return root;
        // }
        return root;
    }

    public treeNode lowestCommonAncestor(treeNode root, treeNode p, treeNode q) {
        // Call the helper function to find the lowest common ancestor
        return helper(root, p, q);
    }

    public static void main(String[] args) {
        System.out.println(" heheheeheheheheh");
    }

}
