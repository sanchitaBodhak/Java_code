package Linked_List;

public class reverseLinkedList_iterative_LT206 {
    public node reverseList(node head) {
        node c = head;   // c represents current node
        node n = head;   // n represents next node can be initialized as null
        node p = null ;  //p represents previous node
        while( c != null ){
            n = c.next;   // current er next e n daalo
            c.next = p;   // current er next p k point korao
            p = c ;      // previous updated to current
            c = n ;       // current updated as next
        }
        return p ;
    }

    public static void main(String[] args) {
        System.out.println( " hii");
    }
}
