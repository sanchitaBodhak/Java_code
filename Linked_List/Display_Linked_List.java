package Linked_List;


public class Display_Linked_List {
        public static void print_R(node head){
            if (head == null){        //base case
                return;
            }
            System.out.print(head.value + "\t");  // printing before recursive call otherwise get print in reverse order
            print_R(head.next);      // recursion

        }
        public static void print( node head){
            node temp = head;
            while ( temp != null){
                System.out.print(temp.value +"\t");
                temp = temp.next;
                }
            System.out.println();
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
                print_R(b);
        }
}
