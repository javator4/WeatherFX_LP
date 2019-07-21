package pl.sda.weather.controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class RootControler {
    @FXML
    private TextField city;

    @FXML
    private Button find;

    @FXML
    private Label temperature;

    public void getWeather(ActionEvent actionEvent) {

        String text = city.getText();
        temperature.setText(text);
        System.out.println("klik");
    }
}
