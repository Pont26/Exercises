package Basic;
import java.awt.*;

public class Example1 extends Frame{
	
	//constructor
	 Example1() {
		
		//create a button
		Button button=new Button("Click Me");
		
		//setButton's bounds size
		button.setBounds(100,100,80,30);
		
		//add button into frame
		add(button);
		
		//set frame size
		setSize(300,300);
		
		//set title of Frame
		setTitle("This is our basic AWT example");
		
		//no layout Manager
		setLayout(null);
		setVisible(true);
	}

}
