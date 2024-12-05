package Tree;

public class sumOfNodes {
    private static int sum( treeNode root){  // In-Order traversal
        if (root == null){  // base case
            return 0;
        }
        int s = root.val + sum(root.left) + sum(root.right);
        return s;
    }

    public static void main(String[] args) {
        treeNode a = new treeNode(10); // new nodes creation
        treeNode b = new treeNode(20);
        treeNode c = new treeNode(30);
        treeNode d = new treeNode(40);
        treeNode e = new treeNode(50);
        treeNode f = new treeNode(60);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        System.out.println(sum(a));
    }
}
