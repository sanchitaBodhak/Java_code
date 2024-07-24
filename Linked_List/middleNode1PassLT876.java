package Linked_List;

public class middleNode1PassLT876 {
    public static void print( node head){   // printing
        node temp = head;
        while ( temp != null){
            System.out.print(temp.value +"\t");
            temp = temp.next;
        }
        System.out.println();
    }
    public static node middlenode(node head){
        node slow = head;
        node fast = head;
        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
