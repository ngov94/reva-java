import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Day2Task{
	
	public static void main(String [] args) throws IOException, InterruptedException{
		
		
		File neenasFile = new File ("story.txt");
		File neenasFileOut = new File ("fixedStory.txt");
		
		FileReader neenasFileReader = new FileReader(neenasFile);
		FileWriter neenasFileWriter = new FileWriter(neenasFileOut);

		
		boolean readingFile = true;
		int numCharacters = 0;
		int numWords = 0;//TASK 1
		int numSentences = 0;//TASK 2
		
		
		while(readingFile) {
			
			int readByte = neenasFileReader.read();
			if(readByte != -1) {
				char readCharacter = (char) readByte;
		
				//TASK 1
				if(readCharacter == ' ') {
					numWords++;
				}
				
				//TASK 2
				if(readCharacter == '.' || readCharacter == '!' || readCharacter == '?') {
					numSentences++;
				}
				
				numCharacters++;
				
				//TASK 3
				caesarCiper(neenasFileWriter, readCharacter, 2);
				
				
			}else if(readByte == -1) {
				readingFile = false;
			}	
			
		}
		//TASK 1 -- to account for last word (assumption: the text document doesn't end with a space)
		numWords++;
		
		System.out.println("Number of characters: "+numCharacters);
		System.out.println("Number of words: "+numWords);//TASK 1
		System.out.println("Number of sentences: "+numSentences);//TASK 2
		
		neenasFileWriter.close();
		neenasFileReader.close();

	}
	
	//TASK 3
	public static void caesarCiper(FileWriter fileWriter, char charToBeWritten, int shift) throws IOException {
		
		shift = shift%26;
		int charShift = charToBeWritten + shift;
		
		if (charToBeWritten >= 'a' && charToBeWritten <= 'z'){	
			if(charShift > 'z') {
				charShift = 'a' + (charShift - 'z') - 1;
			}
			else if (charShift < 'a') {
				charShift = 'z'- ('a' - charShift) + 1; 
			}
			fileWriter.append((char) charShift);	
		}
		else if(charToBeWritten >= 'A' && charToBeWritten <= 'Z') {
			if(charShift > 'Z') {
				charShift = 'A' + (charShift - 'Z') - 1;
			}
			else if (charShift < 'A') {
				charShift = 'Z' - ('A' - charShift) + 1; 
			}
			fileWriter.append((char) charShift);		
		}
		else {
			fileWriter.append(charToBeWritten);
		}
	}
	
}
