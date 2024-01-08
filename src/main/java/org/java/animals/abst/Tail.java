package org.java.animals.abst;

import java.time.LocalDate;

public abstract class Tail extends Animal{

    private float tailLenght;

    public Tail(String name, String favouriteFood, int age, LocalDate dateAddedToTheZoo, float weight, float height, float tailLenght) {
        super(name, favouriteFood, age, dateAddedToTheZoo, weight, height);
        setTailLenght(tailLenght);
    }

    public float getTailLenght() {
        return tailLenght;
    }

    public void setTailLenght(float tailLenght) {
        this.tailLenght = tailLenght;
    }

    @Override
    public String toString() {
        return super.toString() + "cm, tailLenght= " + getTailLenght() + "cm}";
    }
}
