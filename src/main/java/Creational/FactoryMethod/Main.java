package Creational.FactoryMethod;

import Creational.FactoryMethod.PizzaFactory.DominoPizza;
import Creational.FactoryMethod.PizzaFactory.PizzaHut;
import Creational.FactoryMethod.PizzaFactory.PizzaStore;
import Creational.FactoryMethod.PizzaFactory.Pizzas.Pizza;

public class Main {
    public static void main(String[] args) {
        // User first visits pizzaHut and likes their pizzas.
        PizzaStore pizzaHut = new PizzaHut();
        // User decides to try another store after getting bored by eating the same pizza in pizzaHut.
        PizzaStore dominoPizza = new DominoPizza();

        // Likes cheese but wants to try pepperoni in domino's.
        Pizza hutPizza = pizzaHut.orderPizza("Cheese");
        System.out.println();
        // Eats Pepperoni and regrets eating it XD.
        Pizza pizzaDomino = dominoPizza.orderPizza("Pepperoni");
    }
}
