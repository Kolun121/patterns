package com.company.Observer;

public class PlaneDriver implements LogistObserver{
    @Override
    public void update(int num) {
        switch (num) {
            case 0:
                System.out.println("Водитель самолета отдыхает");
                break;
            case 1:
                System.out.println("Водитель самолета берется за работу");
                break;
            case 2:
                System.out.println("Водитель самолета отдыхает");
                break;
            case 3:
                System.out.println("Водитель самолета отдыхает");
                break;
            default:

                break;
        }
    }
}
