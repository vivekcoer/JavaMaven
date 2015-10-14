package datastructure.hashing;

import java.util.Scanner;

import datastructure.HashFunction3;

public class WordList {
	private Word firstWord = null;

	public void insert(Word newWord, int hashKey) {
		Word previous = null;
		Word current = firstWord;
		newWord.setKey(hashKey);

		while (current != null && newWord.getKey() > current.getKey()) {
			previous = current;
			current = current.getNext();
		}

		if (previous == null)
			firstWord = newWord;
		else
			previous.setNext(newWord);

		newWord.setNext(current);
	}

	public void displayWordList() {
		Word current = firstWord;
		while (current != null) {
			System.out.println(current);
			current = current.getNext();

		}
	}

	public Word find(int hashKey, String wordToFind) {
		Word current = firstWord;
		// Search for key, but stop searching if
		// the hashKey < what we are searching for
		// Because the list is sorted this allows
		// us to avoid searching the whole list
		while (current != null && current.getKey() <= hashKey) {
			// NEW
			if (current.getTheWord().equals(wordToFind))
				return current;
			current = current.getNext();
		}
		return null;
	}	
}
