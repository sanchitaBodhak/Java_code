package Linked_List;

//public class Basic_operations {
class Linked_List{  // creating an user defined data structure
    node head;    // first node
    node tail;    // last node
    int size ; // by default 0 ... no initialization needed
    void print(){      // prints the total list
        node temp = head;
        while ( temp != null){
            System.out.print(temp.value +"\t");
            temp = temp.next;    // traversing the list
        }
        System.out.println();
    }
    void insertAtBegining(int val){
        node temp = new node(val);
        if ( head==null) {   // if LL is empty
            head = tail = temp;    // also can do head = tail = temp
        }else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertAtEnd(int val){
        node temp = new node( val);
        if ( head==null){   // if LL is empty
            head = temp;    // also can do head = tail = temp
            tail = temp;
        }else {     // if linked list is not empty || at least 1 node present
            tail.next = temp;
            tail = temp;     // temp is the new last node now
        }
        size++;     // counts the no of node
    }
    void insert( int index , int val){
        if (index == 0){
            insertAtBegining(val);
            return;
        }
        if (index == size){
            insertAtEnd(val);
            return;
        }if (index > size){
            System.out.println("invalid index");
        }
        node temp = new node(val);
        node x = head;
        for (int i = 0; i < index-1; i++) {// 0 based indexing && this loop must run idx-1 times
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    void deleteAtBegining()throws Error{
        if (head==null){
            throw new Error(" list is alrasdy empty");
        }
        head = head.next;
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
            deleteAtBegining();
            return;
        }
        node temp = head;
        for (int i = 1; i <= index-1 ; i++) {
            temp = temp.next;
        }
        if (temp.next == tail){
            tail = temp;
        }
        temp.next = temp.next.next;

        size--;
    }
    int get(int index) throws Error{  // 0 based indexing
        node x = head;
        if (index == size-1){
            return tail.value;
        }
        if ( index >= size || index <0){
            System.err.println(index);
            throw new Error("VUL INDEX");
        }
        for (int i = 0; i < index  ; i++) {
            x = x.next;
        }
        return x.value;
    }
    void set(int index,int val) throws Error{  // 0 based indexing
        node temp = head;
        if (index == size-1){
             tail.value = val;
             return;
        }
        if ( index >= size || index <0){
            System.err.println(index);
            throw new Error("VUL INDEX");
        }
        for (int i = 0; i < index  ; i++) {
            temp = temp.next;
        }
         temp.value = val;
    }


}

public class Basic_operations {
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        System.out.println(list.size);
        list.insertAtEnd(10);
        list.insertAtEnd(350);
        list.insertAtEnd(12);
        list.print();
        System.out.println(list.get(2));
        list.insertAtBegining(97);
        list.insertAtBegining(56);
        System.out.println(list.size);
        list.print();
        list.insert(0,9);
        list.print();
        list.insert(list.size, 150);
        list.insert(3,88);
        list.print();
        list.set(2,569);
        list.print();
        list.deleteAtBegining();
        list.print();
        list.delete(list.size-1);
        list.print();
    }

}
