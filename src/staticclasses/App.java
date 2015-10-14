package staticclasses;

import staticclasses.OuterClass;
public class App {
	public static void main(String args[]) {
		
		int sum = 0;
		//final AtomicInteger ind = new AtomicInteger();

		//OuterClass.NestedStaticClass.sumInstanceMethod(2, 5); // wrong!		
		
		// create instance of nested Static class
		OuterClass.NestedStaticClass obj = new OuterClass.NestedStaticClass();

		// call non static method of nested static class
		sum = obj.sumInstanceMethod(2, 5);
		
		sum = OuterClass.NestedStaticClass.sumStaticMethod(2, 5); // right!		

		// In order to create instance of Inner class we need an Outer class instance. Let us create Outer class instance for creating non-static nested class
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();

		// calling non-static method of Inner class
		sum = inner.sumInstanceMethod(2, 5);

		// we can also combine above steps in one step to create instance of Inner class
		OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
		
		//OuterClass.InnerClass innerObject2 = new OuterClass. InnerClass(); // it would have been possible if InnerClass was static i.e compare with line 11.

		// similarly we can now call Inner class method
		innerObject.display();
	}
}