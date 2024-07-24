package Linked_List;

public class RotateList_LT61 {
    public node rotateRight(node head, int k) {
        if( head == null || head.next == null) return head;
        int n = 0;
        node temp = head;
        while (temp != null){
            temp = temp.next;
            n++;
        }
        node slow = head;
        node fast = head;
        k = k % n;
        if( k==0 ) return head;

        for( int i = 1 ; i <=k ; i++){
            fast = fast.next;
        }
        while(fast.next !=  null){  // when loop breaks, fast will be at tail
            slow = slow.next;
            fast = fast.next;
        }
        node newHead = slow.next;
        slow.next = null; //slow is new tail
        fast.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        System.out.println("meow");
    }
}
