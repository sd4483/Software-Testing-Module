package square_root;

public class SquareRoot {
	public static double squareRoot(double x) {
		
		if (x ==0) {
			return 0;
		}
		else {
			double guess = x;
			double previousGuess;
			
			do {
				previousGuess = guess;
				guess = 0.5 * (guess + x/guess);
			} while (previousGuess != guess);
			
			return guess;
		}
	}
	
	public static boolean testSquareRoot(double x) {
		double squareRootx = squareRoot(x);
		return squareRootx >= 0 && squareRootx * squareRootx == x;
	}
}