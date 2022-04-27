package w1d2;

public class Word {
//	think of objects as a custom type..
//	objects are an instance of a class..
//	they have independent states and behavior
	
	
	//access modifier
	//4 in java: private, public, protected, defaults
	//access modifiers influence whether the variable, method, object,
	//class can be accessed outside of its object
	//this relates to the oop concept of encapsulation
	
	private char[] charArray;
	private int length;
	
	public Word() {
		
		char[] cArray = {'d','e','f','a','u','l','t'};
		charArray = cArray;
		length = 7;
		
	}
	
	public Word(char[] charArray, int length) {
		char[] copiedArray = new char[length];
		for(int i = 0;i < length; i++) {
			copiedArray[i] = charArray[i];
		}
		this.charArray = copiedArray;
		this.length = length;
	}
	
	public Word(char[] charArray) {
		this(charArray,charArray.length);
	}
	
	public String toString() {
		String out = "";
		for(int i =0; i < length; i++) {
			out += charArray[i];
		}
		
		
		return out;
	}
	
	//a method that returns true or false depending on if it contains a certain character:
	public boolean contains(char a) {
		for(int i = 0; i < length; i++) {
			if(charArray[i] == a) {
				return true;
			}
		}
		
		return false;
	}
	
	//a method that returns the first index of a certain character
	public int indexOf(char a) {
		for(int i = 0; i < length; i++) {
			if(charArray[i] == a) {
				return i;
			}
		}
		return -1;	
	}
	
	//a method that returns true if another word is equal to this word (word1.equals(word2))
	public boolean equal(Word a) {
		
		if (a.length != length)
			return false;
		
		for(int i = 0; i < length; i++) {
			if(charArray[i] != a.charArray[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	//a method that returns -1 if the word is before another lexigraphically (like in a dictionary), 0 if equal, 1 if after lexigraphically
	public int order(Word a) {
		
		if (length < a.length) {	
			for(int i = 0; i < length; i++) {
				if(Character.toLowerCase(charArray[i]) > Character.toLowerCase(a.charArray[i])) {
					return 1;
				}
				else if(Character.toLowerCase(charArray[i]) < Character.toLowerCase(a.charArray[i])) {
					return -1;
				}
			}
			return -1;
		}
		else if(length >= a.length){
			for(int i = 0; i < a.length; i++) {
				if(Character.toLowerCase(charArray[i]) > Character.toLowerCase(a.charArray[i])) {
					return 1;
				}
				else if(Character.toLowerCase(charArray[i]) < Character.toLowerCase(a.charArray[i])) {
					return -1;
				}
			}
			if (length > a.length)
				return 1;
		}
		
		
		return 0;
	}
	//a method that concatenates(combines) two words together - eg. cat.concat(dog) = catdog
	public Word concatWord(Word a) {
		
		int comlen = this.length + a.length;
		
		char[] combine = new char[comlen];
		
		for(int i = 0; i < this.length; i++) {
			combine[i] = this.charArray[i];
		}
		for(int j = this.length; j < comlen; j++) {
			combine[j] = a.charArray[j-this.length];
		}
		
		return new Word(combine, comlen);
			
	}
	//a method that replaces a character with another at a given index
	public void replace(int index, char a) {
		charArray[index] = a;
	}
	
	public char[] getCharArray() {
		return charArray;
	}
	public char getIndex(int i) {
		return charArray[i];
	}
	
	public int getLength() {
		return length;
	}
	//a method that replaces all of a particular character with another
	public void replaceAll(char toBeReplaced, char newChar) {
		for(int i = 0; i < length; i++) {
			if(charArray[i] == toBeReplaced) {
				charArray[i] = newChar;
			}
		}	
	}
	//a method that returns all of a word until a particular index (substring) 
	public Word substring(int lastIndex) {
		char[] tempArray = new char[lastIndex];
		
		for(int i = 0; i < lastIndex; i++) {
			tempArray[i] = charArray[i];
		}
		
		return new Word(tempArray);
	}
	//a method that returns all of a word between two indexes (first inclusive - second exclusive)
	public Word substring(int firstIndex, int lastIndex) {
		
		int len = lastIndex-firstIndex; 
		char[] tempArray = new char[len];
		
		for(int i = 0; i < len; i++) {
			tempArray[i] = charArray[firstIndex+i];
		}
		
		return new Word(tempArray);
	}
	
	//TASK
	//a method that appends a single character, but when the array runs out of space double the size
	public void appendChar(char a) {
		if (charArray.length > length) {
			this.replace(length, a);
			this.length++;
		}
		else {
			char[] tempArray = new char[charArray.length*2];
			for(int i = 0;i < length; i++) {
				tempArray[i] = charArray[i];
			}
			
			this.charArray = tempArray;
			this.replace(length, a);
			this.length++;
		}
	}
}
