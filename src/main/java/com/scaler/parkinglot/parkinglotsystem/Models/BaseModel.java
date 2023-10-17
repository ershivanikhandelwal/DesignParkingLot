package com.scaler.parkinglot.parkinglotsystem.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class BaseModel {
    //private long id;
    private Date createdDateTime=new Date();
    private String createdByUser="Shivani Khandelwal";
    private Date modifiedDateTime=new Date();
    private String modifiedByUser="Shivani Khandelwal";
}
