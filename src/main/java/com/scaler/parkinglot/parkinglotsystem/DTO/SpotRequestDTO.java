package com.scaler.parkinglot.parkinglotsystem.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SpotRequestDTO {
    private String vehicleType;
    private int noOfSpots;
}
