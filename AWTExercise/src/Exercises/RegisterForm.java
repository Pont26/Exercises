package Exercises;

import java.awt.*;
import java.awt.event.*;

public class RegisterForm extends Frame implements ActionListener {
    Button submitButton;
    TextField txtName, txtEmail, txtPh;
    TextArea txtArea;

    public RegisterForm() {
        setTitle("Register Form");
        setLayout(null);  

        Label headerLabel = new Label("User Registration Form", Label.CENTER);
        headerLabel.setBounds(100, 40, 200, 30);  
        add(headerLabel);

        Panel labelPanel = new Panel();
        labelPanel.setLayout(null);  
        labelPanel.setBounds(50, 90, 100, 180);  

        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(0, 0, 80, 25);
        labelPanel.add(nameLabel);

        Label emailLabel = new Label("Email:");
        emailLabel.setBounds(0, 30, 80, 25);
        labelPanel.add(emailLabel);

        Label phoneLabel = new Label("Phone Number:");
        phoneLabel.setBounds(0, 60, 80, 25);
        labelPanel.add(phoneLabel);

        Label addressLabel = new Label("Address:");
        addressLabel.setBounds(0, 90, 80, 25);
        labelPanel.add(addressLabel);

        add(labelPanel); 

        Panel fieldPanel = new Panel();
        fieldPanel.setLayout(null);  
        fieldPanel.setBounds(150, 90, 200, 180);  

        txtName = new TextField(15); 
        txtName.setBounds(0, 0, 150, 25);  
        fieldPanel.add(txtName);

        txtEmail = new TextField(15); 
        txtEmail.setBounds(0, 30, 150, 25); 
        fieldPanel.add(txtEmail);

        txtPh = new TextField(15); 
        txtPh.setBounds(0, 60, 150, 25);  
        fieldPanel.add(txtPh);

        txtArea = new TextArea( 2, 15);
        txtArea.setBounds(0, 90, 150, 50);  
        fieldPanel.add(txtArea);

        add(fieldPanel); 

        submitButton = new Button("Submit");
        submitButton.setBounds(150, 280, 80, 30);
        submitButton.addActionListener(this);
        add(submitButton);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setSize(400, 350);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            System.out.println("clicked");
        }
    }

    public static void main(String[] args) {
        new RegisterForm();
    }
}
