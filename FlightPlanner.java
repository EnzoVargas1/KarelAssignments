package week5;

import java.io.*;
import java.util.*;

import acm.program.ConsoleProgram;

public class FlightPlanner extends ConsoleProgram {
	
	private ArrayList <String> l;
	private HashMap<String, ArrayList<String>> map;
	private Scanner reader;
	private File file;
	
	public void init() {
		
	   file = new File("/Users/Enzo/eclipse-workspace/Stanford106AAssignments/src/week5/flights.txt");
	   
	   try {
			reader = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	   map = new HashMap<String,ArrayList <String>>();
	   l = new ArrayList<String>();
	   
	   putDataIn();
	   displayDataBase();
	   println();
	   println("Lets plan a round - trip route!");
	   println();
	   
	}

	
	public void run() {
	
		
		String input = readLine("Enter the starting city: ");
	    displayDestinations(findDestinations(input));
	    
	    input =  readLine("Enter the next destination: ");
	    
        while(!ifEquals(input, l.get(0))) {
        	displayDestinations(findDestinations(input));
        	input =  readLine("Enter the next destination: ");
        	
        }
        
		println(displayFlightRoute());
	}
	
	
	private void putDataIn() {
		
		String data = "";
	    String startPoint = "";
	    String endPoint = "";
	    
		while(reader.hasNext()) {
			 data = reader.nextLine();
			 startPoint = data.substring(0, data.indexOf('-'));
			 endPoint = data.substring(data.indexOf('>'), data.length());
			 
			 if(map.containsKey(startPoint)) {
				 endPoint = deleteArrow(endPoint);
				 endPoint.replace(" ", "");
				 map.get(startPoint).add(endPoint);
			}
			 else {
				 startPoint.replace(" ", "");
				 map.put(startPoint, new ArrayList<String>());
				 endPoint = deleteArrow(endPoint);
				 endPoint.replace(" ", "");
				 map.get(startPoint).add(endPoint);
			 }
		}
		
	}
	
	
	private void displayDataBase() {
		
	    println("Welcome to Flight Planner!");
	    println();
		println("Here's a list of what we have in our database: ");
		println();
		
		for(String key: map.keySet()) {
			println(key);
		}
	}
	
	private void displayDestinations(String s) {
		println();
		println("From " + s + " you can fly directly to: ");
		for(int i = 0; i < map.get(s).size(); i++) {
			println(map.get(s).get(i));
		}
	}
	
	
	private String findDestinations(String input) {
		 String k = "";
		    Boolean stringIsEqual = false;
		    for(String key: map.keySet()) {
		    	  int num = input.compareToIgnoreCase(key);
		    	  if(num >= -1 && num <= 1) {
		    		  k = key;
		    		  l.add(k);
		    		  return k;
		    	 }	
		    }
		    
		    return k;  
	}
	
	
	private String deleteArrow(String str) {
		String newStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(!(ch == '>')) {
				newStr = newStr + ch;
			}
		}
		
		return newStr;
	}
	
	
	private String displayFlightRoute() {
		String s = "";
		
		for(int i = 0; i < l.size()-1; i++) {
			s  = s + l.get(i) + "->";
		}
		
		s = s + l.get(l.size()-1);
		return s;
	}
	
	
	private boolean ifEquals(String s1, String s2) {
		int num = s2.compareToIgnoreCase(s1);
		if(num >= -1 && num <= 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
