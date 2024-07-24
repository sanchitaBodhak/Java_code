package Linked_List;

public class Reverse_II_LT92 {
    public void reverseList( node head){
        node c = head;   // c represents current node
        node n = head;   // n represents next node can be initialized as null
        node p = null ;  //p represents previous node
        while( c != null ){
            n = c.next;   // current er next e n daalo
            c.next = p;   // current er next p k point korao
            p = c ;      // previous updated to current
            c = n ;       // current updated as next
        }
    }
    public node reverseBetween(node head, int left, int right) {
        node a = null,b = null, c = null,d = null;
        int pos = 1;
        node temp = head ;
        while( temp != null){
            if( pos == left-1) a = temp;
            if( pos == left) b = temp;
            if( pos == right ) c = temp;
            if( pos == right +1 ) d = temp;
            temp = temp.next;
            pos++;
        }
        if( a!=null) a.next = null;
        if ( c != null) c.next = null;
        reverseList(b);
        if( a!= null) a.next = c;
        b.next = d ;
        if( a== null) return c;
        return head;
    }

    public static void main(String[] args) {
        System.out.println(" hatir matha");
    }
}
