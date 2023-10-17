package com.scaler.parkinglot.parkinglotsystem.Controller;
import com.scaler.parkinglot.parkinglotsystem.DTO.ParkingLotRequestDTO;
import com.scaler.parkinglot.parkinglotsystem.Models.ParkingLot;
import com.scaler.parkinglot.parkinglotsystem.Services.ParkingLotService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/parking-lot")
public class ParkingLotController {
    private ParkingLotService parkingLotService;
    public ParkingLotController(ParkingLotService _parkingLotService)
    {
        this.parkingLotService=_parkingLotService;
    }
    @PostMapping("/createParkingLot")
    public ParkingLot createParkingLot(@RequestBody ParkingLotRequestDTO parkingLotRequestDTO)
    {
        return parkingLotService.createParkingLot(parkingLotRequestDTO);
    }

    @GetMapping("/{id}")
    public ParkingLot getParkingLot(@PathVariable("id") long id)
    {
        return new ParkingLot();
    }
}
