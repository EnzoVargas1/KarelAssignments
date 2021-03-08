package week4;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram {

	public void run() {
		GImage image = new GImage("/Users/Enzo/Desktop/hokusai040_main_3.jpg");
		add(flipHorizontal(image));
		println("(" + image.getX() + ", " + image.getY() + ")" );
		
	}
	
	private GImage flipHorizontal(GImage image) {
		image.setBounds(getWidth(), 0, -getWidth(), getHeight());
		return image;
	}
	
}
