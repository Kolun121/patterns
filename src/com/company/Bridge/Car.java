package com.company.Bridge;

public class Car implements Transport{
    Cargo cargo;

    public Car(Cargo cargo){
        this.cargo = cargo;
    }
    public void transport(){
        System.out.println("++++++++++++++++++++++++++++++++++");
        cargo.loadCargo();
        System.out.println("Транспартировка на машине");
        cargo.unloadCargo();
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
}
