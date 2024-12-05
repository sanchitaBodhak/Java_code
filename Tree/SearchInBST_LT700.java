package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SearchInBST_LT700 {
    // used bfs for printing but it also can be any traversal
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
    public static treeNode searchBST(treeNode root, int val) {
        if( root== null) return null;
        else if( root.val > val) return searchBST( root.left,val);
        else if( root.val < val) return searchBST( root.right,val);
        else return root;
    }

    public static void main(String[] args) {
        treeNode a = new treeNode(10);
        treeNode b = new treeNode(5);
        treeNode c = new treeNode(15);
        treeNode d = new treeNode(3);
        treeNode e = new treeNode(8);
        treeNode f = new treeNode(12);
        treeNode g = new treeNode(17);
        a.left = b; a.right = c ;
        b.left = d; b.right = e ;
        c.left = f; c.right = g ;
         treeNode x = searchBST(a,15);
        BFS(x);


    }
}
