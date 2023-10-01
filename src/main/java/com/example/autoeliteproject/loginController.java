package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static com.example.autoeliteproject.SceneLoader.loadScene;

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
        SceneLoader.loadScene("signup.fxml", (Stage) donthaveaccBtn.getScene().getWindow());
    }

    @FXML
    void forgotpassBtnClicked() {
        // Handle "Forgot Password" button click (implement password recovery logic here)
        showAlert(Alert.AlertType.INFORMATION, "Forgot Password", "Password Recovery", "Please contact support for password recovery.");
    }

    @FXML
    void loginnowBtnClicked() {
        // Handle "Login" button click (implement login authentication logic here)
        String username = usernameTf.getText();
        String password = passTf.getText();

        // Perform authentication (replace with your authentication logic)
        if (authenticateUser(username, password)) {
            showAlert(Alert.AlertType.INFORMATION, "Login Success", "Welcome", "You have successfully logged in.");
            // Navigate to the main application screen (replace with your desired screen)
            SceneLoader.loadScene("homepage_loggedin.fxml", (Stage) loginnowBtn.getScene().getWindow());
        } else {
            showAlert(Alert.AlertType.ERROR, "Login Failed", "Authentication Error", "Invalid username or password.");
        }
    }

    private boolean authenticateUser(String username, String password) {
        try {
            // Assuming you have a UserDao class to interact with the database
            UserDao userDao = new UserDao();

            // Retrieve the user data based on the username
            User user = userDao.getUserByUsername(username);

            // Check if the user exists and the password matches
            if (user != null && user.getPassword().equals(password)) {
                return true; // Authentication successful
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // Authentication failed
    }

    private void showAlert(Alert.AlertType type, String title, String header, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public void handleBackToHomeButtonClick(ActionEvent actionEvent) {
        SceneLoader.loadScene("Homepage.fxml", (Stage) backtohomeBtn.getScene().getWindow());
    }

}
