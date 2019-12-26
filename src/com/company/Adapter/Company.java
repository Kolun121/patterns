package com.company.Adapter;

public class Company {
    Car car;

    public Company(Car car){
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void transport(){
        car.transportByRoad();
    }

}
