package week6;

import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram {
	
	public void run() {
		ExpandableArray array = new ExpandableArray();
		array.set(0, 1);
		array.set(1, 2);
		array.set(2, 3);
		println(array);
		array.set(100, 4);
		println(array);

	}
	
}
