package SystemDesign.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

	List<CompactSpot> compactSpotList = new ArrayList<CompactSpot>();
	List<LargeSpot> largeSpotList = new ArrayList<LargeSpot>();
	List<BikeSpot> bikeSpotList = new ArrayList<BikeSpot>();

	int freeCompactSpots;
	int freeLargeSpots;
	int freeBikeSpots;

	public ParkingLot(int freeCompactSpots, int freeLargeSpots, int freeBikeSpots) {
		this.freeCompactSpots = freeCompactSpots;
		this.freeLargeSpots = freeLargeSpots;
		this.freeBikeSpots = freeBikeSpots;
	}

	// park vehicle

	public void parkVehicle(Vehicle vehicle) {
		System.out.println("We r about to park ur vehicle of type: " + vehicle.getType());
		if (vehicle.getType().equals(VehicleType.TRUCK)) {
			if (freeLargeSpots > 0)
				parkYourLargeVehicle(vehicle);
			else
				System.out.println("Sorry all large spots r full");
		} else if (vehicle.getType().equals(VehicleType.CAR)) {
			if (freeCompactSpots > 0)
				parkYourCompactVehicle(vehicle);
			else if (freeLargeSpots > 0)
				parkYourLargeVehicle(vehicle);
			else
				System.out.println("Sorry neither Large or Compact spots available");
		} else if (vehicle.getType().equals(VehicleType.BIKE)) {
			if (freeBikeSpots > 0)
				parkYourBikeVehicle(vehicle);
			else if (freeCompactSpots > 0)
				parkYourCompactVehicle(vehicle);
			else if (freeLargeSpots > 0)
				parkYourLargeVehicle(vehicle);
			else
				System.out.println("Sorry neither Large or Compact or bike spots available");
		}
	}

	private void parkYourBikeVehicle(Vehicle vehicle) {
		BikeSpot bikeSpot = new BikeSpot(ParkingSpotType.BIKE);
		bikeSpot.setFree(false);
		bikeSpot.setVehicle(vehicle);
		vehicle.setParkingSpot(bikeSpot);

		bikeSpotList.add(bikeSpot);
		System.out.println("we've successfully parked ur " + vehicle.getType() + " Vehicle.");
		freeBikeSpots--;
	}

	private void parkYourCompactVehicle(Vehicle vehicle) {
		CompactSpot compactSpot = new CompactSpot(ParkingSpotType.COMPACT);
		compactSpot.setFree(false);
		compactSpot.setVehicle(vehicle);
		vehicle.setParkingSpot(compactSpot);

		compactSpotList.add(compactSpot);
		System.out.println("we've successfully parked ur " + vehicle.getType() + " Vehicle.");
		freeCompactSpots--;
	}

	private void parkYourLargeVehicle(Vehicle vehicle) {
		LargeSpot largeSpot = new LargeSpot(ParkingSpotType.LARGE);
		largeSpot.setFree(false);
		largeSpot.setVehicle(vehicle);
		vehicle.setParkingSpot(largeSpot);

		largeSpotList.add(largeSpot);
		System.out.println("we've successfully parked ur " + vehicle.getType() + " Vehicle.");
		freeLargeSpots--;
	}

	public void unParkVehicle(Vehicle vehicle) {
		System.out.println("We r about to unpark or remove ur vehicle of type: " + vehicle.getType());
		ParkingSpot parkingSpot = vehicle.getParkingSpot();
		parkingSpot.setFree(true);

		if (vehicle.getType().equals(VehicleType.TRUCK)) {
			if (largeSpotList.remove(parkingSpot)) {
				System.out.println("we've successfully removed ur vehicle");
				freeLargeSpots++;
			} else {
				System.out.println("you dont have ur vehicle parked at this parking lot");
			}
		} else if (vehicle.getType().equals(VehicleType.CAR)) {
			if (compactSpotList.remove(parkingSpot)) {
				System.out.println("we've successfully removed ur vehicle");
				freeCompactSpots++;
			} else {
				System.out.println("you dont have ur vehicle parked at this parking lot");
			}
		} else if (vehicle.getType().equals(VehicleType.BIKE)) {
			if (bikeSpotList.remove(parkingSpot)) {
				System.out.println("we've successfully removed ur vehicle");
				freeBikeSpots++;
			} else {
				System.out.println("you dont have ur vehicle parked at this parking lot");
			}
		}
	}
}
