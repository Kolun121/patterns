package com.company.Bridge;

public class ClothCargo implements Cargo {
    @Override
    public void loadCargo() {
        System.out.println("Загружаем груз с одеждой");
    }

    @Override
    public void unloadCargo() {
        System.out.println("Выгружаем груз с одеждой");
    }
}
