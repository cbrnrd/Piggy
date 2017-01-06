package piggy;

import java.util.*;
import java.io.*;

public class Pig {

	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter what you wish to translate: ");
		try{
			String inputString = userInput.nextLine();
			
			inputString.trim();
			inputString.toLowerCase();
			
			// rearrange this if loop to a for loop
			if (inputString.contains("1") || 
			    inputString.contains("2") ||
			    inputString.contains("3") ||
			    inputString.contains("4") ||
			    inputString.contains("5") ||
			    inputString.contains("6") ||
			    inputString.contains("7") ||
			    inputString.contains("8") ||
			    inputString.contains("9") || 
			    inputString.contains("0")){
				
				System.out.println("Input can't include numerical values.\nExiting...");
				userInput.close();
				System.exit(1);
			}
		
			
			//check for empty input
			if(inputString.isEmpty()){
				System.out.println("Don't enter empty stuff.\nExiting...");
				userInput.close();
				System.exit(1);
			}
			String[] modifiedStringArray = inputString.split(" "); //Split the String up into multiple Strings
			
			
			//Do some string manipulation magic in here
			for(int i = 0; i < modifiedStringArray.length; i++){
				char firstLetter = modifiedStringArray[i].charAt(0);
				modifiedStringArray[i] = modifiedStringArray[i].substring(1);
				modifiedStringArray[i] = modifiedStringArray[i] + firstLetter + "ay";
				System.out.print("\n" + modifiedStringArray[i] + " ");
			}
			
			userInput.close();
		}catch(Exception e){
			System.out.println("ERROR!!! ERROR!!! ERROR!!! \nPrinting stack trace and exiting...");
			e.printStackTrace();
		}
		
	}
}
