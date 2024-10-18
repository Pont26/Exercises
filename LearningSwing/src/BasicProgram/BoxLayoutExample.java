package BasicProgram;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example");

        // Create a panel with vertical BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add label and text field for Name
        JPanel namePanel = new JPanel();
        namePanel.setBackground(Color.black);
        namePanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Align left
        namePanel.add(new JLabel("Name:"));
        namePanel.add(new JTextField(10));
        panel.add(namePanel);

        // Add label and text field for Email
        JPanel emailPanel = new JPanel();
        emailPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Align left
        emailPanel.add(new JLabel("Email:"));
        emailPanel.add(new JTextField(10));
        panel.add(emailPanel);
        
        JPanel PHonePanel=new JPanel();
        PHonePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        PHonePanel.add(new JLabel("Phone number: "));
        PHonePanel.add(new JTextField(10));

        // Add panel to the frame
        frame.add(panel);

        // Frame settings
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
