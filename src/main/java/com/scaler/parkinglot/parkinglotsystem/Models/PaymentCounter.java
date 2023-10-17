package com.scaler.parkinglot.parkinglotsystem.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PaymentCounter extends BaseModel{
    private long floorId;
    public PaymentCounter()
    {

    }
}
