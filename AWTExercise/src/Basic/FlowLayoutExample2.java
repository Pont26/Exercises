package Basic;

import java.awt.*;    
import javax.swing.*;    

public class FlowLayoutExample2 {    
    JFrame f;    
    public FlowLayoutExample2() {    
        f = new JFrame();    
        
        // Set FlowLayout with left alignment and default 5-pixel gap
        f.setLayout(new FlowLayout(FlowLayout.LEFT));    
        
        // Add buttons to the frame
        f.add(new JButton("Button 1"));    
        f.add(new JButton("Button 2"));    
        f.add(new JButton("Button 3"));    
        
        f.setSize(300, 100);    
        f.setVisible(true);    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }    
    public static void main(String[] args) {    
        new FlowLayoutExample2();    
    }    
}
