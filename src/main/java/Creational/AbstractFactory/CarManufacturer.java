package Creational.AbstractFactory;

/**
 * Car Engine and Car Interior both together are considered as family here.
 * There might be different kinds of cars with different engines and different interiors.
 * So inorder to combine them and refer to as a family, we are going to use abstract pattern
 * to produce concrete car products. The client then receives correct products of the same family and so
 * they combine those parts and build the car.
 */
interface Engine {
    String createEngine();
}

interface Interior {
    String createInterior();
}

class LuxuryEngine implements Engine {
    public String createEngine() {
        return "Powerful luxury engine with 600 horsepower";
    }
}

class LuxuryInterior implements Interior {
    public String createInterior() {
        return "Premium leather interior with wooden dashboard";
    }
}

class EconomyEngine implements Engine {
    public String createEngine() {
        return "Fuel-efficient engine with 100 horsepower";
    }
}

class EconomyInterior implements Interior {
    public String createInterior() {
        return "Simple fabric interior with plastic dashboard";
    }
}

interface CarFactory {
    Engine createEngine();
    Interior createInterior();
}

class LuxuryCarFactory implements CarFactory {
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    public Interior createInterior() {
        return new LuxuryInterior();
    }
}

class EconomyCarFactory implements CarFactory {
    public Engine createEngine() {
        return new EconomyEngine();
    }

    public Interior createInterior() {
        return new EconomyInterior();
    }
}

public class CarManufacturer {
    public static void buildCar(CarFactory factory) {
        Engine engine = factory.createEngine();
        Interior interior = factory.createInterior();

        System.out.println("Building car with: " + engine.createEngine());
        System.out.println("Adding interior: " + interior.createInterior());
    }

    public static void main(String[] args) {
        CarFactory luxuryFactory = new LuxuryCarFactory();
        CarFactory economyFactory = new EconomyCarFactory();

        System.out.println("Luxury Car:");
        buildCar(luxuryFactory);

        System.out.println("\nEconomy Car:");
        buildCar(economyFactory);
    }
}
