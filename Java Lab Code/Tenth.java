class St {
    String name;
    int id;
    int age;

    St(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    void shwo(){
        System.out.println("Name: " + name + ", ID: " + id + ", Age: " + age);
    }


}
public class Tenth {
    public static void main(String[] args) {
        St s1= new St("Alice", 101, 20);
        s1.shwo();
        St s2= new St("Bob", 102, 21);
        s2.shwo();
        

    }
    
}
