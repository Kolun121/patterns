package com.company.Strategy;

public class AirStrategy implements CargoTransportingStrategy {
    @Override
    public void transport() {
        System.out.println("Транспортировка по воздуху");
    }
}

