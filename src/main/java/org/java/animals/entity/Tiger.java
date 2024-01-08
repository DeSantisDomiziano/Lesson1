package org.java.animals.entity;

import org.java.animals.abst.Tail;

import java.time.LocalDate;
import java.util.Date;

public class Tiger extends Tail
{

    public Tiger(String name, String favouriteFood, int age, LocalDate dateAddedToTheZoo, float weight, float height, float tail) {
        super(name, favouriteFood, age, dateAddedToTheZoo, weight, height, tail);
    }
}
