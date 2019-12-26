package com.company.Facade;

public class CompanyFacade {
    Logist logist = new Logist("Логист");
    Driver driver = new Driver("Водитель");
    Loader loader = new Loader("Грузчик");

    public void startDay(){
        logist.wakeUp();
        logist.goToWork();

        driver.wakeUp();
        driver.goToWork();

        loader.wakeUp();
        loader.goToWork();
    }

    public void work(){
        logist.makeContract();
        logist.chooseVehicle();
        logist.makeRoute();

        loader.loadCargo();

        driver.transport();

        loader.unloadCargo();

        logist.getPay();
    };

    public void endDay(){
        logist.goHome();
        logist.goToSleep();

        driver.goHome();
        driver.goToSleep();

        loader.goHome();
        loader.goToSleep();
    }

}
