package stackoverflow;

class WordList {

	public Word firstWord = null;

	public void insert(Word newWord, int hashKey) {
		Word prev = null;
		Word curr = firstWord;

		newWord.key = hashKey;

		while (curr != null && newWord.key > curr.key) {

			prev = curr;
			curr = curr.next;

		}

		if (prev == null)
			firstWord = newWord;

		else
			prev.next = newWord;
		newWord.next = curr;
	}// end insert

	public String display() {
		if (firstWord == null) {
			return "null";
		}
		Word curr = firstWord;

		while (curr != null) {

			System.out.println(curr.returnWord() + "    "
					+ curr.returnHashVal());
			curr = curr.next;

		}
		return "done";

	}// end display
}