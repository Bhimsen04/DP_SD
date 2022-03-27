package SystemDesign.ParkingLot;

public class Vehicle {
	private VehicleType type;
	private int vehicleNo;
	private ParkingSpot parkingSpot;

	public Vehicle(VehicleType vehicleType) {
		this.type = vehicleType;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

}
