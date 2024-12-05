package Queue;


class node {
    int value;
    node next;
    node(int value) { // constructor

        this.value = value;
    }
}
 class queueLL{
     node head = null;
     node tail = null;
     int size;
     int peek(){
         if (head == null){
             System.out.println(" queue is empty");
             return Integer.MIN_VALUE;
         }
         return head.value;
     }
     void add( int x){
         node temp = new node(x);
         if (head == null){
             head = temp;
             tail = temp;
         }else {
             tail.next = temp;
             tail = tail.next;
         }
        size++;
     }
     int remove(){
         if (head == null){
             System.out.println(" queue is empty");
             return Integer.MIN_VALUE;
         }
         node t = head;
         head = head.next;
         size--;
         return t.value;
     }
     void display(){
         if ( head == null){
             System.out.println(" queue is empty");
             return;
         }
         node a = head;
         while (a!=null){
             System.out.print(a.value+"\t");
             a = a.next;
         }
         System.out.println();
     }

     int size() {
         return size;
     }
 }
public class QueueByLinkedList {
    public static void main(String[] args) {
        queueLL cq = new queueLL();

        // Test 1: Adding elements
        System.out.println("Test 1: Adding elements");
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.add(50);
        cq.display(); // Expect [10, 20, 30, 40, 50]
        System.out.println(cq.size()); // Expect size: 5
        //cq.add(60);   // Expect "Queue is full, can't add element"

        // Test 2: Removing elements
        System.out.println("Test 2: Removing elements");
        cq.remove();  // Remove 10
        cq.display(); // Expect [20, 30, 40, 50]
        cq.remove();  // Remove 20
        cq.display(); // Expect [30, 40, 50]

        // Test 3: Peek functionality
        System.out.println("Test 3: Peek functionality");
        System.out.println(cq.peek());    // Expect peek: 30
        cq.remove();  // Remove 30
        System.out.println(cq.peek());    // Expect peek: 40

        // Test 4: Add more elements and check circular behavior
        System.out.println("Test 4: Circular behavior");
        cq.add(60);   // Expect to add 60
        cq.add(70);   // Expect to add 70
        cq.display(); // Expect [40, 50, 60, 70]

        // Test 5: Remove until empty
        System.out.println("Test 5: Removing until empty");
        cq.remove(); // Remove 40
        cq.remove(); // Remove 50
        cq.remove(); // Remove 60
        cq.remove(); // Remove 70
        cq.display(); // Expect "Queue is empty"

        // Test 6: Attempt to remove from empty queue
        System.out.println("Test 6: Attempt to remove from empty queue");
        cq.remove(); // Expect "Queue is already empty"
    }
}
