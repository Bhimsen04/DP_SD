package SOLID_Principles.DependencyInversionPrinciple;

public class Student {

	private Address address;

	// tight coupling, if i will change the address, also need to change Student as
	// well, so completely tight coupling
	public Student() {
		address = new Address();
	}

	// loose coupling, constructor-based or setter-based dependency inversion
	public Student(Address address) {
		this.address = address;
	}

}
