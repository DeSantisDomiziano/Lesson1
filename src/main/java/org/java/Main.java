package org.java;

import org.java.animals.abst.Tail;
import org.java.animals.abst.Wingspan;
import org.java.animals.entity.Eagle;
import org.java.animals.entity.Lion;
import org.java.animals.entity.Tiger;
import org.java.animals.entity.Zoo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Zoo zoo = new Zoo();


        zoo.addAnimal(new Tiger("Sid", "eagle", 3, LocalDate.now(), 100.75f,130, 30));
        zoo.addAnimal(new Tiger("Gino", "pony", 5, LocalDate.now(), 150.3f,140, 55));
        zoo.addAnimal(new Tiger("George", "cat", 3, LocalDate.now(), 154.5f,144, 39));

        zoo.addAnimal(new Lion("Alex", "zebra", 6, LocalDate.now(), 80.8f, 110,40));
        zoo.addAnimal(new Lion("Manny", "dog", 2, LocalDate.now(), 63.8f, 94,32));
        zoo.addAnimal(new Lion("Annarella", "human", 4, LocalDate.now(), 87.8f, 122,46));

        zoo.addAnimal(new Eagle("Spirit", "worm", 4, LocalDate.now(), 22.35f, 60, 62));
        zoo.addAnimal(new Eagle("Bomber", "balls", 2, LocalDate.now(), 20.3f, 54, 55));
        zoo.addAnimal(new Eagle("Fulvio", "other", 5, LocalDate.now(), 23.35f, 62, 59));


        zoo.getAnimals().stream().forEach(System.out::println);
        System.out.println("\n############################################\n");

        zoo.getHeaviestAndLightest(Lion.class);
        zoo.getTallestAndShortest(Eagle.class);
        System.out.println("\n############################################\n");

        zoo.getLongestTailOrWingspan(Wingspan.class);

    }
}