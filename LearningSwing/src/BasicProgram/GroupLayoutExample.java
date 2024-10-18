package BasicProgram;
import javax.swing.*;
import java.awt.*;

public class GroupLayoutExample {

    public static void createAndShowGUI() {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("GroupLayout Example");
        frame.setLayout(new BorderLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        // Create a panel to hold the components
        JPanel panel = new JPanel();

        // Create labels and text fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(10);
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(10);

        // Create GroupLayout and set it for the panel
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        // Automatically create gaps between components
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Define the horizontal group (left to right)
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(emailLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(nameField)
                    .addComponent(emailField))
        );

        // Define the vertical group (top to bottom)
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField))
        );

        // Add the panel to the frame
        frame.add(panel,BorderLayout.CENTER);

        // Make the window visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // Creating and showing the application's GUI
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
