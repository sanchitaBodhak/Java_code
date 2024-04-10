import java.util.Scanner;
public class Reverse_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number...");
        int number = sc.nextInt();
        int rev ;
        System.out.print(" Reverse of the no. is... ");
        while (number != 0){
            rev = number % 10;
            System.out.print(rev);
            number = number/10;
        }
    }
}
