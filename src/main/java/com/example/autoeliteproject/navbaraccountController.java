package com.example.autoeliteproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class navbaraccountController {

    @FXML
    private Button billingsBtn;

    @FXML
    private Button myordersBtn;

    @FXML
    private Button personinfoBtn;


    @FXML
    private void handleBillingsButtonClick() {
        SceneLoader.loadScene("billings.fxml", (Stage) billingsBtn.getScene().getWindow());
    }

    @FXML
    private void handleMyOrdersButtonClick() {
        SceneLoader.loadScene("myorders.fxml", (Stage) myordersBtn.getScene().getWindow());
    }

    @FXML
    private void handlePersonInfoButtonClick() {
        SceneLoader.loadScene("accountinfo.fxml", (Stage) personinfoBtn.getScene().getWindow());
    }
}
