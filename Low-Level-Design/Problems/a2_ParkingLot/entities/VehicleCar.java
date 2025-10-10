package Problems.a2_ParkingLot.entities;

public class VehicleCar extends Vehicle{
    // Passed only one parameter because we're accepting only the vehicleNumber from the outside world.
    public VehicleCar(String vehicleNumber){
        super(vehicleNumber, VehicleType.CAR);
    }
}
