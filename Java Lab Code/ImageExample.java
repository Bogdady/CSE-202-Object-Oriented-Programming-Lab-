
import javax.swing.*;

public class ImageExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Display Image");

        // 1. Create the icon from a file path
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\New folder (2)\\Java\\Java 2\\jb logo.png");

        // 2. Put the icon in a label
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
