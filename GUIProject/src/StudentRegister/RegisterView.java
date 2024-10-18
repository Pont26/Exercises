package StudentRegister;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import java.awt.*;

public class RegisterView extends JPanel {
   private JButton submitButton,deleteButton,updateButton;
   private JTextField txtName, txtEmail, txtPh;
   private DefaultTableModel tableModel;
   private JTable table;
    public RegisterView() {
        setLayout(null);
        Label headerLabel = new Label("User Registration Form", Label.CENTER);
        headerLabel.setBounds(100, 40, 200, 30);
        add(headerLabel);
        
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(null);
        labelPanel.setBounds(50, 90, 100, 100);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(0, 0, 80, 25);
        labelPanel.add(nameLabel);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(0, 30, 80, 25);
        labelPanel.add(emailLabel);

        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(0, 60, 80, 25);
        labelPanel.add(phoneLabel);
        add(labelPanel);

        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(null);
        fieldPanel.setBounds(150, 90, 200, 100);

        txtName = new JTextField(15);
        txtName.setBounds(0, 0, 150, 25);
        fieldPanel.add(txtName);

        txtEmail = new JTextField(15);
        txtEmail.setBounds(0, 30, 150, 25);
        fieldPanel.add(txtEmail);

        txtPh = new JTextField(15);
        txtPh.setBounds(0, 60, 150, 25);
        fieldPanel.add(txtPh);
        add(fieldPanel);
        
   

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("Email");
        tableModel.addColumn("Phone Number");
        tableModel.addColumn("Action");
        table = new JTable(tableModel);
        add(new JScrollPane(table)).setBounds(50, 240, 500, 400);
        table.getColumn("Action").setCellRenderer(new ButtonRender());


        submitButton = new JButton("Submit");
        submitButton.setBounds(150, 200, 100, 30);
        add(submitButton);
        setVisible(true);
    }
    

    public class ButtonRender extends JButton implements TableCellRenderer{
    	public ButtonRender() {
    		setOpaque(true);
    	}

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			setText(value == null ? "Delete" : value.toString());
	        return this; 			
		}
    	
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public void setTxtName(JTextField txtName) {
        this.txtName = txtName;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JTextField getTxtPh() {
        return txtPh;
    }

    public void setTxtPh(JTextField txtPh) {
        this.txtPh = txtPh;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(JButton deleteButton) {
        this.deleteButton = deleteButton;
    }
}
