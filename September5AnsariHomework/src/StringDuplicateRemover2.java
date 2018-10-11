//Write a program to remove a duplicate characters from String?
//"abcfacg"
import java.util.*;

public class StringDuplicateRemover2 {
	/**
	 * 
	 * @param string
	 * @return
	 */
	public static Set duplicateRemover2(String string) {
		int size = string.length();
		
		Set<Character> firstset=new HashSet<Character>();
		
		for (int i=0;i<size;i++) {
			Character c = string.charAt(i);
			firstset.add(c);
		}
		return firstset;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set result = duplicateRemover2("abcfacg");

		System.out.println(result);

	}

}



//[This uses algorithm uses the indexOf(char character) and charAt(int index) methods for strings]
//Most importantly, it does not use the collection framework
/*public class StringDuplicateRemover2 {
	public static String duplicateRemover2(String string) {
		String strong = new String ();	//This empty string will eventually contain all the unique elements of the original string
		int size = string.length();		//(without the duplicates)
		for(int i=0;i<size;i++) { 		//Loop through all the elements of the string
			char c = string.charAt(i);	//Save the character at index position with the char variable c
			if (strong.indexOf(c)==-1) {//The indexOf method returns the index of the argument char in the string, and if this char
				strong += c;			//is not in the string, it returns -1. Thus if we save into the String strong only when indexOf 
			}							//returns -1, we will only save unique elements into the string.
		}
		return strong;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = duplicateRemover2("abcfacg");

		System.out.println(result);

	}

}*/