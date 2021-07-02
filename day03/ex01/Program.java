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
        Synch synch = new Synch();
        Egg egg = new Egg(synch, count);
        Hen hen = new Hen(synch, count);
        new Thread(egg).start();
        new Thread(hen).start();
    }
}