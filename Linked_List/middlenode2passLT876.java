package Linked_List;

public class middlenode2passLT876 {
    public static void print( node head){   // printing
        node temp = head;
        while ( temp != null){
            System.out.print(temp.value +"\t");
            temp = temp.next;
        }
        System.out.println();
    }
    public static node middlenode (node head){
        node temp = head;
        int size = 0;
        while ( temp!=null){
            temp = temp.next;
            size++;
        }
        int mid = size/2 + 1 ;
        temp = head;
        for (int i = 1; i < mid -1 ; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        node f = new node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        print(a);
        node x = middlenode(a);
        System.out.println(x.value);
    }
}
