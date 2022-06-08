package com.codedifferently.labs.lab23.partb.bakery.items.interfaces;

public interface Item {
    String getItemName();
    double getPrice();
    void setPrice(double price);
    String getDepartment();
}
