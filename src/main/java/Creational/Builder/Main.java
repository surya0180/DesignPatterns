package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.ComputerBuilder("Intel i9", "32GB")
                .setStorage(1024)
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println(gamingComputer);

        // Creating a basic office computer
        Computer officeComputer = new Computer.ComputerBuilder("Intel i5", "8GB")
                .build();

        System.out.println(officeComputer);
    }
}
