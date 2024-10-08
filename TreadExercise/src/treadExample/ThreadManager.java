package TreadExample;

import javax.swing.JTextArea;


public class ThreadManager {
    private boolean flag = true; 
    private Thread thread1;
    private static int thread1Count;
    private Thread2 thread2;
    private static int thread2Count;
    private JTextArea textArea;
    
    public ThreadManager(JTextArea textArea) {
    	this.textArea = textArea;


}
    public void start() {
    	  flag = true;

          if (thread1 == null || !thread1.isAlive()) {
              thread1 = new Thread1();
              thread1.start();
          }

          if (thread2 == null || !thread2.isAlive()) {
              thread2 = new Thread2();
              thread2.start();
    }
   }
    
    public void stop() {
    	 flag = false; // Stop the threads
         System.out.println(thread1.getName() + " has completed its work.");
         System.out.println(thread2.getName() + " has completed its work.");
         System.out.println(thread1.getName() + " this is thread 1 count: " + thread1Count);
         System.out.println(thread2.getName() + " this is thread 2 count: " + thread2Count);
    }
    
    
    // Thread1 class
    class Thread1 extends Thread {
        @Override
        public void run() {
            while (flag) {
                System.out.println(getName() + ": I'm thread 1");
                textArea.append(getName() + ": I am thread 1\n");
                thread1Count++;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(getName() + ": Thread 1 Interrupted");
                }
            }
        }
    }

    // Thread2 class
    class Thread2 extends Thread {
        @Override
        public void run() {
            while (flag) {
                System.out.println(getName() + ": I'm thread 2");
                textArea.append(getName() + ": I am thread 2\n");
                thread2Count++;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(getName() + ": Thread 2 Interrupted");
                }
            }
        }
    }

}
