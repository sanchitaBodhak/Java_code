package Tree;

public class productOfNonZeroElement
{
    public static int prod( treeNode root){
        int p;
        if ( root == null){
            return 1;
        }
        if (root.val == 0){
             p = 1 * prod(root.left) * prod(root.right);
            return p;
        }else {
             p = root.val * prod(root.left) * prod(root.right);
            return p;
        }
    }

    public static void main(String[] args) {
        treeNode a = new treeNode(1); // root node
        treeNode b = new treeNode(4);
        treeNode c = new treeNode(0);
        treeNode d = new treeNode(0);
        treeNode e = new treeNode(6);
        treeNode f = new treeNode(2);
        treeNode g = new treeNode(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        System.out.println(prod(a));

    }
}
