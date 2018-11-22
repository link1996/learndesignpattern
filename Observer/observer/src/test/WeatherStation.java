package test;

import pojo.CurrentConditionsDisplay;
import pojo.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurement(80,10,60);
        weatherData.setMeasurement(84,54,65);
        weatherData.setMeasurement(75,45,45);
    }
}

