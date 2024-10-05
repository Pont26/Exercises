package ComboBox;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Basic extends JFrame{
	public Basic() {
		//case 1
		
	       JPanel panel=new JPanel();
		//create empty combo box
		JComboBox<String> comboLanguage = new JComboBox<String>();
		
		//add items to combo box
		comboLanguage.addItem("English");
		comboLanguage.addItem("French");
		comboLanguage.addItem("Spanish");
		comboLanguage.addItem("Japanese");
		comboLanguage.addItem("Chinese");
		
		
		//case2
		
		//define item in Array
		String[] languages = new String[] {"English", "French", "Spanish", "Japanese", "Chinese"};
		// create a combo box with the fixed array
		JComboBox<String> comboLanguage2 = new JComboBox<String>(languages);
		
		//case3
		//Vector collection
		Vector<String> languages2 = new Vector<String>();
		languages2.addElement("English");
		languages2.addElement("French");
		languages2.addElement("Spanish");
		languages2.addElement("Japanese");
		languages2.addElement("Chinese");
		// create a combo box with the given vector
		JComboBox<String> comboLanguage3 = new JComboBox<String>(languages);
		
		//case4
		JComboBox<Language> jobList = new JComboBox<Language>();
		jobList.addItem(new Language("English"));
		jobList.addItem(new Language("French"));
		jobList.addItem(new Language("Spanish"));
		jobList.addItem(new Language("Japanese"));
	
		

		
		setLayout(new BorderLayout());
		panel.add(comboLanguage,BorderLayout.CENTER);
		add(panel);
		
		setSize(300,300);
		setVisible(true);

		
	}
	class Language {
	    private String LanguageName;
	 
	    public Language(String LanguageName) {
	        this.LanguageName = LanguageName;
	    }
	 
	    public String toString() {
	        return this.LanguageName;
	    }
	}
	
	
	public static void main(String[]args) {
		Basic example1=new Basic();
		
		}

}
