package Linked_List;

public class detetctionOfCycleLT141 {
        public boolean hasCycle(node head) {
            node slow = head;
            node fast = head;
            while( fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            System.out.println(" already done this func in leetcode");
        }

}
