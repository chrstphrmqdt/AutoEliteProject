package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.io.InputStream;

public class CardController {

    @FXML
    private ImageView carImg;

    @FXML
    private VBox carcardVb;

    @FXML
    private Label carnameLb;

    @FXML
    private Label carmodelLb;

    @FXML
    private Label carpriceLb;

    private Car car;

    public void setData(Car car) {
        this.car = car;
        carnameLb.setText(car.getCarName());
        carmodelLb.setText(car.getcarModel());
        carpriceLb.setText(car.getCarPrice());

        // Load the car image
        loadCarImage(car.getCarImage());
    }

    private void loadCarImage(String imageUrl) {
        try {
            InputStream imageStream = getClass().getResourceAsStream(imageUrl);
            if (imageStream != null) {
                Image carImage = new Image(imageStream);
                carImg.setImage(carImage);
            } else {
                // Handle the case where the image resource is not found
                // You can set a default image or display an error message
                carImg.setImage(null); // Set to a default image or null
                System.err.println("Image not found: " + imageUrl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleDetailsButtonClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("cardetails.fxml"));
            Parent root = loader.load();
            CardetailController cardetailController = loader.getController();
            cardetailController.setCarDetails(car);

            // Create a new stage for car details
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UTILITY);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.showAndWait(); // Wait for the details window to close before returning
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
