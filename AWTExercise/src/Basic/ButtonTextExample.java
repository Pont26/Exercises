package Basic;
import javax.swing.*;  // Importing the Swing package
import java.awt.event.*; // Importing event handling classes

public class ButtonTextExample {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Button Text Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set the size of the frame

        // Create a new button with initial text
        JButton button = new JButton("Click Me");

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Change the button text when clicked
                button.setText("Loading...");
            }
        });

        // Add the button to the frame
        frame.getContentPane().add(button); 
        frame.setVisible(true); // Make the frame visible
    }
}

