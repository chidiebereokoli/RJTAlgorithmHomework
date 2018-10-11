//
import java.util.*;
public class PalindromeStringChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromestringchecker("yutrewqwertuy");
	}

	 public static void palindromestringchecker(String string) {
		 char [] characters = string.toCharArray();
		 int size = characters.length;
		 int half_size = size/2;
		 int counter = 0;
		 for (int i= 0;i<half_size; i++) {
			 if (characters[i] == characters[size - i-1]) {
				 counter++;
			 }

		 }
		 if (counter == half_size) {
			 System.out.println(string + " is a palindrome string!!!");
		 }
		 else {
			 System.out.println(string + " is not a palindrome string!!!"); 
		 }
	 }
	
}
