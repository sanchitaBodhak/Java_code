package Stack;

import java.util.Stack;

public class nextGraterElement {
    public static void main(String[] args) {
        int[] arr = {8,8,8,8,8,8};
        print_array(arr);
        System.out.println();
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        res[n-1] = -1;
        for (int i = n-2; i >= 0 ; i--) {
            while(st.isEmpty() == false && st.peek() <= arr[i]){
                st.pop();
            }
            if (st.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        print_array(res);
    
    }
    public static void print_array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}