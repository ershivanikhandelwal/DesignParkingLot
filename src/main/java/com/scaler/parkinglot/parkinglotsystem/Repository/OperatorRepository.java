package com.scaler.parkinglot.parkinglotsystem.Repository;

import com.scaler.parkinglot.parkinglotsystem.Models.Operator;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OperatorRepository {
    private static List<Operator> operators= new ArrayList<>();
    public boolean saveOperator(Operator op)
    {
        operators.add(op);
        return true;
    }

    public Operator getOperator() {
        return operators.stream().filter(a->a.isAvailable()).findFirst().orElse(null);
    }
}
