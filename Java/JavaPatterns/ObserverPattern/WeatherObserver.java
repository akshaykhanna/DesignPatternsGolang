package ObserverPattern;

public class WeatherObserver implements IObserver {
    @Override
    public void update(Object weatherData) {
        if(weatherData instanceof WeatherDataPublisher) {
            WeatherDataPublisher weatherDataPublisher = (WeatherDataPublisher) weatherData;
            this.display(weatherDataPublisher.getTemperature(), weatherDataPublisher.getHumidty(), ((WeatherDataPublisher) weatherData).getPressure());
        }
    }

    private void display(double temperature, double humidty, double pressure) {
        if(temperature > 25 && humidty > 50 && pressure > 70) {
            System.out.println("Heavy rainfall is forcasted");
        } else {
            System.out.println("It would be a bright sunny day");
        }
    }
}