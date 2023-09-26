package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

import java.io.IOException;

public class homeController {

    @FXML
    private ComboBox<?> bodyBox;

    @FXML
    private ComboBox<?> conditionBox;

    @FXML
    private ComboBox<?> makeBox;

    @FXML
    private ComboBox<?> modelBox;

    @FXML
    private Label priceLabel;

    @FXML
    private Slider priceSlider;

    @FXML
    private Button searchcarsBtn;

    @FXML
    private ComboBox<?> transBox;

    @FXML
    private ComboBox<?> yearBox;

    public void loadScene(String sceneFXML) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(sceneFXML));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) searchcarsBtn.getScene().getWindow();

            // Set the stage to fullscreen
            stage.setMaximized(true);

            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void searchcarsBtn(ActionEvent actionEvent) {
    }
}
