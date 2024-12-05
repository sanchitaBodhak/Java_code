package Tree;

class treeNode{
    int val;
    treeNode left;  // denotes left child
    treeNode right;  // denotes right child
    treeNode( int val){ // constructor
        this.val = val;
    }
}
public class TreeImplementation {
    private static void display( treeNode root){  // In-Order traversal
        if (root == null){  // base case
            return;
        }
        System.out.print(root.val+ "\t");  // printing value
        display(root.left);   // left subtree
        display(root.right);  // right subtree

    }
    private static int sum( treeNode root){  // In-Order traversal
        if (root == null){  // base case
            return 0;
        }
        int s = root.val + sum(root.left) + sum(root.right);
        return s;
    }
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
    public static  int level( treeNode root) {
        if (root == null) {
            return 0;
        }
        int level = 1 + Math.max(level(root.right),level(root.left));
        return level;
    }
    public static void main(String[] args) {
        treeNode a = new treeNode(10); // new nodes creation
        treeNode b = new treeNode(20);
        treeNode c = new treeNode(30);
        treeNode d = new treeNode(40);
        treeNode e = new treeNode(50);
        treeNode f = new treeNode(60);
        treeNode g = new treeNode(45);
        treeNode h = new treeNode(89);

       a.left = b; a.right = c;
       b.left = d; b.right = e;
       c.right = f;
       f.right = g;
       g.left = h;
        System.out.println(a.left.left.val);
        display(a);
        System.out.println();
        display(a);
        System.out.println();
        System.out.println(sum(a));
        System.out.println(max(a));
        System.out.println(size(a));
        System.out.println(level(a));

    }
}
