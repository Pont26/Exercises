package BasicProgram;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class WaterApp extends JFrame implements ActionListener{
	private JLabel labelQuestion;
	private JLabel labelWeight;
	private JTextField fieldWeight;
	private JButton buttonTellMe;
	public WaterApp() {
		super("Water Calculator");
		
		initComponents();
		setSize(240,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//method for initComponents()
	private void initComponents() {
		  labelQuestion = new JLabel("How much water should I drink?");
	        labelWeight = new JLabel("My weight (kg):");
	        fieldWeight = new JTextField(5);
	        buttonTellMe = new JButton("Tell Me");
	 
	        setLayout(new FlowLayout());
	 
	        add(labelQuestion);
	        add(labelWeight);
	        add(fieldWeight);
	        add(buttonTellMe);
	 
	        buttonTellMe.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    String message = "You should drink %.2f liters of water."; // Use a format specifier
	    float weight = Float.parseFloat(fieldWeight.getText());
	    float waterAmount = (weight / 10f) * 0.4f; 
	    
	    message = String.format(message, waterAmount);
	    JOptionPane.showMessageDialog(this, message);
	}

	
	public static void main(String[] args) {
		new WaterApp();
	}

}
