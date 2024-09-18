package Creational.FactoryMethod.PizzaFactory;

import Creational.FactoryMethod.PizzaFactory.Pizzas.Pizza;

/**
 * This is my abstract class where my Factory Method is present.
 * This class may contain other business logic that might be common among different pizza stores.
 * createPizza is the Factory Method. This method creates pizza for a given pizza store. Each pizza store may
 * create the pizza differently so each pizza store should extend this class and implement their own recipe.
 * This clearly follows OCP as the class may not be modified but only extended for creating stores.
 */
public abstract class PizzaStore {
    private final String storeName;

    public PizzaStore(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }
    protected abstract Pizza createPizza(String type, double price, int temperature, int timeTaken);

    public Pizza orderPizza(String type) {
        double price = getPizzaPrice(type);
        int temperature = getBakingTemperature(type);
        int timeTaken = getBakingTime(type);

        Pizza pizza = createPizza(type, price, temperature, timeTaken);
        System.out.println("--- " + getStoreName() + " is making a " + type + " pizza ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        provideSauce(); // Provide sauce
        System.out.println("Price: $" + pizza.getPrice()); // Price from the pizza
        return pizza;
    }

    protected abstract void provideSauce();
    protected abstract double getPizzaPrice(String type);
    protected abstract int getBakingTemperature(String type);
    protected abstract int getBakingTime(String type);
}
