package Heaps;

class node{
    int val;
    node left;  // denotes left child
    node right;  // denotes right child
    node( int val){ // constructor
        this.val = val;
    }
}

public class isItMaxHeap {
    public static int size( node root){
        if (root == null) return 0;
        return 1+size(root.left) + size(root.right);
    }
    public static boolean isMaxHeap(node root){
        return isHeap(root) && isCBT(root,0,size(root));
    }
    public static boolean isHeap( node root){
        if (root == null) return true;
        if(root.left != null ){
            if(root.val< root.left.val) return false;
        }
        if(root.right != null ){
            if(root.val< root.right.val) return false;
        }
        return (isHeap(root.left) && isHeap(root.right));
    }
    public static boolean isCBT( node root,int i,Integer n){
        if (root == null) return  true;
        if (i>=n)return false;
        return isCBT(root.left,2*i+1,n) && isCBT(root.right,2*i+2,n);
    }
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(8);
        node c = new node(7);
        node d = new node(2);
        node e = new node(6);
        node f = new node(5);
    a.left = b; a.right = c;
    b.left = d; b.right = e;
    c.right = f;
        System.out.println(isMaxHeap(a));
    }
}
