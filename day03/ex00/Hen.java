public class Hen extends Thread {

	private int count;

	Hen(int i) {
		this.count = i;
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.println("Hen");
		}
	}
}