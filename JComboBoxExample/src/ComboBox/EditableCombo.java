package ComboBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EditableCombo extends JFrame{
	public EditableCombo() {
		
		JPanel panel=new JPanel();
	JComboBox<String> comboLanguage = new JComboBox<String>();
		
		//add items to combo box
		comboLanguage.addItem("English");
		comboLanguage.addItem("French");
		comboLanguage.addItem("Spanish");
		comboLanguage.addItem("Japanese");
		comboLanguage.addItem("Chinese");
		panel.add(comboLanguage);
		
		//add set Editable 
		comboLanguage.setEditable(true);
		
		add(panel);
		
		setSize(400,400);
		
		
		
		
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		EditableCombo editableCombo=new EditableCombo();
	}

}
