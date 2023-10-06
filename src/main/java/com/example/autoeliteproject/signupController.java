package com.example.autoeliteproject;

import com.example.autoeliteproject.SceneLoader;
import com.example.autoeliteproject.User;
import com.example.autoeliteproject.UserDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.autoeliteproject.SceneNames.LOGIN;

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
            showAlert(Alert.AlertType.ERROR, "Error", "Validation Error", "Please fill in all required fields.");
            return;
        }

        try {
            UserDao userDao = new UserDao();

            // Check if the username already exists
            if (userDao.getUserByUsername(username) != null) {
                showAlert(Alert.AlertType.ERROR, "Error", "Registration Error", "Username is already taken.");
                return;
            }

            // You can similarly check for duplicate email addresses here

            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setEmail(email);

            if (userDao.createUser(user)) {
                // Registration successful
                showAlert(Alert.AlertType.INFORMATION, "Success", "Registration Successful", "You have successfully registered.");
                // Redirect to the login page
                SceneLoader.loadScene(LOGIN, (Stage) createBtn.getScene().getWindow());
            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Registration Error", "An error occurred while registering the user.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Error", "Registration Error", "An error occurred while registering the user.");
        }
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
