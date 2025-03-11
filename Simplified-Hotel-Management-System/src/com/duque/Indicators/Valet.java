package com.duque.Indicators;

import com.duque.Interface.HotelService;

public class Valet implements HotelService{
    
    @Override
    public void Service() {
    }

    public void pickUpVehicle (String plateNumber) {
        System.out.println("Picking up car with plate number: " + plateNumber);
    }
}
