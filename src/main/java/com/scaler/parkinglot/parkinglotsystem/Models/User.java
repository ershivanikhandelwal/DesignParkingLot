package com.scaler.parkinglot.parkinglotsystem.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User extends BaseModel{
    private String name;
    private String email;
    private String mobileNo;
}
