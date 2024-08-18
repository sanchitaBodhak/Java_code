package Stack;
import java.util.Stack;
public class reversingStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());  // checking if the stack is empty
        st.push(10);  // pushing items to stack
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);  // stack creation complete
        System.out.println(st);
        Stack<Integer> st_reversed = new Stack<>();// creating new stack to store popped values
        while(!st.isEmpty()){  // unless st is empty
           st_reversed.push(st.pop());
        }
        System.out.println(st_reversed);
    }
}
