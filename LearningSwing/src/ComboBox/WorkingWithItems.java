package ComboBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WorkingWithItems extends JFrame{
	public WorkingWithItems() {
		String[] bookTitles = new String[] {"Effective Java", "Head First Java", "Thinking in Java"};
		 JPanel panel=new JPanel();
		JComboBox<String> bookList = new JComboBox<String>(bookTitles);
		//to add more book
		bookList.addItem("Java I/O");
		//to remove book
		bookList.removeItem("Java I/O");
		//remove all item
		bookList.removeAllItems();
		
		setSize(400,400);
		panel.add(bookList);
		add(panel);
		setVisible(true);
		
		
	}
	
	public static void main(String [] args) {
		WorkingWithItems workingWithItems=new WorkingWithItems();
	}

}
