package com.scaler.parkinglot.parkinglotsystem.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisplayBoard extends BaseModel{
    private int noOfAvailableSlots;
    private int noOfOccupiedSlots;
    public DisplayBoard()
    {

    }
}
