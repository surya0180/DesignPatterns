package Creational.FactoryMethod.PizzaFactory;

import Creational.FactoryMethod.PizzaFactory.Pizzas.CheesePizza;
import Creational.FactoryMethod.PizzaFactory.Pizzas.PepperoniPizza;
import Creational.FactoryMethod.PizzaFactory.Pizzas.Pizza;
import Creational.FactoryMethod.PizzaFactory.Pizzas.VeggiePizza;

/**
 * This is a concrete creator class that creates pizzas for this particular store.
 * Each store may have its own menu and own creation process which can be implemented here.
 */
public class PizzaHut extends PizzaStore {
    public PizzaHut() {
        super("PizzaHut's Official Crap");
    }
    @Override
    protected Pizza createPizza(String type, double price, int temperature, int timeTaken) {
        if (type.equalsIgnoreCase("cheese")) {
            return new CheesePizza(price, temperature, timeTaken);
        } else if (type.equalsIgnoreCase("pepperoni")) {
            return new PepperoniPizza(price, temperature, timeTaken);
        } else if (type.equalsIgnoreCase("veggie")) {
            return new VeggiePizza(price, temperature, timeTaken);
        } else {
            throw new IllegalArgumentException("Unknown pizza type in PizzaHut: " + type);
        }
    }

    @Override
    protected void provideSauce() {
        System.out.println("In PizzaHut we ask customers to take sauce bottles themselves or eat without sauce");
    }

    @Override
    protected double getPizzaPrice(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> 9.99;
            case "pepperoni" -> 11.99;
            case "veggie" -> 10.99;
            default -> throw new IllegalArgumentException("Unknown pizza type in PizzaHut: " + type);
        };
    }

    @Override
    protected int getBakingTemperature(String type) {
        return 350; // Default temperature for simplicity
    }

    @Override
    protected int getBakingTime(String type) {
        return 25; // Default time for simplicity
    }
}
