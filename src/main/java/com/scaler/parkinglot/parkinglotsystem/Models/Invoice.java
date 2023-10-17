package com.scaler.parkinglot.parkinglotsystem.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Invoice extends BaseModel{
    private Date entryTime;
    private Date outTime;
    private Ticket ticket;
    private Double amount;
    private List<Payment> payment;

}
