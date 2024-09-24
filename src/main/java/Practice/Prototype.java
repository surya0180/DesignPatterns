package Practice;

interface Vehicle {
    Vehicle cloneVehicle();
    String getDetails();
}

class Car implements Vehicle {
    private final String model;
    private final String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public Vehicle cloneVehicle() {
        return new Car(this.model, this.color);
    }

    @Override
    public String getDetails() {
        return "Model: " + model + ", Color: " + color;
    }
}

public class Prototype {
    public static void main(String[] args) {
        Vehicle originalCar = new Car("Tesla Model S", "Red");
        System.out.println("Original Car: " + originalCar.getDetails());

        Vehicle clonedCar = originalCar.cloneVehicle();
        System.out.println("Cloned Car: " + clonedCar.getDetails());
    }
}
