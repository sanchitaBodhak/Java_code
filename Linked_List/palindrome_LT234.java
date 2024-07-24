package Linked_List;

public class palindrome_LT234 {
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
    public boolean isPalindrome(node head) {
        if( head == null || head.next == null) return true;
        node slow = head ;
        node fast = head ;
        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        node i = head ;
        node j = reverseList(slow);
        while(j != null ){
            if( i.value != j.value){
                return false;
            }
            i = i.next;
            j = j.next;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("xxxx");
    }
}
