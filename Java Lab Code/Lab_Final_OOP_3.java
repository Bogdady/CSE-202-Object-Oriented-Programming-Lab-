
class person {

    String name, email;

    person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void showInfo() {
        System.out.println("Name: " + name + "\tEmail: " + email);
    }
}

class GUBStudent extends person {

    String StudentId, depertment;

    public GUBStudent(String StudentId, String depertment) {
        super(StudentId, depertment);
        this.StudentId = StudentId;
        this.depertment = depertment;
    }

    void showInfo() {
        System.out.println("Student ID: " + StudentId + "\tDepertment: " + depertment);
    }
}

class CSEStudent extends GUBStudent {

    String semester, section;

    public CSEStudent(String semester, String section) {
        super(semester, section);
        this.semester = semester;
        this.section = section;
    }

    void showInfo() {
        System.out.println("Semester: " + semester + "\tSection: " + section);
    }

}

public class Lab_Final_OOP_3 {

    public static void main(String[] args) {
        CSEStudent s1 = new CSEStudent("4th", "251_D1");
        GUBStudent S2 = new GUBStudent("251002011", "CSE");
        s1.showInfo();
        S2.showInfo();

    }
}
