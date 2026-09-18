import java.util.Scanner;

class Student {
    String name;
    int age;
    int id;

    void showInfo() {
        System.out.println(id + "\t\t" + name + "\t\t" + age);
    }
}

public class OOP_Nineth {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

                Student[] student = new Student[5];

            for (int i = 0; i < 2; i++) {
                student[i] = new Student();

                System.out.print("Enter Student ID: ");
                student[i].id = sc.nextInt();

                sc.nextLine(); 

                System.out.print("Enter Student Name: ");
                student[i].name = sc.nextLine();

                System.out.print("Enter Student Age: ");
                student[i].age = sc.nextInt();
                System.out.println("\n-----------------------\n");

            }
            System.out.println("ID\t\t\tName\t\t\tAge");

            for (int i = 0; i < 3; i++) {
                student[i].showInfo();
            }
     }
    }
}


/*public class OOP_Nineth {
    public static void main(String[] args) {

        System.out.print("ID\tName\t\tAge\n");

        Student student1 = new Student();
        student1.id= 101;
        student1.name = "Alice";
        student1.age = 20;
        student1.showInfo();

        Student student2 = new Student();
        student2.id= 102;
        student2.name = "Jonayet";
        student2.age = 20;
        student2.showInfo();

    }
}*/