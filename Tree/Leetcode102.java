package Tree;

import java.util.ArrayList;
import java.util.List;

public class Leetcode102 {
    public  int level( treeNode root) {
        if (root == null) {
            return 0;
        }
        int level = 1 + Math.max(level(root.right),level(root.left));
        return level;
    }
    public  void nth_level(treeNode root, int level, int n, List<Integer> arr){
        if (root==null){
            return;
        }if( level == n) arr.add(root.val);
        nth_level(root.left, level+1, n , arr);
        nth_level(root.right,level+1 , n , arr);
    }
    public List<List<Integer>> levelOrder(treeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = level(root);
        for( int i=0 ; i<= lvl -1 ; i++){
            List<Integer> arr = new ArrayList<>();
            nth_level( root, 0 ,i,arr);
            ans.add(arr);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("hii");
    }
}
