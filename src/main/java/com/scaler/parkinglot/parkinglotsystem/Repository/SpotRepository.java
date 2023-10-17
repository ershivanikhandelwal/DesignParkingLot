package com.scaler.parkinglot.parkinglotsystem.Repository;

import com.scaler.parkinglot.parkinglotsystem.Models.Spot;
import com.scaler.parkinglot.parkinglotsystem.StrategyInterface.ISpotStrategy;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SpotRepository {
    private static List<Spot> spots= new ArrayList<>();

    public boolean saveSpot(Spot s){
        spots.add(s);
        return true;
    }
    public Spot getSpot(ISpotStrategy _st) {
        return _st.getSpot(spots);
    }
}
