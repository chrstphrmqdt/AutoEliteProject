package com.example.autoeliteproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class homeController implements Initializable {

    @FXML
    private ComboBox<String> bodyBox;

    @FXML
    private ComboBox<String> conditionBox;

    @FXML
    private ComboBox<String> makeBox;

    @FXML
    private ComboBox<String> modelBox;

    @FXML
    private ComboBox<String> transBox;

    @FXML
    private ComboBox<String> yearBox;

    @FXML
    private Button searchcarsBtn;

    private final UserDao UserDao = new UserDao();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize the makeBox with data from the database
        List<String> carMakes = UserDao.getAllCarMakes();
        ObservableList<String> carMakesList = FXCollections.observableArrayList(carMakes);
        makeBox.setItems(carMakesList);

        // Add an event listener to the makeBox ComboBox
        makeBox.setOnAction(event -> onMakeSelected());
    }

    @FXML
    void onMakeSelected() {
        String selectedMake = makeBox.getValue();
        if (selectedMake != null) {
            // Populate the modelBox based on the selected make
            List<String> carModels = UserDao.getCarModelsByMake(selectedMake);
            ObservableList<String> carModelsList = FXCollections.observableArrayList(carModels);
            modelBox.setItems(carModelsList);

            // Populate the yearBox based on the selected make
            List<String> carYears = UserDao.getYearsByMake(selectedMake);
            ObservableList<String> carYearsList = FXCollections.observableArrayList(carYears);
            yearBox.setItems(carYearsList);

            // Populate the conditionBox based on the selected make
            List<String> carConditions = UserDao.getConditionsByMake(selectedMake);
            ObservableList<String> carConditionsList = FXCollections.observableArrayList(carConditions);
            conditionBox.setItems(carConditionsList);

            // Populate the bodyBox based on the selected make
            List<String> carBodyTypes = UserDao.getBodyTypesByMake(selectedMake);
            ObservableList<String> carBodyTypesList = FXCollections.observableArrayList(carBodyTypes);
            bodyBox.setItems(carBodyTypesList);

            // Populate the transBox based on the selected make
            List<String> carTransmissions = UserDao.getTransmissionsByMake(selectedMake);
            ObservableList<String> carTransmissionsList = FXCollections.observableArrayList(carTransmissions);
            transBox.setItems(carTransmissionsList);

            // Ensure you update all other ComboBoxes in the same manner
        }
    }


    @FXML
    void searchcarsBtn(ActionEvent actionEvent) {
        SceneLoader.loadScene("searchcars.fxml", (Stage) searchcarsBtn.getScene().getWindow());
    }
}
