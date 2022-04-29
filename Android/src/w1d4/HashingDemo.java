package w1d4;

import w1d2.Word;

public class HashingDemo {
	public static void main(String[] args) {
		Word myWord = new Word(new char[]{'h','a','s','h'});
		int hashArraySize = 100000;
		Word[] manyWords = new Word[hashArraySize];
		//nothing exists in that array until I fill it...
		System.out.println(myWord.hashCode());
		manyWords[myWord.hashCode()%hashArraySize] = myWord;
		System.out.println(manyWords[myWord.hashCode()%hashArraySize].equals(myWord));
		//basically .... this is a hashset
	}
}
