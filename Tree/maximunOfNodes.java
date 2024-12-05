package Tree;

public class maximunOfNodes {
    public static int max( treeNode root){
        if (root==null){
            return Integer.MIN_VALUE;
        }
        int a = root.val;
        int b = max(root.left);
        int c = max( root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static  int size( treeNode root){
        if (root == null){
            return 0;
        }
        int size = 1 + size(root.left)+ size(root.right);
        return size;
    }

    public static void main(String[] args) {
        treeNode a = new treeNode(10); // new nodes creation
        treeNode b = new treeNode(20);
        treeNode c = new treeNode(30);
        treeNode d = new treeNode(90);
        treeNode e = new treeNode(50);
        treeNode f = new treeNode(60);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        System.out.println(max(a));
        System.out.println(size(b));
    }
}
