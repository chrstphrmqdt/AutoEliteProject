package com.example.autoeliteproject;
import com.example.autoeliteproject.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class accountController {

    @FXML
    private TextField email;

    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private Button logout;

    @FXML
    private PasswordField password;

    @FXML
    private TextField phone;

    @FXML
    private Button update;

    @FXML
    private TextField username;

    public void setUserData(User user) {
        email.setText(user.getEmail());
        firstname.setText(user.getFirstName());
        lastname.setText(user.getLastName());
        password.setText(user.getPassword());
        phone.setText(user.getPhone());
        username.setText(user.getUsername());
    }

    @FXML
    private void handleUpdateButton() {
        // Get the updated user data from the text fields
        String updatedEmail = email.getText();
        String updatedFirstName = firstname.getText();
        String updatedLastName = lastname.getText();
        String updatedPassword = password.getText();
        String updatedPhone = phone.getText();
        String updatedUsername = username.getText();
    }
}
