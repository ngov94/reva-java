package w1d4;

import java.util.Scanner;

import w1d2.Word;

public class CLIDriver {

	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		BinarySearchTree<Word> neenasTree = new BinarySearchTree<>();
		while(true) {
			String in = userIn.nextLine();
			Word newWord = new Word(in.toCharArray());
			try {
				neenasTree.add(newWord);
			}catch(AlreadyExistsInTreeException exception) {
				exception.printStackTrace();
			}	
		}
		

	}

}
