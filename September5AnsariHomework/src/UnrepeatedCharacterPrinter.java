//How to program to print first non repeated character from String?
import java.util.*;

public class UnrepeatedCharacterPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enter the test string here
		String string = unRepeatedCharacter("Mississippi223");
		
			System.out.println(string);
			
			//System.out.println(string.charAt(0));
			
			
	}
	
	public static String unRepeatedCharacter (String string) {
		int size = string.length();
		char [] char1 = string.toCharArray();//we convert create a character array, otherwise no string manipulation can be done

		StringBuffer sb = new StringBuffer();
		
		for (int i=0;i<size; i++) {
			char current_letter = char1[i];
			int frequency= 0;
			
			//If current_letter is already present in the StringBuilder sb, no need to proceed, instead continue			
			if (Linear_search(sb,current_letter)) { 
				continue;
			}
			
			for(int j=0;j<size; j++) {
				if (current_letter == char1[j]) {
					frequency++;
				}
			}
				if (frequency == 1) {
					sb.append(current_letter);
				}

		}
		
		return sb.toString();
		
	}
	
	//Function to perform the linear search of an element in an array
	public static boolean Linear_search (StringBuffer sb, char subject){
		int size =sb.length();
	
	    for (int i=0;i< size; i++){
	        if (sb.charAt(i) == subject) {
	            return true;}
	    }
	    return false;
	};

}
