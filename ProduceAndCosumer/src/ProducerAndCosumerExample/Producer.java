package ProducerAndCosumerExample;


public class Producer extends Thread {
	@Override
	   public void run() {
	     for(int i = 0; i < 10; i++){
	    	 productProcess(i);
	     }
	   }
	
	public void productProcess(int num) {
		synchronized (ShareQueue.taskQueue) {
			while(ShareQueue.taskQueue.size() ==  ShareQueue.taskSize) {
				 try {
	                   System.out.println("I am Waiting for Consuming: ");
	                   System.out.println("Next product: "+ num);
	                   ShareQueue.taskQueue.wait();
	               } catch (InterruptedException e) {
	                   e.printStackTrace();
	               }
			}
			ShareQueue.taskQueue.add(num);
			System.out.println("Produced: "+ num);
			ShareQueue.taskQueue.notifyAll();
		}
		
	}
}
