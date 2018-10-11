//Write a program to remove a given characters from String?
import java.util.*;
public class CharacterRemover {

	public static String characterRemover(String string, char a) {
		int size = string.length();						//Obtain the size of the string (this determines the max loop count)
		char [] characters = string.toCharArray();		//Convert the string to an array of characters	
		StringBuffer sb = new StringBuffer();			//Create a stringbuffer/StringBuilder object
		
		for (int i=0;i<size; i++) {						//In the for loop, if the character evaluated in each iteration is not
			if (characters[i]!='e') {					//equal to the character to be removed, save it in the stringbuffer object
				sb.append(characters[i]);				//sb, otherwise skip it.
			}
		}
		return sb.toString();							//return the result of the toString() operation on the stringbuffer object
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(characterRemover("chidiebere",'e'));
		
	}

}
