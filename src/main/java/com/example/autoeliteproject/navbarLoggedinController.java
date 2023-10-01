package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class navbarLoggedinController {

    @FXML
    private Button aboutusBtn;

    @FXML
    private Button contactsBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Button viewCarsBtn;

    @FXML
    private void handleAboutUsButtonClick() {
        SceneLoader.loadScene("Aboutus_1.fxml", (Stage) aboutusBtn.getScene().getWindow());
    }

    @FXML
    private void handleContactsButtonClick() {
        SceneLoader.loadScene("contactuss.fxml", (Stage) contactsBtn.getScene().getWindow());
    }

    @FXML
    private void handleHomeButtonClick() {
        SceneLoader.loadScene("homepage.fxml", (Stage) homeBtn.getScene().getWindow());
    }
    @FXML
    private void handleViewCarsButtonClick() {
        SceneLoader.loadScene("viewCars.fxml", (Stage) viewCarsBtn.getScene().getWindow());
    }
}
