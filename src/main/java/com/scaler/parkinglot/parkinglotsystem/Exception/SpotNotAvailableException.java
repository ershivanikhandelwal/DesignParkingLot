package com.scaler.parkinglot.parkinglotsystem.Exception;

public class SpotNotAvailableException extends Exception {
    public SpotNotAvailableException()
    {
        new RuntimeException("Spot is not available");
    }
}
