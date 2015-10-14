package observerpattern;

public class App {
	public static void main(String[] args) {
		System.out.println("Enter some text");
		
		EventSource es = new EventSource();
		ResponseHandler rs = new ResponseHandler();
		
		es.addObserver(rs);
		
		Thread thread = new Thread(es);
		thread.run();
	}
}
