package com.example.autoeliteproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class checkoutController {

    @FXML
    private TextField cardnameTf;

    @FXML
    private TextField cardnumTf;

    @FXML
    private TextField checkout_addressTf;

    @FXML
    private TextField checkout_emailTf;

    @FXML
    private TextField checkout_firstnTf;

    @FXML
    private TextField checkout_lastnTf;

    @FXML
    private TextField cityTf;

    @FXML
    private TextField countryTf;

    @FXML
    private TextField cvvTf;

    @FXML
    private TextField mmyyTf;

    @FXML
    private Button paynowBtn;

    @FXML
    private TextField phoneTf;

    @FXML
    private TextField postalTf;

    @FXML
    private TextField regionTf;

    @FXML
    private RadioButton shipping1Btn;

    @FXML
    private RadioButton shipping2Btn;

    @FXML
    private RadioButton shipping3Btn;

    @FXML
    private RadioButton shipping4Btn;

    @FXML
    private RadioButton shipping5Btn;

    //event handlers

    @FXML
    private void handlepaynowButtonClick() {
        SceneLoader.loadScene("success.fxml", (Stage) paynowBtn.getScene().getWindow());
    }


}
