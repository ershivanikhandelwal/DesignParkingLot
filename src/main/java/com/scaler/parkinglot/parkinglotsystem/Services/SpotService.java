package com.scaler.parkinglot.parkinglotsystem.Services;

import com.scaler.parkinglot.parkinglotsystem.DTO.FloorRequestDTO;
import com.scaler.parkinglot.parkinglotsystem.DTO.SpotRequestDTO;
import com.scaler.parkinglot.parkinglotsystem.Enums.SpotStatus;
import com.scaler.parkinglot.parkinglotsystem.Enums.VehicleType;
import com.scaler.parkinglot.parkinglotsystem.Models.Spot;
import com.scaler.parkinglot.parkinglotsystem.Repository.SpotRepository;
import com.scaler.parkinglot.parkinglotsystem.StrategyInterface.ISpotStrategy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpotService {
    private SpotRepository spotRepository;
    public SpotService(SpotRepository sr)
    {
        this.spotRepository=sr;
    }
    public List<Spot> createSpots(int floornumber, FloorRequestDTO floorRequestDTO) {
        List<Spot> spots= new ArrayList<>();
        int spotNumber=1;
        for(SpotRequestDTO i: floorRequestDTO.getSpots())
        {
            for(int j=0;j<i.getNoOfSpots();j++)
            {
                Spot spot= new Spot();
                spot.setSpotNumber(spotNumber);
                spot.setSpotStatus(SpotStatus.AVAILABLE);
                spot.setFloorId(floornumber);
                spot.setVehicleType(VehicleType.valueOf(i.getVehicleType()));
                spots.add(spot);
                spotRepository.saveSpot(spot);
                spotNumber++;
            }
        }
        return spots;
    }

    public Spot getAvailableSpot(ISpotStrategy st) {

        return spotRepository.getSpot(st);
    }
}
