package com.company.State;

public class ReadyState extends State {
    public ReadyState(Cargo cargo) {
        super(cargo);
    }

    @Override
    public void observe() {
        System.out.println("Груз в готовом состоянии");
    }
}
