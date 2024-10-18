package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import StudentRegister.FrameView;
import StudentRegister.HomeView;
import StudentRegister.RegisterView;

 
 public class FrameViewController {
	    private FrameView frameView;
	    private HomeView homeView;
	    private RegisterController registerController;
	    private RegisterView registerView;

	    public FrameViewController(FrameView frameView) {
	        this.frameView = frameView;
	        this.frameView.getHomeItem().addActionListener(new menuItemListener());
	        this.frameView.getStudentRegisterMenuItem().addActionListener(new menuItemListener());
	    }

	    public class menuItemListener implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {

	        	frameView.getContentPane().removeAll(); 
	    		if(e.getSource().equals(frameView.getHomeItem())) {
	    		    homeView = new HomeView();
	                System.out.println("This is the home panel");
	                frameView.getContentPane().add(homeView); 
	              
	    		}else if(e.getSource().equals(frameView.getStudentRegisterMenuItem())) {
	    			registerView = new RegisterView();
	    			RegisterController controller = new RegisterController(registerView);
	    			System.out.println("This is content panel");
	    			frameView.getContentPane().add(registerView);
	    		}
	    		  frameView.revalidate();  //get the frame ready to change
	              frameView.repaint(); //repaint() shows the changes on the screen.
	    		
	    	}
	    	}
	        
	    }
	

 
 
 

