package SOLID_Principles.SingleResponsibility;

public class Employee {

	private int id;
	private String name;
	/*
	 * here Single Responsibility concept implemented means if change in adress
	 * don't need to touch Employee class
	 */
	private Address address;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
