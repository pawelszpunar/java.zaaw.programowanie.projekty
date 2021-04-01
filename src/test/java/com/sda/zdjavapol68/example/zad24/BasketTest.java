package com.sda.zdjavapol68.example.zad24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    private Basket basket;

    @BeforeEach
    void setUo() {
        basket = new Basket();
    }

    @Test
    void happyPath() {
        basket.addToBasket();
        basket.removeFromBasket();
    }

    @Test
    void thatWeCantRemoveFromEmptyBasket() {
        Assertions.assertThrows(BasketEmptyException.class, () -> basket.removeFromBasket());
        basket.removeFromBasket();

    }

    @Test
    void thatWeCanAddMoreThanTenElements() {
        basket.removeFromBasket();

    }



}