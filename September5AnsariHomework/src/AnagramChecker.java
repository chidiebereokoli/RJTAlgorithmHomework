
import java.util.*;

public class AnagramChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		anagramchecker("Madam Curie","Radium came");
	}
	
	
	public static String spaceRemovalMethod (String string) {
		/**
		 * Method to remove the spaces from the strings; we can use the string buffer or the string builder
		 */
		int size = string.length();
		char [] char1 = string.toCharArray();
		StringBuffer sb = new StringBuffer ();
		for (int i = 0; i<size; i++) {
			
				if (char1[i] == ' '|| char1[i] == '-'||char1[i] == '_') {
					continue;
				}
				else {
					sb.append(char1[i]);
				}
			
		}
		return sb.toString();
	}
	
	
	public static void anagramchecker(String string_1, String string_2) {
		
		//Remove the spaces from the argument strings if any, and change all the letters to lowercase;
		String string1 = spaceRemovalMethod(string_1).toLowerCase();
		String string2 = spaceRemovalMethod(string_2).toLowerCase();
		
	
		int size1 = string1.length();
		int size2 = string2.length();
		
		//We convert to char, as this is the only way with which we can access the individual elements of the string
		char [] char1 = string1.toCharArray();
		char [] char2 = string2.toCharArray();

		
		// if the sizes of the  2 strings to be compared are not equal, after white spaces have been removed, there is no need to proceed further.
		if (size1==size2) {
			int size = size1;
			//int character_counter = 0;                                              ===
			//int size = size2; //Both achieve the same thing
			for(int i = 0;i<size; i++) {
				char char11 = char1[i];
				int frequency1 = 0;
				int frequency2 = 0;

				for (int j = 0;j<size; j++) {
					if (char11 == char1[j]) {
						frequency1++;
					}
				}
				for(int k=0;k<size;k++) {
					if (char11 == char2[k]) {
						frequency2++;
					}
				}
				if (frequency1 == frequency2 ) {		
					//character_counter++;                                             ===

					//if (character_counter == size-1)                                 ===
					if (i == size - 1)	//ARE WE ON THE LAST ITERATION FOR THE BIG FOR LOOP with iteration counter i?
					{
						System.out.println("the 2 strings are anagrams of each other!!!!"); 	
						return;
					}
					else {
						continue;
					}
				}
				else {
					//one string has a char with a frequency different from the frequency of the same character in the other string			
					System.out.println("the 2 strings are not anagrams of each other"); 
					return;
				}				
			}

		}
		else {
			System.out.println("the 2 strings are not anagrams of each other");
			return;
		}
	}

}
