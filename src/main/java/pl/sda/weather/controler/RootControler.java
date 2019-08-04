package pl.sda.weather.controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class RootControler implements Initializable {
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("uruchomiłem okno");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info");
        alert.setContentText("To moja aplikacja");
        alert.show();

        Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
        alert1.setTitle("Potwierdzenie");
        alert1.setContentText("Jesteś pewien?");
        Optional<ButtonType> result =alert1.showAndWait();
        if(result.get() == ButtonType.OK){
            System.out.println("Użytkownik wybrał ok");
        }else {
            System.out.println("Uzytkownik wybrał cancel");
        }
    }
}
