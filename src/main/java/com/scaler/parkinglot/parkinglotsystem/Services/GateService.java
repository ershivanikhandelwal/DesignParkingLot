package com.scaler.parkinglot.parkinglotsystem.Services;

import com.scaler.parkinglot.parkinglotsystem.Models.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class GateService {
    private OperatorService operatorService;
    public GateService(OperatorService op)
    {
        this.operatorService=op;
    }
    public List<ExitGate> createExitGate(int noOfExitGate) {
        List<ExitGate> exitGate= new ArrayList<>();
        for(int i=0;i<noOfExitGate;i++)
        {
            ExitGate g =new ExitGate(new PaymentCounter(),i+1);
            Operator op = operatorService.getAvailableOperator();
            if(op !=null)
            {
                op.setAvailable(false);
                g.setOperator(op);
            }
            else {
                break;
            }
            exitGate.add(g);
        }
        return exitGate;
    }

    public List<EntryGate> createEntryGate(int noOfEntryGate, DisplayBoard board) {
        List<EntryGate> gate= new ArrayList<>();
        for(int i=0;i<noOfEntryGate;i++)
        {
            EntryGate g= new EntryGate(board,i+1);
            Operator op = operatorService.getAvailableOperator();
            if(op !=null)
            {
                op.setAvailable(false);
                g.setOperator(op);
            }
            else {
                break;
            }
            gate.add(g);
        }
        return gate;
    }
}
