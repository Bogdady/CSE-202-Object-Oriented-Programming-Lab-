//Method Overloading or Compile time polymorphism
/*class A{

     void sum(){
        System.out.println("Nothing to print.");
    }

    void sum(int x, int y){
        int sum;
        sum= x+y;
        System.out.println("Sum is "+sum);
    }

    void sum(int x, int y, float z){
        float sum;
        sum= x+y+z;
        System.out.println("Sum is "+sum);
    }
}

public class Polymophism {
    public static void main(String[] args) {
        A a = new A();
        a.sum();
        a.sum(7, 8);
        a.sum(10, 20, 30.5f);
    }
}*/

//Method Overloading or Compile time polymorphism
class A{
    void print(){
        System.out.println("I am in A.");
    }
}

class B extends A{
    void print(){
        System.out.println("I am in B.");
    }
}
public class Polymophism {
    public static void main(String[] args) {
        B b1= new B();
        b1.print();
    }
}