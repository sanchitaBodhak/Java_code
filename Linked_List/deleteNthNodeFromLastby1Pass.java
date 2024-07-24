package Linked_List;

import java.util.Scanner;

public class deleteNthNodeFromLastby1Pass {
    public static void print( node head){   // printing
        node temp = head;
        while ( temp != null){
            System.out.print(temp.value +"\t");
            temp = temp.next;
        }
        System.out.println();
    }
    public static node delete(node head, int n){
        node slow = head , fast = head;
        for (int i = 1; i <= n ; i++) {
            fast = fast.next;
        }
        if (fast == null){
            head = head.next;
            return head;
        }
        while ( fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        System.out.println(" enter n");
        int n = sc.nextInt();
        node head = delete(a,n);
        print(head);
    }
}
