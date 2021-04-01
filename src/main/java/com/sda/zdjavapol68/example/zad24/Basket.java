package com.sda.zdjavapol68.example.zad24;

public class Basket {
    private int items;



    public void addToBasket() {
        if(items >= 10) throw new BasketFullException();

        items++;

    }

    public void removeFromBasket() {
        if(items <= 0) throw new BasketEmptyException();
        else items--;
    }

}
