package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CardetailController {

    @FXML
    private Label makeName, makeName2, modelName, modelName2, color, bodytype, condition, price, transmission, year;

    @FXML
    private Button buynowBtn, contactcsBtn;

    @FXML
    private Text description;

    @FXML
    private ImageView imagecar;

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
