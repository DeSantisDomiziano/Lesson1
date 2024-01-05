package org.java.animals.entity;

import org.java.animals.abst.Animal;

import java.time.LocalDate;

public class Eagle extends Animal
{
    private int wingspan;
    public Eagle (String name, String favFood, int age, LocalDate startZoo, float weight, int height, int wingspan) {
        super(name, favFood, age, startZoo, weight, height);
        setWingspan(wingspan);
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return "Eagle" + super.toString() + "cm, wingspan=" + getWingspan() + "cm}";
    }
}
