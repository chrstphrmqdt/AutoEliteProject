package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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

    public void loadScene(String sceneFXML) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(sceneFXML));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) loginnowBtn.getScene().getWindow();

            // Set the stage to fullscreen
            stage.setMaximized(true);

            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleBackToHomeButtonClick(ActionEvent actionEvent) {
        loadScene("Homepage.fxml");
    }
}
