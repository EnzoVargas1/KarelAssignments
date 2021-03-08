package week4;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import acm.program.ConsoleProgram;

public class WordCount extends ConsoleProgram {
	
	public void run() {
		
		int wordCount = 0;
		int charCount = 0;
		int lineCount = 0;
		
		try {
			File file = new File("/Users/Enzo/Desktop/test.txt");
			FileWriter f = new FileWriter(file);
			
			f.write("Poor naked wretches, wheresoe'er you are, ");
			lineCount++;
			f.write("That bide the pelting of this pitiless storm, ");
			lineCount++;
			f.write("How shall your houseless heads and unfed sides, ");
			lineCount++;
			f.write("Your loop'd and window'd raggedness, defend you ");
			lineCount++;
			f.write("From seasons such as these? O, I have ta'en " );
			lineCount++;
			f.write("Too little care of this");
			lineCount++;
			f.close();
			
			
			Scanner reader = new Scanner(file);
			
			while(reader.hasNext()) {
				String data = reader.nextLine();
				
				
				for(int i = 0; i < data.length(); i++){
					charCount++;
					char ch = data.charAt(i);
					if(ch == ' '){
						wordCount++;
					}
					
				}
				println(data);
			}
			
			wordCount++;
			charCount++;
			
			reader.close();
			
			println("words: " + wordCount);
			println("characters: " + charCount);
			println("lines: " + lineCount);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			println("An error occurred.");
			e.printStackTrace();
		}
		

	}
	
}

