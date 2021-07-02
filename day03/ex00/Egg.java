public class Egg extends Thread {

	private int count;

	Egg(int i) {
		this.count = i;
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.println("Egg");
		}
	}
}