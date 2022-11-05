package overriding;

public class StudentCreditManager extends BaseCreditManager {
	//Overriding
	public double calculate(double amount) {
		return amount * 1.15;
	}
}
