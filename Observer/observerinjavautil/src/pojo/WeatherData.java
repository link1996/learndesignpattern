package pojo;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temp;
    private float pressure;
    private float humidity;

    public WeatherData() {
    }

    public void measurementsChanged(){
        setChanged();

        notifyObservers();
    }

    public void setMeasurements(float temp,float pressure, float humidity){
        this.pressure = pressure;
        this.humidity = humidity;
        this.temp = temp;
        measurementsChanged();
    }
    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
