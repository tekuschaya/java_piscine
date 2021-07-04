package edu.school21.printer.app;
import edu.school21.printer.logic.Convert;

import java.lang.System.*;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		try {
			Convert bmp = new Convert();
			bmp.printBMP();
		} catch (IOException e) {
			System.err.println("Error. Cannot open the file");
		}
	}
}