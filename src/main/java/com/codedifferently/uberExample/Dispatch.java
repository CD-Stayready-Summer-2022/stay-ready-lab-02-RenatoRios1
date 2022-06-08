package com.codedifferently.uberExample;

public class Dispatch {
    public static void main(String[] args) {
        Rider rider = new Rider("Jaylo", "Manhattan", "Madison Square");
        Delivery delivery = new Delivery("123 Sesame Street", "Burger King");

        Driver driver = new Driver();

        driver.runTrip(rider);
    }
}
