
class A{

    final void sum(int x, int y){
            int sum = x+y;
            System.out.println("Sum is: "+sum);
    }

     void sum(int x, int y, int z){
           int sum = x+y+z;
           System.out.println("Sum is: "+sum);
        }
}

class B extends A{
    void sum(int x, int y, int z){
            int sum = x+y+z;
            System.out.println("Sum is: "+sum);
    }
}


public class Final {
    public static void main(String[] args) {
        B b1= new B();
        b1.sum(100, 200);
        b1.sum(100, 200, 300);
       
        
    }
}
