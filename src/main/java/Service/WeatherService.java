package Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweather.Model.Weather;

import java.io.IOException;
import java.net.URL;

public class WeatherService {


    private String finalURL;

    // URL url = new URL ("http://Bapi.apixu.com/v1/current.json?key=08eeefcc833a4ff2b84122246191003&q=" + city  + "\n");



    public WeatherService(String url, String apiKey) {

        finalURL = (url + "?key=" + apiKey + "&q=");
    }


    public Weather getCityWeather (String city) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        URL www = new URL(finalURL + city);

        Weather weather = mapper.readValue(www, Weather.class);
        System.out.println("Temparatura w " + city + " wynosi: " + weather.getCurrent().getTemp_c() + " stopni C");

        return weather;
    }


}


