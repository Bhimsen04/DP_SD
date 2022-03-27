package SOLID_Principles.LiskovSubstitution;

public class Client {

	public static void main(String[] args) {
		Employee employeeBaseClass = new Employee(1, "Bhimsen"); // base type
		TrainedEmployees employeesTraDerivedClass = new TrainedEmployees(1, "Bhimsen", "Online"); // derived type
		employeeBaseClass.printMe();
		employeesTraDerivedClass.printMe();
		Client client = new Client();
		client.useMeToPrintYourData(employeesTraDerivedClass);
	}

	void useMeToPrintYourData(Employee employeeBaseClass) {
		employeeBaseClass.printMe();
	}
}
