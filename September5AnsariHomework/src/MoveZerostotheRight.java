//3)Given an array {0,2,0,1,0,2,1,2,1,0} move all zeros to right {2,1,2,1,2,1,0,0,0,0}
public class MoveZerostotheRight {

	//public static int[] MoveZerostotheRight (int array[]) {
	public static void MoveZerostotheRight (int array[]) {	
		int size = array.length;
		int [] final_array = new int [size];
		int counter =0;
		for (int i=0;i<size;i++) {
			if (array[i]==0) {
				
				continue;
			
			}
			else {
				
				final_array[counter]=array[i];
				counter++;
			
			}
		}
		for(int j=counter; j<size; j++) {
			final_array[j] = 0;
		}
			
		for(int k=0;k<size;k++) {
			System.out.println(final_array[k]);
		}
		
	//return final_array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {0,2,0,1,0,2,1,2,1,0};
		MoveZerostotheRight(array);

	}

}
