package org.java.animals.entity;

import org.java.animals.abst.Animal;

import java.time.LocalDate;

public class Eagle extends Animal
{
    private float wingspan;
    public Eagle (String name, String favFood, int age, LocalDate startZoo, float weight, int height, float wingspan) {
        super(name, favFood, age, startZoo, weight, height);
        setWingspan(wingspan);
    }

    public float getWingspan() {
        return wingspan;
    }

    public void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return "Eagle" + super.toString() + "cm, wingspan=" + getWingspan() + "cm}";
    }
}
