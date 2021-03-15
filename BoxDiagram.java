package week5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;
import java.util.*;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GPoint;
import acm.graphics.GRect;

public class BoxDiagram extends GraphicsProgram {
	
	JLabel label;
	JTextField textBox;
	JButton addButton;
	JButton removeButton;
	JButton clearButton;
	private static final double BOX_WIDTH = 120;
	private static final double BOX_HEIGHT = 50;
	private GObject gobj;
	private double lastX;
	private double lastY;
	HashMap <String, GObject> list;
	
	public void init() {
		list = new HashMap<String, GObject>();
		addComponents();
		addActionListeners();
		addMouseListeners();
		
	}
	
	public void run() {
		
	}
	
	private void addComponents() {
		label = new JLabel("Name");
		textBox = new JTextField(25);
		textBox.addActionListener(this);
		addButton = new JButton("add");
		addButton.addActionListener(this);
		removeButton = new JButton("remove");
		clearButton = new JButton("clear");
		add(label, SOUTH);
		add(textBox, SOUTH);
		add(addButton, SOUTH);
		add(removeButton, SOUTH);
		add(clearButton, SOUTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		 Object source = e.getSource();
		 
		if(source == addButton) {
			addBox(textBox.getText());
		}
		else if(source == removeButton) {
			removeBox(textBox.getText());
		}
		else if(source == clearButton) {
			removeAllBoxes();
		}
		
	}
	
	public void addBox(String text) {
		
		GCompound box = new GCompound();
		 
		 GRect rect = new GRect(getWidth()/2, getHeight()/2, BOX_WIDTH, BOX_HEIGHT);
		 GLabel label = new GLabel(text);
		 box.add(rect);
		 box.add(label, rect.getX() + 30, rect.getY() + 30);
		 
		 list.put(text, box);
		 add(list.get(text));
	}
	
	public void removeBox(String str) {
		remove(list.get(str));
		list.remove(str);
	}
	
	public void removeAllBoxes() {
		for(String key: list.keySet()) {
			remove(list.get(key));
			list.remove(key);
		}
	}
	
	
	public void mousePressed(MouseEvent e) {
		lastX = e.getX();
		lastY = e.getY();
		gobj = getElementAt(lastX, lastY);
	}
	
	
	public void mouseDragged(MouseEvent e) {
		if (gobj != null) {
		gobj.move(e.getX() - lastX, e.getY() - lastY);
		lastX = e.getX();
		lastY = e.getY();
		
	  }
   }
	

}
