package Tree;

import java.util.Scanner;

public class printing_nth_level {

    public static void nth_level(treeNode root, int level, int n){
        if (root==null){
            return;
        }if( level == n)
        System.out.print(root.val +"\t");
        nth_level(root.left, level+1, n);
        nth_level(root.right,level+1 , n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" tell which level wanted to print");
        int n = sc.nextInt();
        treeNode a = new treeNode(1); // root node
        treeNode b = new treeNode(4);
        treeNode c = new treeNode(0);
        treeNode d = new treeNode(0);
        treeNode e = new treeNode(6);
        treeNode f = new treeNode(2);
        treeNode g = new treeNode(5);
        treeNode x = new treeNode(69);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        g.right = x;

        nth_level(a,0,n);
    }
}
