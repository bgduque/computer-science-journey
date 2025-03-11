package com.duque.Indicators;

import com.duque.Interface.HotelService;

public class Cart implements HotelService {
    
    @Override
    public void Service() {
    }

    // public void rqCart(Integer numberOfCarts) {
    //     System.out.println("Requesting cart with id: " + numberOfCarts);
    // }


    public void rqCart(int numberOfCarts) {
        System.out.println("Requesting cart with id: " + numberOfCarts);
    }
}
