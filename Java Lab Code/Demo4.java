
import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter value of y: ");
        int y = sc.nextInt();

        try {
            int Divi = x / y;
            System.out.println("The Division is : " + Divi);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("The Division is : ");
    }
}
