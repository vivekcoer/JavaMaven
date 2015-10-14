package datastructure.hashing;

import java.util.Hashtable;
import java.util.Scanner;

public class App {

	private static String[][] elementsToAdd = {
			{ "ace", "Very good" },
			{ "act", "Take action" },
			{ "add", "Join (something) to something else" },
			{ "age", "Grow old" },
			{ "ago", "Before the present" },
			{ "aid", "Help, assist, or support" },
			{ "aim", "Point or direct" },
			{ "air", "Invisible gaseous substance" },
			{ "all", "Used to refer to the whole quantity" },
			{ "amp",
					"Unit of measure for the strength of an electrical current" },
			{ "and", "Used to connect words" }, { "ant", "A small insect" },
			{ "any", "Used to refer to one or some of a thing" },
			{ "ape", "A large primate" },
			{ "apt", "Appropriate or suitable in the circumstances" },
			{ "arc", "A part of the circumference of a curve" },
			{ "are", "Unit of measure, equal to 100 square meters" },
			{ "ark", "The ship built by Noah" },
			{ "arm", "Two upper limbs of the human body" },
			{ "art", "Expression or application of human creative skill" },
			{ "ash", "Powdery residue left after the burning" },
			{ "ask", "Say something in order to obtain information" },
			{ "asp", "Small southern European viper" },
			{ "ass", "Hoofed mammal" },
			{ "ate", "To put (food) into the mouth and swallow it" },
			{ "atm", "Unit of pressure" },
			{ "awe", "A feeling of reverential respect" },
			{ "axe", "Edge tool with a heavy bladed head" },
			{ "aye", "An affirmative answer" } };	
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		HashFunction wordHashTable = new HashFunction(11);		
		//Hashtable<Integer, Word> wordHashTable = new Hashtable<Integer, Word>();

		addTheArray(elementsToAdd,  wordHashTable);

		String wordLookUp = "a";
		// Keep retrieve requests until x is entered
		
		

		while (!wordLookUp.equalsIgnoreCase("x")) {

			System.out.println(": ");

			wordLookUp = input.nextLine();
			System.out.println(wordHashTable.find(wordLookUp));

		}
		// Display every item in the array with the index they are associated with
		 wordHashTable.displayTheArray();

	}

	public static void addTheArray(String[][] elementsToAdd,  HashFunction wordHashTable) {
		for (int i = 0; i < elementsToAdd.length; i++) {

			String word = elementsToAdd[i][0];
			String definition = elementsToAdd[i][1];

			// Create the Word with the word name and definition
			Word newWord = new Word(word, definition);
			// Add the Word to theArray
			insert(newWord, wordHashTable);
		}
	}

	public static void insert(Word newWord, HashFunction wordHashTable) {
		String wordToHash = newWord.getTheWord();
		// Calculate the hashkey for the Word
		int hashKey = wordHashTable.stringHashFunction(wordToHash);
		// Add the new word to the array and set
		// the key for the word
		wordHashTable.getTheArray()[hashKey].insert(newWord, hashKey);
	}
}
