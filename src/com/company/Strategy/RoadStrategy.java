package com.company.Strategy;

public class RoadStrategy implements CargoTransportingStrategy {
    @Override
    public void transport() {
        System.out.println("Транспортировка по суше");
    }
}
