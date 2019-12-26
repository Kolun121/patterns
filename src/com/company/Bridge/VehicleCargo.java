package com.company.Bridge;

public class VehicleCargo implements Cargo {
    @Override
    public void loadCargo() {
        System.out.println("Загружаем груз с транспортным средством");
    }

    @Override
    public void unloadCargo() {
        System.out.println("Выгружаем груз с транспортным средством");
    }
}
