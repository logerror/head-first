package net.welights.headfirst.observer.wetaher;

/**
 * @author fandong
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
        StatisticsDisplay sd = new StatisticsDisplay(wd);

        wd.setMeasurements(11,12, 13);
        wd.setMeasurements(3,4, 5);
    }
}
