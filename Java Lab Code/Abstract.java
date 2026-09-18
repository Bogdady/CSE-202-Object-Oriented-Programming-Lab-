
abstract class UGC{
    abstract void fund();
    abstract void PC();
    abstract void STD_Teachrr();

    void condtion(){
        System.out.println("Every varsity has to maintain this condition");
    }
}

class GUB extends UGC{
 
    void fund() {
        System.out.println("GUB has 100 cr fund.");
    }

    void PC() {
        System.out.println("GUB has a permanent campus");
    }

    void STD_Teachrr() {
        System.out.println("GUB has 5000 student and 300 teacher");
    }
}

class NSU extends UGC{

    void fund() {
        System.out.println("NSU has 300 cr fund.");
    }

    void PC() {
        System.out.println("NSU has a permanent campus");
    }

    void STD_Teachrr() {
        System.out.println("NSU has 4500 student and 250 teacher");
    }
}



public class Abstract {
    public static void main(String[] args) {
        GUB u1= new GUB();
        u1.condtion();
        u1.fund();
        u1.PC();
        u1.STD_Teachrr();
        System.out.println();
        NSU u2 = new NSU();
        u2.fund();
        u2.PC();
        u2.STD_Teachrr();
    }
}