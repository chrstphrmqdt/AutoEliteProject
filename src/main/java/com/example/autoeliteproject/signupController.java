package com.example.autoeliteproject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class signupController implements javafx.fxml.Initializable {
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

    @FXML
    private void handleCreatebtn(ActionEvent event) {
        // Get user input
        String username = usernameTf.getText().trim();
        String password = passTf.getText();
        String email = emailTf.getText().trim();

        // Validate user input
        if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
            // Show an error message dialog to inform the user that fields are required.
            showAlert(Alert.AlertType.ERROR, "Error", "Validation Error", "Please fill in all required fields.");
            return; // Exit the method if validation fails.
        }

        // Create a User object with validated input
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);

        // Attempt to create the user in the database
        UserDao userDao = new UserDao();
        try {
            if (userDao.createUser(user)) {
                System.out.println("User registered successfully.");
                // Provide user feedback here if needed (e.g., a success message).
            } else {
                // Handle the case where user creation failed (e.g., due to a duplicate username).
                showAlert(Alert.AlertType.ERROR, "Error", "Registration Error", "An error occurred while registering the user.");
            }
        } catch (Exception e) {
            // Handle any exceptions that occur during database interaction.
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Error", "Registration Error", "An error occurred while registering the user.");
        }

        // Load the login scene (whether registration succeeded or not)
        SceneLoader.loadScene("login.fxml", (Stage) createBtn.getScene().getWindow());
    }

    private void showAlert(Alert.AlertType type, String title, String header, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
