package Stack;

import java.util.Stack;

public class postfixEvaluation {
    static float evaluatePostfix(String s){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char  c =  s.charAt(i);
            if ((int)c >= 48 && (int)c<= 57){
                st.push((int)c -48);
            }else{
                int a = st.pop();
                int b = st.pop();
                switch (c){
                    case '+':
                        st.push( b+a);
                        break;
                        case '-':
                        st.push( b-a);
                        break;
                        case '*':
                        st.push( b*a);
                        break;
                        case '/':
                        st.push( b/a);
                        break;
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String s = "234*+";
        float f =  evaluatePostfix(s);
        System.out.println(f);
    }

}
