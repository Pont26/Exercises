package BasicProgram;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class MenuBar extends JFrame implements ActionListener{
	
	public MenuBar() {
		JMenuBar menuBar=new JMenuBar();
		JMenu menuFile=new JMenu("File");
		JMenuItem menuItemExit=new JMenuItem("Exit");
		menuFile.add(menuItemExit);
		
		menuBar.add(menuFile);
		
		setJMenuBar(menuBar);
		
		
		setSize(240,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocationRelativeTo(null);//frame to center
		//setExtendedState(JFrame.MAXIMIZED_BOTH);//to  maximized the frame
		//setLocation(100,100);//adjust the location of the frame
		//setLocation(new java.awt.Point(100,100));//another way to adjust the location 
		//setBounds(new java.awt.Rectangle(100,100,300,400));
		//pack();
		setAlwaysOnTop(true);//frame widnow always on top other windows
        Image icon = new ImageIcon("C:/Users/DELL/Pictures/Saved Pictures/photo_2024-04-01_22-25-49.jpg").getImage();
        setResizable(false);
        getContentPane().setBackground(Color.blue);//set frame color
      //  setUndecorated(true); //to remove border, title bar and whindow buttons
		setIconImage(icon);
		setVisible(true);
	}
	
	
	



	public static void main(String[] args) {
		new MenuBar();
	}

	




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
