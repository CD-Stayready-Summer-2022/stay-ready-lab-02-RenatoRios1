package com.codedifferently.labs.lab23.partb.bakery.items.models;

import com.codedifferently.labs.lab23.partb.bakery.items.interfaces.Item;

public class Cookie implements Item {
    public String cookieType;
    private double price;
    public Cookie(String type, double price){
        cookieType = type;
        this.price = price;
    }

    public String getItemName() {
        return "Cookie";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getDepartment() {
        return "Bakery";
    }

}
