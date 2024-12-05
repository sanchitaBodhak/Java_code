package Stack;

import java.util.Stack;
public class infixToPostfix {
    static int priority(char o){
        if(o == '+' || o == '-'){
            return 1;
        } else if (o == '*' || o == '/') {
            return 2;
        } else if ( o == '^') {
            return 3;
        }
        return 0;
    }
    static StringBuilder convert( String s){
        StringBuilder sb = new StringBuilder();
        Stack <Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                sb.append(c);
            }else {
                if (st.isEmpty()){
                    st.push(c);
                } else if (c=='(') {
                    st.push(c);
                } else if (c==')') {
                    while (st.peek() != '('){
                        sb.append(st.pop());
                    }
                    st.pop();
                } else if (priority(c) <= priority(st.peek())) {
                    sb.append(st.pop());
                    st.push(c);
                }else {
                    st.push(c);
                }
            }
        }
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb;
    }
    public static void main(String[] args) {
        String s = "2+(3*4)";
        StringBuilder a = convert(s);
        System.out.println(a);
    }
}
