package oop;

public class Main {

	public static void main(String[] args) {
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
		CreditUI creditUI=new CreditUI();
		creditUI.calculateCredit(new TeacherCreditManager());
	}

}
