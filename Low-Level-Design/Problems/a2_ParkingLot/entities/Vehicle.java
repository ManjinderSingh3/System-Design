package Problems.a2_ParkingLot.entities;

public abstract class Vehicle {
    private final String vehicleNumber;
    private final VehicleType vehicleType;

    public Vehicle(String vehicleNumber, VehicleType vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }

}

