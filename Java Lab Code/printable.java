
public interface printable {

    void print();

}

interface showable {

    void show();

}

interface displayable extends printable, showable {

    void display();

}

class A implements displayable {

    public void print() {
        System.out.println("print");
    }

    public void show() {
        System.out.println("show");
    }

    public void display() {
        System.out.println("display");
    }

}

class interfaceTest {

    public static void main(String[] args) {
        A a = new A();
        a.print();
        a.show();
        a.display();
    }

}
