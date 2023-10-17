package com.scaler.parkinglot.parkinglotsystem.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Floor extends BaseModel{
    private long floorNumber;
    private List<Spot> spots;
    private DisplayBoard displayBoard;
    private PaymentCounter paymentCounter;
}
