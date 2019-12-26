package com.company.Adapter;

public class ShipAdapter extends Car {
    Ship ship;

    public ShipAdapter(){
        this.ship = new Ship();
    }

    @Override
    public void transportByRoad() {
        ship.transportBySea();
    }
}
