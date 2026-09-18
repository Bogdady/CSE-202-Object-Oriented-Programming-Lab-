
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class JB_ATM_System extends JFrame {

    private HashMap<String, Account> accounts = new HashMap<>();
    private String currentAccountNum = "";
    private Color bgColor = new Color(44, 62, 80);
    private final String DATA_FILE = "atm_data.txt";

    public JB_ATM_System() {
        loadDataFromFile();
        setTitle("JB BANK LTD. ATM");
        setSize(850, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        showLoginPage();
    }

    private void saveDataToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DATA_FILE))) {
            for (String accNum : accounts.keySet()) {
                Account acc = accounts.get(accNum);
                String historyStr = (acc.history.isEmpty()) ? "None" : String.join(";", acc.history);
                bw.write(accNum + "," + acc.name + "," + acc.pin + "," + acc.balance + "," + historyStr);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadDataFromFile() {
        File file = new File(DATA_FILE);
        if (!file.exists()) {
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    Account acc = new Account(parts[1], parts[2], Double.parseDouble(parts[3]));
                    if (parts.length == 5 && !parts[4].equals("None")) {
                        acc.history = new ArrayList<>(Arrays.asList(parts[4].split(";")));
                    }
                    accounts.put(parts[0], acc);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // --- LOGIN PAGE FIXED ---
    private void showLoginPage() {
        JPanel panel = createBasePanel();

        JLabel title = new JLabel("WELCOME TO JB BANK LTD.", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 32));
        title.setForeground(Color.WHITE);
        title.setBounds(100, 50, 650, 60);

        // Account Label
        JLabel lblAcc = new JLabel("Account Number:");
        lblAcc.setForeground(Color.WHITE);
        lblAcc.setFont(new Font("Arial", Font.PLAIN, 16));
        lblAcc.setBounds(250, 160, 150, 30); // Jayga thik kora hoyeche

        JTextField accField = new JTextField();
        accField.setBounds(380, 160, 200, 30);

        // PIN Label
        JLabel lblPin = new JLabel("Pin Number:");
        lblPin.setForeground(Color.WHITE);
        lblPin.setFont(new Font("Arial", Font.PLAIN, 16));
        lblPin.setBounds(250, 210, 150, 30); // Jayga thik kora hoyeche

        JPasswordField pinField = new JPasswordField();
        pinField.setBounds(380, 210, 200, 30);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(380, 260, 100, 35);

        JButton createBtn = new JButton("Create Account");
        createBtn.setBounds(350, 310, 160, 35);

        // Panel-e add kora
        panel.add(title);
        panel.add(lblAcc);
        panel.add(accField);
        panel.add(lblPin);
        panel.add(pinField);
        panel.add(loginBtn);
        panel.add(createBtn);

        loginBtn.addActionListener(e -> {
            String acc = accField.getText();
            String pin = new String(pinField.getPassword());
            if (accounts.containsKey(acc) && accounts.get(acc).pin.equals(pin)) {
                currentAccountNum = acc;
                showHomePage();
            } else {
                JOptionPane.showMessageDialog(this, "Login Failed! Check Acc/PIN.");
            }
        });

        createBtn.addActionListener(e -> showRegistrationPage());
        updateFrame(panel);
    }

    // --- REGISTRATION PAGE ---
    private void showRegistrationPage() {
        JPanel panel = createBasePanel();
        JLabel title = new JLabel("Create Account", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setForeground(Color.WHITE);
        title.setBounds(300, 30, 250, 40);

        String[] labels = {"Full Name:", "Account Number:", "New PIN:", "Initial Deposit:"};
        JTextField[] fields = new JTextField[4];

        for (int i = 0; i < labels.length; i++) {
            JLabel lbl = new JLabel(labels[i]);
            lbl.setForeground(Color.WHITE);
            lbl.setBounds(230, 100 + (i * 50), 150, 30);
            fields[i] = new JTextField();
            fields[i].setBounds(380, 100 + (i * 50), 200, 30);
            panel.add(lbl);
            panel.add(fields[i]);
        }

        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(380, 320, 150, 40);

        submitBtn.addActionListener(e -> {
            try {
                Account nAcc = new Account(fields[0].getText(), fields[2].getText(), Double.parseDouble(fields[3].getText()));
                accounts.put(fields[1].getText(), nAcc);
                saveDataToFile();
                JOptionPane.showMessageDialog(this, "Account Created!");
                showLoginPage();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error!");
            }
        });

        panel.add(title);
        panel.add(submitBtn);
        updateFrame(panel);
    }

    // --- HOME PAGE ---
    private void showHomePage() {
        JPanel panel = createBasePanel();
        JLabel welcome = new JLabel("Transaction Menu", SwingConstants.CENTER);
        welcome.setFont(new Font("Arial", Font.BOLD, 26));
        welcome.setForeground(Color.WHITE);
        welcome.setBounds(250, 40, 350, 40);
        panel.add(welcome);

        String[] menu = {"DEPOSIT", "WITHDRAW", "CHECK BALANCE", "HISTORY", "EXIT"};
        int y = 120;
        for (String text : menu) {
            JButton btn = new JButton(text);
            btn.setBounds(300, y, 250, 40);
            panel.add(btn);
            y += 60;
            btn.addActionListener(e -> {
                Account user = accounts.get(currentAccountNum);
                if (text.equals("EXIT")) {
                    showLoginPage(); 
                }else if (text.equals("CHECK BALANCE")) {
                    JOptionPane.showMessageDialog(this, "Balance: $" + user.balance); 
                }else if (text.equals("DEPOSIT") || text.equals("WITHDRAW")) {
                    String valStr = JOptionPane.showInputDialog("Enter Amount:");
                    if (valStr != null) {
                        double val = Double.parseDouble(valStr);
                        if (text.equals("DEPOSIT")) {
                            user.balance += val; 
                        }else {
                            user.balance -= val;
                        }
                        user.history.add(text + ": " + val);
                        saveDataToFile();
                    }
                } else if (text.equals("HISTORY")) {
                    JOptionPane.showMessageDialog(this, String.join("\n", user.history));
                }
            });
        }
        updateFrame(panel);
    }

    private JPanel createBasePanel() {
        JPanel p = new JPanel(null);
        p.setBackground(bgColor);
        return p;
    }

    private void updateFrame(JPanel p) {
        setContentPane(p);
        revalidate();
        repaint();
    }

    class Account {

        String name, pin;
        double balance;
        ArrayList<String> history = new ArrayList<>();

        Account(String n, String p, double b) {
            name = n;
            pin = p;
            balance = b;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JB_ATM_System().setVisible(true));
    }
}
