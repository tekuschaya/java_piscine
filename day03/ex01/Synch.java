public class Synch {
	
	private int count = 0;
	public synchronized void printHen() {
    	while (count == 0) {
			try {
				wait();
			}
			catch (InterruptedException e) {
			}
      	}
		count--;
		System.out.println("Hen");
		notify();
   }
	public synchronized void printEgg() {
		while (count == 1) {
			try {
				wait();
			}
			catch (InterruptedException e) { 
			} 
		}
		count++;
		System.out.println("Egg");
		notify();
	}
}