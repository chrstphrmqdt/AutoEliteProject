package com.example.autoeliteproject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class successContrller {

    @FXML
    private Button continueshopBtn;
    @FXML
    private void handleContinueshopBtn () {
        loadScene("viewCars.fxml");
    }
    public void loadScene(String sceneFXML) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(sceneFXML));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) continueshopBtn.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}