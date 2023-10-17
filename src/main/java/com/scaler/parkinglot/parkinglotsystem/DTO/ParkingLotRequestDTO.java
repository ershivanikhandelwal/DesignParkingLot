package com.scaler.parkinglot.parkinglotsystem.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLotRequestDTO {
    private String parkingLotName;
    private String parkingLotAddress;
    private int noOfFloors;
    private List<FloorRequestDTO> floorRequestDTO;
    private int noOfEntryGate;
    private int noOfExitGate;
}
