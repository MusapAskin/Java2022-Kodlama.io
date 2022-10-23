
public class ReCapDemo2 {
	public static void maxListNumber(double[] list) {
		double total = 0;
		double max = list[0];
		for (double number : list) {
			if (max < number)
				max = number;
			total += number;
		}
		System.out.println("Toplam: " + total);
		System.out.println("Max Number: " + max);
	}
}
