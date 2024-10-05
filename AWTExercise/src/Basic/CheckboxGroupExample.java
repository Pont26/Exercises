package Basic;

import java.awt.*;

public class CheckboxGroupExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Checkbox Group Example");
        frame.setLayout(new FlowLayout());

        // Create a CheckboxGroup
        CheckboxGroup group = new CheckboxGroup();

        // Create checkboxes with the group
        Checkbox option1 = new Checkbox("Option 1", false, group);
        Checkbox option2 = new Checkbox("Option 2", false, group);
        Checkbox option3 = new Checkbox("Option 3", true, group); // Initially checked

        // Add checkboxes to the frame
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);

        frame.setSize(300, 200);
        frame.setVisible(true);

        // Close the application when the frame is closed
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
