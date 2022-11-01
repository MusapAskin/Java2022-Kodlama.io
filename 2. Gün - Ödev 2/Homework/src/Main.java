import oop.Product;
import oop.ProductManager;
import oop.Customer;
import oop.CustomerManager;
import oop.Employee;
import oop.EmployeeManager;

public class Main {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 5, 7, 9, 10 };
		System.out.println(MiniProject5.findNumber(numbers, 7));
		ReCapDemoCalculator calculator = new ReCapDemoCalculator();
		System.out.println(calculator.sum(4, 3, 2, 1));
		Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3);
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getCode());
		Customer customer = new Customer();
		Employee employee = new Employee();
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		customer.setFirstName("Engin");
		employee.setLastName("Demirog");
		customerManager.add(customer);
		employeeManager.bestEmployee(employee);
	}
}
