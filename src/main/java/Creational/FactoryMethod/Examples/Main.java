package Creational.FactoryMethod.Examples;

interface Vehicle {
    void getDetails();
}

interface VehicleManufacturer {
    Vehicle createVehicle();
}

class Car implements Vehicle {
    @Override
    public void getDetails() {
        System.out.println("This is a car");
    }
}

class Bike implements Vehicle {
    @Override
    public void getDetails() {
        System.out.println("This is a bike");
    }
}

class CarManufacturer implements VehicleManufacturer {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class BikeManufacturer implements VehicleManufacturer {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}

public class Main {
    public static void main(String[] args) {
        VehicleManufacturer cm = new CarManufacturer();
        VehicleManufacturer bm = new BikeManufacturer();
        Vehicle car = cm.createVehicle();
        Vehicle bike = bm.createVehicle();

        car.getDetails();
        bike.getDetails();
    }
}
