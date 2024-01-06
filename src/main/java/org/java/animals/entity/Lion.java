package org.java.animals.entity;

import org.java.animals.abst.Animal;

import java.time.LocalDate;

public class Lion extends Animal
{
    private float tailLenght;
    public Lion(String name, String favFood, int age, LocalDate startZoo, float weight, int height,float tailLenght) {
        super(name, favFood, age, startZoo, weight, height);
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
        return "Lion" + super.toString() + "cm, tail-lenght=" + getTailLenght() + "cm}";
    }
}
