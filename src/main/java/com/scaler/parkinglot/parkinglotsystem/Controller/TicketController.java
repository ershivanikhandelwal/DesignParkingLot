package com.scaler.parkinglot.parkinglotsystem.Controller;

import com.scaler.parkinglot.parkinglotsystem.DTO.GenerateTicketRequestDTO;
import com.scaler.parkinglot.parkinglotsystem.Models.Ticket;
import com.scaler.parkinglot.parkinglotsystem.Services.TicketService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/ticket")
public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ts)
    {
        this.ticketService=ts;
    }
    @PostMapping("/generateTicket")
    public Ticket generateTicket(@RequestBody GenerateTicketRequestDTO generateTicketRequestDTO )
    {
        return this.ticketService.generateTicket(generateTicketRequestDTO);
    }
}
