package Tree;

public class Traversal {
    public static void preorder( treeNode root){
        if (root==null){
            return;
        }
        System.out.print(root.val +"\t");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder( treeNode root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val +"\t");
        inorder(root.right);
    }
    public static void postorder( treeNode root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val +"\t");
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
        preorder(a);
        System.out.println();
        postorder( a);
        System.out.println();
        inorder(a);
    }
}
