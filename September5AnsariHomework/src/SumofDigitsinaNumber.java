//Find the sum of digits of entered number eg., 12547--->19

public class SumofDigitsinaNumber {

	
	public static int SumofDigitsinaNumber(int number) {
		int number_passed = number;
		int result = 0;
		do {
			int digit = number_passed % 10;
			number_passed = number_passed/10;
			result = result +digit;
		}while (number_passed>0);
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result1  = SumofDigitsinaNumber(12547);
		int result2  = SumofDigitsinaNumber(456);
		System.out.println(result1);
		System.out.println(result2);

	}

}
