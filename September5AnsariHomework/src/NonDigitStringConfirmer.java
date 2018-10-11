//How to check if a String contains only digits?
import java.util.*;
public class NonDigitStringConfirmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isStringNonDigit("dflsajfoas901nafshiwoo"));
		System.out.println(isStringNonDigit("f.0123456789"));
	}

	public static boolean isStringNonDigit(String string) {
		int size = string.length();
		char [] char1 = string.toCharArray();
		
		for(int i=0;i<size;i++) {
			
//We are able to use the fact that the expression below will always return an int that is less than 9, if char1[i] is an int.
			//int y = char1[i]- '0';
			
			if ((char1[i]- '0')<=9) {
				continue;
			}
			else {
				return false;
			}
		}
		
		return true;
	}
}
