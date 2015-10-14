package classes.staticinnerclass;

public class App {
	
	public static void main(String[] args){
		ClassA newObA = new ClassA();
		System.out.println(newObA.t());
		System.out.println(newObA.a.t());
		//ClassA.a newObB = new ClassA.a(); - >> compile error
		ClassA.ClassC newObC = new ClassA.ClassC(); // - >> no compile error!
		ClassA.ClassD newObD = newObA.new ClassD(); // this is how you access inner class!
	}	
}
