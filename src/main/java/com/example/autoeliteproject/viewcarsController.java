package com.example.autoeliteproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
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
        hondaCivic.setCarImage("/com/example/autoeliteproject/images/cars/Honda Civic/honda-civic.png");
        hondaCivic.setBodytype("Sedan");
        hondaCivic.setColor("Red");
        hondaCivic.setCondition("Brand New");
        hondaCivic.setDescription("The Honda Civic is a line of cars manufactured by Honda. Originally a subcompact, the Civic has gone through several generational changes, becoming both larger and more upscale, moving into the compact car segment.");
        hondaCivic.setYear("2023");
        hondaCivic.setTransmission("Automatic");
        carsview.add(hondaCivic);

        Car toyotaWigo = new Car();
        toyotaWigo.setCarName("Toyota");
        toyotaWigo.setcarModel("Wigo");
        toyotaWigo.setCarPrice("₱ 568,000");
        toyotaWigo.setCarImage("/com/example/autoeliteproject/images/cars/Toyota-wigo/wigo2.png");
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
        toyotaVios.setCarImage("/com/example/autoeliteproject/images/cars/Toyota-vios/vios2.png");
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
        mitsubishiMontero.setCarImage("/com/example/autoeliteproject/images/cars/mitsubishi-monter/mitsu 2.png");
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
        mitshubishiMirage.setCarImage("/com/example/autoeliteproject/images/cars/mitsubishi-mirage/mirage.png");
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
        fordRanger.setCarImage("/com/example/autoeliteproject/images/cars/ford-ranger/ranger.png");
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
        fordEverest.setCarImage("/com/example/autoeliteproject/images/cars/ford-everest/everest.png");
        fordEverest.setBodytype("SUV");
        fordEverest.setColor("Blue");
        fordEverest.setCondition("Brand New");
        fordEverest.setDescription("The Ford Everest, also known as the Ford Endeavour in the Indian market, is a mid-size body-on-frame sport utility vehicle (SUV) produced by Ford Motor Company since 2003. It is based on the Ford Ranger pickup truck, and it was developed and destined mainly for the Asia-Pacific region.");
        fordEverest.setYear("2023");
        fordEverest.setTransmission("Automatic");
        carsview.add(fordEverest);

        // add more honda cars
        Car hondaBrio = new Car();
        hondaBrio.setCarName("Honda");
        hondaBrio.setcarModel("Brio");
        hondaBrio.setCarPrice("₱ 601,000");
        hondaBrio.setCarImage("/com/example/autoeliteproject/images/cars/honda-brio/honda brio.png");
        hondaBrio.setBodytype("Hatchback");
        hondaBrio.setColor("Blue");
        hondaBrio.setCondition("Brand New");
        hondaBrio.setDescription("The Honda Brio is a city car, later a subcompact car produced by Honda and sold in the Philippines, India, Indonesia, Malaysia, Thailand, South Africa, Vietnam and the Philippines. The car was introduced in 2011.");
        hondaBrio.setYear("2023");
        hondaBrio.setTransmission("Automatic");
        carsview.add(hondaBrio);

        Car hondaBRV = new Car();
        hondaBRV.setCarName("Honda");
        hondaBRV.setcarModel("BRV");
        hondaBRV.setCarPrice("₱ 1,038,000");
        hondaBRV.setCarImage("/com/example/autoeliteproject/images/cars/honda-brv/brv.png");
        hondaBRV.setBodytype("SUV");
        hondaBRV.setColor("Red");
        hondaBRV.setCondition("Brand New");
        hondaBRV.setDescription("The Honda BR-V is a subcompact crossover SUV which has been manufactured by Honda since 2016. The car shares its platform with the second generation Mobilio, which is based on the lengthened Brio platform.");
        hondaBRV.setYear("2023");
        hondaBRV.setTransmission("Automatic");
        carsview.add(hondaBRV);

        Car hondaCity = new Car();
        hondaCity.setCarName("Honda");
        hondaCity.setcarModel("City");
        hondaCity.setCarPrice("₱ 1,115,000");
        hondaCity.setCarImage("/com/example/autoeliteproject/images/cars/honda-city/honda-city.png");
        hondaCity.setBodytype("Sedan");
        hondaCity.setColor("White");
        hondaCity.setCondition("Brand New");
        hondaCity.setDescription("The Honda City is a subcompact car which has been produced by the Japanese manufacturer Honda since 1981. Originally made for the Japanese, European and Australasian markets, the City was retired in 1994 after the second generation.");

        // add more toyota cars

       Car toyotaFortuner = new Car();
        toyotaFortuner.setCarName("Toyota");
        toyotaFortuner.setcarModel("Fortuner");
        toyotaFortuner.setCarPrice("₱ 1,633,000");
        toyotaFortuner.setCarImage("/com/example/autoeliteproject/images/cars/toyota-fortuner/fortuner.png");
        toyotaFortuner.setBodytype("SUV");
        toyotaFortuner.setColor("White");
        toyotaFortuner.setCondition("Brand New");
        toyotaFortuner.setDescription("The Toyota Fortuner, also known as the Toyota SW4, is a mid-size SUV manufactured by Japanese automobile manufacturer Toyota. The Fortuner is built on the Hilux pickup truck platform.");
        toyotaFortuner.setYear("2023");
        toyotaFortuner.setTransmission("Automatic");
        carsview.add(toyotaFortuner);

        Car toyotaInnova = new Car();
        toyotaInnova.setCarName("Toyota");
        toyotaInnova.setcarModel("Innova");
        toyotaInnova.setCarPrice("₱ 1,186,000");
        toyotaInnova.setCarImage("/com/example/autoeliteproject/images/cars/toyota-innova/innova.png");
        toyotaInnova.setBodytype("SUV");
        toyotaInnova.setColor("White");
        toyotaInnova.setCondition("Brand New");
        toyotaInnova.setDescription("The Toyota Innova is a compact MPV manufactured by the Japanese automaker Toyota. It is first produced in Indonesia under supervision by Toyota Astra Motor since 2004 and has been manufactured in other countries as well.");
        toyotaInnova.setYear("2023");
        toyotaInnova.setTransmission("Automatic");
        carsview.add(toyotaInnova);

        Car toyotaRush = new Car();
        toyotaRush.setCarName("Toyota");
        toyotaRush.setcarModel("Rush");
        toyotaRush.setCarPrice("₱ 1,100,000");
        toyotaRush.setCarImage("/com/example/autoeliteproject/images/cars/toyota-rush/rush.png");
        toyotaRush.setBodytype("SUV");
        toyotaRush.setColor("Red");
        toyotaRush.setCondition("Brand New");
        toyotaRush.setDescription("The Toyota Rush is a mini SUV that is developed by the Japanese car manufacturer Toyota. It features three rows of seats and is available in rear-wheel drive or four-wheel drive.");
        updateUIWithFilteredCars(carsview);

        // add more Ford cars
        Car fordEcosport = new Car();
        fordEcosport.setCarName("Ford");
        fordEcosport.setcarModel("Ecosport");
        fordEcosport.setCarPrice("₱ 1,190,000");
        fordEcosport.setCarImage("/com/example/autoeliteproject/images/cars/ford-ecosport/ecosport.png");
        fordEcosport.setBodytype("SUV");
        fordEcosport.setColor("Blue");
        fordEcosport.setCondition("Brand New");
        fordEcosport.setDescription("The Ford EcoSport is a subcompact crossover SUV, originally built in Brazil by Ford Brazil since 2003, at the Camaçari plant. A second generation concept model was launched in 2012, and is also assembled in new factories in India, Thailand, Russia and Romania.");
        fordEcosport.setYear("2023");
        fordEcosport.setTransmission("Automatic");
        carsview.add(fordEcosport);

        Car fordTerritory = new Car();
        fordTerritory.setCarName("Ford");
        fordTerritory.setcarModel("Territory");
        fordTerritory.setCarPrice("₱ 1,277,000");
        fordTerritory.setCarImage("/com/example/autoeliteproject/images/cars/ford-territory/territory.png");
        fordTerritory.setBodytype("SUV");
        fordTerritory.setColor("White");
        fordTerritory.setCondition("Brand New");
        fordTerritory.setDescription("The Ford Territory is a crossover SUV built by Ford Australia that was introduced in April 2004 and produced until October 2016. It is based on the EA169 platform introduced by the 2002 BA series Falcon, and its internal project codename was E265.");
        fordTerritory.setYear("2023");
        fordTerritory.setTransmission("Automatic");
        carsview.add(fordTerritory);

        Car fordEscape = new Car();
        fordEscape.setCarName("Ford");
        fordEscape.setcarModel("Escape");
        fordEscape.setCarPrice("₱ 1,490,000");
        fordEscape.setCarImage("/com/example/autoeliteproject/images/cars/ford-escape/escape.png");
        fordEscape.setBodytype("SUV");
        fordEscape.setColor("White");
        fordEscape.setCondition("Brand New");
        fordEscape.setDescription("The Ford Escape is a compact crossover vehicle sold by Ford since 2000 over four generations. Ford released the original model in 2000 for the 2001 model year. Mainstream production of the first generation Escape/Tribute ended in late 2006.");
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
