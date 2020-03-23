import ObserverPattern.*;
import StrategyPattern.Duck;
import StrategyPattern.RubberDuck;
import StrategyPattern.WildDuck;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------- Strategy Pattern ---------");
        Duck myWildDuck = new WildDuck();
        myWildDuck.tryToFly();
        myWildDuck.tryToSpeak();
        Duck myRuberDuck = new RubberDuck();
        myRuberDuck.tryToFly();
        myRuberDuck.tryToSpeak();


        System.out.println("---------- Observer Pattern ---------");
        IObserver temperatureObserver = new TemperatureObserver();
        IObserver weatherObserver = new WeatherObserver();
        ISubject weatherDataPublisher = new WeatherDataPublisher();
        weatherDataPublisher.addObservers(temperatureObserver);
        weatherDataPublisher.addObservers(weatherObserver);
        ((WeatherDataPublisher) weatherDataPublisher).setHumidty(80);
        ((WeatherDataPublisher) weatherDataPublisher).setTemperature(50);
        ((WeatherDataPublisher) weatherDataPublisher).setPressure(90);
        weatherDataPublisher.removeObservers(temperatureObserver);
        ((WeatherDataPublisher) weatherDataPublisher).setTemperature(20);
    }
}
