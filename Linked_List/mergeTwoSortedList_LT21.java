package Linked_List;

public class mergeTwoSortedList_LT21 {
    public node mergeTwoLists(node list1, node list2) {
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

    public static void main(String[] args) {
        System.out.println(" hii kutipie");
    }
}
