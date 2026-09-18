import java.util.Scanner;

class Bank{
    int balance;
    int sec;
    Scanner sn= new Scanner(System.in);

    Bank(int balance, int sec){
        this.balance= balance;
        this.sec= sec;
    }

    void transaction(){
        System.out.print("How many amount u want deposit: ");
        int depo = sn.nextInt();
        this.balance = balance + depo;
        System.out.println("Your new balance is "+balance+" TK");
    }

    void transaction(int pin){
        if(pin == sec){
            System.out.print("Enter withdrawal amount: ");
            int wd= sn.nextInt();
            if(balance>=wd && wd>=0){
                balance= balance - wd;
                System.out.println("Withdrwa succsesfull and your new balance is "+balance+" TK");}

            else 
                System.out.println("Insufficient balance");
        }

        else System.out.println("Incorret pin!");
    }
}

class Demo{
    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        
        Bank a1 = new Bank(10000,2500);
        a1.transaction();
        System.out.println("Enter your pin no: ");
        a1.transaction(sn.nextInt());

    }
}

/*class A{
    void printA(){
        System.out.println("I am in A");
    }
}

class B extends A{
    void printA(){
        super.printA();
        System.out.println("I am in B");
    }
}

public class Demo{
    public static void main(String[] args) {
        A b = new B();
        b.printA();
    }
} */

/*class Sum{
    int sum=0;
    int sum(int n){
        if (n==0){
            return 0;
        }
        return n+ sum(n-1);
    }
}

class Demo{
    public static void main(String[] args) {
      Sum s1 = new Sum();
      System.out.println("Sum is :"+s1.sum(4));
    }
}*/

/*class Fact{
    
    int fact(int n){
        if (n==0){
            return 1;
        }
        return n* fact(n-1);
    }
}

class Demo{
    public static void main(String[] args) {
      Fact s1 = new Fact();
      System.out.println("Fact is :" + s1.fact(5));
    }
}*/