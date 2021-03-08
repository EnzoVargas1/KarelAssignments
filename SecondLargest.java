package week4;

import java.util.*;

import acm.program.ConsoleProgram;

public class SecondLargest extends ConsoleProgram{
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public void run() {
		String input = readLine("Enter number: ");
		int num = Integer.parseInt(input.replaceAll(" ", ""));
		list.add(num);
		while(!input.equals("0")) {
			input = readLine("Enter number: ");
			if(input.equals(""))break;
			
		    num = Integer.parseInt(input.replaceAll(" ", ""));
			list.add(num);
		}
		
		int[] arr = new int[list.size()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
		int n =  arr.length;
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
				}
			}
		}
		
		
		println("Greatest: " + arr[arr.length-1]);
		println("2nd Greatest: " + arr[arr.length-2]);
		
	}
}
