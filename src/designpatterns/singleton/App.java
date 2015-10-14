package designpatterns.singleton;

public class App {

	public static void main(String[] args) throws Exception {

		// Create a new Thread created using the Runnable interface
		// Execute the code in run after 10 seconds
		Runnable getTiles = new GetTheTiles();
		Runnable getTilesAgain = new GetTheTiles();

		// Call for the code in the method run to execute
		
		Thread thread1 = new Thread(getTiles);
		thread1.start();		
		Thread.sleep(1000);
		
		Thread thread2 = new Thread(getTilesAgain);
		thread2.start();

	}

}
