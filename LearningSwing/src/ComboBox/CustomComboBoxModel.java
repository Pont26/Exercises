package ComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Custom class Job
class Job {
    private String title;

    public Job(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title; // This will display the job title in the combo box
    }
}

// Custom ComboBoxModel
class MyComboBoxModel extends DefaultComboBoxModel<Job> {
    public MyComboBoxModel(Job[] items) {
        super(items);
    }

    @Override
    public Job getSelectedItem() {
        Job selectedJob = (Job) super.getSelectedItem();

        // Custom logic with the selected job, if needed
    // System.out.println("Selected Job: " + selectedJob.getTitle());

        return selectedJob;
    }
}

public class CustomComboBoxModel {
    public static void main(String[] args) {
        // Array of Job objects
        Job[] jobs = new Job[]{
                new Job("Developer"),
                new Job("Designer"),
                new Job("Tester")
        };

        // Creating an instance of MyComboBoxModel
        MyComboBoxModel myModel = new MyComboBoxModel(jobs);
       //to add more item
        myModel.addElement(new Job("Manager"));

        JPanel panel=new JPanel();
        // Creating a JComboBox with the custom model
        JComboBox<Job> jobList = new JComboBox<>(myModel);
        panel.add(jobList);
        //remove //not working
        Job consultantJob = new Job("Manager");
        jobList.removeItem("Manager");
        
        //remoe an item at index
        jobList.removeItemAt(0);
        

        // Creating a JFrame to display the JComboBox
        JFrame frame = new JFrame("Custom ComboBoxModel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.add(panel); 

        frame.setVisible(true);
    }
}
