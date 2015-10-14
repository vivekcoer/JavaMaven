package datastructure.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	
	    public static void main(String[] args){
	    	List strings = new ArrayList();
	    	strings.add("one");
	    	strings.add("two");	    	
	    	strings.add("three");
	    	//strings.add(20);  //this does NOT throw an exception - causes runtime exception	    	
	    	//this is used for debugging purposes to catch where a wrong type was added in your list!
	    	try{
	    		Collections.checkedList(new ArrayList<String>(4), String.class).addAll(strings);
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}    	
	    
	    	
	    	for (int i=0; i<strings.size();i++){
	    		System.out.println(strings.get(i));
	    	}
	    	
	    	for (Object value: strings){
	    		System.out.println(value);
	    	}
	    }


}
