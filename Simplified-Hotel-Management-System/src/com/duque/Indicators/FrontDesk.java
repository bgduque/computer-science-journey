package com.duque.Indicators;

public class FrontDesk {
    
    private Valet v;
    private HouseKeeping hk;
    private Cart c;

    public FrontDesk() {
        this.v = new Valet();
        this.hk = new HouseKeeping();
        this.c = new Cart();
    }

    // public void requestCart(Integer numberOfCarts) {
    //     c.rqCart(numberOfCarts);
    // }

    public void requestCart(int numberOfCarts) {
        c.rqCart(numberOfCarts);
    }

    public void cleanRoom(String roomNumber) {
        hk.cleanRoom(roomNumber);
    }
    
    public void pickUpCar(String plateNo) {
        v.pickUpVehicle(plateNo);
    }

}