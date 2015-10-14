//package designpatterns.singleton;
//
//import java.util.LinkedList;
//
//public class ScrabbleTesting {
//	
//	
//	
//	public static void main(String[] args){
//		Singleton scrabble1 = Singleton.getInstance();	
//		System.out.println("1st instance id: " + System.identityHashCode(scrabble1));	
//		
//		System.out.println(scrabble1.getLetterList());
//		
//		LinkedList<String> playerOneTiles = scrabble1.getTiles(7);
//		
//		System.out.println("Player 1 Tiles: " + playerOneTiles);
//		
//		System.out.println(scrabble1.getLetterList());
//		
//		
//		Singleton scrabble2 = Singleton.getInstance();
//		System.out.println("2nd instance id: " + System.identityHashCode(scrabble2));
//		
//		
//		System.out.println(scrabble2.getLetterList());
//		
//		LinkedList<String> playerTwoTiles = scrabble2.getTiles(7);
//		
//		System.out.println("Player 2 Tiles: " + playerTwoTiles);
//		
//		System.out.println(scrabble2.getLetterList());		
//		
//	}
//
//}
