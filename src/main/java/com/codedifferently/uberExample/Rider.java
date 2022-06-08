package com.codedifferently.uberExample;

public class Rider implements Trip{
    private String name;
    private String pickUpLocation;
    private String destination;

    public Rider(String name, String pickUpLocation, String destination){
        this.name = name;
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
