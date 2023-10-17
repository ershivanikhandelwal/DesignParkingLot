package com.scaler.parkinglot.parkinglotsystem.StrategyInterface;

import com.scaler.parkinglot.parkinglotsystem.Models.Spot;

import java.util.List;

public interface ISpotStrategy {
    public Spot getSpot(List<Spot> spots);
}
