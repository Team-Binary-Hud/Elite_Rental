package com.example.eliterental;

public class RentalCars {
    private Integer CarRentalID;
    private String CarName;
    private int CarYear;
    private double RentalPrice;
    private String Manufac;
    private String Location;
    private String CarColour;
    private String ImgLocatiuon;
    private String CarType;

    public RentalCars(Integer carRentalID, String carName, int carYear, double rentalPrice, String manufac, String location, String carColour, String imgLocatiuon, String carType) {
        CarRentalID = carRentalID;
        CarName = carName;
        CarYear = carYear;
        RentalPrice = rentalPrice;
        Manufac = manufac;
        Location = location;
        CarColour = carColour;
        ImgLocatiuon = imgLocatiuon;
        CarType = carType;
    }

    public Integer getCarRentalID() {
        return CarRentalID;
    }

    public void setCarRentalID(Integer carRentalID) {
        CarRentalID = carRentalID;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public int getCarYear() {
        return CarYear;
    }

    public void setCarYear(int carYear) {
        CarYear = carYear;
    }

    public double getRentalPrice() {
        return RentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        RentalPrice = rentalPrice;
    }

    public String getManufac() {
        return Manufac;
    }

    public void setManufac(String manufac) {
        Manufac = manufac;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getCarColour() {
        return CarColour;
    }

    public void setCarColour(String carColour) {
        CarColour = carColour;
    }

    public String getImgLocatiuon() {
        return ImgLocatiuon;
    }

    public void setImgLocatiuon(String imgLocatiuon) {
        ImgLocatiuon = imgLocatiuon;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType(String carType) {
        CarType = carType;
    }
}
