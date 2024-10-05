package Basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Login extends Frame{
	
	public Login() {
		setSize(400,400);
		setTitle("Login");
		setLayout(null);
		
	    Label label1 = new Label("This is the Login Page");
	    label1.setBounds(100, 50, 200, 30);
	    add(label1);
	    
	    Label name = new Label("Name: ");
	    name.setBounds(50, 100, 100, 30); 
	    add(name);
	    
	    TextField txtName = new TextField();
	    txtName.setBounds(150, 100, 200, 30);
	    add(txtName);
	    
	    Label email = new Label("Email: ");
	    email.setBounds(50, 150, 100, 30); 
	    add(email);
	    
	    TextField textEmail = new TextField();
	    textEmail.setBounds(150, 150, 200, 30);
	    add(textEmail);
	    
	    Button submit = new Button("Submit");
	    submit.setBounds(100, 200, 80, 30);
	    add(submit);
	    
	    Button cancel = new Button("Cancel");
	    cancel.setBounds(200, 200, 80, 30); 
	    add(cancel);
		
		
		
		setVisible(true);
	}

}
