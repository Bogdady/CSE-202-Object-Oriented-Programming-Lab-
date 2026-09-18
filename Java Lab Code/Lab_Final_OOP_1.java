
import java.util.Scanner;

class Lab_Final_OOP_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your student ID: ");
        int N;
        N = sc.nextInt();
        int i = 0, a, sum = 0;

        while (N != 0) {
            a = N % 10;
            System.out.print(a);
            sum = sum + a;
            N = N / 10;
        }

        if (sum % 2 == 0) {
            System.out.println("\nApprpved");

        }

        if (sum % 2 == 1) {
            System.out.println("\nRecheck");
            System.out.println("Sum is: " + sum);
        }
    }

}
