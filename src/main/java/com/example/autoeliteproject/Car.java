package com.example.autoeliteproject;

import javafx.scene.image.Image;

public class Car {
    private String carName;
    private String carModel;
    private String carPrice;
    private String carImage;

    private String bodytype;
    private String color;
    private String condition;
    private String description;
    private String year;

    private String transmission;

    private boolean sold;


    // getters
    public String getCarName() {
        return carName;
    }

    public boolean isSold() {
        return sold;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodytype() {
        return bodytype;
    }

    public String getColor() {
        return color;
    }

    public String getCondition() {
        return condition;
    }

    public String getDescription() {
        return description;
    }

    public String getYear() {
        return year;
    }

    public String getcarModel() {
        return carModel;
    }

    public String getCarPrice() {
        return carPrice;
    }

    public String getCarImage() {
        return carImage;
    }


    // setters
    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
    public void setcarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public void setCarImage(String carImage) {
        this.carImage = carImage;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}