package Stack;
import java.util.Stack;
public class copyStack {
    public static void main(String[] args) {
        Stack original = new Stack<>();
        Stack temp = new Stack<>();
        Stack copy = new Stack<>();
        original.push(10);// creating og stack
        original.push(20);
        original.push(30);
        original.push(40);
        System.out.println(" actual : " + original);  // printing original
        while( !original.isEmpty()){ // using temp stack to reverse OG
            temp.push(original.pop());
        }
        System.out.println(" reversed : " + temp);
        while( ! temp.isEmpty()){ // reverse temp again to get OG again
            copy.push(temp.pop());
        }
        System.out.println("final copied stack :" + copy);
    }
}
