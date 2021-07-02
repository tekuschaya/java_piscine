class Hen implements Runnable {

	private Synch synch;
	private int count;

	Hen(Synch synch, int count) {
		this.synch = synch;
		this.count = count;
	}
	public void run() {
		for (int i = 0; i < count; i++) {
			synch.printHen();
		}
	}
}