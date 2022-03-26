package Creational.Builder;

public class FloodResistantBuilder implements Builder {

	private Home floodQuakeResistantHome = new Home();

	@Override
	public void buildFloor() {
		this.floodQuakeResistantHome.floor = "10 feets Above ground level floor";
	}

	@Override
	public void buildWalls() {
		this.floodQuakeResistantHome.walls = "Water resistant walls";
	}

	@Override
	public void buildTerrace() {
		this.floodQuakeResistantHome.terrace = "Wooden leakage resistant terrace";
	}

	@Override
	public Home getComplexHomeObject() {
		return this.floodQuakeResistantHome;
	}

}
