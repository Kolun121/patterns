package com.company.Strategy;

public class WaterStrategy implements CargoTransportingStrategy{
    @Override
    public void transport() {
        System.out.println("Транспортировка по воде");
    }
}
