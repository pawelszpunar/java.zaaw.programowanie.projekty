package com.sda.zdjavapol68.example.zad19;

import java.util.Objects;

public class Laptop extends Computer {
    public int battery;

    public Laptop(String processor, String ramMemory, String graphicCard, String company, String model, int battery) {
        super(processor, ramMemory, graphicCard, company, model);
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery=" + battery +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return battery == laptop.battery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }
}
