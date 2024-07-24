package Linked_List;

public class SortList_LT148 {
    class Solution {
        public node merge(node list1, node list2) {
            node dummy = new node(-1);
            node t = dummy;
            node t1 = list1;
            node t2 = list2;
            while( t1!=null && t2!= null){
                if(t1.value <= t2.value){
                    t.next = t1;
                    t1 = t1.next;
                    t = t.next;
                }
                else{
                    t.next = t2;
                    t2 = t2.next;
                    t = t.next;
                }
            }
            if(t1 == null) t.next = t2;
            if(t2 == null) t.next = t1;
            return dummy.next;
        }
        public node sortList(node head) {
            if(head == null || head.next == null) return head;
            node firstHalf = head ;
            node slow = head ;
            node fast = head ;
            while( fast.next != null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            node secondHalf = slow.next;
            slow.next = null;
            firstHalf = sortList(firstHalf);
            secondHalf = sortList(secondHalf);
            node ans = merge(firstHalf,secondHalf);
            return ans;
        }
    }
}
