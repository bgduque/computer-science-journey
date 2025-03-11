package com.duque.Indicators;

import com.duque.Interface.HotelService;

public class HouseKeeping implements HotelService {
    
    @Override
    public void Service() {
    }

    public void cleanRoom(String roomNumber) {
        System.out.println("Cleaning room with number: " + roomNumber);
    }
}
