package com.company.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Logist {
    private final int NONE = 0;

    private int orderType;
    private ArrayList<LogistObserver> observers;

    public Logist(){
        observers = new ArrayList<>();
        orderType = NONE;
    }

    public void addObserver(LogistObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(LogistObserver obs) {
        observers.remove(obs);
    }

    public void timePasses() {
        Random rnd = new Random();
        int number = rnd.nextInt(4);
        orderType = number;
        notifyObservers();
        System.out.println("----------Конец ожидания------------");
    }

    private void notifyObservers() {
        for (LogistObserver obs : observers) {
            obs.update(orderType);
            System.out.println("==================================");
        }
    }
}
