
/*import java.util.*;

class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = {1, 2, 3, 4, 5};

        try {
            int d = a / b;
            System.out.println("Division is " + d);
            System.out.println("Element at index 6: " + arr[6]);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}*/
//Finnaly block 
/*class practice {

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};

        try {
            System.out.println(num[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("You should not access out of bound index");
        }
    }
}*/
//Throw and throws
//throw
/*class practice {

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}*/
//thwrows
/*class practice {

    public static void readfile() throws IOException {
        FileReader file = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(file);
        br.close();
    }

    public static void main(String[] args) {
        try {
            readfile();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}*/
//Custom Exception
/*class ImporovementNotAllowedException extends Exception {

    public ImporovementNotAllowedException(String m) {
        super(m);
    }
}

class practice {

    String name, course, midMarks;

    public static void checkImprovementEligibility(int mark) throws ImporovementNotAllowedException {
        if (mark > 12) {
            throw new ImporovementNotAllowedException("You are not eligible for exam");
        } else if (mark <= 5) {
            System.out.println("You must attend redimal class");
        } else {
            System.out.println("You are eligible");
        }
    }

    public static void main(String[] args) {

        try {
            checkImprovementEligibility(4);
        } catch (ImporovementNotAllowedException e) {
            System.out.println(e);
        }
    }
}*/
public class practice {

    String toHex(int num) {
        String hex = "";

        while (num != 0) {
            int rem = num % 16;

            hex = rem + hex;
            num = num / 16;
        }

        return hex;
    }

    public static void main(String[] args) {
        practice p = new practice();
        System.out.println(p.toHex(19)); // Output: 13
    }
}
