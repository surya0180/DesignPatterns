package Creational.FactoryMethod.PizzaFactory;

import Creational.FactoryMethod.PizzaFactory.Pizzas.CheesePizza;
import Creational.FactoryMethod.PizzaFactory.Pizzas.PepperoniPizza;
import Creational.FactoryMethod.PizzaFactory.Pizzas.Pizza;
import Creational.FactoryMethod.PizzaFactory.Pizzas.VeggiePizza;

/**
 * This is a concrete creator class that creates pizzas for this particular store.
 * Each store may have its own menu and own creation process which can be implemented here.
 */
public class DominoPizza extends PizzaStore {
    public DominoPizza() {
        super("Domino's Official Pizza Store");
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
            throw new IllegalArgumentException("Unknown pizza type in DominoPizza: " + type);
        }
    }

    @Override
    protected void provideSauce() {
        System.out.println("Providing a sauce bottle upon request.");
    }

    @Override
    protected double getPizzaPrice(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> 11.00;
            case "pepperoni" -> 12.50;
            case "veggie" -> 11.50;
            default -> throw new IllegalArgumentException("Unknown pizza type in DominoPizza: " + type);
        };
    }

    @Override
    protected int getBakingTemperature(String type) {
        return 375;
    }

    @Override
    protected int getBakingTime(String type) {
        return 30;
    }
}
