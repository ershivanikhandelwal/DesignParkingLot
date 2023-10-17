package com.scaler.parkinglot.parkinglotsystem.Repository;

import com.scaler.parkinglot.parkinglotsystem.Models.ParkingLot;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ParkingLotRepository {
    private static List<ParkingLot> parkingLots= new ArrayList<>();
    public boolean save(ParkingLot parkingLot)
    {
        parkingLots.add(parkingLot);
        return true;
    }
}
