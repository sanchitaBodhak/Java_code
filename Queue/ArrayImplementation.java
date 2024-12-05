package Queue;
class queue{
    int front = -1;
    int rear = -1;
    int size = 0;
    int[] arr ;
    queue( int length){ // constuctor
        arr = new int[length];
    }
    void add( int x){
        if( rear == arr.length-1){  // overflow
            System.out.println(" Queue is full");
            return;
        } else if (front == -1 && rear == -1) {
            rear = 0;
            front = 0;
            arr[rear] = x;
            size++;
        }
        else {
            rear++;
            arr[rear] = x;
            size++;
        }
    }
    int remove(){
        int temp;
        if( front == -1){  // underflow
            System.out.println(" queue is empty");
            return Integer.MIN_VALUE;
        } else if ( rear == front) {
            temp = arr[front];
            front = rear-1;
            size--;
            return temp;
        }else {
            temp = arr[front];
            front++;
            size--;
            return temp;
        }
    }
    int peek(){
        if (size == 0){
            System.out.println(" queue is empty");
            return Integer.MIN_VALUE;
        }
        return arr[front];
    }
    void display(){
        if (size == 0){
            System.out.println(" queue is empty");
        }
        else {
            for (int i = front; i <= rear ; i++) {
                System.out.print(arr[i] +"\t");
            }
        }
        System.out.println();
    }
}
public class ArrayImplementation {
    public static void main(String[] args) {
        queue x = new queue(5);
        x.add(10);
        x.add(20);
        x.display();
    }
}
