package Linked_List;
 // in this question, the head is not given though aceess to the node to be deleted is given
public class deleteNodeLT237 {
     public static void print( node head){
         node temp = head;
         while ( temp != null){
             System.out.print(temp.value +"\t");
             temp = temp.next;
         }
         System.out.println();
     }
    public static void deletenode(node s){
        s.value = s.next.value;
        s.next = s.next.next;
    }

     public static void main(String[] args) {
         node a = new node(10);
         node b = new node(20);
         node c = new node(30);
         node d = new node(40);
         a.next = b;
         b.next = c;
         c.next = d;
         d.next = null;
         print(a);
         deletenode(b);
         print(a);
     }
}
