package Linked_List;

import java.util.Scanner;

public class deleteNthFromLastby2Pass {
    public static node delete_last(node head,int n){
        // finding length of linked list
        int length = 0 ;
        node temp = head;
        while (temp != null){
           temp = temp.next;
           length++;
       }
        if (length == n){
            head = head.next;
            return head;
        }
        temp = head;
       int n_rev = length-n+1; // nth node from last = length-n+1 th node form first
        for (int i = 1; i < n_rev-1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public static void print( node head){   // printing
        node temp = head;
        while ( temp != null){
            System.out.print(temp.value +"\t");
            temp = temp.next;
        }
        System.out.println();
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
         node head = delete_last(a,n);
        print(head);
    }
}
