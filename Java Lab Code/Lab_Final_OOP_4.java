
abstract class Evaluation {

    private int studentId;
    protected int marks;

    Evaluation(int studentId) {
        this.studentId = studentId;
    }

    abstract void calculateMarks();

    void printResult() {
        System.out.println("Student ID: " + studentId + "\tMarks: " + marks);
    }
}

class LabEvaluation extends Evaluation {

    private int labTask, viva;

    public LabEvaluation(int studentId) {
        super(studentId);
    }

    void setters(int labTask, int viva) {
        this.labTask = labTask;
        this.viva = viva;
    }

    void calculateMarks() {
        this.marks = labTask + viva;
    }
}

class ProjectEvaluation extends Evaluation {

    private int project, report;

    public ProjectEvaluation(int studentId) {
        super(studentId);
    }

    void setters(int project, int report) {
        this.project = project;
        this.report = report;
    }

    void calculateMarks() {
        this.marks = project + report;
    }
}

public class Lab_Final_OOP_4 {

    public static void main(String[] args) {
        LabEvaluation S1 = new LabEvaluation(251002011);
        ProjectEvaluation s2 = new ProjectEvaluation(251002011);
        S1.setters(15, 15);
        S1.calculateMarks();
        S1.printResult();

        s2.setters(30, 15);
        s2.calculateMarks();
        s2.printResult();
    }
}
