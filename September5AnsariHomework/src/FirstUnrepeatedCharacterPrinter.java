//How to program to print first non repeated character from String?
import java.util.*;

public class FirstUnrepeatedCharacterPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enter the test string here
			firstunRepeatedCharacter("Mississippi2");
	}
	
	public static void firstunRepeatedCharacter (String string) {
		int size = string.length();
		char [] char1 = string.toCharArray();//we convert create a character array, otherwise no string manipulation can be done
		StringBuffer sb = new StringBuffer();
		
		for (int i=0;i<size; i++) {
			char current_letter = char1[i];
			int frequency=0;
			
			for(int j=0;j<size; j++) {
				if (current_letter == char1[j]) {
					frequency++;
				}
			}
				if (frequency == 1) {//once we find the first character that has a frequency = 1, we are ready to leave the loop
					System.out.println("The first non repeated character in the string is "+current_letter);
					return;
				}
			if (frequency > 1 && i==size-1) { //if we havent found a character with freq. =1, and we are at the end of the loop(i=size-1)
				System.out.println("There is no repeated character in the string!!!");
				}
		}
		
		return;
		
	}

}
