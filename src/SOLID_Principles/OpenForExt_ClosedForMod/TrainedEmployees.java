package SOLID_Principles.OpenForExt_ClosedForMod;

public class TrainedEmployees extends Employee {

	private String trainingAreas;

	public TrainedEmployees(int id, String name, String trainingAreas) {
		super(id, name);
		this.trainingAreas = trainingAreas; 
	}
}
