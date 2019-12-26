package com.company.State;

import com.company.Adapter.Car;

public abstract class State {
    protected Cargo cargo;

    public State(Cargo cargo){
        this.cargo = cargo;
    }

    abstract public void observe();
}
