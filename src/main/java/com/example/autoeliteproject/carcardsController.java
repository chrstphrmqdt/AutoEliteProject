package com.example.autoeliteproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class carcardsController {

    @FXML
    private ImageView carImg;

    @FXML
    private VBox carcardVb;

    @FXML
    private Label carnameLb;

    @FXML
    private Label carpriceLb;

    @FXML
    private Button detailsBtn;
    
    //event handlers
    @FXML
    private void handleDetailsButtonClick() {
        SceneLoader.loadScene("cardetails.fxml", (Stage) detailsBtn.getScene().getWindow());
    }


}
