package Creational.FactoryMethod.PizzaFactory.Pizzas;

/**
 * This is the process followed for creating pizza. This is an abstract class ( can be an interface as well ).
 */
public abstract class Pizza {
    private final double price;
    private final int temperature;
    private final int timeTaken;

    public Pizza(double price, int temperature, int timeTaken) {
        this.price = price;
        this.temperature = temperature;
        this.timeTaken = timeTaken;
    }

    public double getPrice() {
        return price;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getTimeTaken() {
        return timeTaken;
    }
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
