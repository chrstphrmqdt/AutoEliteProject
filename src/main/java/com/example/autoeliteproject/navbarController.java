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
    private Button faqBtn;

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
        loadScene("Aboutus_1.fxml");
    }

    @FXML
    private void handleContactsButtonClick() {
        loadScene("contacts.fxml");
    }

    @FXML
    private void handleFAQButtonClick() {
        loadScene("FAQ.fxml");
    }

    @FXML
    private void handleHomeButtonClick() {
        loadScene("homepage.fxml");
    }

    @FXML
    private void handleLoginButtonClick() {
        loadScene("login.fxml");
    }

    @FXML
    private void handleSignupButtonClick() {
        loadScene("signup.fxml");
    }

    @FXML
    private void handleViewCarsButtonClick() {
        loadScene("viewCars.fxml");
    }

    // Helper method to load and display an FXML scene
    public void loadScene(String sceneFXML) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(sceneFXML));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) homeBtn.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
