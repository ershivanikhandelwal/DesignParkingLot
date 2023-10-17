package com.scaler.parkinglot.parkinglotsystem.Factory;

import com.scaler.parkinglot.parkinglotsystem.Enums.SpotStrategyType;
import com.scaler.parkinglot.parkinglotsystem.Strategy.AvailableSpotStrategy;
import com.scaler.parkinglot.parkinglotsystem.Strategy.NearestSpotStrategy;
import com.scaler.parkinglot.parkinglotsystem.StrategyInterface.ISpotStrategy;

public class SlotFactory {
    public static ISpotStrategy getSpotFactory(SpotStrategyType type)
    {
        switch(type)
        {
            case NEAREST : return new NearestSpotStrategy();
            case AVAILABLE : return new AvailableSpotStrategy();
        }
        throw new RuntimeException();
    }
}
