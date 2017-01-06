package piggy;

import java.util.*;
import java.io.*;

public class Pig {

	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter what you wish to translate: "); //prompt
		try{
			String inputString = userInput.nextLine(); //get the input from the user
			
			inputString.trim(); //just in case
			inputString.toLowerCase(); 
			
			// checks if the input contains a (String) number.
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
			for(int i = 0; i < modifiedStringArray.length; i++){ //itterate through the array linearly
				char firstLetter = modifiedStringArray[i].charAt(0); //store the first letter of the string
				modifiedStringArray[i] = modifiedStringArray[i].substring(1); //get everything else but the first letter
				modifiedStringArray[i] = modifiedStringArray[i] + firstLetter + "ay"; //put the first letter at the and and add 'ay'
				System.out.print(modifiedStringArray[i] + " "); //print it out
			}
			userInput.close();
		}catch(Exception e){
			System.out.println("ERROR!!! ERROR!!! ERROR!!! \nPrinting stack trace and exiting..."); //for other errors
			e.printStackTrace();
		}
		
	}
}
