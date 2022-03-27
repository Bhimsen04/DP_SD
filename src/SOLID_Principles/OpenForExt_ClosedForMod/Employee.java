package SOLID_Principles.OpenForExt_ClosedForMod;

public class Employee {

	private int id;
	private String name;
	private Address address;
	/*
	 * if we add below, and change constructor as well , it breaks existing
	 * functionality so create new class and add there , extend this class means
	 * employee class "open for extension" &
	 * "closed for modification in the same class"
	 */
	// private String trainingAreas;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
