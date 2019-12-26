package com.company.State;

public class PreparingState extends State {

    public PreparingState(Cargo cargo) {
        super(cargo);
    }

    @Override
    public void observe() {
        System.out.println("Груз в состоянии подготовки");
    }
}
