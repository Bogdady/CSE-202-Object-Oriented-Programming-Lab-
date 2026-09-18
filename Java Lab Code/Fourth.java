import java.util.Scanner;

class Fourth {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            
            int sum = a + b;
            int difference = a - b;
            int multiple = a * b;
            float division = (float) a / b;
            float mod = a % b;
            
            if(a%2 == 0){
                System.out.println(a + " is even number");
            } else {
                System.out.println(a + " is odd number");
            }
            
            if(b%2 == 0){
                System.out.println(b + " is even number");
            } else {
                System.out.println(b + " is odd number");
            }
            
            System.out.println("\nSum = " + sum);
            System.out.println("Difference = " + difference);
            System.out.println("Multiple = " + multiple);
            System.out.println("Division = " + division);
            System.out.println("Modulus = " + mod);
        }

    }
}
