package Linked_List;

public class partition_LT86 {
        public node partition(node head, int x) {
            if( head == null || head.next == null){
                return head;
            }
            node a = new node(-1) ;  // dummy node
            node b = new node(-1) ;  // dummy node
            node temp = head ;  // this pointer gonna traverse the whole linked list
            node ta = a ; // its gonee move forward while a stationary
            node tb = b;
            while( temp != null ){  // traversing
                if( temp.value < x){  //temp er value x er kom hole
                    ta.next = temp;
                    temp = temp.next;
                    ta = ta.next;
                }else{
                    tb.next = temp;
                    temp = temp.next;
                    tb = tb.next;
                }

            }
            a = a.next;
            b = b.next;
            ta.next = b;
            tb.next = null;
            return a;
        }

    public static void main(String[] args) {
        System.out.println("running");
    }
}
