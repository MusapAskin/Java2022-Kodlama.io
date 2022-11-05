package Polymorphism;

public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}

	public void add() {
		System.err.println("Customer added.");
		this.logger.log("Log Message.");
	}

}
