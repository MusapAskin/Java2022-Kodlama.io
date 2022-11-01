
public class MiniProject5 {
	public static int findNumber(int[] numbers, int target) {
		int i = 0;
		do {
			if (target == numbers[i])
				return i;
			i++;
		} while (i < numbers.length);
		return -1;
	}
}