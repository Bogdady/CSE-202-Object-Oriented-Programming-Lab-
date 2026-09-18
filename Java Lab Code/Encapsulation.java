import java.util. Scanner;

class Account{
    public  String name;
    protected String gmail;
    private String password;

    Account(String name, String gmail){
        this.name= name;
        this.gmail= gmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Account account = new Account("Alex","alex@gmail.com");
        System.out.println("Account name: " + account.name+ "\nAccount Gmail: "+account.gmail);

        System.out.println("Enter your password: ");
        account.setPassword(sc.nextLine());
        System.out.println("Password: " + account.getPassword());
    }
}
