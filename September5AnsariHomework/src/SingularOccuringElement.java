import java.util.Vector;

//Find the element that appears once in an array where every other element appears twice.
public class SingularOccuringElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {10,8,45,32,1,5,4,3,29,4,7,8,9,10,43,98,9,1,2,3,4,5,6,7,8,9,0,78,98,21,31,41,5};
		Vector<Integer> result = singularoccuringelement(array);
/*		for (int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}*/
		
	}


	public static Vector<Integer> singularoccuringelement(int [] array) {
		int size = array.length;
		
		Vector<Integer> result = new Vector<Integer>();
		
		for (int i=0;i<size;i++) {
			int element = array[i];
		
			
			int frequency = 0;
			for(int j=0;j<size;j++) {
				if (element == array[j]) {
					frequency++;
				}
			}
			if (frequency <=1) {
				result.add(element);
				
				System.out.println(element);
			}
		}
		return result;
	}
	
}
