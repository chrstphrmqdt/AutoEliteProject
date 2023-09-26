package com.example.autoeliteproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class cardetailController {


    @FXML
    private Button bookBtn;

    @FXML
    private Button buynowBtn;

    @FXML
    private Button contactcsBtn;

    //event handlers
    @FXML
    private void handlebuynowButtonClick() {
        loadScene("checkout.fxml");
    }

    public void loadScene(String sceneFXML) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(sceneFXML));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) buynowBtn.getScene().getWindow();

            // Set the stage to fullscreen
            stage.setMaximized(true);

            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
