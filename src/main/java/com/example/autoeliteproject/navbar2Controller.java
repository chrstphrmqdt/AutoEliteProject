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
        loadScene("Aboutus_3.fxml", true);

    }

    @FXML
    void handleMeetTeamButtonClick(ActionEvent event) {
        loadScene("Aboutus_2.fxml", true);

    }

    @FXML
    void handleOurJourneyButtonClick(ActionEvent event) {
        loadScene("Aboutus_1.fxml", true);

    }

    public void loadScene(String sceneFXML, boolean isFullScreen) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(sceneFXML));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ourjourneyBtn.getScene().getWindow();

            // Set full-screen mode based on the provided boolean value
            stage.setFullScreen(isFullScreen);

            // Set the scene to the stage
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
