package week2;


import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class RandomCircles extends GraphicsProgram {

	static final int WIDTH = 775;
	static final int HEIGHT = 400;
	static final int MAX_RADIUS = 50;
	static final int MIN_RADIUS = 5;
	
	
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			int radius = getRandom(MIN_RADIUS, MAX_RADIUS);
			
			GOval circle = new GOval(getRandom(0, WIDTH), getRandom(0, HEIGHT), radius, radius);
			Color c = new Color(getRandom(0, 255), getRandom(0, 255), getRandom(0, 255));
		    circle.setFilled(isEnabled());
		    circle.setFillColor(c);
		    
		    add(circle);
		    
		}

	}
	
	  public static int getRandom(int min, int max) {
			
			return (int) (Math.random()*max - min + 1) + min;
			
			
		  }
}
