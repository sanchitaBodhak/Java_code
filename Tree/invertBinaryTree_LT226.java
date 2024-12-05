package Tree;

public class invertBinaryTree_LT226 {
    public void swap( treeNode root){
        treeNode temp;
        if(root == null){
            return ;
        }
        if( root.left == null && root.right == null){
            return ;
        }
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        swap(root.left);
        swap(root.right);
        return ;
    }
    public treeNode invertTree(treeNode root) {
        if(root == null){
            return root;
        }
        swap(root);
        return root;
    }

    public static void main(String[] args) {
        System.out.println(" hiii");
    }
}
