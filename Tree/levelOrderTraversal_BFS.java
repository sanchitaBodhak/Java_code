package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal_BFS {
    // method - 1 .........using queue
    public static void BFS( treeNode root){
        Queue<treeNode> q = new LinkedList<>();
        if (root==null) return;
        q.add(root);
        while (q.isEmpty() == false){
            treeNode temp = q.remove();
              System.out.print(temp.val + "\t");
            if (temp.left != null){
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }
    // end of method 1 .......
    // now method 2 ..... using pair class and queue
    public static class pair{ // pair is a data structure consists of a node and level
        treeNode node;
        int level;
        pair(treeNode node, int level){ // constructor
            this.node = node;
            this.level = level;
        }
        public static void lvlorder( treeNode root){
            Queue<pair> t = new LinkedList<>(); // every element of this queue is a pair
            int prelvl = 0; // this variable is main to give the extra line
            if (root==null) return;
            t.add(new pair(root,0));
            while (t.isEmpty() == false){
                pair var = t.remove();  // removes root from tree & prints
                treeNode temp = var.node;
                int level = var.level;
                if(level != prelvl){
                    System.out.println(); // gives new line for each level
                    prelvl++;
                }
                System.out.print(temp.val + "\t"); // printing
                if (temp.left != null){
                    t.add(new pair(temp.left,level+1));
                }
                if (temp.right != null) {
                    t.add(new pair(temp.right, level+1));
                }
            }
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
        treeNode x = new treeNode(69);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        g.right = x;
        //BFS(a);
        pair.lvlorder(a);
    }
}
