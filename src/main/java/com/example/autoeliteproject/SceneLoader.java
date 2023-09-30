package com.example.autoeliteproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneLoader {
    public static void loadScene(String sceneFXML, Stage previousStage) {
        try {
            // Close the previous stage
            if (previousStage != null) {
                previousStage.close();
            }

            FXMLLoader fxmlLoader = new FXMLLoader(SceneLoader.class.getResource(sceneFXML));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);

            // Create a new stage and set it to fullscreen
            Stage newStage = new Stage();
            newStage.setMaximized(true);

            newStage.setScene(scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
