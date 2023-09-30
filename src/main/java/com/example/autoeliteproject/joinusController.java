package com.example.autoeliteproject;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class joinusController {


    @FXML
    private Button joinusBtn;

    public void handleJoinUsBtn() {
        SceneLoader.loadScene("signup.fxml", (Stage) joinusBtn.getScene().getWindow());
    }
}
