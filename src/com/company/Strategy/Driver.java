package com.company.Strategy;

public class Driver {
    CargoTransportingStrategy strategy;

    public Driver(CargoTransportingStrategy strategy){
        this.strategy = strategy;
    }

    public void changeStrategy(CargoTransportingStrategy strategy) {
        this.strategy = strategy;
    }

    public void transport(){
        this.strategy.transport();
        System.out.println("Конец пути");
    }
}
