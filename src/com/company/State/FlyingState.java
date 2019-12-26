package com.company.State;

public class FlyingState extends State {
    public FlyingState(Cargo cargo) {
        super(cargo);
    }

    @Override
    public void observe() {
        System.out.println("Груз в состоянии полета");
    }
}
