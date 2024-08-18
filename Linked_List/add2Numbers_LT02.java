package Linked_List;

public class add2Numbers_LT02 {
    public node addTwoNumbers(node l1, node l2) {
        int carry = 0;
        node dummy = new node(-1);
        node temp = dummy;
        while( l1 != null || l2 != null){
            int val1 =0, val2 = 0;
            if( l1 != null) val1 = l1.value;
            if( l2 != null) val2 = l2.value;
            node x = new node( (val1 + val2 + carry )%10);
            if( val1 + val2 +carry >= 10){
                carry = 1;
            }
            else{
                carry = 0;
            }
            temp.next = x;
            temp = temp.next;
            if( l1 != null) l1 = l1.next;
            if( l2 != null) l2 = l2.next;
        }

        if( carry != 0){
            temp.next = new node(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        System.out.println(" xxxx");
    }
}
