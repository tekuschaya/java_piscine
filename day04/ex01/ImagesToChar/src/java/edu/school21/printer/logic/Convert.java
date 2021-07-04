package edu.school21.printer.logic;

import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class Convert {

	File file;
	BufferedImage image;
	final int WHITE = Color.WHITE.getRGB();
	final int BLACK = Color.BLACK.getRGB();

	public Convert() throws IOException {
		file = new File("./target/resources/image.bmp");
		image = ImageIO.read(file);
	}

	public void printBMP() throws IOException {
		for (int x = 0; x < image.getWidth(); x++) {
			for (int y = 0; y < image.getHeight(); y++) {
				if (image.getRGB(y, x) == WHITE) {
					System.out.print('.');
				} 
				else if (image.getRGB(y, x) == BLACK) {
					System.out.print('0');
				}
			}
			System.out.println();
		}
	}
}