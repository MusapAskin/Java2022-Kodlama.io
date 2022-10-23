
public class PrimeNumber {
	public static boolean isItPrime(int number) {
		boolean isPrime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				isPrime = false;
		}
		return isPrime;
	}
}
