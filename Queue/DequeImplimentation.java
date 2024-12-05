package Queue;
class Dnode{
    int value;
    Dnode prev;
    Dnode next;
    Dnode( int value){// constructor
        this.value = value;
    }
}
class deque{
    Dnode front = null;
    Dnode rear = null;
    int size = 0;
    boolean isEmpty(){
        if ( size == 0) {
            return true;
        }
        return false;
    }
    int size(){
        return size;
    }
    void insertAtFront(int val){
        Dnode temp = new Dnode(val);
        if (front == null){// deque is empty
            rear = temp;
            front = temp;
        }else {
            temp.next = front;
            front.prev = temp;
            front = front.prev;
        }
        size++;
    }
    void inserAtRear(int val){
        Dnode temp = new Dnode(val);
        if (rear == null){// deque is empty
            rear = temp;
            front = temp;
        }else {
            temp.prev = rear;
            rear.next = temp;
            rear = rear.next;
        }
            size++;
    }
    int deletefront(){
        if ( size==0){// underflow
            System.out.println(" deque is empty");
        }else{
            Dnode t = front;
            front = front.next;
            if (front == null){
                rear = null;
            }else {
                front.prev = null;
            }
            size--;
            return t.value;
        }
        return Integer.MIN_VALUE;
    }
    int deleterear(){
        if ( size==0){// underflow
            System.out.println(" deque is empty");
        }else{
            Dnode t = rear;
            rear = rear.prev;
            if (rear == null){
                front = null;
            }else {
                rear.next = null;
            }
            size--;
            return t.value;
        }
        return Integer.MIN_VALUE;
    }
    int getFront(){
        if (size == 0){
            System.out.println(" underflow");
            return -1;
        }else {
            return front.value;
        }
    }
    int getRear(){
        if (size == 0){
            System.out.println(" underflow");
            return -1;
        }else {
            return rear.value;
        }
    }
}
public class DequeImplimentation {
    public static void main(String[] args) {
        deque d = new deque();
        d.getFront();
        System.out.println(d.size());
        d.inserAtRear(20);
        d.insertAtFront(10);
        System.out.println(d.getRear());
        System.out.println(d.getFront());
        System.out.println(d.size());
    }
}
