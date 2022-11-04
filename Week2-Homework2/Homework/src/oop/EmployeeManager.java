package oop;

public class EmployeeManager extends PersonManager {
	public void bestEmployee(Employee employee) {
		System.out.println("Best employee is : " + employee.getLastName());
	}
}
