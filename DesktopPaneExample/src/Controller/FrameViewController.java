package Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.ContentView;
import View.FrameView;
import View.HomeView;
import View.MainApp;

public class FrameViewController {
	private FrameView frameView;
	private HomeView homeView;
	private ContentView contentView;
	
	public FrameViewController(FrameView frameView) {
		this.frameView = frameView;
		this.frameView.getHomeItem().addActionListener(new menuItemListener());
		this.frameView.getContentItem().addActionListener(new menuItemListener());
	}
	
	public class menuItemListener implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frameView.getContentPane().removeAll(); 
		if(e.getSource().equals(frameView.getHomeItem())) {
		    homeView = new HomeView();
            System.out.println("This is the home panel");
            frameView.getContentPane().add(homeView); 
          
		}else if(e.getSource().equals(frameView.getContentItem())) {
			contentView = new ContentView();
			System.out.println("This is content panel");
			frameView.getContentPane().add(contentView);
		}
		  frameView.revalidate();  
          frameView.repaint(); 
		
	}
	}
}

