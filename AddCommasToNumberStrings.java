package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		while(true) {
			String input = readLine("Enter a number: ");
			if (input.length() == 0) break;
			println(addCommasToNumericDigits(input));
		}
	}
	
	private String addCommasToNumericDigits(String str) {
		String newStr = "";
		int count = 0;
		for(int i = str.length()-1; i>=0; i--) {
			char ch = str.charAt(i);
			count++;
			
			if(count%3 == 0 && i != 0) {
				newStr = ch + newStr;
				newStr = "," + newStr;
			}
			else {
				newStr = ch + newStr;
			}
		}
		
		return newStr;
	}
	
}
