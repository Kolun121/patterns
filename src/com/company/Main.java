package com.company;

public class Main {

    public static void main(String[] args) {
	// Adapter ------------------------------------------------

//        Company company = new Company(new Car());
//        company.transport();
//
//        company.setCar(new ShipAdapter());
//        company.transport();

    // Bridge ------------------------------------------------------

//        ClothCargo clothCargo = new ClothCargo();
//        FoodCargo foodCargo = new FoodCargo();
//        VehicleCargo vehicleCargo = new VehicleCargo();
//
//        Car car1 = new Car(clothCargo);
//        car1.transport();
//
//        Car car2 = new Car(foodCargo);
//        car2.transport();
//
//        Plane plane1 = new Plane(clothCargo);
//        plane1.transport();
//
//        Plane plane2 = new Plane(vehicleCargo);
//        plane2.transport();
//
//        Ship ship1 = new Ship(foodCargo);
//        ship1.transport();
//
//        Ship ship2 = new Ship(vehicleCargo);
//        ship2.transport();

     //Facade -----------------------------------------------------

//        CompanyFacade companyFacade = new CompanyFacade();
//        companyFacade.startDay();
//        companyFacade.work();
//        companyFacade.endDay();

     //Observer ---------------------------------------------------------

//        Logist logist = new Logist();
//        logist.addObserver(new PlaneDriver());
//        logist.addObserver(new ShipDriver());
//        logist.addObserver(new TruckDriver());
//
//        logist.timePasses();
//        logist.timePasses();
//        logist.timePasses();

     //Strategy -------------------------------------------------------

//        Driver driver = new Driver(new RoadStrategy());
//        driver.transport();
//
//        driver.changeStrategy(new WaterStrategy());
//        driver.transport();
//
//        driver.changeStrategy(new AirStrategy());
//        driver.transport();

     //State ----------------------------------------------------------
//        Cargo cargo = new Cargo();
//
//        cargo.loadIn();
//
//        cargo.changeTransport();
//        cargo.changeTransport();
//
//        cargo.loadOut();
//        cargo.store();


        //Prototype ----------------------------------------------------------

//        Prototype prototype = new Prototype();
//        prototype.rnd1 = 200;
//        prototype.rnd2 = 400;
//
//        Prototype prototype2 = prototype.clone();
//        System.out.println(prototype.equals(prototype2));
//
//        PrototypeOne prototypeOne = new PrototypeOne();
//        prototypeOne.rnd1 = 600;
//        prototypeOne.rnd2 = 700;
//        prototypeOne.intField = 1;
//        prototypeOne.setStringField("Строка");
//
//        PrototypeOne prototypeOne2 = prototypeOne.clone();
//        System.out.println(prototypeOne.equals(prototypeOne2));
//
//        System.out.println(prototype.equals(prototypeOne));
//        System.out.println(prototypeOne2.equals(prototype2));

        //Singleton ----------------------------------------------------------
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//        System.out.println(singleton1.equals(singleton2));

        //AbstractFactory ----------------------------------------------------------

//        CastleFactory elfFactory = makeFactory(1);
//        Castle elfCastle = elfFactory.createCastle();
//        System.out.println(elfCastle.getDescription());
//
//        King elfKing = elfFactory.createKing();
//        System.out.println(elfKing.getDescription());
//
//        CastleFactory orcFactory = makeFactory(2);
//        Castle orcCastle = orcFactory.createCastle();
//        System.out.println(orcCastle.getDescription());
//
//        King orcKing = orcFactory.createKing();
//        System.out.println(orcKing.getDescription());
    }

//    public static CastleFactory makeFactory(int type) {
//        switch (type) {
//            case 1:
//                return new ElfCastleFactory();
//            case 2:
//                return new OrcCastleFactory();
//            default:
//                throw new IllegalArgumentException("Неверный тип");
//        }
//    }
}
