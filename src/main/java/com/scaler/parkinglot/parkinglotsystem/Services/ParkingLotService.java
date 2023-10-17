package com.scaler.parkinglot.parkinglotsystem.Services;
import com.scaler.parkinglot.parkinglotsystem.DTO.ParkingLotRequestDTO;
import com.scaler.parkinglot.parkinglotsystem.Models.*;
import com.scaler.parkinglot.parkinglotsystem.Repository.ParkingLotRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingLotService {
    private FloorService floorService;
    private GateService gateService;
    private DisplayBoardService displayBoardService;
    private ParkingLotRepository parkingLotRepository;
    public ParkingLotService(FloorService fs,GateService gs,DisplayBoardService db,ParkingLotRepository pr)
    {
        this.floorService=fs;
        this.gateService=gs;
        this.displayBoardService=db;
        this.parkingLotRepository=pr;
    }
    public ParkingLot createParkingLot(ParkingLotRequestDTO parkingLotRequest)
    {
        List<Floor> floor = floorService.createFloors(parkingLotRequest.getFloorRequestDTO(), parkingLotRequest.getNoOfFloors());
        List<Spot> allspots= new ArrayList<>();
        for(Floor f:floor)
        {
            allspots.addAll(f.getSpots());
        }
        DisplayBoard board= displayBoardService.createDisplayBoard(allspots);
        List<EntryGate> entryGate= gateService.createEntryGate(parkingLotRequest.getNoOfEntryGate(),board);
        List<ExitGate> exitGate= gateService.createExitGate(parkingLotRequest.getNoOfExitGate());
        ParkingLot pk= new ParkingLot(parkingLotRequest.getParkingLotName(),parkingLotRequest.getParkingLotAddress(),floor,board,entryGate,exitGate);
        parkingLotRepository.save(pk);
        return pk;
    }
}
