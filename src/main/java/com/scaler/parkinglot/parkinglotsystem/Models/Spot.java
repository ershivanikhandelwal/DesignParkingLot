package com.scaler.parkinglot.parkinglotsystem.Models;

import com.scaler.parkinglot.parkinglotsystem.Enums.SpotStatus;
import com.scaler.parkinglot.parkinglotsystem.Enums.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Spot extends BaseModel{
    private long spotNumber;
    private long floorId;
    private SpotStatus spotStatus;
    private VehicleType vehicleType;
}
