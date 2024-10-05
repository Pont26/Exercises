package BasicProgram;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

public class WindowAdapterExample extends JFrame {
    public WindowAdapterExample() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenu editmenu = new JMenu("Edit");

        // Adding window listener for close confirmation
        MyWindowListener listener = new MyWindowListener();
        addWindowListener(listener);

        // Adding menus to the menu bar
        menuBar.add(menu);
        menuBar.add(editmenu);
        setJMenuBar(menuBar);

        // Frame settings
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // Override default close behavior
    }
    
 

    // Custom window listener class to handle window closing event
    class MyWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent event) {
            // Display confirmation dialog when closing the window
            int reply = JOptionPane.showConfirmDialog(WindowAdapterExample.this, "Are you sure you want to quit?","Exit", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

            // Handle response
            if (reply == JOptionPane.YES_OPTION) {
                dispose(); // Close the application
            }
            // No need for 'else', just return to avoid closing
        }
    }


  

    public static void main(String[] args) {
        new WindowAdapterExample();
    }
}
