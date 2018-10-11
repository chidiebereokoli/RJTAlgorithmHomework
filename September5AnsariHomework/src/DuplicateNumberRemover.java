import java.util.Arrays;

//Remove duplicate numbers from sorted array(DO not use Collection framework)
public class DuplicateNumberRemover {
	public static int [] DuplicateNumberRemover(int array[]){

		int size = array.length; 			//Get the length of the input int array
												
		Arrays.sort(array);					//Sort the string (only in this way will the algo. work)
		
		int result [] = new int[size];		//Create a new int array and set the size to be equal to the size of the given array
		int counter = 0;					//will return a string, and not a hexadecimal hash(which char array would return)
		result [0] = array[0];				//Append the first element of int [] array into int result[] before going into the loop
											//Actually can choose to append the last element of int [] array at the end of the loop,
											//just before creating the final_result [], but you will now save array[i](not i+1)	
											//For loop loops over the int array, and if an int element is not equal to
											// the subsequent element in the array, the subsequent array element is saved
		for(int i= 0;i<size-1;i++) {	
			int number = array[i+1];	
			if (number != array[i]) {
				result[counter] = number;
				counter++;
			}
		}
		int final_result [] = new int[counter];
		
		System.arraycopy(result, 0, final_result, 0, counter); //with this technique, we can copy the contents of a regular array to a new array
		
		return final_result;				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,83,9,7,90,490,56,9,5,490,85,2,5,90,12,85,2, 83,90,43,24,2, 490,90,98,67,39,83, 490,90};
		
		int [] result  = DuplicateNumberRemover(arr);
		
		for(int a: result) {
			System.out.println(a);
		}
	}

}
