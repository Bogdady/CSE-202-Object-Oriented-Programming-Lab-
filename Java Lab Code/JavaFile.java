/*public class JavaFile {

    public static void main(String[] args) {
        File file = new File("XYZ.txt");
        try {
            boolean value = file.createNewFile();
            if (value == true) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
        }
    }
}*/
//File write
/*public class JavaFile {

    public static void main(String[] args) {
        try {
            FileWriter mywriter = new FileWriter("XYZ.txt");
            mywriter.write("My name is Jonayet Bogdady! Hello Jonayet Bogdady!");
            mywriter.close();

            System.out.println("Succesfully wrote!");
        } catch (Exception e) {
        }
    }
}*/

 /*public class JavaFile {

    public static void main(String[] args) {
        try {
            File file = new File("XYZ.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();

            System.out.println("Succesfully read!");
        } catch (Exception e) {
        }
    }
}*/
 /*public class JavaFile {

    public static void main(String[] args) {
        File myObj = new File("XYZ.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}*/

 /*public class JavaFile {

    public static void main(String[] args) {
        File file = new File("ABC.txt");

        try {
            boolean value = file.createNewFile();
            boolean value2 = file.exists();
            boolean value3 = file.canRead();
            boolean value4 = file.canWrite();
            boolean value5 = file.canExecute();
            if (value3 == true) {
                System.out.println("File created");
            } else {
                System.out.println("File not created.");
            }
        } catch (Exception e) {
        }
    }
}*/
 /*public class JavaFile {

    public static void main(String[] args) {
        File file = new File("XYZ.txt");
        try {
            boolean value2 = file.createNewFile();
            boolean value = file.delete();
            if (value == true) {
                System.out.println("File deleted");
            } else {
                System.out.println("File does not exist.");
            }
        } catch (Exception e) {
        }
    }
}*/
import java.io.*;

public class JavaFile {

    static void fileread() throws IOException {
        File file = new File("XYZ.txt");
        file.createNewFile();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }

    public static void main(String[] args) {
        try {
            fileread();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
