package com.company.Observer;

public class TruckDriver implements LogistObserver{
    @Override
    public void update(int num) {
        switch (num) {
            case 0:
                System.out.println("Водитель грузовика отдыхает");
                break;
            case 1:
                System.out.println("Водитель грузовика отдыхает");
                break;
            case 2:
                System.out.println("Водитель грузовика отдыхает");
                break;
            case 3:
                System.out.println("Водитель грузовика берется за работу");
                break;
            default:

                break;
        }
    }
}
