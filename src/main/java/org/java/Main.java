package org.java;

import org.java.animals.abst.Animal;

import org.java.animals.entity.Eagle;
import org.java.animals.entity.Lion;
import org.java.animals.entity.Tiger;
import org.java.animals.entity.Zoo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Zoo zoo = Zoo.getInstance();


        Tiger t1 = new Tiger("Sid", "eagle", 3, LocalDate.now(), 100.75f,130, 30);
        Tiger t2 = new Tiger("Gino", "pony", 5, LocalDate.now(), 150.3f,140, 55);
        Tiger t3 = new Tiger("George", "cat", 3, LocalDate.now(), 154.5f,144, 39);

        Lion l1 = new Lion("Alex", "zebra", 6, LocalDate.now(), 80.8f, 110,40);
        Lion l2 = new Lion("Manny", "dog", 2, LocalDate.now(), 63.8f, 94,32);
        Lion l3 = new Lion("Annarella", "human", 4, LocalDate.now(), 87.8f, 122,46);

        Eagle e1 = new Eagle("Spirit", "worm", 4, LocalDate.now(), 22.35f, 60, 62);
        Eagle e2 = new Eagle("Bomber", "balls", 2, LocalDate.now(), 20.3f, 54, 55);
        Eagle e3 = new Eagle("Fulvio", "other", 5, LocalDate.now(), 23.35f, 62, 59);

        zoo.addAnimalByClass(Tiger.class, t1);
        zoo.addAnimalByClass(Tiger.class, t2);
        zoo.addAnimalByClass(Tiger.class, t3);

        zoo.addAnimalByClass(Lion.class, l1);
        zoo.addAnimalByClass(Lion.class, l2);
        zoo.addAnimalByClass(Lion.class, l3);

        zoo.addAnimalByClass(Lion.class, e1);
        zoo.addAnimalByClass(Eagle.class, e2);
        zoo.addAnimalByClass(Eagle.class, e3);

        zoo.getAnimalByClass(l1.getClass()).forEach(System.out::println);
        zoo.getHeaviestAndLightestByClass(l1.getClass());
        zoo.getTallestAndShortest(l1.getClass());
        zoo.getLongestTailByClass(l1.getClass());
        zoo.getLongestWingsSpan(e1.getClass());
    }
}