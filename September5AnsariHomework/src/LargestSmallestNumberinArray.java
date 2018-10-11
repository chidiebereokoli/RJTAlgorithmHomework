//Given a array of random numbers ,find the largest/smallest number from the array
public class LargestSmallestNumberinArray {

	
	public static int LargestSmallestNumberinArray(int array[]) {
		
		int size = array.length;
		int largest = array[0];
		
		for(int i=1;i<size;i++) {
			if (largest <array[i]) {   
		//  if (largest >array[i]) { 	// to find the smallest number in the array, we change the less than sign to greater than
				largest = array[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,83,9,7,90,490,56,9,5,490,85,2,5,90,12,85,2, 83,90,43,24,2,490,90,98,67,39,83, 490,90};
		
		System.out.println(LargestSmallestNumberinArray(arr));
	}

}
