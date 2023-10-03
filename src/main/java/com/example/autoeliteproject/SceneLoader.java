package com.example.autoeliteproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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


        public static void loadCheckoutScene(Car selectedCar, Stage currentStage) {
            try {
                // Load the checkout.fxml file
                FXMLLoader loader = new FXMLLoader(SceneLoader.class.getResource("checkout.fxml"));
                Parent root = loader.load();

                // Get the controller of the loaded FXML
                checkoutController checkoutController = loader.getController();

                // Set the selected car data in the controller
                checkoutController.setCarDetails(selectedCar);

                // Create a new stage for the checkout scene
                Stage checkoutStage = new Stage();
                checkoutStage.initModality(Modality.APPLICATION_MODAL);
                checkoutStage.initStyle(StageStyle.DECORATED);
                checkoutStage.setTitle("Checkout");

                // Set the root node and show the scene
                checkoutStage.setScene(new Scene(root));
                checkoutStage.show();

                // Close the current stage (if needed)
                currentStage.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
