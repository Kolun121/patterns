package com.company.State;

public class TravelingState extends State {
    public TravelingState(Cargo cargo) {
        super(cargo);
    }

    @Override
    public void observe() {
        System.out.println("Груз в состоянии движения по суше");
    }
}
