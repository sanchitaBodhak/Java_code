package Linked_List;

public class LinkedListCycle_IILT142 {
    public static node detectcycle (node head){
        node slow = head, fast = head,temp = head;
        boolean flag = false;
        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast ) {
                flag = true;
                break;
            }
        }
        if(flag == true){
            while (slow != temp){
                slow = slow.next;
                temp = temp.next;
            }
            return temp;
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println("hauuuu");
    }
}
