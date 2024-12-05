package Tree;

public class SameTree_LT100 {
    public boolean isSameTree(treeNode p, treeNode q) {
        if (p == null && q == null)
            return true;
        if (p != null && q == null)
            return false;
        if (p == null && q != null)
            return false;
        if (p.val != q.val) {
            return false;
        }
        if (!(isSameTree(p.left, q.left))) {
            return false;
        }
        if (!(isSameTree(p.right, q.right))) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("hello motuu");
    }
}
