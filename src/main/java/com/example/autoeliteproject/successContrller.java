package com.example.autoeliteproject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class successContrller {

    @FXML
    private Button continueshopBtn;
    @FXML
    private void handleContinueshopBtn () {
        SceneLoader.loadScene("viewCars.fxml", (Stage) continueshopBtn.getScene().getWindow());
    }


}