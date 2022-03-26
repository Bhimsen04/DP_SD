package Creational.Builder;

public class EarthQuakeResistantBuilder implements Builder {

	private Home earthQuakeResistantHome = new Home();

	@Override
	public void buildFloor() {
		this.earthQuakeResistantHome.floor = "Wooden floor";
	}

	@Override
	public void buildWalls() {
		this.earthQuakeResistantHome.walls = "Wooden walls";
	}

	@Override
	public void buildTerrace() {
		this.earthQuakeResistantHome.terrace = "Wooden terrace";
	}

	@Override
	public Home getComplexHomeObject() {
		return this.earthQuakeResistantHome;
	}

}
