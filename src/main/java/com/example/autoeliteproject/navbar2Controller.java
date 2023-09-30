package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class navbar2Controller {

    @FXML
    private Button joinusBtn;

    @FXML
    private Button meetteamBtn;

    @FXML
    private Button ourjourneyBtn;

    @FXML
    void handleJoinUsButtonClick(ActionEvent event) {
        SceneLoader.loadScene("Aboutus_3.fxml", (Stage) joinusBtn.getScene().getWindow());

    }

    @FXML
    void handleMeetTeamButtonClick(ActionEvent event) {
        SceneLoader.loadScene("Aboutus_2.fxml", (Stage) meetteamBtn.getScene().getWindow());

    }

    @FXML
    void handleOurJourneyButtonClick(ActionEvent event) {
        SceneLoader.loadScene("Aboutus_1.fxml", (Stage) ourjourneyBtn.getScene().getWindow());

    }

}
