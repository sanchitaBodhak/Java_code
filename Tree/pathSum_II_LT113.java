package Tree;

import java.util.ArrayList;
import java.util.List;

public class pathSum_II_LT113 {
    public void path(treeNode root, List<List<Integer>> ans, List<Integer> sub, int target){
        if( root == null) return;
        target = target -root.val;
        sub.add(root.val);
        if( root.left == null && root.right == null){
            if( target == 0) ans.add(sub);
            return;
        }
        List<Integer> sub1 = new ArrayList<>(sub);
        List<Integer> sub2 = new ArrayList<>(sub);
        path(root.left,ans,sub1,target);
        path(root.right,ans,sub2,target);
    }
    public List<List<Integer>> pathSum(treeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        path(root,ans,sub,targetSum);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("hdchubjfb");
    }
}
