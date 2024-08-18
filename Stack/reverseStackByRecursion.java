package Stack;

import java.util.Stack;

public class reverseStackByRecursion {
    public static void main(String[] args) {
        Stack original = new Stack<>();// creating og stack
        original.push(10);  // pushing value
        original.push(20);
        original.push(30);
        original.push(40);
        System.out.println(" actual : " + original);  // printing original
        reversed(original);
    }
    public static void reversed (Stack<Integer> original){
        if( original.isEmpty()) return;
        int top = original.pop();
        System.out.print(top + "\t");
        reversed(original);
        original.push(top);
    }
}
