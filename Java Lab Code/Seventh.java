import java.util.Scanner;
public class Seventh {
    public static void main(String[] args) {
        /*int n=10;
        int [] numbers = new int[n];
        int [][] matrix = new int[n][n];

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 5 numbers:");

            for(int i=0; i<5; i++){
                numbers[i] = sc.nextInt();
            }

            System.out.println("Enter the matrix elements:");
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }    
        }

        System.out.println("The numbers you entered are:");
        for(int i=4; i>=0; i--){
            System.out.print(numbers[i]+" ");
        }

        System.out.println("\nThe matrix you entered is:");
        for(int i=0; i<=2; i++){
            for(int j=0; j<=2; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();*/

        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Enter size of array: ");
            int n= sc.nextInt();
            int [] arr= new int[n];
            
            System.out.print("Enter Arrays element: ");
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            int sum=0, max= arr[0];
            for(int i=0; i<n; i++){
                sum= sum + arr[i];
                if(arr[i]>max){
                    max= arr[i];
                }
            }
            System.out.println("Sum of array elements: " + sum);
            System.out.println("Maximum element in the array: " + max);
            

        }
        
        }
    }
