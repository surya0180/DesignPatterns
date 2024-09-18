package Creational.FactoryMethod.PizzaFactory.Pizzas;

/**
 * This is one of the concrete product classes. Concrete classes generally imply the type
 * of product we want from the factory. I can go to a random pizza store and ask for any kind of pizza I want
 * that's present in the menu. All the pizza's present in the menu are referred as concrete classes.
 * The reason we made each pizza as a concrete class is because each pizza has its own creation process.
 */
public class VeggiePizza extends Pizza {
    public VeggiePizza(double price, int temperature, int timeTaken) {
        super(price, temperature, timeTaken);
    }
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza with assorted vegetables and cheese.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Veggie Pizza at " + getTemperature() + " degrees for " + getTimeTaken() +" minutes.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Veggie Pizza into triangular slices.");
    }

    @Override
    public void box() {
        System.out.println("Boxing Veggie Pizza.");
    }
}
