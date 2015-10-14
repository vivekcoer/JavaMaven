package Threads.basic1;

public class App {
	
	public static void main(String[] args){
		Thread getTimeOb = new GetTime();		
		
		Runnable getMail = new GetMail(3);			
		Thread getMailOb = new Thread(getMail);	// Look at the way this thread is initialized!	Compare it with Timethread.
		
		getTimeOb.start();	
		getMailOb.start();
		
	}
}
