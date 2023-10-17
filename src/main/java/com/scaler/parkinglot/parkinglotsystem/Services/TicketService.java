package com.scaler.parkinglot.parkinglotsystem.Services;

import com.scaler.parkinglot.parkinglotsystem.Enums.SpotStrategyType;
import com.scaler.parkinglot.parkinglotsystem.Exception.SpotNotAvailableException;
import com.scaler.parkinglot.parkinglotsystem.Factory.SlotFactory;
import com.scaler.parkinglot.parkinglotsystem.Models.Spot;
import com.scaler.parkinglot.parkinglotsystem.Models.Ticket;
import com.scaler.parkinglot.parkinglotsystem.Models.User;
import com.scaler.parkinglot.parkinglotsystem.Models.Vehicle;
import com.scaler.parkinglot.parkinglotsystem.StrategyInterface.ISpotStrategy;
import com.scaler.parkinglot.parkinglotsystem.DTO.GenerateTicketRequestDTO;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TicketService {
    private SpotService spotService;
    private UserService userService;
    private VehicleService vehicleService;
    private ISpotStrategy spotStrategy;
    public TicketService(SpotService ss,VehicleService vs, UserService us)
    {
        this.spotService=ss;
        this.vehicleService=vs;
        this.userService=us;
    }
    public Ticket generateTicket(GenerateTicketRequestDTO generateTicketRequestDTO)
    {
        spotStrategy=SlotFactory.getSpotFactory(SpotStrategyType.valueOf(generateTicketRequestDTO.getStrategyType()));
        Spot s= this.spotService.getAvailableSpot(spotStrategy);
        if(s!=null)
        {
            User u= this.userService.createUser(generateTicketRequestDTO.getName(),generateTicketRequestDTO.getEmail(),generateTicketRequestDTO.getMobileNo());
            Vehicle v=this.vehicleService.createVehicle(generateTicketRequestDTO.getVehicleType(),generateTicketRequestDTO.getVehicleNumber());
            return new Ticket(1,new Date(),s,v,u);
        }
        else {
            new SpotNotAvailableException();
        }
        return null;
    }
}
