package com.company.State;

public class FloatingState  extends State{
    public FloatingState(Cargo cargo) {
        super(cargo);
    }

    @Override
    public void observe() {
        System.out.println("Груз в состоянии плавания");
    }
}
