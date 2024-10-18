package View;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContentView extends JPanel{
	private JLabel label;
	public ContentView() {
		label=new JLabel("This is content View");
		this.add(label);
		this.setSize(500,500);
		this.setBackground(Color.blue);
		
	}
	

}
