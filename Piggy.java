import java.util.*;
import java.io.*;

public class Pig {

	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter what you wish to translate: ");
		String inputString = userInput.nextLine();
		
		inputString.trim();
		inputString.toLowerCase();
		
		// rearrange this if loop to a for loop
		if (inputString.contains("1") || inputString.contains("2") || inputString.contains("3") || inputString.contains("4") || inputString.contains("5") || inputString.contains("6") || inputString.contains("7") || inputString.contains("8") || inputString.contains("9") || inputString.contains("0")){
			System.err.println("Input can't include numerical values.");
			userInput.close();
			main(null);
		}
	
		
		//check for empty input
		if(inputString.isEmpty()){
			System.err.println("Don't enter empty stuff.");
			userInput.close(); //TODO check if this needs to be closed
			main(null);
		}
		String[] modifiedStringArray = inputString.split(" "); //Split the String up into multiple Strings
		
		
		//Do some string manipulation magic in here
		for(int i = 0; i < modifiedStringArray.length; i++){
			char firstLetter = modifiedStringArray[i].charAt(0);
			modifiedStringArray[i] = modifiedStringArray[i].substring(1);
			modifiedStringArray[i] = modifiedStringArray[i] + firstLetter + "ay";
			System.out.print(modifiedStringArray[i] + " ");
		}
		
		userInput.close();
	}
}
