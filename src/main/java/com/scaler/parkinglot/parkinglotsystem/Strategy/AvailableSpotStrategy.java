package com.scaler.parkinglot.parkinglotsystem.Strategy;

import com.scaler.parkinglot.parkinglotsystem.Enums.SpotStatus;
import com.scaler.parkinglot.parkinglotsystem.Models.Spot;
import com.scaler.parkinglot.parkinglotsystem.StrategyInterface.ISpotStrategy;

import java.util.List;
public class AvailableSpotStrategy implements ISpotStrategy {

    @Override
    public Spot getSpot(List<Spot> spots) {
        return spots.stream().filter(a->a.getSpotStatus()== SpotStatus.AVAILABLE).findFirst().orElse(null);
    }
}
