package pl.sda.javafx.controller;


import pl.sda.javafx.model.Weather;
import pl.sda.javafx.Service.WeatherService;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    @FXML
    private Button search;

    @FXML
    private TextField cityName;

    @FXML
    private Label temperatureIn;

    @FXML
    private Label localTime;

    @FXML
    private ImageView image;

    @FXML
    private ImageView palantirPic;

    @FXML
    private Label country;

    @FXML
    private Label googlePic;

    @FXML
    private ImageView timeOfDayImg;

    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setCity() throws IOException {
        String url = "http://api.apixu.com/v1/current.json";
        String apiKey = "08eeefcc833a4ff2b84122246191003";
        WeatherService weatherService = new WeatherService(url, apiKey);
        Weather weather = weatherService.getCityWeather(cityName.getText().replace(" ", "_")
                .replace("ą", "a")
                .replace("Ą", "A")
                .replace("ć", "c")
                .replace("Ć", "C")
                .replace("ń", "n")
                .replace("Ń", "N")
                .replace("Ż", "Z")
                .replace("Ź", "Z")
                .replace("ż", "z")
                .replace("ź", "z")
                .replace("ś", "s")
                .replace("Ś", "S")
                .replace("Ł", "L")
                .replace("ł", "l")
                .replace("ę", "e")
                .replace("Ę", "E")
                .replace("Ó", "O")
                .replace("ó", "o"));
        cityName.setText(weather.getLocation().getName());

        String temperatureInCelsius = weather.getCurrent().getTemp_c() + " stopni C";
        temperatureIn.setText(temperatureInCelsius);

        localTime.setText(weather.getLocation().getLocaltime());


        String picturesFromGoogleLink = "https://www.google.com/search?tbm=isch&q=" + weather.getLocation().getName();
        googlePic.setText(picturesFromGoogleLink);



        String getImageURL = "http:" + weather.getCurrent().getCondition().getIcon();
        Image imageFromWeb = new Image(getImageURL);
        image.setImage(imageFromWeb);

        country.setText(weather.getLocation().getCountry());


        String dayImageURL = "http://cdn.onlinewebfonts.com/svg/img_7181.png";
        String nightImageURL = "https://cdn.onlinewebfonts.com/svg/img_481273.png";


        if (weather.getCurrent().getIs_day() == 1) {
            Image imageForTimeOfDay = new Image(dayImageURL);
            timeOfDayImg.setImage(imageForTimeOfDay);


        } else {
            Image imageForTimeOfDay = new Image(nightImageURL);
            timeOfDayImg.setImage(imageForTimeOfDay);

        }

    }



    public void openBrowser(MouseEvent mouseEvent) {

        String www = googlePic.getText();

        try {
            Desktop.getDesktop().browse(new URI(www));
        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    public void openPalantirWWW(MouseEvent mouseEvent) {

        String www = "https://en.wikipedia.org/wiki/Palant%C3%ADr";

        try {
            Desktop.getDesktop().browse(new URI(www));
        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }

    }


}


