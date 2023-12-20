package Lab_01;

public class Exercise02 {
	public static int fastExp(int base, int exponent, int modulus) {
		
		if (exponent==0) {
			return 1;
		}
		else if ((exponent % 2) == 0) {
			int baseToHalfExponent = fastExp(base, exponent / 2, modulus);
			return (baseToHalfExponent * baseToHalfExponent) % modulus;
		}
		else {
			int baseToExponentMinusOne = fastExp(base, exponent - 1, modulus);
			return (base * baseToExponentMinusOne) % modulus;
		}
	}
}
