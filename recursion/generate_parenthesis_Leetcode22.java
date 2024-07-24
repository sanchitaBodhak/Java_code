package recursion;

import java.util.Scanner;

public class generate_parenthesis_Leetcode22 {
        public static void brackets( String s , int n, int open , int close){
            if (s.length() == 2*n){
                System.out.println(s);
                return;
            }

            if ( open < n  ){
                brackets(s+'(',n,open+1,close);

            }  if ( open > close) {
                brackets(s+')',n,open,close+1);
            }

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" enter length n :");
            int n = sc.nextInt();
            brackets("", n,0,0);
        }
}
