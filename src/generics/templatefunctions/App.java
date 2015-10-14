package generics.templatefunctions;

public class App {
	public static void main(String args[]){
//		Pair p1 = new Pair(1.0,"one"); // interesting - this doesnt throw any error. only a warning
//		Pair p2 = new Pair(1.00,"one"); //try this, what should be the result?
		
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "one");
		Pair <Integer, String> p2 = new Pair<Integer, String>(1, "one");
				
		if(Util.compare(p1, p2)){//even if you use raw type in compare function it works alright.
			System.out.println("same");//or Util.<Integer, String>compare(p1, p2)
		}else{
			System.out.println("different");
		}
	}
}