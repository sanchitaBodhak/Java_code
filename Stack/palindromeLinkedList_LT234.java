package Stack;

import java.util.Stack;
class ListNode {
    int val;
    ListNode next;

    ListNode(int value) { // constructor

        this.val = value;
    }
}


    public class palindromeLinkedList_LT234 {
        public static boolean isPalindrome(ListNode head){
            Stack<Integer> dummy = new Stack<>();
            ListNode rev = head;
            while ( rev != null){
                dummy.push(rev.val);
                rev = rev.next;
            }
            while (head != null && dummy.isEmpty()==false ){
                if (head.val != dummy.pop() ){
                    return false;
                }
                else {
                    head = head.next;
                }
            }

            return true;
        }

        public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(20);
        ListNode d = new ListNode(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        boolean bo = isPalindrome(a);
            System.out.println(bo);
        }
}
