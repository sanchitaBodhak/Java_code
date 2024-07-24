package recursion;

import java.util.Scanner;

public class declined_consecutive1 {
        public static void printstrings(String s,int n){
            int l = s.length();
            if (l == n){
                System.out.println(s);
                return;
            }
            if (l == 0 || s.charAt(l-1) == '0'){ // if the string is empty, or it ends with '0'
                printstrings(s+0,n);          // then we can add '0' at ends
                printstrings(s+1,n);          // also can add '1' at end
            }
            else {                         //if (s.charAt(l-1) == 1)
                printstrings(s+0,n);    // if the last chatacter is '1' then only can add 1
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter n : "); // size of the string
            int n = sc.nextInt();
            printstrings("",n);


        }
}
