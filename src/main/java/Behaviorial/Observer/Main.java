package Behaviorial.Observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temperature);
}

// Concrete Observers
class PhoneDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Phone display: Temperature updated to " + temperature + "°C");
    }
}

class WebDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Web display: Temperature updated to " + temperature + "°C");
    }
}

interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

class WeatherStation implements Subject {
    private final List<Observer> observers;
    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer webDisplay = new WebDisplay();

        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(webDisplay);

        weatherStation.setTemperature(25.5f);
    }
}
