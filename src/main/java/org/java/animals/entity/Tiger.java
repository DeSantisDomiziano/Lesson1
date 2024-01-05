package org.java.animals.entity;

import org.java.animals.abst.Animal;

import java.time.LocalDate;
import java.util.Date;

public class Tiger extends Animal
{
    private int tailLenght;

    public Tiger(String name, String favFood, int age, LocalDate startZoo, float weight, int height, int tailLenght)
    {
        super(name, favFood, age, startZoo, weight, height);
        setTailLenght(tailLenght);
    }

    public int getTailLenght() {
        return tailLenght;
    }

    public void setTailLenght(int tailLenght) {
        this.tailLenght = tailLenght;
    }

    @Override
    public String toString() {
        return "Tiger" + super.toString() + "cm, tail-lenght=" + getTailLenght() + "cm}";
    }
}
