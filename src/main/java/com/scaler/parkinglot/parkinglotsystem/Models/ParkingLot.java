package com.scaler.parkinglot.parkinglotsystem.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ParkingLot extends BaseModel{
    private String name;
    private String address;
    private List<Floor> floors;
    private DisplayBoard displayBoard;
    private List<EntryGate> entryGates;
    private List<ExitGate> exitGates;

    public ParkingLot()
    {
    }
}
