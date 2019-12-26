package com.company.Bridge;

public class FoodCargo implements Cargo {
    @Override
    public void loadCargo() {
        System.out.println("Загружаем груз с едой");
    }

    @Override
    public void unloadCargo() {
        System.out.println("Выгружаем груз с едой");
    }
}
