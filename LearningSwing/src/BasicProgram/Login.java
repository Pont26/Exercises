package BasicProgram;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame implements ActionListener {
	private JTextField name;
	private JTextField passWord;
	private JButton btn;
	public Login() {
		
		super("Login");
		setLayout(new GridLayout(3,1,0,0));
        add(new JLabel("Login Page", SwingConstants.CENTER));

		
		JPanel panel=new JPanel();
		 name = new JTextField(15); 
	     panel.add(new JLabel("Username:"));
	     panel.add(name);
	     add(panel);
	     panel.add(new JLabel("Password: "));
	     passWord = new JTextField(15);
	     panel.add(passWord);
	      btn=new JButton("submit");
	     panel.add(btn);
	     btn.addActionListener(this);

		setSize(300,300);
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
	        if(passWord.getText().equals("123")) {
	        	String Message = "Login sucessfully";
	        	JOptionPane.showMessageDialog(this, Message);
	        }else {
	        	String Message = "Try again, Password:  " + passWord.getText()  +" is not correct";
	        	JOptionPane.showMessageDialog(this, Message);
	        	
	        }
		}
		
	}
	
	public static void main(String[] args) {
		new Login();
	}

}
