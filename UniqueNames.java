package week4;

import java.util.*;

import acm.program.ConsoleProgram;

public class UniqueNames extends ConsoleProgram {
	
	
	
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();

		String input = readLine("Enter name: ");
		list.add(input);
		
		while(input.length() != 0) {
			input = readLine("Enter name: ");
			add(list, input);
			
		}
		
		for(int i = 0; i < list.size(); i++) {
			println(list.get(i));
		}
			
	}
	
	
	private void add(ArrayList<String> list, String str) {
		if(list.contains(str) == false){
			list.add(str);
		}
	}
	
	
	
}
