package test;

import pojo.CurrentConditionDisplay;
import pojo.WeatherData;

public class test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(75,75,75);
    }
}
