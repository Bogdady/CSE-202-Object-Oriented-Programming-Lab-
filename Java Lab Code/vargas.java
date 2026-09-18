/*import java.util.Scanner;
class A{
    int sum;
    void sum(int... arr){
        for (int x : arr) {
            sum=sum+x;
        }
        System.out.println("The sum is: "+sum);
    }
}

public class vargas {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int[] num = new int[5];
    System.out.println("Enter 5 numbers: ");
    for (int i=0; i < 5; i++){
        num[i]= sc.nextInt();
    }

    A a= new A();
    a.sum(num);
    a.sum(1,2,3,4,5);
   }
}*/


class A{
    int sum;
    void sum(int... arr){
        for (int x : arr) {
            sum=sum+x;
        }
        System.out.println("The sum is: "+sum);
    }
}

public class vargas {
   public static void main(String[] args) {
    A a= new A();
    a.sum(1,2,3,4,5);
   }
}
