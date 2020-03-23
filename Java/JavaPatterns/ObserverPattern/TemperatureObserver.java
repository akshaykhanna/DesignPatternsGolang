package ObserverPattern;

public class TemperatureObserver implements IObserver {
    @Override
    public void update(Object weatherData) {
        if(weatherData instanceof WeatherDataPublisher) {
            WeatherDataPublisher weatherDataPublisher = (WeatherDataPublisher) weatherData;
            this.display(weatherDataPublisher.getTemperature());
        }
    }

    private void display(double temperature) {
        System.out.println("Current temperature is " + temperature);
    }
}
