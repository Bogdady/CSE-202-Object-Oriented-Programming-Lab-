import java.util.Scanner;

public class Third {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number: ");
            int score = sc.nextInt();
            
            System.out.print("Enter passing Number: ");
            float passingScore = sc.nextFloat();
            
            System.out.print("Enter max credit: ");
            double maxCredit = sc.nextDouble();
            
            System.out.print("Enter grade: ");
            String grade = sc.next();
            
            boolean isPass = score >= passingScore;
            
            System.out.println("\nScore: " + score);
            System.out.println("Passing Score: " + passingScore);
            System.out.println("Max Credit: " + maxCredit);
            System.out.println("Grade: " + grade);
            
            if (isPass) {
                System.out.println("Status: Passed");
            } else {
                System.out.println("Status: Failed");
            }

            sc.close();
        }
    }
}
