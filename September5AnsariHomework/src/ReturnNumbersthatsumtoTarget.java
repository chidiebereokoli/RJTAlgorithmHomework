//Given int[] array, return number with sum target for example {1,2,7,8,9}, target is 9, return (1,8),(2,7)
import java.util.*;
public class ReturnNumbersthatsumtoTarget {
	
	public static void elementsofAccumulationFinder(int [] array, int aggregatesum) {
		boolean status = false;
		int size = array.length;
		for (int i= 0;i<size;i++) {
			//int element = array[i];
			//use indexOf
			//for(int j=0;j<size;j++) {
				for(int j=i+1;j<size;j++) {
				if ( (array[i]+array[j]==aggregatesum) ) {
					status = true;
					System.out.println(array[i]+" "+array[j]);
				}
			}
		}
		if (status = false) {
			System.out.println("No summation elements were found in the array!!");
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] array = {10,8,45,32,1,5,4,3,29,4,7,8,9,10,43,98,9,1,2,3,4,5,6,7,8,9,0,78,98,21,31,41,5};
		//int [] array = {5,3,10,20,7,1,1,7};
		int [] array ={1,2,7,8,9};
		//int summation = 8;
		//int summation = 16;
		int summation = 9;
		elementsofAccumulationFinder(array,summation);
	}

}
