package com.sda.zdjavapol68.example.zad12;

import java.util.Objects;

public class Manufacturer {
    private String name;
    private int openYear;
    private String country;

    public Manufacturer(String name, int openYear, String country) {
        this.name = name;
        this.openYear = openYear;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOpenYear() {
        return openYear;
    }

    public void setOpenYear(int openYear) {
        this.openYear = openYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return openYear == that.openYear && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, openYear, country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", openYear=" + openYear +
                ", country='" + country + '\'' +
                '}';
    }
}
