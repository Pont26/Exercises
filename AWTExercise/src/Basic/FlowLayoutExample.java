package Basic;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("GridLayout with FlowLayout Panel Example");
        Label text = new Label("Register form", Label.CENTER);
        frame.setLayout(new BorderLayout());
        frame.add(text, BorderLayout.NORTH);

        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); 
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel(new GridLayout(5, 2, 5, 5)); 
       // panel1.setBackground(Color.blue);

        // Create text fields and set sizes
        JTextField nameField = new JTextField(10);
        nameField.setPreferredSize(new Dimension(120, 15)); // Adjusted size
      

        JTextField emailField = new JTextField(10);
        emailField.setPreferredSize(new Dimension(120, 25));
        emailField.setMaximumSize(new Dimension(120, 25));

        JTextField phoneField = new JTextField(10);
        phoneField.setPreferredSize(new Dimension(120, 25));
        phoneField.setMaximumSize(new Dimension(120, 25));

        JTextArea addressArea = new JTextArea(2, 10);
        addressArea.setPreferredSize(new Dimension(120, 50)); // Adjusted size
   

        // Add labels and fields to panel1
        panel1.add(new JLabel("Name:"));
        panel1.add(nameField);

        panel1.add(new JLabel("Email:"));
        panel1.add(emailField);

        panel1.add(new JLabel("Phone Number:"));
        panel1.add(phoneField);

        panel1.add(new JLabel("Address:"));
        panel1.add(addressArea);

        // Add panels to containerPanel
        containerPanel.add(panel1);
        
        JPanel submit = new JPanel();
        submit.add(new JButton("Submit")); 

        frame.add(containerPanel, BorderLayout.CENTER);
        frame.add(submit, BorderLayout.SOUTH);
        
        frame.add(containerPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
