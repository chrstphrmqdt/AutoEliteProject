package com.example.autoeliteproject;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class signupController {
    @FXML
    private Button createBtn;

    @FXML
    private TextField emailTf;

    @FXML
    private Button loginBtn;

    @FXML
    private PasswordField passTf;

    @FXML
    private TextField usernameTf;

    @FXML
    private void handleLoginButtonClick() {
        SceneLoader.loadScene("login.fxml", (Stage) loginBtn.getScene().getWindow());
    }
}
