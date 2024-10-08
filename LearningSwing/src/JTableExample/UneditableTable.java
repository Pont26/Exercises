package JTableExample;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

import Exercise.Register;

public class UneditableTable extends JFrame{
	
	public UneditableTable() {
		
	    super("UnEditable Table");
		//Header for the table
		String[] columns = new String[] {"Name", "Email", "Phone Number"};
		
		Object[][] data=new Object[][] {
			{"Pone Pone", "nyein@gmailecom","0114848986"},
			{"Ju", "ju@gmailcom","78555"},
			{"Zaw", "zaw@gmailcom","1024552"},
		};
		
		JTable table=new JTable(data,columns);
		this.add(new JScrollPane(table));
		
		
		
		
		
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//for thread safety
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new UneditableTable();
			}
			
		});
		
		
	}

}
