//Single
/*class A{
    void print(){
        System.out.println("I am in A.");
    }
}

class B extends A{
    void print(){
        System.out.println("I am in B.");
    }
}
public class inheritance {
    public static void main(String[] args) {
        B b1= new B();
        b1.print();
    }
}*/

//Multilevel
/*class A{
    void printA(){
        System.out.println("I am in A.");
    }
}

class B extends A{
    void printB(){
        System.out.println("I am in B.");
    }
}
class C extends B{
    void printC(){
        System.out.println("I am in C.");
    }
}

public class inheritance {
    public static void main(String[] args) {
        C c1= new C();
        c1.printA();
        c1.printB();
        c1.printC();
    }
}*/

//Hierarchical
class A{
    void printA(){
        System.out.println("I am in A.");
    }
}

class B extends A{
    void printB(){
        System.out.println("I am in B.");
    }
}
class C extends A{
    void printC(){
        System.out.println("I am in C.");
    }
}

public class inheritance {
    public static void main(String[] args) {
        B b1 = new B();
        C c1 = new C();
        b1.printA();
        b1.printB();
        System.out.println();
        c1.printA();
        c1.printC();
    }
}