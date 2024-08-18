package Stack;
import java.util.Stack;
class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int val) {
        if (min.isEmpty() == true || val <= min.peek()) {
            min.push(val);
        }
        st.push(val);
    }

    public void pop() {
        int y = st.pop();
        if (y == min.peek()) {
            min.pop();
        }

    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        System.out.println("hii");
    }
}
