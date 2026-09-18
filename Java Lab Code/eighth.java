public class eighth {
    static int sum(int a, int b){
        
        int sum= a+b;
        return sum; 
        
    }
    static void even(int n){
        if(n%2==0){
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }
    }
    static int fact(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact= fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        int a=5, b=10;
        int result = sum(a,b);
        System.out.println("Sum is: " + result);
        even(b);
        int fact= fact(5);
        System.out.println("Factorial of " + b + " is: " + fact);
    }
}
