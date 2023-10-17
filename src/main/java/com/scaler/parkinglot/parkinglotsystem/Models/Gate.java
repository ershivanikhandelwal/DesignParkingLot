package com.scaler.parkinglot.parkinglotsystem.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Gate extends BaseModel{
    private int gateNumber;
    private Operator operator;
}
