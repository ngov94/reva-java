package w1d2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] myArray = new char[5];
		myArray[0] = 't';
		myArray[1] = 'r';
		myArray[2] = 'u';
		myArray[3] = 'c';
		myArray[4] = 'k';
		
		char[] myArray2 = {'t','r','u','c', 'k'};
		
		String aString = "calendar";
		
		//Word word1 = new Word();
		Word word2 = new Word(myArray, 5);
		Word word3 = new Word(myArray2);
		Word word4 = new Word(aString.toCharArray());
		
		System.out.println(word3);
		boolean truckContainsZ = word3.contains('z');
		System.out.println(truckContainsZ);
		
		System.out.println(word2);
		
		System.out.println(word4.substring(5));
		
	}

}
