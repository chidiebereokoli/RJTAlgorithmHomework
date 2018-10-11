//Rotate a given array to the right by getting input from user if n=3,then [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
public class RotateArrayToRight {

	public static void RotateArrayToRight(int array[], int n) {
		
		int size = array.length;
		int rotatedarray[] = new int [size]; 
		for (int i=0;i<size;i++) {
			
			if(i<3) {
				rotatedarray[n-1-i]=array[size -1-i];
			}
			else {
				rotatedarray[i]=array[i-n];
			}
		}
		
		for(int k=0;k<size;k++) {
			System.out.println(rotatedarray[k]);
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] array = {1,2,3,4,5,6,7} ;
		RotateArrayToRight(array,3);
	}

}
