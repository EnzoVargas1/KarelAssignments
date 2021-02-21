package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static int MAX_TERM_VALUE = 10000;
	
	public void run() {
		println("Printing the Fibonacci Sequence recursively:");
		fib(0);
		println();
		println("Printing the Fibonacci Sequence iteratively:");
		Fib(0);
	}
	
	//iterative
	public void Fib(int num) {
		int prev = num;
		int temp = num;
		
		println(num);
		num+=1;
		prev = temp;
		temp = num;
		
		while(num < 10000) {
			println(num);
			num = prev + temp; 
			prev = temp;
			temp  = num;
			
		}
				
	}
	
	//recrusive
	public void fib(int num) {
		int prev = num;
		int temp = num;
		
	    println(num);
		num+=1;
		prev = temp;
		temp = num;

		recurFib(num, prev, temp);
	}
	
	
	public void recurFib(int num, int prev, int temp) {
		 
		if(num < MAX_TERM_VALUE) {
			println(num);
			num = prev + temp; 
			prev = temp;
			temp  = num;
			recurFib(num, prev, temp);

		}
		else {
			return;
		}
		
	}
	
	
}
