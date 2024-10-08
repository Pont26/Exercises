package TreadExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TreadExercise2 extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton startBtn, stopBtn;
    private ThreadManager threadManager;


    public TreadExercise2() {
        super("Thread Exercise 2");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        textArea = new JTextArea();
        //it will automatically wrap to the next line, rather than continuing on a single line 
        textArea.setWrapStyleWord(true);
        //if a word does not fit at the end of a line, the entire word will move to the next line, rather than breaking it into parts.

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(50, 50, 200, 200); 
        add(scrollPane);

        startBtn = new JButton("Start");
        startBtn.setBounds(50, 260, 80, 30);
        startBtn.addActionListener(this);
        add(startBtn);

        stopBtn = new JButton("Stop");
        stopBtn.setBounds(170, 260, 80, 30); 
        stopBtn.addActionListener(this);
        add(stopBtn);
        threadManager = new ThreadManager(textArea);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn) {
        	threadManager.start();
        } else if (e.getSource() == stopBtn) {
        	threadManager.stop();
           
        }
    }


    public static void main(String[] args) {
        new TreadExercise2();
    }
}
