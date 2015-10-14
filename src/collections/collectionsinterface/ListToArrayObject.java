package collections.collectionsinterface;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayObject {
	
	public static void main(String args []){
		Integer elements[] = { 1, 2, 3 };		
		List<Integer> ls = new ArrayList();
		
		ls.add(4);
		ls.add(5);
		ls.add(6);
		ls.add(7);
		
		//Integer a[] = new Integer[2];
		
		Integer a[] = ls.toArray(elements); // this returns the array of the integers
		//Object a[] = ls.toArray();//this returns array of Objects		
		
		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}			
		
		System.out.println("Length of an array : " + a.length);
	}
}
