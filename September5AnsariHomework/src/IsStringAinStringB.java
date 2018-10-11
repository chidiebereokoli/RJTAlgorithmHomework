import java.util.*;
public class IsStringAinStringB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IsStringAinStringB("Madam curie2","Radium came1q2");
	//	AnagramChecker("myself", "selfmy2");
	}

	public static String spaceremover(String string) {
		int size = string.length();
		char [] characters = string.toCharArray();
		StringBuilder sb = new StringBuilder ();
		
		for (int i=0; i<size; i++) {
			if (characters[i] == ' '||characters[i] == '-'||characters[i] == '_') {
				continue;
			}
			else {
				sb.append(characters[i]);
			}
		}
		return sb.toString();
	}
	
		public static void IsStringAinStringB (String string1, String string2) {
		//Remove the spaces from the strings, and convert them to lowercase/upercase;
		
		String string11 = spaceremover(string1).toLowerCase();
		String string22 = spaceremover(string2).toLowerCase();
		
		int size1 = string11.length();
		int size2 = string22.length();
		
		char [] char1 = string11.toCharArray();
		char [] char2 = string22.toCharArray();
		
		if (size1 <= size2) {
			//int counter = 0;
			for (int i=0; i<size1; i++) {
				char char11 = char1[i]; //save the current character in the first string as a character variable
				int frequency1 = 0;   //Initialize character occurrence frequencies and a counter
				int frequency2 = 0;

				for (int j=0;j<size1;j++) {		//find the frequency of occurrence of char11 in the first string
					if (char11 == char1[j]) {
						frequency1++;
					}
				}
				
				for (int k = 0; k<size2; k++) {  //find the frequency of occurrence of char11 in the second string
					if (char11 == char2[k]) {
						frequency2++;
					}
				}
				
				if (frequency1 <= frequency2) {	//if frequency1 is equal to frequency2, increment the counter		
					//counter++;	
					
					if (i == size1-1) {		//If we have evaluated the last character in the string
						System.out.println("The 1st String is contained in the 2nd String! Yay!!");
						return;
					}
					else {
						continue;
					}
				}
				else {							//otherwise, return false immediately, the 2 strings are not anagrams
					System.out.println("The 1st string is not contained in the 2nd string!!");
					return;
				}
			
			}
		}
		else {
			System.out.println("The 1st string is not contained in the 2nd string!!!");
			return;
		}
		
	}
}
