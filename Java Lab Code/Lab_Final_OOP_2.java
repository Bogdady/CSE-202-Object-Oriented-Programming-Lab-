
class StudentProfile {

    private String name, studentId;
    private double cgpa;

    StudentProfile() {
        this.name = null;
        this.studentId = null;
        this.cgpa = 0.0;
    }

    StudentProfile(String name, String studentId, double cgpa) {
        this.name = name;
        this.studentId = studentId;
        this.cgpa = cgpa;
    }

    StudentProfile(StudentProfile s2) {
        this.name = s2.name;
        this.studentId = s2.studentId;
        this.cgpa = s2.cgpa;
    }

    public void displayProfile() {
        System.out.println("Name: " + name + "\tStudent ID:" + studentId + "\tCGPA: " + cgpa);
    }

}

public class Lab_Final_OOP_2 {

    public static void main(String[] args) {
        StudentProfile s1 = new StudentProfile();
        StudentProfile s2 = new StudentProfile("Jonayet", "251002011", 3.86);
        StudentProfile s3 = new StudentProfile(s2);

        s1.displayProfile();
        s2.displayProfile();
        s3.displayProfile();
    }
}
