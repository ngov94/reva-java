package w1d1;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Neena{
	
	public static void main(String [] args) throws IOException, InterruptedException{
		
		//object.. you can thick of an object as a custom type
		//object have their own independent information (states) and behavior
		//File: is the type of the object
		//neenasFile: name of the object
		//new: designates that memory must be allocated to create our object
		//File(..): constructor: some code snippet that is run when we first create that object

		File neenasFile = new File ("story.txt");
		File neenasFileOut = new File ("fixedStory.txt");
		
		FileReader neenasFileReader = new FileReader(neenasFile);
		
		FileWriter neenasFileWriter = new FileWriter(neenasFileOut);

		//primitive type: like char, int, boolean etc, which is the most basic unit of information we have
		
		boolean readingFile = true;
		//int waitAmountMilliseconds = 0;
		int numCharacters = 0;
		
		while(readingFile) {
			//read a number from a file
			int readByte = neenasFileReader.read();
			if(readByte != -1) {
				//convert that number to a character (this is called casting)
				char readCharacter = (char) readByte;
				
				if(readCharacter == '_') {
					readCharacter = ' ';
				}
				
				numCharacters++;
				
				printCharacterToFile(neenasFileWriter, readCharacter, true);
				
				//waiting a set amount of millis
				//Thread.sleep(waitAmountMilliseconds);
			}else if(readByte == -1) {
				readingFile = false;
			}	
			
		}
		
		System.out.println("Number of characters: "+numCharacters);
		neenasFileWriter.close();
		neenasFileReader.close();

	}
	
	public static void printCharacterToFile(FileWriter fileWriter, char charToBeWritten) throws IOException {
		fileWriter.append(charToBeWritten);
	
	}
	
	//method overloading
	public static void printCharacterToFile(FileWriter fileWriter, char charToBeWritten, boolean toUpperCase) throws IOException {
		fileWriter.append(covertCharToUppercaseChar(charToBeWritten));
	
	}
	
	public static char covertCharToUppercaseChar(char charIn) {
		if(charIn >= 'a' && charIn <= 'z') {
			return (char) (charIn +('A'-'a'));
		}
		return charIn;
	}
	
	
}
