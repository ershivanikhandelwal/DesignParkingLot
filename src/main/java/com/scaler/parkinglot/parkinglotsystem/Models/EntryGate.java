package com.scaler.parkinglot.parkinglotsystem.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EntryGate extends Gate{
    private DisplayBoard displayBoard;
    public EntryGate(DisplayBoard board,int gateNumber)
    {
        this.displayBoard=board;
        this.setGateNumber(gateNumber);
    }
}
