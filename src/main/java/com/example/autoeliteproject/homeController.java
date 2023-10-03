package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class homeController{

    @FXML
    private Button searchcarsBtn;

    @FXML
    void searchcarsBtn() {
        SceneLoader.loadScene("viewCars.fxml", (Stage) searchcarsBtn.getScene().getWindow());

    }
}
