package week2;

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {
	
	static int HEAD_WIDTH = 200;
	static int HEAD_HEIGHT = 300;
	
	static int EYE_RADIUS = 40;
	
	static int MOUTH_WIDTH = 150;
	static int MOUTH_HEIGHT = 45;
	
	public void run() {
		GRect head = new GRect(275, 30, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(isEnabled());
		head.setFillColor(Color.GRAY);
		add(head);
		
		GOval eye1 = new GOval(295, 75, EYE_RADIUS, EYE_RADIUS);
		eye1.setFilled(isEnabled());
		eye1.setFillColor(Color.GREEN);
		add(eye1);
		
		GOval eye2 = new GOval(410, 75, EYE_RADIUS, EYE_RADIUS);
		eye2.setFilled(isEnabled());
		eye2.setFillColor(Color.GREEN);
		add(eye2);
		
		GRect mouth = new GRect(300, 240, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(isEnabled());
		mouth.setFillColor(Color.WHITE);
		add(mouth);
	}
}
