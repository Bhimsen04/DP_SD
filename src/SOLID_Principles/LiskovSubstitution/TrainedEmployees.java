package SOLID_Principles.LiskovSubstitution;

public class TrainedEmployees extends Employee {

	private String trainingAreas;

	TrainedEmployees(int id, String name, String trainingAreas) {
		super(id, name);
		this.trainingAreas = trainingAreas;
	}

}
