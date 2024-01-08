package org.java.animals.abst;

import java.time.LocalDate;

public abstract class Wingspan extends Animal{

    private float wingsSpan;

    public Wingspan(String name, String favouriteFood, int age, LocalDate dateAddedToTheZoo, float weight, float height, float wingsSpan) {
        super(name, favouriteFood, age, dateAddedToTheZoo, weight, height);
        setWingsSpan(wingsSpan);
    }

    public float getWingsSpan() {
        return wingsSpan;
    }

    public void setWingsSpan(float wingsSpan) {
        this.wingsSpan = wingsSpan;
    }

    @Override
    public String toString() {
        return super.toString() + "cm, tailLenght= " + getWingsSpan() + "cm}";
    }
}
