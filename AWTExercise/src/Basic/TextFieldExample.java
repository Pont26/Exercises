package Basic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldExample {
    public static void main(String[] args) {
        JTextField myTextField = new JTextField(20); // Create a text field

        // Add an ActionListener to the text field
        myTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to run when Enter is pressed in the text field
                System.out.println("You entered: " + myTextField.getText());
            }
        });

        JFrame frame = new JFrame("Text Field Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(myTextField); // Add the text field to the frame
        frame.setSize(300, 100);
        frame.setVisible(true); // Show the frame
    }
}

