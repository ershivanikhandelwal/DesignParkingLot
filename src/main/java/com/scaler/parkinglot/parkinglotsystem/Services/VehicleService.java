package com.scaler.parkinglot.parkinglotsystem.Services;

import com.scaler.parkinglot.parkinglotsystem.Enums.VehicleType;
import com.scaler.parkinglot.parkinglotsystem.Models.Vehicle;
import com.scaler.parkinglot.parkinglotsystem.Repository.VehicleRepository;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    private VehicleRepository vehicleRepository;
    public VehicleService(VehicleRepository vr)
    {
        this.vehicleRepository=vr;
    }
    public Vehicle createVehicle(String vt, String vehicleNumber)
    {
        Vehicle vh= new Vehicle(vehicleNumber, VehicleType.valueOf(vt));
        vehicleRepository.saveVehicle(vh);
        return vh;
    }
}
