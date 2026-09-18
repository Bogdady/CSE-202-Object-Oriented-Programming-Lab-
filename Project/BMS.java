
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

class UserAccount {

    private String name, accNum, pin, type, address, phnNum;
    private double balance;
    private ArrayList<String> history;

    public UserAccount(String name, String accNum, String pin,
            String type, double balance, String address, String phnNum) {

        this.name = name;
        this.accNum = accNum;
        this.pin = pin;
        this.type = type;
        this.balance = balance;
        this.address = address;
        this.phnNum = phnNum;

        history = new ArrayList<>();
        history.add("Account Created with $" + balance);
    }

    public String getName() {
        return name;
    }

    public String getAccNum() {
        return accNum;
    }

    public String getPin() {
        return pin;
    }

    public String getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String getPhnNum() {
        return phnNum;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getHistory() {
        return history;
    }

    public void deposit(double amount) {
        balance += amount;
        history.add("Deposit $" + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            history.add("Withdraw $" + amount);
            return true;
        }
        return false;
    }

    public void clearHistory() {
        history.clear();
    }

    public void addHistory(String entry) {
        history.add(entry);
    }
}

public class BMS extends JFrame {

    private ArrayList<UserAccount> accounts = new ArrayList<>();
    private UserAccount currentUser = null;

    private CardLayout cardLayout = new CardLayout();
    private JPanel mainPanel = new JPanel(cardLayout);

    Font titleFont = new Font("Times New Roman", Font.BOLD, 22);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 14);
    Color primary = new Color(1, 1, 1);
    Color backgroundColor = new Color(52, 58, 64);
    Color titleColor = new Color(255, 255, 255);

    public BMS() {

        setTitle("JB Bank Management System");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        loadFromFile();

        initLoginPage();
        initCreateAccountPage();
        initDashboardPage();

        add(mainPanel);
        setVisible(true);
    }

    private String generateAccountNumber() {
        int num = 10000000 + (int) (Math.random() * 90000000);
        return String.valueOf(num);
    }

    private JButton styledButton(String text) {
        JButton btn = new JButton(text);
        btn.setFocusPainted(false);
        btn.setBackground(primary);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        return btn;
    }

