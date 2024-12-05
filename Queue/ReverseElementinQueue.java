package Queue;

import java.util.Stack;

class reverseQueue{

    Stack<Integer> st = new Stack<>();
    void reverse(int k , queueLL q){
        int n = q.size();
        for (int i = 0; i < k ; i++) {
            st.push(q.remove());
        }

        while (!st.isEmpty()){
            q.add(st.pop());
        }

        for (int i = 0; i < n-k; i++) {
            int x = q.remove();
            q.add(x);
        }
    }
}
public class ReverseElementinQueue {
    public static void main(String[] args) {
        queueLL cq = new queueLL();
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.add(50);
        cq.add(60);
        cq.display();
        reverseQueue r = new reverseQueue();
        r.reverse(3,cq);
        cq.display();
    }
}
