package com.scaler.parkinglot.parkinglotsystem.Models;

import com.scaler.parkinglot.parkinglotsystem.Enums.PaymentStatus;
import com.scaler.parkinglot.parkinglotsystem.Enums.PaymentType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Payment {
    private PaymentType paymentType;
    private Double amount;
    private long referenceNumber;
    private PaymentStatus paymentStatus;
    private Date paymentDate;
}
