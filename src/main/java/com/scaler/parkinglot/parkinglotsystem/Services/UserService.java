package com.scaler.parkinglot.parkinglotsystem.Services;

import com.scaler.parkinglot.parkinglotsystem.Models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User createUser(String name, String email, String mob)
    {
        return new User(name,email,mob);
    }
}
