package View;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FrameView extends JFrame{
	 private JDesktopPane desktopPane;
	    private JMenuBar menuBar;
	    private JMenu homeMenu, contentMenu;
	    private JMenuItem homeItem, contentItem;

	    public FrameView() {
	      

	     
	        menuBar = new JMenuBar();
	        homeMenu = new JMenu("Home");
	        homeItem = new JMenuItem("Home");
	        homeMenu.add(homeItem);
	        menuBar.add(homeMenu);

	        contentMenu = new JMenu("Content");
	        contentItem = new JMenuItem("Content");
	        contentMenu.add(contentItem);
	        menuBar.add(contentMenu);

	       
	        desktopPane = new JDesktopPane();
	      

	        this.setJMenuBar(menuBar);
	        this.add(desktopPane);

	        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	        this.setVisible(true);
	    }

	    public JMenuItem getHomeItem() {
	        return homeItem;
	    }

	    public JMenuItem getContentItem() {
	        return contentItem;
	    }

}
