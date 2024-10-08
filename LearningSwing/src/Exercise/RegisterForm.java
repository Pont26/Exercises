package Exercise;

import java.awt.Button;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class RegisterForm extends JFrame implements ActionListener{
	  Button submitButton;
	    TextField txtName, txtEmail, txtPh;
	    DefaultTableModel tableModel;
	    JTable table;
	  


	    public RegisterForm() {
	        setTitle("Register Form");
	        setLayout(null);  

	        Label headerLabel = new Label("User Registration Form", Label.CENTER);
	        headerLabel.setBounds(100, 40, 200, 30);  
	        add(headerLabel);

	        Panel labelPanel = new Panel();
	        labelPanel.setLayout(null);  
	        labelPanel.setBounds(50, 90, 100, 100);  

	        Label nameLabel = new Label("Name:");
	        nameLabel.setBounds(0, 0, 80, 25);
	        labelPanel.add(nameLabel);

	        Label emailLabel = new Label("Email:");
	        emailLabel.setBounds(0, 30, 80, 25);
	        labelPanel.add(emailLabel);

	        Label phoneLabel = new Label("Phone Number:");
	        phoneLabel.setBounds(0, 60, 80, 25);
	        labelPanel.add(phoneLabel);
	        add(labelPanel); 

	        Panel fieldPanel = new Panel();
	        fieldPanel.setLayout(null);  
	        fieldPanel.setBounds(150, 90, 200, 100);  

	        txtName = new TextField(15); 
	        txtName.setBounds(0, 0, 150, 25);  
	        fieldPanel.add(txtName);

	        txtEmail = new TextField(15); 
	        txtEmail.setBounds(0, 30, 150, 25); 
	        fieldPanel.add(txtEmail);

	        txtPh = new TextField(15); 
	        txtPh.setBounds(0, 60, 150, 25);  
	        fieldPanel.add(txtPh);
	        add(fieldPanel); 
	        
	         tableModel = new DefaultTableModel();
	         tableModel.addColumn("Name");
	         tableModel.addColumn("Email");
	         tableModel.addColumn("Phone Number");
	        table = new JTable(tableModel);
	        add(new JScrollPane(table)).setBounds(50, 240, 300, 100);
			

	        submitButton = new Button("Submit");
	        submitButton.setBounds(150, 200, 100, 30); 
	        submitButton.addActionListener(this);
	        add(submitButton);

	        addWindowListener(new WindowAdapter() {
	            @Override
	            public void windowClosing(WindowEvent e) {
	                dispose();
	            }
	        });

	        setSize(400, 400);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	 
	        if (e.getSource() == submitButton) {
	        	if (!txtName.getText().isEmpty() && !txtEmail.getText().isEmpty() && !txtPh.getText().isEmpty()) {
	        	 Register register = new Register(txtName.getText(), txtEmail.getText(), txtPh.getText());
	        	 String[] data = new String[] {register.getName(), register.getEmail(), register.getPh()};
	        	  tableModel.addRow(data);
	        	  System.out.println("Form Submitted: " + register.toString());
	        	}
	        	    txtName.setText("");
	                txtEmail.setText("");
	                txtPh.setText("");
	        }
	    }

	    public static void main(String[] args) {
	        new RegisterForm();
	    }

}
