public class Program {
	public static void main(String[] args) {
		int count = 0;
		if (args.length == 0) {
			System.err.println("You must enter a count of operations");
			System.exit(-1);
		}
		if (args[0].indexOf("--count=") != 0 || args[0].length() < 9) {
			System.err.println("Incorrect argument");
			System.exit(-1);
		}
		try	{
			count = Integer.parseInt(args[0].substring(args[0].indexOf('=') + 1));
			System.out.println("count = " + count);
		}
		catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException: " + nfe.getMessage());
			System.exit(-1);
		}
		Egg egg_tread = new Egg(count);
		Hen hen_tread = new Hen(count);
		egg_tread.start();
		hen_tread.start();
		try {
			egg_tread.join();
			hen_tread.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < count; i++) {
			System.out.println("Human");
		}
	}
}