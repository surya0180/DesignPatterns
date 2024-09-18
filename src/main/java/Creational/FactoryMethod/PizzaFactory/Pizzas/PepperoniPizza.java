package Creational.FactoryMethod.PizzaFactory.Pizzas;

/**
 * This is one of the concrete product classes. Concrete classes generally imply the type
 * of product we want from the factory. I can go to a random pizza store and ask for any kind of pizza I want
 * that's present in the menu. All the pizza's present in the menu are referred as concrete classes.
 * The reason we made each pizza as a concrete class is because each pizza has its own creation process.
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza(double price, int temperature, int timeTaken) {
        super(price, temperature, timeTaken);
    }
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza with pepperoni and cheese.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni Pizza at " + getTemperature() + " degrees for " + getTimeTaken() +" minutes.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pepperoni Pizza into square slices.");
    }

    @Override
    public void box() {
        System.out.println("Boxing Pepperoni Pizza.");
    }
}
