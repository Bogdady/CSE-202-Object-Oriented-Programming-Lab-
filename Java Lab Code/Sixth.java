public class Sixth {
    public static void main(String [] args) {

       /*for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }*/
        
        /*int i=1;
        while(i<=100){
            System.out.println(i);
            i++;
        }*/

        /*int i=1;
        do{
            System.out.print(i + " ->");
            i++;
        }while(i<=100);*/

        /*int i=2;
        System.out.println("Even numbers between 1 to 50 are: ");
        for(i=1; i<=50; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }*/

        /*int i=1, n=5, f=1;

        for(i=1; i<=n; i++){
            if(n<0){
                System.out.println("Error! Factorial of a negative number doesn't exist.");
            }
            else{
                f = f * i;
            }
        }
            System.err.println("Factorial of " + n + " is: " + f);*/

            for(int i=1; i<=5; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
    }
}
