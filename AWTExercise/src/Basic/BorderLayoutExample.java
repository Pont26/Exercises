package Basic;
import java.awt.*;    
import javax.swing.*;    
    
public class BorderLayoutExample {  // Renamed the class to avoid conflicts
    JFrame f;    
    public BorderLayoutExample()  {    
        f = new JFrame();    
            
        // creating buttons  
        JButton b1 = new JButton("NORTH"); // the button will be labeled as NORTH   
        JButton b2 = new JButton("SOUTH"); // the button will be labeled as SOUTH  
        JButton b3 = new JButton("EAST");  // the button will be labeled as EAST  
        JButton b4 = new JButton("WEST");  // the button will be labeled as WEST  
        JButton b5 = new JButton("CENTER"); // the button will be labeled as CENTER  
            
        f.setLayout(new BorderLayout(52,10)); // Set the layout to BorderLayout
        f.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
        f.add(b2, BorderLayout.SOUTH); // b2 will be placed in the South Direction    
        f.add(b3, BorderLayout.EAST);  // b3 will be placed in the East Direction    
        f.add(b4, BorderLayout.WEST);  // b4 will be placed in the West Direction    
        f.add(b5, BorderLayout.CENTER); // b5 will be placed in the Center    
            
        f.setSize(300, 300);    
        f.setVisible(true);    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
    }    
    public static void main(String[] args) {    
        new BorderLayoutExample();    
    }    
}
