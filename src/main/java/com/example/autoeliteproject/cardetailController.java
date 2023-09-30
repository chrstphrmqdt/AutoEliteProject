package com.example.autoeliteproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class cardetailController {


    @FXML
    private Button buynowBtn;

    @FXML
    private Button contactcsBtn;

    //event handlers
    @FXML
    private void handlebuynowButtonClick() {
        SceneLoader.loadScene("checkout.fxml", (Stage) buynowBtn.getScene().getWindow());
    }

    @FXML
    private void handlecontactcsButtonClick() {
        SceneLoader.loadScene("contactuss.fxml", (Stage) contactcsBtn.getScene().getWindow());
    }

}
