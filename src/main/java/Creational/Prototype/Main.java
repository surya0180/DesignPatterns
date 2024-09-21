package Creational.Prototype;

public class Main {
    public static void main(String[] args) {
        // Load cache with predefined objects
        ShapeCache.loadCache();

        // Retrieve cloned shapes
        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape1.getType());
        clonedShape1.draw();

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());
        clonedShape2.draw();
    }
}
