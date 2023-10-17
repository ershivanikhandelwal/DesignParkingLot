package com.scaler.parkinglot.parkinglotsystem.Services;

import com.scaler.parkinglot.parkinglotsystem.Models.Operator;
import com.scaler.parkinglot.parkinglotsystem.Repository.OperatorRepository;
import org.springframework.stereotype.Service;

@Service
public class OperatorService {
    private OperatorRepository operatorRepository;
    public OperatorService(OperatorRepository op)
    {
        this.operatorRepository=op;
    }
    public Operator createOperator(String name, String email, String mob)
    {
        Operator op= new Operator(name, email, mob, true);
        this.operatorRepository.saveOperator(op);
        return op;
    }

    public Operator getAvailableOperator() {
        return this.operatorRepository.getOperator();
    }
}
