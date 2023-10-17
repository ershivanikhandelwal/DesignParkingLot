package com.scaler.parkinglot.parkinglotsystem.Services;

import com.scaler.parkinglot.parkinglotsystem.DTO.FloorRequestDTO;
import com.scaler.parkinglot.parkinglotsystem.Models.DisplayBoard;
import com.scaler.parkinglot.parkinglotsystem.Models.Floor;
import com.scaler.parkinglot.parkinglotsystem.Models.PaymentCounter;
import com.scaler.parkinglot.parkinglotsystem.Models.Spot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FloorService {
    private SpotService spotService;
    private DisplayBoardService displayBoardService;
    public FloorService(SpotService sp,DisplayBoardService db)
    {
        this.spotService=sp;
        this.displayBoardService=db;
    }

    public List<Floor> createFloors(List<FloorRequestDTO> floorRequestDTO, int noOfFloors) {
        List<Floor> floors= new ArrayList<>();
        for(int i=0;i<noOfFloors;i++)
        {
            int floorNumber=i+1;
            List<Spot> spots= spotService.createSpots(floorNumber,floorRequestDTO.get(i));
            DisplayBoard board= displayBoardService.createDisplayBoard(spots);
            Floor floor= new Floor(i+1,spots,board,new PaymentCounter(floorNumber));
            floors.add(floor);
        }
        return floors;
    }
}
