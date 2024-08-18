package Stack;

class stack {
    int size = 0;
    int tos = -1;
    int capacity;
    int[] arr;
    stack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }



    void display() {
        for (int i = 0; i < size ; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    void push(int value){
        if( size == capacity){
            System.out.println(" stack overflow");
            return;
        }
        tos++;
        size++;
        arr[tos] = value;

    }
    int pop (){
        if (size == 0){
            System.out.println("stack underflow");
            return -1;
        }
        size--;
        return arr[tos--];
    }
}

public class stackImplementationByArray {
    public static void main(String[] args) {
    stack s = new stack(5);

    System.out.println(s.pop());
    s.push(10);
    s.push(20);
    s.push(20);
    s.push(20);
    s.push(20);
    s.push(20);
    s.display();
    }
}
