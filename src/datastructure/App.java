package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class App {
	
	public static void main(String args[]){
		
		HashMap<String, Integer> cache = new HashMap<String, Integer>();  	
		
		Hashtable<Integer, String> source = new Hashtable<Integer,String>();
		HashMap<Integer, String>  map = new HashMap(source);
		
		map.put(21, "Twenty One");
//		map.put(21.0, "Twenty One"); //this will throw compiler error because 21.0 is not integer
		
		Integer key = 21;
		String value = map.get(key);
		System.out.println("Key: " + key +" value: "+ value); 

		//Output: Key: 21 value: Twenty One 	
		
		map.put(21, "Twenty One");
		map.put(31, "Thirty One");       

		Iterator<Integer> keySetIterator = map.keySet().iterator();

		while(keySetIterator.hasNext()){
		  key = keySetIterator.next();
		  System.out.println("key: " + key + " value: " + map.get(key));
		}
		
		//another way
		for(Integer key1: map.keySet()){
			
		}
		
		List<String> list = new ArrayList<>();
		
		for(String val: list){
			
		}
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
		{
		    Object obj = it.next();
		    //Do something with obj
		}
		
		
		
//		Output:
//			key: 21 value: Twenty One
//			key: 31 value: Thirty One

		
	}

}
