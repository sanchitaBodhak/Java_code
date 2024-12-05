package HashMaps;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class treeNode{
    int val;
    treeNode left;  // denotes left child
    treeNode right;  // denotes right child
    treeNode( int val){ // constructor
        this.val = val;
    }
}
  class Pair{
    treeNode node;
    int level;
    Pair(treeNode node,int level){
        this.node = node;
        this.level = level;
    }
}
public class BinaryTree_TopView {
    public static void topView(treeNode root){
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        int minLevel = Integer.MAX_VALUE;
        int maxLevel = Integer.MIN_VALUE;
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair temp = q.remove();
            treeNode n = temp.node;
            int lvl = temp.level;
            minLevel = Math.min(minLevel,lvl);
            maxLevel = Math.max(maxLevel,lvl);
            if (!map.containsKey(lvl)) map.put(lvl,n.val);
            if (n.left != null)q.add(new Pair(n.left,lvl-1));
            if (n.right != null)q.add(new Pair(n.right,lvl+1));
        }
        for (int i = minLevel; i <= maxLevel ; i++) {
            System.out.print(map.get(i)+"\t");
        }
    }
    public static void main(String[] args) {
        treeNode a = new treeNode(1); // root node
        treeNode b = new treeNode(2);
        treeNode c = new treeNode(3);
        treeNode d = new treeNode(4);
        treeNode e = new treeNode(5);
        treeNode f = new treeNode(6);
        treeNode g = new treeNode(7);
        treeNode x = new treeNode(8);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        g.right = x;
        topView(a);
    }
}
