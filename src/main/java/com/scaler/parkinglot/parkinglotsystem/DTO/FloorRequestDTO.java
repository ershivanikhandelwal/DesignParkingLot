package com.scaler.parkinglot.parkinglotsystem.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FloorRequestDTO {
    private int noOfSpots;
    private List<SpotRequestDTO> spots;
}