    private void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("bankData.txt"))) {

            for (UserAccount u : accounts) {
                writer.println(
                        u.getName() + "," + u.getAccNum() + "," + u.getPin() + "," + u.getType() + ","
                        + u.getBalance() + "," + u.getAddress() + "," + u.getPhnNum() + ","
                        + String.join("|", u.getHistory())
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("bankData.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length < 7) {
                    continue;
                }

                UserAccount user = new UserAccount(
                        data[0], data[1], data[2], data[3],
                        Double.parseDouble(data[4]), data[5], data[6]
                );

                user.clearHistory();

                if (data.length > 7) {
                    String[] h = data[7].split("\\|");
                    for (String s : h) {
                        user.addHistory(s);
                    }
                }
                accounts.add(user);
            }

        } catch (FileNotFoundException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initLoginPage() {

        JPanel outer = new JPanel(new GridBagLayout());
        outer.setBackground(backgroundColor);

        JPanel panel = new JPanel(new GridLayout(5, 1, 15, 15));
        panel.setPreferredSize(new Dimension(400, 250));
        panel.setBackground(backgroundColor);

        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\JAVA Code (OOP)\\jb logo.png");
        JLabel label1 = new JLabel(icon);

        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(100, 90, Image.SCALE_SMOOTH);
        label1.setIcon(new ImageIcon(scaledImg));

        JLabel title = new JLabel("WELCOME TO JB BANK", SwingConstants.CENTER);
        title.setForeground(titleColor);
        title.setFont(titleFont);

        JTextField accField = new JTextField();
        accField.setBorder(BorderFactory.createTitledBorder("Account Number"));

        JPasswordField pinField = new JPasswordField();
        pinField.setBorder(BorderFactory.createTitledBorder("PIN"));

        JPanel btnPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        btnPanel.setBackground(backgroundColor);

        JButton loginBtn = styledButton("Login");
        JButton createBtn = styledButton("Create Account");

        btnPanel.add(loginBtn);
        btnPanel.add(createBtn);

        panel.add(label1);
        panel.add(title);
        panel.add(accField);
        panel.add(pinField);
        panel.add(btnPanel);

        outer.add(panel);

        loginBtn.addActionListener(e -> {

            String acc = accField.getText();
            String p = new String(pinField.getPassword());

            for (UserAccount u : accounts) {
                if (u.getAccNum().equals(acc) && u.getPin().equals(p)) {
                    currentUser = u;
                    updateDashboard();
                    cardLayout.show(mainPanel, "dashboard");
                    return;
                }
            }

            JOptionPane.showMessageDialog(this, "Wrong Account or PIN");
        });

        createBtn.addActionListener(e -> cardLayout.show(mainPanel, "create"));

        mainPanel.add(outer, "login");
    }

    private void initCreateAccountPage() {

        JPanel outer = new JPanel(new GridBagLayout());
        outer.setBackground(backgroundColor);

        JPanel panel = new JPanel(new GridLayout(10, 1, 10, 10));
        panel.setPreferredSize(new Dimension(350, 500));
        panel.setBackground(backgroundColor);

        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\JAVA Code (OOP)\\jb logo.png");
        JLabel label1 = new JLabel(icon);

        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(100, 90, Image.SCALE_SMOOTH);
        label1.setIcon(new ImageIcon(scaledImg));

        JLabel ca = new JLabel("Create Account", SwingConstants.CENTER);
        ca.setFont(new Font("Times New Roman", Font.BOLD, 26));
        ca.setForeground(Color.WHITE);

        JTextField nameF = new JTextField();
        nameF.setBorder(BorderFactory.createTitledBorder("Full Name"));

        JTextField addressF = new JTextField();
        addressF.setBorder(BorderFactory.createTitledBorder("Address"));

        JTextField phnF = new JTextField();
        phnF.setBorder(BorderFactory.createTitledBorder("Phone Number"));

        JTextField pinF = new JTextField();
        pinF.setBorder(BorderFactory.createTitledBorder("PIN"));

        JComboBox<String> typeF = new JComboBox<>(new String[]{"Savings", "Current"});

        JLabel autoAcc = new JLabel("Account Number: Auto Generated", SwingConstants.CENTER);
        autoAcc.setFont(new Font("Times New Roman", Font.BOLD, 16));
        autoAcc.setForeground(Color.WHITE);

        JButton saveBtn = styledButton("Register");
        JButton backBtn = styledButton("Back");

        panel.add(label1);
        panel.add(ca);
        panel.add(nameF);
        panel.add(addressF);
        panel.add(phnF);
        panel.add(pinF);
        panel.add(typeF);
        panel.add(autoAcc);
        panel.add(saveBtn);
        panel.add(backBtn);

        outer.add(panel);

        saveBtn.addActionListener(e -> {

            String randomAcc = generateAccountNumber();

            accounts.add(new UserAccount(
                    nameF.getText(),
                    randomAcc,
                    pinF.getText(),
                    (String) typeF.getSelectedItem(),
                    500.0,
                    addressF.getText(),
                    phnF.getText()
            ));

            saveToFile();

            JOptionPane.showMessageDialog(this,
                    "Account Created\nAccount Number: " + randomAcc);

            cardLayout.show(mainPanel, "login");
        });

        backBtn.addActionListener(e -> cardLayout.show(mainPanel, "login"));

        mainPanel.add(outer, "create");
    }

    private JLabel balLbl, nameLbl;

    private void initDashboardPage() {

        JPanel outer = new JPanel(new GridBagLayout());
        outer.setBackground(backgroundColor);

        JPanel panel = new JPanel(new GridLayout(7, 1, 10, 15));
        panel.setPreferredSize(new Dimension(350, 350));
        panel.setBackground(backgroundColor);

        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\JAVA Code (OOP)\\jb logo.png");
        JLabel label1 = new JLabel(icon);

        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(100, 90, Image.SCALE_SMOOTH);
        label1.setIcon(new ImageIcon(scaledImg));

        nameLbl = new JLabel("", SwingConstants.CENTER);
        nameLbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
        nameLbl.setForeground(Color.WHITE);

        balLbl = new JLabel("", SwingConstants.CENTER);
        balLbl.setFont(new Font("Times New Roman", Font.BOLD, 16));
        balLbl.setForeground(Color.WHITE);

        JButton depBtn = styledButton("Deposit");
        JButton witBtn = styledButton("Withdraw");
        JButton histBtn = styledButton("History");
        JButton logoutBtn = styledButton("Logout");

        panel.add(label1);
        panel.add(nameLbl);
        panel.add(balLbl);
        panel.add(depBtn);
        panel.add(witBtn);
        panel.add(histBtn);
        panel.add(logoutBtn);

        outer.add(panel);

        depBtn.addActionListener(e -> {
            try {
                double amt = Double.parseDouble(JOptionPane.showInputDialog("Amount:"));
                currentUser.deposit(amt);
                saveToFile();
                updateDashboard();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid Input");
            }
        });

        witBtn.addActionListener(e -> {
            try {
                double amt = Double.parseDouble(JOptionPane.showInputDialog("Amount:"));

                if (currentUser.withdraw(amt)) {
                    saveToFile();
                    updateDashboard();
                } else {
                    JOptionPane.showMessageDialog(this, "Low Balance");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid Input");
            }
        });

        histBtn.addActionListener(e
                -> JOptionPane.showMessageDialog(this,
                        String.join("\n", currentUser.getHistory()))
        );

        logoutBtn.addActionListener(e -> cardLayout.show(mainPanel, "login"));

        mainPanel.add(outer, "dashboard");
    }

    private void updateDashboard() {
        nameLbl.setText("User: " + currentUser.getName() + " (" + currentUser.getType() + ")");
        balLbl.setText("Balance: $" + currentUser.getBalance());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BMS::new);
    }
}
