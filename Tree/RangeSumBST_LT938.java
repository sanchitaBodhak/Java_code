package Tree;

import java.sql.SQLOutput;

public class RangeSumBST_LT938 {
    public static void helper( treeNode root , int low , int high , int[] sum){
        if (root == null) return ;
        if( low <= root.val && root.val <= high){
            sum[0] += root.val ;
            helper( root.left , low,high,sum) ;
            helper( root.right,low,high,sum);
            return ;
        }
        else if( root.val > high){
            helper( root.left , low,high,sum);
        }else{
            helper( root.right,low,high,sum);
        }
        return ;
    }

    public static int rangeSumBST(treeNode root, int low, int high) {
        int[] sum  = {0};
        helper(root,low,high,sum);
        return sum[0];
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
        System.out.println(rangeSumBST(a,7,16));
    }
}
