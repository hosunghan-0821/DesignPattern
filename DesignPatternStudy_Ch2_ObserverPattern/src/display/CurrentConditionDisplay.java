package display;

import Data.WeatherData;
import java_interface.DisplayElement;
import java_interface.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("현재상태 : 온도 "+ temperature +"F, 습도"+humidity+"%");
    }

//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        this.temperature = temp;
//        this.humidity=humidity;
//        display();
//    }


    @Override
    public void update() {
        this.temperature= weatherData.getTemperature();
        this.humidity= weatherData.getHumidity();
        display();
    }
}
