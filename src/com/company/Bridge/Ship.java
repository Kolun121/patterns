package com.company.Bridge;

public class Ship implements Transport{
    Cargo cargo;

    public Ship(Cargo cargo){
        this.cargo = cargo;
    }

    public void transport(){
        System.out.println("++++++++++++++++++++++++++++++++++");
        cargo.loadCargo();
        System.out.println("Транспартировка на корабле");
        cargo.unloadCargo();
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
}
