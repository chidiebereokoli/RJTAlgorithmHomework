//Write a program to remove a duplicate characters from String?

//I will create a string array, then I will use an iterator to looop through the array elements,
//one after the other, if a character is found with a frequency of more than 1, the extra will be reomoee
import java.util.*;
public class StringDuplicateRemover {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = new String ("abcfacg");
		System.out.println(duplicateremover(string));
	}

	public static String duplicateremover(String string) {

		int size = string.length(); 				//Get the length of the input string
		char [] characters = string.toCharArray();	//Convert it to a char array (we can then manipulate it)
		Arrays.sort(characters);					//Sort the string (only in this way will the algo. work)
													//Create a StringBuilder/StringBuffer(calling toString of this object
		StringBuilder sb = new StringBuilder();		//will return a string, and not a hexadecimal hash(which char array would return)
		sb.append(characters[0]);					//Append the first character into StringBuilder sb before going into the loop
		for(int i= 0;i<size-1;i++) {				//Actually can choose to append the last character at the end of the loop,
			char character = characters[i+1];		//just before returning sb.toString, but you will now save characters[i](not i+1)	
			if (character !=characters[i]) {		//For loop loops over the char array, and if a char element is not equal to
				sb.append(character);				// the subsequent element in the array, the subsequent array element is saved
			}
		}
		return sb.toString();				
	}

}
