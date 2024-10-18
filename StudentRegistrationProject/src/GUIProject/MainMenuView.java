package GUIProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainMenuView extends JFrame {
    private JButton submitButton;
    private JTextField txtName, txtEmail, txtPh;
    private JMenu home;
    private JLabel name, email, ph;
    JPanel panel1;

    public MainMenuView() {
        super("Main Page");

        // Menu setup
        JMenuBar menuBar = new JMenuBar();
        home = new JMenu("Home");
        JMenu register = new JMenu("Register");
        JMenuItem menuItemRegister = new JMenuItem("Student Register");
        register.add(menuItemRegister);

        setLayout(new BorderLayout());
        menuBar.add(home);
        menuBar.add(register);
        setJMenuBar(menuBar);

        // Title Label
        JLabel title = new JLabel("Register");
        title.setHorizontalAlignment(JLabel.CENTER);
        add(title, BorderLayout.NORTH);
   
 
        // Panel for input fields
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(300, 100));
        panel1.setBackground(Color.black);
        panel1.setLayout(new GridLayout(3, 1, 10, 10));

        name = new JLabel("Name: ");
        txtName = new JTextField(15);
        panel1.add(name);
        panel1.add(txtName);

        email = new JLabel("Email: ");
        txtEmail = new JTextField(15);
        panel1.add(email);
        panel1.add(txtEmail);

        ph = new JLabel("Phone Number: ");
        txtPh = new JTextField(15);
        panel1.add(ph);
        panel1.add(txtPh);

        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(Color.BLUE);
        submitButton = new JButton("Submit");
        btnPanel.add(submitButton);

        JPanel wrapperPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        wrapperPanel.setBackground(Color.red);
        wrapperPanel.add(panel1);
        wrapperPanel.add(btnPanel);
        add(wrapperPanel, BorderLayout.CENTER);


        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public JMenu getMainMenu() {
        return home;
    }
    
    public static void main(String[] args) {
    	new MainMenuView();
    }
}
