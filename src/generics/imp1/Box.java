package generics.imp1;

public class Box<T> {

	private T someproperty;

//	public Box(T someproperty) {
//		this.someproperty = someproperty;
//	}

	public void set(T someproperty) {
		this.someproperty = someproperty;
	}

	public T get() {
		return someproperty;
	}

	public <U extends Number> void inspect(U u) {
		System.out.println("U: " + u.getClass().getName());
	}
	
	public void pingBox(Number obj){
		
	}
	
	public void testBox(Box<Number> obj) {

	}
	
	public <T extends Number> void testBox1(Box<T> obj) {

	}
	
	//What can we pass - can we pass Box<Integer> or Box<Double> -- answer is NO - because Unlike normal cases where Integer "is a" Number Box<Integer> "is NOT a" Box<Number>	
	//What type of argument does it accept? By looking at its signature, you can see that it accepts a single argument whose type is Box<Number>. But what does that mean? Are you allowed to pass in Box<Integer> or Box<Double>, as you might expect? The answer is "no", because Box<Integer> and Box<Double> are not subtypes of Box<Number>.
	//This is a common misunderstanding when it comes to programming with generics, but it is an important concept to learn.
	//Box<Integer> is not a subtype of Box<Number> even though Integer is a subtype of Number.
	//Note: Given two concrete types A and B (for example, Number and Integer), MyClass<A> has no relationship to MyClass<B>, regardless of whether or not A and B are related. The common parent of MyClass<A> and MyClass<B> is Object.
		
	public static void main(String args[]){			
    	
		Box<Integer> integerBox = new Box<Integer>();
		Box<Number> obj = new Box<Number>();	
		Box<Integer> obj1 = new Box<Integer>();	
		Number numObj = 3.2;
		Integer intObj = 2;   
		
		//this works fine					
		integerBox.testBox(obj);
		
		// but this doesnt!			
		//integerBox.testBox(obj1);
		
		//and this does
        integerBox.testBox1(obj1); 
		
		//but again, this does!    	
    	integerBox.inspect(intObj);
    	
    	//FOR NON GENERICS it always works since it respects "is" relationship
    	integerBox.pingBox(numObj);
    	integerBox.pingBox(intObj);
    	
    	Box intBox = new Box(); // this is raw type it is allowed (for backward Compatibility) but it gives a warning.
    	// the reverse, howoever is not possible
    	NonTemplateBox box = new NonTemplateBox();//OK
    	//NonTemplateBox<Number> = new NonTemplateBox<Number>() // NOT OK
    	
    	//If you think about it, its a simple OOPS concept - the base class can point to sub class but the reverse is not possible!
    	
	}

}