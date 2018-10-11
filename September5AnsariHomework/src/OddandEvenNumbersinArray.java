import java.util.ArrayList;
import java.util.Vector;

//Write a java program to print odd and even number from an array.
public class OddandEvenNumbersinArray {
	public static void OddandEvenNumbersinArray(int[] array) {
	
		int size = array.length;
		ArrayList<Integer> oddnumbers = new ArrayList<>();
		Vector<Integer> evennumbers = new Vector<>();
		
		for(int a : array) {
			if (a%2 == 0) {
				evennumbers.add(a);
			}
			else {
				oddnumbers.add(a);
			}
		}
		System.out.println("The odd numbers in the array are "+ oddnumbers);
		System.out.println("The even numbers in the array are "+ evennumbers);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,83,9,7,90,490,56,9,5,490,85,2,5,90,12,85,2, 83,90,43,24,2,490,90,98,67,39,83, 490,90};
		
		OddandEvenNumbersinArray(arr);

	}

}
