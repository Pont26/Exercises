package Basic;

import java.awt.*;    
import javax.swing.*;    

public class FlowLayoutExample1 {    
    JFrame f;    
    public FlowLayoutExample1() {    
        f = new JFrame();    
        
        // Set FlowLayout with default (center alignment, 5-pixel gap)
        f.setLayout(new FlowLayout());    
        
        // Add buttons to the frame
        f.add(new JButton("Button 1"));    
        f.add(new JButton("Button 2"));    
        f.add(new JButton("Button 3"));    
        
        f.setSize(300, 100);    
        f.setVisible(true);    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }    
    public static void main(String[] args) {    
        new FlowLayoutExample1();    
    }    
}
