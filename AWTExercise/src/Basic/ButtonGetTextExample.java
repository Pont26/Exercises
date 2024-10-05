package Basic;

import javax.swing.*;  // Importing the Swing package
import java.awt.event.*; // Importing event handling classes

public class ButtonGetTextExample {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Button Text Fetch Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set the size of the frame

        // Create a new button with initial text
        JButton myButton = new JButton("Click Me"); // Create a button with the label "Click Me"

     // Fetch the current label of the button
     String currentLabel = myButton.getLabel(); // This will return "Click Me"




  

        // Add the button to the frame
        frame.getContentPane().add(myButton);
        frame.setVisible(true); // Make the frame visible
    }
}
