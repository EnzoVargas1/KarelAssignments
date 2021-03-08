package week4;

import java.io.*;
import java.util.ArrayList;
import java.util.*;
import acm.program.ConsoleProgram;


public class Histograms extends ConsoleProgram {
	
    Scanner reader;
	ArrayList<Integer> scores;
	ArrayList<String> txt;
	File file;
	
	public void run() {
		
		file = new File("/Users/Enzo/eclipse-workspace/Stanford106AAssignments/src/week4/MidtermScores.txt");
		
		
		scores = new ArrayList<Integer>();
		txt = new ArrayList<String>();
		try {
			reader = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(reader.hasNext()) {
			String data = reader.nextLine();
			txt.add(data);
		}
		
		for(int i = 0; i < txt.size(); i++) {
			String str = txt.get(i);
			int num = Integer.parseInt(str.replaceAll(" ", ""));
			scores.add(num);
		}
		
		
		displayGraph();
	}
	

	private String tallyStars(int count) {
		String str = "";
		
		for(int i = 0; i < count; i++) {
			str = str + "*";
		}
		
		return str;
	}
	
	
	private int count(int min, int max) {
		int count = 0;
		for(int i = 0; i < scores.size(); i++) {
		  if(getRange(scores.get(i), min, max)) count++;
		}
		return count;
	}
	
	
	private boolean getRange(int num, int min, int max){
		
		return (num >= min && num <= max);
	}
	
	
	private void displayGraph() {
		println("0-9: " + tallyStars(count(0, 9)));
		println("10-19: " + tallyStars(count(10, 19)));
		println("20-29: " + tallyStars(count(20, 29)));
		println("30-39: " + tallyStars(count(30, 39)));
		println("40-49: " + tallyStars(count(40, 49)));
		println("50-59: " + tallyStars(count(50, 59)));
		println("60-69: " + tallyStars(count(60, 69)));
		println("70-79: " + tallyStars(count(70, 79)));
		println("80-89: " + tallyStars(count(80, 89)));
		println("90-99: " + tallyStars(count(90, 99)));
		println("100: " + tallyStars(count(100, 100)));
	}
	
	
	
}
