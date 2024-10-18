package JDBCView;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import JDBC.EmployeeDao2;


public class EmployeeRegisterView extends RegisterView{
	private DefaultTableModel tableModel;
	private JTable table;
	private JButton submitButton;

	public EmployeeRegisterView() {
		
		 submitButton = new JButton("Submit");
	        submitButton.setBounds(150, 200, 100, 30);
	        add(submitButton);
	        
		 tableModel = new DefaultTableModel();
	        tableModel.addColumn("Name");
	        tableModel.addColumn("Email");
	        tableModel.addColumn("Phone Number");
	        tableModel.addColumn("Action");
	        table = new JTable(tableModel);
	        add(new JScrollPane(table)).setBounds(50, 250, 500, 400);
	        table.getColumn("Action").setCellRenderer(new ButtonRender());
	        table.getColumn("Action").setCellEditor(new ButtonEditor(new JButton("Delete")));	
	}
	   public class ButtonRender extends JButton implements TableCellRenderer{
	    	public ButtonRender() {
	    		setOpaque(true);
	    	}

			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
					int row, int column) {
				setText(value == null ? "Delete": value.toString());
				return this;
			}
			}
	   public class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
	        private JButton button;
	        private int row;

	        public ButtonEditor(JButton button) {
	            this.button = button;
	            this.button.addActionListener(this);
	        }

	        @Override
	        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
	            this.row = row;
	            button.setText(value == null ? "Delete" : value.toString());
	            return button;
	        }

	        @Override
	        public Object getCellEditorValue() {
	            return button.getText();
	        }

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            tableModel.removeRow(row);
	            fireEditingStopped();
	        }

	    }
			
	 public JButton getSubmitButton() {
	        return submitButton;
	    }

	    public void setSubmitButton(JButton submitButton) {
	        this.submitButton = submitButton;
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

}
