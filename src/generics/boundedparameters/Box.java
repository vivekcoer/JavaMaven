package generics.boundedparameters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Box<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	 public <U extends Number > void inspect(U u){
	 System.out.println("T: " + t.getClass().getName());
	 System.out.println("U: " + u.getClass().getName());
	 }

	// main doesnt compile if changed to when used with Class A or Class C.
	// public <U extends ClassA & InterfaceA> void inspect(U u){
	// System.out.println("T: " + t.getClass().getName());
	// System.out.println("U: " + u.getClass().getName());
	// }

	// but this doesnt when used with Class B, why?
//	public <U extends ClassA & InterfaceA> void inspect(U u) {
//		System.out.println("T: " + t.getClass().getName());
//		System.out.println("U: " + u.getClass().getName());
//	}
	 
	 public static void main(String[] args) {
	        Box<Integer> integerBox = new Box<Integer>();
	        //integerBox.set(new Integer(10));
	        Date dt;
	        try{
	        	dt = new SimpleDateFormat("MM/DD/YYYY", Locale.ENGLISH).parse("12/04/1981");
	        	
	 //       	ClassC obj = new ClassC(01,"Vivek", dt);
	        	ClassA obj1 = new ClassA(02,"Amit");
	        	
	        	ClassB obj2= new ClassB(2.9,dt);
	        	
//	        	integerBox.inspect(obj);
//	        	integerBox.inspect(obj1);	   	        	
//	        	integerBox.inspect(obj2);
	        	
	        }catch(ParseException e){
	        	e.printStackTrace();
	        }	        
//	        integerBox.inspect(19.1);
	        //integerBox.inspect("some text"); // error: this is still String!
	    }

}