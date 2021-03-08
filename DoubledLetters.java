package week4;
import acm.program.ConsoleProgram;

public class DoubledLetters extends ConsoleProgram{
	
	public void run() {
		
		String input = readLine("Enter something : ");
		println(removeDoubledLetters(input));
	}
	
	public String  removeDoubledLetters(String str) {
		String replacement = "";
		String newStr = "";
		for(int i = 0; i < str.length()-1; i++) {
			char ch = str.charAt(i);
			if(!(str.charAt(i+1) == ch)) {
				newStr = newStr + ch;
			}
		}
		newStr = newStr + str.charAt(str.length()-1);
		
		return newStr;
	}
}
