package Linked_List;

public class reMoveDuplicatesFromSortedList_LT83 {
    public node deleteDuplicates(node head) {
        node slow = head,fast = head;
        if(head == null) return head;
        while( fast!= null ){
            if( fast.value == slow.value){
                fast = fast.next;
            }else{
                slow.next = fast;
                slow = fast;
            }
        }
        slow.next = null;
        return head;
    }

    public static void main(String[] args) {
        System.out.println(" 0000");
    }
}
