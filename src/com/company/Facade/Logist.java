package com.company.Facade;

public class Logist extends Worker {
    Logist(String name){
        super(name);
        this.name = name;
    }

    public void makeContract(){
        System.out.println(name + " заключает контракт");
    }

    public void chooseVehicle(){
        System.out.println(name + " выбирает транспорт");
    }

    public void makeRoute(){
        System.out.println(name + " строит маршрут");
    }

    public void getPay(){
        System.out.println(name + " получает плату");
    }
}
