package Practice;

class Computer {
    private final int RAM;
    private final int ROM;
    private final int GPU;

    public Computer(int RAM, int ROM, int GPU) {
        this.RAM = RAM;
        this.ROM = ROM;
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return String.format("This computer has %d RAM, %d ROM and %d GPU", this.RAM, this.ROM, this.GPU);
    }
}

abstract class ComputerFactory {
    public abstract Computer createComputer();
}

class GamingComputerFactory extends ComputerFactory {

    @Override
    public Computer createComputer() {
        return new Computer(16, 1000, 16);
    }
}

class OfficeComputerFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Computer(4, 2000, 0);
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        ComputerFactory gameFactory = new GamingComputerFactory();
        Computer gamingComputer = gameFactory.createComputer();
        System.out.println(gamingComputer);

        ComputerFactory officeFactory = new OfficeComputerFactory();
        Computer officeComputer = officeFactory.createComputer();
        System.out.println(officeComputer);
    }
}
