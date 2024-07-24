package Linked_List;

public class reverseLinkedList_recursive_LT206 {
    public node reverseList(node head) {
        if( head == null || head.next == null ){
            return head;
        }
        node a = head.next;
        node newHead = reverseList(a);
        a.next = head ;
        head.next = null ;
        return newHead;
    }

    public static void main(String[] args) {
        System.out.println("hii");
    }
}
