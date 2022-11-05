package overriding;

public class TeacherCreditManager extends BaseCreditManager{
	//Overriding
	public double calculate(double amount) {
		return amount * 1.12;
	}
}
