package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class checkoutController {

    @FXML
    private Label carmake;

    @FXML
    private Label carmodel;

    @FXML
    private Label pricecheckout;

    @FXML
    private ImageView imagecar;

    @FXML
    private Label subtotalprice;

    @FXML
    private Label shippingfee;

    @FXML
    private TextField address;

    @FXML
    private RadioButton cashpayment;

    @FXML
    private TextField city;

    @FXML
    private TextField country;

    @FXML
    private TextField email;

    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private Button paynowBtn;

    @FXML
    private TextField phone;

    @FXML
    private TextField postal;

    @FXML
    private TextField region;

    @FXML
    private RadioButton shipping1;

    @FXML
    private RadioButton shipping2;

    @FXML
    private RadioButton shipping3;

    private Car selectedCar;

    @FXML
    private Label totalprice;

    @FXML
    void initialize() {
        shipping1.setOnAction(event -> updateTotalPrice());
        shipping2.setOnAction(event -> updateTotalPrice());
        shipping3.setOnAction(event -> updateTotalPrice());
    }

    private void updateTotalPrice() {
        double total = calculateTotalPrice();
        totalprice.setText(String.format("₱ %.2f", total)); // Update total price label
        shippingfee.setText(String.format("₱ %.2f", total - calculateSubtotal())); // Update shipping fee label
    }
    private double calculateSubtotal() {
        // Remove non-numeric characters and currency symbol (₱)
        String priceText = pricecheckout.getText().replace("₱", "").replaceAll("[^\\d.]", "");

        try {
            return Double.parseDouble(priceText);
        } catch (NumberFormatException e) {
            e.printStackTrace(); // Handle the error appropriately
            return 0.0; // Return a default value or handle the error appropriately
        }
    }


    //method to set car details
    private double calculateTotalPrice() {
        double shippingFee = 0.00;

        if (shipping1.isSelected()) {
            shippingFee = 10000.00;
        } else if (shipping2.isSelected()) {
            shippingFee = 100000.00;
        } else if (shipping3.isSelected()) {
            shippingFee = 200000.00;
        }

        double subtotal = calculateSubtotal();
        double total = subtotal + shippingFee;
        return total;
    }

    public void setCarDetails(Car car) {
        selectedCar = car;
        if (selectedCar != null) {
            // Set the car details in the UI elements
            carmake.setText(selectedCar.getCarName());
            carmodel.setText(selectedCar.getcarModel());
            pricecheckout.setText(selectedCar.getCarPrice());
            subtotalprice.setText(selectedCar.getCarPrice());
            shippingfee.setText("0.00");

            Image carImage = new Image(selectedCar.getCarImage());
            imagecar.setImage(carImage);
        }
    }

    @FXML
    void handlePayNowButtonClick(ActionEvent event) {
        // Get user input from the form
        String userFirstName = firstname.getText();
        String userLastName = lastname.getText();
        String userEmail = email.getText();
        String userPhone = phone.getText();
        String userAddress = address.getText();
        String userCity = city.getText();
        String userPostal = postal.getText();
        String userRegion = region.getText();
        String userCountry = country.getText();
        double totalPrice = calculateTotalPrice();

        // Validate user input
        if (validateInput(userFirstName, userLastName, userEmail, userPhone, userAddress, userCity, userPostal, userRegion, userCountry)) {
            // Process payment
            boolean paymentSuccessful = processPayment(userFirstName, userLastName, userEmail, totalPrice);

            if (paymentSuccessful) {
                // Generate an order confirmation
                String orderConfirmation = generateOrderConfirmation(userFirstName, userLastName, userEmail, totalPrice);

                selectedCar.setSold(true);

                // Save order information to the database
                saveOrderToDatabase(userFirstName, userLastName, userEmail, userPhone, userAddress, userCity, userPostal, userRegion, userCountry, totalPrice, orderConfirmation);

                // Display an order confirmation to the user
                displayOrderConfirmation(orderConfirmation);

                // Close the checkout window
                closeCheckoutWindow();
            } else {
                // Handle payment failure
                displayPaymentFailureMessage();
            }
        }
    }

    // calculate total price


    private boolean validateInput(String firstName, String lastName, String email, String phone, String address, String city, String postal, String region, String country) {
        if (isEmpty(firstName) ||
                isEmpty(lastName) ||
                isEmpty(email) ||
                isEmpty(phone) ||
                isEmpty(address) ||
                isEmpty(city) ||
                isEmpty(postal) ||
                isEmpty(country) ||
                isEmpty(region)) {

            showAlert("All fields are required!", Alert.AlertType.INFORMATION);
            return false;
        }

        String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,7}\\b";
        if (!email.matches(emailPattern)) {
            showAlert("Invalid email address!", Alert.AlertType.INFORMATION);
            return false;
        }

        if (phone.length() != 11) {
            showAlert("Invalid phone number!", Alert.AlertType.INFORMATION);
            return false;
        }

        if (postal.length() != 4) {
            showAlert("Invalid postal code!", Alert.AlertType.INFORMATION);
            return false;
        }

        // If all checks pass, return true
        return true;
    }

    private boolean isEmpty(String text) {
        return text == null || text.trim().isEmpty();
    }

    private void showAlert(String message, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private boolean processPayment(String firstName, String lastName, String email, double totalPrice) {
        // Simulate a payment process
        try {
            // Add any necessary logic for actual payment processing here

            // Display a success message
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "PH"));
            String formattedTotalPrice = currencyFormatter.format(totalPrice);
            String paymentMessage = "Payment successful!\n\n" +
                    "Customer: " + firstName + " " + lastName + "\n" +
                    "Email: " + email + "\n" +
                    "Total Amount: " + formattedTotalPrice;

            showAlert(paymentMessage, Alert.AlertType.INFORMATION);

            return true;
        } catch (Exception e) {
            // Handle payment failure
            showAlert("Payment failed. Please try again later.", Alert.AlertType.ERROR);
            e.printStackTrace();
            return false;
        }
    }

    private String generateOrderConfirmation(String firstName, String lastName, String email, double totalPrice) {
        // Format the total price as currency
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "PH"));
        String formattedTotalPrice = currencyFormatter.format(totalPrice);

        // Generate the order confirmation message
        StringBuilder confirmationMessage = new StringBuilder();
        confirmationMessage.append("Order Confirmation\n\n");
        confirmationMessage.append("Customer: ").append(firstName).append(" ").append(lastName).append("\n");
        confirmationMessage.append("Email: ").append(email).append("\n");
        confirmationMessage.append("Total Amount: ").append(formattedTotalPrice).append("\n\n");
        confirmationMessage.append("Thank you for your order!");

        return confirmationMessage.toString();
    }

    private void saveOrderToDatabase(String firstName, String lastName, String email, String phone, String address, String city, String postal, String region, String country, double totalPrice, String orderConfirmation) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Configure database connection
            String jdbcUrl = "jdbc:mysql://localhost:3306/autoelite";
            String dbUsername = "root";
            String dbPassword = "";

            // Establish the database connection
            connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);

            // Define the SQL query to insert the order into the database
            String insertQuery = "INSERT INTO orders (first_name, last_name, email, phone, address, city, postal, region, country, total_price, order_confirmation) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            // Create a PreparedStatement with the insertQuery
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, phone);
            preparedStatement.setString(5, address);
            preparedStatement.setString(6, city);
            preparedStatement.setString(7, postal);
            preparedStatement.setString(8, region);
            preparedStatement.setString(9, country);
            preparedStatement.setDouble(10, totalPrice);
            preparedStatement.setString(11, orderConfirmation);

            // Execute the SQL statement to insert the order
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                // Order saved successfully
                System.out.println("Order saved to the database!");
            } else {
                // Handle the case where the order could not be saved
                System.err.println("Failed to save order to the database.");
            }
        } catch (SQLException e) {
            // Handle any database-related errors
            Logger.getLogger(checkoutController.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            // Close the database resources
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // Handle errors during resource closing
                Logger.getLogger(checkoutController.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    private void displayOrderConfirmation(String orderConfirmation) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Order Confirmation");
        alert.setHeaderText("Thank you for your order!");
        alert.setContentText("Order Confirmation:\n" + orderConfirmation);

        alert.showAndWait();
    }

    private void displayPaymentFailureMessage() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Payment Failure");
        alert.setHeaderText("Payment Error");
        alert.setContentText("There was an error processing your payment. Please try again.");

        alert.showAndWait();
    }


    private void closeCheckoutWindow() {
        // Close the checkout window after a successful transaction.
        Stage stage = (Stage) paynowBtn.getScene().getWindow();
        stage.close();
    }
}
