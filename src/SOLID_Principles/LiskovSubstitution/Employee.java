package SOLID_Principles.LiskovSubstitution;

public class Employee {

	private int id;
	private String name;
	// private Address address;
	/*
	 * if we add below, and change constructor as well , it breaks existing
	 * functionality so create new class and add there , extend this class means
	 * employee class "open for extension" &
	 * "closed for modification in the same class"
	 */
	// private String trainingAreas;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void printMe() {
		System.out.println("Id: " + id + " , name: " + name);
	}

}
