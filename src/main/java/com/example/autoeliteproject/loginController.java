package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static com.example.autoeliteproject.SceneLoader.loadScene;

public class loginController {

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

    public void handleBackToHomeButtonClick(ActionEvent actionEvent) {
        SceneLoader.loadScene("Homepage.fxml", (Stage) backtohomeBtn.getScene().getWindow());
    }
    public void handlesignupButtonClick(ActionEvent actionEvent) {
        SceneLoader.loadScene("signup.fxml", (Stage) donthaveaccBtn.getScene().getWindow());
    }
}
