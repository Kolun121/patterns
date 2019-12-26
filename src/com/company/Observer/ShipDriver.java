package com.company.Observer;

public class ShipDriver implements LogistObserver{
    @Override
    public void update(int num) {
        switch (num) {
            case 0:
                System.out.println("Водитель корабля отдыхает");
                break;
            case 1:
                System.out.println("Водитель корабля отдыхает");
                break;
            case 2:
                System.out.println("Водитель корабля берется за работу");
                break;
            case 3:
                System.out.println("Водитель корабля отдыхает");
                break;
            default:

                break;
        }
    }
}
