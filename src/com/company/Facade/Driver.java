package com.company.Facade;

public class Driver extends Worker {
    Driver(String name){
        super(name);
        this.name = name;
    }

    public void transport(){
        System.out.println(name + " транспортирует груз");
    }
}
