/*// Abstract base class
abstract class Vehicle {
    protected String make;
    protected int manufacturingYear;

    // Parameterized constructor
    public Vehicle(String make, int manufacturingYear) {
        this.make = make;
        this.manufacturingYear = manufacturingYear;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayDetails();
}

// Subclass: Car
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, int manufacturingYear, int numberOfDoors) {
        super(make, manufacturingYear);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Car Details ---");
        System.out.println("Make: " + make);
        System.out.println("Year: " + manufacturingYear);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println();
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, int manufacturingYear, boolean hasSidecar) {
        super(make, manufacturingYear);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Motorcycle Details ---");
        System.out.println("Make: " + make);
        System.out.println("Year: " + manufacturingYear);
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println();
    }
}

// Main class to run the program
public class Tutorial {
    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Car myCar = new Car("Toyota", 2022, 4);
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", 2021, false);

        // Display their details
        myCar.displayDetails();
        myMotorcycle.displayDetails();
    }
}*/

class A{
    int x= 10; 
    void eat(){
        System.out.println("I am A");
    }
}

class B extends A{
    int x= 20;
    void eat(){
        System.out.println("I am B");
    }
}

class Tutorial{
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
        a.eat();
    }
}

/*class A{
    void m1(){
        System.out.println("I am A");
    }
}

class B extends A{
    void m1(){
        System.out.println("I am B");
    }
}

class C extends A{
    void m1(){
        System.out.println("I am C");
    }
}
class Tutorial{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A  ref;

        ref =a; 
        ref.m1();

        ref = b;
        ref.m1();

        ref = c;
        ref.m1();


    }
}*/