package TreadExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TreadExercise extends JFrame implements ActionListener {
	private JLabel label;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private static int count = 0;
	IncreaseThread increaseThread;
	DecreaseThread decreaseThread;
	static boolean increaseRunning = false;
	static boolean decreaseRunning = false;

	public TreadExercise() {
		super("Thread Exercise");
		setSize(300, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label = new JLabel("Count: 0");
		label.setBounds(120, 50, 100, 30);
		add(label);

		btn1 = new JButton("Increase");
		btn1.setBounds(30, 100, 100, 25);
		btn1.addActionListener(this);
		add(btn1);

		// Decrease button
		btn2 = new JButton("Decrease");
		btn2.setBounds(150, 100, 100, 25);
		btn2.addActionListener(this);
		add(btn2);

		// Stop button
		btn3 = new JButton("Stop");
		btn3.setBounds(80, 140, 100, 25);
		btn3.addActionListener(this);
		add(btn3);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			increaseRunning = true;
			decreaseRunning = false;
			if (increaseThread == null || !increaseThread.isAlive()) {
				increaseThread = new IncreaseThread();
				increaseThread.start();
			}
		} else if (e.getSource() == btn2) {
			decreaseRunning = true;
			increaseRunning = false;
			if (decreaseThread == null || !decreaseThread.isAlive())
				decreaseThread = new DecreaseThread();
			decreaseThread.start();
		} else {
			increaseRunning = false;
			decreaseRunning = false;
		}
	}
	

	class IncreaseThread extends Thread {
		@Override
		public void run() {
			while (increaseRunning == true) {
				count++;
				label.setText("Count: " + count);
				System.out.println(getName() + "Increase");
				try {
					Thread.sleep(1000); // Sleep for 1 second
				} catch (InterruptedException e) {
					System.out.println("Thread interrupted");
				}
			}
		}
	}

	class DecreaseThread extends Thread {
		@Override
		public void run() {
			while (decreaseRunning == true) {
				count--;
				label.setText("Count: " + count);
				System.out.println(getName() + "DEcrease");
				try {
					Thread.sleep(1000); // Sleep for 1 second
				} catch (InterruptedException e) {
					System.out.println("Thread interrupted");
				}

			}
		}
	}

	public static void main(String[] args) {
		new TreadExercise();
	}
}