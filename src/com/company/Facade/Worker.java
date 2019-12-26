package com.company.Facade;

public class Worker {
    public String name;

    public Worker(String name){
        this.name = name;
    }

    public void goToSleep() {
        System.out.println(name + " идет спать");
    }

    public void wakeUp() {
        System.out.println(name + " просыпается");
    }

    public void goHome() {
        System.out.println(name + " идет домой");
    }

    public void goToWork() {
        System.out.println(name + " идет на работу");
    }

}
