package org.java;

import org.java.animals.abst.Animal;
import org.java.animals.entity.Eagle;
import org.java.animals.entity.Lion;
import org.java.animals.entity.Tiger;
import org.java.animals.utility.UtilityMethod;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tiger t = new Tiger("Sid", "eagle", 3, LocalDate.now(), 100.75f,130, 30);
        Tiger t1 = new Tiger("Gino", "pony", 5, LocalDate.now(), 150.3f,140, 55);
        Tiger t2 = new Tiger("George", "cat", 3, LocalDate.now(), 154.5f,144, 39);

        Lion l = new Lion("Alex", "zebra", 6, LocalDate.now(), 80.8f, 110,40);
        Lion l1 = new Lion("Manny", "dog", 2, LocalDate.now(), 63.8f, 94,32);
        Lion l2 = new Lion("Annarella", "human", 4, LocalDate.now(), 87.8f, 122,46);

        Eagle e = new Eagle("Spirit", "worm", 4, LocalDate.now(), 22.35f, 60, 62);
        Eagle e1 = new Eagle("Bomber", "balls", 2, LocalDate.now(), 20.3f, 54, 55);
        Eagle e2 = new Eagle("Fulvio", "other", 5, LocalDate.now(), 23.35f, 62, 59);


        ArrayList<Tiger> listTiger = new ArrayList<>();

        listTiger.add(t);
        listTiger.add(t1);
        listTiger.add(t2);

        for (Tiger tiger : listTiger){
            System.out.println(tiger);
        }

        System.out.println("\n################################\n");

        UtilityMethod.getHeaviestAndLightest(listTiger);

        System.out.println("\n################################\n");

        ArrayList<Lion> listLion = new ArrayList<>();

        listLion.add(l);
        listLion.add(l1);
        listLion.add(l2);

        UtilityMethod.getHeaviestAndLightest(listLion);

        System.out.println("\n################################\n");

        UtilityMethod.getHighestAndShortest(listTiger);
        System.out.println("\n################################\n" );

        System.out.println(UtilityMethod.getLongestTail());
        System.out.println(UtilityMethod.getLongestWingspan());

        /*
         * TODO change favFood and starZoo
         * TODO make zoo class for arraylist
         * TODO convert foreach into stream
         * TODO refactor name utilitymethod
         * TODO rendi dinamico il metodo gettailslength
         */

    }
}