package com.company.State;

public class Cargo {
    State state;

    public Cargo(){
        this.state = new PreparingState(this);
    }

    public void changeState(State state){
        this.state = state;
    }

    public void loadIn(){
        if (state.getClass().equals(PreparingState.class)) {
            state.observe();
            System.out.println("Загружаем груз...");
            changeState(new TravelingState(this));
        }
    }

    public void changeTransport(){
        if (state.getClass().equals(TravelingState.class)) {
            System.out.println("Меняем транспорт...");
            state.observe();
            changeState(new FlyingState(this));
        }else if(state.getClass().equals(FlyingState.class)){
            System.out.println("Меняем транспорт...");
            state.observe();
            changeState(new FloatingState(this));
        }
    }

    public void loadOut(){
        if (state.getClass().equals(FloatingState.class)) {
            System.out.println("Выгружаем груз...");
            state.observe();
            changeState(new ReadyState(this));
        }
    }

    public void store(){
        if (state.getClass().equals(ReadyState.class)) {
            System.out.println("Складируем груз");
            state.observe();
            changeState(new PreparingState(this));
        }
    }
}
