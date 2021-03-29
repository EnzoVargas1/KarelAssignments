package week6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ExpandableArray {
	
	private Object[] list = new Object[0];
	
	public ExpandableArray() {
		
	}
	
	
	public void set(int index, Object value) {
		if(list.length <= index) {
			list = traverse(index);
			list[index] = value;
		}
		else {
			list[index] = value;
		}
	}
	
	
	public Object get(int index) {
		return list[index];
	}
	
	public int getSize() {
		return list.length;
	}
	
	
	private Object[] traverse(int index) {
		Object[] newList = new Object[index+1];
		for(int i = 0; i < list.length; i++) {
			newList[i] = list[i];
		}
		return newList;
	}
	
	public String toString() {
		
		return "" + Arrays.asList(list);
	}
	
	
	
}
