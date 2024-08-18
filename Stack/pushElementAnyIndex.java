package Stack;

import java.util.Scanner;
import java.util.Stack;

public class pushElementAnyIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack original = new Stack<>();// creating og stack
        original.push(10);  // pushing value
        original.push(20);
        original.push(30);
        original.push(40);
        System.out.println(" actual : " + original);  // printing original
        System.out.print("give element to be inserteted : ");
        int ele = sc.nextInt(); // taking user input for new element value
        System.out.print("tell the index where value should be inserted :");
        int idx = sc.nextInt();
        Stack temp = new Stack<>(); // creating temporay stack
        while( original.size() > idx){
            temp.push(original.pop());
        }
        original.push(ele);
        while(temp.size() != 0){
            original.push(temp.pop());
        }
        System.out.println(original);
    }
}
