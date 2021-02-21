package week2;

import acm.program.GraphicsProgram;
import java.awt.event.MouseEvent;

import javax.sound.sampled.Line;

import acm.graphics.GLine;
import acm.program.*;


public class DrawingLines extends GraphicsProgram {
	
	public void run() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		 firstX = e.getX();
		 firstY = e.getY();
		 line = new GLine(firstX, firstY, firstX, firstY);
	     add(line);

		}
	
	    public void mouseDragged(MouseEvent e) {
	    	lastX = e.getX();
	    	lastY = e.getY();
	        line.setEndPoint(lastX, lastY);
	    }
	    
	
	
    private GLine line;
	private double firstX;
	private double firstY;
	private double lastX;
	private double lastY;
	
}
