package Linked_List;

public class reorderList_LT143 {
    public node reverseList(node head) {  // for reversing the second part
        if( head == null || head.next == null ){
            return head;
        }
        node a = head.next;
        node newHead = reverseList(a);
        a.next = head ;
        head.next = null ;
        return newHead;
    }
    public void reorderList(node head) {
        if( head == null || head.next == null || head.next.next == null) return; // edge case
        node slow = head,fast = head;
        while( fast.next != null && fast.next.next != null){ // finding left middle
            slow = slow.next;
            fast = fast.next.next;
        }
        node a1 = head , b1 = slow.next;
        slow.next = null;  // disconnecting parts
        b1 = reverseList(b1); // reversing
        node a2 = a1.next , b2 = b1.next;
        while( a2 != null && b2 != null){ // connecting nodes
            a1.next = b1;
            b1.next = a2 ;
            a1 = a2;
            b1 = b2;
            a2 = a2.next;
            b2 = b2.next;
        }
        if( a2 == null) a1.next = b1; //leftover part
        if( b2 == null) {    // leftover part
            a1.next = b1;
            b1.next = a2;
        }
        return ;
    }

    public static void main(String[] args) {
        System.out.println(" hello");
    }
}
