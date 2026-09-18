
import java.util.*;

public class java6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x: ");
            int x = sc.nextInt();
            System.out.print("Enter the value of y: ");
            int y = sc.nextInt();

            int s = x / y;
            System.out.println("S is:" + s);
        } catch (ArithmeticException e) {
            System.out.println("Y should not be zero(0)");
        } catch (InputMismatchException e1) {
            System.err.println("Y should be a integer value");
        } finally {
            System.out.println("I am from finally");
        }

        System.err.println("Program end");

    }
}
