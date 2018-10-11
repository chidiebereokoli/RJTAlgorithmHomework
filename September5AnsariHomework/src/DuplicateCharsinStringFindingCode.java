//This Java code will find the duplicates in an string if there is more than one duplicate
//[MORE THAN ONE DUPLICATE MEANS THAT THE NUMBER OF REPITIION FOR THE ELEMENT IS 3 OR MORE]

import java.util.*;

public class DuplicateCharsinStringFindingCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {2,83,9,7,90,490,56,9,5,490,85,2,5,90,12,85,2, 83,90,43,24,2, 490,90,98,67,39,83, 490,90};
		String string ="Mississippi999";
		Hashtable<Character, Integer> results = new Hashtable<Character, Integer>();	//Empty hashtable to be populated by duplicatefinder method
		Hashtable<Character, Integer> finalresults = duplicatefinder(string, results);
		System.out.println("The items in the array that have a frequency of more than 3 are as stated below;");
		//System.out.println("The items in the array that have a frequency of 2 are as stated below;");
		System.out.println(finalresults);
		Character character;
		Integer frequency;
		Enumeration<Character> enumeration = finalresults.keys();
		while(enumeration.hasMoreElements()) {
			character = enumeration.nextElement();
			frequency = finalresults.get(character);
			System.out.println(character + ": "+ frequency);
		}
		
	}

public static Hashtable<Character, Integer> duplicatefinder(String string,Hashtable<Character, Integer> finalresults){
		int i;
		int j;
		int size = string.length();
		char [] characters = string.toCharArray();

		for (i=0; i<size; i++) {
			char char1 = characters[i];
			int frequency = 0;
		
				for (j = 0; j<size; j++) {
					if (char1 == characters[j]) {
						frequency++;
					}
				}
//the for loop above finds the frequency of each element in the array, while elements of the array that have
//3 or more duplicates,which have not been already inserted in the hash table will be inserted in the hashtable				
			if (frequency >= 3 &&  !finalresults.containsKey(char1)) {
				//if (frequency == 2 &&  !finalresults.containsKey(char1)) {		
					//finalresults.put(Character.valueOf(char1), frequency); //same as the line below
					finalresults.put(new Character(char1), frequency);
				}
		}
		return finalresults;
		
	}
	
}

