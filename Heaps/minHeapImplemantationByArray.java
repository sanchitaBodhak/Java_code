package Heaps;
class minHeap{
    int[] arr;
    private int size = 0;
    minHeap(int capacity){ // capacity is the input of size of heap
        arr = new int[capacity];  // that is also the size of array
    }
    public void add( int data){
        arr[size] = data;
        upHeapify(size);
        size++;
    }
    public void upHeapify(int index){
        if (index == 0) return;
        int child = index; // the index given is the childs index..
        int parent = (child -1)/2;
        if (arr[parent] > arr[child]){
            swap( parent,child);
        }
        upHeapify(parent);
    }
    public void downHeapify( int i){
        if (i >= size) return;
        int left_child = 2*i + 1;
        int right_child = 2*i + 2 ;
        int min_idx = i;
        if ( left_child < size && arr[left_child] < arr[min_idx]) min_idx = left_child;
        if (right_child < size && arr[right_child]< arr[min_idx]) min_idx = right_child;
        if (i == min_idx) return;
        swap(i,min_idx);
        downHeapify(min_idx);
    }
    public void swap( int a,int b){ // it takes index then swaps value at that index i teh array
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int getSize(){
        return size;
    }
    public  int peek() throws Error{
        if (size==0){
             throw new Error("heap is emty");
        }
        return arr[0];
    }
    public  int remove(){
        if (size==0) System.err.println(" heap is empty");
        int peek = arr[0];
        swap(0,size-1);
        size --;
        downHeapify(0);
        return peek;
    }
}
public class minHeapImplemantationByArray {
    public static void main(String[] args) {
      minHeap m = new minHeap(10);

      m.add(2);
      m.add(4);
      m.add(5);
      m.add(8);
      m.add(7);
      m.add(9);
      m.add(6);

        //System.out.println(m.getSize());
        System.out.println(m.remove());System.out.println(m.peek());
        System.out.println(m.remove());System.out.println(m.peek());
        System.out.println(m.remove());System.out.println(m.peek());
    }
}
