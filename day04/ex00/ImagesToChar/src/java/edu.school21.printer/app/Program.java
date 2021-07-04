import java.lang.System.*;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("You must enter a path to the bmp file");
			System.exit(1);
		}
		try {
			Convert bmp = new Convert(args[0]);
			bmp.printBMP();
		} catch (IOException e) {
			System.err.println("Error. Cannot open the file");
		}
	}
}