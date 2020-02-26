package SquareRoot;

public class SquareRoot {

	public static int squareRoot(int number) {
		int result=0;
		while (result*result <= number) {
			result++;
		}
			
		return result-1;
	}
	
}
