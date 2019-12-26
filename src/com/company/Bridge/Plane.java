package com.company.Bridge;

public class Plane implements Transport{
    Cargo cargo;

    public Plane(Cargo cargo){
        this.cargo = cargo;
    }

    public void transport(){
        System.out.println("++++++++++++++++++++++++++++++++++");
        cargo.loadCargo();
        System.out.println("Транспартировка на самолете");
        cargo.unloadCargo();
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
}
