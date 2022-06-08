package com.codedifferently.uberExample;

public class Delivery implements Trip{
    private String pickUpLocation;
    private String destination;

    public Delivery(String pickUpLocation, String destination) {
        this.pickUpLocation = pickUpLocation;
        this.destination = destination;
    }

    public String getPickupLocation(){
        return null;
    }

    public String getDestination(){
        return null;
    }
}
