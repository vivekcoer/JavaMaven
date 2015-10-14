package designpatterns.singleton;
import java.util.LinkedList;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class GetTheTiles implements Runnable {
	
	public void run(){

			// How you create a new instance of Singleton
			
			Singleton newInstance = Singleton.getInstance();
			
			// Get unique id for instance object
			
			System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));
			
			// Get all of the letters stored in the List
			
			System.out.println(newInstance.getLetterList());
			
			LinkedList<String> playerOneTiles = newInstance.getTiles(7);
			
			System.out.println("Player: " + playerOneTiles);
			
			//reflection
			
//			try{
//				Method method = newInstance.getClass().getMethod("doSomething", null);
//				
//			}catch (Exception e){
//				
//			}
			
			
		
		System.out.println("Got Tiles");
	}
	
}