package Basic;

import java.awt.*;    
import javax.swing.*;    

public class GridLayoutExample2 {    
    JFrame f;    
    public GridLayoutExample2() {    
        f = new JFrame();    
            
        // creating buttons  
        JButton b1 = new JButton("Button 1");    
        JButton b2 = new JButton("Button 2");    
        JButton b3 = new JButton("Button 3");    
        JButton b4 = new JButton("Button 4");    
        JButton b5 = new JButton("Button 5");    
            
        // Setting GridLayout with 2 rows and 3 columns
        f.setLayout(new GridLayout(2, 3));    
        
        // Adding buttons to the frame
        f.add(b1);    
        f.add(b2);    
        f.add(b3);    
        f.add(b4);    
        f.add(b5);    
            
        f.setSize(400, 200);    
        f.setVisible(true);    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }    
    public static void main(String[] args) {    
        new GridLayoutExample2();    
    }    
}
