package com.scaler.parkinglot.parkinglotsystem.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateTicketRequestDTO {
    private String name;
    private String email;
    private String mobileNo;
    private String vehicleType;
    private String vehicleNumber;
    private String strategyType;
}
