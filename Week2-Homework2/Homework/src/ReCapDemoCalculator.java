
public class ReCapDemoCalculator {
	public int sum(int number1, int number2) {
		return number1 + number2;
	}
	//Overloading
	public int sum(int... numbers) {
		int total=0;
		for(int number:numbers) 
			total+=number;
		return total;
	}
	public int extraction(int number1, int number2) {
		return number1 - number2;
	}
	public int multiplication(int number1, int number2) {
		return number1 * number2;
	}
	public int division(int number1, int number2) {
		return number1 / number2;
	}
}
