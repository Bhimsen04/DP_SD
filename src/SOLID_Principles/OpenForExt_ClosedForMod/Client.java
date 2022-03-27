package SOLID_Principles.OpenForExt_ClosedForMod;

public class Client {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "Bhimsen");
		System.out.println(employee);

		TrainedEmployees employeesT = new TrainedEmployees(1, "Bhimsen", "Online");
		System.out.println(employeesT);

	}

}
