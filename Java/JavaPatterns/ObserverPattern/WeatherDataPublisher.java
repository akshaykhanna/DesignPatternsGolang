package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataPublisher implements ISubject {
    List<IObserver> observers;
    private double temperature;
    private double pressure;
    private double humidty;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        this.notifyObservers();
    }

    public double getHumidty() {
        return humidty;
    }

    public void setHumidty(double humidty) {
        this.humidty = humidty;
        this.notifyObservers();
    }

    public WeatherDataPublisher() {
        this.observers = new ArrayList<IObserver>();
        this.temperature = 10;
        this.humidty = 40;
        this.pressure = 50;
    }

    @Override
    public void addObservers(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObservers(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : this.observers) {
            observer.update(this);
        }
    }
}
