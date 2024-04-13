package Arrary;

import java.util.Scanner;

//Find the doublet in the Array whose sum is equal to the  given value x. (Two Sum)
public class two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,5,6,10,-5,2,9,2};
        int n = arr.length;
        System.out.println("give the vule to find according doublet");
        int target = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {
                if ((arr[i] + arr[j]) == target){
                    System.out.println("the doublet are ... "+arr[i]+ ","+arr[j]);
                }
            }

        }
    }
}
