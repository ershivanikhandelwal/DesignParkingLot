package com.scaler.parkinglot.parkinglotsystem.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ExitGate extends Gate{
    private PaymentCounter paymentCounter;
    public ExitGate(PaymentCounter pc, int gateNumber)
    {
        this.paymentCounter=pc;
        this.setGateNumber(gateNumber);
    }
}
