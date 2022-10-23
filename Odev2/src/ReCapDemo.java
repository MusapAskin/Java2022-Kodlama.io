
public class ReCapDemo {
	public static void reCapDemo(int number1, int number2, int number3) {
		int max = number1;
		if (max < number2)
			max = number2;
		if (max < number3)
			max = number3;
		System.out.println("En buyuk sayi: " + max);
	}
}
