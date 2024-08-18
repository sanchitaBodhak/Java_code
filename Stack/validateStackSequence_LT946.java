package Stack;

import java.util.Stack;

public class validateStackSequence_LT946 {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int j = 0;
        for( i= 0 ; i<pushed.length ; i++){
            st.push(pushed[i]);

            while( st.isEmpty()==false && st.peek() == popped[j]){
               int a = st.pop();
                j++;
            }

        }
        if(st.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        int[] pu = {1,2,3,4,5};
        int[] po = {4,5,3,2,1};
        boolean b = validateStackSequences(pu,po);
        System.out.println(b);
    }
}
