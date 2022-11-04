package Overriding;

public class AgricultureCreditManager extends BaseCreditManager{
	//Overriding
	public double calculate(double amount) {
		return amount * 1.1;
	}
}
