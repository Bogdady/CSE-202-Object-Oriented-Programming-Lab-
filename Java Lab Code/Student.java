
class std{
    String name, dept; 
    int id;

    void setvalue(String name,String dept, int id){
                this.name = name;
                this.dept= dept;
                this.id= id;
                System.out.println("Name: "+name+"\nID: "+id+"\nDept: "+dept);
    }
}

public class Student {
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        
        std s1= new std();
        s1.setvalue("David", "CSE", 105);
        s1.name= "Alex";
        s1.dept= "CSE";
        s1.id= 101;
        

        System.out.println("Name: "+s1.name+"\nID: "+s1.id+"\nDept: "+s1.dept);
    }
}
