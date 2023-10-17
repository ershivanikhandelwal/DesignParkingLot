package com.scaler.parkinglot.parkinglotsystem.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
public class Ticket extends BaseModel{
    private long ticketNumber;
    private Date entryTime;
    private Spot spot;
    private Vehicle vehicle;
    private User user;
}
