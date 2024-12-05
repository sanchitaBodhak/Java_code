package Queue;

import java.util.Stack;

public class implementQueueUsingStack_LT232 {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> t = new Stack<>();
    boolean f = true;
    public void push(int x) {
        if ( f == true){
            s.push(x);
        }else{
            while (!t.isEmpty()) {
            s.push(t.pop());
        }
            s.push(x);
        }
    }
    public int pop() {
        if (f == true) {
            while (!s.isEmpty()) {
                t.push(s.pop());
            }
            f = false;
            return t.pop();
        } else {
            return t.pop();
        }
    }
        public int peek() {
        if ( f == true){
        while (!s.isEmpty()) {
            t.push(s.pop());
        }
        f = false;
        return t.peek();
        }else{
            return t.peek();
        }
    }
    public boolean empty() {
        if (s.isEmpty() && t.isEmpty()){
            return true;
        }
        return false;
    }
    }


