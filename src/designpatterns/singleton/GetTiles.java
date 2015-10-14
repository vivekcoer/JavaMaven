package designpatterns.singleton;

import java.util.LinkedList;

public class GetTiles implements Runnable {
  public void run(){
	  Singleton newInstance = Singleton.getInstance();
	  
	  System.out.println("Instance id: " + System.identityHashCode(newInstance));
	  
	  //get all the letters
	  System.out.println(newInstance.getLetterList());
	  
	  LinkedList<String> playerOneTiles = newInstance.getTiles(7);
	  
	  System.out.println("Player tiles" + playerOneTiles);
	  System.out.println("Got Tiles");
  }
}
