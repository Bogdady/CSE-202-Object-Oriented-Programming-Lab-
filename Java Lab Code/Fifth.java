import java.util.Scanner;
public class Fifth {
    public static void main(String[] args) {
        
            try(Scanner sc = new Scanner(System.in)){

                /*System.out.print("Enter your age: ");
                int age = sc.nextInt();
                
                if(age >= 18){
                    System.out.println("You are eligible to vote.");
                } else {
                    System.out.println("You are not eligible to vote.");*/

                /*System.out.print("Enter number: ");
                int num= sc.nextInt();

                if(num>=80 && num<=100){
                    System.out.println("Grade: A+");
                } else if(num>=70 && num<80){
                    System.out.println("Grade: A");
                } else if(num>=60 && num<70){
                    System.out.println("Grade: A-");
                } else if(num>=50 && num<60){
                    System.out.println("Grade: B");
                } else if(num>=40 && num<50){
                    System.out.println("Grade: C");
                } else if(num>=33 && num<40){
                    System.out.println("Grade: D");
                } else if(num>=0 && num<33){
                    System.out.println("Grade: F");
                } else {
                    System.out.println("Invalid number entered.");*/

                    
                System.out.print("Enter day number (1-7): ");
                int day = sc.nextInt();
                
                switch (day) {
                    case 1 -> System.out.println("saturday");
                    case 2 -> System.out.println("sunday");
                    case 3 -> System.out.println("monday");
                    case 4 -> System.out.println("tuesday");
                    case 5 -> System.out.println("wednesday");
                    case 6 -> System.out.println("thursday");
                    case 7 -> System.out.println("friday");
                    default -> System.out.print("Invalid Day!");
                }

                }
            }
        
    }

