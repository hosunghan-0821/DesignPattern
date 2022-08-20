import Data.WeatherData;
import display.CurrentConditionDisplay;
import display.HeatIndexDisplay;

public class MiniSimulator {

    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();

        //생성하면서 동시에 weatherData 주제에 observer 등록
        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);

        //생성하면서 동시에 weatherData 주제에 observer 등록
        HeatIndexDisplay heatIndexDisplay =
                new HeatIndexDisplay(weatherData);


        System.out.println("==push 방식==");
        // 온도 변경이 있을 때, 실행시키는 함수
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78,90,29.2f);

        weatherData.removeObserver(heatIndexDisplay);

        weatherData.setMeasurements(22,33,92.2f);

    }
}
