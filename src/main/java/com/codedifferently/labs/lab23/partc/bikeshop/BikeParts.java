package com.codedifferently.labs.lab23.partc.bikeshop;

public interface BikeParts {
    final String MAKE = "The Baron's Bikes";
    String getHandleBars();
    void setHandleBars(String newValue);
    String getTyres();
    void setTyres(String newValue);
    String getSeatType();
    void setSeatType(String newValue);
}
