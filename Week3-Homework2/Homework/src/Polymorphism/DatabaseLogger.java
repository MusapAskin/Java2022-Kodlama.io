package Polymorphism;

public class DatabaseLogger extends BaseLogger {
	// Overriding
	public void log(String message) {
		System.out.println("Logged to database: " + message);
	}
}
