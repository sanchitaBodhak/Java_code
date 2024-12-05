package Stack;

import java.util.Stack;

public class infixToPrefix {
    public static String revString(String a){
        StringBuilder b = new StringBuilder();
        for (int i = a.length()-1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        String c = b.toString();
        return c;
    }
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

    public static String convertPrefix ( String m){
        StringBuilder sb = new StringBuilder();
        Stack <Character> st = new Stack<>();
        String s = revString(m);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sb.append(c);
            }else if (c==')') {
                st.push(c);
            } else if (c=='(') {
                while (st.peek() != ')'){
                    sb.append(st.pop());
                }
                st.pop();
            }else {
                while (!st.isEmpty() && (priority(c) < priority(st.peek()))) {
                    sb.append(st.pop());
                }
                st.push(c);
            }
            }
         while (!st.isEmpty()){
            sb.append(st.pop());
        }
         String x = sb.toString();
        return revString(x);
        }
    public static void main(String[] args) {
        String a = "a+b*(c-d+e*f-g)/h*k^l^m";
        String v = convertPrefix(a);
        System.out.println(v);

    }
}
