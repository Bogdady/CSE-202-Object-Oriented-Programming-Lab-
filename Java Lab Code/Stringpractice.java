
public class Stringpractice {

    public static void main(String[] args) {
        String name1 = "Jonayet";
        String name2 = new String(" Bogdady");
        char ch[] = {'2', '5', '1', '0', '0', '2', '0', '1', '1'};
        String id = new String(ch);

        char ch2 = name1.charAt(0);
        /*System.out.println(ch2);

        System.out.println("First name: " + name1 + "\nSecond name: " + name2 + "\nID: " + id);

        System.out.println("The length of the First name: " + name1.length());
        System.out.println("The length of the First name: " + name2.length());
        System.out.println("The length of the First name: " + id.length());

        System.out.println("Full name: " + name1.concat(name2));

        String str1 = String.format("%d", 101);
        System.out.println(str1);*/

        byte[] bytes = name1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + ", ");
        }

    }
}
