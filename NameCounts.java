package week4;

import java.util.*;

import acm.program.ConsoleProgram;

public class NameCounts extends ConsoleProgram {
	
	HashMap<String, Integer> map;
	
	public void run() {
		
		map = new HashMap<String, Integer>();
		
		String input = readLine("Enter name: ");
		add(input);
		
		while(input.length() != 0) {
			input = readLine("Enter name: ");
			if(input.length() != 0)add(input);
		}
		printMap();
		
	}
	
	private void add(String str) {

			if(map.containsKey(str)) {
				int count = map.get(str) + 1;
				map.replace(str, map.get(str), count);
			}
			else if (!map.containsKey(str)) {
				map.put(str, 1);
			}
	}
	
	private void printMap() {
		println();
		for(String name: map.keySet()){
            String key = name.toString();
            String value = map.get(name).toString(); 
            println(key + " : " + value);  
         } 
		
	}
	
}
