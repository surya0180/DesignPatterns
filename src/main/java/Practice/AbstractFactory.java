package Practice;

abstract class Furniture {
    private final String material;
    private final String cost;
    private final String warranty;

    public Furniture(String material, String cost, String warranty) {
        this.material = material;
        this.cost = cost;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return String.format("This is made of %s and costs %s and comes with %s of Warranty", material, cost, warranty);
    }
}

class Sofa extends Furniture {
    public Sofa(String material, String cost, String warranty) {
        super(material, cost, warranty);
    }
}

class Chair extends Furniture {
    public Chair(String material, String cost, String warranty) {
        super(material, cost, warranty);
    }
}

class Table extends Furniture {
    public Table(String material, String cost, String warranty) {
        super(material, cost, warranty);
    }
}

abstract class FurnitureFactory {
    public abstract Sofa createSofa();
    public abstract Chair createChair();
    public abstract Table createTable();
}

class LowClassFurniture extends FurnitureFactory {
    private final String material = "Fiber";
    @Override
    public Sofa createSofa() {
        return new Sofa(material, "$ 10.99", "1 Year");
    }

    @Override
    public Chair createChair() {
        return new Chair(material, "$ 5.99", "2 Year");
    }

    @Override
    public Table createTable() {
        return new Table(material, "$ 12.99", "1 Year");
    }
}

class HighClassFurniture extends FurnitureFactory {
    private final String material = "Premium Wood";
    @Override
    public Sofa createSofa() {
        return new Sofa(material, "$ 20.99", "10 Year");
    }

    @Override
    public Chair createChair() {
        return new Chair(material, "$ 15.99", "20 Year");
    }

    @Override
    public Table createTable() {
        return new Table(material, "$ 30.99", "15 Year");
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        FurnitureFactory lowClass = new LowClassFurniture();
        Sofa lowClassSofa = lowClass.createSofa();
        Chair lowClassChair = lowClass.createChair();
        Table lowClassTable = lowClass.createTable();
        System.out.println("These are the low class furniture family");
        System.out.println(lowClassSofa + " " + lowClassChair + " " + lowClassTable);

        FurnitureFactory highClass = new HighClassFurniture();
        Sofa highClassSofa = highClass.createSofa();
        Chair highClassChair = highClass.createChair();
        Table highClassTable = highClass.createTable();
        System.out.println("These are the high class furniture family");
        System.out.println(highClassSofa + " " + highClassChair + " " + highClassTable);
    }

}
