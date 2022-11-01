package oop;

public class PersonManager {
	public void list() {
		System.out.println("Listed.");
	}
	public void add(Person person) {
		System.out.println(person.getFirstName()+" is added.");
	}
}
