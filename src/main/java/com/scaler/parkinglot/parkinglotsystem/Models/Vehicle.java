package com.scaler.parkinglot.parkinglotsystem.Models;

import com.scaler.parkinglot.parkinglotsystem.Enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Vehicle extends BaseModel{
    private String vehicleNumber;
    private VehicleType vehicleType;
}
