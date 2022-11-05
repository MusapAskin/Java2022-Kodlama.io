package polymorphism;

public class EmailLogger extends BaseLogger {
	// Overriding
	public void log(String message) {
		System.out.println("Logged to email: " + message);
	}
}
