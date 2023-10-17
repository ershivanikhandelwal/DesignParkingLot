package com.scaler.parkinglot.parkinglotsystem.Controller;

import com.scaler.parkinglot.parkinglotsystem.DTO.OperatorRequestDTO;
import com.scaler.parkinglot.parkinglotsystem.Models.Operator;
import com.scaler.parkinglot.parkinglotsystem.Services.OperatorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/operator")
public class OperatorController {
    private OperatorService operatorService;
    public OperatorController(OperatorService op)
    {
        this.operatorService=op;
    }
    @PostMapping("/createOperator")
    public Operator createOpeator(@RequestBody OperatorRequestDTO operator)
    {
        return this.operatorService.createOperator(operator.getName(),operator.getEmail(),operator.getMobileNo());
    }
}
