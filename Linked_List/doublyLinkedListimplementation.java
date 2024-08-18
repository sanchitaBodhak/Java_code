package Linked_List;
class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode( int val ){
        this.val = val;
    }
}
class doubly{
   dNode head;
   dNode tail;
   int size;
   void display(){
      dNode temp = head;
      while( temp != null){
          System.out.print(temp.val + "\t");
          temp = temp.next;
      }
       System.out.println();
   }
   void insertAtTail( int val) {
       dNode temp = new dNode(val);
       if (size == 0) {
           head = tail = temp;
       } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
       }
       size++;
   }
    void insertAtHead( int val) {
        dNode temp = new dNode(val);
        if (size == 0) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insert( int idx,int val){
       if( idx == 0){
           insertAtHead(val);
           return;
       }
       if( idx == size){
           insertAtTail(val);
           return;
       }
       if( idx > size || idx<0){
           System.out.println(" invalid index !!");
           return;
       }
       dNode temp = new dNode(val);
       dNode x = head;
        for (int i = 0; i < idx-1; i++) {
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp; temp.prev = x;
        y.prev = temp; temp.next = y;
        size++;
    }
    void deleteAtHead() throws Error{
       if ( head == null) throw new Error(" list is empty");
       head = head.next;
       head.prev = null;
       size--;
    }
    void deleteAtTail() throws Error{
        if ( head == null) throw new Error(" list is empty");
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void delete(int index)throws Error{
        if (head==null){
            throw new Error(" list is alrasdy empty");
        }
        if ( index >= size || index <0){
            System.err.println(index);
            throw new Error("VUL INDEX");
        }
        if (index == 0){
            deleteAtHead();
            return;
        }
        dNode temp = head;
        for (int i = 1; i <= index-1 ; i++) {
            temp = temp.next;
        }
        if (temp.next == tail){
            deleteAtTail();
        }
        temp.next = temp.next.next;
        temp = temp.next;
        temp.prev = temp.prev.prev;
        size--;
    }
}

public class doublyLinkedListimplementation {
    public static void main(String[] args) {
        doubly list = new doubly();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtHead(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtHead(0);
        System.out.println(list.size);
        list.insert(3,60);
        list.display();
        list.deleteAtHead();
        list.display();
        list.delete(3);
        list.display();
    }
}
