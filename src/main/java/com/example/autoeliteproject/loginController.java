package com.example.autoeliteproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {
    private com.example.autoeliteproject.navbarController navbarController;


    @FXML
    private Button donthaveaccBtn;

    @FXML
    private Button forgotpassBtn;

    @FXML
    private Button loginnowBtn;

    @FXML
    private TextField passTf;

    @FXML
    private CheckBox rememberCbox;

    @FXML
    private TextField usernameTf;

    @FXML
    private Button backtohomeBtn;

    @FXML
    void donthaveaccBtnClicked() {

    }

    @FXML
    void forgotpassBtnClicked() {

    }

    @FXML
    void loginnowBtnClicked() {

    }

    @FXML
    void passTfClicked() {

    }

    @FXML
    void rememberCboxClicked() {

    }

    @FXML
    void usernameTfClicked() {

    }

    @FXML
    private void handleBackToHomeButtonClick() {
        try {
            // Load the homepage.fxml file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("homepage.fxml"));
            Parent root = fxmlLoader.load();

            // Create a new scene with the loaded root
            Scene scene = new Scene(root);

            // Get the current stage (the login stage) and set the scene to the homepage
            Stage stage = (Stage) backtohomeBtn.getScene().getWindow();
            stage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
