package com.scaler.parkinglot.parkinglotsystem.Repository;

import com.scaler.parkinglot.parkinglotsystem.Models.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleRepository {
    private static List<Vehicle> vehicles= new ArrayList<>();
    public boolean saveVehicle(Vehicle vc)
    {
        vehicles.add(vc);
        return true;
    }
}
