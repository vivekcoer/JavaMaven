package datastructure.hashing;

public class HashFunction {

	private WordList[] theArray;

	private int arraySize;	
	
	public WordList[] getTheArray() {
		return theArray;
	}

	public void setTheArray(WordList[] theArray) {
		this.theArray = theArray;
	}

	public int getArraySize() {
		return arraySize;
	}

	public void setArraySize(int arraySize) {
		this.arraySize = arraySize;
	}


	public int stringHashFunction(String wordToHash) {

		int hashKeyValue = 0;
		for (int i = 0; i < wordToHash.length(); i++) {
			// 'a' has the character code of 97 so subtract to make our letters start at 1
			int charCode = wordToHash.charAt(i) - 96;
			int hKVTemp = hashKeyValue;
			// Calculate the hash key using the 26 letters plus blank
			hashKeyValue = (hashKeyValue * 27 + charCode) % arraySize;
//			System.out.println("Hash Key Value " + hKVTemp
//					+ " * 27 + Character Code " + charCode + " % arraySize "
//					+ arraySize + " = " + hashKeyValue);

		}
		System.out.println();
		return hashKeyValue;
	}

	public HashFunction(int size) {
		arraySize = size;
		theArray = new WordList[arraySize];
		// Fill the array with WordLists

		for (int i = 0; i < arraySize; i++) {
			theArray[i] = new WordList();
		}
	}

	public Word find(String wordToFind) {
		// Calculate the hash key for the word
		int hashKey = stringHashFunction(wordToFind);
		// NEW
		Word theWord = theArray[hashKey].find(hashKey, wordToFind);
		return theWord;
	}

	public void displayTheArray() {
		for (int i = 0; i < arraySize; i++) {
			System.out.println("theArray Index " + i);
			theArray[i].displayWordList();
		}
	}
}
