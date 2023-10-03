package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {

    @FXML
    private Button donthaveaccBtn;

    @FXML
    private Button loginnowBtn;

    @FXML
    private PasswordField passTf;

    @FXML
    private TextField usernameTf;

    @FXML
    private Button backtohomeBtn;

    @FXML
    void donthaveaccBtnClicked() {
        // Handle "Don't have an account?" button click
        SceneLoader.loadScene(SceneNames.SIGNUP, (Stage) donthaveaccBtn.getScene().getWindow());
    }

    @FXML
    void forgotpassBtnClicked() {
        // Handle "Forgot Password" button click (implement password recovery logic here)
        showAlert(Alert.AlertType.INFORMATION, "Forgot Password", "Password Recovery", "Please contact support for password recovery.");
    }

    @FXML
    void loginnowBtnClicked() {
        // Handle "Login" button click
        String username = usernameTf.getText();
        String password = passTf.getText();

        try {
            AuthenticationService authService = new AuthenticationService();

            if (authService.authenticate(username, password)) {
                showAlert(Alert.AlertType.INFORMATION, "Login Success", "Welcome", "You have successfully logged in.");
                clearFields();
                SceneLoader.loadScene(SceneNames.HOMEPAGE_LOGGED_IN, (Stage) loginnowBtn.getScene().getWindow());
            } else {
                showAlert(Alert.AlertType.ERROR, "Login Failed", "Authentication Error", "Invalid username or password.");
            }
        } catch (Exception e) {
            showAlert(Alert.AlertType.ERROR, "Error", "Authentication Error", "An error occurred during authentication.");
            e.printStackTrace();
        }
    }

    @FXML
    void handleBackToHomeButtonClick(ActionEvent actionEvent) {
        SceneLoader.loadScene(SceneNames.HOMEPAGE, (Stage) backtohomeBtn.getScene().getWindow());
    }

    private void showAlert(Alert.AlertType type, String title, String header, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void clearFields() {
        usernameTf.clear();
        passTf.clear();
    }
}
