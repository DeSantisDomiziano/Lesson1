package org.java.animals.entity;

import org.java.animals.abst.Tail;

import java.time.LocalDate;

public class Lion extends Tail
{
    public Lion(String name, String favouriteFood, int age, LocalDate dateAddedToTheZoo, float weight, float height, float tailLenght) {
        super(name, favouriteFood, age, dateAddedToTheZoo, weight, height, tailLenght);
        setTailLenght(tailLenght);
    }
}
