package StudentRegister;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FrameView extends JFrame{
	private JMenuBar menuBar;
	private JMenu homeMenu,registerMenu;
	private JMenuItem homeItem,studentRegisterMenuItem;
	private JDesktopPane desktopPane;
	
	public FrameView() {
		
		super("Frame");
		menuBar = new JMenuBar();
		homeMenu = new JMenu("Home");
		homeItem = new JMenuItem("Home");
		registerMenu = new JMenu("Register");
		studentRegisterMenuItem = new JMenuItem("Student register");
		homeMenu.add(homeItem);
		registerMenu.add(studentRegisterMenuItem);
		menuBar.add(homeMenu);
		menuBar.add(registerMenu);		
		this.setJMenuBar(menuBar);
	
		desktopPane=new JDesktopPane();
		this.add(desktopPane);
		

		this.setExtendedState(JFrame. MAXIMIZED_BOTH);
		this.setVisible(true);
	}
	
	public JMenuItem getHomeItem() {
		return homeItem;
	}
	
	public JMenuItem getStudentRegisterMenuItem() {
		return studentRegisterMenuItem;
	}
	

}
