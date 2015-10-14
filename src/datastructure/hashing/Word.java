package datastructure.hashing;

public class Word {
	
	private String theWord;
	private String definition;
	private Word next;	
	private int key;
	
	public Word(String theWord, String definition) {
		this.theWord = theWord;
		this.definition = definition;
	}
	
	public String getTheWord() {
		return theWord;
	}
	public void setTheWord(String theWord) {
		this.theWord = theWord;
	}
	public String getdefinition() {
		return definition;
	}
	public void setdefinition(String definition) {
		this.definition = definition;
	}
	public Word getNext() {
		return next;
	}
	public void setNext(Word next) {
		this.next = next;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}

}
