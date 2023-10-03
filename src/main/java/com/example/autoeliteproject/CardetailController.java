package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class CardetailController {

    @FXML
    private Label bodytype;

    @FXML
    private Button buynowBtn;

    @FXML
    private Label color;

    @FXML
    private Label condition;

    @FXML
    private Button contactcsBtn;

    @FXML
    private Text description;

    @FXML
    private ImageView imagecar;

    @FXML
    private Label makeName;

    @FXML
    private Label makeName2;

    @FXML
    private Label modelName;

    @FXML
    private Label modelName2;

    @FXML
    private Label price;

    @FXML
    private Label transmission;

    @FXML
    private Label year;

    private Car selectedCar; // Store the selected car

    // Method to set car details
    public void setCarDetails(Car car) {
        selectedCar = car;
        if (selectedCar != null) {
            // Set the car details in the UI elements
            makeName.setText(selectedCar.getCarName());
            makeName2.setText(selectedCar.getCarName());
            modelName2.setText(selectedCar.getcarModel());
            color.setText(selectedCar.getColor());
            bodytype.setText(selectedCar.getBodytype());
            condition.setText(selectedCar.getCondition());
            description.setText(selectedCar.getDescription());
            modelName.setText(selectedCar.getcarModel());
            year.setText(selectedCar.getYear());
            price.setText(selectedCar.getCarPrice());
            transmission.setText(selectedCar.getTransmission());

            Image carImage = new Image(selectedCar.getCarImage());
            imagecar.setImage(carImage);
        }
    }

    @FXML
    void handleBuyNowButtonClick(ActionEvent event) {
        // Check if a car is selected
        if (selectedCar != null) {
            // Load the checkout page and pass the selected car data
            SceneLoader.loadCheckoutScene(selectedCar, (Stage) buynowBtn.getScene().getWindow());
        }
    }

    @FXML
    void handleContactCustomerServiceButtonClick(ActionEvent event) {
        SceneLoader.loadScene("contactuss.fxml", (Stage) contactcsBtn.getScene().getWindow());
    }
}
