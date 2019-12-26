package com.company.Facade;

public class Loader extends Worker {
    Loader(String name){
        super(name);
        this.name = name;
    }

    public void loadCargo(){
        System.out.println(name + " загружает груз");
    }

    public void unloadCargo(){
        System.out.println(name + " выгружает груз");
    }


}
