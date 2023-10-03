package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class viewcarsController implements Initializable {

    @FXML
    private HBox cardLayout;

    @FXML
    private Button allbtn;

    @FXML
    private Button fordbtn;

    @FXML
    private Button hondabtn;

    @FXML
    private Button mitsubishibtn;

    @FXML
    private Button toyotabtn;

    private List<Car> carsview = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
        loadCarsView();
    }

    private void loadCarsView() {

        Car hondaCivic = new Car();
        hondaCivic.setCarName("Honda");
        hondaCivic.setcarModel("Civic");
        hondaCivic.setCarPrice("₱ 1,115,000");
        hondaCivic.setCarImage("/images/honda-civic/honda-civic.png");
        hondaCivic.setBodytype("Sedan");
        hondaCivic.setColor("Red");
        hondaCivic.setCondition("Brand New");
        hondaCivic.setDescription("The Honda Civic is a line of cars manufactured by Honda. Originally a subcompact, the Civic has gone through several generational changes, becoming both larger and more upscale, moving into the compact car segment.");
        hondaCivic.setYear("2023");
        hondaCivic.setTransmission("Automatic");
        carsview.add(hondaCivic);

        Car hondaCity = new Car();
        hondaCity.setCarName("Honda");
        hondaCity.setcarModel("City");
        hondaCity.setCarPrice("₱ 820,000");
        hondaCity.setCarImage("/images/honda-city/city.png");
        // do the same thing here just like what you did above
        hondaCity.setBodytype("Sedan");
        hondaCity.setColor("Silver");
        hondaCity.setCondition("Brand New");
        hondaCity.setDescription("The Honda City is a subcompact car which has been produced by the Japanese manufacturer Honda since 1981. Originally made for the Japanese, European and Australasian markets, the City 3-door hatchback was retired in 1994 after the second generation.");
        hondaCity.setYear("2023");
        hondaCity.setTransmission("Automatic");
        carsview.add(hondaCity);

        Car toyotaWigo = new Car();
        toyotaWigo.setCarName("Toyota");
        toyotaWigo.setcarModel("Wigo");
        toyotaWigo.setCarPrice("₱ 568,000");
        toyotaWigo.setCarImage("/images/Toyota Wigo/wigo2.png");
        toyotaWigo.setBodytype("Hatchback");
        toyotaWigo.setColor("Orange");
        toyotaWigo.setCondition("Brand New");
        toyotaWigo.setDescription("The Toyota Wigo is a city car manufactured by the Japanese manufacturer Toyota, sold in the Philippines, Indonesia, Malaysia, and Sri Lanka. The Wigo is also exported to other countries as the Toyota Agya, Daihatsu Ayla, and Perodua Axia.");
        toyotaWigo.setYear("2023");
        toyotaWigo.setTransmission("Automatic");
        carsview.add(toyotaWigo);

        Car toyotaVios = new Car();
        toyotaVios.setCarName("Toyota");
        toyotaVios.setcarModel("Vios");
        toyotaVios.setCarPrice("₱ 671,000");
        toyotaVios.setCarImage("/images/toyota-vios/toyota-vios.jpg");
        toyotaVios.setBodytype("Sedan");
        toyotaVios.setColor("Red");
        toyotaVios.setCondition("Brand New");
        toyotaVios.setDescription("The Toyota Vios is a subcompact car produced by the Japanese manufacturer Toyota, primarily for markets in the Asia-Pacific region since 2002. Along with the compact Corolla and mid-size Camry, the Vios serves as the replacement to the Tercel.");
        toyotaVios.setYear("2023");
        toyotaVios.setTransmission("Automatic");
        carsview.add(toyotaVios);

        Car mitsubishiMontero = new Car();
        mitsubishiMontero.setCarName("Mitsubishi");
        mitsubishiMontero.setcarModel("Montero");
        mitsubishiMontero.setCarPrice("₱ 1,769,000");
        mitsubishiMontero.setCarImage("/images/Montero/mitsu 2.png");
        mitsubishiMontero.setBodytype("SUV");
        mitsubishiMontero.setColor("White");
        mitsubishiMontero.setCondition("Brand New");
        mitsubishiMontero.setDescription("The Mitsubishi Pajero is a full-size sport utility vehicle manufactured and marketed globally by Mitsubishi. Mitsubishi markets the SUV as the Montero in Spain and the Americas, except Brazil and Jamaica — and as the Shogun in the United Kingdom.");
        mitsubishiMontero.setYear("2023");
        mitsubishiMontero.setTransmission("Automatic");

        carsview.add(mitsubishiMontero);

        Car mitshubishiMirage = new Car();
        mitshubishiMirage.setCarName("Mitsubishi");
        mitshubishiMirage.setcarModel("Mirage");
        mitshubishiMirage.setCarPrice("₱ 704,000");
        mitshubishiMirage.setCarImage("/images/mitsubishi-mirage/mirage.png");
        mitshubishiMirage.setBodytype("Hatchback");
        mitshubishiMirage.setColor("Red");
        mitshubishiMirage.setCondition("Brand New");
        mitshubishiMirage.setDescription("The Mitsubishi Mirage is a range of cars produced by the Japanese manufacturer Mitsubishi from 1978 to 2003 and again since 2012. The hatchback models produced between 1978 and 2003 were classified as subcompact cars, while the sedan and station wagon models, marketed prominently as the Mitsubishi Lancer, were the compact offerings.");
        mitshubishiMirage.setYear("2023");
        mitshubishiMirage.setTransmission("Automatic");
        carsview.add(mitshubishiMirage);

        Car fordRanger = new Car();
        fordRanger.setCarName("Ford");
        fordRanger.setcarModel("Ranger");
        fordRanger.setCarPrice("₱ 1,032,000");
        fordRanger.setCarImage("/images/ford-ranger/ranger.png");
        fordRanger.setBodytype("Pickup");
        fordRanger.setColor("Red");
        fordRanger.setCondition("Brand New");
        fordRanger.setDescription("The Ford Ranger is a range of pickup trucks manufactured and marketed by Ford in North and South America. The replacement for the Mazda-sourced Ford Courier, the Ranger was the first compact truck developed by Ford.");
        fordRanger.setYear("2023");
        fordRanger.setTransmission("Automatic");
        carsview.add(fordRanger);

        Car fordEverest = new Car();
        fordEverest.setCarName("Ford");
        fordEverest.setcarModel("Everest");
        fordEverest.setCarPrice("₱ 1,738,000");
        fordEverest.setCarImage("/images/ford-everest/everest.png");
        fordEverest.setBodytype("SUV");
        fordEverest.setColor("Blue");
        fordEverest.setCondition("Brand New");
        fordEverest.setDescription("The Ford Everest, also known as the Ford Endeavour in the Indian market, is a mid-size body-on-frame sport utility vehicle (SUV) produced by Ford Motor Company since 2003. It is based on the Ford Ranger pickup truck, and it was developed and destined mainly for the Asia-Pacific region.");
        fordEverest.setYear("2023");
        fordEverest.setTransmission("Automatic");
        carsview.add(fordEverest);

        // Initialize the UI with all cars
        updateUIWithFilteredCars(carsview);
    }

    private void updateUIWithFilteredCars(List<Car> filteredCars) {
        cardLayout.getChildren().clear();

        for (Car car : filteredCars) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("carCards.fxml"));
                VBox carcardVB = fxmlLoader.load();

                CardController cardController = fxmlLoader.getController();
                cardController.setData(car);

                cardLayout.getChildren().add(carcardVB);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private List<Car> filterCarsByBrand(String brand) {
        return carsview.stream()
                .filter(car -> car.getCarName().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    @FXML
    private void handleBrandButtonClick(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String brand = clickedButton.getText();

        if ("All".equalsIgnoreCase(brand)) {
            updateUIWithFilteredCars(carsview);
        } else {
            List<Car> filteredCars = filterCarsByBrand(brand);
            updateUIWithFilteredCars(filteredCars);
        }
    }
}
