package com.sda.zdjavapol68.example.zad15pominiete;

public enum EnumCar {

    FERRARI     (1200,  100,    true),
    PORSCHE     (2000,  150,    true),
    MERCEDES    (500,   80,     true),
    BMW         (400,   50,     true),
    OPEL        (200,   20,     false),
    FIAT        (100,   10,     false),
    TOYOTA      (120,   80,     false);

    private int price;
    private int power;
    private boolean premium;

    EnumCar(int price, int power, boolean premium) {
        this.price = price;
        this.power = power;
        this.premium = premium;
    }

    private boolean isPremium() {
        return premium;
    }

    private boolean isRegular() {
        return !isPremium();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

}
