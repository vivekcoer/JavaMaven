package staticclasses;

/* Java program to demonstrate how to implement static and non-static
classes in a java program. */
public class OuterClass {
	private static String msg = "GeeksForGeeks";
	private static int c;
	private int d;

	// Static nested class
	public static class NestedStaticClass {

		// Only static members of Outer class is directly accessible in nested static class
		public void printMessage() {

			// Try making 'message' a non-static variable, there will be compiler error
			System.out.println("Message from nested static class: " + msg);
		}
		
		public int sumInstanceMethod(int a, int b){
			return c + (a*10 + b);
		}
		
		public static int sumStaticMethod(int a, int b){
			return a*10 + b;
		}
	}

	// non-static nested class - also called Inner class
	public class InnerClass {
		// Both static and non-static members of Outer class are accessible in this Inner class
		public void display() {
			System.out.println("Message from non-static nested class: " + msg);
		}
		
		public int sumInstanceMethod(int a, int b){
			return (c+d) + (a*10 + b);
		}
		
//		public static int sumStaticMethod(int a, int b){ // cannt declare a static method inside a non static inner class!
//			return a*10 + b;
//		}
	}
	
	public static int sumStaticMethod(int a, int b){
		return a*10 + b;
	}
}
