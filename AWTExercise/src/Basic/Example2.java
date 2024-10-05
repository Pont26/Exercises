package Basic;

import java.awt.Button;
import java.awt.Frame;

public class Example2 {
	public Example2() {
		//create Frame
		Frame frame=new Frame();
		Button btn=new Button("this is button");
		btn.setBounds(20,100,80,30);
	frame.add(btn);
		
		frame.setSize(400,300);
		frame.setTitle("Another way to create frame");
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
