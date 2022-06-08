package com.codedifferently.sandbox;

public class Bank {
    private Double money;

    public Bank(Double money){
        this.money = money;
    }

    public Double getMoney(){
        return this.money;
    }

    public void setMoney(Double money){
        this.money = money;
    }
}
