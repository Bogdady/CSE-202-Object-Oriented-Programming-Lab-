abstract class Animal{
    abstract void eat();
    abstract void sleep();

    public Animal() {
        System.out.println("we have dog, cat cow");
    }   
}
 class Dog extends Animal{
        void eat(){
            System.out.println("Dog is eating");
        }

        void sleep(){
            System.out.println("Dog is sleeping");
        }
 }
 class Cat extends Animal{
        void eat(){
            System.out.println("Dog is eating");
        }

        void sleep(){
            System.out.println("Dog is sleeping");
        }
 }
 class Cow extends Animal{
        void eat(){
            System.out.println("Dog is eating");
        }

        void sleep(){
            System.out.println("Dog is sleeping");
        }
 }
 class Demo2{
    public static void main(String[] args) {
        Cat c= new Cat();
        c.eat();
        Dog d= new Dog();
        d.eat();
        Cow cw= new Cow();
        cw.eat();
    }
 }