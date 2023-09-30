package com.example.autoeliteproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class navbarController {

    @FXML
    private Button aboutusBtn;

    @FXML
    private Button contactsBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Button loginBtn;

    @FXML
    private Button signupBtn;

    @FXML
    private Button viewCarsBtn;


    //event handlers
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
    private void handleLoginButtonClick() {
        SceneLoader.loadScene("login.fxml", (Stage) loginBtn.getScene().getWindow());
    }

    @FXML
    private void handleSignupButtonClick() {
        SceneLoader.loadScene("signup.fxml", (Stage) signupBtn.getScene().getWindow());
    }

    @FXML
    private void handleViewCarsButtonClick() {
        SceneLoader.loadScene("viewCars.fxml", (Stage) viewCarsBtn.getScene().getWindow());
    }

}
