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

    @FXML
    void searchcarsBtn(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("viewCars.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            viewcarsController viewcarsController = fxmlLoader.getController();

            Scene scene = new Scene(root1);
            Stage primaryStage = (Stage) searchcarsBtn.getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}