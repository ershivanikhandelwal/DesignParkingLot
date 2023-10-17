package com.scaler.parkinglot.parkinglotsystem.Services;

import com.scaler.parkinglot.parkinglotsystem.Enums.SpotStatus;
import com.scaler.parkinglot.parkinglotsystem.Models.DisplayBoard;
import com.scaler.parkinglot.parkinglotsystem.Models.Spot;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DisplayBoardService {

    public DisplayBoard createDisplayBoard(List<Spot> spots) {
        DisplayBoard db=new DisplayBoard();
        db.setNoOfAvailableSlots((int)spots.stream().filter(a -> a.getSpotStatus().equals(SpotStatus.AVAILABLE)).count());
        db.setNoOfOccupiedSlots((int)spots.stream().filter(a -> a.getSpotStatus().equals(SpotStatus.OCCUPIED)).count());
        return db;
    }
}
